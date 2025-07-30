package p;

import java.util.ArrayList;
import p.e;

/* renamed from: p.c  reason: case insensitive filesystem */
public class C0266c {

    /* renamed from: a  reason: collision with root package name */
    protected e f5938a;

    /* renamed from: b  reason: collision with root package name */
    protected e f5939b;

    /* renamed from: c  reason: collision with root package name */
    protected e f5940c;

    /* renamed from: d  reason: collision with root package name */
    protected e f5941d;

    /* renamed from: e  reason: collision with root package name */
    protected e f5942e;

    /* renamed from: f  reason: collision with root package name */
    protected e f5943f;

    /* renamed from: g  reason: collision with root package name */
    protected e f5944g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList f5945h;

    /* renamed from: i  reason: collision with root package name */
    protected int f5946i;

    /* renamed from: j  reason: collision with root package name */
    protected int f5947j;

    /* renamed from: k  reason: collision with root package name */
    protected float f5948k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    int f5949l;

    /* renamed from: m  reason: collision with root package name */
    int f5950m;

    /* renamed from: n  reason: collision with root package name */
    int f5951n;

    /* renamed from: o  reason: collision with root package name */
    boolean f5952o;

    /* renamed from: p  reason: collision with root package name */
    private int f5953p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5954q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f5955r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f5956s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f5957t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f5958u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f5959v;

    public C0266c(e eVar, int i2, boolean z2) {
        this.f5938a = eVar;
        this.f5953p = i2;
        this.f5954q = z2;
    }

    private void b() {
        int i2 = this.f5953p * 2;
        e eVar = this.f5938a;
        boolean z2 = true;
        this.f5952o = true;
        e eVar2 = eVar;
        boolean z3 = false;
        while (!z3) {
            this.f5946i++;
            e[] eVarArr = eVar.F0;
            int i3 = this.f5953p;
            e eVar3 = null;
            eVarArr[i3] = null;
            eVar.E0[i3] = null;
            if (eVar.V() != 8) {
                this.f5949l++;
                e.b u2 = eVar.u(this.f5953p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u2 != bVar) {
                    this.f5950m += eVar.E(this.f5953p);
                }
                int f2 = this.f5950m + eVar.f6005W[i2].f();
                this.f5950m = f2;
                int i4 = i2 + 1;
                this.f5950m = f2 + eVar.f6005W[i4].f();
                int f3 = this.f5951n + eVar.f6005W[i2].f();
                this.f5951n = f3;
                this.f5951n = f3 + eVar.f6005W[i4].f();
                if (this.f5939b == null) {
                    this.f5939b = eVar;
                }
                this.f5941d = eVar;
                e.b[] bVarArr = eVar.f6008Z;
                int i5 = this.f5953p;
                if (bVarArr[i5] == bVar) {
                    int i6 = eVar.f6057y[i5];
                    if (i6 == 0 || i6 == 3 || i6 == 2) {
                        this.f5947j++;
                        float f4 = eVar.D0[i5];
                        if (f4 > 0.0f) {
                            this.f5948k += f4;
                        }
                        if (c(eVar, i5)) {
                            if (f4 < 0.0f) {
                                this.f5955r = true;
                            } else {
                                this.f5956s = true;
                            }
                            if (this.f5945h == null) {
                                this.f5945h = new ArrayList();
                            }
                            this.f5945h.add(eVar);
                        }
                        if (this.f5943f == null) {
                            this.f5943f = eVar;
                        }
                        e eVar4 = this.f5944g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f5953p] = eVar;
                        }
                        this.f5944g = eVar;
                    }
                    if (this.f5953p != 0 ? !(eVar.f6055x == 0 && eVar.f5984C == 0 && eVar.f5986D == 0) : !(eVar.f6053w == 0 && eVar.f6059z == 0 && eVar.f5980A == 0)) {
                        this.f5952o = false;
                    }
                    if (eVar.f6016d0 != 0.0f) {
                        this.f5952o = false;
                        this.f5958u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f5953p] = eVar;
            }
            d dVar = eVar.f6005W[i2 + 1].f5965f;
            if (dVar != null) {
                e eVar5 = dVar.f5963d;
                d dVar2 = eVar5.f6005W[i2].f5965f;
                if (dVar2 != null && dVar2.f5963d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z3 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f5939b;
        if (eVar6 != null) {
            this.f5950m -= eVar6.f6005W[i2].f();
        }
        e eVar7 = this.f5941d;
        if (eVar7 != null) {
            this.f5950m -= eVar7.f6005W[i2 + 1].f();
        }
        this.f5940c = eVar;
        if (this.f5953p != 0 || !this.f5954q) {
            this.f5942e = this.f5938a;
        } else {
            this.f5942e = eVar;
        }
        if (!this.f5956s || !this.f5955r) {
            z2 = false;
        }
        this.f5957t = z2;
    }

    private static boolean c(e eVar, int i2) {
        int i3;
        if (eVar.V() != 8 && eVar.f6008Z[i2] == e.b.MATCH_CONSTRAINT && ((i3 = eVar.f6057y[i2]) == 0 || i3 == 3)) {
            return true;
        }
        return false;
    }

    public void a() {
        if (!this.f5959v) {
            b();
        }
        this.f5959v = true;
    }
}
