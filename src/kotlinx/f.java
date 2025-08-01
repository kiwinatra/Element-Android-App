package f0;

import K.b;
import T.c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public class f extends a {

    
    private final float f5386g;

    
    private final float f5387h;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            f.this.f5374b.setTranslationY(0.0f);
            f.this.k(0.0f);
        }
    }

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f5386g = resources.getDimension(c.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f5387h = resources.getDimension(c.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f5374b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.f5374b, View.SCALE_Y, new float[]{1.0f})});
        View view = this.f5374b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(viewGroup.getChildAt(i2), View.SCALE_Y, new float[]{1.0f})});
            }
        }
        animatorSet.setInterpolator(new b());
        return animatorSet;
    }

    public void f() {
        if (super.b() != null) {
            Animator g2 = g();
            g2.setDuration((long) this.f5377e);
            g2.start();
        }
    }

    public void h(androidx.activity.b bVar, Animator.AnimatorListener animatorListener) {
        float height = ((float) this.f5374b.getHeight()) * this.f5374b.getScaleY();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5374b, View.TRANSLATION_Y, new float[]{height});
        ofFloat.setInterpolator(new b());
        ofFloat.setDuration((long) U.a.c(this.f5375c, this.f5376d, bVar.a()));
        ofFloat.addListener(new a());
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void i(androidx.activity.b bVar, Animator.AnimatorListener animatorListener) {
        Animator g2 = g();
        g2.setDuration((long) U.a.c(this.f5375c, this.f5376d, bVar.a()));
        if (animatorListener != null) {
            g2.addListener(animatorListener);
        }
        g2.start();
    }

    public void j(androidx.activity.b bVar) {
        super.d(bVar);
    }

    public void k(float f2) {
        float f3;
        float a2 = a(f2);
        float width = (float) this.f5374b.getWidth();
        float height = (float) this.f5374b.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float a3 = 1.0f - U.a.a(0.0f, this.f5386g / width, a2);
            float a4 = 1.0f - U.a.a(0.0f, this.f5387h / height, a2);
            this.f5374b.setScaleX(a3);
            this.f5374b.setPivotY(height);
            this.f5374b.setScaleY(a4);
            View view = this.f5374b;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotY((float) (-childAt.getTop()));
                    if (a4 != 0.0f) {
                        f3 = a3 / a4;
                    } else {
                        f3 = 1.0f;
                    }
                    childAt.setScaleY(f3);
                }
            }
        }
    }

    public void l(androidx.activity.b bVar) {
        if (super.e(bVar) != null) {
            k(bVar.a());
        }
    }
}
