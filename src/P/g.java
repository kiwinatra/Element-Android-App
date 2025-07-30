package p;

import java.util.ArrayList;
import m.C0259d;
import p.e;

public class g extends l {
    /* access modifiers changed from: private */
    public int a1 = -1;
    /* access modifiers changed from: private */
    public int b1 = -1;
    /* access modifiers changed from: private */
    public int c1 = -1;
    /* access modifiers changed from: private */
    public int d1 = -1;
    /* access modifiers changed from: private */
    public int e1 = -1;
    /* access modifiers changed from: private */
    public int f1 = -1;
    /* access modifiers changed from: private */
    public float g1 = 0.5f;
    /* access modifiers changed from: private */
    public float h1 = 0.5f;
    /* access modifiers changed from: private */
    public float i1 = 0.5f;
    /* access modifiers changed from: private */
    public float j1 = 0.5f;
    /* access modifiers changed from: private */
    public float k1 = 0.5f;
    /* access modifiers changed from: private */
    public float l1 = 0.5f;
    /* access modifiers changed from: private */
    public int m1 = 0;
    /* access modifiers changed from: private */
    public int n1 = 0;
    /* access modifiers changed from: private */
    public int o1 = 2;
    /* access modifiers changed from: private */
    public int p1 = 2;
    private int q1 = 0;
    private int r1 = -1;
    private int s1 = 0;
    private ArrayList t1 = new ArrayList();
    private e[] u1 = null;
    private e[] v1 = null;
    private int[] w1 = null;
    /* access modifiers changed from: private */
    public e[] x1;
    /* access modifiers changed from: private */
    public int y1 = 0;

    private class a {

        /* renamed from: a  reason: collision with root package name */
        private int f6068a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public e f6069b = null;

        /* renamed from: c  reason: collision with root package name */
        int f6070c = 0;

        /* renamed from: d  reason: collision with root package name */
        private d f6071d;

        /* renamed from: e  reason: collision with root package name */
        private d f6072e;

        /* renamed from: f  reason: collision with root package name */
        private d f6073f;

        /* renamed from: g  reason: collision with root package name */
        private d f6074g;

        /* renamed from: h  reason: collision with root package name */
        private int f6075h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f6076i = 0;

        /* renamed from: j  reason: collision with root package name */
        private int f6077j = 0;

        /* renamed from: k  reason: collision with root package name */
        private int f6078k = 0;

        /* renamed from: l  reason: collision with root package name */
        private int f6079l = 0;

        /* renamed from: m  reason: collision with root package name */
        private int f6080m = 0;

        /* renamed from: n  reason: collision with root package name */
        private int f6081n = 0;

        /* renamed from: o  reason: collision with root package name */
        private int f6082o = 0;

        /* renamed from: p  reason: collision with root package name */
        private int f6083p = 0;

        /* renamed from: q  reason: collision with root package name */
        private int f6084q = 0;

        public a(int i2, d dVar, d dVar2, d dVar3, d dVar4, int i3) {
            this.f6068a = i2;
            this.f6071d = dVar;
            this.f6072e = dVar2;
            this.f6073f = dVar3;
            this.f6074g = dVar4;
            this.f6075h = g.this.z1();
            this.f6076i = g.this.B1();
            this.f6077j = g.this.A1();
            this.f6078k = g.this.y1();
            this.f6084q = i3;
        }

        private void h() {
            this.f6079l = 0;
            this.f6080m = 0;
            this.f6069b = null;
            this.f6070c = 0;
            int i2 = this.f6082o;
            int i3 = 0;
            while (i3 < i2 && this.f6081n + i3 < g.this.y1) {
                e eVar = g.this.x1[this.f6081n + i3];
                if (this.f6068a == 0) {
                    int W2 = eVar.W();
                    int P1 = g.this.m1;
                    if (eVar.V() == 8) {
                        P1 = 0;
                    }
                    this.f6079l += W2 + P1;
                    int c2 = g.this.k2(eVar, this.f6084q);
                    if (this.f6069b == null || this.f6070c < c2) {
                        this.f6069b = eVar;
                        this.f6070c = c2;
                        this.f6080m = c2;
                    }
                } else {
                    int b2 = g.this.l2(eVar, this.f6084q);
                    int c22 = g.this.k2(eVar, this.f6084q);
                    int Q1 = g.this.n1;
                    if (eVar.V() == 8) {
                        Q1 = 0;
                    }
                    this.f6080m += c22 + Q1;
                    if (this.f6069b == null || this.f6070c < b2) {
                        this.f6069b = eVar;
                        this.f6070c = b2;
                        this.f6079l = b2;
                    }
                }
                i3++;
            }
        }

        public void b(e eVar) {
            int i2 = 0;
            if (this.f6068a == 0) {
                int b2 = g.this.l2(eVar, this.f6084q);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    this.f6083p++;
                    b2 = 0;
                }
                int P1 = g.this.m1;
                if (eVar.V() != 8) {
                    i2 = P1;
                }
                this.f6079l += b2 + i2;
                int c2 = g.this.k2(eVar, this.f6084q);
                if (this.f6069b == null || this.f6070c < c2) {
                    this.f6069b = eVar;
                    this.f6070c = c2;
                    this.f6080m = c2;
                }
            } else {
                int b22 = g.this.l2(eVar, this.f6084q);
                int c22 = g.this.k2(eVar, this.f6084q);
                if (eVar.T() == e.b.MATCH_CONSTRAINT) {
                    this.f6083p++;
                    c22 = 0;
                }
                int Q1 = g.this.n1;
                if (eVar.V() != 8) {
                    i2 = Q1;
                }
                this.f6080m += c22 + i2;
                if (this.f6069b == null || this.f6070c < b22) {
                    this.f6069b = eVar;
                    this.f6070c = b22;
                    this.f6079l = b22;
                }
            }
            this.f6082o++;
        }

