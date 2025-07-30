package b0;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: b0.a  reason: case insensitive filesystem */
public class C0210a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final Dialog f4135a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4136b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4137c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4138d;

    public C0210a(Dialog dialog, Rect rect) {
        this.f4135a = dialog;
        this.f4136b = rect.left;
        this.f4137c = rect.top;
        this.f4138d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f4136b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f4137c + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i2 = this.f4138d;
            obtain.setLocation((float) ((-i2) - 1), (float) ((-i2) - 1));
        }
        view.performClick();
        return this.f4135a.onTouchEvent(obtain);
    }
}
