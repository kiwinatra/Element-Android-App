package com.google.android.material.button;

import T.i;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.C0121a;
import androidx.core.view.C0162v;
import androidx.core.view.W;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import k0.k;
import y.I;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k  reason: collision with root package name */
    private static final int f4383k = i.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: a  reason: collision with root package name */
    private final List f4384a;

    /* renamed from: b  reason: collision with root package name */
    private final e f4385b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet f4386c;

    /* renamed from: d  reason: collision with root package name */
    private final Comparator f4387d;

    /* renamed from: e  reason: collision with root package name */
    private Integer[] f4388e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4389f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4390g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4391h;

    /* renamed from: i  reason: collision with root package name */
    private final int f4392i;

    /* renamed from: j  reason: collision with root package name */
    private Set f4393j;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends C0121a {
        b() {
        }

        public void g(View view, I i2) {
            super.g(view, i2);
            i2.p0(I.f.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* renamed from: e  reason: collision with root package name */
        private static final k0.c f4396e = new k0.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        k0.c f4397a;

        /* renamed from: b  reason: collision with root package name */
        k0.c f4398b;

        /* renamed from: c  reason: collision with root package name */
        k0.c f4399c;

        /* renamed from: d  reason: collision with root package name */
        k0.c f4400d;

        c(k0.c cVar, k0.c cVar2, k0.c cVar3, k0.c cVar4) {
            this.f4397a = cVar;
            this.f4398b = cVar3;
            this.f4399c = cVar4;
            this.f4400d = cVar2;
        }

        public static c a(c cVar) {
            k0.c cVar2 = f4396e;
            return new c(cVar2, cVar.f4400d, cVar2, cVar.f4399c);
        }

        public static c b(c cVar, View view) {
            return B.g(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            k0.c cVar2 = cVar.f4397a;
            k0.c cVar3 = cVar.f4400d;
            k0.c cVar4 = f4396e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            k0.c cVar2 = f4396e;
            return new c(cVar2, cVar2, cVar.f4398b, cVar.f4399c);
        }

        public static c e(c cVar, View view) {
            return B.g(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            k0.c cVar2 = cVar.f4397a;
            k0.c cVar3 = f4396e;
            return new c(cVar2, cVar3, cVar.f4398b, cVar3);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z2);
    }

    private class e implements MaterialButton.a {
        private e() {
        }

        public void a(MaterialButton materialButton, boolean z2) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, T.a.materialButtonToggleGroupStyle);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
                MaterialButton h2 = h(i2);
                int min = Math.min(h2.getStrokeWidth(), h(i2 - 1).getStrokeWidth());
                LinearLayout.LayoutParams d2 = d(h2);
                if (getOrientation() == 0) {
                    C0162v.c(d2, 0);
                    C0162v.d(d2, -min);
                    d2.topMargin = 0;
                } else {
                    d2.bottomMargin = 0;
                    d2.topMargin = -min;
                    C0162v.d(d2, 0);
                }
                h2.setLayoutParams(d2);
            }
            n(firstVisibleChildIndex);
        }
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i2, boolean z2) {
        if (i2 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f4393j);
        if (z2 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f4390g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else if (!z2 && hashSet.contains(Integer.valueOf(i2))) {
            if (!this.f4391h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        } else {
            return;
        }
        q(hashSet);
    }

    private void g(int i2, boolean z2) {
        Iterator it = this.f4386c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i2, z2);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (k(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && k(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private MaterialButton h(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    /* access modifiers changed from: private */
    public int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == view) {
                return i2;
            }
            if ((getChildAt(i3) instanceof MaterialButton) && k(i3)) {
                i2++;
            }
        }
        return -1;
    }

    private c j(int i2, int i3, int i4) {
        c cVar = (c) this.f4384a.get(i2);
        if (i3 == i4) {
            return cVar;
        }
        boolean z2 = getOrientation() == 0;
        if (i2 == i3) {
            return z2 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i2 == i4) {
            return z2 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private boolean k(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    private void n(int i2) {
        if (getChildCount() != 0 && i2 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i2).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C0162v.c(layoutParams, 0);
            C0162v.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void o(int i2, boolean z2) {
        View findViewById = findViewById(i2);
        if (findViewById instanceof MaterialButton) {
            this.f4389f = true;
            ((MaterialButton) findViewById).setChecked(z2);
            this.f4389f = false;
        }
    }

    private static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f4397a).t(cVar.f4400d).F(cVar.f4398b).x(cVar.f4399c);
        }
    }

    private void q(Set set) {
        Set set2 = this.f4393j;
        this.f4393j = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = h(i2).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.f4387d);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(h(i2), Integer.valueOf(i2));
        }
        this.f4388e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(W.m());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f4385b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void t() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            h(i2).setA11yClassName((this.f4390g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f4384a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        W.q0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f4386c.add(dVar);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f4390g || this.f4393j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f4393j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = h(i2).getId();
            if (this.f4393j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f4388e;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i3;
    }

    public boolean l() {
        return this.f4390g;
    }

    /* access modifiers changed from: package-private */
    public void m(MaterialButton materialButton, boolean z2) {
        if (!this.f4389f) {
            e(materialButton.getId(), z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f4392i;
        if (i2 != -1) {
            q(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        I.O0(accessibilityNodeInfo).o0(I.e.b(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        s();
        c();
        super.onMeasure(i2, i3);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.a) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f4384a.remove(indexOfChild);
        }
        s();
        c();
    }

    /* access modifiers changed from: package-private */
    public void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton h2 = h(i2);
            if (h2.getVisibility() != 8) {
                k.b v2 = h2.getShapeAppearanceModel().v();
                p(v2, j(i2, firstVisibleChildIndex, lastVisibleChildIndex));
                h2.setShapeAppearanceModel(v2.m());
            }
        }
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            h(i2).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.f4391h = z2;
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f4383k
            android.content.Context r7 = n0.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f4384a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f4385b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f4386c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f4387d = r7
            r7 = 0
            r6.f4389f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f4393j = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = T.j.w2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.y.i(r0, r1, r2, r3, r4, r5)
            int r9 = T.j.A2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = T.j.y2
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f4392i = r9
            int r9 = T.j.z2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f4391h = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            int r9 = T.j.x2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setEnabled(r9)
            r8.recycle()
            androidx.core.view.W.y0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(boolean z2) {
        if (this.f4390g != z2) {
            this.f4390g = z2;
            f();
        }
        t();
    }
}
