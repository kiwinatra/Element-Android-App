package p;

import m.C0259d;
import m.i;
import p.d;
import p.e;

public class h extends e {
    protected float L0 = -1.0f;
    protected int M0 = -1;
    protected int N0 = -1;
    protected boolean O0 = true;
    private d P0 = this.f5998P;
    private int Q0;
    private int R0;
    private boolean S0;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6086a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                p.d$b[] r0 = p.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6086a = r0
                p.d$b r1 = p.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6086a     // Catch:{ NoSuchFieldError -> 0x001d }
                p.d$b r1 = p.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6086a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p.d$b r1 = p.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6086a     // Catch:{ NoSuchFieldError -> 0x0033 }
                p.d$b r1 = p.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6086a     // Catch:{ NoSuchFieldError -> 0x003e }
                p.d$b r1 = p.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f6086a     // Catch:{ NoSuchFieldError -> 0x0049 }
                p.d$b r1 = p.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f6086a     // Catch:{ NoSuchFieldError -> 0x0054 }
                p.d$b r1 = p.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f6086a     // Catch:{ NoSuchFieldError -> 0x0060 }
                p.d$b r1 = p.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f6086a     // Catch:{ NoSuchFieldError -> 0x006c }
                p.d$b r1 = p.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p.h.a.<clinit>():void");
        }
    }

    public h() {
        this.Q0 = 0;
        this.R0 = 0;
        this.f6006X.clear();
        this.f6006X.add(this.P0);
        int length = this.f6005W.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f6005W[i2] = this.P0;
        }
    }

    public void A1(int i2) {
        d dVar;
        if (this.Q0 != i2) {
            this.Q0 = i2;
            this.f6006X.clear();
            if (this.Q0 == 1) {
                dVar = this.f5997O;
            } else {
                dVar = this.f5998P;
            }
            this.P0 = dVar;
            this.f6006X.add(this.P0);
            int length = this.f6005W.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.f6005W[i3] = this.P0;
            }
        }
    }

    public void g(C0259d dVar, boolean z2) {
        boolean z3;
        f fVar = (f) K();
        if (fVar != null) {
            d o2 = fVar.o(d.b.LEFT);
            d o3 = fVar.o(d.b.RIGHT);
            e eVar = this.f6010a0;
            boolean z4 = true;
            if (eVar == null || eVar.f6008Z[0] != e.b.WRAP_CONTENT) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.Q0 == 0) {
                o2 = fVar.o(d.b.TOP);
                o3 = fVar.o(d.b.BOTTOM);
                e eVar2 = this.f6010a0;
                if (eVar2 == null || eVar2.f6008Z[1] != e.b.WRAP_CONTENT) {
                    z4 = false;
                }
                z3 = z4;
            }
            if (this.S0 && this.P0.n()) {
                i q2 = dVar.q(this.P0);
                dVar.f(q2, this.P0.e());
                if (this.M0 != -1) {
                    if (z3) {
                        dVar.h(dVar.q(o3), q2, 0, 5);
                    }
                } else if (this.N0 != -1 && z3) {
                    i q3 = dVar.q(o3);
                    dVar.h(q2, dVar.q(o2), 0, 5);
                    dVar.h(q3, q2, 0, 5);
                }
                this.S0 = false;
            } else if (this.M0 != -1) {
                i q4 = dVar.q(this.P0);
                dVar.e(q4, dVar.q(o2), this.M0, 8);
                if (z3) {
                    dVar.h(dVar.q(o3), q4, 0, 5);
                }
            } else if (this.N0 != -1) {
                i q5 = dVar.q(this.P0);
                i q6 = dVar.q(o3);
                dVar.e(q5, q6, -this.N0, 8);
                if (z3) {
                    dVar.h(q5, dVar.q(o2), 0, 5);
                    dVar.h(q6, q5, 0, 5);
                }
            } else if (this.L0 != -1.0f) {
                dVar.d(C0259d.s(dVar, dVar.q(this.P0), dVar.q(o3), this.L0));
            }
        }
    }

    public boolean h() {
        return true;
    }

    public boolean n0() {
        return this.S0;
    }

    public d o(d.b bVar) {
        int i2 = a.f6086a[bVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (this.Q0 == 1) {
                return this.P0;
            }
            return null;
        } else if ((i2 == 3 || i2 == 4) && this.Q0 == 0) {
            return this.P0;
        } else {
            return null;
        }
    }

    public boolean o0() {
        return this.S0;
    }

    public void q1(C0259d dVar, boolean z2) {
        if (K() != null) {
            int x2 = dVar.x(this.P0);
            if (this.Q0 == 1) {
                m1(x2);
                n1(0);
                L0(K().x());
                k1(0);
                return;
            }
            m1(0);
            n1(x2);
            k1(K().W());
            L0(0);
        }
    }

    public d r1() {
        return this.P0;
    }

    public int s1() {
        return this.Q0;
    }

    public int t1() {
        return this.M0;
    }

    public int u1() {
        return this.N0;
    }

    public float v1() {
        return this.L0;
    }

    public void w1(int i2) {
        this.P0.t(i2);
        this.S0 = true;
    }

    public void x1(int i2) {
        if (i2 > -1) {
            this.L0 = -1.0f;
            this.M0 = i2;
            this.N0 = -1;
        }
    }

    public void y1(int i2) {
        if (i2 > -1) {
            this.L0 = -1.0f;
            this.M0 = -1;
            this.N0 = i2;
        }
    }

    public void z1(float f2) {
        if (f2 > -1.0f) {
            this.L0 = f2;
            this.M0 = -1;
            this.N0 = -1;
        }
    }
}
