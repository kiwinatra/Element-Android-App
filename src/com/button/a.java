package com.google.android.material.button;

import T.j;
import a0.C0087a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.view.W;
import com.google.android.material.internal.B;
import h0.c;
import i0.b;
import k0.g;
import k0.k;
import k0.n;

class a {

    /* renamed from: u  reason: collision with root package name */
    private static final boolean f4402u = true;

    /* renamed from: v  reason: collision with root package name */
    private static final boolean f4403v;

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f4404a;

    /* renamed from: b  reason: collision with root package name */
    private k f4405b;

    /* renamed from: c  reason: collision with root package name */
    private int f4406c;

    /* renamed from: d  reason: collision with root package name */
    private int f4407d;

    /* renamed from: e  reason: collision with root package name */
    private int f4408e;

    /* renamed from: f  reason: collision with root package name */
    private int f4409f;

    /* renamed from: g  reason: collision with root package name */
    private int f4410g;

    /* renamed from: h  reason: collision with root package name */
    private int f4411h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f4412i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f4413j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f4414k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f4415l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f4416m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f4417n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4418o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f4419p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f4420q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f4421r = true;

    /* renamed from: s  reason: collision with root package name */
    private LayerDrawable f4422s;

    /* renamed from: t  reason: collision with root package name */
    private int f4423t;

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i2 > 22) {
            z2 = false;
        }
        f4403v = z2;
    }

    a(MaterialButton materialButton, k kVar) {
        this.f4404a = materialButton;
        this.f4405b = kVar;
    }

    private void G(int i2, int i3) {
        int H2 = W.H(this.f4404a);
        int paddingTop = this.f4404a.getPaddingTop();
        int G2 = W.G(this.f4404a);
        int paddingBottom = this.f4404a.getPaddingBottom();
        int i4 = this.f4408e;
        int i5 = this.f4409f;
        this.f4409f = i3;
        this.f4408e = i2;
        if (!this.f4418o) {
            H();
        }
        W.D0(this.f4404a, H2, (paddingTop + i2) - i4, G2, (paddingBottom + i3) - i5);
    }

    private void H() {
        this.f4404a.setInternalBackground(a());
        g f2 = f();
        if (f2 != null) {
            f2.S((float) this.f4423t);
            f2.setState(this.f4404a.getDrawableState());
        }
    }

    private void I(k kVar) {
        if (!f4403v || this.f4418o) {
            if (f() != null) {
                f().setShapeAppearanceModel(kVar);
            }
            if (n() != null) {
                n().setShapeAppearanceModel(kVar);
            }
            if (e() != null) {
                e().setShapeAppearanceModel(kVar);
                return;
            }
            return;
        }
        int H2 = W.H(this.f4404a);
        int paddingTop = this.f4404a.getPaddingTop();
        int G2 = W.G(this.f4404a);
        int paddingBottom = this.f4404a.getPaddingBottom();
        H();
        W.D0(this.f4404a, H2, paddingTop, G2, paddingBottom);
    }

    private void K() {
        g f2 = f();
        g n2 = n();
        if (f2 != null) {
            f2.Y((float) this.f4411h, this.f4414k);
            if (n2 != null) {
                n2.X((float) this.f4411h, this.f4417n ? C0087a.d(this.f4404a, T.a.colorSurface) : 0);
            }
        }
    }

    private InsetDrawable L(Drawable drawable) {
        return new InsetDrawable(drawable, this.f4406c, this.f4408e, this.f4407d, this.f4409f);
    }

    private Drawable a() {
        g gVar = new g(this.f4405b);
        gVar.J(this.f4404a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f4413j);
        PorterDuff.Mode mode = this.f4412i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.Y((float) this.f4411h, this.f4414k);
        g gVar2 = new g(this.f4405b);
        gVar2.setTint(0);
        gVar2.X((float) this.f4411h, this.f4417n ? C0087a.d(this.f4404a, T.a.colorSurface) : 0);
        if (f4402u) {
            g gVar3 = new g(this.f4405b);
            this.f4416m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.b(this.f4415l), L(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f4416m);
            this.f4422s = rippleDrawable;
            return rippleDrawable;
        }
        i0.a aVar = new i0.a(this.f4405b);
        this.f4416m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, b.b(this.f4415l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f4416m});
        this.f4422s = layerDrawable;
        return L(layerDrawable);
    }

    private g g(boolean z2) {
        LayerDrawable layerDrawable;
        LayerDrawable layerDrawable2 = this.f4422s;
        if (layerDrawable2 == null || layerDrawable2.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f4402u) {
            layerDrawable = (LayerDrawable) ((InsetDrawable) this.f4422s.getDrawable(0)).getDrawable();
        } else {
            layerDrawable = this.f4422s;
        }
        return (g) layerDrawable.getDrawable(z2 ^ true ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    /* access modifiers changed from: package-private */
    public void A(boolean z2) {
        this.f4417n = z2;
        K();
    }

    /* access modifiers changed from: package-private */
    public void B(ColorStateList colorStateList) {
        if (this.f4414k != colorStateList) {
            this.f4414k = colorStateList;
            K();
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int i2) {
        if (this.f4411h != i2) {
            this.f4411h = i2;
            K();
        }
    }

    /* access modifiers changed from: package-private */
    public void D(ColorStateList colorStateList) {
        if (this.f4413j != colorStateList) {
            this.f4413j = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.o(f(), this.f4413j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void E(PorterDuff.Mode mode) {
        if (this.f4412i != mode) {
            this.f4412i = mode;
            if (f() != null && this.f4412i != null) {
                androidx.core.graphics.drawable.a.p(f(), this.f4412i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void F(boolean z2) {
        this.f4421r = z2;
    }

    /* access modifiers changed from: package-private */
    public void J(int i2, int i3) {
        Drawable drawable = this.f4416m;
        if (drawable != null) {
            drawable.setBounds(this.f4406c, this.f4408e, i3 - this.f4407d, i2 - this.f4409f);
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f4410g;
    }

    public int c() {
        return this.f4409f;
    }

    public int d() {
        return this.f4408e;
    }

    public n e() {
        Drawable drawable;
        LayerDrawable layerDrawable = this.f4422s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f4422s.getNumberOfLayers() > 2) {
            drawable = this.f4422s.getDrawable(2);
        } else {
            drawable = this.f4422s.getDrawable(1);
        }
        return (n) drawable;
    }

    /* access modifiers changed from: package-private */
    public g f() {
        return g(false);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f4415l;
    }

    /* access modifiers changed from: package-private */
    public k i() {
        return this.f4405b;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f4414k;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f4411h;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f4413j;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode m() {
        return this.f4412i;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f4418o;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f4420q;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.f4421r;
    }

    /* access modifiers changed from: package-private */
    public void r(TypedArray typedArray) {
        this.f4406c = typedArray.getDimensionPixelOffset(j.d2, 0);
        this.f4407d = typedArray.getDimensionPixelOffset(j.e2, 0);
        this.f4408e = typedArray.getDimensionPixelOffset(j.f2, 0);
        this.f4409f = typedArray.getDimensionPixelOffset(j.g2, 0);
        int i2 = j.k2;
        if (typedArray.hasValue(i2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            this.f4410g = dimensionPixelSize;
            z(this.f4405b.w((float) dimensionPixelSize));
            this.f4419p = true;
        }
        this.f4411h = typedArray.getDimensionPixelSize(j.u2, 0);
        this.f4412i = B.i(typedArray.getInt(j.j2, -1), PorterDuff.Mode.SRC_IN);
        this.f4413j = c.a(this.f4404a.getContext(), typedArray, j.i2);
        this.f4414k = c.a(this.f4404a.getContext(), typedArray, j.t2);
        this.f4415l = c.a(this.f4404a.getContext(), typedArray, j.s2);
        this.f4420q = typedArray.getBoolean(j.h2, false);
        this.f4423t = typedArray.getDimensionPixelSize(j.l2, 0);
        this.f4421r = typedArray.getBoolean(j.v2, true);
        int H2 = W.H(this.f4404a);
        int paddingTop = this.f4404a.getPaddingTop();
        int G2 = W.G(this.f4404a);
        int paddingBottom = this.f4404a.getPaddingBottom();
        if (typedArray.hasValue(j.c2)) {
            t();
        } else {
            H();
        }
        W.D0(this.f4404a, H2 + this.f4406c, paddingTop + this.f4408e, G2 + this.f4407d, paddingBottom + this.f4409f);
    }

    /* access modifiers changed from: package-private */
    public void s(int i2) {
        if (f() != null) {
            f().setTint(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f4418o = true;
        this.f4404a.setSupportBackgroundTintList(this.f4413j);
        this.f4404a.setSupportBackgroundTintMode(this.f4412i);
    }

    /* access modifiers changed from: package-private */
    public void u(boolean z2) {
        this.f4420q = z2;
    }

    /* access modifiers changed from: package-private */
    public void v(int i2) {
        if (!this.f4419p || this.f4410g != i2) {
            this.f4410g = i2;
            this.f4419p = true;
            z(this.f4405b.w((float) i2));
        }
    }

    public void w(int i2) {
        G(this.f4408e, i2);
    }

    public void x(int i2) {
        G(i2, this.f4409f);
    }

    /* access modifiers changed from: package-private */
    public void y(ColorStateList colorStateList) {
        if (this.f4415l != colorStateList) {
            this.f4415l = colorStateList;
            boolean z2 = f4402u;
            if (z2 && (this.f4404a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f4404a.getBackground()).setColor(b.b(colorStateList));
            } else if (!z2 && (this.f4404a.getBackground() instanceof i0.a)) {
                ((i0.a) this.f4404a.getBackground()).setTintList(b.b(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z(k kVar) {
        this.f4405b = kVar;
        I(kVar);
    }
}
