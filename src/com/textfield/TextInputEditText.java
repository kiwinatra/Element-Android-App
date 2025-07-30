package com.google.android.material.textfield;

import T.a;
import T.i;
import T.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C0107l;
import com.google.android.material.internal.C0219f;
import com.google.android.material.internal.y;

public class TextInputEditText extends C0107l {

    /* renamed from: g  reason: collision with root package name */
    private final Rect f4996g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4997h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f173l);
    }

    private String e(TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean z2 = !TextUtils.isEmpty(text);
        String str = "";
        String charSequence = TextUtils.isEmpty(hint) ^ true ? hint.toString() : str;
        if (!z2) {
            return !TextUtils.isEmpty(charSequence) ? charSequence : str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        if (!TextUtils.isEmpty(charSequence)) {
            str = ", " + charSequence;
        }
        sb.append(str);
        return sb.toString();
    }

    private boolean f(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f4997h;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (f(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.f4996g);
            rect.bottom = this.f4996g.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!f(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.R()) ? super.getHint() : textInputLayout.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.R() && super.getHint() == null && C0219f.b()) {
            setHint("");
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            accessibilityNodeInfo.setText(e(textInputLayout));
        }
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!f(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f4996g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f4996g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z2) {
        this.f4997h = z2;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i2) {
        super(n0.a.c(context, attributeSet, i2, 0), attributeSet, i2);
        this.f4996g = new Rect();
        TypedArray i3 = y.i(context, attributeSet, j.T5, i2, i.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(i3.getBoolean(j.U5, false));
        i3.recycle();
    }
}
