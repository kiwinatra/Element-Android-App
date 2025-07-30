package com.google.android.material.button;

import T.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0101f;
import androidx.core.view.W;
import androidx.core.widget.j;
import f.C0236a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k0.h;
import k0.k;
import k0.n;

public class MaterialButton extends C0101f implements Checkable, n {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f4365r = {16842911};

    /* renamed from: s  reason: collision with root package name */
    private static final int[] f4366s = {16842912};

    /* renamed from: t  reason: collision with root package name */
    private static final int f4367t = i.Widget_MaterialComponents_Button;

    /* renamed from: d  reason: collision with root package name */
    private final a f4368d;

    /* renamed from: e  reason: collision with root package name */
    private final LinkedHashSet f4369e;

    /* renamed from: f  reason: collision with root package name */
    private a f4370f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f4371g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f4372h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f4373i;

    /* renamed from: j  reason: collision with root package name */
    private String f4374j;

    /* renamed from: k  reason: collision with root package name */
    private int f4375k;

    /* renamed from: l  reason: collision with root package name */
    private int f4376l;

    /* renamed from: m  reason: collision with root package name */
    private int f4377m;

    /* renamed from: n  reason: collision with root package name */
    private int f4378n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f4379o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f4380p;

    /* renamed from: q  reason: collision with root package name */
    private int f4381q;

    interface a {
        void a(MaterialButton materialButton, boolean z2);
    }

