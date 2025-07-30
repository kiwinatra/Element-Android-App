package q;

import java.util.ArrayList;
import m.C0259d;
import p.d;
import p.e;
import p.f;
import p.h;
import p.i;
import p.k;
import p.l;

/* renamed from: q.b  reason: case insensitive filesystem */
public class C0278b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f6098a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private a f6099b = new a();

    /* renamed from: c  reason: collision with root package name */
    private f f6100c;

    /* renamed from: q.b$a */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f6101k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f6102l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f6103m = 2;

        /* renamed from: a  reason: collision with root package name */
        public e.b f6104a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f6105b;

        /* renamed from: c  reason: collision with root package name */
        public int f6106c;

        /* renamed from: d  reason: collision with root package name */
        public int f6107d;

        /* renamed from: e  reason: collision with root package name */
        public int f6108e;

        /* renamed from: f  reason: collision with root package name */
        public int f6109f;

        /* renamed from: g  reason: collision with root package name */
        public int f6110g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f6111h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f6112i;

        /* renamed from: j  reason: collision with root package name */
        public int f6113j;
    }

    /* renamed from: q.b$b  reason: collision with other inner class name */
    public interface C0079b {
        void a();

        void b(e eVar, a aVar);
    }

    public C0278b(f fVar) {
        this.f6100c = fVar;
    }

    private boolean a(C0079b bVar, e eVar, int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f6099b.f6104a = eVar.A();
        this.f6099b.f6105b = eVar.T();
        this.f6099b.f6106c = eVar.W();
        this.f6099b.f6107d = eVar.x();
        a aVar = this.f6099b;
        aVar.f6112i = false;
        aVar.f6113j = i2;
        e.b bVar2 = aVar.f6104a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        if (bVar2 == bVar3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (aVar.f6105b == bVar3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 || eVar.f6016d0 <= 0.0f) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z3 || eVar.f6016d0 <= 0.0f) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z4 && eVar.f6057y[0] == 4) {
            aVar.f6104a = e.b.FIXED;
        }
        if (z5 && eVar.f6057y[1] == 4) {
            aVar.f6105b = e.b.FIXED;
        }
        bVar.b(eVar, aVar);
        eVar.k1(this.f6099b.f6108e);
        eVar.L0(this.f6099b.f6109f);
        eVar.K0(this.f6099b.f6111h);
        eVar.A0(this.f6099b.f6110g);
        a aVar2 = this.f6099b;
        aVar2.f6113j = a.f6101k;
        return aVar2.f6112i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        if (r5.f6016d0 <= 0.0f) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(p.f r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.T1(r1)
            q.b$b r2 = r13.I1()
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r4 >= r0) goto L_0x00a4
            java.util.ArrayList r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            p.e r5 = (p.e) r5
            boolean r6 = r5 instanceof p.h
            if (r6 == 0) goto L_0x0022
            goto L_0x00a0
        L_0x0022:
            boolean r6 = r5 instanceof p.C0264a
            if (r6 == 0) goto L_0x0028
            goto L_0x00a0
        L_0x0028:
            boolean r6 = r5.l0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00a0
        L_0x0030:
            if (r1 == 0) goto L_0x0047
            q.l r6 = r5.f6017e
            if (r6 == 0) goto L_0x0047
            q.n r7 = r5.f6019f
            if (r7 == 0) goto L_0x0047
            q.g r6 = r6.f6182e
            boolean r6 = r6.f6134j
            if (r6 == 0) goto L_0x0047
            q.g r6 = r7.f6182e
            boolean r6 = r6.f6134j
            if (r6 == 0) goto L_0x0047
            goto L_0x00a0
        L_0x0047:
            p.e$b r6 = r5.u(r3)
            r7 = 1
            p.e$b r8 = r5.u(r7)
            p.e$b r9 = p.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0060
            int r10 = r5.f6053w
            if (r10 == r7) goto L_0x0060
            if (r8 != r9) goto L_0x0060
            int r10 = r5.f6055x
            if (r10 == r7) goto L_0x0060
            r10 = 1
            goto L_0x0061
        L_0x0060:
            r10 = 0
        L_0x0061:
            if (r10 != 0) goto L_0x0097
            boolean r11 = r13.T1(r7)
            if (r11 == 0) goto L_0x0097
            boolean r11 = r5 instanceof p.l
            if (r11 != 0) goto L_0x0097
            if (r6 != r9) goto L_0x007c
            int r11 = r5.f6053w
            if (r11 != 0) goto L_0x007c
            if (r8 == r9) goto L_0x007c
            boolean r11 = r5.i0()
            if (r11 != 0) goto L_0x007c
            r10 = 1
        L_0x007c:
            if (r8 != r9) goto L_0x008b
            int r11 = r5.f6055x
            if (r11 != 0) goto L_0x008b
            if (r6 == r9) goto L_0x008b
            boolean r11 = r5.i0()
            if (r11 != 0) goto L_0x008b
            r10 = 1
        L_0x008b:
            if (r6 == r9) goto L_0x008f
            if (r8 != r9) goto L_0x0097
        L_0x008f:
            float r6 = r5.f6016d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            if (r7 == 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            int r6 = q.C0278b.a.f6101k
            r12.a(r2, r5, r6)
        L_0x00a0:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00a4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C0278b.b(p.f):void");
    }

    private void c(f fVar, String str, int i2, int i3, int i4) {
        int I2 = fVar.I();
        int H2 = fVar.H();
        fVar.a1(0);
        fVar.Z0(0);
        fVar.k1(i3);
        fVar.L0(i4);
        fVar.a1(I2);
        fVar.Z0(H2);
        this.f6100c.X1(i2);
        this.f6100c.s1();
    }

    public long d(f fVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        boolean z2;
        int i12;
        f fVar2;
        boolean z3;
        int i13;
        boolean z4;
        int i14;
        boolean z5;
        C0278b bVar = this;
        f fVar3 = fVar;
        int i15 = i2;
        int i16 = i5;
        int i17 = i7;
        C0079b I1 = fVar.I1();
        int size = fVar3.L0.size();
        int W2 = fVar.W();
        int x2 = fVar.x();
        boolean b2 = k.b(i15, 128);
        boolean z6 = b2 || k.b(i15, 64);
        if (z6) {
            int i18 = 0;
            while (true) {
                if (i18 >= size) {
                    break;
                }
                e eVar = (e) fVar3.L0.get(i18);
                e.b A2 = eVar.A();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z7 = (A2 == bVar2) && (eVar.T() == bVar2) && eVar.v() > 0.0f;
                if ((!eVar.i0() || !z7) && ((!eVar.k0() || !z7) && !(eVar instanceof l) && !eVar.i0() && !eVar.k0())) {
                    i18++;
                }
            }
            z6 = false;
        }
        if (z6) {
            boolean z8 = C0259d.f5830r;
        }
        boolean z9 = z6 & ((i16 == 1073741824 && i17 == 1073741824) || b2);
        if (z9) {
            int min = Math.min(fVar.G(), i6);
            int min2 = Math.min(fVar.F(), i8);
            if (i16 == 1073741824 && fVar.W() != min) {
                fVar3.k1(min);
                fVar.M1();
            }
            if (i17 == 1073741824 && fVar.x() != min2) {
                fVar3.L0(min2);
                fVar.M1();
            }
            if (i16 == 1073741824 && i17 == 1073741824) {
                z2 = fVar3.F1(b2);
                i11 = 2;
            } else {
                boolean G1 = fVar3.G1(b2);
                if (i16 == 1073741824) {
                    G1 &= fVar3.H1(b2, 0);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i17 == 1073741824) {
                    z2 = fVar3.H1(b2, 1) & G1;
                    i11++;
                } else {
                    z2 = G1;
                }
            }
            if (z2) {
                fVar3.p1(i16 == 1073741824, i17 == 1073741824);
            }
        } else {
            z2 = false;
            i11 = 0;
        }
        if (z2 && i11 == 2) {
            return 0;
        }
        int J1 = fVar.J1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f6098a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, W2, x2);
        }
        if (size2 > 0) {
            e.b A3 = fVar.A();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z10 = A3 == bVar3;
            boolean z11 = fVar.T() == bVar3;
            int max = Math.max(fVar.W(), bVar.f6100c.I());
            int max2 = Math.max(fVar.x(), bVar.f6100c.H());
            int i19 = 0;
            boolean z12 = false;
            while (i19 < size2) {
                e eVar2 = (e) bVar.f6098a.get(i19);
                if (!(eVar2 instanceof l)) {
                    i14 = J1;
                } else {
                    int W3 = eVar2.W();
                    int x3 = eVar2.x();
                    boolean a2 = z12 | bVar.a(I1, eVar2, a.f6102l);
                    int W4 = eVar2.W();
                    i14 = J1;
                    int x4 = eVar2.x();
                    if (W4 != W3) {
                        eVar2.k1(W4);
                        if (z10 && eVar2.M() > max) {
                            max = Math.max(max, eVar2.M() + eVar2.o(d.b.RIGHT).f());
                        }
                        z5 = true;
                    } else {
                        z5 = a2;
                    }
                    if (x4 != x3) {
                        eVar2.L0(x4);
                        if (z11 && eVar2.r() > max2) {
                            max2 = Math.max(max2, eVar2.r() + eVar2.o(d.b.BOTTOM).f());
                        }
                        z5 = true;
                    }
                    z12 = z5 | ((l) eVar2).F1();
                }
                i19++;
                f fVar4 = fVar;
                J1 = i14;
            }
            int i20 = J1;
            int i21 = 2;
            int i22 = 0;
            while (i22 < i21) {
                int i23 = 0;
                while (i23 < size2) {
                    e eVar3 = (e) bVar.f6098a.get(i23);
                    if ((!(eVar3 instanceof i) || (eVar3 instanceof l)) && !(eVar3 instanceof h) && eVar3.V() != 8 && ((!z9 || !eVar3.f6017e.f6182e.f6134j || !eVar3.f6019f.f6182e.f6134j) && !(eVar3 instanceof l))) {
                        int W5 = eVar3.W();
                        int x5 = eVar3.x();
                        int p2 = eVar3.p();
                        int i24 = a.f6102l;
                        z3 = z9;
                        if (i22 == 1) {
                            i24 = a.f6103m;
                        }
                        int W6 = eVar3.W();
                        boolean a3 = z12 | bVar.a(I1, eVar3, i24);
                        int x6 = eVar3.x();
                        if (W6 != W5) {
                            eVar3.k1(W6);
                            if (z10 && eVar3.M() > max) {
                                max = Math.max(max, eVar3.M() + eVar3.o(d.b.RIGHT).f());
                            }
                            z4 = true;
                        } else {
                            z4 = a3;
                        }
                        if (x6 != x5) {
                            eVar3.L0(x6);
                            if (z11 && eVar3.r() > max2) {
                                max2 = Math.max(max2, eVar3.r() + eVar3.o(d.b.BOTTOM).f());
                            }
                            z4 = true;
                        }
                        if (!eVar3.Z() || p2 == eVar3.p()) {
                            z12 = z4;
                        } else {
                            i13 = 1;
                            z12 = true;
                            i23 += i13;
                            bVar = this;
                            z9 = z3;
                        }
                    } else {
                        z3 = z9;
                    }
                    i13 = 1;
                    i23 += i13;
                    bVar = this;
                    z9 = z3;
                }
                boolean z13 = z9;
                if (!z12) {
                    break;
                }
                i22++;
                c(fVar, "intermediate pass", i22, W2, x2);
                i21 = 2;
                z12 = false;
                bVar = this;
                z9 = z13;
            }
            fVar2 = fVar;
            i12 = i20;
        } else {
            fVar2 = fVar;
            i12 = J1;
        }
        fVar2.W1(i12);
        return 0;
    }

    public void e(f fVar) {
        this.f6098a.clear();
        int size = fVar.L0.size();
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = (e) fVar.L0.get(i2);
            e.b A2 = eVar.A();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (A2 == bVar || eVar.T() == bVar) {
                this.f6098a.add(eVar);
            }
        }
        fVar.M1();
    }
}
