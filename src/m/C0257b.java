package m;

import java.util.ArrayList;
import m.C0259d;
import m.i;


public class C0257b implements C0259d.a {

    
    i f5820a = null;

    
    float f5821b = 0.0f;

    
    boolean f5822c = false;

    
    ArrayList f5823d = new ArrayList();

    
    public a f5824e;

    
    boolean f5825f = false;

    
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

    
    public C0257b e(i iVar, int i2) {
        this.f5824e.b(iVar, (float) i2);
        return this;
    }

    
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

    
    public void r() {
        float f2 = this.f5821b;
        if (f2 < 0.0f) {
            this.f5821b = f2 * -1.0f;
            this.f5824e.j();
        }
    }

    
    public boolean s() {
        i iVar = this.f5820a;
        if (iVar == null || (iVar.f5878j != i.a.UNRESTRICTED && this.f5821b < 0.0f)) {
            return false;
        }
        return true;
    }

    
    public boolean t(i iVar) {
        return this.f5824e.d(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w((boolean[]) null, iVar);
    }

    
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

    
    
    
    
    
    public java.lang.String z() {
        
        throw new UnsupportedOperationException("Method not decompiled: m.C0257b.z():java.lang.String");
    }

    public C0257b(C0258c cVar) {
        this.f5824e = new C0256a(this, cVar);
    }
}
