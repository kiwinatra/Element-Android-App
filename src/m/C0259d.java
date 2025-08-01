package m;

import java.util.Arrays;
import java.util.HashMap;
import m.i;
import p.d;
import p.e;


public class C0259d {

    
    public static boolean f5830r = false;

    
    public static boolean f5831s = true;

    
    public static boolean f5832t = true;

    
    public static boolean f5833u = true;

    
    public static boolean f5834v = false;

    
    private static int f5835w = 1000;

    
    public static long f5836x;

    
    public static long f5837y;

    
    public boolean f5838a;

    
    int f5839b;

    
    private HashMap f5840c;

    
    private a f5841d;

    
    private int f5842e;

    
    private int f5843f;

    
    C0257b[] f5844g;

    
    public boolean f5845h;

    
    public boolean f5846i;

    
    private boolean[] f5847j;

    
    int f5848k;

    
    int f5849l;

    
    private int f5850m;

    
    final C0258c f5851n;

    
    private i[] f5852o;

    
    private int f5853p;

    
    private a f5854q;

    
    interface a {
        void a(i iVar);

        i b(C0259d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    
    class b extends C0257b {
        public b(C0258c cVar) {
            this.f5824e = new j(this, cVar);
        }
    }

    public C0259d() {
        a bVar;
        this.f5838a = false;
        this.f5839b = 0;
        this.f5840c = null;
        this.f5842e = 32;
        this.f5843f = 32;
        this.f5844g = null;
        this.f5845h = false;
        this.f5846i = false;
        this.f5847j = new boolean[32];
        this.f5848k = 1;
        this.f5849l = 0;
        this.f5850m = 32;
        this.f5852o = new i[f5835w];
        this.f5853p = 0;
        this.f5844g = new C0257b[32];
        C();
        C0258c cVar = new C0258c();
        this.f5851n = cVar;
        this.f5841d = new h(cVar);
        if (f5834v) {
            bVar = new b(cVar);
        } else {
            bVar = new C0257b(cVar);
        }
        this.f5854q = bVar;
    }

    private final int B(a aVar, boolean z2) {
        for (int i2 = 0; i2 < this.f5848k; i2++) {
            this.f5847j[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            i3++;
            if (i3 >= this.f5848k * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.f5847j[aVar.getKey().f5871c] = true;
            }
            i b2 = aVar.b(this, this.f5847j);
            if (b2 != null) {
                boolean[] zArr = this.f5847j;
                int i4 = b2.f5871c;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (b2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f5849l; i6++) {
                    C0257b bVar = this.f5844g[i6];
                    if (bVar.f5820a.f5878j != i.a.UNRESTRICTED && !bVar.f5825f && bVar.t(b2)) {
                        float g2 = bVar.f5824e.g(b2);
                        if (g2 < 0.0f) {
                            float f3 = (-bVar.f5821b) / g2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    C0257b bVar2 = this.f5844g[i5];
                    bVar2.f5820a.f5872d = -1;
                    bVar2.x(b2);
                    i iVar = bVar2.f5820a;
                    iVar.f5872d = i5;
                    iVar.h(this, bVar2);
                }
            } else {
                z3 = true;
            }
        }
        return i3;
    }

    private void C() {
        int i2 = 0;
        if (f5834v) {
            while (i2 < this.f5849l) {
                C0257b bVar = this.f5844g[i2];
                if (bVar != null) {
                    this.f5851n.f5826a.a(bVar);
                }
                this.f5844g[i2] = null;
                i2++;
            }
            return;
        }
        while (i2 < this.f5849l) {
            C0257b bVar2 = this.f5844g[i2];
            if (bVar2 != null) {
                this.f5851n.f5827b.a(bVar2);
            }
            this.f5844g[i2] = null;
            i2++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f5851n.f5828c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
        } else {
            iVar.e();
        }
        iVar.g(aVar, str);
        int i2 = this.f5853p;
        int i3 = f5835w;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f5835w = i4;
            this.f5852o = (i[]) Arrays.copyOf(this.f5852o, i4);
        }
        i[] iVarArr = this.f5852o;
        int i5 = this.f5853p;
        this.f5853p = i5 + 1;
        iVarArr[i5] = iVar;
        return iVar;
    }

    private final void l(C0257b bVar) {
        C0261f fVar;
        int i2;
        if (!f5832t || !bVar.f5825f) {
            C0257b[] bVarArr = this.f5844g;
            int i3 = this.f5849l;
            bVarArr[i3] = bVar;
            i iVar = bVar.f5820a;
            iVar.f5872d = i3;
            this.f5849l = i3 + 1;
            iVar.h(this, bVar);
        } else {
            bVar.f5820a.f(this, bVar.f5821b);
        }
        if (f5832t && this.f5838a) {
            int i4 = 0;
            while (i4 < this.f5849l) {
                if (this.f5844g[i4] == null) {
                    System.out.println("WTF");
                }
                C0257b bVar2 = this.f5844g[i4];
                if (bVar2 != null && bVar2.f5825f) {
                    bVar2.f5820a.f(this, bVar2.f5821b);
                    if (f5834v) {
                        fVar = this.f5851n.f5826a;
                    } else {
                        fVar = this.f5851n.f5827b;
                    }
                    fVar.a(bVar2);
                    this.f5844g[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f5849l;
                        if (i5 >= i2) {
                            break;
                        }
                        C0257b[] bVarArr2 = this.f5844g;
                        int i7 = i5 - 1;
                        C0257b bVar3 = bVarArr2[i5];
                        bVarArr2[i7] = bVar3;
                        i iVar2 = bVar3.f5820a;
                        if (iVar2.f5872d == i5) {
                            iVar2.f5872d = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f5844g[i6] = null;
                    }
                    this.f5849l = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f5838a = false;
        }
    }

    private void n() {
        for (int i2 = 0; i2 < this.f5849l; i2++) {
            C0257b bVar = this.f5844g[i2];
            bVar.f5820a.f5874f = bVar.f5821b;
        }
    }

    public static C0257b s(C0259d dVar, i iVar, i iVar2, float f2) {
        return dVar.r().j(iVar, iVar2, f2);
    }

    private int u(a aVar) {
        for (int i2 = 0; i2 < this.f5849l; i2++) {
            C0257b bVar = this.f5844g[i2];
            if (bVar.f5820a.f5878j != i.a.UNRESTRICTED && bVar.f5821b < 0.0f) {
                boolean z2 = false;
                int i3 = 0;
                while (!z2) {
                    i3++;
                    float f2 = Float.MAX_VALUE;
                    int i4 = 0;
                    int i5 = -1;
                    int i6 = -1;
                    int i7 = 0;
                    while (true) {
                        if (i4 >= this.f5849l) {
                            break;
                        }
                        C0257b bVar2 = this.f5844g[i4];
                        if (bVar2.f5820a.f5878j != i.a.UNRESTRICTED && !bVar2.f5825f && bVar2.f5821b < 0.0f) {
                            int i8 = 9;
                            if (f5833u) {
                                int k2 = bVar2.f5824e.k();
                                int i9 = 0;
                                while (i9 < k2) {
                                    i e2 = bVar2.f5824e.e(i9);
                                    float g2 = bVar2.f5824e.g(e2);
                                    if (g2 > 0.0f) {
                                        int i10 = 0;
                                        while (i10 < i8) {
                                            float f3 = e2.f5876h[i10] / g2;
                                            if ((f3 < f2 && i10 == i7) || i10 > i7) {
                                                i7 = i10;
                                                i6 = e2.f5871c;
                                                i5 = i4;
                                                f2 = f3;
                                            }
                                            i10++;
                                            i8 = 9;
                                        }
                                    }
                                    i9++;
                                    i8 = 9;
                                }
                            } else {
                                for (int i11 = 1; i11 < this.f5848k; i11++) {
                                    i iVar = this.f5851n.f5829d[i11];
                                    float g3 = bVar2.f5824e.g(iVar);
                                    if (g3 > 0.0f) {
                                        for (int i12 = 0; i12 < 9; i12++) {
                                            float f4 = iVar.f5876h[i12] / g3;
                                            if ((f4 < f2 && i12 == i7) || i12 > i7) {
                                                i5 = i4;
                                                i6 = i11;
                                                i7 = i12;
                                                f2 = f4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4++;
                    }
                    if (i5 != -1) {
                        C0257b bVar3 = this.f5844g[i5];
                        bVar3.f5820a.f5872d = -1;
                        bVar3.x(this.f5851n.f5829d[i6]);
                        i iVar2 = bVar3.f5820a;
                        iVar2.f5872d = i5;
                        iVar2.h(this, bVar3);
                    } else {
                        z2 = true;
                    }
                    if (i3 > this.f5848k / 2) {
                        z2 = true;
                    }
                }
                return i3;
            }
        }
        return 0;
    }

    public static C0260e w() {
        return null;
    }

    private void y() {
        int i2 = this.f5842e * 2;
        this.f5842e = i2;
        this.f5844g = (C0257b[]) Arrays.copyOf(this.f5844g, i2);
        C0258c cVar = this.f5851n;
        cVar.f5829d = (i[]) Arrays.copyOf(cVar.f5829d, this.f5842e);
        int i3 = this.f5842e;
        this.f5847j = new boolean[i3];
        this.f5843f = i3;
        this.f5850m = i3;
    }

    
    public void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        C0258c cVar;
        a bVar;
        int i2 = 0;
        while (true) {
            cVar = this.f5851n;
            i[] iVarArr = cVar.f5829d;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.e();
            }
            i2++;
        }
        cVar.f5828c.c(this.f5852o, this.f5853p);
        this.f5853p = 0;
        Arrays.fill(this.f5851n.f5829d, (Object) null);
        HashMap hashMap = this.f5840c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f5839b = 0;
        this.f5841d.clear();
        this.f5848k = 1;
        for (int i3 = 0; i3 < this.f5849l; i3++) {
            C0257b bVar2 = this.f5844g[i3];
            if (bVar2 != null) {
                bVar2.f5822c = false;
            }
        }
        C();
        this.f5849l = 0;
        if (f5834v) {
            bVar = new b(this.f5851n);
        } else {
            bVar = new C0257b(this.f5851n);
        }
        this.f5854q = bVar;
    }

    public void b(e eVar, e eVar2, float f2, int i2) {
        e eVar3 = eVar;
        e eVar4 = eVar2;
        d.b bVar = d.b.LEFT;
        i q2 = q(eVar3.o(bVar));
        d.b bVar2 = d.b.TOP;
        i q3 = q(eVar3.o(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q4 = q(eVar3.o(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q5 = q(eVar3.o(bVar4));
        i q6 = q(eVar4.o(bVar));
        i q7 = q(eVar4.o(bVar2));
        i q8 = q(eVar4.o(bVar3));
        i q9 = q(eVar4.o(bVar4));
        C0257b r2 = r();
        double d2 = (double) f2;
        i iVar = q8;
        double d3 = (double) i2;
        r2.q(q3, q5, q7, q9, (float) (Math.sin(d2) * d3));
        d(r2);
        C0257b r3 = r();
        r3.q(q2, q4, q6, iVar, (float) (Math.cos(d2) * d3));
        d(r3);
    }

    public void c(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        int i5 = i4;
        C0257b r2 = r();
        r2.h(iVar, iVar2, i2, f2, iVar3, iVar4, i3);
        if (i5 != 8) {
            r2.d(this, i5);
        }
        d(r2);
    }

    
    
    
    public void d(m.C0257b r6) {
        
        throw new UnsupportedOperationException("Method not decompiled: m.C0259d.d(m.b):void");
    }

    public C0257b e(i iVar, i iVar2, int i2, int i3) {
        if (!f5831s || i3 != 8 || !iVar2.f5875g || iVar.f5872d != -1) {
            C0257b r2 = r();
            r2.n(iVar, iVar2, i2);
            if (i3 != 8) {
                r2.d(this, i3);
            }
            d(r2);
            return r2;
        }
        iVar.f(this, iVar2.f5874f + ((float) i2));
        return null;
    }

    public void f(i iVar, int i2) {
        C0257b bVar;
        if (!f5831s || iVar.f5872d != -1) {
            int i3 = iVar.f5872d;
            if (i3 != -1) {
                C0257b bVar2 = this.f5844g[i3];
                if (!bVar2.f5825f) {
                    if (bVar2.f5824e.k() == 0) {
                        bVar2.f5825f = true;
                    } else {
                        bVar = r();
                        bVar.m(iVar, i2);
                    }
                }
                bVar2.f5821b = (float) i2;
                return;
            }
            bVar = r();
            bVar.i(iVar, i2);
            d(bVar);
            return;
        }
        float f2 = (float) i2;
        iVar.f(this, f2);
        for (int i4 = 0; i4 < this.f5839b + 1; i4++) {
            i iVar2 = this.f5851n.f5829d[i4];
            if (iVar2 != null && iVar2.f5882n && iVar2.f5883o == iVar.f5871c) {
                iVar2.f(this, iVar2.f5884p + f2);
            }
        }
    }

    public void g(i iVar, i iVar2, int i2, boolean z2) {
        C0257b r2 = r();
        i t2 = t();
        t2.f5873e = 0;
        r2.o(iVar, iVar2, t2, i2);
        d(r2);
    }

    public void h(i iVar, i iVar2, int i2, int i3) {
        C0257b r2 = r();
        i t2 = t();
        t2.f5873e = 0;
        r2.o(iVar, iVar2, t2, i2);
        if (i3 != 8) {
            m(r2, (int) (r2.f5824e.g(t2) * -1.0f), i3);
        }
        d(r2);
    }

    public void i(i iVar, i iVar2, int i2, boolean z2) {
        C0257b r2 = r();
        i t2 = t();
        t2.f5873e = 0;
        r2.p(iVar, iVar2, t2, i2);
        d(r2);
    }

    public void j(i iVar, i iVar2, int i2, int i3) {
        C0257b r2 = r();
        i t2 = t();
        t2.f5873e = 0;
        r2.p(iVar, iVar2, t2, i2);
        if (i3 != 8) {
            m(r2, (int) (r2.f5824e.g(t2) * -1.0f), i3);
        }
        d(r2);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i2) {
        C0257b r2 = r();
        r2.k(iVar, iVar2, iVar3, iVar4, f2);
        if (i2 != 8) {
            r2.d(this, i2);
        }
        d(r2);
    }

    
    public void m(C0257b bVar, int i2, int i3) {
        bVar.e(o(i3, (String) null), i2);
    }

    public i o(int i2, String str) {
        if (this.f5848k + 1 >= this.f5843f) {
            y();
        }
        i a2 = a(i.a.ERROR, str);
        int i3 = this.f5839b + 1;
        this.f5839b = i3;
        this.f5848k++;
        a2.f5871c = i3;
        a2.f5873e = i2;
        this.f5851n.f5829d[i3] = a2;
        this.f5841d.a(a2);
        return a2;
    }

    public i p() {
        if (this.f5848k + 1 >= this.f5843f) {
            y();
        }
        i a2 = a(i.a.SLACK, (String) null);
        int i2 = this.f5839b + 1;
        this.f5839b = i2;
        this.f5848k++;
        a2.f5871c = i2;
        this.f5851n.f5829d[i2] = a2;
        return a2;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f5848k + 1 >= this.f5843f) {
            y();
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            iVar = dVar.i();
            if (iVar == null) {
                dVar.s(this.f5851n);
                iVar = dVar.i();
            }
            int i2 = iVar.f5871c;
            if (i2 == -1 || i2 > this.f5839b || this.f5851n.f5829d[i2] == null) {
                if (i2 != -1) {
                    iVar.e();
                }
                int i3 = this.f5839b + 1;
                this.f5839b = i3;
                this.f5848k++;
                iVar.f5871c = i3;
                iVar.f5878j = i.a.UNRESTRICTED;
                this.f5851n.f5829d[i3] = iVar;
            }
        }
        return iVar;
    }

    public C0257b r() {
        C0257b bVar;
        if (f5834v) {
            bVar = (C0257b) this.f5851n.f5826a.b();
            if (bVar == null) {
                bVar = new b(this.f5851n);
                f5837y++;
                i.c();
                return bVar;
            }
        } else {
            bVar = (C0257b) this.f5851n.f5827b.b();
            if (bVar == null) {
                bVar = new C0257b(this.f5851n);
                f5836x++;
                i.c();
                return bVar;
            }
        }
        bVar.y();
        i.c();
        return bVar;
    }

    public i t() {
        if (this.f5848k + 1 >= this.f5843f) {
            y();
        }
        i a2 = a(i.a.SLACK, (String) null);
        int i2 = this.f5839b + 1;
        this.f5839b = i2;
        this.f5848k++;
        a2.f5871c = i2;
        this.f5851n.f5829d[i2] = a2;
        return a2;
    }

    public C0258c v() {
        return this.f5851n;
    }

    public int x(Object obj) {
        i i2 = ((d) obj).i();
        if (i2 != null) {
            return (int) (i2.f5874f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f5841d.isEmpty()) {
            n();
            return;
        }
        if (this.f5845h || this.f5846i) {
            int i2 = 0;
            while (i2 < this.f5849l) {
                if (this.f5844g[i2].f5825f) {
                    i2++;
                }
            }
            n();
            return;
        }
        A(this.f5841d);
    }
}