    static class b extends C.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f4382c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i2) {
                return new b[i2];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            d(parcel);
        }

        private void d(Parcel parcel) {
            boolean z2 = true;
            if (parcel.readInt() != 1) {
                z2 = false;
            }
            this.f4382c = z2;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f4382c ? 1 : 0);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, T.a.materialButtonStyle);
    }

    private boolean b() {
        int i2 = this.f4381q;
        return i2 == 3 || i2 == 4;
    }

    private boolean c() {
        int i2 = this.f4381q;
        return i2 == 1 || i2 == 2;
    }

    private boolean d() {
        int i2 = this.f4381q;
        return i2 == 16 || i2 == 32;
    }

    private boolean e() {
        return W.C(this) == 1;
    }

    private boolean f() {
        a aVar = this.f4368d;
        return aVar != null && !aVar.o();
    }

    private void g() {
        if (c()) {
            j.i(this, this.f4373i, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (b()) {
            j.i(this, (Drawable) null, (Drawable) null, this.f4373i, (Drawable) null);
        } else if (d()) {
            j.i(this, (Drawable) null, this.f4373i, (Drawable) null, (Drawable) null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil((double) f2);
    }

    private void h(boolean z2) {
        Drawable drawable = this.f4373i;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f4373i = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f4372h);
            PorterDuff.Mode mode = this.f4371g;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.f4373i, mode);
            }
            int i2 = this.f4375k;
            if (i2 == 0) {
                i2 = this.f4373i.getIntrinsicWidth();
            }
            int i3 = this.f4375k;
            if (i3 == 0) {
                i3 = this.f4373i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f4373i;
            int i4 = this.f4376l;
            int i5 = this.f4377m;
            drawable2.setBounds(i4, i5, i2 + i4, i3 + i5);
            this.f4373i.setVisible(true, z2);
        }
        if (z2) {
            g();
            return;
        }
        Drawable[] a2 = j.a(this);
        Drawable drawable3 = a2[0];
        Drawable drawable4 = a2[1];
        Drawable drawable5 = a2[2];
        if ((c() && drawable3 != this.f4373i) || ((b() && drawable5 != this.f4373i) || (d() && drawable4 != this.f4373i))) {
            g();
        }
    }

    private void i(int i2, int i3) {
        if (this.f4373i != null && getLayout() != null) {
            if (c() || b()) {
                this.f4377m = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i4 = this.f4381q;
                boolean z2 = true;
                if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f4376l = 0;
                } else {
                    int i5 = this.f4375k;
                    if (i5 == 0) {
                        i5 = this.f4373i.getIntrinsicWidth();
                    }
                    int textLayoutWidth = ((((i2 - getTextLayoutWidth()) - W.G(this)) - i5) - this.f4378n) - W.H(this);
                    if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                        textLayoutWidth /= 2;
                    }
                    boolean e2 = e();
                    if (this.f4381q != 4) {
                        z2 = false;
                    }
                    if (e2 != z2) {
                        textLayoutWidth = -textLayoutWidth;
                    }
                    if (this.f4376l != textLayoutWidth) {
                        this.f4376l = textLayoutWidth;
                        h(false);
                        return;
                    }
                    return;
                }
            } else if (d()) {
                this.f4376l = 0;
                if (this.f4381q == 16) {
                    this.f4377m = 0;
                } else {
                    int i6 = this.f4375k;
                    if (i6 == 0) {
                        i6 = this.f4373i.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - i6) - this.f4378n) - getPaddingBottom()) / 2);
                    if (this.f4377m != max) {
                        this.f4377m = max;
                        h(false);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            h(false);
        }
    }

    public boolean a() {
        a aVar = this.f4368d;
        return aVar != null && aVar.p();
    }

    /* access modifiers changed from: package-private */
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f4374j)) {
            return this.f4374j;
        }
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f4368d.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f4373i;
    }

    public int getIconGravity() {
        return this.f4381q;
    }

    public int getIconPadding() {
        return this.f4378n;
    }

    public int getIconSize() {
        return this.f4375k;
    }

    public ColorStateList getIconTint() {
        return this.f4372h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f4371g;
    }

    public int getInsetBottom() {
        return this.f4368d.c();
    }

    public int getInsetTop() {
        return this.f4368d.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f4368d.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f4368d.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f4368d.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f4368d.k();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f4368d.l() : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f4368d.m() : super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f4379o;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f4368d.f());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f4365r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f4366s);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        a aVar;
        super.onLayout(z2, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f4368d) != null) {
            aVar.J(i5 - i3, i4 - i2);
        }
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.c());
        setChecked(bVar.f4382c);
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4382c = this.f4379o;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        if (this.f4368d.q()) {
            toggle();
        }
        return super.performClick();
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f4373i != null) {
            if (this.f4373i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setA11yClassName(String str) {
        this.f4374j = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (f()) {
            this.f4368d.s(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (f()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f4368d.t();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? C0236a.b(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (f()) {
            this.f4368d.u(z2);
        }
    }

    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f4379o != z2) {
            this.f4379o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f4379o);
            }
            if (!this.f4380p) {
                this.f4380p = true;
                Iterator it = this.f4369e.iterator();
                if (!it.hasNext()) {
                    this.f4380p = false;
                } else {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
        }
    }

    public void setCornerRadius(int i2) {
        if (f()) {
            this.f4368d.v(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (f()) {
            this.f4368d.f().S(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f4373i != drawable) {
            this.f4373i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f4381q != i2) {
            this.f4381q = i2;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f4378n != i2) {
            this.f4378n = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? C0236a.b(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f4375k != i2) {
            this.f4375k = i2;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f4372h != colorStateList) {
            this.f4372h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f4371g != mode) {
            this.f4371g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(C0236a.a(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        this.f4368d.w(i2);
    }

    public void setInsetTop(int i2) {
        this.f4368d.x(i2);
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f4370f = aVar;
    }

    public void setPressed(boolean z2) {
        a aVar = this.f4370f;
        if (aVar != null) {
            aVar.a(this, z2);
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f4368d.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (f()) {
            setRippleColor(C0236a.a(getContext(), i2));
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        if (f()) {
            this.f4368d.z(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (f()) {
            this.f4368d.A(z2);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f4368d.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (f()) {
            setStrokeColor(C0236a.a(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (f()) {
            this.f4368d.C(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f4368d.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f4368d.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f4368d.F(z2);
    }

    public void toggle() {
        setChecked(!this.f4379o);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f4367t
            android.content.Context r9 = n0.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f4369e = r9
            r9 = 0
            r8.f4379o = r9
            r8.f4380p = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = T.j.b2
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.y.i(r0, r1, r2, r3, r4, r5)
            int r1 = T.j.o2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f4378n = r1
            int r1 = T.j.r2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.B.i(r1, r2)
            r8.f4371g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = T.j.q2
            android.content.res.ColorStateList r1 = h0.c.a(r1, r0, r2)
            r8.f4372h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = T.j.m2
            android.graphics.drawable.Drawable r1 = h0.c.d(r1, r0, r2)
            r8.f4373i = r1
            int r1 = T.j.n2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f4381q = r1
            int r1 = T.j.p2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f4375k = r1
            k0.k$b r10 = k0.k.e(r7, r10, r11, r6)
            k0.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f4368d = r11
            r11.r(r0)
            r0.recycle()
            int r10 = r8.f4378n
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f4373i
            if (r10 == 0) goto L_0x0084
            r9 = 1
        L_0x0084:
            r8.h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
