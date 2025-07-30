package com.google.android.material.textfield;

import T.e;
import T.g;
import T.h;
import T.j;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
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
import com.google.android.material.internal.x;
import com.google.android.material.textfield.TextInputLayout;
import f.C0236a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import y.C0299c;

class s extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    final TextInputLayout f5125a;

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f5126b;

    /* renamed from: c  reason: collision with root package name */
    private final CheckableImageButton f5127c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f5128d;

    /* renamed from: e  reason: collision with root package name */
    private PorterDuff.Mode f5129e;

    /* renamed from: f  reason: collision with root package name */
    private View.OnLongClickListener f5130f;

    /* renamed from: g  reason: collision with root package name */
    private final CheckableImageButton f5131g;

    /* renamed from: h  reason: collision with root package name */
    private final d f5132h;

    /* renamed from: i  reason: collision with root package name */
    private int f5133i = 0;

    /* renamed from: j  reason: collision with root package name */
    private final LinkedHashSet f5134j = new LinkedHashSet();

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f5135k;

    /* renamed from: l  reason: collision with root package name */
    private PorterDuff.Mode f5136l;

    /* renamed from: m  reason: collision with root package name */
    private int f5137m;

    /* renamed from: n  reason: collision with root package name */
    private ImageView.ScaleType f5138n;

    /* renamed from: o  reason: collision with root package name */
    private View.OnLongClickListener f5139o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f5140p;

    /* renamed from: q  reason: collision with root package name */
    private final TextView f5141q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f5142r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public EditText f5143s;

    /* renamed from: t  reason: collision with root package name */
    private final AccessibilityManager f5144t;

    /* renamed from: u  reason: collision with root package name */
    private C0299c.a f5145u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final TextWatcher f5146v = new a();

    /* renamed from: w  reason: collision with root package name */
    private final TextInputLayout.f f5147w;

    class a extends x {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            s.this.m().a(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            s.this.m().b(charSequence, i2, i3, i4);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        public void a(TextInputLayout textInputLayout) {
            if (s.this.f5143s != textInputLayout.getEditText()) {
                if (s.this.f5143s != null) {
                    s.this.f5143s.removeTextChangedListener(s.this.f5146v);
                    if (s.this.f5143s.getOnFocusChangeListener() == s.this.m().e()) {
                        s.this.f5143s.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                    }
                }
                EditText unused = s.this.f5143s = textInputLayout.getEditText();
                if (s.this.f5143s != null) {
                    s.this.f5143s.addTextChangedListener(s.this.f5146v);
                }
                s.this.m().n(s.this.f5143s);
                s sVar = s.this;
                sVar.h0(sVar.m());
            }
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        public void onViewAttachedToWindow(View view) {
            s.this.g();
        }

        public void onViewDetachedFromWindow(View view) {
            s.this.M();
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray f5151a = new SparseArray();

        /* renamed from: b  reason: collision with root package name */
        private final s f5152b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f5153c;

        /* renamed from: d  reason: collision with root package name */
        private final int f5154d;

        d(s sVar, e0 e0Var) {
            this.f5152b = sVar;
            this.f5153c = e0Var.n(j.y6, 0);
            this.f5154d = e0Var.n(j.W6, 0);
        }

        private t b(int i2) {
            if (i2 == -1) {
                return new C0226g(this.f5152b);
            }
            if (i2 == 0) {
                return new x(this.f5152b);
            }
            if (i2 == 1) {
                return new z(this.f5152b, this.f5154d);
            }
            if (i2 == 2) {
                return new C0225f(this.f5152b);
            }
            if (i2 == 3) {
                return new q(this.f5152b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i2);
        }

        /* access modifiers changed from: package-private */
        public t c(int i2) {
            t tVar = (t) this.f5151a.get(i2);
            if (tVar != null) {
                return tVar;
            }
            t b2 = b(i2);
            this.f5151a.append(i2, b2);
            return b2;
        }
    }

    s(TextInputLayout textInputLayout, e0 e0Var) {
        super(textInputLayout.getContext());
        b bVar = new b();
        this.f5147w = bVar;
        this.f5144t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f5125a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f5126b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i2 = i(this, from, e.text_input_error_icon);
        this.f5127c = i2;
        CheckableImageButton i3 = i(frameLayout, from, e.text_input_end_icon);
        this.f5131g = i3;
        this.f5132h = new d(this, e0Var);
        F f2 = new F(getContext());
        this.f5141q = f2;
        C(e0Var);
        B(e0Var);
        D(e0Var);
        frameLayout.addView(i3);
        addView(f2);
        addView(frameLayout);
        addView(i2);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(e0 e0Var) {
        int i2 = j.X6;
        if (!e0Var.s(i2)) {
            int i3 = j.C6;
            if (e0Var.s(i3)) {
                this.f5135k = h0.c.b(getContext(), e0Var, i3);
            }
            int i4 = j.D6;
            if (e0Var.s(i4)) {
                this.f5136l = B.i(e0Var.k(i4, -1), (PorterDuff.Mode) null);
            }
        }
        int i5 = j.A6;
        if (e0Var.s(i5)) {
            U(e0Var.k(i5, 0));
            int i6 = j.x6;
            if (e0Var.s(i6)) {
                Q(e0Var.p(i6));
            }
            O(e0Var.a(j.w6, true));
        } else if (e0Var.s(i2)) {
            int i7 = j.Y6;
            if (e0Var.s(i7)) {
                this.f5135k = h0.c.b(getContext(), e0Var, i7);
            }
            int i8 = j.Z6;
            if (e0Var.s(i8)) {
                this.f5136l = B.i(e0Var.k(i8, -1), (PorterDuff.Mode) null);
            }
            U(e0Var.a(i2, false) ? 1 : 0);
            Q(e0Var.p(j.V6));
        }
        T(e0Var.f(j.z6, getResources().getDimensionPixelSize(T.c.mtrl_min_touch_target_size)));
        int i9 = j.B6;
        if (e0Var.s(i9)) {
            X(u.b(e0Var.k(i9, -1)));
        }
    }

    private void C(e0 e0Var) {
        int i2 = j.I6;
        if (e0Var.s(i2)) {
            this.f5128d = h0.c.b(getContext(), e0Var, i2);
        }
        int i3 = j.J6;
        if (e0Var.s(i3)) {
            this.f5129e = B.i(e0Var.k(i3, -1), (PorterDuff.Mode) null);
        }
        int i4 = j.H6;
        if (e0Var.s(i4)) {
            c0(e0Var.g(i4));
        }
        this.f5127c.setContentDescription(getResources().getText(h.error_icon_content_description));
        W.y0(this.f5127c, 2);
        this.f5127c.setClickable(false);
        this.f5127c.setPressable(false);
        this.f5127c.setFocusable(false);
    }

    private void D(e0 e0Var) {
        this.f5141q.setVisibility(8);
        this.f5141q.setId(e.textinput_suffix_text);
        this.f5141q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        W.s0(this.f5141q, 1);
        q0(e0Var.n(j.o7, 0));
        int i2 = j.p7;
        if (e0Var.s(i2)) {
            r0(e0Var.c(i2));
        }
        p0(e0Var.p(j.n7));
    }

    /* access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        C0299c.a aVar = this.f5145u;
        if (aVar != null && (accessibilityManager = this.f5144t) != null) {
            C0299c.b(accessibilityManager, aVar);
        }
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.f5145u != null && this.f5144t != null && W.T(this)) {
            C0299c.a(this.f5144t, this.f5145u);
        }
    }

    /* access modifiers changed from: private */
    public void h0(t tVar) {
        if (this.f5143s != null) {
            if (tVar.e() != null) {
                this.f5143s.setOnFocusChangeListener(tVar.e());
            }
            if (tVar.g() != null) {
                this.f5131g.setOnFocusChangeListener(tVar.g());
            }
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(g.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i2);
        u.e(checkableImageButton);
        if (h0.c.g(getContext())) {
            C0162v.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i2) {
        Iterator it = this.f5134j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void s0(t tVar) {
        tVar.s();
        this.f5145u = tVar.h();
        g();
    }

    private int t(t tVar) {
        int a2 = this.f5132h.f5153c;
        return a2 == 0 ? tVar.d() : a2;
    }

    private void t0(t tVar) {
        M();
        this.f5145u = null;
        tVar.u();
    }

    private void u0(boolean z2) {
        if (!z2 || n() == null) {
            u.a(this.f5125a, this.f5131g, this.f5135k, this.f5136l);
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(n()).mutate();
        androidx.core.graphics.drawable.a.n(mutate, this.f5125a.getErrorCurrentTextColors());
        this.f5131g.setImageDrawable(mutate);
    }

    private void v0() {
        int i2 = 8;
        this.f5126b.setVisibility((this.f5131g.getVisibility() != 0 || G()) ? 8 : 0);
        char c2 = (this.f5140p == null || this.f5142r) ? (char) 8 : 0;
        if (F() || G() || c2 == 0) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    private void w0() {
        int i2 = 0;
        boolean z2 = s() != null && this.f5125a.N() && this.f5125a.d0();
        CheckableImageButton checkableImageButton = this.f5127c;
        if (!z2) {
            i2 = 8;
        }
        checkableImageButton.setVisibility(i2);
        v0();
        x0();
        if (!A()) {
            this.f5125a.o0();
        }
    }

    private void y0() {
        int visibility = this.f5141q.getVisibility();
        boolean z2 = false;
        int i2 = (this.f5140p == null || this.f5142r) ? 8 : 0;
        if (visibility != i2) {
            t m2 = m();
            if (i2 == 0) {
                z2 = true;
            }
            m2.q(z2);
        }
        v0();
        this.f5141q.setVisibility(i2);
        this.f5125a.o0();
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f5133i != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return A() && this.f5131g.isChecked();
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        return this.f5126b.getVisibility() == 0 && this.f5131g.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.f5127c.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public void H(boolean z2) {
        this.f5142r = z2;
        y0();
    }

    /* access modifiers changed from: package-private */
    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f5125a.d0());
        }
    }

    /* access modifiers changed from: package-private */
    public void J() {
        u.d(this.f5125a, this.f5131g, this.f5135k);
    }

    /* access modifiers changed from: package-private */
    public void K() {
        u.d(this.f5125a, this.f5127c, this.f5128d);
    }

    /* access modifiers changed from: package-private */
    public void L(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean isChecked;
        t m2 = m();
        boolean z4 = true;
        if (!m2.l() || (isChecked = this.f5131g.isChecked()) == m2.m()) {
            z3 = false;
        } else {
            this.f5131g.setChecked(!isChecked);
            z3 = true;
        }
        if (!m2.j() || (isActivated = this.f5131g.isActivated()) == m2.k()) {
            z4 = z3;
        } else {
            N(!isActivated);
        }
        if (z2 || z4) {
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void N(boolean z2) {
        this.f5131g.setActivated(z2);
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z2) {
        this.f5131g.setCheckable(z2);
    }

    /* access modifiers changed from: package-private */
    public void P(int i2) {
        Q(i2 != 0 ? getResources().getText(i2) : null);
    }

    /* access modifiers changed from: package-private */
    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f5131g.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void R(int i2) {
        S(i2 != 0 ? C0236a.b(getContext(), i2) : null);
    }

    /* access modifiers changed from: package-private */
    public void S(Drawable drawable) {
        this.f5131g.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f5125a, this.f5131g, this.f5135k, this.f5136l);
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void T(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i2 != this.f5137m) {
            this.f5137m = i2;
            u.g(this.f5131g, i2);
            u.g(this.f5127c, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void U(int i2) {
        if (this.f5133i != i2) {
            t0(m());
            int i3 = this.f5133i;
            this.f5133i = i2;
            j(i3);
            a0(i2 != 0);
            t m2 = m();
            R(t(m2));
            P(m2.c());
            O(m2.l());
            if (m2.i(this.f5125a.getBoxBackgroundMode())) {
                s0(m2);
                V(m2.f());
                EditText editText = this.f5143s;
                if (editText != null) {
                    m2.n(editText);
                    h0(m2);
                }
                u.a(this.f5125a, this.f5131g, this.f5135k, this.f5136l);
                L(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + this.f5125a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void V(View.OnClickListener onClickListener) {
        u.h(this.f5131g, onClickListener, this.f5139o);
    }

    /* access modifiers changed from: package-private */
    public void W(View.OnLongClickListener onLongClickListener) {
        this.f5139o = onLongClickListener;
        u.i(this.f5131g, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void X(ImageView.ScaleType scaleType) {
        this.f5138n = scaleType;
        u.j(this.f5131g, scaleType);
        u.j(this.f5127c, scaleType);
    }

    /* access modifiers changed from: package-private */
    public void Y(ColorStateList colorStateList) {
        if (this.f5135k != colorStateList) {
            this.f5135k = colorStateList;
            u.a(this.f5125a, this.f5131g, colorStateList, this.f5136l);
        }
    }

    /* access modifiers changed from: package-private */
    public void Z(PorterDuff.Mode mode) {
        if (this.f5136l != mode) {
            this.f5136l = mode;
            u.a(this.f5125a, this.f5131g, this.f5135k, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void a0(boolean z2) {
        if (F() != z2) {
            this.f5131g.setVisibility(z2 ? 0 : 8);
            v0();
            x0();
            this.f5125a.o0();
        }
    }

    /* access modifiers changed from: package-private */
    public void b0(int i2) {
        c0(i2 != 0 ? C0236a.b(getContext(), i2) : null);
        K();
    }

    /* access modifiers changed from: package-private */
    public void c0(Drawable drawable) {
        this.f5127c.setImageDrawable(drawable);
        w0();
        u.a(this.f5125a, this.f5127c, this.f5128d, this.f5129e);
    }

    /* access modifiers changed from: package-private */
    public void d0(View.OnClickListener onClickListener) {
        u.h(this.f5127c, onClickListener, this.f5130f);
    }

    /* access modifiers changed from: package-private */
    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f5130f = onLongClickListener;
        u.i(this.f5127c, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void f0(ColorStateList colorStateList) {
        if (this.f5128d != colorStateList) {
            this.f5128d = colorStateList;
            u.a(this.f5125a, this.f5127c, colorStateList, this.f5129e);
        }
    }

    /* access modifiers changed from: package-private */
    public void g0(PorterDuff.Mode mode) {
        if (this.f5129e != mode) {
            this.f5129e = mode;
            u.a(this.f5125a, this.f5127c, this.f5128d, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f5131g.performClick();
        this.f5131g.jumpDrawablesToCurrentState();
    }

    /* access modifiers changed from: package-private */
    public void i0(int i2) {
        j0(i2 != 0 ? getResources().getText(i2) : null);
    }

    /* access modifiers changed from: package-private */
    public void j0(CharSequence charSequence) {
        this.f5131g.setContentDescription(charSequence);
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton k() {
        if (G()) {
            return this.f5127c;
        }
        if (!A() || !F()) {
            return null;
        }
        return this.f5131g;
    }

    /* access modifiers changed from: package-private */
    public void k0(int i2) {
        l0(i2 != 0 ? C0236a.b(getContext(), i2) : null);
    }

    /* access modifiers changed from: package-private */
    public CharSequence l() {
        return this.f5131g.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public void l0(Drawable drawable) {
        this.f5131g.setImageDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public t m() {
        return this.f5132h.c(this.f5133i);
    }

    /* access modifiers changed from: package-private */
    public void m0(boolean z2) {
        if (z2 && this.f5133i != 1) {
            U(1);
        } else if (!z2) {
            U(0);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable n() {
        return this.f5131g.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public void n0(ColorStateList colorStateList) {
        this.f5135k = colorStateList;
        u.a(this.f5125a, this.f5131g, colorStateList, this.f5136l);
    }

    /* access modifiers changed from: package-private */
    public int o() {
        return this.f5137m;
    }

    /* access modifiers changed from: package-private */
    public void o0(PorterDuff.Mode mode) {
        this.f5136l = mode;
        u.a(this.f5125a, this.f5131g, this.f5135k, mode);
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return this.f5133i;
    }

    /* access modifiers changed from: package-private */
    public void p0(CharSequence charSequence) {
        this.f5140p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f5141q.setText(charSequence);
        y0();
    }

    /* access modifiers changed from: package-private */
    public ImageView.ScaleType q() {
        return this.f5138n;
    }

    /* access modifiers changed from: package-private */
    public void q0(int i2) {
        androidx.core.widget.j.o(this.f5141q, i2);
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton r() {
        return this.f5131g;
    }

    /* access modifiers changed from: package-private */
    public void r0(ColorStateList colorStateList) {
        this.f5141q.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public Drawable s() {
        return this.f5127c.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public CharSequence u() {
        return this.f5131g.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public Drawable v() {
        return this.f5131g.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public CharSequence w() {
        return this.f5140p;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList x() {
        return this.f5141q.getTextColors();
    }

    /* access modifiers changed from: package-private */
    public void x0() {
        if (this.f5125a.f5030d != null) {
            W.D0(this.f5141q, getContext().getResources().getDimensionPixelSize(T.c.material_input_text_to_prefix_suffix_padding), this.f5125a.f5030d.getPaddingTop(), (F() || G()) ? 0 : W.G(this.f5125a.f5030d), this.f5125a.f5030d.getPaddingBottom());
        }
    }

    /* access modifiers changed from: package-private */
    public int y() {
        return W.G(this) + W.G(this.f5141q) + ((F() || G()) ? this.f5131g.getMeasuredWidth() + C0162v.b((ViewGroup.MarginLayoutParams) this.f5131g.getLayoutParams()) : 0);
    }

    /* access modifiers changed from: package-private */
    public TextView z() {
        return this.f5141q;
    }
}
