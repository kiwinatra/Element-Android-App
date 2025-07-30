package com.google.android.material.textfield;

import T.c;
import T.i;
import T.j;
import a0.C0087a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0099d;
import androidx.appcompat.widget.T;
import androidx.core.view.W;
import com.google.android.material.internal.C0219f;
import com.google.android.material.internal.y;
import java.util.List;
import k0.g;

public class w extends C0099d {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final T f5193e;

    /* renamed from: f  reason: collision with root package name */
    private final AccessibilityManager f5194f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f5195g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5196h;

    /* renamed from: i  reason: collision with root package name */
    private final float f5197i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f5198j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f5199k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f5200l;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
            w wVar = w.this;
            w.this.l(i2 < 0 ? wVar.f5193e.v() : wVar.getAdapter().getItem(i2));
            AdapterView.OnItemClickListener onItemClickListener = w.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i2 < 0) {
                    view = w.this.f5193e.y();
                    i2 = w.this.f5193e.x();
                    j2 = w.this.f5193e.w();
                }
                onItemClickListener.onItemClick(w.this.f5193e.k(), view, i2, j2);
            }
            w.this.f5193e.dismiss();
        }
    }

    private class b extends ArrayAdapter {

        /* renamed from: a  reason: collision with root package name */
        private ColorStateList f5202a;

        /* renamed from: b  reason: collision with root package name */
        private ColorStateList f5203b;

        b(Context context, int i2, String[] strArr) {
            super(context, i2, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {16843623, -16842919};
            int[] iArr2 = {16842913, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{C0087a.j(w.this.f5199k, w.this.f5200l.getColorForState(iArr2, 0)), C0087a.j(w.this.f5199k, w.this.f5200l.getColorForState(iArr, 0)), w.this.f5199k});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(w.this.f5199k);
            if (this.f5203b == null) {
                return colorDrawable;
            }
            androidx.core.graphics.drawable.a.o(colorDrawable, this.f5202a);
            return new RippleDrawable(this.f5203b, colorDrawable, (Drawable) null);
        }

        private boolean c() {
            return w.this.f5199k != 0;
        }

        private boolean d() {
            return w.this.f5200l != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{w.this.f5200l.getColorForState(iArr, 0), 0});
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f5203b = e();
            this.f5202a = a();
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i2, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                W.u0(textView, w.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, T.a.f168a);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        return i() || h();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f5194f;
        if (!(accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = this.f5194f.getEnabledAccessibilityServiceList(16)) == null)) {
            for (AccessibilityServiceInfo next : enabledAccessibilityServiceList) {
                if (next.getSettingsActivityName() != null && next.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f5194f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f2 = f();
        int i2 = 0;
        if (adapter == null || f2 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f5193e.x()) + 15);
        View view = null;
        int i3 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = adapter.getView(max, view, f2);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        Drawable i4 = this.f5193e.i();
        if (i4 != null) {
            i4.getPadding(this.f5195g);
            Rect rect = this.f5195g;
            i3 += rect.left + rect.right;
        }
        return i3 + f2.getEndIconView().getMeasuredWidth();
    }

    private void k() {
        TextInputLayout f2 = f();
        if (f2 != null) {
            f2.r0();
        }
    }

    /* access modifiers changed from: private */
    public void l(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    public void dismissDropDown() {
        if (g()) {
            this.f5193e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f5198j;
    }

    public CharSequence getHint() {
        TextInputLayout f2 = f();
        return (f2 == null || !f2.R()) ? super.getHint() : f2.getHint();
    }

    public float getPopupElevation() {
        return this.f5197i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f5199k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f5200l;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f2 = f();
        if (f2 != null && f2.R() && super.getHint() == null && C0219f.b()) {
            setHint("");
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5193e.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onWindowFocusChanged(boolean z2) {
        if (!g()) {
            super.onWindowFocusChanged(z2);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f5193e.o(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        T t2 = this.f5193e;
        if (t2 != null) {
            t2.m(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i2) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i2));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f5198j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g) {
            ((g) dropDownBackground).T(this.f5198j);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f5193e.M(getOnItemSelectedListener());
    }

    public void setRawInputType(int i2) {
        super.setRawInputType(i2);
        k();
    }

    public void setSimpleItemSelectedColor(int i2) {
        this.f5199k = i2;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f5200l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i2) {
        setSimpleItems(getResources().getStringArray(i2));
    }

    public void showDropDown() {
        if (g()) {
            this.f5193e.f();
        } else {
            super.showDropDown();
        }
    }

    public w(Context context, AttributeSet attributeSet, int i2) {
        super(n0.a.c(context, attributeSet, i2, 0), attributeSet, i2);
        this.f5195g = new Rect();
        Context context2 = getContext();
        TypedArray i3 = y.i(context2, attributeSet, j.T1, i2, i.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i4 = j.U1;
        if (i3.hasValue(i4) && i3.getInt(i4, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f5196h = i3.getResourceId(j.X1, T.g.mtrl_auto_complete_simple_item);
        this.f5197i = (float) i3.getDimensionPixelOffset(j.V1, c.mtrl_exposed_dropdown_menu_popup_elevation);
        int i5 = j.W1;
        if (i3.hasValue(i5)) {
            this.f5198j = ColorStateList.valueOf(i3.getColor(i5, 0));
        }
        this.f5199k = i3.getColor(j.Y1, 0);
        this.f5200l = h0.c.a(context2, i3, j.Z1);
        this.f5194f = (AccessibilityManager) context2.getSystemService("accessibility");
        T t2 = new T(context2);
        this.f5193e = t2;
        t2.J(true);
        t2.D(this);
        t2.I(2);
        t2.o(getAdapter());
        t2.L(new a());
        int i6 = j.a2;
        if (i3.hasValue(i6)) {
            setSimpleItems(i3.getResourceId(i6, 0));
        }
        i3.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f5196h, strArr));
    }
}
