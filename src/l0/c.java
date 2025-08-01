package l0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final  class c implements ValueAnimator.AnimatorUpdateListener {

    
    public final  SideSheetBehavior f5804a;

    
    public final  ViewGroup.MarginLayoutParams f5805b;

    
    public final  int f5806c;

    
    public final  View f5807d;

    public  c(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i2, View view) {
        this.f5804a = sideSheetBehavior;
        this.f5805b = marginLayoutParams;
        this.f5806c = i2;
        this.f5807d = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5804a.y0(this.f5805b, this.f5806c, this.f5807d, valueAnimator);
    }
}
