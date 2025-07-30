package g;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import g.C0238b;

/* renamed from: g.e  reason: case insensitive filesystem */
public abstract class C0241e extends C0238b {

    /* renamed from: m  reason: collision with root package name */
    private a f5472m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5473n;

    /* renamed from: g.e$a */
    static class a extends C0238b.d {

        /* renamed from: J  reason: collision with root package name */
        int[][] f5474J;

        a(a aVar, C0241e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.f5474J = aVar.f5474J;
            } else {
                this.f5474J = new int[f()][];
            }
        }

        /* access modifiers changed from: package-private */
        public int A(int[] iArr) {
            int[][] iArr2 = this.f5474J;
            int h2 = h();
            for (int i2 = 0; i2 < h2; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        public void o(int i2, int i3) {
            super.o(i2, i3);
            int[][] iArr = new int[i3][];
            System.arraycopy(this.f5474J, 0, iArr, 0, i2);
            this.f5474J = iArr;
        }

        /* access modifiers changed from: package-private */
        public abstract void r();

        /* access modifiers changed from: package-private */
        public int z(int[] iArr, Drawable drawable) {
            int a2 = a(drawable);
            this.f5474J[a2] = iArr;
            return a2;
        }
    }

    C0241e(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    public void h(C0238b.d dVar) {
        super.h(dVar);
        if (dVar instanceof a) {
            this.f5472m = (a) dVar;
        }
    }

    /* access modifiers changed from: package-private */
    public int[] j(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i2 = 0;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i3);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i4 = i2 + 1;
                if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i2] = attributeNameResource;
                i2 = i4;
            }
        }
        return StateSet.trimStateSet(iArr, i2);
    }

    public Drawable mutate() {
        if (!this.f5473n && super.mutate() == this) {
            this.f5472m.r();
            this.f5473n = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract boolean onStateChange(int[] iArr);
}
