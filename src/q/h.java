package q;

import java.util.ArrayList;
import java.util.Iterator;
import p.C0264a;
import p.d;
import p.e;
import p.f;
import q.C0278b;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static C0278b.a f6147a = new C0278b.a();

    /* renamed from: b  reason: collision with root package name */
    private static int f6148b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static int f6149c = 0;

    private static boolean a(int i2, e eVar) {
        f fVar;
        boolean z2;
        boolean z3;
        e.b bVar;
        e.b bVar2;
        e.b A2 = eVar.A();
        e.b T2 = eVar.T();
        if (eVar.K() != null) {
            fVar = (f) eVar.K();
        } else {
            fVar = null;
        }
        if (fVar != null) {
            e.b A3 = fVar.A();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            e.b T3 = fVar.T();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        if (A2 == bVar5 || eVar.n0() || A2 == e.b.WRAP_CONTENT || ((A2 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f6053w == 0 && eVar.f6016d0 == 0.0f && eVar.a0(0)) || (A2 == bVar2 && eVar.f6053w == 1 && eVar.d0(0, eVar.W())))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (T2 == bVar5 || eVar.o0() || T2 == e.b.WRAP_CONTENT || ((T2 == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f6055x == 0 && eVar.f6016d0 == 0.0f && eVar.a0(1)) || (T2 == bVar && eVar.f6055x == 1 && eVar.d0(1, eVar.x())))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (eVar.f6016d0 > 0.0f && (z2 || z3)) {
            return true;
        }
        if (!z2 || !z3) {
            return false;
        }
        return true;
    }

    private static void b(int i2, e eVar, C0278b.C0079b bVar, boolean z2) {
        boolean z3;
        d dVar;
        d dVar2;
        boolean z4;
        d dVar3;
        d dVar4;
        e eVar2 = eVar;
        C0278b.C0079b bVar2 = bVar;
        boolean z5 = z2;
        if (!eVar.g0()) {
            f6148b++;
            if (!(eVar2 instanceof f) && eVar.m0()) {
                int i3 = i2 + 1;
                if (a(i3, eVar2)) {
                    f.S1(i3, eVar2, bVar2, new C0278b.a(), C0278b.a.f6101k);
                }
            }
            d o2 = eVar2.o(d.b.LEFT);
            d o3 = eVar2.o(d.b.RIGHT);
            int e2 = o2.e();
            int e3 = o3.e();
            if (o2.d() != null && o2.n()) {
                Iterator it = o2.d().iterator();
                while (it.hasNext()) {
                    d dVar5 = (d) it.next();
                    e eVar3 = dVar5.f5963d;
                    int i4 = i2 + 1;
                    boolean a2 = a(i4, eVar3);
                    if (eVar3.m0() && a2) {
                        f.S1(i4, eVar3, bVar2, new C0278b.a(), C0278b.a.f6101k);
                    }
                    if ((dVar5 != eVar3.f5997O || (dVar4 = eVar3.f5999Q.f5965f) == null || !dVar4.n()) && (dVar5 != eVar3.f5999Q || (dVar3 = eVar3.f5997O.f5965f) == null || !dVar3.n())) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    e.b A2 = eVar3.A();
                    e.b bVar3 = e.b.MATCH_CONSTRAINT;
                    if (A2 != bVar3 || a2) {
                        if (!eVar3.m0()) {
                            d dVar6 = eVar3.f5997O;
                            if (dVar5 == dVar6 && eVar3.f5999Q.f5965f == null) {
                                int f2 = dVar6.f() + e2;
                                eVar3.F0(f2, eVar3.W() + f2);
                            } else {
                                d dVar7 = eVar3.f5999Q;
                                if (dVar5 == dVar7 && dVar6.f5965f == null) {
                                    int f3 = e2 - dVar7.f();
                                    eVar3.F0(f3 - eVar3.W(), f3);
                                } else if (z4 && !eVar3.i0()) {
                                    d(i4, bVar2, eVar3, z5);
                                }
                            }
                            b(i4, eVar3, bVar2, z5);
                        }
                    } else if (eVar3.A() == bVar3 && eVar3.f5980A >= 0 && eVar3.f6059z >= 0 && ((eVar3.V() == 8 || (eVar3.f6053w == 0 && eVar3.v() == 0.0f)) && !eVar3.i0() && !eVar3.l0() && z4 && !eVar3.i0())) {
                        e(i4, eVar2, bVar2, eVar3, z5);
                    }
                }
            }
            if (!(eVar2 instanceof p.h)) {
                if (o3.d() != null && o3.n()) {
                    Iterator it2 = o3.d().iterator();
                    while (it2.hasNext()) {
                        d dVar8 = (d) it2.next();
                        e eVar4 = dVar8.f5963d;
                        int i5 = i2 + 1;
                        boolean a3 = a(i5, eVar4);
                        if (eVar4.m0() && a3) {
                            f.S1(i5, eVar4, bVar2, new C0278b.a(), C0278b.a.f6101k);
                        }
                        if ((dVar8 != eVar4.f5997O || (dVar2 = eVar4.f5999Q.f5965f) == null || !dVar2.n()) && (dVar8 != eVar4.f5999Q || (dVar = eVar4.f5997O.f5965f) == null || !dVar.n())) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        e.b A3 = eVar4.A();
                        e.b bVar4 = e.b.MATCH_CONSTRAINT;
                        if (A3 != bVar4 || a3) {
                            if (!eVar4.m0()) {
                                d dVar9 = eVar4.f5997O;
                                if (dVar8 == dVar9 && eVar4.f5999Q.f5965f == null) {
                                    int f4 = dVar9.f() + e3;
                                    eVar4.F0(f4, eVar4.W() + f4);
                                } else {
                                    d dVar10 = eVar4.f5999Q;
                                    if (dVar8 == dVar10 && dVar9.f5965f == null) {
                                        int f5 = e3 - dVar10.f();
                                        eVar4.F0(f5 - eVar4.W(), f5);
                                    } else if (z3 && !eVar4.i0()) {
                                        d(i5, bVar2, eVar4, z5);
                                    }
                                }
                                b(i5, eVar4, bVar2, z5);
                            }
                        } else if (eVar4.A() == bVar4 && eVar4.f5980A >= 0 && eVar4.f6059z >= 0) {
                            if ((eVar4.V() == 8 || (eVar4.f6053w == 0 && eVar4.v() == 0.0f)) && !eVar4.i0() && !eVar4.l0() && z3 && !eVar4.i0()) {
                                e(i5, eVar2, bVar2, eVar4, z5);
                            }
                        }
                    }
                }
                eVar.q0();
            }
        }
    }

    private static void c(int i2, C0264a aVar, C0278b.C0079b bVar, int i3, boolean z2) {
        if (aVar.t1()) {
            int i4 = i2 + 1;
            if (i3 == 0) {
                b(i4, aVar, bVar, z2);
            } else {
                i(i4, aVar, bVar);
            }
        }
    }

    private static void d(int i2, C0278b.C0079b bVar, e eVar, boolean z2) {
        float f2;
        float y2 = eVar.y();
        int e2 = eVar.f5997O.f5965f.e();
        int e3 = eVar.f5999Q.f5965f.e();
        int f3 = eVar.f5997O.f() + e2;
        int f4 = e3 - eVar.f5999Q.f();
        if (e2 == e3) {
            y2 = 0.5f;
        } else {
            e2 = f3;
            e3 = f4;
        }
        int W2 = eVar.W();
        int i3 = (e3 - e2) - W2;
        if (e2 > e3) {
            i3 = (e2 - e3) - W2;
        }
        if (i3 > 0) {
            f2 = (y2 * ((float) i3)) + 0.5f;
        } else {
            f2 = y2 * ((float) i3);
        }
        int i4 = ((int) f2) + e2;
        int i5 = i4 + W2;
        if (e2 > e3) {
            i5 = i4 - W2;
        }
        eVar.F0(i4, i5);
        b(i2 + 1, eVar, bVar, z2);
    }

    private static void e(int i2, e eVar, C0278b.C0079b bVar, e eVar2, boolean z2) {
        float y2 = eVar2.y();
        int e2 = eVar2.f5997O.f5965f.e() + eVar2.f5997O.f();
        int e3 = eVar2.f5999Q.f5965f.e() - eVar2.f5999Q.f();
        if (e3 >= e2) {
            int W2 = eVar2.W();
            if (eVar2.V() != 8) {
                int i3 = eVar2.f6053w;
                if (i3 == 2) {
                    if (!(eVar instanceof f)) {
                        eVar = eVar.K();
                    }
                    W2 = (int) (eVar2.y() * 0.5f * ((float) eVar.W()));
                } else if (i3 == 0) {
                    W2 = e3 - e2;
                }
                W2 = Math.max(eVar2.f6059z, W2);
                int i4 = eVar2.f5980A;
                if (i4 > 0) {
                    W2 = Math.min(i4, W2);
                }
            }
            int i5 = e2 + ((int) ((y2 * ((float) ((e3 - e2) - W2))) + 0.5f));
            eVar2.F0(i5, W2 + i5);
            b(i2 + 1, eVar2, bVar, z2);
        }
    }

    private static void f(int i2, C0278b.C0079b bVar, e eVar) {
        float f2;
        float R2 = eVar.R();
        int e2 = eVar.f5998P.f5965f.e();
        int e3 = eVar.f6000R.f5965f.e();
        int f3 = eVar.f5998P.f() + e2;
        int f4 = e3 - eVar.f6000R.f();
        if (e2 == e3) {
            R2 = 0.5f;
        } else {
            e2 = f3;
            e3 = f4;
        }
        int x2 = eVar.x();
        int i3 = (e3 - e2) - x2;
        if (e2 > e3) {
            i3 = (e2 - e3) - x2;
        }
        if (i3 > 0) {
            f2 = (R2 * ((float) i3)) + 0.5f;
        } else {
            f2 = R2 * ((float) i3);
        }
        int i4 = (int) f2;
        int i5 = e2 + i4;
        int i6 = i5 + x2;
        if (e2 > e3) {
            i5 = e2 - i4;
            i6 = i5 - x2;
        }
        eVar.I0(i5, i6);
        i(i2 + 1, eVar, bVar);
    }

    private static void g(int i2, e eVar, C0278b.C0079b bVar, e eVar2) {
        float R2 = eVar2.R();
        int e2 = eVar2.f5998P.f5965f.e() + eVar2.f5998P.f();
        int e3 = eVar2.f6000R.f5965f.e() - eVar2.f6000R.f();
        if (e3 >= e2) {
            int x2 = eVar2.x();
            if (eVar2.V() != 8) {
                int i3 = eVar2.f6055x;
                if (i3 == 2) {
                    if (!(eVar instanceof f)) {
                        eVar = eVar.K();
                    }
                    x2 = (int) (R2 * 0.5f * ((float) eVar.x()));
                } else if (i3 == 0) {
                    x2 = e3 - e2;
                }
                x2 = Math.max(eVar2.f5984C, x2);
                int i4 = eVar2.f5986D;
                if (i4 > 0) {
                    x2 = Math.min(i4, x2);
                }
            }
            int i5 = e2 + ((int) ((R2 * ((float) ((e3 - e2) - x2))) + 0.5f));
            eVar2.I0(i5, x2 + i5);
            i(i2 + 1, eVar2, bVar);
        }
    }

    public static void h(f fVar, C0278b.C0079b bVar) {
        int v1;
        int v12;
        e.b A2 = fVar.A();
        e.b T2 = fVar.T();
        f6148b = 0;
        f6149c = 0;
        fVar.v0();
        ArrayList r1 = fVar.r1();
        int size = r1.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((e) r1.get(i2)).v0();
        }
        boolean P1 = fVar.P1();
        if (A2 == e.b.FIXED) {
            fVar.F0(0, fVar.W());
        } else {
            fVar.G0(0);
        }
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            e eVar = (e) r1.get(i3);
            if (eVar instanceof p.h) {
                p.h hVar = (p.h) eVar;
                if (hVar.s1() == 1) {
                    if (hVar.t1() != -1) {
                        v12 = hVar.t1();
                    } else if (hVar.u1() == -1 || !fVar.n0()) {
                        if (fVar.n0()) {
                            v12 = (int) ((hVar.v1() * ((float) fVar.W())) + 0.5f);
                        }
                        z2 = true;
                    } else {
                        v12 = fVar.W() - hVar.u1();
                    }
                    hVar.w1(v12);
                    z2 = true;
                }
            } else if ((eVar instanceof C0264a) && ((C0264a) eVar).x1() == 0) {
                z3 = true;
            }
        }
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                e eVar2 = (e) r1.get(i4);
                if (eVar2 instanceof p.h) {
                    p.h hVar2 = (p.h) eVar2;
                    if (hVar2.s1() == 1) {
                        b(0, hVar2, bVar, P1);
                    }
                }
            }
        }
        b(0, fVar, bVar, P1);
        if (z3) {
            for (int i5 = 0; i5 < size; i5++) {
                e eVar3 = (e) r1.get(i5);
                if (eVar3 instanceof C0264a) {
                    C0264a aVar = (C0264a) eVar3;
                    if (aVar.x1() == 0) {
                        c(0, aVar, bVar, 0, P1);
                    }
                }
            }
        }
        if (T2 == e.b.FIXED) {
            fVar.I0(0, fVar.x());
        } else {
            fVar.H0(0);
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            e eVar4 = (e) r1.get(i6);
            if (eVar4 instanceof p.h) {
                p.h hVar3 = (p.h) eVar4;
                if (hVar3.s1() == 0) {
                    if (hVar3.t1() != -1) {
                        v1 = hVar3.t1();
                    } else if (hVar3.u1() == -1 || !fVar.o0()) {
                        if (fVar.o0()) {
                            v1 = (int) ((hVar3.v1() * ((float) fVar.x())) + 0.5f);
                        }
                        z4 = true;
                    } else {
                        v1 = fVar.x() - hVar3.u1();
                    }
                    hVar3.w1(v1);
                    z4 = true;
                }
            } else if ((eVar4 instanceof C0264a) && ((C0264a) eVar4).x1() == 1) {
                z5 = true;
            }
        }
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                e eVar5 = (e) r1.get(i7);
                if (eVar5 instanceof p.h) {
                    p.h hVar4 = (p.h) eVar5;
                    if (hVar4.s1() == 0) {
                        i(1, hVar4, bVar);
                    }
                }
            }
        }
        i(0, fVar, bVar);
        if (z5) {
            for (int i8 = 0; i8 < size; i8++) {
                e eVar6 = (e) r1.get(i8);
                if (eVar6 instanceof C0264a) {
                    C0264a aVar2 = (C0264a) eVar6;
                    if (aVar2.x1() == 1) {
                        c(0, aVar2, bVar, 1, P1);
                    }
                }
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            e eVar7 = (e) r1.get(i9);
            if (eVar7.m0() && a(0, eVar7)) {
                f.S1(0, eVar7, bVar, f6147a, C0278b.a.f6101k);
                if (!(eVar7 instanceof p.h)) {
                    b(0, eVar7, bVar, P1);
                } else if (((p.h) eVar7).s1() != 0) {
                    b(0, eVar7, bVar, P1);
                }
                i(0, eVar7, bVar);
            }
        }
    }

    private static void i(int i2, e eVar, C0278b.C0079b bVar) {
        boolean z2;
        d dVar;
        d dVar2;
        boolean z3;
        d dVar3;
        d dVar4;
        e eVar2 = eVar;
        C0278b.C0079b bVar2 = bVar;
        if (!eVar.p0()) {
            f6149c++;
            if (!(eVar2 instanceof f) && eVar.m0()) {
                int i3 = i2 + 1;
                if (a(i3, eVar2)) {
                    f.S1(i3, eVar2, bVar2, new C0278b.a(), C0278b.a.f6101k);
                }
            }
            d o2 = eVar2.o(d.b.TOP);
            d o3 = eVar2.o(d.b.BOTTOM);
            int e2 = o2.e();
            int e3 = o3.e();
            if (o2.d() != null && o2.n()) {
                Iterator it = o2.d().iterator();
                while (it.hasNext()) {
                    d dVar5 = (d) it.next();
                    e eVar3 = dVar5.f5963d;
                    int i4 = i2 + 1;
                    boolean a2 = a(i4, eVar3);
                    if (eVar3.m0() && a2) {
                        f.S1(i4, eVar3, bVar2, new C0278b.a(), C0278b.a.f6101k);
                    }
                    if ((dVar5 != eVar3.f5998P || (dVar4 = eVar3.f6000R.f5965f) == null || !dVar4.n()) && (dVar5 != eVar3.f6000R || (dVar3 = eVar3.f5998P.f5965f) == null || !dVar3.n())) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    e.b T2 = eVar3.T();
                    e.b bVar3 = e.b.MATCH_CONSTRAINT;
                    if (T2 != bVar3 || a2) {
                        if (!eVar3.m0()) {
                            d dVar6 = eVar3.f5998P;
                            if (dVar5 == dVar6 && eVar3.f6000R.f5965f == null) {
                                int f2 = dVar6.f() + e2;
                                eVar3.I0(f2, eVar3.x() + f2);
                            } else {
                                d dVar7 = eVar3.f6000R;
                                if (dVar5 == dVar7 && dVar6.f5965f == null) {
                                    int f3 = e2 - dVar7.f();
                                    eVar3.I0(f3 - eVar3.x(), f3);
                                } else if (z3 && !eVar3.k0()) {
                                    f(i4, bVar2, eVar3);
                                }
                            }
                            i(i4, eVar3, bVar2);
                        }
                    } else if (eVar3.T() == bVar3 && eVar3.f5986D >= 0 && eVar3.f5984C >= 0) {
                        if ((eVar3.V() == 8 || (eVar3.f6055x == 0 && eVar3.v() == 0.0f)) && !eVar3.k0() && !eVar3.l0() && z3 && !eVar3.k0()) {
                            g(i4, eVar2, bVar2, eVar3);
                        }
                    }
                }
            }
            if (!(eVar2 instanceof p.h)) {
                if (o3.d() != null && o3.n()) {
                    Iterator it2 = o3.d().iterator();
                    while (it2.hasNext()) {
                        d dVar8 = (d) it2.next();
                        e eVar4 = dVar8.f5963d;
                        int i5 = i2 + 1;
                        boolean a3 = a(i5, eVar4);
                        if (eVar4.m0() && a3) {
                            f.S1(i5, eVar4, bVar2, new C0278b.a(), C0278b.a.f6101k);
                        }
                        if ((dVar8 != eVar4.f5998P || (dVar2 = eVar4.f6000R.f5965f) == null || !dVar2.n()) && (dVar8 != eVar4.f6000R || (dVar = eVar4.f5998P.f5965f) == null || !dVar.n())) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        e.b T3 = eVar4.T();
                        e.b bVar4 = e.b.MATCH_CONSTRAINT;
                        if (T3 != bVar4 || a3) {
                            if (!eVar4.m0()) {
                                d dVar9 = eVar4.f5998P;
                                if (dVar8 == dVar9 && eVar4.f6000R.f5965f == null) {
                                    int f4 = dVar9.f() + e3;
                                    eVar4.I0(f4, eVar4.x() + f4);
                                } else {
                                    d dVar10 = eVar4.f6000R;
                                    if (dVar8 == dVar10 && dVar9.f5965f == null) {
                                        int f5 = e3 - dVar10.f();
                                        eVar4.I0(f5 - eVar4.x(), f5);
                                    } else if (z2 && !eVar4.k0()) {
                                        f(i5, bVar2, eVar4);
                                    }
                                }
                                i(i5, eVar4, bVar2);
                            }
                        } else if (eVar4.T() == bVar4 && eVar4.f5986D >= 0 && eVar4.f5984C >= 0) {
                            if ((eVar4.V() == 8 || (eVar4.f6055x == 0 && eVar4.v() == 0.0f)) && !eVar4.k0() && !eVar4.l0() && z2 && !eVar4.k0()) {
                                g(i5, eVar2, bVar2, eVar4);
                            }
                        }
                    }
                }
                d o4 = eVar2.o(d.b.BASELINE);
                if (o4.d() != null && o4.n()) {
                    int e4 = o4.e();
                    Iterator it3 = o4.d().iterator();
                    while (it3.hasNext()) {
                        d dVar11 = (d) it3.next();
                        e eVar5 = dVar11.f5963d;
                        int i6 = i2 + 1;
                        boolean a4 = a(i6, eVar5);
                        if (eVar5.m0() && a4) {
                            f.S1(i6, eVar5, bVar2, new C0278b.a(), C0278b.a.f6101k);
                        }
                        if ((eVar5.T() != e.b.MATCH_CONSTRAINT || a4) && !eVar5.m0() && dVar11 == eVar5.f6001S) {
                            eVar5.E0(dVar11.f() + e4);
                            try {
                                i(i6, eVar5, bVar2);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                eVar.r0();
            }
        }
    }
}