        public void c() {
            this.f6070c = 0;
            this.f6069b = null;
            this.f6079l = 0;
            this.f6080m = 0;
            this.f6081n = 0;
            this.f6082o = 0;
            this.f6083p = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:140:0x0262  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f6082o
                r2 = 0
                r3 = 0
            L_0x0006:
                if (r3 >= r1) goto L_0x0027
                int r4 = r0.f6081n
                int r4 = r4 + r3
                p.g r5 = p.g.this
                int r5 = r5.y1
                if (r4 < r5) goto L_0x0014
                goto L_0x0027
            L_0x0014:
                p.g r4 = p.g.this
                p.e[] r4 = r4.x1
                int r5 = r0.f6081n
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L_0x0024
                r4.u0()
            L_0x0024:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x0027:
                if (r1 == 0) goto L_0x0353
                p.e r3 = r0.f6069b
                if (r3 != 0) goto L_0x002f
                goto L_0x0353
            L_0x002f:
                if (r19 == 0) goto L_0x0035
                if (r18 != 0) goto L_0x0035
                r4 = 1
                goto L_0x0036
            L_0x0035:
                r4 = 0
            L_0x0036:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L_0x003a:
                if (r6 >= r1) goto L_0x0069
                if (r17 == 0) goto L_0x0042
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x0043
            L_0x0042:
                r9 = r6
            L_0x0043:
                int r10 = r0.f6081n
                int r10 = r10 + r9
                p.g r11 = p.g.this
                int r11 = r11.y1
                if (r10 < r11) goto L_0x004f
                goto L_0x0069
            L_0x004f:
                p.g r10 = p.g.this
                p.e[] r10 = r10.x1
                int r11 = r0.f6081n
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L_0x0066
                int r9 = r9.V()
                if (r9 != 0) goto L_0x0066
                if (r7 != r5) goto L_0x0065
                r7 = r6
            L_0x0065:
                r8 = r6
            L_0x0066:
                int r6 = r6 + 1
                goto L_0x003a
            L_0x0069:
                int r6 = r0.f6068a
                r9 = 0
                if (r6 != 0) goto L_0x01fd
                p.e r6 = r0.f6069b
                p.g r10 = p.g.this
                int r10 = r10.b1
                r6.e1(r10)
                int r10 = r0.f6076i
                if (r18 <= 0) goto L_0x0084
                p.g r11 = p.g.this
                int r11 = r11.n1
                int r10 = r10 + r11
            L_0x0084:
                p.d r11 = r6.f5998P
                p.d r12 = r0.f6072e
                r11.a(r12, r10)
                if (r19 == 0) goto L_0x0096
                p.d r10 = r6.f6000R
                p.d r11 = r0.f6074g
                int r12 = r0.f6078k
                r10.a(r11, r12)
            L_0x0096:
                if (r18 <= 0) goto L_0x00a3
                p.d r10 = r0.f6072e
                p.e r10 = r10.f5963d
                p.d r10 = r10.f6000R
                p.d r11 = r6.f5998P
                r10.a(r11, r2)
            L_0x00a3:
                p.g r10 = p.g.this
                int r10 = r10.p1
                r11 = 3
                if (r10 != r11) goto L_0x00dd
                boolean r10 = r6.Z()
                if (r10 != 0) goto L_0x00dd
                r10 = 0
            L_0x00b3:
                if (r10 >= r1) goto L_0x00dd
                if (r17 == 0) goto L_0x00bb
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x00bc
            L_0x00bb:
                r12 = r10
            L_0x00bc:
                int r13 = r0.f6081n
                int r13 = r13 + r12
                p.g r14 = p.g.this
                int r14 = r14.y1
                if (r13 < r14) goto L_0x00c8
                goto L_0x00dd
            L_0x00c8:
                p.g r13 = p.g.this
                p.e[] r13 = r13.x1
                int r14 = r0.f6081n
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.Z()
                if (r13 == 0) goto L_0x00da
                goto L_0x00de
            L_0x00da:
                int r10 = r10 + 1
                goto L_0x00b3
            L_0x00dd:
                r12 = r6
            L_0x00de:
                r10 = 0
            L_0x00df:
                if (r10 >= r1) goto L_0x0353
                if (r17 == 0) goto L_0x00e7
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00e8
            L_0x00e7:
                r13 = r10
            L_0x00e8:
                int r14 = r0.f6081n
                int r14 = r14 + r13
                p.g r15 = p.g.this
                int r15 = r15.y1
                if (r14 < r15) goto L_0x00f5
                goto L_0x0353
            L_0x00f5:
                p.g r14 = p.g.this
                p.e[] r14 = r14.x1
                int r15 = r0.f6081n
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L_0x0106
                r14 = r9
            L_0x0103:
                r9 = 3
                goto L_0x01f7
            L_0x0106:
                if (r10 != 0) goto L_0x0111
                p.d r15 = r14.f5997O
                p.d r11 = r0.f6071d
                int r3 = r0.f6075h
                r14.k(r15, r11, r3)
            L_0x0111:
                if (r13 != 0) goto L_0x016f
                p.g r3 = p.g.this
                int r3 = r3.a1
                r11 = 1065353216(0x3f800000, float:1.0)
                p.g r13 = p.g.this
                float r13 = r13.g1
                if (r17 == 0) goto L_0x0125
                float r13 = r11 - r13
            L_0x0125:
                int r15 = r0.f6081n
                if (r15 != 0) goto L_0x0149
                p.g r15 = p.g.this
                int r15 = r15.c1
                if (r15 == r5) goto L_0x0149
                p.g r3 = p.g.this
                int r3 = r3.c1
                if (r17 == 0) goto L_0x0142
                p.g r13 = p.g.this
                float r13 = r13.i1
            L_0x013f:
                float r11 = r11 - r13
            L_0x0140:
                r13 = r11
                goto L_0x0169
            L_0x0142:
                p.g r11 = p.g.this
                float r11 = r11.i1
                goto L_0x0140
            L_0x0149:
                if (r19 == 0) goto L_0x0169
                p.g r15 = p.g.this
                int r15 = r15.e1
                if (r15 == r5) goto L_0x0169
                p.g r3 = p.g.this
                int r3 = r3.e1
                if (r17 == 0) goto L_0x0162
                p.g r13 = p.g.this
                float r13 = r13.k1
                goto L_0x013f
            L_0x0162:
                p.g r11 = p.g.this
                float r11 = r11.k1
                goto L_0x0140
            L_0x0169:
                r14.N0(r3)
                r14.M0(r13)
            L_0x016f:
                int r3 = r1 + -1
                if (r10 != r3) goto L_0x017c
                p.d r3 = r14.f5999Q
                p.d r11 = r0.f6073f
                int r13 = r0.f6077j
                r14.k(r3, r11, r13)
            L_0x017c:
                if (r9 == 0) goto L_0x01a7
                p.d r3 = r14.f5997O
                p.d r11 = r9.f5999Q
                p.g r13 = p.g.this
                int r13 = r13.m1
                r3.a(r11, r13)
                if (r10 != r7) goto L_0x0194
                p.d r3 = r14.f5997O
                int r11 = r0.f6075h
                r3.u(r11)
            L_0x0194:
                p.d r3 = r9.f5999Q
                p.d r11 = r14.f5997O
                r3.a(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L_0x01a7
                p.d r3 = r9.f5999Q
                int r9 = r0.f6077j
                r3.u(r9)
            L_0x01a7:
                if (r14 == r6) goto L_0x0103
                p.g r3 = p.g.this
                int r3 = r3.p1
                r9 = 3
                if (r3 != r9) goto L_0x01c8
                boolean r3 = r12.Z()
                if (r3 == 0) goto L_0x01c8
                if (r14 == r12) goto L_0x01c8
                boolean r3 = r14.Z()
                if (r3 == 0) goto L_0x01c8
                p.d r3 = r14.f6001S
                p.d r11 = r12.f6001S
            L_0x01c4:
                r3.a(r11, r2)
                goto L_0x01f7
            L_0x01c8:
                p.g r3 = p.g.this
                int r3 = r3.p1
                if (r3 == 0) goto L_0x01f2
                r11 = 1
                if (r3 == r11) goto L_0x01ed
                p.d r3 = r14.f5998P
                if (r4 == 0) goto L_0x01e8
                p.d r11 = r0.f6072e
                int r13 = r0.f6076i
                r3.a(r11, r13)
                p.d r3 = r14.f6000R
                p.d r11 = r0.f6074g
                int r13 = r0.f6078k
                r3.a(r11, r13)
                goto L_0x01f7
            L_0x01e8:
                p.d r11 = r6.f5998P
                r3.a(r11, r2)
            L_0x01ed:
                p.d r3 = r14.f6000R
                p.d r11 = r6.f6000R
                goto L_0x01c4
            L_0x01f2:
                p.d r3 = r14.f5998P
                p.d r11 = r6.f5998P
                goto L_0x01c4
            L_0x01f7:
                int r10 = r10 + 1
                r9 = r14
                r11 = 3
                goto L_0x00df
            L_0x01fd:
                p.e r3 = r0.f6069b
                p.g r6 = p.g.this
                int r6 = r6.a1
                r3.N0(r6)
                int r6 = r0.f6075h
                if (r18 <= 0) goto L_0x0213
                p.g r10 = p.g.this
                int r10 = r10.m1
                int r6 = r6 + r10
            L_0x0213:
                if (r17 == 0) goto L_0x0235
                p.d r10 = r3.f5999Q
                p.d r11 = r0.f6073f
                r10.a(r11, r6)
                if (r19 == 0) goto L_0x0227
                p.d r6 = r3.f5997O
                p.d r10 = r0.f6071d
                int r11 = r0.f6077j
                r6.a(r10, r11)
            L_0x0227:
                if (r18 <= 0) goto L_0x0252
                p.d r6 = r0.f6073f
                p.e r6 = r6.f5963d
                p.d r6 = r6.f5997O
                p.d r10 = r3.f5999Q
            L_0x0231:
                r6.a(r10, r2)
                goto L_0x0252
            L_0x0235:
                p.d r10 = r3.f5997O
                p.d r11 = r0.f6071d
                r10.a(r11, r6)
                if (r19 == 0) goto L_0x0247
                p.d r6 = r3.f5999Q
                p.d r10 = r0.f6073f
                int r11 = r0.f6077j
                r6.a(r10, r11)
            L_0x0247:
                if (r18 <= 0) goto L_0x0252
                p.d r6 = r0.f6071d
                p.e r6 = r6.f5963d
                p.d r6 = r6.f5999Q
                p.d r10 = r3.f5997O
                goto L_0x0231
            L_0x0252:
                r6 = 0
            L_0x0253:
                if (r6 >= r1) goto L_0x0353
                int r10 = r0.f6081n
                int r10 = r10 + r6
                p.g r11 = p.g.this
                int r11 = r11.y1
                if (r10 < r11) goto L_0x0262
                goto L_0x0353
            L_0x0262:
                p.g r10 = p.g.this
                p.e[] r10 = r10.x1
                int r11 = r0.f6081n
                int r11 = r11 + r6
                r10 = r10[r11]
                if (r10 != 0) goto L_0x0272
                r12 = 1
                goto L_0x034f
            L_0x0272:
                if (r6 != 0) goto L_0x02be
                p.d r11 = r10.f5998P
                p.d r12 = r0.f6072e
                int r13 = r0.f6076i
                r10.k(r11, r12, r13)
                p.g r11 = p.g.this
                int r11 = r11.b1
                p.g r12 = p.g.this
                float r12 = r12.h1
                int r13 = r0.f6081n
                if (r13 != 0) goto L_0x02a2
                p.g r13 = p.g.this
                int r13 = r13.d1
                if (r13 == r5) goto L_0x02a2
                p.g r11 = p.g.this
                int r11 = r11.d1
                p.g r12 = p.g.this
                float r12 = r12.j1
                goto L_0x02b8
            L_0x02a2:
                if (r19 == 0) goto L_0x02b8
                p.g r13 = p.g.this
                int r13 = r13.f1
                if (r13 == r5) goto L_0x02b8
                p.g r11 = p.g.this
                int r11 = r11.f1
                p.g r12 = p.g.this
                float r12 = r12.l1
            L_0x02b8:
                r10.e1(r11)
                r10.d1(r12)
            L_0x02be:
                int r11 = r1 + -1
                if (r6 != r11) goto L_0x02cb
                p.d r11 = r10.f6000R
                p.d r12 = r0.f6074g
                int r13 = r0.f6078k
                r10.k(r11, r12, r13)
            L_0x02cb:
                if (r9 == 0) goto L_0x02f6
                p.d r11 = r10.f5998P
                p.d r12 = r9.f6000R
                p.g r13 = p.g.this
                int r13 = r13.n1
                r11.a(r12, r13)
                if (r6 != r7) goto L_0x02e3
                p.d r11 = r10.f5998P
                int r12 = r0.f6076i
                r11.u(r12)
            L_0x02e3:
                p.d r11 = r9.f6000R
                p.d r12 = r10.f5998P
                r11.a(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r6 != r12) goto L_0x02f6
                p.d r9 = r9.f6000R
                int r11 = r0.f6078k
                r9.u(r11)
            L_0x02f6:
                if (r10 == r3) goto L_0x031d
                r9 = 2
                p.g r11 = p.g.this
                int r11 = r11.o1
                if (r17 == 0) goto L_0x031f
                if (r11 == 0) goto L_0x0310
                r12 = 1
                if (r11 == r12) goto L_0x0318
                if (r11 == r9) goto L_0x0309
                goto L_0x031d
            L_0x0309:
                p.d r9 = r10.f5997O
                p.d r11 = r3.f5997O
                r9.a(r11, r2)
            L_0x0310:
                p.d r9 = r10.f5999Q
                p.d r11 = r3.f5999Q
            L_0x0314:
                r9.a(r11, r2)
                goto L_0x031d
            L_0x0318:
                p.d r9 = r10.f5997O
                p.d r11 = r3.f5997O
                goto L_0x0314
            L_0x031d:
                r12 = 1
                goto L_0x034e
            L_0x031f:
                r12 = 1
                if (r11 == 0) goto L_0x0349
                if (r11 == r12) goto L_0x0341
                if (r11 == r9) goto L_0x0327
                goto L_0x034e
            L_0x0327:
                p.d r9 = r10.f5997O
                if (r4 == 0) goto L_0x033c
                p.d r11 = r0.f6071d
                int r13 = r0.f6075h
                r9.a(r11, r13)
                p.d r9 = r10.f5999Q
                p.d r11 = r0.f6073f
                int r13 = r0.f6077j
                r9.a(r11, r13)
                goto L_0x034e
            L_0x033c:
                p.d r11 = r3.f5997O
                r9.a(r11, r2)
            L_0x0341:
                p.d r9 = r10.f5999Q
                p.d r11 = r3.f5999Q
            L_0x0345:
                r9.a(r11, r2)
                goto L_0x034e
            L_0x0349:
                p.d r9 = r10.f5997O
                p.d r11 = r3.f5997O
                goto L_0x0345
            L_0x034e:
                r9 = r10
            L_0x034f:
                int r6 = r6 + 1
                goto L_0x0253
            L_0x0353:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p.g.a.d(boolean, int, boolean):void");
        }

        public int e() {
            if (this.f6068a == 1) {
                return this.f6080m - g.this.n1;
            }
            return this.f6080m;
        }

        public int f() {
            if (this.f6068a == 0) {
                return this.f6079l - g.this.m1;
            }
            return this.f6079l;
        }

        public void g(int i2) {
            g gVar;
            e.b A2;
            int W2;
            e.b bVar;
            int i3;
            int i4 = this.f6083p;
            if (i4 != 0) {
                int i5 = this.f6082o;
                int i6 = i2 / i4;
                int i7 = 0;
                while (i7 < i5 && this.f6081n + i7 < g.this.y1) {
                    e eVar = g.this.x1[this.f6081n + i7];
                    if (this.f6068a == 0) {
                        if (eVar != null && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f6053w == 0) {
                            gVar = g.this;
                            A2 = e.b.FIXED;
                            bVar = eVar.T();
                            i3 = eVar.x();
                            W2 = i6;
                        }
                        i7++;
                    } else {
                        if (eVar != null && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.f6055x == 0) {
                            gVar = g.this;
                            A2 = eVar.A();
                            W2 = eVar.W();
                            bVar = e.b.FIXED;
                            i3 = i6;
                        }
                        i7++;
                    }
                    gVar.D1(eVar, A2, W2, bVar, i3);
                    i7++;
                }
                h();
            }
        }

        public void i(int i2) {
            this.f6081n = i2;
        }

        public void j(int i2, d dVar, d dVar2, d dVar3, d dVar4, int i3, int i4, int i5, int i6, int i7) {
            this.f6068a = i2;
            this.f6071d = dVar;
            this.f6072e = dVar2;
            this.f6073f = dVar3;
            this.f6074g = dVar4;
            this.f6075h = i3;
            this.f6076i = i4;
            this.f6077j = i5;
            this.f6078k = i6;
            this.f6084q = i7;
        }
    }

