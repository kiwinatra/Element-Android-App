package p;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import m.C0259d;
import m.i;
import p.e;
import q.C0278b;
import q.e;

public class f extends m {
    C0278b M0 = new C0278b(this);
    public e N0 = new e(this);
    private int O0;
    protected C0278b.C0079b P0 = null;
    private boolean Q0 = false;
    protected C0259d R0 = new C0259d();
    int S0;
    int T0;
    int U0;
    int V0;
    public int W0 = 0;
    public int X0 = 0;
    C0266c[] Y0 = new C0266c[4];
    C0266c[] Z0 = new C0266c[4];
    public boolean a1 = false;
    public boolean b1 = false;
    public boolean c1 = false;
    public int d1 = 0;
    public int e1 = 0;
    private int f1 = 257;
    public boolean g1 = false;
    private boolean h1 = false;
    private boolean i1 = false;
    int j1 = 0;
    private WeakReference k1 = null;
    private WeakReference l1 = null;
    private WeakReference m1 = null;
    private WeakReference n1 = null;
    HashSet o1 = new HashSet();
    public C0278b.a p1 = new C0278b.a();

    private void A1(d dVar, i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    private void B1(d dVar, i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    private void C1(e eVar) {
        int i2 = this.X0 + 1;
        C0266c[] cVarArr = this.Y0;
        if (i2 >= cVarArr.length) {
            this.Y0 = (C0266c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new C0266c(eVar, 1, P1());
        this.X0++;
    }

    public static boolean S1(int i2, e eVar, C0278b.C0079b bVar, C0278b.a aVar, int i3) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int v2;
        int i5;
        if (bVar == null) {
            return false;
        }
        if (eVar.V() == 8 || (eVar instanceof h) || (eVar instanceof C0264a)) {
            aVar.f6108e = 0;
            aVar.f6109f = 0;
            return false;
        }
        aVar.f6104a = eVar.A();
        aVar.f6105b = eVar.T();
        aVar.f6106c = eVar.W();
        aVar.f6107d = eVar.x();
        aVar.f6112i = false;
        aVar.f6113j = i3;
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
        if (z2 && eVar.a0(0) && eVar.f6053w == 0 && !z4) {
            aVar.f6104a = e.b.WRAP_CONTENT;
            if (z3 && eVar.f6055x == 0) {
                aVar.f6104a = e.b.FIXED;
            }
            z2 = false;
        }
        if (z3 && eVar.a0(1) && eVar.f6055x == 0 && !z5) {
            aVar.f6105b = e.b.WRAP_CONTENT;
            if (z2 && eVar.f6053w == 0) {
                aVar.f6105b = e.b.FIXED;
            }
            z3 = false;
        }
        if (eVar.n0()) {
            aVar.f6104a = e.b.FIXED;
            z2 = false;
        }
        if (eVar.o0()) {
            aVar.f6105b = e.b.FIXED;
            z3 = false;
        }
        if (z4) {
            if (eVar.f6057y[0] == 4) {
                aVar.f6104a = e.b.FIXED;
            } else if (!z3) {
                e.b bVar4 = aVar.f6105b;
                e.b bVar5 = e.b.FIXED;
                if (bVar4 == bVar5) {
                    i5 = aVar.f6107d;
                } else {
                    aVar.f6104a = e.b.WRAP_CONTENT;
                    bVar.b(eVar, aVar);
                    i5 = aVar.f6109f;
                }
                aVar.f6104a = bVar5;
                aVar.f6106c = (int) (eVar.v() * ((float) i5));
            }
        }
        if (z5) {
            if (eVar.f6057y[1] == 4) {
                aVar.f6105b = e.b.FIXED;
            } else if (!z2) {
                e.b bVar6 = aVar.f6104a;
                e.b bVar7 = e.b.FIXED;
                if (bVar6 == bVar7) {
                    i4 = aVar.f6106c;
                } else {
                    aVar.f6105b = e.b.WRAP_CONTENT;
                    bVar.b(eVar, aVar);
                    i4 = aVar.f6108e;
                }
                aVar.f6105b = bVar7;
                if (eVar.w() == -1) {
                    v2 = (int) (((float) i4) / eVar.v());
                } else {
                    v2 = (int) (eVar.v() * ((float) i4));
                }
                aVar.f6107d = v2;
            }
        }
        bVar.b(eVar, aVar);
        eVar.k1(aVar.f6108e);
        eVar.L0(aVar.f6109f);
        eVar.K0(aVar.f6111h);
        eVar.A0(aVar.f6110g);
        aVar.f6113j = C0278b.a.f6101k;
        return aVar.f6112i;
    }

    private void U1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    private void x1(e eVar) {
        int i2 = this.W0 + 1;
        C0266c[] cVarArr = this.Z0;
        if (i2 >= cVarArr.length) {
            this.Z0 = (C0266c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new C0266c(eVar, 0, P1());
        this.W0++;
    }

    /* access modifiers changed from: package-private */
    public void D1(d dVar) {
        WeakReference weakReference = this.m1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.m1.get()).e()) {
            this.m1 = new WeakReference(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void E1(d dVar) {
        WeakReference weakReference = this.k1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.k1.get()).e()) {
            this.k1 = new WeakReference(dVar);
        }
    }

    public boolean F1(boolean z2) {
        return this.N0.f(z2);
    }

    public boolean G1(boolean z2) {
        return this.N0.g(z2);
    }

    public boolean H1(boolean z2, int i2) {
        return this.N0.h(z2, i2);
    }

    public C0278b.C0079b I1() {
        return this.P0;
    }

    public int J1() {
        return this.f1;
    }

    public C0259d K1() {
        return this.R0;
    }

    public boolean L1() {
        return false;
    }

    public void M1() {
        this.N0.j();
    }

    public void N1() {
        this.N0.k();
    }

    public void O(StringBuilder sb) {
        sb.append(this.f6037o + ":{\n");
        sb.append("  actualWidth:" + this.f6012b0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f6014c0);
        sb.append("\n");
        Iterator it = r1().iterator();
        while (it.hasNext()) {
            ((e) it.next()).O(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public boolean O1() {
        return this.i1;
    }

    public boolean P1() {
        return this.Q0;
    }

    public boolean Q1() {
        return this.h1;
    }

    public long R1(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i9;
        this.S0 = i11;
        int i12 = i10;
        this.T0 = i12;
        return this.M0.d(this, i2, i11, i12, i3, i4, i5, i6, i7, i8);
    }

    public boolean T1(int i2) {
        if ((this.f1 & i2) == i2) {
            return true;
        }
        return false;
    }

    public void V1(C0278b.C0079b bVar) {
        this.P0 = bVar;
        this.N0.n(bVar);
    }

    public void W1(int i2) {
        this.f1 = i2;
        C0259d.f5830r = T1(512);
    }

    public void X1(int i2) {
        this.O0 = i2;
    }

    public void Y1(boolean z2) {
        this.Q0 = z2;
    }

    public boolean Z1(C0259d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean T1 = T1(64);
        q1(dVar, T1);
        int size = this.L0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = (e) this.L0.get(i2);
            eVar.q1(dVar, T1);
            if (eVar.c0()) {
                z2 = true;
            }
        }
        return z2;
    }

    public void a2() {
        this.M0.e(this);
    }

    public void p1(boolean z2, boolean z3) {
        super.p1(z2, z3);
        int size = this.L0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((e) this.L0.get(i2)).p1(z2, z3);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x030e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s1() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f6020f0 = r2
            r1.f6022g0 = r2
            r1.h1 = r2
            r1.i1 = r2
            java.util.ArrayList r0 = r1.L0
            int r3 = r0.size()
            int r0 = r18.W()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.x()
            int r4 = java.lang.Math.max(r2, r4)
            p.e$b[] r5 = r1.f6008Z
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.O0
            if (r8 != 0) goto L_0x0084
            int r8 = r1.f1
            boolean r8 = p.k.b(r8, r6)
            if (r8 == 0) goto L_0x0084
            q.b$b r8 = r18.I1()
            q.h.h(r1, r8)
            r8 = 0
        L_0x003c:
            if (r8 >= r3) goto L_0x0084
            java.util.ArrayList r9 = r1.L0
            java.lang.Object r9 = r9.get(r8)
            p.e r9 = (p.e) r9
            boolean r10 = r9.m0()
            if (r10 == 0) goto L_0x0081
            boolean r10 = r9 instanceof p.h
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9 instanceof p.C0264a
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9 instanceof p.l
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9.l0()
            if (r10 != 0) goto L_0x0081
            p.e$b r10 = r9.u(r2)
            p.e$b r11 = r9.u(r6)
            p.e$b r12 = p.e.b.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0075
            int r10 = r9.f6053w
            if (r10 == r6) goto L_0x0075
            if (r11 != r12) goto L_0x0075
            int r10 = r9.f6055x
            if (r10 == r6) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            q.b$a r10 = new q.b$a
            r10.<init>()
            q.b$b r11 = r1.P0
            int r12 = q.C0278b.a.f6101k
            S1(r2, r9, r11, r10, r12)
        L_0x0081:
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0084:
            r8 = 2
            if (r3 <= r8) goto L_0x00cd
            p.e$b r9 = p.e.b.WRAP_CONTENT
            if (r5 == r9) goto L_0x008d
            if (r7 != r9) goto L_0x00cd
        L_0x008d:
            int r10 = r1.f1
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = p.k.b(r10, r11)
            if (r10 == 0) goto L_0x00cd
            q.b$b r10 = r18.I1()
            boolean r10 = q.i.c(r1, r10)
            if (r10 == 0) goto L_0x00cd
            if (r5 != r9) goto L_0x00b5
            int r10 = r18.W()
            if (r0 >= r10) goto L_0x00b1
            if (r0 <= 0) goto L_0x00b1
            r1.k1(r0)
            r1.h1 = r6
            goto L_0x00b5
        L_0x00b1:
            int r0 = r18.W()
        L_0x00b5:
            if (r7 != r9) goto L_0x00c9
            int r9 = r18.x()
            if (r4 >= r9) goto L_0x00c5
            if (r4 <= 0) goto L_0x00c5
            r1.L0(r4)
            r1.i1 = r6
            goto L_0x00c9
        L_0x00c5:
            int r4 = r18.x()
        L_0x00c9:
            r9 = r4
            r4 = r0
            r0 = 1
            goto L_0x00d0
        L_0x00cd:
            r9 = r4
            r4 = r0
            r0 = 0
        L_0x00d0:
            r10 = 64
            boolean r11 = r1.T1(r10)
            if (r11 != 0) goto L_0x00e3
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.T1(r11)
            if (r11 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r11 = 0
            goto L_0x00e4
        L_0x00e3:
            r11 = 1
        L_0x00e4:
            m.d r12 = r1.R0
            r12.f5845h = r2
            r12.f5846i = r2
            int r13 = r1.f1
            if (r13 == 0) goto L_0x00f2
            if (r11 == 0) goto L_0x00f2
            r12.f5846i = r6
        L_0x00f2:
            java.util.ArrayList r11 = r1.L0
            p.e$b r12 = r18.A()
            p.e$b r13 = p.e.b.WRAP_CONTENT
            if (r12 == r13) goto L_0x0105
            p.e$b r12 = r18.T()
            if (r12 != r13) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r12 = 0
            goto L_0x0106
        L_0x0105:
            r12 = 1
        L_0x0106:
            r18.U1()
            r13 = 0
        L_0x010a:
            if (r13 >= r3) goto L_0x0120
            java.util.ArrayList r14 = r1.L0
            java.lang.Object r14 = r14.get(r13)
            p.e r14 = (p.e) r14
            boolean r15 = r14 instanceof p.m
            if (r15 == 0) goto L_0x011d
            p.m r14 = (p.m) r14
            r14.s1()
        L_0x011d:
            int r13 = r13 + 1
            goto L_0x010a
        L_0x0120:
            boolean r10 = r1.T1(r10)
            r13 = r0
            r0 = 0
            r14 = 1
        L_0x0127:
            if (r14 == 0) goto L_0x0315
            int r15 = r0 + 1
            m.d r0 = r1.R0     // Catch:{ Exception -> 0x014d }
            r0.D()     // Catch:{ Exception -> 0x014d }
            r18.U1()     // Catch:{ Exception -> 0x014d }
            m.d r0 = r1.R0     // Catch:{ Exception -> 0x014d }
            r1.m(r0)     // Catch:{ Exception -> 0x014d }
            r0 = 0
        L_0x0139:
            if (r0 >= r3) goto L_0x0150
            java.util.ArrayList r6 = r1.L0     // Catch:{ Exception -> 0x014d }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x014d }
            p.e r6 = (p.e) r6     // Catch:{ Exception -> 0x014d }
            m.d r2 = r1.R0     // Catch:{ Exception -> 0x014d }
            r6.m(r2)     // Catch:{ Exception -> 0x014d }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x0139
        L_0x014d:
            r0 = move-exception
            goto L_0x01db
        L_0x0150:
            m.d r0 = r1.R0     // Catch:{ Exception -> 0x014d }
            boolean r14 = r1.w1(r0)     // Catch:{ Exception -> 0x014d }
            java.lang.ref.WeakReference r0 = r1.k1     // Catch:{ Exception -> 0x014d }
            r2 = 0
            if (r0 == 0) goto L_0x0176
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0176
            java.lang.ref.WeakReference r0 = r1.k1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            p.d r0 = (p.d) r0     // Catch:{ Exception -> 0x014d }
            m.d r6 = r1.R0     // Catch:{ Exception -> 0x014d }
            p.d r8 = r1.f5998P     // Catch:{ Exception -> 0x014d }
            m.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.B1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.k1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x0176:
            java.lang.ref.WeakReference r0 = r1.m1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0195
            java.lang.ref.WeakReference r0 = r1.m1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            p.d r0 = (p.d) r0     // Catch:{ Exception -> 0x014d }
            m.d r6 = r1.R0     // Catch:{ Exception -> 0x014d }
            p.d r8 = r1.f6000R     // Catch:{ Exception -> 0x014d }
            m.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.A1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.m1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x0195:
            java.lang.ref.WeakReference r0 = r1.l1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01b4
            java.lang.ref.WeakReference r0 = r1.l1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            p.d r0 = (p.d) r0     // Catch:{ Exception -> 0x014d }
            m.d r6 = r1.R0     // Catch:{ Exception -> 0x014d }
            p.d r8 = r1.f5997O     // Catch:{ Exception -> 0x014d }
            m.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.B1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.l1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x01b4:
            java.lang.ref.WeakReference r0 = r1.n1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01d3
            java.lang.ref.WeakReference r0 = r1.n1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            p.d r0 = (p.d) r0     // Catch:{ Exception -> 0x014d }
            m.d r6 = r1.R0     // Catch:{ Exception -> 0x014d }
            p.d r8 = r1.f5999Q     // Catch:{ Exception -> 0x014d }
            m.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.A1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.n1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x01d3:
            if (r14 == 0) goto L_0x01f4
            m.d r0 = r1.R0     // Catch:{ Exception -> 0x014d }
            r0.z()     // Catch:{ Exception -> 0x014d }
            goto L_0x01f4
        L_0x01db:
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x01f4:
            m.d r0 = r1.R0
            if (r14 == 0) goto L_0x01ff
            boolean[] r2 = p.k.f6087a
            boolean r0 = r1.Z1(r0, r2)
            goto L_0x0216
        L_0x01ff:
            r1.q1(r0, r10)
            r0 = 0
        L_0x0203:
            if (r0 >= r3) goto L_0x0215
            java.util.ArrayList r2 = r1.L0
            java.lang.Object r2 = r2.get(r0)
            p.e r2 = (p.e) r2
            m.d r6 = r1.R0
            r2.q1(r6, r10)
            int r0 = r0 + 1
            goto L_0x0203
        L_0x0215:
            r0 = 0
        L_0x0216:
            r2 = 8
            if (r12 == 0) goto L_0x0287
            if (r15 >= r2) goto L_0x0287
            boolean[] r6 = p.k.f6087a
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x0287
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x0226:
            if (r6 >= r3) goto L_0x0250
            java.util.ArrayList r2 = r1.L0
            java.lang.Object r2 = r2.get(r6)
            p.e r2 = (p.e) r2
            r16 = r0
            int r0 = r2.f6020f0
            int r17 = r2.W()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f6022g0
            int r2 = r2.x()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x0226
        L_0x0250:
            r16 = r0
            int r0 = r1.f6034m0
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f6036n0
            int r2 = java.lang.Math.max(r2, r8)
            p.e$b r6 = p.e.b.WRAP_CONTENT
            if (r5 != r6) goto L_0x0273
            int r8 = r18.W()
            if (r8 >= r0) goto L_0x0273
            r1.k1(r0)
            p.e$b[] r0 = r1.f6008Z
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0273:
            if (r7 != r6) goto L_0x0289
            int r0 = r18.x()
            if (r0 >= r2) goto L_0x0289
            r1.L0(r2)
            p.e$b[] r0 = r1.f6008Z
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x0289
        L_0x0287:
            r16 = r0
        L_0x0289:
            int r0 = r1.f6034m0
            int r2 = r18.W()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.W()
            if (r0 <= r2) goto L_0x02a6
            r1.k1(r0)
            p.e$b[] r0 = r1.f6008Z
            p.e$b r2 = p.e.b.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02a6:
            int r0 = r1.f6036n0
            int r2 = r18.x()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.x()
            if (r0 <= r2) goto L_0x02c4
            r1.L0(r0)
            p.e$b[] r0 = r1.f6008Z
            p.e$b r2 = p.e.b.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = 1
            r16 = 1
            goto L_0x02c6
        L_0x02c4:
            r6 = 1
            r2 = r13
        L_0x02c6:
            if (r2 != 0) goto L_0x0305
            p.e$b[] r0 = r1.f6008Z
            r8 = 0
            r0 = r0[r8]
            p.e$b r13 = p.e.b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02e7
            if (r4 <= 0) goto L_0x02e7
            int r0 = r18.W()
            if (r0 <= r4) goto L_0x02e7
            r1.h1 = r6
            p.e$b[] r0 = r1.f6008Z
            p.e$b r2 = p.e.b.FIXED
            r0[r8] = r2
            r1.k1(r4)
            r2 = 1
            r16 = 1
        L_0x02e7:
            p.e$b[] r0 = r1.f6008Z
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0305
            if (r9 <= 0) goto L_0x0305
            int r0 = r18.x()
            if (r0 <= r9) goto L_0x0305
            r1.i1 = r6
            p.e$b[] r0 = r1.f6008Z
            p.e$b r2 = p.e.b.FIXED
            r0[r6] = r2
            r1.L0(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x030a
        L_0x0305:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x030a:
            if (r15 <= r0) goto L_0x030e
            r14 = 0
            goto L_0x030f
        L_0x030e:
            r14 = r2
        L_0x030f:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x0127
        L_0x0315:
            r1.L0 = r11
            if (r13 == 0) goto L_0x0321
            p.e$b[] r0 = r1.f6008Z
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x0321:
            m.d r0 = r1.R0
            m.c r0 = r0.v()
            r1.w0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f.s1():void");
    }

    public void t0() {
        this.R0.D();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.g1 = false;
        super.t0();
    }

    /* access modifiers changed from: package-private */
    public void v1(e eVar, int i2) {
        if (i2 == 0) {
            x1(eVar);
        } else if (i2 == 1) {
            C1(eVar);
        }
    }

    public boolean w1(C0259d dVar) {
        boolean T1 = T1(64);
        g(dVar, T1);
        int size = this.L0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = (e) this.L0.get(i2);
            eVar.S0(0, false);
            eVar.S0(1, false);
            if (eVar instanceof C0264a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = (e) this.L0.get(i3);
                if (eVar2 instanceof C0264a) {
                    ((C0264a) eVar2).y1();
                }
            }
        }
        this.o1.clear();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar3 = (e) this.L0.get(i4);
            if (eVar3.f()) {
                if (eVar3 instanceof l) {
                    this.o1.add(eVar3);
                } else {
                    eVar3.g(dVar, T1);
                }
            }
        }
        while (this.o1.size() > 0) {
            int size2 = this.o1.size();
            Iterator it = this.o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) ((e) it.next());
                if (lVar.v1(this.o1)) {
                    lVar.g(dVar, T1);
                    this.o1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.o1.size()) {
                Iterator it2 = this.o1.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).g(dVar, T1);
                }
                this.o1.clear();
            }
        }
        if (C0259d.f5830r) {
            HashSet hashSet = new HashSet();
            for (int i5 = 0; i5 < size; i5++) {
                e eVar4 = (e) this.L0.get(i5);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, A() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e eVar5 = (e) it3.next();
                k.a(this, dVar, eVar5);
                eVar5.g(dVar, T1);
            }
        } else {
            for (int i6 = 0; i6 < size; i6++) {
                e eVar6 = (e) this.L0.get(i6);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.f6008Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.P0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.g1(e.b.FIXED);
                    }
                    eVar6.g(dVar, T1);
                    if (bVar == bVar3) {
                        eVar6.P0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.g1(bVar2);
                    }
                } else {
                    k.a(this, dVar, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar, T1);
                    }
                }
            }
        }
        if (this.W0 > 0) {
            C0265b.b(this, dVar, (ArrayList) null, 0);
        }
        if (this.X0 > 0) {
            C0265b.b(this, dVar, (ArrayList) null, 1);
        }
        return true;
    }

    public void y1(d dVar) {
        WeakReference weakReference = this.n1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.n1.get()).e()) {
            this.n1 = new WeakReference(dVar);
        }
    }

    public void z1(d dVar) {
        WeakReference weakReference = this.l1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((d) this.l1.get()).e()) {
            this.l1 = new WeakReference(dVar);
        }
    }
}
