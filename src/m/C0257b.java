package m;

import java.util.ArrayList;
import m.C0259d;
import m.i;

/* renamed from: m.b  reason: case insensitive filesystem */
public class C0257b implements C0259d.a {

    /* renamed from: a  reason: collision with root package name */
    i f5820a = null;

    /* renamed from: b  reason: collision with root package name */
    float f5821b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f5822c = false;

    /* renamed from: d  reason: collision with root package name */
    ArrayList f5823d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public a f5824e;

    /* renamed from: f  reason: collision with root package name */
    boolean f5825f = false;

    /* renamed from: m.b$a */
    public interface a {
        float a(int i2);

        void b(i iVar, float f2);

        void c(i iVar, float f2, boolean z2);

        void clear();

        boolean d(i iVar);

        i e(int i2);

        void f(float f2);

        float g(i iVar);

        float h(C0257b bVar, boolean z2);

        float i(i iVar, boolean z2);

        void j();

        int k();
    }

    public C0257b() {
    }

    private boolean u(i iVar, C0259d dVar) {
        if (iVar.f5881m <= 1) {
            return true;
        }
        return false;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int k2 = this.f5824e.k();
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < k2; i2++) {
            float a2 = this.f5824e.a(i2);
            if (a2 < 0.0f) {
                i e2 = this.f5824e.e(i2);
                if ((zArr == null || !zArr[e2.f5871c]) && e2 != iVar && (((aVar = e2.f5878j) == i.a.SLACK || aVar == i.a.ERROR) && a2 < f2)) {
                    f2 = a2;
                    iVar2 = e2;
                }
            }
        }
        return iVar2;
    }

    public void A(C0259d dVar, i iVar, boolean z2) {
        if (iVar != null && iVar.f5875g) {
            this.f5821b += iVar.f5874f * this.f5824e.g(iVar);
            this.f5824e.i(iVar, z2);
            if (z2) {
                iVar.d(this);
            }
            if (C0259d.f5832t && this.f5824e.k() == 0) {
                this.f5825f = true;
                dVar.f5838a = true;
            }
        }
    }

    public void B(C0259d dVar, C0257b bVar, boolean z2) {
        this.f5821b += bVar.f5821b * this.f5824e.h(bVar, z2);
        if (z2) {
            bVar.f5820a.d(this);
        }
        if (C0259d.f5832t && this.f5820a != null && this.f5824e.k() == 0) {
            this.f5825f = true;
            dVar.f5838a = true;
        }
    }

    public void C(C0259d dVar, i iVar, boolean z2) {
        if (iVar != null && iVar.f5882n) {
            float g2 = this.f5824e.g(iVar);
            this.f5821b += iVar.f5884p * g2;
            this.f5824e.i(iVar, z2);
            if (z2) {
                iVar.d(this);
            }
            this.f5824e.c(dVar.f5851n.f5829d[iVar.f5883o], g2, z2);
            if (C0259d.f5832t && this.f5824e.k() == 0) {
                this.f5825f = true;
                dVar.f5838a = true;
            }
        }
    }

    public void D(C0259d dVar) {
        if (dVar.f5844g.length != 0) {
            boolean z2 = false;
            while (!z2) {
                int k2 = this.f5824e.k();
                for (int i2 = 0; i2 < k2; i2++) {
                    i e2 = this.f5824e.e(i2);
                    if (e2.f5872d != -1 || e2.f5875g || e2.f5882n) {
                        this.f5823d.add(e2);
                    }
                }
                int size = this.f5823d.size();
                if (size > 0) {
                    for (int i3 = 0; i3 < size; i3++) {
                        i iVar = (i) this.f5823d.get(i3);
                        if (iVar.f5875g) {
                            A(dVar, iVar, true);
                        } else if (iVar.f5882n) {
                            C(dVar, iVar, true);
                        } else {
                            B(dVar, dVar.f5844g[iVar.f5872d], true);
                        }
                    }
                    this.f5823d.clear();
                } else {
                    z2 = true;
                }
            }
            if (C0259d.f5832t && this.f5820a != null && this.f5824e.k() == 0) {
                this.f5825f = true;
                dVar.f5838a = true;
            }
        }
    }

    public void a(i iVar) {
        int i2 = iVar.f5873e;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f5824e.b(iVar, f2);
    }

    public i b(C0259d dVar, boolean[] zArr) {
        return w(zArr, (i) null);
    }

    public void c(C0259d.a aVar) {
        if (aVar instanceof C0257b) {
            C0257b bVar = (C0257b) aVar;
            this.f5820a = null;
            this.f5824e.clear();
            for (int i2 = 0; i2 < bVar.f5824e.k(); i2++) {
                this.f5824e.c(bVar.f5824e.e(i2), bVar.f5824e.a(i2), true);
            }
        }
    }

    public void clear() {
        this.f5824e.clear();
        this.f5820a = null;
        this.f5821b = 0.0f;
    }

    public C0257b d(C0259d dVar, int i2) {
        this.f5824e.b(dVar.o(i2, "ep"), 1.0f);
        this.f5824e.b(dVar.o(i2, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public C0257b e(i iVar, int i2) {
        this.f5824e.b(iVar, (float) i2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean f(C0259d dVar) {
        boolean z2;
        i g2 = g(dVar);
        if (g2 == null) {
            z2 = true;
        } else {
            x(g2);
            z2 = false;
        }
        if (this.f5824e.k() == 0) {
            this.f5825f = true;
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public i g(C0259d dVar) {
        int k2 = this.f5824e.k();
        i iVar = null;
        i iVar2 = null;
        boolean z2 = false;
        boolean z3 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < k2; i2++) {
            float a2 = this.f5824e.a(i2);
            i e2 = this.f5824e.e(i2);
            if (e2.f5878j == i.a.UNRESTRICTED) {
                if (iVar == null || f2 > a2) {
                    z2 = u(e2, dVar);
                    f2 = a2;
                    iVar = e2;
                } else if (!z2 && u(e2, dVar)) {
                    f2 = a2;
                    iVar = e2;
                    z2 = true;
                }
            } else if (iVar == null && a2 < 0.0f) {
                if (iVar2 == null || f3 > a2) {
                    z3 = u(e2, dVar);
                    f3 = a2;
                    iVar2 = e2;
                } else if (!z3 && u(e2, dVar)) {
                    f3 = a2;
                    iVar2 = e2;
                    z3 = true;
                }
            }
        }
        if (iVar != null) {
            return iVar;
        }
        return iVar2;
    }

    public i getKey() {
        return this.f5820a;
    }

    /* access modifiers changed from: package-private */
    public C0257b h(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3) {
        float f3;
        int i4;
        if (iVar2 == iVar3) {
            this.f5824e.b(iVar, 1.0f);
            this.f5824e.b(iVar4, 1.0f);
            this.f5824e.b(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f5824e.b(iVar, 1.0f);
            this.f5824e.b(iVar2, -1.0f);
            this.f5824e.b(iVar3, -1.0f);
            this.f5824e.b(iVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                i4 = (-i2) + i3;
            }
            return this;
        }
        if (f2 <= 0.0f) {
            this.f5824e.b(iVar, -1.0f);
            this.f5824e.b(iVar2, 1.0f);
            f3 = (float) i2;
        } else if (f2 >= 1.0f) {
            this.f5824e.b(iVar4, -1.0f);
            this.f5824e.b(iVar3, 1.0f);
            i4 = -i3;
        } else {
            float f4 = 1.0f - f2;
            this.f5824e.b(iVar, f4 * 1.0f);
            this.f5824e.b(iVar2, f4 * -1.0f);
            this.f5824e.b(iVar3, -1.0f * f2);
            this.f5824e.b(iVar4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                f3 = (((float) (-i2)) * f4) + (((float) i3) * f2);
            }
            return this;
        }
        this.f5821b = f3;
        return this;
        f3 = (float) i4;
        this.f5821b = f3;
        return this;
    }

    /* access modifiers changed from: package-private */
    public C0257b i(i iVar, int i2) {
        this.f5820a = iVar;
        float f2 = (float) i2;
        iVar.f5874f = f2;
        this.f5821b = f2;
        this.f5825f = true;
        return this;
    }

    public boolean isEmpty() {
        if (this.f5820a == null && this.f5821b == 0.0f && this.f5824e.k() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public C0257b j(i iVar, i iVar2, float f2) {
        this.f5824e.b(iVar, -1.0f);
        this.f5824e.b(iVar2, f2);
        return this;
    }

    public C0257b k(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f5824e.b(iVar, -1.0f);
        this.f5824e.b(iVar2, 1.0f);
        this.f5824e.b(iVar3, f2);
        this.f5824e.b(iVar4, -f2);
        return this;
    }

    public C0257b l(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f5821b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f5824e.b(iVar, 1.0f);
            this.f5824e.b(iVar2, -1.0f);
            this.f5824e.b(iVar4, 1.0f);
            this.f5824e.b(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f5824e.b(iVar, 1.0f);
            this.f5824e.b(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f5824e.b(iVar3, 1.0f);
            this.f5824e.b(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f5824e.b(iVar, 1.0f);
            this.f5824e.b(iVar2, -1.0f);
            this.f5824e.b(iVar4, f5);
            this.f5824e.b(iVar3, -f5);
        }
        return this;
    }

    public C0257b m(i iVar, int i2) {
        a aVar;
        float f2;
        if (i2 < 0) {
            this.f5821b = (float) (i2 * -1);
            aVar = this.f5824e;
            f2 = 1.0f;
        } else {
            this.f5821b = (float) i2;
            aVar = this.f5824e;
            f2 = -1.0f;
        }
        aVar.b(iVar, f2);
        return this;
    }

    public C0257b n(i iVar, i iVar2, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f5821b = (float) i2;
        }
        if (!z2) {
            this.f5824e.b(iVar, -1.0f);
            this.f5824e.b(iVar2, 1.0f);
        } else {
            this.f5824e.b(iVar, 1.0f);
            this.f5824e.b(iVar2, -1.0f);
        }
        return this;
    }

    public C0257b o(i iVar, i iVar2, i iVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f5821b = (float) i2;
        }
        if (!z2) {
            this.f5824e.b(iVar, -1.0f);
            this.f5824e.b(iVar2, 1.0f);
            this.f5824e.b(iVar3, 1.0f);
        } else {
            this.f5824e.b(iVar, 1.0f);
            this.f5824e.b(iVar2, -1.0f);
            this.f5824e.b(iVar3, -1.0f);
        }
        return this;
    }

    public C0257b p(i iVar, i iVar2, i iVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f5821b = (float) i2;
        }
        if (!z2) {
            this.f5824e.b(iVar, -1.0f);
            this.f5824e.b(iVar2, 1.0f);
            this.f5824e.b(iVar3, -1.0f);
        } else {
            this.f5824e.b(iVar, 1.0f);
            this.f5824e.b(iVar2, -1.0f);
            this.f5824e.b(iVar3, 1.0f);
        }
        return this;
    }

    public C0257b q(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f5824e.b(iVar3, 0.5f);
        this.f5824e.b(iVar4, 0.5f);
        this.f5824e.b(iVar, -0.5f);
        this.f5824e.b(iVar2, -0.5f);
        this.f5821b = -f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        float f2 = this.f5821b;
        if (f2 < 0.0f) {
            this.f5821b = f2 * -1.0f;
            this.f5824e.j();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        i iVar = this.f5820a;
        if (iVar == null || (iVar.f5878j != i.a.UNRESTRICTED && this.f5821b < 0.0f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean t(i iVar) {
        return this.f5824e.d(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    public void x(i iVar) {
        i iVar2 = this.f5820a;
        if (iVar2 != null) {
            this.f5824e.b(iVar2, -1.0f);
            this.f5820a.f5872d = -1;
            this.f5820a = null;
        }
        float i2 = this.f5824e.i(iVar, true) * -1.0f;
        this.f5820a = iVar;
        if (i2 != 1.0f) {
            this.f5821b /= i2;
            this.f5824e.f(i2);
        }
    }

    public void y() {
        this.f5820a = null;
        this.f5824e.clear();
        this.f5821b = 0.0f;
        this.f5825f = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        r7 = r10.f5824e.a(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String z() {
        /*
            r10 = this;
            m.i r0 = r10.f5820a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
        L_0x0013:
            java.lang.String r0 = r0.toString()
            goto L_0x0026
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            m.i r1 = r10.f5820a
            r0.append(r1)
            goto L_0x0013
        L_0x0026:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f5821b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0053
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f5821b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            m.b$a r5 = r10.f5824e
            int r5 = r5.k()
        L_0x005a:
            if (r2 >= r5) goto L_0x00d6
            m.b$a r6 = r10.f5824e
            m.i r6 = r6.e(r2)
            if (r6 != 0) goto L_0x0066
            goto L_0x00d3
        L_0x0066:
            m.b$a r7 = r10.f5824e
            float r7 = r7.a(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0071
            goto L_0x00d3
        L_0x0071:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0091
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
        L_0x0087:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
            goto L_0x00ae
        L_0x0091:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L_0x00a5
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ae
        L_0x00a5:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            goto L_0x0087
        L_0x00ae:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00c4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x00b9:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00d2
        L_0x00c4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            goto L_0x00b9
        L_0x00d2:
            r1 = 1
        L_0x00d3:
            int r2 = r2 + 1
            goto L_0x005a
        L_0x00d6:
            if (r1 != 0) goto L_0x00e9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0257b.z():java.lang.String");
    }

    public C0257b(C0258c cVar) {
        this.f5824e = new C0256a(this, cVar);
    }
}
