package g0;

import T.i;
import a0.C0087a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0116v;
import androidx.core.widget.c;

public class a extends C0116v {

    /* renamed from: g  reason: collision with root package name */
    private static final int f5475g = i.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: h  reason: collision with root package name */
    private static final int[][] f5476h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e  reason: collision with root package name */
    private ColorStateList f5477e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5478f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, T.a.f166I);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5477e == null) {
            int d2 = C0087a.d(this, T.a.f170e);
            int d3 = C0087a.d(this, T.a.colorOnSurface);
            int d4 = C0087a.d(this, T.a.colorSurface);
            int[][] iArr = f5476h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C0087a.k(d4, d2, 1.0f);
            iArr2[1] = C0087a.k(d4, d3, 0.54f);
            iArr2[2] = C0087a.k(d4, d3, 0.38f);
            iArr2[3] = C0087a.k(d4, d3, 0.38f);
            this.f5477e = new ColorStateList(iArr, iArr2);
        }
        return this.f5477e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5478f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        ColorStateList colorStateList;
        this.f5478f = z2;
        if (z2) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        c.d(this, colorStateList);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f5475g
            android.content.Context r8 = n0.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = T.j.k3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.y.i(r0, r1, r2, r3, r4, r5)
            int r10 = T.j.l3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = h0.c.a(r8, r9, r10)
            androidx.core.widget.c.d(r7, r8)
        L_0x0028:
            int r8 = T.j.m3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f5478f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
