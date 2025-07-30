package com.google.android.material.textfield;

import T.c;
import T.e;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.F;
import androidx.core.view.W;
import androidx.core.widget.j;
import f0.h;
import java.util.ArrayList;
import java.util.List;

final class v {

    /* renamed from: A  reason: collision with root package name */
    private ColorStateList f5159A;

    /* renamed from: B  reason: collision with root package name */
    private Typeface f5160B;

    /* renamed from: a  reason: collision with root package name */
    private final int f5161a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5162b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5163c;

    /* renamed from: d  reason: collision with root package name */
    private final TimeInterpolator f5164d;

    /* renamed from: e  reason: collision with root package name */
    private final TimeInterpolator f5165e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeInterpolator f5166f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f5167g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f5168h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f5169i;

    /* renamed from: j  reason: collision with root package name */
    private int f5170j;

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f5171k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public Animator f5172l;

    /* renamed from: m  reason: collision with root package name */
    private final float f5173m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f5174n;

    /* renamed from: o  reason: collision with root package name */
    private int f5175o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f5176p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5177q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public TextView f5178r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f5179s;

    /* renamed from: t  reason: collision with root package name */
    private int f5180t;

    /* renamed from: u  reason: collision with root package name */
    private int f5181u;

    /* renamed from: v  reason: collision with root package name */
    private ColorStateList f5182v;

    /* renamed from: w  reason: collision with root package name */
    private CharSequence f5183w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f5184x;

    /* renamed from: y  reason: collision with root package name */
    private TextView f5185y;

    /* renamed from: z  reason: collision with root package name */
    private int f5186z;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5187a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f5188b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5189c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f5190d;

        a(int i2, TextView textView, int i3, TextView textView2) {
            this.f5187a = i2;
            this.f5188b = textView;
            this.f5189c = i3;
            this.f5190d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = v.this.f5174n = this.f5187a;
            Animator unused2 = v.this.f5172l = null;
            TextView textView = this.f5188b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f5189c == 1 && v.this.f5178r != null) {
                    v.this.f5178r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f5190d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f5190d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f5190d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f5190d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = v.this.f5168h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f5167g = context;
        this.f5168h = textInputLayout;
        this.f5173m = (float) context.getResources().getDimensionPixelSize(c.design_textinput_caption_translate_y);
        int i2 = T.a.motionDurationShort4;
        this.f5161a = h.f(context, i2, 217);
        this.f5162b = h.f(context, T.a.motionDurationMedium4, 167);
        this.f5163c = h.f(context, i2, 167);
        int i3 = T.a.motionEasingEmphasizedDecelerateInterpolator;
        this.f5164d = h.g(context, i3, U.a.f258d);
        TimeInterpolator timeInterpolator = U.a.f255a;
        this.f5165e = h.g(context, i3, timeInterpolator);
        this.f5166f = h.g(context, T.a.motionEasingLinearInterpolator, timeInterpolator);
    }

