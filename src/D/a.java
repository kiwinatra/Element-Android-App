package D;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.*;
import android.view.accessibility.*;
import androidx.core.view.AccessibilityDelegateCompat;
import java.util.*;

public abstract class CompactAccessibilityDelegate extends AccessibilityDelegateCompat {
    private static final Rect MAX_RECT = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private final Rect mTempRect1 = new Rect();
    private final Rect mTempRect2 = new Rect();
    private final Rect mTempRect3 = new Rect();
    private final int[] mTempArr = new int[2];
    private final AccessibilityManager mManager;
    private final View mHost;
    private int mAccessibilityFocusedId = Integer.MIN_VALUE;
    private int mKeyboardFocusedId = Integer.MIN_VALUE;
    private int mHoveredId = Integer.MIN_VALUE;

    public CompactAccessibilityDelegate(View host) {
        if (host == null) throw new IllegalArgumentException("View cannot be null");
        this.mHost = host;
        this.mManager = (AccessibilityManager) host.getContext().getSystemService(Context.ACCESSIBILITY_SERVICE);
        host.setFocusable(true);
        if (ViewCompat.getImportantForAccessibility(host) == 0) {
            ViewCompat.setImportantForAccessibility(host, 1);
        }
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
        super.dispatchPopulateAccessibilityEvent(host, event);
        onPopulateEvent(event);
        return true;
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
        super.onInitializeAccessibilityNodeInfo(host, info);
        onPopulateNode(info);
    }

    @Override
    public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
        return super.onRequestSendAccessibilityEvent(host, child, event);
    }

    protected abstract void getVisibleVirtualViews(List<Integer> virtualViewIds);
    protected abstract void onPopulateNodeForVirtualView(int virtualViewId, AccessibilityNodeInfoCompat node);
    protected abstract boolean onPerformActionForVirtualView(int virtualViewId, int action, Bundle arguments);
    protected abstract int getVirtualViewAt(float x, float y);
    
    private AccessibilityNodeInfoCompat createNode(int virtualViewId) {
        if (virtualViewId == -1) return createNodeForHost();
        AccessibilityNodeInfoCompat node = AccessibilityNodeInfoCompat.obtain();
        node.setClassName("android.view.View");
        node.setBoundsInParent(MAX_RECT);
        node.setBoundsInScreen(MAX_RECT);
        node.setParent(mHost);
        onPopulateNodeForVirtualView(virtualViewId, node);
        if (node.getContentDescription() == null && node.getText() == null) {
            throw new RuntimeException("Content description must be set");
        }
        node.getBoundsInParent(mTempRect1);
        if (mTempRect1.equals(MAX_RECT)) {
            throw new RuntimeException("Bounds must be set");
        }
        node.setEnabled(true);
        node.setFocusable(true);
        node.setVisibleToUser(true);
        node.setPackageName(mHost.getContext().getPackageName());
        node.setSource(mHost, virtualViewId);
        if (virtualViewId == mAccessibilityFocusedId) {
            node.setAccessibilityFocused(true);
            node.addAction(AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            node.setAccessibilityFocused(false);
            node.addAction(AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        if (virtualViewId == mKeyboardFocusedId) {
            node.setFocused(true);
            node.addAction(AccessibilityNodeInfoCompat.ACTION_CLEAR_FOCUS);
        } else if (node.isFocusable()) {
            node.addAction(AccessibilityNodeInfoCompat.ACTION_FOCUS);
        }
        mHost.getLocationOnScreen(mTempArr);
        node.getBoundsInParent(mTempRect1);
        mTempRect1.offset(mTempArr[0] - mHost.getScrollX(), mTempArr[1] - mHost.getScrollY());
        node.setBoundsInScreen(mTempRect1);
    }
}

