package m;

import java.util.Arrays;
import java.util.Comparator;
import m.C0257b;

public class h extends C0257b {

    /* renamed from: g  reason: collision with root package name */
    private int f5858g = 128;

    /* renamed from: h  reason: collision with root package name */
    private i[] f5859h = new i[128];

    /* renamed from: i  reason: collision with root package name */
    private i[] f5860i = new i[128];

    /* renamed from: j  reason: collision with root package name */
    private int f5861j = 0;

    /* renamed from: k  reason: collision with root package name */
    b f5862k = new b(this);

    /* renamed from: l  reason: collision with root package name */
    C0258c f5863l;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f5871c - iVar2.f5871c;
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        i f5865a;

        /* renamed from: b  reason: collision with root package name */
        h f5866b;

        public b(h hVar) {
            this.f5866b = hVar;
        }

        public boolean a(i iVar, float f2) {
            boolean z2 = true;
            if (this.f5865a.f5869a) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr = this.f5865a.f5877i;
                    float f3 = fArr[i2] + (iVar.f5877i[i2] * f2);
                    fArr[i2] = f3;
                    if (Math.abs(f3) < 1.0E-4f) {
                        this.f5865a.f5877i[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    h.this.G(this.f5865a);
                }
                return false;
            }
            for (int i3 = 0; i3 < 9; i3++) {
                float f4 = iVar.f5877i[i3];
                if (f4 != 0.0f) {
                    float f5 = f4 * f2;
                    if (Math.abs(f5) < 1.0E-4f) {
                        f5 = 0.0f;
                    }
                    this.f5865a.f5877i[i3] = f5;
                } else {
                    this.f5865a.f5877i[i3] = 0.0f;
                }
            }
            return true;
        }

        public void b(i iVar) {
            this.f5865a = iVar;
        }

        public final boolean c() {
            for (int i2 = 8; i2 >= 0; i2--) {
                float f2 = this.f5865a.f5877i[i2];
                if (f2 > 0.0f) {
                    return false;
                }
                if (f2 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i2 = 8;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                float f2 = iVar.f5877i[i2];
                float f3 = this.f5865a.f5877i[i2];
                if (f3 == f2) {
                    i2--;
                } else if (f3 < f2) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f5865a.f5877i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f5865a != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    str = str + this.f5865a.f5877i[i2] + " ";
                }
            }
            return str + "] " + this.f5865a;
        }
    }

    public h(C0258c cVar) {
        super(cVar);
        this.f5863l = cVar;
    }

    private final void F(i iVar) {
        int i2;
        int i3 = this.f5861j + 1;
        i[] iVarArr = this.f5859h;
        if (i3 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f5859h = iVarArr2;
            this.f5860i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f5859h;
        int i4 = this.f5861j;
        iVarArr3[i4] = iVar;
        int i5 = i4 + 1;
        this.f5861j = i5;
        if (i5 > 1 && iVarArr3[i4].f5871c > iVar.f5871c) {
            int i6 = 0;
            while (true) {
                i2 = this.f5861j;
                if (i6 >= i2) {
                    break;
                }
                this.f5860i[i6] = this.f5859h[i6];
                i6++;
            }
            Arrays.sort(this.f5860i, 0, i2, new a());
            for (int i7 = 0; i7 < this.f5861j; i7++) {
                this.f5859h[i7] = this.f5860i[i7];
            }
        }
        iVar.f5869a = true;
        iVar.a(this);
    }

    /* access modifiers changed from: private */
    public final void G(i iVar) {
        int i2 = 0;
        while (i2 < this.f5861j) {
            if (this.f5859h[i2] == iVar) {
                while (true) {
                    int i3 = this.f5861j;
                    if (i2 < i3 - 1) {
                        i[] iVarArr = this.f5859h;
                        int i4 = i2 + 1;
                        iVarArr[i2] = iVarArr[i4];
                        i2 = i4;
                    } else {
                        this.f5861j = i3 - 1;
                        iVar.f5869a = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    public void B(C0259d dVar, C0257b bVar, boolean z2) {
        i iVar = bVar.f5820a;
        if (iVar != null) {
            C0257b.a aVar = bVar.f5824e;
            int k2 = aVar.k();
            for (int i2 = 0; i2 < k2; i2++) {
                i e2 = aVar.e(i2);
                float a2 = aVar.a(i2);
                this.f5862k.b(e2);
                if (this.f5862k.a(iVar, a2)) {
                    F(e2);
                }
                this.f5821b += bVar.f5821b * a2;
            }
            G(iVar);
        }
    }

    public void a(i iVar) {
        this.f5862k.b(iVar);
        this.f5862k.e();
        iVar.f5877i[iVar.f5873e] = 1.0f;
        F(iVar);
    }

    public i b(C0259d dVar, boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f5861j; i3++) {
            i iVar = this.f5859h[i3];
            if (!zArr[iVar.f5871c]) {
                this.f5862k.b(iVar);
                b bVar = this.f5862k;
                if (i2 == -1) {
                    if (!bVar.c()) {
                    }
                } else if (!bVar.d(this.f5859h[i2])) {
                }
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f5859h[i2];
    }

    public void clear() {
        this.f5861j = 0;
        this.f5821b = 0.0f;
    }

    public boolean isEmpty() {
        if (this.f5861j == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f5821b + ") : ";
        for (int i2 = 0; i2 < this.f5861j; i2++) {
            this.f5862k.b(this.f5859h[i2]);
            str = str + this.f5862k + " ";
        }
        return str;
    }
}