    private void D(int i2, int i3) {
        TextView m2;
        TextView m3;
        if (i2 != i3) {
            if (!(i3 == 0 || (m3 = m(i3)) == null)) {
                m3.setVisibility(0);
                m3.setAlpha(1.0f);
            }
            if (!(i2 == 0 || (m2 = m(i2)) == null)) {
                m2.setVisibility(4);
                if (i2 == 1) {
                    m2.setText((CharSequence) null);
                }
            }
            this.f5174n = i3;
        }
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        return W.U(this.f5168h) && this.f5168h.isEnabled() && (this.f5175o != this.f5174n || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void S(int i2, int i3, boolean z2) {
        boolean z3 = z2;
        if (i2 != i3) {
            if (z3) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f5172l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i4 = i2;
                int i5 = i3;
                i(arrayList2, this.f5184x, this.f5185y, 2, i4, i5);
                i(arrayList2, this.f5177q, this.f5178r, 1, i4, i5);
                U.b.a(animatorSet, arrayList);
                animatorSet.addListener(new a(i3, m(i2), i2, m(i3)));
                animatorSet.start();
            } else {
                D(i2, i3);
            }
            this.f5168h.p0();
            this.f5168h.u0(z3);
            this.f5168h.A0();
        }
    }

    private boolean g() {
        return (this.f5169i == null || this.f5168h.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z2, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z2) {
            if (i2 == i4 || i2 == i3) {
                ObjectAnimator j2 = j(textView, i4 == i2);
                if (i2 == i4 && i3 != 0) {
                    j2.setStartDelay((long) this.f5163c);
                }
                list.add(j2);
                if (i4 == i2 && i3 != 0) {
                    ObjectAnimator k2 = k(textView);
                    k2.setStartDelay((long) this.f5163c);
                    list.add(k2);
                }
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z2 ? 1.0f : 0.0f});
        ofFloat.setDuration((long) (z2 ? this.f5162b : this.f5163c));
        ofFloat.setInterpolator(z2 ? this.f5165e : this.f5166f);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f5173m, 0.0f});
        ofFloat.setDuration((long) this.f5161a);
        ofFloat.setInterpolator(this.f5164d);
        return ofFloat;
    }

    private TextView m(int i2) {
        if (i2 == 1) {
            return this.f5178r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f5185y;
    }

    private int v(boolean z2, int i2, int i3) {
        return z2 ? this.f5167g.getResources().getDimensionPixelSize(i2) : i3;
    }

    private boolean y(int i2) {
        return i2 == 1 && this.f5178r != null && !TextUtils.isEmpty(this.f5176p);
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f5177q;
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        return this.f5184x;
    }

    /* access modifiers changed from: package-private */
    public void C(TextView textView, int i2) {
        ViewGroup viewGroup;
        if (this.f5169i != null) {
            if (!z(i2) || (viewGroup = this.f5171k) == null) {
                viewGroup = this.f5169i;
            }
            viewGroup.removeView(textView);
            int i3 = this.f5170j - 1;
            this.f5170j = i3;
            O(this.f5169i, i3);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(int i2) {
        this.f5180t = i2;
        TextView textView = this.f5178r;
        if (textView != null) {
            W.s0(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void F(CharSequence charSequence) {
        this.f5179s = charSequence;
        TextView textView = this.f5178r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(boolean z2) {
        if (this.f5177q != z2) {
            h();
            if (z2) {
                F f2 = new F(this.f5167g);
                this.f5178r = f2;
                f2.setId(e.textinput_error);
                this.f5178r.setTextAlignment(5);
                Typeface typeface = this.f5160B;
                if (typeface != null) {
                    this.f5178r.setTypeface(typeface);
                }
                H(this.f5181u);
                I(this.f5182v);
                F(this.f5179s);
                E(this.f5180t);
                this.f5178r.setVisibility(4);
                e(this.f5178r, 0);
            } else {
                w();
                C(this.f5178r, 0);
                this.f5178r = null;
                this.f5168h.p0();
                this.f5168h.A0();
            }
            this.f5177q = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public void H(int i2) {
        this.f5181u = i2;
        TextView textView = this.f5178r;
        if (textView != null) {
            this.f5168h.c0(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(ColorStateList colorStateList) {
        this.f5182v = colorStateList;
        TextView textView = this.f5178r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(int i2) {
        this.f5186z = i2;
        TextView textView = this.f5185y;
        if (textView != null) {
            j.o(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(boolean z2) {
        if (this.f5184x != z2) {
            h();
            if (z2) {
                F f2 = new F(this.f5167g);
                this.f5185y = f2;
                f2.setId(e.textinput_helper_text);
                this.f5185y.setTextAlignment(5);
                Typeface typeface = this.f5160B;
                if (typeface != null) {
                    this.f5185y.setTypeface(typeface);
                }
                this.f5185y.setVisibility(4);
                W.s0(this.f5185y, 1);
                J(this.f5186z);
                L(this.f5159A);
                e(this.f5185y, 1);
                this.f5185y.setAccessibilityDelegate(new b());
            } else {
                x();
                C(this.f5185y, 1);
                this.f5185y = null;
                this.f5168h.p0();
                this.f5168h.A0();
            }
            this.f5184x = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public void L(ColorStateList colorStateList) {
        this.f5159A = colorStateList;
        TextView textView = this.f5185y;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void N(Typeface typeface) {
        if (typeface != this.f5160B) {
            this.f5160B = typeface;
            M(this.f5178r, typeface);
            M(this.f5185y, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(CharSequence charSequence) {
        h();
        this.f5176p = charSequence;
        this.f5178r.setText(charSequence);
        int i2 = this.f5174n;
        if (i2 != 1) {
            this.f5175o = 1;
        }
        S(i2, this.f5175o, P(this.f5178r, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void R(CharSequence charSequence) {
        h();
        this.f5183w = charSequence;
        this.f5185y.setText(charSequence);
        int i2 = this.f5174n;
        if (i2 != 2) {
            this.f5175o = 2;
        }
        S(i2, this.f5175o, P(this.f5185y, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void e(TextView textView, int i2) {
        if (this.f5169i == null && this.f5171k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f5167g);
            this.f5169i = linearLayout;
            linearLayout.setOrientation(0);
            this.f5168h.addView(this.f5169i, -1, -2);
            this.f5171k = new FrameLayout(this.f5167g);
            this.f5169i.addView(this.f5171k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f5168h.getEditText() != null) {
                f();
            }
        }
        if (z(i2)) {
            this.f5171k.setVisibility(0);
            this.f5171k.addView(textView);
        } else {
            this.f5169i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f5169i.setVisibility(0);
        this.f5170j++;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (g()) {
            EditText editText = this.f5168h.getEditText();
            boolean g2 = h0.c.g(this.f5167g);
            LinearLayout linearLayout = this.f5169i;
            int i2 = c.material_helper_text_font_1_3_padding_horizontal;
            W.D0(linearLayout, v(g2, i2, W.H(editText)), v(g2, c.material_helper_text_font_1_3_padding_top, this.f5167g.getResources().getDimensionPixelSize(c.material_helper_text_default_padding_top)), v(g2, i2, W.G(editText)), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Animator animator = this.f5172l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return y(this.f5175o);
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.f5180t;
    }

    /* access modifiers changed from: package-private */
    public CharSequence o() {
        return this.f5179s;
    }

    /* access modifiers changed from: package-private */
    public CharSequence p() {
        return this.f5176p;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        TextView textView = this.f5178r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList r() {
        TextView textView = this.f5178r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence s() {
        return this.f5183w;
    }

    /* access modifiers changed from: package-private */
    public View t() {
        return this.f5185y;
    }

    /* access modifiers changed from: package-private */
    public int u() {
        TextView textView = this.f5185y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.f5176p = null;
        h();
        if (this.f5174n == 1) {
            this.f5175o = (!this.f5184x || TextUtils.isEmpty(this.f5183w)) ? 0 : 2;
        }
        S(this.f5174n, this.f5175o, P(this.f5178r, ""));
    }

    /* access modifiers changed from: package-private */
    public void x() {
        h();
        int i2 = this.f5174n;
        if (i2 == 2) {
            this.f5175o = 0;
        }
        S(i2, this.f5175o, P(this.f5185y, ""));
    }

    /* access modifiers changed from: package-private */
    public boolean z(int i2) {
        return i2 == 0 || i2 == 1;
    }
}
