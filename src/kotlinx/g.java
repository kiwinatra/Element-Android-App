package f0;

import T.c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.b;
import androidx.core.view.C0156s;
import androidx.core.view.W;

public class g extends a {

    
    private final float f5389g;

    
    private final float f5390h;

    
    private final float f5391i;

    class a extends AnimatorListenerAdapter {

        
        final  boolean f5392a;

        
        final  int f5393b;

        a(boolean z2, int i2) {
            this.f5392a = z2;
            this.f5393b = i2;
        }

        public void onAnimationEnd(Animator animator) {
            g.this.f5374b.setTranslationX(0.0f);
            g.this.k(0.0f, this.f5392a, this.f5393b);
        }
    }

    public g(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f5389g = resources.getDimension(c.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f5390h = resources.getDimension(c.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f5391i = resources.getDimension(c.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean g(int i2, int i3) {
        if ((C0156s.b(i2, W.C(this.f5374b)) & i3) == i3) {
            return true;
        }
        return false;
    }

    private int i(boolean z2) {
        ViewGroup.LayoutParams layoutParams = this.f5374b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z2) {
            return marginLayoutParams.leftMargin;
        }
        return marginLayoutParams.rightMargin;
    }

    public void f() {
        if (super.b() != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f5374b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.f5374b, View.SCALE_Y, new float[]{1.0f})});
            View view = this.f5374b;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(viewGroup.getChildAt(i2), View.SCALE_Y, new float[]{1.0f})});
                }
            }
            animatorSet.setDuration((long) this.f5377e);
            animatorSet.start();
        }
    }

    public void h(b bVar, int i2, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z2;
        if (bVar.b() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean g2 = g(i2, 3);
        float width = (((float) this.f5374b.getWidth()) * this.f5374b.getScaleX()) + ((float) i(g2));
        View view = this.f5374b;
        Property property = View.TRANSLATION_X;
        if (g2) {
            width = -width;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, new float[]{width});
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new K.b());
        ofFloat.setDuration((long) U.a.c(this.f5375c, this.f5376d, bVar.a()));
        ofFloat.addListener(new a(z2, i2));
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void j(b bVar) {
        super.d(bVar);
    }

    public void k(float f2, boolean z2, int i2) {
        boolean z3;
        int i3;
        float f3;
        float f4;
        float a2 = a(f2);
        boolean g2 = g(i2, 3);
        if (z2 == g2) {
            z3 = true;
        } else {
            z3 = false;
        }
        int width = this.f5374b.getWidth();
        int height = this.f5374b.getHeight();
        float f5 = (float) width;
        if (f5 > 0.0f) {
            float f6 = (float) height;
            if (f6 > 0.0f) {
                float f7 = this.f5389g / f5;
                float f8 = this.f5390h / f5;
                float f9 = this.f5391i / f6;
                View view = this.f5374b;
                if (g2) {
                    f5 = 0.0f;
                }
                view.setPivotX(f5);
                if (!z3) {
                    f8 = -f7;
                }
                float a3 = U.a.a(0.0f, f8, a2);
                float f10 = a3 + 1.0f;
                this.f5374b.setScaleX(f10);
                float a4 = 1.0f - U.a.a(0.0f, f9, a2);
                this.f5374b.setScaleY(a4);
                View view2 = this.f5374b;
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                        View childAt = viewGroup.getChildAt(i4);
                        if (g2) {
                            i3 = (width - childAt.getRight()) + childAt.getWidth();
                        } else {
                            i3 = -childAt.getLeft();
                        }
                        childAt.setPivotX((float) i3);
                        childAt.setPivotY((float) (-childAt.getTop()));
                        if (z3) {
                            f3 = 1.0f - a3;
                        } else {
                            f3 = 1.0f;
                        }
                        if (a4 != 0.0f) {
                            f4 = (f10 / a4) * f3;
                        } else {
                            f4 = 1.0f;
                        }
                        childAt.setScaleX(f3);
                        childAt.setScaleY(f4);
                    }
                }
            }
        }
    }

    public void l(b bVar, int i2) {
        boolean z2;
        if (super.e(bVar) != null) {
            if (bVar.b() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            k(bVar.a(), z2, i2);
        }
    }
}
