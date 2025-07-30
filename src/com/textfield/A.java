package com.google.android.material.textfield;

import T.e;
import T.g;
import T.j;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.F;
import androidx.appcompat.widget.e0;
import androidx.core.view.C0162v;
import androidx.core.view.W;
import com.google.android.material.internal.B;
import com.google.android.material.internal.CheckableImageButton;
import h0.c;
import y.I;

class A extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final TextInputLayout f4985a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f4986b;

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f4987c;

    /* renamed from: d  reason: collision with root package name */
    private final CheckableImageButton f4988d;

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f4989e;

    /* renamed from: f  reason: collision with root package name */
    private PorterDuff.Mode f4990f;

    /* renamed from: g  reason: collision with root package name */
    private int f4991g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView.ScaleType f4992h;

    /* renamed from: i  reason: collision with root package name */
    private View.OnLongClickListener f4993i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4994j;

    A(TextInputLayout textInputLayout, e0 e0Var) {
        super(textInputLayout.getContext());
        this.f4985a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(g.design_text_input_start_icon, this, false);
        this.f4988d = checkableImageButton;
        u.e(checkableImageButton);
        F f2 = new F(getContext());
        this.f4986b = f2;
        j(e0Var);
        i(e0Var);
        addView(checkableImageButton);
        addView(f2);
    }

    private void C() {
        int i2 = 8;
        int i3 = (this.f4987c == null || this.f4994j) ? 8 : 0;
        if (this.f4988d.getVisibility() == 0 || i3 == 0) {
            i2 = 0;
        }
        setVisibility(i2);
        this.f4986b.setVisibility(i3);
        this.f4985a.o0();
    }

    private void i(e0 e0Var) {
        this.f4986b.setVisibility(8);
        this.f4986b.setId(e.textinput_prefix_text);
        this.f4986b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        W.s0(this.f4986b, 1);
        o(e0Var.n(j.e7, 0));
        int i2 = j.f7;
        if (e0Var.s(i2)) {
            p(e0Var.c(i2));
        }
        n(e0Var.p(j.d7));
    }

    private void j(e0 e0Var) {
        if (c.g(getContext())) {
            C0162v.c((ViewGroup.MarginLayoutParams) this.f4988d.getLayoutParams(), 0);
        }
        u((View.OnClickListener) null);
        v((View.OnLongClickListener) null);
        int i2 = j.l7;
        if (e0Var.s(i2)) {
            this.f4989e = c.b(getContext(), e0Var, i2);
        }
        int i3 = j.m7;
        if (e0Var.s(i3)) {
            this.f4990f = B.i(e0Var.k(i3, -1), (PorterDuff.Mode) null);
        }
        int i4 = j.i7;
        if (e0Var.s(i4)) {
            s(e0Var.g(i4));
            int i5 = j.h7;
            if (e0Var.s(i5)) {
                r(e0Var.p(i5));
            }
            q(e0Var.a(j.g7, true));
        }
        t(e0Var.f(j.j7, getResources().getDimensionPixelSize(T.c.mtrl_min_touch_target_size)));
        int i6 = j.k7;
        if (e0Var.s(i6)) {
            w(u.b(e0Var.k(i6, -1)));
        }
    }

    /* access modifiers changed from: package-private */
    public void A(I i2) {
        View view;
        if (this.f4986b.getVisibility() == 0) {
            i2.x0(this.f4986b);
            view = this.f4986b;
        } else {
            view = this.f4988d;
        }
        i2.L0(view);
    }

    /* access modifiers changed from: package-private */
    public void B() {
        EditText editText = this.f4985a.f5030d;
        if (editText != null) {
            W.D0(this.f4986b, k() ? 0 : W.H(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(T.c.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
        }
    }

    /* access modifiers changed from: package-private */
    public CharSequence a() {
        return this.f4987c;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f4986b.getTextColors();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return W.H(this) + W.H(this.f4986b) + (k() ? this.f4988d.getMeasuredWidth() + C0162v.a((ViewGroup.MarginLayoutParams) this.f4988d.getLayoutParams()) : 0);
    }

    /* access modifiers changed from: package-private */
    public TextView d() {
        return this.f4986b;
    }

    /* access modifiers changed from: package-private */
    public CharSequence e() {
        return this.f4988d.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public Drawable f() {
        return this.f4988d.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f4991g;
    }

    /* access modifiers changed from: package-private */
    public ImageView.ScaleType h() {
        return this.f4992h;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f4988d.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public void l(boolean z2) {
        this.f4994j = z2;
        C();
    }

    /* access modifiers changed from: package-private */
    public void m() {
        u.d(this.f4985a, this.f4988d, this.f4989e);
    }

    /* access modifiers changed from: package-private */
    public void n(CharSequence charSequence) {
        this.f4987c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f4986b.setText(charSequence);
        C();
    }

    /* access modifiers changed from: package-private */
    public void o(int i2) {
        androidx.core.widget.j.o(this.f4986b, i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        B();
    }

    /* access modifiers changed from: package-private */
    public void p(ColorStateList colorStateList) {
        this.f4986b.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z2) {
        this.f4988d.setCheckable(z2);
    }

    /* access modifiers changed from: package-private */
    public void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f4988d.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void s(Drawable drawable) {
        this.f4988d.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f4985a, this.f4988d, this.f4989e, this.f4990f);
            z(true);
            m();
            return;
        }
        z(false);
        u((View.OnClickListener) null);
        v((View.OnLongClickListener) null);
        r((CharSequence) null);
    }

    /* access modifiers changed from: package-private */
    public void t(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i2 != this.f4991g) {
            this.f4991g = i2;
            u.g(this.f4988d, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(View.OnClickListener onClickListener) {
        u.h(this.f4988d, onClickListener, this.f4993i);
    }

    /* access modifiers changed from: package-private */
    public void v(View.OnLongClickListener onLongClickListener) {
        this.f4993i = onLongClickListener;
        u.i(this.f4988d, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void w(ImageView.ScaleType scaleType) {
        this.f4992h = scaleType;
        u.j(this.f4988d, scaleType);
    }

    /* access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList) {
        if (this.f4989e != colorStateList) {
            this.f4989e = colorStateList;
            u.a(this.f4985a, this.f4988d, colorStateList, this.f4990f);
        }
    }

    /* access modifiers changed from: package-private */
    public void y(PorterDuff.Mode mode) {
        if (this.f4990f != mode) {
            this.f4990f = mode;
            u.a(this.f4985a, this.f4988d, this.f4989e, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z2) {
        if (k() != z2) {
            this.f4988d.setVisibility(z2 ? 0 : 8);
            B();
            C();
        }
    }
}
