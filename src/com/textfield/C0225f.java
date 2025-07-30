package com.google.android.material.textfield;

import T.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import f0.h;

/* renamed from: com.google.android.material.textfield.f  reason: case insensitive filesystem */
class C0225f extends t {

    /* renamed from: e  reason: collision with root package name */
    private final int f5089e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5090f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f5091g;

    /* renamed from: h  reason: collision with root package name */
    private final TimeInterpolator f5092h;

    /* renamed from: i  reason: collision with root package name */
    private EditText f5093i;

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f5094j = new C0220a(this);

    /* renamed from: k  reason: collision with root package name */
    private final View.OnFocusChangeListener f5095k = new C0221b(this);

    /* renamed from: l  reason: collision with root package name */
    private AnimatorSet f5096l;

    /* renamed from: m  reason: collision with root package name */
    private ValueAnimator f5097m;

    /* renamed from: com.google.android.material.textfield.f$a */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationStart(Animator animator) {
            C0225f.this.f5156b.a0(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.f$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            C0225f.this.f5156b.a0(false);
        }
    }

    C0225f(s sVar) {
        super(sVar);
        Context context = sVar.getContext();
        int i2 = T.a.motionDurationShort3;
        this.f5089e = h.f(context, i2, 100);
        this.f5090f = h.f(sVar.getContext(), i2, 150);
        this.f5091g = h.g(sVar.getContext(), T.a.motionEasingLinearInterpolator, U.a.f255a);
        this.f5092h = h.g(sVar.getContext(), T.a.motionEasingEmphasizedInterpolator, U.a.f258d);
    }

    private void A(boolean z2) {
        boolean z3 = this.f5156b.F() == z2;
        if (z2 && !this.f5096l.isRunning()) {
            this.f5097m.cancel();
            this.f5096l.start();
            if (z3) {
                this.f5096l.end();
            }
        } else if (!z2) {
            this.f5096l.cancel();
            this.f5097m.start();
            if (z3) {
                this.f5097m.end();
            }
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f5091g);
        ofFloat.setDuration((long) this.f5089e);
        ofFloat.addUpdateListener(new C0222c(this));
        return ofFloat;
    }

    private ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f5092h);
        ofFloat.setDuration((long) this.f5090f);
        ofFloat.addUpdateListener(new C0224e(this));
        return ofFloat;
    }

    private void D() {
        ValueAnimator C2 = C();
        ValueAnimator B2 = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5096l = animatorSet;
        animatorSet.playTogether(new Animator[]{C2, B2});
        this.f5096l.addListener(new a());
        ValueAnimator B3 = B(1.0f, 0.0f);
        this.f5097m = B3;
        B3.addListener(new b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.f5158d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f5158d.setScaleX(floatValue);
        this.f5158d.setScaleY(floatValue);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        EditText editText = this.f5093i;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            r();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(View view, boolean z2) {
        A(J());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I() {
        A(true);
    }

    private boolean J() {
        EditText editText = this.f5093i;
        return editText != null && (editText.hasFocus() || this.f5158d.hasFocus()) && this.f5093i.getText().length() > 0;
    }

    /* access modifiers changed from: package-private */
    public void a(Editable editable) {
        if (this.f5156b.w() == null) {
            A(J());
        }
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return T.h.clear_text_end_icon_content_description;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return d.mtrl_ic_cancel;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return this.f5095k;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f5094j;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener g() {
        return this.f5095k;
    }

    public void n(EditText editText) {
        this.f5093i = editText;
        this.f5155a.setEndIconVisible(J());
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z2) {
        if (this.f5156b.w() != null) {
            A(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        D();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        EditText editText = this.f5093i;
        if (editText != null) {
            editText.post(new C0223d(this));
        }
    }
}
