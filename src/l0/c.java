package l0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f5804a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f5805b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5806c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f5807d;

    public /* synthetic */ c(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i2, View view) {
        this.f5804a = sideSheetBehavior;
        this.f5805b = marginLayoutParams;
        this.f5806c = i2;
        this.f5807d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5804a.y0(this.f5805b, this.f5806c, this.f5807d, valueAnimator);
    }
}