    private void j2(boolean z2) {
        e eVar;
        float f2;
        int i2;
        if (this.w1 != null && this.v1 != null && this.u1 != null) {
            for (int i3 = 0; i3 < this.y1; i3++) {
                this.x1[i3].u0();
            }
            int[] iArr = this.w1;
            int i4 = iArr[0];
            int i5 = iArr[1];
            float f3 = this.g1;
            e eVar2 = null;
            int i6 = 0;
            while (i6 < i4) {
                if (z2) {
                    i2 = (i4 - i6) - 1;
                    f2 = 1.0f - this.g1;
                } else {
                    f2 = f3;
                    i2 = i6;
                }
                e eVar3 = this.v1[i2];
                if (!(eVar3 == null || eVar3.V() == 8)) {
                    if (i6 == 0) {
                        eVar3.k(eVar3.f5997O, this.f5997O, z1());
                        eVar3.N0(this.a1);
                        eVar3.M0(f2);
                    }
                    if (i6 == i4 - 1) {
                        eVar3.k(eVar3.f5999Q, this.f5999Q, A1());
                    }
                    if (i6 > 0 && eVar2 != null) {
                        eVar3.k(eVar3.f5997O, eVar2.f5999Q, this.m1);
                        eVar2.k(eVar2.f5999Q, eVar3.f5997O, 0);
                    }
                    eVar2 = eVar3;
                }
                i6++;
                f3 = f2;
            }
            for (int i7 = 0; i7 < i5; i7++) {
                e eVar4 = this.u1[i7];
                if (!(eVar4 == null || eVar4.V() == 8)) {
                    if (i7 == 0) {
                        eVar4.k(eVar4.f5998P, this.f5998P, B1());
                        eVar4.e1(this.b1);
                        eVar4.d1(this.h1);
                    }
                    if (i7 == i5 - 1) {
                        eVar4.k(eVar4.f6000R, this.f6000R, y1());
                    }
                    if (i7 > 0 && eVar2 != null) {
                        eVar4.k(eVar4.f5998P, eVar2.f6000R, this.n1);
                        eVar2.k(eVar2.f6000R, eVar4.f5998P, 0);
                    }
                    eVar2 = eVar4;
                }
            }
            for (int i8 = 0; i8 < i4; i8++) {
                for (int i9 = 0; i9 < i5; i9++) {
                    int i10 = (i9 * i4) + i8;
                    if (this.s1 == 1) {
                        i10 = (i8 * i5) + i9;
                    }
                    e[] eVarArr = this.x1;
                    if (!(i10 >= eVarArr.length || (eVar = eVarArr[i10]) == null || eVar.V() == 8)) {
                        e eVar5 = this.v1[i8];
                        e eVar6 = this.u1[i9];
                        if (eVar != eVar5) {
                            eVar.k(eVar.f5997O, eVar5.f5997O, 0);
                            eVar.k(eVar.f5999Q, eVar5.f5999Q, 0);
                        }
                        if (eVar != eVar6) {
                            eVar.k(eVar.f5998P, eVar6.f5998P, 0);
                            eVar.k(eVar.f6000R, eVar6.f6000R, 0);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final int k2(e eVar, int i2) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.T() == e.b.MATCH_CONSTRAINT) {
            int i3 = eVar.f6055x;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (eVar.f5987E * ((float) i2));
                if (i4 != eVar.x()) {
                    eVar.Y0(true);
                    D1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i4);
                }
                return i4;
            } else if (i3 == 1) {
                return eVar.x();
            } else {
                if (i3 == 3) {
                    return (int) ((((float) eVar.W()) * eVar.f6016d0) + 0.5f);
                }
            }
        }
        return eVar.x();
    }

    /* access modifiers changed from: private */
    public final int l2(e eVar, int i2) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == e.b.MATCH_CONSTRAINT) {
            int i3 = eVar.f6053w;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i4 = (int) (eVar.f5982B * ((float) i2));
                if (i4 != eVar.W()) {
                    eVar.Y0(true);
                    D1(eVar, e.b.FIXED, i4, eVar.T(), eVar.x());
                }
                return i4;
            } else if (i3 == 1) {
                return eVar.W();
            } else {
                if (i3 == 3) {
                    return (int) ((((float) eVar.x()) * eVar.f6016d0) + 0.5f);
                }
            }
        }
        return eVar.W();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x011b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005c  */
    private void m2(p.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            r10 = this;
            r0 = 0
            int r1 = r10.r1
            if (r13 != 0) goto L_0x0026
            if (r1 > 0) goto L_0x0023
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000a:
            if (r2 >= r12) goto L_0x0023
            if (r2 <= 0) goto L_0x0011
            int r4 = r10.m1
            int r3 = r3 + r4
        L_0x0011:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0016
            goto L_0x0020
        L_0x0016:
            int r4 = r10.l2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            int r1 = r1 + 1
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0023:
            r2 = r1
            r1 = 0
            goto L_0x0045
        L_0x0026:
            if (r1 > 0) goto L_0x0044
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x002b:
            if (r2 >= r12) goto L_0x0044
            if (r2 <= 0) goto L_0x0032
            int r4 = r10.n1
            int r3 = r3 + r4
        L_0x0032:
            r4 = r11[r2]
            if (r4 != 0) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            int r4 = r10.k2(r4, r14)
            int r3 = r3 + r4
            if (r3 <= r14) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            int r1 = r1 + 1
        L_0x0041:
            int r2 = r2 + 1
            goto L_0x002b
        L_0x0044:
            r2 = 0
        L_0x0045:
            int[] r3 = r10.w1
            if (r3 != 0) goto L_0x004e
            r3 = 2
            int[] r3 = new int[r3]
            r10.w1 = r3
        L_0x004e:
            r3 = 1
            if (r1 != 0) goto L_0x0053
            if (r13 == r3) goto L_0x0057
        L_0x0053:
            if (r2 != 0) goto L_0x0059
            if (r13 != 0) goto L_0x0059
        L_0x0057:
            r4 = 1
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            if (r4 != 0) goto L_0x011b
            if (r13 != 0) goto L_0x0068
            float r1 = (float) r12
            float r5 = (float) r2
            float r1 = r1 / r5
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r1 = (int) r5
            goto L_0x0071
        L_0x0068:
            float r2 = (float) r12
            float r5 = (float) r1
            float r2 = r2 / r5
            double r5 = (double) r2
            double r5 = java.lang.Math.ceil(r5)
            int r2 = (int) r5
        L_0x0071:
            p.e[] r5 = r10.v1
            r6 = 0
            if (r5 == 0) goto L_0x007e
            int r7 = r5.length
            if (r7 >= r2) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0082
        L_0x007e:
            p.e[] r5 = new p.e[r2]
            r10.v1 = r5
        L_0x0082:
            p.e[] r5 = r10.u1
            if (r5 == 0) goto L_0x008e
            int r7 = r5.length
            if (r7 >= r1) goto L_0x008a
            goto L_0x008e
        L_0x008a:
            java.util.Arrays.fill(r5, r6)
            goto L_0x0092
        L_0x008e:
            p.e[] r5 = new p.e[r1]
            r10.u1 = r5
        L_0x0092:
            r5 = 0
        L_0x0093:
            if (r5 >= r2) goto L_0x00d7
            r6 = 0
        L_0x0096:
            if (r6 >= r1) goto L_0x00d4
            int r7 = r6 * r2
            int r7 = r7 + r5
            if (r13 != r3) goto L_0x00a0
            int r7 = r5 * r1
            int r7 = r7 + r6
        L_0x00a0:
            int r8 = r11.length
            if (r7 < r8) goto L_0x00a4
            goto L_0x00d1
        L_0x00a4:
            r7 = r11[r7]
            if (r7 != 0) goto L_0x00a9
            goto L_0x00d1
        L_0x00a9:
            int r8 = r10.l2(r7, r14)
            p.e[] r9 = r10.v1
            r9 = r9[r5]
            if (r9 == 0) goto L_0x00b9
            int r9 = r9.W()
            if (r9 >= r8) goto L_0x00bd
        L_0x00b9:
            p.e[] r8 = r10.v1
            r8[r5] = r7
        L_0x00bd:
            int r8 = r10.k2(r7, r14)
            p.e[] r9 = r10.u1
            r9 = r9[r6]
            if (r9 == 0) goto L_0x00cd
            int r9 = r9.x()
            if (r9 >= r8) goto L_0x00d1
        L_0x00cd:
            p.e[] r8 = r10.u1
            r8[r6] = r7
        L_0x00d1:
            int r6 = r6 + 1
            goto L_0x0096
        L_0x00d4:
            int r5 = r5 + 1
            goto L_0x0093
        L_0x00d7:
            r5 = 0
            r6 = 0
        L_0x00d9:
            if (r5 >= r2) goto L_0x00ee
            p.e[] r7 = r10.v1
            r7 = r7[r5]
            if (r7 == 0) goto L_0x00eb
            if (r5 <= 0) goto L_0x00e6
            int r8 = r10.m1
            int r6 = r6 + r8
        L_0x00e6:
            int r7 = r10.l2(r7, r14)
            int r6 = r6 + r7
        L_0x00eb:
            int r5 = r5 + 1
            goto L_0x00d9
        L_0x00ee:
            r5 = 0
            r7 = 0
        L_0x00f0:
            if (r5 >= r1) goto L_0x0105
            p.e[] r8 = r10.u1
            r8 = r8[r5]
            if (r8 == 0) goto L_0x0102
            if (r5 <= 0) goto L_0x00fd
            int r9 = r10.n1
            int r7 = r7 + r9
        L_0x00fd:
            int r8 = r10.k2(r8, r14)
            int r7 = r7 + r8
        L_0x0102:
            int r5 = r5 + 1
            goto L_0x00f0
        L_0x0105:
            r15[r0] = r6
            r15[r3] = r7
            if (r13 != 0) goto L_0x0113
            if (r6 <= r14) goto L_0x0057
            if (r2 <= r3) goto L_0x0057
            int r2 = r2 + -1
            goto L_0x005a
        L_0x0113:
            if (r7 <= r14) goto L_0x0057
            if (r1 <= r3) goto L_0x0057
            int r1 = r1 + -1
            goto L_0x005a
        L_0x011b:
            int[] r11 = r10.w1
            r11[r0] = r2
            r11[r3] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g.m2(p.e[], int, int, int, int[]):void");
    }

