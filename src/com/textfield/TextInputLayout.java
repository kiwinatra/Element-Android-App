package com.google.android.material.textfield;

import T.i;
import a0.C0087a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0106k;
import androidx.appcompat.widget.F;
import androidx.appcompat.widget.N;
import androidx.core.view.C0121a;
import androidx.core.view.C0162v;
import androidx.core.view.W;
import androidx.core.widget.j;
import androidx.transition.C0196c;
import androidx.transition.t;
import com.google.android.material.internal.B;
import com.google.android.material.internal.C0214a;
import com.google.android.material.internal.C0216c;
import com.google.android.material.internal.CheckableImageButton;
import f.C0236a;
import f0.h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k0.k;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0  reason: collision with root package name */
    private static final int f4998C0 = i.Widget_Design_TextInputLayout;
    private static final int[][] D0 = {new int[]{16842919}, new int[0]};

    /* renamed from: A  reason: collision with root package name */
    private ColorStateList f4999A;
    /* access modifiers changed from: private */

    /* renamed from: A0  reason: collision with root package name */
    public boolean f5000A0;

    /* renamed from: B  reason: collision with root package name */
    private ColorStateList f5001B;

    /* renamed from: B0  reason: collision with root package name */
    private boolean f5002B0;

    /* renamed from: C  reason: collision with root package name */
    private boolean f5003C;

    /* renamed from: D  reason: collision with root package name */
    private CharSequence f5004D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f5005E;

    /* renamed from: F  reason: collision with root package name */
    private k0.g f5006F;

    /* renamed from: G  reason: collision with root package name */
    private k0.g f5007G;

    /* renamed from: H  reason: collision with root package name */
    private StateListDrawable f5008H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f5009I;

    /* renamed from: J  reason: collision with root package name */
    private k0.g f5010J;

    /* renamed from: K  reason: collision with root package name */
    private k0.g f5011K;

    /* renamed from: L  reason: collision with root package name */
    private k f5012L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f5013M;

    /* renamed from: N  reason: collision with root package name */
    private final int f5014N;

    /* renamed from: O  reason: collision with root package name */
    private int f5015O;

    /* renamed from: P  reason: collision with root package name */
    private int f5016P;

    /* renamed from: Q  reason: collision with root package name */
    private int f5017Q;

    /* renamed from: R  reason: collision with root package name */
    private int f5018R;

    /* renamed from: S  reason: collision with root package name */
    private int f5019S;

    /* renamed from: T  reason: collision with root package name */
    private int f5020T;

    /* renamed from: U  reason: collision with root package name */
    private int f5021U;

    /* renamed from: V  reason: collision with root package name */
    private final Rect f5022V;

    /* renamed from: W  reason: collision with root package name */
    private final Rect f5023W;

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f5024a;

    /* renamed from: a0  reason: collision with root package name */
    private final RectF f5025a0;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final A f5026b;

    /* renamed from: b0  reason: collision with root package name */
    private Typeface f5027b0;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final s f5028c;

    /* renamed from: c0  reason: collision with root package name */
    private Drawable f5029c0;

    /* renamed from: d  reason: collision with root package name */
    EditText f5030d;

    /* renamed from: d0  reason: collision with root package name */
    private int f5031d0;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f5032e;

    /* renamed from: e0  reason: collision with root package name */
    private final LinkedHashSet f5033e0;

    /* renamed from: f  reason: collision with root package name */
    private int f5034f;

    /* renamed from: f0  reason: collision with root package name */
    private Drawable f5035f0;

    /* renamed from: g  reason: collision with root package name */
    private int f5036g;

    /* renamed from: g0  reason: collision with root package name */
    private int f5037g0;

    /* renamed from: h  reason: collision with root package name */
    private int f5038h;

    /* renamed from: h0  reason: collision with root package name */
    private Drawable f5039h0;

    /* renamed from: i  reason: collision with root package name */
    private int f5040i;

    /* renamed from: i0  reason: collision with root package name */
    private ColorStateList f5041i0;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final v f5042j;

    /* renamed from: j0  reason: collision with root package name */
    private ColorStateList f5043j0;

    /* renamed from: k  reason: collision with root package name */
    boolean f5044k;

    /* renamed from: k0  reason: collision with root package name */
    private int f5045k0;

    /* renamed from: l  reason: collision with root package name */
    private int f5046l;

    /* renamed from: l0  reason: collision with root package name */
    private int f5047l0;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5048m;

    /* renamed from: m0  reason: collision with root package name */
    private int f5049m0;

    /* renamed from: n  reason: collision with root package name */
    private e f5050n;

    /* renamed from: n0  reason: collision with root package name */
    private ColorStateList f5051n0;

    /* renamed from: o  reason: collision with root package name */
    private TextView f5052o;

    /* renamed from: o0  reason: collision with root package name */
    private int f5053o0;

    /* renamed from: p  reason: collision with root package name */
    private int f5054p;

    /* renamed from: p0  reason: collision with root package name */
    private int f5055p0;

    /* renamed from: q  reason: collision with root package name */
    private int f5056q;

    /* renamed from: q0  reason: collision with root package name */
    private int f5057q0;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f5058r;

    /* renamed from: r0  reason: collision with root package name */
    private int f5059r0;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f5060s;

    /* renamed from: s0  reason: collision with root package name */
    private int f5061s0;

    /* renamed from: t  reason: collision with root package name */
    private TextView f5062t;

    /* renamed from: t0  reason: collision with root package name */
    int f5063t0;

    /* renamed from: u  reason: collision with root package name */
    private ColorStateList f5064u;

    /* renamed from: u0  reason: collision with root package name */
    private boolean f5065u0;

    /* renamed from: v  reason: collision with root package name */
    private int f5066v;

    /* renamed from: v0  reason: collision with root package name */
    final C0214a f5067v0;

    /* renamed from: w  reason: collision with root package name */
    private C0196c f5068w;

    /* renamed from: w0  reason: collision with root package name */
    private boolean f5069w0;

    /* renamed from: x  reason: collision with root package name */
    private C0196c f5070x;

    /* renamed from: x0  reason: collision with root package name */
    private boolean f5071x0;

    /* renamed from: y  reason: collision with root package name */
    private ColorStateList f5072y;

    /* renamed from: y0  reason: collision with root package name */
    private ValueAnimator f5073y0;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f5074z;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f5075z0;

    class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        int f5076a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f5077b;

        a(EditText editText) {
            this.f5077b = editText;
            this.f5076a = editText.getLineCount();
        }

        public void afterTextChanged(Editable editable) {
            int i2;
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u0(!textInputLayout.f5000A0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f5044k) {
                textInputLayout2.k0(editable);
            }
            if (TextInputLayout.this.f5060s) {
                TextInputLayout.this.y0(editable);
            }
            int lineCount = this.f5077b.getLineCount();
            int i3 = this.f5076a;
            if (lineCount != i3) {
                if (lineCount < i3 && W.D(this.f5077b) != (i2 = TextInputLayout.this.f5063t0)) {
                    this.f5077b.setMinimumHeight(i2);
                }
                this.f5076a = lineCount;
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            TextInputLayout.this.f5028c.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f5067v0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends C0121a {

        /* renamed from: d  reason: collision with root package name */
        private final TextInputLayout f5081d;

        public d(TextInputLayout textInputLayout) {
            this.f5081d = textInputLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
            if (r3 != null) goto L_0x008a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(android.view.View r14, y.I r15) {
            /*
                r13 = this;
                super.g(r14, r15)
                com.google.android.material.textfield.TextInputLayout r0 = r13.f5081d
                android.widget.EditText r0 = r0.getEditText()
                if (r0 == 0) goto L_0x0010
                android.text.Editable r0 = r0.getText()
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                com.google.android.material.textfield.TextInputLayout r1 = r13.f5081d
                java.lang.CharSequence r1 = r1.getHint()
                com.google.android.material.textfield.TextInputLayout r2 = r13.f5081d
                java.lang.CharSequence r2 = r2.getError()
                com.google.android.material.textfield.TextInputLayout r3 = r13.f5081d
                java.lang.CharSequence r3 = r3.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r4 = r13.f5081d
                int r4 = r4.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r5 = r13.f5081d
                java.lang.CharSequence r5 = r5.getCounterOverflowDescription()
                boolean r6 = android.text.TextUtils.isEmpty(r0)
                r7 = r6 ^ 1
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                r9 = 1
                r8 = r8 ^ r9
                com.google.android.material.textfield.TextInputLayout r10 = r13.f5081d
                boolean r10 = r10.P()
                r10 = r10 ^ r9
                boolean r11 = android.text.TextUtils.isEmpty(r2)
                r11 = r11 ^ r9
                if (r11 != 0) goto L_0x0051
                boolean r12 = android.text.TextUtils.isEmpty(r5)
                if (r12 != 0) goto L_0x0050
                goto L_0x0051
            L_0x0050:
                r9 = 0
            L_0x0051:
                if (r8 == 0) goto L_0x0058
                java.lang.String r1 = r1.toString()
                goto L_0x005a
            L_0x0058:
                java.lang.String r1 = ""
            L_0x005a:
                com.google.android.material.textfield.TextInputLayout r8 = r13.f5081d
                com.google.android.material.textfield.A r8 = r8.f5026b
                r8.A(r15)
                java.lang.String r8 = ", "
                if (r7 == 0) goto L_0x006b
                r15.K0(r0)
                goto L_0x0091
            L_0x006b:
                boolean r12 = android.text.TextUtils.isEmpty(r1)
                if (r12 != 0) goto L_0x008e
                r15.K0(r1)
                if (r10 == 0) goto L_0x0091
                if (r3 == 0) goto L_0x0091
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r1)
                r10.append(r8)
                r10.append(r3)
                java.lang.String r3 = r10.toString()
            L_0x008a:
                r15.K0(r3)
                goto L_0x0091
            L_0x008e:
                if (r3 == 0) goto L_0x0091
                goto L_0x008a
            L_0x0091:
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 != 0) goto L_0x00bb
                int r3 = android.os.Build.VERSION.SDK_INT
                r10 = 26
                if (r3 < r10) goto L_0x00a1
                r15.w0(r1)
                goto L_0x00b8
            L_0x00a1:
                if (r7 == 0) goto L_0x00b5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r8)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
            L_0x00b5:
                r15.K0(r1)
            L_0x00b8:
                r15.G0(r6)
            L_0x00bb:
                if (r0 == 0) goto L_0x00c4
                int r0 = r0.length()
                if (r0 != r4) goto L_0x00c4
                goto L_0x00c5
            L_0x00c4:
                r4 = -1
            L_0x00c5:
                r15.y0(r4)
                if (r9 == 0) goto L_0x00d1
                if (r11 == 0) goto L_0x00cd
                goto L_0x00ce
            L_0x00cd:
                r2 = r5
            L_0x00ce:
                r15.s0(r2)
            L_0x00d1:
                com.google.android.material.textfield.TextInputLayout r0 = r13.f5081d
                com.google.android.material.textfield.v r0 = r0.f5042j
                android.view.View r0 = r0.t()
                if (r0 == 0) goto L_0x00e0
                r15.x0(r0)
            L_0x00e0:
                com.google.android.material.textfield.TextInputLayout r0 = r13.f5081d
                com.google.android.material.textfield.s r0 = r0.f5028c
                com.google.android.material.textfield.t r0 = r0.m()
                r0.o(r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.d.g(android.view.View, y.I):void");
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f5081d.f5028c.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    static class g extends C.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        CharSequence f5082c;

        /* renamed from: d  reason: collision with root package name */
        boolean f5083d;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i2) {
                return new g[i2];
            }
        }

        g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5082c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f5083d = parcel.readInt() != 1 ? false : true;
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f5082c + "}";
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            TextUtils.writeToParcel(this.f5082c, parcel, i2);
            parcel.writeInt(this.f5083d ? 1 : 0);
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, T.a.textInputStyle);
    }

    private C0196c A() {
        C0196c cVar = new C0196c();
        cVar.X((long) h.f(getContext(), T.a.motionDurationShort2, 87));
        cVar.Z(h.g(getContext(), T.a.motionEasingLinearInterpolator, U.a.f255a));
        return cVar;
    }

    private boolean B() {
        return this.f5003C && !TextUtils.isEmpty(this.f5004D) && (this.f5006F instanceof C0227h);
    }

    private void C() {
        Iterator it = this.f5033e0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void D(Canvas canvas) {
        k0.g gVar;
        if (this.f5011K != null && (gVar = this.f5010J) != null) {
            gVar.draw(canvas);
            if (this.f5030d.isFocused()) {
                Rect bounds = this.f5011K.getBounds();
                Rect bounds2 = this.f5010J.getBounds();
                float x2 = this.f5067v0.x();
                int centerX = bounds2.centerX();
                bounds.left = U.a.c(centerX, bounds2.left, x2);
                bounds.right = U.a.c(centerX, bounds2.right, x2);
                this.f5011K.draw(canvas);
            }
        }
    }

    private void E(Canvas canvas) {
        if (this.f5003C) {
            this.f5067v0.l(canvas);
        }
    }

    private void F(boolean z2) {
        ValueAnimator valueAnimator = this.f5073y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f5073y0.cancel();
        }
        if (!z2 || !this.f5071x0) {
            this.f5067v0.c0(0.0f);
        } else {
            l(0.0f);
        }
        if (B() && ((C0227h) this.f5006F).h0()) {
            y();
        }
        this.f5065u0 = true;
        L();
        this.f5026b.l(true);
        this.f5028c.H(true);
    }

    private k0.g G(boolean z2) {
        float f2;
        float f3;
        ColorStateList colorStateList;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(T.c.mtrl_shape_corner_size_small_component);
        if (z2) {
            f2 = dimensionPixelOffset;
        } else {
            f2 = 0.0f;
        }
        EditText editText = this.f5030d;
        if (editText instanceof w) {
            f3 = ((w) editText).getPopupElevation();
        } else {
            f3 = (float) getResources().getDimensionPixelOffset(T.c.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(T.c.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        k m2 = k.a().A(f2).E(f2).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f5030d;
        if (editText2 instanceof w) {
            colorStateList = ((w) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        k0.g m3 = k0.g.m(getContext(), f3, colorStateList);
        m3.setShapeAppearanceModel(m2);
        m3.V(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return m3;
    }

    private static Drawable H(k0.g gVar, int i2, int i3, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{C0087a.k(i3, i2, 0.1f), i2}), gVar, gVar);
    }

    private int I(int i2, boolean z2) {
        return i2 + ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f5030d.getCompoundPaddingLeft() : this.f5028c.y() : this.f5026b.c());
    }

    private int J(int i2, boolean z2) {
        return i2 - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f5030d.getCompoundPaddingRight() : this.f5026b.c() : this.f5028c.y());
    }

    private static Drawable K(Context context, k0.g gVar, int i2, int[][] iArr) {
        int c2 = C0087a.c(context, T.a.colorSurface, "TextInputLayout");
        k0.g gVar2 = new k0.g(gVar.A());
        int k2 = C0087a.k(i2, c2, 0.1f);
        gVar2.T(new ColorStateList(iArr, new int[]{k2, 0}));
        gVar2.setTint(c2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{k2, c2});
        k0.g gVar3 = new k0.g(gVar.A());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    private void L() {
        TextView textView = this.f5062t;
        if (textView != null && this.f5060s) {
            textView.setText((CharSequence) null);
            t.a(this.f5024a, this.f5070x);
            this.f5062t.setVisibility(4);
        }
    }

    private boolean Q() {
        return d0() || (this.f5052o != null && this.f5048m);
    }

    private boolean S() {
        return this.f5015O == 1 && this.f5030d.getMinLines() <= 1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int T(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f5030d.requestLayout();
    }

    private void V() {
        p();
        r0();
        A0();
        h0();
        k();
        if (this.f5015O != 0) {
            t0();
        }
        b0();
    }

    private void W() {
        if (B()) {
            RectF rectF = this.f5025a0;
            this.f5067v0.o(rectF, this.f5030d.getWidth(), this.f5030d.getGravity());
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                o(rectF);
                rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.f5017Q));
                ((C0227h) this.f5006F).k0(rectF);
            }
        }
    }

    private void X() {
        if (B() && !this.f5065u0) {
            y();
            W();
        }
    }

    private static void Y(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z2);
            }
        }
    }

    private void a0() {
        TextView textView = this.f5062t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void b0() {
        Drawable orCreateFilledDropDownMenuBackground;
        EditText editText = this.f5030d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i2 = this.f5015O;
                if (i2 == 2) {
                    orCreateFilledDropDownMenuBackground = getOrCreateOutlinedDropDownMenuBackground();
                } else if (i2 == 1) {
                    orCreateFilledDropDownMenuBackground = getOrCreateFilledDropDownMenuBackground();
                } else {
                    return;
                }
                autoCompleteTextView.setDropDownBackgroundDrawable(orCreateFilledDropDownMenuBackground);
            }
        }
    }

    private boolean e0() {
        return (this.f5028c.G() || ((this.f5028c.A() && M()) || this.f5028c.w() != null)) && this.f5028c.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f5026b.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.f5062t != null && this.f5060s && !TextUtils.isEmpty(this.f5058r)) {
            this.f5062t.setText(this.f5058r);
            t.a(this.f5024a, this.f5068w);
            this.f5062t.setVisibility(0);
            this.f5062t.bringToFront();
            announceForAccessibility(this.f5058r);
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f5030d;
        if (!(editText instanceof AutoCompleteTextView) || r.a(editText)) {
            return this.f5006F;
        }
        int d2 = C0087a.d(this.f5030d, T.a.f171f);
        int i2 = this.f5015O;
        if (i2 == 2) {
            return K(getContext(), this.f5006F, d2, D0);
        }
        if (i2 == 1) {
            return H(this.f5006F, this.f5021U, d2, D0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f5008H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f5008H = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f5008H.addState(new int[0], G(false));
        }
        return this.f5008H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f5007G == null) {
            this.f5007G = G(true);
        }
        return this.f5007G;
    }

    private void h0() {
        Resources resources;
        int i2;
        if (this.f5015O == 1) {
            if (h0.c.h(getContext())) {
                resources = getResources();
                i2 = T.c.material_font_2_0_box_collapsed_padding_top;
            } else if (h0.c.g(getContext())) {
                resources = getResources();
                i2 = T.c.material_font_1_3_box_collapsed_padding_top;
            } else {
                return;
            }
            this.f5016P = resources.getDimensionPixelSize(i2);
        }
    }

    private void i0(Rect rect) {
        k0.g gVar = this.f5010J;
        if (gVar != null) {
            int i2 = rect.bottom;
            gVar.setBounds(rect.left, i2 - this.f5018R, rect.right, i2);
        }
        k0.g gVar2 = this.f5011K;
        if (gVar2 != null) {
            int i3 = rect.bottom;
            gVar2.setBounds(rect.left, i3 - this.f5019S, rect.right, i3);
        }
    }

    private void j() {
        TextView textView = this.f5062t;
        if (textView != null) {
            this.f5024a.addView(textView);
            this.f5062t.setVisibility(0);
        }
    }

    private void j0() {
        if (this.f5052o != null) {
            EditText editText = this.f5030d;
            k0(editText == null ? null : editText.getText());
        }
    }

    private void k() {
        EditText editText;
        int H2;
        int dimensionPixelSize;
        int G2;
        Resources resources;
        int i2;
        if (this.f5030d != null && this.f5015O == 1) {
            if (h0.c.h(getContext())) {
                editText = this.f5030d;
                H2 = W.H(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(T.c.material_filled_edittext_font_2_0_padding_top);
                G2 = W.G(this.f5030d);
                resources = getResources();
                i2 = T.c.material_filled_edittext_font_2_0_padding_bottom;
            } else if (h0.c.g(getContext())) {
                editText = this.f5030d;
                H2 = W.H(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(T.c.material_filled_edittext_font_1_3_padding_top);
                G2 = W.G(this.f5030d);
                resources = getResources();
                i2 = T.c.material_filled_edittext_font_1_3_padding_bottom;
            } else {
                return;
            }
            W.D0(editText, H2, dimensionPixelSize, G2, resources.getDimensionPixelSize(i2));
        }
    }

    private static void l0(Context context, TextView textView, int i2, int i3, boolean z2) {
        textView.setContentDescription(context.getString(z2 ? T.h.character_counter_overflowed_content_description : T.h.character_counter_content_description, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    private void m() {
        k0.g gVar = this.f5006F;
        if (gVar != null) {
            k A2 = gVar.A();
            k kVar = this.f5012L;
            if (A2 != kVar) {
                this.f5006F.setShapeAppearanceModel(kVar);
            }
            if (w()) {
                this.f5006F.X((float) this.f5017Q, this.f5020T);
            }
            int q2 = q();
            this.f5021U = q2;
            this.f5006F.T(ColorStateList.valueOf(q2));
            n();
            r0();
        }
    }

    private void m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f5052o;
        if (textView != null) {
            c0(textView, this.f5048m ? this.f5054p : this.f5056q);
            if (!this.f5048m && (colorStateList2 = this.f5072y) != null) {
                this.f5052o.setTextColor(colorStateList2);
            }
            if (this.f5048m && (colorStateList = this.f5074z) != null) {
                this.f5052o.setTextColor(colorStateList);
            }
        }
    }

    private void n() {
        if (this.f5010J != null && this.f5011K != null) {
            if (x()) {
                this.f5010J.T(ColorStateList.valueOf(this.f5030d.isFocused() ? this.f5045k0 : this.f5020T));
                this.f5011K.T(ColorStateList.valueOf(this.f5020T));
            }
            invalidate();
        }
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f4999A;
        if (colorStateList2 == null) {
            colorStateList2 = C0087a.h(getContext(), T.a.f170e);
        }
        EditText editText = this.f5030d;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(this.f5030d.getTextCursorDrawable()).mutate();
            if (Q() && (colorStateList = this.f5001B) != null) {
                colorStateList2 = colorStateList;
            }
            androidx.core.graphics.drawable.a.o(mutate, colorStateList2);
        }
    }

    private void o(RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.f5014N;
        rectF.left = f2 - ((float) i2);
        rectF.right += (float) i2;
    }

    private void p() {
        int i2 = this.f5015O;
        if (i2 == 0) {
            this.f5006F = null;
        } else if (i2 == 1) {
            this.f5006F = new k0.g(this.f5012L);
            this.f5010J = new k0.g();
            this.f5011K = new k0.g();
            return;
        } else if (i2 == 2) {
            this.f5006F = (!this.f5003C || (this.f5006F instanceof C0227h)) ? new k0.g(this.f5012L) : C0227h.g0(this.f5012L);
        } else {
            throw new IllegalArgumentException(this.f5015O + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        this.f5010J = null;
        this.f5011K = null;
    }

    private int q() {
        return this.f5015O == 1 ? C0087a.j(C0087a.e(this, T.a.colorSurface, 0), this.f5021U) : this.f5021U;
    }

    private void q0() {
        W.u0(this.f5030d, getEditTextBoxBackground());
    }

    private Rect r(Rect rect) {
        int i2;
        int i3;
        if (this.f5030d != null) {
            Rect rect2 = this.f5023W;
            boolean g2 = B.g(this);
            rect2.bottom = rect.bottom;
            int i4 = this.f5015O;
            if (i4 == 1) {
                rect2.left = I(rect.left, g2);
                i2 = rect.top + this.f5016P;
            } else if (i4 != 2) {
                rect2.left = I(rect.left, g2);
                i2 = getPaddingTop();
            } else {
                rect2.left = rect.left + this.f5030d.getPaddingLeft();
                rect2.top = rect.top - v();
                i3 = rect.right - this.f5030d.getPaddingRight();
                rect2.right = i3;
                return rect2;
            }
            rect2.top = i2;
            i3 = J(rect.right, g2);
            rect2.right = i3;
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int s(Rect rect, Rect rect2, float f2) {
        return S() ? (int) (((float) rect2.top) + f2) : rect.bottom - this.f5030d.getCompoundPaddingBottom();
    }

    private boolean s0() {
        int max;
        if (this.f5030d == null || this.f5030d.getMeasuredHeight() >= (max = Math.max(this.f5028c.getMeasuredHeight(), this.f5026b.getMeasuredHeight()))) {
            return false;
        }
        this.f5030d.setMinimumHeight(max);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.f5030d == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f5030d = editText;
            int i2 = this.f5034f;
            if (i2 != -1) {
                setMinEms(i2);
            } else {
                setMinWidth(this.f5038h);
            }
            int i3 = this.f5036g;
            if (i3 != -1) {
                setMaxEms(i3);
            } else {
                setMaxWidth(this.f5040i);
            }
            this.f5009I = false;
            V();
            setTextInputAccessibilityDelegate(new d(this));
            this.f5067v0.i0(this.f5030d.getTypeface());
            this.f5067v0.a0(this.f5030d.getTextSize());
            int i4 = Build.VERSION.SDK_INT;
            this.f5067v0.X(this.f5030d.getLetterSpacing());
            int gravity = this.f5030d.getGravity();
            this.f5067v0.S((gravity & -113) | 48);
            this.f5067v0.Z(gravity);
            this.f5063t0 = W.D(editText);
            this.f5030d.addTextChangedListener(new a(editText));
            if (this.f5041i0 == null) {
                this.f5041i0 = this.f5030d.getHintTextColors();
            }
            if (this.f5003C) {
                if (TextUtils.isEmpty(this.f5004D)) {
                    CharSequence hint = this.f5030d.getHint();
                    this.f5032e = hint;
                    setHint(hint);
                    this.f5030d.setHint((CharSequence) null);
                }
                this.f5005E = true;
            }
            if (i4 >= 29) {
                n0();
            }
            if (this.f5052o != null) {
                k0(this.f5030d.getText());
            }
            p0();
            this.f5042j.f();
            this.f5026b.bringToFront();
            this.f5028c.bringToFront();
            C();
            this.f5028c.x0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            v0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f5004D)) {
            this.f5004D = charSequence;
            this.f5067v0.g0(charSequence);
            if (!this.f5065u0) {
                W();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f5060s != z2) {
            if (z2) {
                j();
            } else {
                a0();
                this.f5062t = null;
            }
            this.f5060s = z2;
        }
    }

    private int t(Rect rect, float f2) {
        return S() ? (int) (((float) rect.centerY()) - (f2 / 2.0f)) : rect.top + this.f5030d.getCompoundPaddingTop();
    }

    private void t0() {
        if (this.f5015O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5024a.getLayoutParams();
            int v2 = v();
            if (v2 != layoutParams.topMargin) {
                layoutParams.topMargin = v2;
                this.f5024a.requestLayout();
            }
        }
    }

    private Rect u(Rect rect) {
        if (this.f5030d != null) {
            Rect rect2 = this.f5023W;
            float w2 = this.f5067v0.w();
            rect2.left = rect.left + this.f5030d.getCompoundPaddingLeft();
            rect2.top = t(rect, w2);
            rect2.right = rect.right - this.f5030d.getCompoundPaddingRight();
            rect2.bottom = s(rect, rect2, w2);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int v() {
        float q2;
        if (!this.f5003C) {
            return 0;
        }
        int i2 = this.f5015O;
        if (i2 == 0) {
            q2 = this.f5067v0.q();
        } else if (i2 != 2) {
            return 0;
        } else {
            q2 = this.f5067v0.q() / 2.0f;
        }
        return (int) q2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void v0(boolean r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            android.widget.EditText r1 = r5.f5030d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0016
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            android.widget.EditText r4 = r5.f5030d
            if (r4 == 0) goto L_0x0022
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L_0x0022
            r2 = 1
        L_0x0022:
            android.content.res.ColorStateList r3 = r5.f5041i0
            if (r3 == 0) goto L_0x002b
            com.google.android.material.internal.a r4 = r5.f5067v0
            r4.M(r3)
        L_0x002b:
            if (r0 != 0) goto L_0x004b
            android.content.res.ColorStateList r0 = r5.f5041i0
            if (r0 == 0) goto L_0x003f
            r3 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r3 = new int[]{r3}
            int r4 = r5.f5061s0
            int r0 = r0.getColorForState(r3, r4)
            goto L_0x0041
        L_0x003f:
            int r0 = r5.f5061s0
        L_0x0041:
            com.google.android.material.internal.a r3 = r5.f5067v0
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L_0x0047:
            r3.M(r0)
            goto L_0x0077
        L_0x004b:
            boolean r0 = r5.d0()
            if (r0 == 0) goto L_0x005d
            com.google.android.material.internal.a r0 = r5.f5067v0
            com.google.android.material.textfield.v r3 = r5.f5042j
            android.content.res.ColorStateList r3 = r3.r()
            r0.M(r3)
            goto L_0x0077
        L_0x005d:
            boolean r0 = r5.f5048m
            if (r0 == 0) goto L_0x006c
            android.widget.TextView r0 = r5.f5052o
            if (r0 == 0) goto L_0x006c
            com.google.android.material.internal.a r3 = r5.f5067v0
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto L_0x0047
        L_0x006c:
            if (r2 == 0) goto L_0x0077
            android.content.res.ColorStateList r0 = r5.f5043j0
            if (r0 == 0) goto L_0x0077
            com.google.android.material.internal.a r3 = r5.f5067v0
            r3.R(r0)
        L_0x0077:
            if (r1 != 0) goto L_0x0090
            boolean r0 = r5.f5069w0
            if (r0 == 0) goto L_0x0090
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L_0x0086
            if (r2 == 0) goto L_0x0086
            goto L_0x0090
        L_0x0086:
            if (r7 != 0) goto L_0x008c
            boolean r7 = r5.f5065u0
            if (r7 != 0) goto L_0x0099
        L_0x008c:
            r5.F(r6)
            goto L_0x0099
        L_0x0090:
            if (r7 != 0) goto L_0x0096
            boolean r7 = r5.f5065u0
            if (r7 == 0) goto L_0x0099
        L_0x0096:
            r5.z(r6)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.v0(boolean, boolean):void");
    }

    private boolean w() {
        return this.f5015O == 2 && x();
    }

    private void w0() {
        EditText editText;
        if (this.f5062t != null && (editText = this.f5030d) != null) {
            this.f5062t.setGravity(editText.getGravity());
            this.f5062t.setPadding(this.f5030d.getCompoundPaddingLeft(), this.f5030d.getCompoundPaddingTop(), this.f5030d.getCompoundPaddingRight(), this.f5030d.getCompoundPaddingBottom());
        }
    }

    private boolean x() {
        return this.f5017Q > -1 && this.f5020T != 0;
    }

    private void x0() {
        EditText editText = this.f5030d;
        y0(editText == null ? null : editText.getText());
    }

    private void y() {
        if (B()) {
            ((C0227h) this.f5006F).i0();
        }
    }

    /* access modifiers changed from: private */
    public void y0(Editable editable) {
        if (this.f5050n.a(editable) != 0 || this.f5065u0) {
            L();
        } else {
            g0();
        }
    }

    private void z(boolean z2) {
        ValueAnimator valueAnimator = this.f5073y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f5073y0.cancel();
        }
        if (!z2 || !this.f5071x0) {
            this.f5067v0.c0(1.0f);
        } else {
            l(1.0f);
        }
        this.f5065u0 = false;
        if (B()) {
            W();
        }
        x0();
        this.f5026b.l(false);
        this.f5028c.H(false);
    }

    private void z0(boolean z2, boolean z3) {
        int defaultColor = this.f5051n0.getDefaultColor();
        int colorForState = this.f5051n0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f5051n0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.f5020T = colorForState2;
        } else if (z3) {
            this.f5020T = colorForState;
        } else {
            this.f5020T = defaultColor;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r5.f5030d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0() {
        /*
            r5 = this;
            k0.g r0 = r5.f5006F
            if (r0 == 0) goto L_0x00be
            int r0 = r5.f5015O
            if (r0 != 0) goto L_0x000a
            goto L_0x00be
        L_0x000a:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r5.f5030d
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L_0x0030
            android.widget.EditText r3 = r5.f5030d
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            boolean r3 = r5.isEnabled()
            if (r3 != 0) goto L_0x003c
            int r3 = r5.f5061s0
        L_0x0039:
            r5.f5020T = r3
            goto L_0x006e
        L_0x003c:
            boolean r3 = r5.d0()
            if (r3 == 0) goto L_0x004f
            android.content.res.ColorStateList r3 = r5.f5051n0
            if (r3 == 0) goto L_0x004a
        L_0x0046:
            r5.z0(r0, r1)
            goto L_0x006e
        L_0x004a:
            int r3 = r5.getErrorCurrentTextColors()
            goto L_0x0039
        L_0x004f:
            boolean r3 = r5.f5048m
            if (r3 == 0) goto L_0x0061
            android.widget.TextView r3 = r5.f5052o
            if (r3 == 0) goto L_0x0061
            android.content.res.ColorStateList r4 = r5.f5051n0
            if (r4 == 0) goto L_0x005c
            goto L_0x0046
        L_0x005c:
            int r3 = r3.getCurrentTextColor()
            goto L_0x0039
        L_0x0061:
            if (r0 == 0) goto L_0x0066
            int r3 = r5.f5049m0
            goto L_0x0039
        L_0x0066:
            if (r1 == 0) goto L_0x006b
            int r3 = r5.f5047l0
            goto L_0x0039
        L_0x006b:
            int r3 = r5.f5045k0
            goto L_0x0039
        L_0x006e:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L_0x0077
            r5.n0()
        L_0x0077:
            com.google.android.material.textfield.s r3 = r5.f5028c
            r3.I()
            r5.Z()
            int r3 = r5.f5015O
            r4 = 2
            if (r3 != r4) goto L_0x009d
            int r3 = r5.f5017Q
            if (r0 == 0) goto L_0x0093
            boolean r4 = r5.isEnabled()
            if (r4 == 0) goto L_0x0093
            int r4 = r5.f5019S
        L_0x0090:
            r5.f5017Q = r4
            goto L_0x0096
        L_0x0093:
            int r4 = r5.f5018R
            goto L_0x0090
        L_0x0096:
            int r4 = r5.f5017Q
            if (r4 == r3) goto L_0x009d
            r5.X()
        L_0x009d:
            int r3 = r5.f5015O
            if (r3 != r2) goto L_0x00bb
            boolean r2 = r5.isEnabled()
            if (r2 != 0) goto L_0x00ac
            int r0 = r5.f5055p0
        L_0x00a9:
            r5.f5021U = r0
            goto L_0x00bb
        L_0x00ac:
            if (r1 == 0) goto L_0x00b3
            if (r0 != 0) goto L_0x00b3
            int r0 = r5.f5059r0
            goto L_0x00a9
        L_0x00b3:
            if (r0 == 0) goto L_0x00b8
            int r0 = r5.f5057q0
            goto L_0x00a9
        L_0x00b8:
            int r0 = r5.f5053o0
            goto L_0x00a9
        L_0x00bb:
            r5.m()
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0():void");
    }

    public boolean M() {
        return this.f5028c.F();
    }

    public boolean N() {
        return this.f5042j.A();
    }

    public boolean O() {
        return this.f5042j.B();
    }

    /* access modifiers changed from: package-private */
    public final boolean P() {
        return this.f5065u0;
    }

    public boolean R() {
        return this.f5005E;
    }

    public void Z() {
        this.f5026b.m();
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f5024a.addView(view, layoutParams2);
            this.f5024a.setLayoutParams(layoutParams);
            t0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void c0(TextView textView, int i2) {
        try {
            j.o(textView, i2);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        j.o(textView, i.TextAppearance_AppCompat_Caption);
        textView.setTextColor(androidx.core.content.a.a(getContext(), T.b.design_error));
    }

    /* access modifiers changed from: package-private */
    public boolean d0() {
        return this.f5042j.l();
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f5030d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f5032e != null) {
            boolean z2 = this.f5005E;
            this.f5005E = false;
            CharSequence hint = editText.getHint();
            this.f5030d.setHint(this.f5032e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
            } finally {
                this.f5030d.setHint(hint);
                this.f5005E = z2;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i2);
            onProvideAutofillVirtualStructure(viewStructure, i2);
            viewStructure.setChildCount(this.f5024a.getChildCount());
            for (int i3 = 0; i3 < this.f5024a.getChildCount(); i3++) {
                View childAt = this.f5024a.getChildAt(i3);
                ViewStructure a2 = viewStructure.newChild(i3);
                childAt.dispatchProvideAutofillStructure(a2, i2);
                if (childAt == this.f5030d) {
                    a2.setHint(getHint());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f5000A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f5000A0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f5075z0) {
            boolean z2 = true;
            this.f5075z0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C0214a aVar = this.f5067v0;
            boolean f02 = aVar != null ? aVar.f0(drawableState) : false;
            if (this.f5030d != null) {
                if (!W.U(this) || !isEnabled()) {
                    z2 = false;
                }
                u0(z2);
            }
            p0();
            A0();
            if (f02) {
                invalidate();
            }
            this.f5075z0 = false;
        }
    }

    public int getBaseline() {
        EditText editText = this.f5030d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public k0.g getBoxBackground() {
        int i2 = this.f5015O;
        if (i2 == 1 || i2 == 2) {
            return this.f5006F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f5021U;
    }

    public int getBoxBackgroundMode() {
        return this.f5015O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f5016P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (B.g(this) ? this.f5012L.j() : this.f5012L.l()).a(this.f5025a0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (B.g(this) ? this.f5012L.l() : this.f5012L.j()).a(this.f5025a0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (B.g(this) ? this.f5012L.r() : this.f5012L.t()).a(this.f5025a0);
    }

    public float getBoxCornerRadiusTopStart() {
        return (B.g(this) ? this.f5012L.t() : this.f5012L.r()).a(this.f5025a0);
    }

    public int getBoxStrokeColor() {
        return this.f5049m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f5051n0;
    }

    public int getBoxStrokeWidth() {
        return this.f5018R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f5019S;
    }

    public int getCounterMaxLength() {
        return this.f5046l;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f5044k || !this.f5048m || (textView = this.f5052o) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f5074z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f5072y;
    }

    public ColorStateList getCursorColor() {
        return this.f4999A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f5001B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f5041i0;
    }

    public EditText getEditText() {
        return this.f5030d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f5028c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f5028c.n();
    }

    public int getEndIconMinSize() {
        return this.f5028c.o();
    }

    public int getEndIconMode() {
        return this.f5028c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f5028c.q();
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f5028c.r();
    }

    public CharSequence getError() {
        if (this.f5042j.A()) {
            return this.f5042j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f5042j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f5042j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f5042j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f5028c.s();
    }

    public CharSequence getHelperText() {
        if (this.f5042j.B()) {
            return this.f5042j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f5042j.u();
    }

    public CharSequence getHint() {
        if (this.f5003C) {
            return this.f5004D;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f5067v0.q();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f5067v0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f5043j0;
    }

    public e getLengthCounter() {
        return this.f5050n;
    }

    public int getMaxEms() {
        return this.f5036g;
    }

    public int getMaxWidth() {
        return this.f5040i;
    }

    public int getMinEms() {
        return this.f5034f;
    }

    public int getMinWidth() {
        return this.f5038h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f5028c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f5028c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f5060s) {
            return this.f5058r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f5066v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f5064u;
    }

    public CharSequence getPrefixText() {
        return this.f5026b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f5026b.b();
    }

    public TextView getPrefixTextView() {
        return this.f5026b.d();
    }

    public k getShapeAppearanceModel() {
        return this.f5012L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f5026b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f5026b.f();
    }

    public int getStartIconMinSize() {
        return this.f5026b.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f5026b.h();
    }

    public CharSequence getSuffixText() {
        return this.f5028c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f5028c.x();
    }

    public TextView getSuffixTextView() {
        return this.f5028c.z();
    }

    public Typeface getTypeface() {
        return this.f5027b0;
    }

    public void i(f fVar) {
        this.f5033e0.add(fVar);
        if (this.f5030d != null) {
            fVar.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void k0(Editable editable) {
        int a2 = this.f5050n.a(editable);
        boolean z2 = this.f5048m;
        int i2 = this.f5046l;
        if (i2 == -1) {
            this.f5052o.setText(String.valueOf(a2));
            this.f5052o.setContentDescription((CharSequence) null);
            this.f5048m = false;
        } else {
            this.f5048m = a2 > i2;
            l0(getContext(), this.f5052o, a2, this.f5046l, this.f5048m);
            if (z2 != this.f5048m) {
                m0();
            }
            this.f5052o.setText(androidx.core.text.a.c().j(getContext().getString(T.h.character_counter_pattern, new Object[]{Integer.valueOf(a2), Integer.valueOf(this.f5046l)})));
        }
        if (this.f5030d != null && z2 != this.f5048m) {
            u0(false);
            A0();
            p0();
        }
    }

    /* access modifiers changed from: package-private */
    public void l(float f2) {
        if (this.f5067v0.x() != f2) {
            if (this.f5073y0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f5073y0 = valueAnimator;
                valueAnimator.setInterpolator(h.g(getContext(), T.a.motionEasingEmphasizedInterpolator, U.a.f256b));
                this.f5073y0.setDuration((long) h.f(getContext(), T.a.motionDurationMedium4, 167));
                this.f5073y0.addUpdateListener(new c());
            }
            this.f5073y0.setFloatValues(new float[]{this.f5067v0.x(), f2});
            this.f5073y0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f5030d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.f0()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x0049
            com.google.android.material.textfield.A r0 = r10.f5026b
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f5030d
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f5029c0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f5031d0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f5029c0 = r6
            r10.f5031d0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f5030d
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.j.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f5029c0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f5030d
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.j.i(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f5029c0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f5030d
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.j.a(r0)
            android.widget.EditText r6 = r10.f5030d
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.j.i(r6, r2, r7, r8, r0)
            r10.f5029c0 = r2
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            boolean r6 = r10.e0()
            if (r6 == 0) goto L_0x00d5
            com.google.android.material.textfield.s r2 = r10.f5028c
            android.widget.TextView r2 = r2.z()
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f5030d
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.textfield.s r6 = r10.f5028c
            com.google.android.material.internal.CheckableImageButton r6 = r6.k()
            if (r6 == 0) goto L_0x0092
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.C0162v.b(r6)
            int r2 = r2 + r6
        L_0x0092:
            android.widget.EditText r6 = r10.f5030d
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.j.a(r6)
            android.graphics.drawable.Drawable r7 = r10.f5035f0
            if (r7 == 0) goto L_0x00b3
            int r8 = r10.f5037g0
            if (r8 == r2) goto L_0x00b3
            r10.f5037g0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f5030d
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.f5035f0
            r4 = r6[r4]
        L_0x00af:
            androidx.core.widget.j.i(r0, r1, r2, r3, r4)
            goto L_0x00d3
        L_0x00b3:
            if (r7 != 0) goto L_0x00c1
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f5035f0 = r7
            r10.f5037g0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00c1:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.f5035f0
            if (r2 == r3) goto L_0x00d2
            r10.f5039h0 = r2
            android.widget.EditText r0 = r10.f5030d
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            goto L_0x00af
        L_0x00d2:
            r5 = r0
        L_0x00d3:
            r0 = r5
            goto L_0x00f7
        L_0x00d5:
            android.graphics.drawable.Drawable r6 = r10.f5035f0
            if (r6 == 0) goto L_0x00f7
            android.widget.EditText r6 = r10.f5030d
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.j.a(r6)
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.f5035f0
            if (r3 != r7) goto L_0x00f3
            android.widget.EditText r0 = r10.f5030d
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f5039h0
            r4 = r6[r4]
            androidx.core.widget.j.i(r0, r1, r3, r7, r4)
            goto L_0x00f4
        L_0x00f3:
            r5 = r0
        L_0x00f4:
            r10.f5035f0 = r2
            goto L_0x00d3
        L_0x00f7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.o0():boolean");
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5067v0.H(configuration);
    }

    public void onGlobalLayout() {
        this.f5028c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f5002B0 = false;
        boolean s02 = s0();
        boolean o02 = o0();
        if (s02 || o02) {
            this.f5030d.post(new L(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.f5030d;
        if (editText != null) {
            Rect rect = this.f5022V;
            C0216c.a(this, editText, rect);
            i0(rect);
            if (this.f5003C) {
                this.f5067v0.a0(this.f5030d.getTextSize());
                int gravity = this.f5030d.getGravity();
                this.f5067v0.S((gravity & -113) | 48);
                this.f5067v0.Z(gravity);
                this.f5067v0.O(r(rect));
                this.f5067v0.W(u(rect));
                this.f5067v0.J();
                if (B() && !this.f5065u0) {
                    W();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.f5002B0) {
            this.f5028c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f5002B0 = true;
        }
        w0();
        this.f5028c.x0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.c());
        setError(gVar.f5082c);
        if (gVar.f5083d) {
            post(new b());
        }
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != this.f5013M) {
            float a2 = this.f5012L.r().a(this.f5025a0);
            float a3 = this.f5012L.t().a(this.f5025a0);
            float a4 = this.f5012L.j().a(this.f5025a0);
            float a5 = this.f5012L.l().a(this.f5025a0);
            k0.d q2 = this.f5012L.q();
            k0.d s2 = this.f5012L.s();
            k m2 = k.a().z(s2).D(q2).r(this.f5012L.k()).v(this.f5012L.i()).A(a3).E(a2).s(a5).w(a4).m();
            this.f5013M = z2;
            setShapeAppearanceModel(m2);
        }
    }

    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        if (d0()) {
            gVar.f5082c = getError();
        }
        gVar.f5083d = this.f5028c.E();
        return gVar;
    }

    /* access modifiers changed from: package-private */
    public void p0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f5030d;
        if (editText != null && this.f5015O == 0 && (background = editText.getBackground()) != null) {
            if (N.a(background)) {
                background = background.mutate();
            }
            if (d0()) {
                currentTextColor = getErrorCurrentTextColors();
            } else if (!this.f5048m || (textView = this.f5052o) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.f5030d.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(C0106k.e(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    /* access modifiers changed from: package-private */
    public void r0() {
        EditText editText = this.f5030d;
        if (editText != null && this.f5006F != null) {
            if ((this.f5009I || editText.getBackground() == null) && this.f5015O != 0) {
                q0();
                this.f5009I = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.f5021U != i2) {
            this.f5021U = i2;
            this.f5053o0 = i2;
            this.f5057q0 = i2;
            this.f5059r0 = i2;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(androidx.core.content.a.a(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f5053o0 = defaultColor;
        this.f5021U = defaultColor;
        this.f5055p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f5057q0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f5059r0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.f5015O) {
            this.f5015O = i2;
            if (this.f5030d != null) {
                V();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.f5016P = i2;
    }

    public void setBoxCornerFamily(int i2) {
        this.f5012L = this.f5012L.v().y(i2, this.f5012L.r()).C(i2, this.f5012L.t()).q(i2, this.f5012L.j()).u(i2, this.f5012L.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.f5049m0 != i2) {
            this.f5049m0 = i2;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f5045k0 = colorStateList.getDefaultColor();
            this.f5061s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f5047l0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f5049m0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            A0();
        }
        this.f5049m0 = defaultColor;
        A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f5051n0 != colorStateList) {
            this.f5051n0 = colorStateList;
            A0();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.f5018R = i2;
        A0();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.f5019S = i2;
        A0();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f5044k != z2) {
            if (z2) {
                F f2 = new F(getContext());
                this.f5052o = f2;
                f2.setId(T.e.textinput_counter);
                Typeface typeface = this.f5027b0;
                if (typeface != null) {
                    this.f5052o.setTypeface(typeface);
                }
                this.f5052o.setMaxLines(1);
                this.f5042j.e(this.f5052o, 2);
                C0162v.d((ViewGroup.MarginLayoutParams) this.f5052o.getLayoutParams(), getResources().getDimensionPixelOffset(T.c.mtrl_textinput_counter_margin_start));
                m0();
                j0();
            } else {
                this.f5042j.C(this.f5052o, 2);
                this.f5052o = null;
            }
            this.f5044k = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f5046l != i2) {
            if (i2 <= 0) {
                i2 = -1;
            }
            this.f5046l = i2;
            if (this.f5044k) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f5054p != i2) {
            this.f5054p = i2;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f5074z != colorStateList) {
            this.f5074z = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f5056q != i2) {
            this.f5056q = i2;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f5072y != colorStateList) {
            this.f5072y = colorStateList;
            m0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f4999A != colorStateList) {
            this.f4999A = colorStateList;
            n0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f5001B != colorStateList) {
            this.f5001B = colorStateList;
            if (Q()) {
                n0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f5041i0 = colorStateList;
        this.f5043j0 = colorStateList;
        if (this.f5030d != null) {
            u0(false);
        }
    }

    public void setEnabled(boolean z2) {
        Y(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f5028c.N(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f5028c.O(z2);
    }

    public void setEndIconContentDescription(int i2) {
        this.f5028c.P(i2);
    }

    public void setEndIconDrawable(int i2) {
        this.f5028c.R(i2);
    }

    public void setEndIconMinSize(int i2) {
        this.f5028c.T(i2);
    }

    public void setEndIconMode(int i2) {
        this.f5028c.U(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5028c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5028c.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f5028c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f5028c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f5028c.Z(mode);
    }

    public void setEndIconVisible(boolean z2) {
        this.f5028c.a0(z2);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f5042j.A()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f5042j.Q(charSequence);
        } else {
            this.f5042j.w();
        }
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        this.f5042j.E(i2);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f5042j.F(charSequence);
    }

    public void setErrorEnabled(boolean z2) {
        this.f5042j.G(z2);
    }

    public void setErrorIconDrawable(int i2) {
        this.f5028c.b0(i2);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5028c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5028c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f5028c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f5028c.g0(mode);
    }

    public void setErrorTextAppearance(int i2) {
        this.f5042j.H(i2);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f5042j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f5069w0 != z2) {
            this.f5069w0 = z2;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f5042j.R(charSequence);
        } else if (O()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f5042j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        this.f5042j.K(z2);
    }

    public void setHelperTextTextAppearance(int i2) {
        this.f5042j.J(i2);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f5071x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f5003C) {
            this.f5003C = z2;
            if (!z2) {
                this.f5005E = false;
                if (!TextUtils.isEmpty(this.f5004D) && TextUtils.isEmpty(this.f5030d.getHint())) {
                    this.f5030d.setHint(this.f5004D);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f5030d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f5004D)) {
                        setHint(hint);
                    }
                    this.f5030d.setHint((CharSequence) null);
                }
                this.f5005E = true;
            }
            if (this.f5030d != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        this.f5067v0.P(i2);
        this.f5043j0 = this.f5067v0.p();
        if (this.f5030d != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f5043j0 != colorStateList) {
            if (this.f5041i0 == null) {
                this.f5067v0.R(colorStateList);
            }
            this.f5043j0 = colorStateList;
            if (this.f5030d != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f5050n = eVar;
    }

    public void setMaxEms(int i2) {
        this.f5036g = i2;
        EditText editText = this.f5030d;
        if (editText != null && i2 != -1) {
            editText.setMaxEms(i2);
        }
    }

    public void setMaxWidth(int i2) {
        this.f5040i = i2;
        EditText editText = this.f5030d;
        if (editText != null && i2 != -1) {
            editText.setMaxWidth(i2);
        }
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f5034f = i2;
        EditText editText = this.f5030d;
        if (editText != null && i2 != -1) {
            editText.setMinEms(i2);
        }
    }

    public void setMinWidth(int i2) {
        this.f5038h = i2;
        EditText editText = this.f5030d;
        if (editText != null && i2 != -1) {
            editText.setMinWidth(i2);
        }
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        this.f5028c.i0(i2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        this.f5028c.k0(i2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        this.f5028c.m0(z2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f5028c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f5028c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f5062t == null) {
            F f2 = new F(getContext());
            this.f5062t = f2;
            f2.setId(T.e.textinput_placeholder);
            W.y0(this.f5062t, 2);
            C0196c A2 = A();
            this.f5068w = A2;
            A2.c0(67);
            this.f5070x = A();
            setPlaceholderTextAppearance(this.f5066v);
            setPlaceholderTextColor(this.f5064u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f5060s) {
                setPlaceholderTextEnabled(true);
            }
            this.f5058r = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f5066v = i2;
        TextView textView = this.f5062t;
        if (textView != null) {
            j.o(textView, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f5064u != colorStateList) {
            this.f5064u = colorStateList;
            TextView textView = this.f5062t;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f5026b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i2) {
        this.f5026b.o(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f5026b.p(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        k0.g gVar = this.f5006F;
        if (gVar != null && gVar.A() != kVar) {
            this.f5012L = kVar;
            m();
        }
    }

    public void setStartIconCheckable(boolean z2) {
        this.f5026b.q(z2);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? C0236a.b(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        this.f5026b.t(i2);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5026b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5026b.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f5026b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f5026b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f5026b.y(mode);
    }

    public void setStartIconVisible(boolean z2) {
        this.f5026b.z(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f5028c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i2) {
        this.f5028c.q0(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f5028c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f5030d;
        if (editText != null) {
            W.q0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f5027b0) {
            this.f5027b0 = typeface;
            this.f5067v0.i0(typeface);
            this.f5042j.N(typeface);
            TextView textView = this.f5052o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u0(boolean z2) {
        v0(z2, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r7 = r23
            r8 = r24
            int r9 = f4998C0
            r1 = r22
            android.content.Context r1 = n0.a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f5034f = r10
            r0.f5036g = r10
            r0.f5038h = r10
            r0.f5040i = r10
            com.google.android.material.textfield.v r1 = new com.google.android.material.textfield.v
            r1.<init>(r0)
            r0.f5042j = r1
            com.google.android.material.textfield.K r1 = new com.google.android.material.textfield.K
            r1.<init>()
            r0.f5050n = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f5022V = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f5023W = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f5025a0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f5033e0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f5067v0 = r1
            r11 = 0
            r0.f5002B0 = r11
            android.content.Context r12 = r21.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.f5024a = r14
            r14.setAddStatesFromChildren(r13)
            android.animation.TimeInterpolator r2 = U.a.f255a
            r1.h0(r2)
            r1.e0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.S(r2)
            int[] r3 = T.j.V5
            int r15 = T.j.s6
            int r6 = T.j.q6
            int r5 = T.j.K6
            int r4 = T.j.P6
            int r2 = T.j.T6
            int[] r16 = new int[]{r15, r6, r5, r4, r2}
            r1 = r12
            r17 = r2
            r2 = r23
            r18 = r4
            r4 = r24
            r19 = r5
            r5 = r9
            r20 = r6
            r6 = r16
            androidx.appcompat.widget.e0 r1 = com.google.android.material.internal.y.j(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.A r2 = new com.google.android.material.textfield.A
            r2.<init>(r0, r1)
            r0.f5026b = r2
            int r3 = T.j.S6
            boolean r3 = r1.a(r3, r13)
            r0.f5003C = r3
            int r3 = T.j.a6
            java.lang.CharSequence r3 = r1.p(r3)
            r0.setHint((java.lang.CharSequence) r3)
            int r3 = T.j.R6
            boolean r3 = r1.a(r3, r13)
            r0.f5071x0 = r3
            int r3 = T.j.M6
            boolean r3 = r1.a(r3, r13)
            r0.f5069w0 = r3
            int r3 = T.j.c6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00d0
            int r3 = r1.k(r3, r10)
            r0.setMinEms(r3)
            goto L_0x00df
        L_0x00d0:
            int r3 = T.j.Z5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00df
            int r3 = r1.f(r3, r10)
            r0.setMinWidth(r3)
        L_0x00df:
            int r3 = T.j.b6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00ef
            int r3 = r1.k(r3, r10)
            r0.setMaxEms(r3)
            goto L_0x00fe
        L_0x00ef:
            int r3 = T.j.Y5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00fe
            int r3 = r1.f(r3, r10)
            r0.setMaxWidth(r3)
        L_0x00fe:
            k0.k$b r3 = k0.k.e(r12, r7, r8, r9)
            k0.k r3 = r3.m()
            r0.f5012L = r3
            android.content.res.Resources r3 = r12.getResources()
            int r4 = T.c.mtrl_textinput_box_label_cutout_padding
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.f5014N = r3
            int r3 = T.j.f6
            int r3 = r1.e(r3, r11)
            r0.f5016P = r3
            int r3 = T.j.m6
            android.content.res.Resources r4 = r12.getResources()
            int r5 = T.c.mtrl_textinput_box_stroke_width_default
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.f5018R = r3
            int r3 = T.j.n6
            android.content.res.Resources r4 = r12.getResources()
            int r5 = T.c.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.f5019S = r3
            int r3 = r0.f5018R
            r0.f5017Q = r3
            int r3 = T.j.j6
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.d(r3, r4)
            int r5 = T.j.i6
            float r5 = r1.d(r5, r4)
            int r6 = T.j.g6
            float r6 = r1.d(r6, r4)
            int r7 = T.j.h6
            float r4 = r1.d(r7, r4)
            k0.k r7 = r0.f5012L
            k0.k$b r7 = r7.v()
            r8 = 0
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x016c
            r7.A(r3)
        L_0x016c:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0173
            r7.E(r5)
        L_0x0173:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x017a
            r7.w(r6)
        L_0x017a:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0181
            r7.s(r4)
        L_0x0181:
            k0.k r3 = r7.m()
            r0.f5012L = r3
            int r3 = T.j.d6
            android.content.res.ColorStateList r3 = h0.c.b(r12, r1, r3)
            if (r3 == 0) goto L_0x01e5
            int r4 = r3.getDefaultColor()
            r0.f5053o0 = r4
            r0.f5021U = r4
            boolean r4 = r3.isStateful()
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x01c8
            int[] r4 = new int[]{r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f5055p0 = r4
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r6 = 16842910(0x101009e, float:2.3694E-38)
            int[] r4 = new int[]{r4, r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f5057q0 = r4
            int[] r4 = new int[]{r5, r6}
            int r3 = r3.getColorForState(r4, r10)
        L_0x01c5:
            r0.f5059r0 = r3
            goto L_0x01ef
        L_0x01c8:
            int r3 = r0.f5053o0
            r0.f5057q0 = r3
            int r3 = T.b.mtrl_filled_background_color
            android.content.res.ColorStateList r3 = f.C0236a.a(r12, r3)
            int[] r4 = new int[]{r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f5055p0 = r4
            int[] r4 = new int[]{r5}
            int r3 = r3.getColorForState(r4, r10)
            goto L_0x01c5
        L_0x01e5:
            r0.f5021U = r11
            r0.f5053o0 = r11
            r0.f5055p0 = r11
            r0.f5057q0 = r11
            r0.f5059r0 = r11
        L_0x01ef:
            int r3 = T.j.X5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x01ff
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.f5043j0 = r3
            r0.f5041i0 = r3
        L_0x01ff:
            int r3 = T.j.k6
            android.content.res.ColorStateList r4 = h0.c.b(r12, r1, r3)
            int r3 = r1.b(r3, r11)
            r0.f5049m0 = r3
            int r3 = T.b.mtrl_textinput_default_box_stroke_color
            int r3 = androidx.core.content.a.a(r12, r3)
            r0.f5045k0 = r3
            int r3 = T.b.mtrl_textinput_disabled_color
            int r3 = androidx.core.content.a.a(r12, r3)
            r0.f5061s0 = r3
            int r3 = T.b.mtrl_textinput_hovered_box_stroke_color
            int r3 = androidx.core.content.a.a(r12, r3)
            r0.f5047l0 = r3
            if (r4 == 0) goto L_0x0228
            r0.setBoxStrokeColorStateList(r4)
        L_0x0228:
            int r3 = T.j.l6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x0237
            android.content.res.ColorStateList r3 = h0.c.b(r12, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x0237:
            r3 = r17
            int r4 = r1.n(r3, r10)
            if (r4 == r10) goto L_0x0246
            int r3 = r1.n(r3, r11)
            r0.setHintTextAppearance(r3)
        L_0x0246:
            int r3 = T.j.u6
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.f4999A = r3
            int r3 = T.j.v6
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.f5001B = r3
            r3 = r19
            int r3 = r1.n(r3, r11)
            int r4 = T.j.F6
            java.lang.CharSequence r4 = r1.p(r4)
            int r5 = T.j.E6
            int r5 = r1.k(r5, r13)
            int r6 = T.j.G6
            boolean r6 = r1.a(r6, r11)
            r7 = r18
            int r7 = r1.n(r7, r11)
            int r8 = T.j.O6
            boolean r8 = r1.a(r8, r11)
            int r9 = T.j.N6
            java.lang.CharSequence r9 = r1.p(r9)
            int r12 = T.j.b7
            int r12 = r1.n(r12, r11)
            int r13 = T.j.a7
            java.lang.CharSequence r13 = r1.p(r13)
            int r10 = T.j.o6
            boolean r10 = r1.a(r10, r11)
            int r11 = T.j.p6
            r23 = r9
            r9 = -1
            int r9 = r1.k(r11, r9)
            r0.setCounterMaxLength(r9)
            r9 = 0
            int r11 = r1.n(r15, r9)
            r0.f5056q = r11
            r11 = r20
            int r11 = r1.n(r11, r9)
            r0.f5054p = r11
            int r11 = T.j.e6
            int r9 = r1.k(r11, r9)
            r0.setBoxBackgroundMode(r9)
            r0.setErrorContentDescription(r4)
            r0.setErrorAccessibilityLiveRegion(r5)
            int r4 = r0.f5054p
            r0.setCounterOverflowTextAppearance(r4)
            r0.setHelperTextTextAppearance(r7)
            r0.setErrorTextAppearance(r3)
            int r3 = r0.f5056q
            r0.setCounterTextAppearance(r3)
            r0.setPlaceholderText(r13)
            r0.setPlaceholderTextAppearance(r12)
            int r3 = T.j.L6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x02e1
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setErrorTextColor(r3)
        L_0x02e1:
            int r3 = T.j.Q6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x02f0
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHelperTextColor(r3)
        L_0x02f0:
            int r3 = T.j.U6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x02ff
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHintTextColor(r3)
        L_0x02ff:
            int r3 = T.j.t6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x030e
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterTextColor(r3)
        L_0x030e:
            int r3 = T.j.r6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x031d
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x031d:
            int r3 = T.j.c7
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x032c
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setPlaceholderTextColor(r3)
        L_0x032c:
            com.google.android.material.textfield.s r3 = new com.google.android.material.textfield.s
            r3.<init>(r0, r1)
            r0.f5028c = r3
            int r4 = T.j.W5
            r5 = 1
            boolean r4 = r1.a(r4, r5)
            r1.x()
            r1 = 2
            androidx.core.view.W.y0(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r1 < r7) goto L_0x034a
            androidx.core.view.W.A0(r0, r5)
        L_0x034a:
            r14.addView(r2)
            r14.addView(r3)
            r0.addView(r14)
            r0.setEnabled(r4)
            r0.setHelperTextEnabled(r8)
            r0.setErrorEnabled(r6)
            r0.setCounterEnabled(r10)
            r1 = r23
            r0.setHelperText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f5028c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f5028c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f5028c.c0(drawable);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f5003C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f5028c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f5028c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f5026b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f5026b.s(drawable);
    }
}