    private void n2(e[] eVarArr, int i2, int i3, int i4, int[] iArr) {
        d dVar;
        int i5;
        int i6;
        int i7;
        d dVar2;
        int i8;
        int i9;
        int i10;
        int i11 = i2;
        int i12 = i4;
        if (i11 != 0) {
            this.t1.clear();
            a aVar = new a(i3, this.f5997O, this.f5998P, this.f5999Q, this.f6000R, i4);
            this.t1.add(aVar);
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            if (i3 == 0) {
                while (i15 < i11) {
                    e eVar = eVarArr[i15];
                    int l2 = l2(eVar, i12);
                    if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                        i13++;
                    }
                    int i16 = i13;
                    boolean z2 = (i14 == i12 || (this.m1 + i14) + l2 > i12) && aVar.f6069b != null;
                    if (!z2 && i15 > 0 && (i10 = this.r1) > 0 && i15 % i10 == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new a(i3, this.f5997O, this.f5998P, this.f5999Q, this.f6000R, i4);
                        aVar.i(i15);
                        this.t1.add(aVar);
                    } else if (i15 > 0) {
                        i14 += this.m1 + l2;
                        aVar.b(eVar);
                        i15++;
                        i13 = i16;
                    }
                    i14 = l2;
                    aVar.b(eVar);
                    i15++;
                    i13 = i16;
                }
            } else {
                while (i15 < i11) {
                    e eVar2 = eVarArr[i15];
                    int k2 = k2(eVar2, i12);
                    if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                        i13++;
                    }
                    int i17 = i13;
                    boolean z3 = (i14 == i12 || (this.n1 + i14) + k2 > i12) && aVar.f6069b != null;
                    if (!z3 && i15 > 0 && (i9 = this.r1) > 0 && i15 % i9 == 0) {
                        z3 = true;
                    }
                    if (z3) {
                        aVar = new a(i3, this.f5997O, this.f5998P, this.f5999Q, this.f6000R, i4);
                        aVar.i(i15);
                        this.t1.add(aVar);
                    } else if (i15 > 0) {
                        i8 = i14 + this.n1 + k2;
                        aVar.b(eVar2);
                        i15++;
                        i13 = i17;
                    }
                    i8 = k2;
                    aVar.b(eVar2);
                    i15++;
                    i13 = i17;
                }
            }
            int size = this.t1.size();
            d dVar3 = this.f5997O;
            d dVar4 = this.f5998P;
            d dVar5 = this.f5999Q;
            d dVar6 = this.f6000R;
            int z1 = z1();
            int B1 = B1();
            int A1 = A1();
            int y12 = y1();
            e.b A2 = A();
            e.b bVar = e.b.WRAP_CONTENT;
            boolean z4 = A2 == bVar || T() == bVar;
            if (i13 > 0 && z4) {
                for (int i18 = 0; i18 < size; i18++) {
                    a aVar2 = (a) this.t1.get(i18);
                    aVar2.g(i12 - (i3 == 0 ? aVar2.f() : aVar2.e()));
                }
            }
            int i19 = B1;
            int i20 = A1;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = z1;
            d dVar7 = dVar4;
            d dVar8 = dVar3;
            int i25 = y12;
            while (i23 < size) {
                a aVar3 = (a) this.t1.get(i23);
                if (i3 == 0) {
                    if (i23 < size - 1) {
                        dVar2 = ((a) this.t1.get(i23 + 1)).f6069b.f5998P;
                        i7 = 0;
                    } else {
                        dVar2 = this.f6000R;
                        i7 = y1();
                    }
                    d dVar9 = aVar3.f6069b.f6000R;
                    d dVar10 = dVar8;
                    d dVar11 = dVar8;
                    int i26 = i21;
                    d dVar12 = dVar7;
                    int i27 = i22;
                    d dVar13 = dVar5;
                    d dVar14 = dVar5;
                    i5 = i23;
                    aVar3.j(i3, dVar10, dVar12, dVar13, dVar2, i24, i19, i20, i7, i4);
                    int max = Math.max(i27, aVar3.f());
                    i21 = i26 + aVar3.e();
                    if (i5 > 0) {
                        i21 += this.n1;
                    }
                    dVar8 = dVar11;
                    i22 = max;
                    dVar7 = dVar9;
                    i19 = 0;
                    dVar = dVar14;
                    int i28 = i7;
                    dVar6 = dVar2;
                    i25 = i28;
                } else {
                    d dVar15 = dVar8;
                    int i29 = i21;
                    int i30 = i22;
                    i5 = i23;
                    if (i5 < size - 1) {
                        dVar = ((a) this.t1.get(i5 + 1)).f6069b.f5997O;
                        i6 = 0;
                    } else {
                        dVar = this.f5999Q;
                        i6 = A1();
                    }
                    d dVar16 = aVar3.f6069b.f5999Q;
                    aVar3.j(i3, dVar15, dVar7, dVar, dVar6, i24, i19, i6, i25, i4);
                    i22 = i30 + aVar3.f();
                    int max2 = Math.max(i29, aVar3.e());
                    if (i5 > 0) {
                        i22 += this.m1;
                    }
                    i21 = max2;
                    i20 = i6;
                    dVar8 = dVar16;
                    i24 = 0;
                }
                i23 = i5 + 1;
                int i31 = i4;
                dVar5 = dVar;
            }
            iArr[0] = i22;
            iArr[1] = i21;
        }
    }

    private void o2(e[] eVarArr, int i2, int i3, int i4, int[] iArr) {
        d dVar;
        int i5;
        int i6;
        int i7;
        d dVar2;
        int i8;
        int i9;
        int i10;
        int i11 = i2;
        int i12 = i4;
        if (i11 != 0) {
            this.t1.clear();
            a aVar = new a(i3, this.f5997O, this.f5998P, this.f5999Q, this.f6000R, i4);
            this.t1.add(aVar);
            int i13 = 0;
            int i14 = 0;
            if (i3 == 0) {
                int i15 = 0;
                int i16 = 0;
                while (i16 < i11) {
                    int i17 = i13 + 1;
                    e eVar = eVarArr[i16];
                    int l2 = l2(eVar, i12);
                    if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                        i14++;
                    }
                    int i18 = i14;
                    boolean z2 = (i15 == i12 || (this.m1 + i15) + l2 > i12) && aVar.f6069b != null;
                    if (!z2 && i16 > 0 && (i10 = this.r1) > 0 && i17 > i10) {
                        z2 = true;
                    }
                    if (z2) {
                        aVar = new a(i3, this.f5997O, this.f5998P, this.f5999Q, this.f6000R, i4);
                        aVar.i(i16);
                        this.t1.add(aVar);
                        i13 = i17;
                        i15 = l2;
                    } else {
                        i15 = i16 > 0 ? i15 + this.m1 + l2 : l2;
                        i13 = 0;
                    }
                    aVar.b(eVar);
                    i16++;
                    i14 = i18;
                }
            } else {
                int i19 = 0;
                while (i19 < i11) {
                    e eVar2 = eVarArr[i19];
                    int k2 = k2(eVar2, i12);
                    if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                        i14++;
                    }
                    int i20 = i14;
                    boolean z3 = (i13 == i12 || (this.n1 + i13) + k2 > i12) && aVar.f6069b != null;
                    if (!z3 && i19 > 0 && (i9 = this.r1) > 0 && i9 < 0) {
                        z3 = true;
                    }
                    if (z3) {
                        aVar = new a(i3, this.f5997O, this.f5998P, this.f5999Q, this.f6000R, i4);
                        aVar.i(i19);
                        this.t1.add(aVar);
                    } else if (i19 > 0) {
                        i8 = i13 + this.n1 + k2;
                        aVar.b(eVar2);
                        i19++;
                        i14 = i20;
                    }
                    i8 = k2;
                    aVar.b(eVar2);
                    i19++;
                    i14 = i20;
                }
            }
            int size = this.t1.size();
            d dVar3 = this.f5997O;
            d dVar4 = this.f5998P;
            d dVar5 = this.f5999Q;
            d dVar6 = this.f6000R;
            int z1 = z1();
            int B1 = B1();
            int A1 = A1();
            int y12 = y1();
            e.b A2 = A();
            e.b bVar = e.b.WRAP_CONTENT;
            boolean z4 = A2 == bVar || T() == bVar;
            if (i14 > 0 && z4) {
                for (int i21 = 0; i21 < size; i21++) {
                    a aVar2 = (a) this.t1.get(i21);
                    aVar2.g(i12 - (i3 == 0 ? aVar2.f() : aVar2.e()));
                }
            }
            int i22 = B1;
            int i23 = A1;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = z1;
            d dVar7 = dVar4;
            d dVar8 = dVar3;
            int i28 = y12;
            while (i26 < size) {
                a aVar3 = (a) this.t1.get(i26);
                if (i3 == 0) {
                    if (i26 < size - 1) {
                        dVar2 = ((a) this.t1.get(i26 + 1)).f6069b.f5998P;
                        i7 = 0;
                    } else {
                        dVar2 = this.f6000R;
                        i7 = y1();
                    }
                    d dVar9 = aVar3.f6069b.f6000R;
                    d dVar10 = dVar8;
                    d dVar11 = dVar8;
                    int i29 = i24;
                    d dVar12 = dVar7;
                    int i30 = i25;
                    d dVar13 = dVar5;
                    d dVar14 = dVar5;
                    i5 = i26;
                    aVar3.j(i3, dVar10, dVar12, dVar13, dVar2, i27, i22, i23, i7, i4);
                    int max = Math.max(i30, aVar3.f());
                    i24 = i29 + aVar3.e();
                    if (i5 > 0) {
                        i24 += this.n1;
                    }
                    dVar8 = dVar11;
                    i25 = max;
                    dVar7 = dVar9;
                    i22 = 0;
                    dVar = dVar14;
                    int i31 = i7;
                    dVar6 = dVar2;
                    i28 = i31;
                } else {
                    d dVar15 = dVar8;
                    int i32 = i24;
                    int i33 = i25;
                    i5 = i26;
                    if (i5 < size - 1) {
                        dVar = ((a) this.t1.get(i5 + 1)).f6069b.f5997O;
                        i6 = 0;
                    } else {
                        dVar = this.f5999Q;
                        i6 = A1();
                    }
                    d dVar16 = aVar3.f6069b.f5999Q;
                    aVar3.j(i3, dVar15, dVar7, dVar, dVar6, i27, i22, i6, i28, i4);
                    i25 = i33 + aVar3.f();
                    int max2 = Math.max(i32, aVar3.e());
                    if (i5 > 0) {
                        i25 += this.m1;
                    }
                    i24 = max2;
                    i23 = i6;
                    dVar8 = dVar16;
                    i27 = 0;
                }
                i26 = i5 + 1;
                int i34 = i4;
                dVar5 = dVar;
            }
            iArr[0] = i25;
            iArr[1] = i24;
        }
    }

    private void p2(e[] eVarArr, int i2, int i3, int i4, int[] iArr) {
        a aVar;
        int i5 = i2;
        if (i5 != 0) {
            if (this.t1.size() == 0) {
                aVar = new a(i3, this.f5997O, this.f5998P, this.f5999Q, this.f6000R, i4);
                this.t1.add(aVar);
            } else {
                a aVar2 = (a) this.t1.get(0);
                aVar2.c();
                aVar = aVar2;
                int i6 = i3;
                aVar.j(i6, this.f5997O, this.f5998P, this.f5999Q, this.f6000R, z1(), B1(), A1(), y1(), i4);
            }
            for (int i7 = 0; i7 < i5; i7++) {
                aVar.b(eVarArr[i7]);
            }
            iArr[0] = aVar.f();
            iArr[1] = aVar.e();
        }
    }

    public void A2(float f2) {
        this.l1 = f2;
    }

    public void B2(int i2) {
        this.f1 = i2;
    }

    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r11v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r6.b1 == -1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r6.b1 == -1) goto L_0x0049;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0114  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C1(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            int r0 = r6.M0
            r11 = 0
            if (r0 <= 0) goto L_0x001c
            boolean r0 = r18.E1()
            if (r0 != 0) goto L_0x001c
            r6.H1(r11, r11)
            r6.G1(r11)
            return
        L_0x001c:
            int r12 = r18.z1()
            int r13 = r18.A1()
            int r14 = r18.B1()
            int r15 = r18.y1()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r12
            int r1 = r1 - r13
            int r2 = r6.s1
            r4 = 1
            if (r2 != r4) goto L_0x003a
            int r1 = r10 - r14
            int r1 = r1 - r15
        L_0x003a:
            r16 = r1
            r1 = -1
            if (r2 != 0) goto L_0x004c
            int r2 = r6.a1
            if (r2 != r1) goto L_0x0045
            r6.a1 = r11
        L_0x0045:
            int r2 = r6.b1
            if (r2 != r1) goto L_0x0057
        L_0x0049:
            r6.b1 = r11
            goto L_0x0057
        L_0x004c:
            int r2 = r6.a1
            if (r2 != r1) goto L_0x0052
            r6.a1 = r11
        L_0x0052:
            int r2 = r6.b1
            if (r2 != r1) goto L_0x0057
            goto L_0x0049
        L_0x0057:
            p.e[] r1 = r6.L0
            r2 = 0
            r3 = 0
        L_0x005b:
            int r11 = r6.M0
            r0 = 8
            if (r2 >= r11) goto L_0x0071
            p.e[] r11 = r6.L0
            r11 = r11[r2]
            int r11 = r11.V()
            if (r11 != r0) goto L_0x006d
            int r3 = r3 + 1
        L_0x006d:
            int r2 = r2 + 1
            r0 = 2
            goto L_0x005b
        L_0x0071:
            if (r3 <= 0) goto L_0x0090
            int r11 = r11 - r3
            p.e[] r1 = new p.e[r11]
            r2 = 0
            r3 = 0
        L_0x0078:
            int r11 = r6.M0
            if (r2 >= r11) goto L_0x008e
            p.e[] r11 = r6.L0
            r11 = r11[r2]
            int r4 = r11.V()
            if (r4 == r0) goto L_0x008a
            r1[r3] = r11
            int r3 = r3 + 1
        L_0x008a:
            int r2 = r2 + 1
            r4 = 1
            goto L_0x0078
        L_0x008e:
            r2 = r3
            goto L_0x0091
        L_0x0090:
            r2 = r11
        L_0x0091:
            r6.x1 = r1
            r6.y1 = r2
            int r0 = r6.q1
            if (r0 == 0) goto L_0x00cf
            r4 = 1
            if (r0 == r4) goto L_0x00c2
            r3 = 2
            if (r0 == r3) goto L_0x00b5
            r3 = 3
            if (r0 == r3) goto L_0x00a7
            r17 = r5
            r0 = 0
            r11 = 1
            goto L_0x00dc
        L_0x00a7:
            int r3 = r6.s1
            r0 = r18
            r11 = 1
            r4 = r16
            r17 = r5
            r0.o2(r1, r2, r3, r4, r5)
        L_0x00b3:
            r0 = 0
            goto L_0x00dc
        L_0x00b5:
            r17 = r5
            r11 = 1
            int r3 = r6.s1
            r0 = r18
            r4 = r16
            r0.m2(r1, r2, r3, r4, r5)
            goto L_0x00b3
        L_0x00c2:
            r17 = r5
            r11 = 1
            int r3 = r6.s1
            r0 = r18
            r4 = r16
            r0.n2(r1, r2, r3, r4, r5)
            goto L_0x00b3
        L_0x00cf:
            r17 = r5
            r11 = 1
            int r3 = r6.s1
            r0 = r18
            r4 = r16
            r0.p2(r1, r2, r3, r4, r5)
            goto L_0x00b3
        L_0x00dc:
            r1 = r17[r0]
            int r1 = r1 + r12
            int r1 = r1 + r13
            r2 = r17[r11]
            int r2 = r2 + r14
            int r2 = r2 + r15
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r7 != r4) goto L_0x00ec
            r1 = r8
            goto L_0x00f7
        L_0x00ec:
            if (r7 != r3) goto L_0x00f3
            int r1 = java.lang.Math.min(r1, r8)
            goto L_0x00f7
        L_0x00f3:
            if (r7 != 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r1 = 0
        L_0x00f7:
            if (r9 != r4) goto L_0x00fb
            r2 = r10
            goto L_0x0106
        L_0x00fb:
            if (r9 != r3) goto L_0x0102
            int r2 = java.lang.Math.min(r2, r10)
            goto L_0x0106
        L_0x0102:
            if (r9 != 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r2 = 0
        L_0x0106:
            r6.H1(r1, r2)
            r6.k1(r1)
            r6.L0(r2)
            int r1 = r6.M0
            if (r1 <= 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r11 = 0
        L_0x0115:
            r6.G1(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g.C1(int, int, int, int):void");
    }

    public void C2(int i2) {
        this.r1 = i2;
    }

    public void D2(int i2) {
        this.s1 = i2;
    }

    public void E2(int i2) {
        this.p1 = i2;
    }

    public void F2(float f2) {
        this.h1 = f2;
    }

    public void G2(int i2) {
        this.n1 = i2;
    }

    public void H2(int i2) {
        this.b1 = i2;
    }

    public void I2(int i2) {
        this.q1 = i2;
    }

    public void g(C0259d dVar, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        super.g(dVar, z2);
        if (K() == null || !((f) K()).P1()) {
            z3 = false;
        } else {
            z3 = true;
        }
        int i2 = this.q1;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = this.t1.size();
                for (int i3 = 0; i3 < size; i3++) {
                    a aVar = (a) this.t1.get(i3);
                    if (i3 == size - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    aVar.d(z3, i3, z4);
                }
            } else if (i2 == 2) {
                j2(z3);
            } else if (i2 == 3) {
                int size2 = this.t1.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    a aVar2 = (a) this.t1.get(i4);
                    if (i4 == size2 - 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    aVar2.d(z3, i4, z5);
                }
            }
        } else if (this.t1.size() > 0) {
            ((a) this.t1.get(0)).d(z3, 0, true);
        }
        G1(false);
    }

    public void q2(float f2) {
        this.i1 = f2;
    }

    public void r2(int i2) {
        this.c1 = i2;
    }

    public void s2(float f2) {
        this.j1 = f2;
    }

    public void t2(int i2) {
        this.d1 = i2;
    }

    public void u2(int i2) {
        this.o1 = i2;
    }

    public void v2(float f2) {
        this.g1 = f2;
    }

    public void w2(int i2) {
        this.m1 = i2;
    }

    public void x2(int i2) {
        this.a1 = i2;
    }

    public void y2(float f2) {
        this.k1 = f2;
    }

    public void z2(int i2) {
        this.e1 = i2;
    }
}
