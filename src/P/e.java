package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m.C0258c;
import m.C0259d;
import o.C0263a;
import p.d;
import q.C0279c;
import q.f;
import q.l;
import q.n;
import q.p;

public class e {
    public static float K0 = 0.5f;

    /* renamed from: A  reason: collision with root package name */
    public int f5980A = 0;

    /* renamed from: A0  reason: collision with root package name */
    int f5981A0;

    /* renamed from: B  reason: collision with root package name */
    public float f5982B = 1.0f;

    /* renamed from: B0  reason: collision with root package name */
    boolean f5983B0;

    /* renamed from: C  reason: collision with root package name */
    public int f5984C = 0;

    /* renamed from: C0  reason: collision with root package name */
    boolean f5985C0;

    /* renamed from: D  reason: collision with root package name */
    public int f5986D = 0;
    public float[] D0;

    /* renamed from: E  reason: collision with root package name */
    public float f5987E = 1.0f;
    protected e[] E0;

    /* renamed from: F  reason: collision with root package name */
    int f5988F = -1;
    protected e[] F0;

    /* renamed from: G  reason: collision with root package name */
    float f5989G = 1.0f;
    e G0;

    /* renamed from: H  reason: collision with root package name */
    private int[] f5990H = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    e H0;

    /* renamed from: I  reason: collision with root package name */
    private float f5991I = 0.0f;
    public int I0;

    /* renamed from: J  reason: collision with root package name */
    private boolean f5992J = false;
    public int J0;

    /* renamed from: K  reason: collision with root package name */
    private boolean f5993K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f5994L = false;

    /* renamed from: M  reason: collision with root package name */
    private int f5995M = 0;

    /* renamed from: N  reason: collision with root package name */
    private int f5996N = 0;

    /* renamed from: O  reason: collision with root package name */
    public d f5997O = new d(this, d.b.LEFT);

    /* renamed from: P  reason: collision with root package name */
    public d f5998P = new d(this, d.b.TOP);

    /* renamed from: Q  reason: collision with root package name */
    public d f5999Q = new d(this, d.b.RIGHT);

    /* renamed from: R  reason: collision with root package name */
    public d f6000R = new d(this, d.b.BOTTOM);

    /* renamed from: S  reason: collision with root package name */
    public d f6001S = new d(this, d.b.BASELINE);

    /* renamed from: T  reason: collision with root package name */
    d f6002T = new d(this, d.b.CENTER_X);

    /* renamed from: U  reason: collision with root package name */
    d f6003U = new d(this, d.b.CENTER_Y);

    /* renamed from: V  reason: collision with root package name */
    public d f6004V;

    /* renamed from: W  reason: collision with root package name */
    public d[] f6005W;

    /* renamed from: X  reason: collision with root package name */
    protected ArrayList f6006X;

    /* renamed from: Y  reason: collision with root package name */
    private boolean[] f6007Y;

    /* renamed from: Z  reason: collision with root package name */
    public b[] f6008Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6009a = false;

    /* renamed from: a0  reason: collision with root package name */
    public e f6010a0;

    /* renamed from: b  reason: collision with root package name */
    public p[] f6011b = new p[2];

    /* renamed from: b0  reason: collision with root package name */
    int f6012b0;

    /* renamed from: c  reason: collision with root package name */
    public C0279c f6013c;

    /* renamed from: c0  reason: collision with root package name */
    int f6014c0;

    /* renamed from: d  reason: collision with root package name */
    public C0279c f6015d;

    /* renamed from: d0  reason: collision with root package name */
    public float f6016d0;

    /* renamed from: e  reason: collision with root package name */
    public l f6017e = null;

    /* renamed from: e0  reason: collision with root package name */
    protected int f6018e0;

    /* renamed from: f  reason: collision with root package name */
    public n f6019f = null;

    /* renamed from: f0  reason: collision with root package name */
    protected int f6020f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f6021g = {true, true};

    /* renamed from: g0  reason: collision with root package name */
    protected int f6022g0;

    /* renamed from: h  reason: collision with root package name */
    boolean f6023h = false;

    /* renamed from: h0  reason: collision with root package name */
    int f6024h0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6025i = true;

    /* renamed from: i0  reason: collision with root package name */
    int f6026i0;

    /* renamed from: j  reason: collision with root package name */
    private boolean f6027j = false;

    /* renamed from: j0  reason: collision with root package name */
    protected int f6028j0;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6029k = true;

    /* renamed from: k0  reason: collision with root package name */
    protected int f6030k0;

    /* renamed from: l  reason: collision with root package name */
    private int f6031l = -1;

    /* renamed from: l0  reason: collision with root package name */
    int f6032l0;

    /* renamed from: m  reason: collision with root package name */
    private int f6033m = -1;

    /* renamed from: m0  reason: collision with root package name */
    protected int f6034m0;

    /* renamed from: n  reason: collision with root package name */
    public C0263a f6035n = new C0263a(this);

    /* renamed from: n0  reason: collision with root package name */
    protected int f6036n0;

    /* renamed from: o  reason: collision with root package name */
    public String f6037o;

    /* renamed from: o0  reason: collision with root package name */
    float f6038o0;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6039p = false;

    /* renamed from: p0  reason: collision with root package name */
    float f6040p0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6041q = false;

    /* renamed from: q0  reason: collision with root package name */
    private Object f6042q0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6043r = false;

    /* renamed from: r0  reason: collision with root package name */
    private int f6044r0;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6045s = false;

    /* renamed from: s0  reason: collision with root package name */
    private int f6046s0;

    /* renamed from: t  reason: collision with root package name */
    public int f6047t = -1;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f6048t0;

    /* renamed from: u  reason: collision with root package name */
    public int f6049u = -1;

    /* renamed from: u0  reason: collision with root package name */
    private String f6050u0;

    /* renamed from: v  reason: collision with root package name */
    private int f6051v = 0;

    /* renamed from: v0  reason: collision with root package name */
    private String f6052v0;

    /* renamed from: w  reason: collision with root package name */
    public int f6053w = 0;

    /* renamed from: w0  reason: collision with root package name */
    boolean f6054w0;

    /* renamed from: x  reason: collision with root package name */
    public int f6055x = 0;

    /* renamed from: x0  reason: collision with root package name */
    boolean f6056x0;

    /* renamed from: y  reason: collision with root package name */
    public int[] f6057y = new int[2];

    /* renamed from: y0  reason: collision with root package name */
    boolean f6058y0;

    /* renamed from: z  reason: collision with root package name */
    public int f6059z = 0;

    /* renamed from: z0  reason: collision with root package name */
    int f6060z0;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6061a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f6062b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                p.e$b[] r0 = p.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6062b = r0
                r1 = 1
                p.e$b r2 = p.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6062b     // Catch:{ NoSuchFieldError -> 0x001d }
                p.e$b r3 = p.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6062b     // Catch:{ NoSuchFieldError -> 0x0028 }
                p.e$b r4 = p.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f6062b     // Catch:{ NoSuchFieldError -> 0x0033 }
                p.e$b r5 = p.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                p.d$b[] r4 = p.d.b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f6061a = r4
                p.d$b r5 = p.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f6061a     // Catch:{ NoSuchFieldError -> 0x004e }
                p.d$b r4 = p.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f6061a     // Catch:{ NoSuchFieldError -> 0x0058 }
                p.d$b r1 = p.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f6061a     // Catch:{ NoSuchFieldError -> 0x0062 }
                p.d$b r1 = p.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f6061a     // Catch:{ NoSuchFieldError -> 0x006d }
                p.d$b r1 = p.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f6061a     // Catch:{ NoSuchFieldError -> 0x0078 }
                p.d$b r1 = p.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f6061a     // Catch:{ NoSuchFieldError -> 0x0083 }
                p.d$b r1 = p.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f6061a     // Catch:{ NoSuchFieldError -> 0x008f }
                p.d$b r1 = p.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f6061a     // Catch:{ NoSuchFieldError -> 0x009b }
                p.d$b r1 = p.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p.e.a.<clinit>():void");
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.f6004V = dVar;
        this.f6005W = new d[]{this.f5997O, this.f5999Q, this.f5998P, this.f6000R, this.f6001S, dVar};
        this.f6006X = new ArrayList();
        this.f6007Y = new boolean[2];
        b bVar = b.FIXED;
        this.f6008Z = new b[]{bVar, bVar};
        this.f6010a0 = null;
        this.f6012b0 = 0;
        this.f6014c0 = 0;
        this.f6016d0 = 0.0f;
        this.f6018e0 = -1;
        this.f6020f0 = 0;
        this.f6022g0 = 0;
        this.f6024h0 = 0;
        this.f6026i0 = 0;
        this.f6028j0 = 0;
        this.f6030k0 = 0;
        this.f6032l0 = 0;
        float f2 = K0;
        this.f6038o0 = f2;
        this.f6040p0 = f2;
        this.f6044r0 = 0;
        this.f6046s0 = 0;
        this.f6048t0 = false;
        this.f6050u0 = null;
        this.f6052v0 = null;
        this.f6058y0 = false;
        this.f6060z0 = 0;
        this.f5981A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    private void P(StringBuilder sb, String str, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3) {
        sb.append(str);
        sb.append(" :  {\n");
        y0(sb, "      size", i2, 0);
        y0(sb, "      min", i3, 0);
        y0(sb, "      max", i4, Integer.MAX_VALUE);
        y0(sb, "      matchMin", i6, 0);
        y0(sb, "      matchDef", i7, 0);
        x0(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    private void Q(StringBuilder sb, String str, d dVar) {
        if (dVar.f5965f != null) {
            sb.append("    ");
            sb.append(str);
            sb.append(" : [ '");
            sb.append(dVar.f5965f);
            sb.append("'");
            if (!(dVar.f5967h == Integer.MIN_VALUE && dVar.f5966g == 0)) {
                sb.append(",");
                sb.append(dVar.f5966g);
                if (dVar.f5967h != Integer.MIN_VALUE) {
                    sb.append(",");
                    sb.append(dVar.f5967h);
                    sb.append(",");
                }
            }
            sb.append(" ] ,\n");
        }
    }

    private void d() {
        this.f6006X.add(this.f5997O);
        this.f6006X.add(this.f5998P);
        this.f6006X.add(this.f5999Q);
        this.f6006X.add(this.f6000R);
        this.f6006X.add(this.f6002T);
        this.f6006X.add(this.f6003U);
        this.f6006X.add(this.f6004V);
        this.f6006X.add(this.f6001S);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r4 = r0[r4 + 1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean f0(int r4) {
        /*
            r3 = this;
            int r4 = r4 * 2
            p.d[] r0 = r3.f6005W
            r1 = r0[r4]
            p.d r2 = r1.f5965f
            if (r2 == 0) goto L_0x001b
            p.d r2 = r2.f5965f
            if (r2 == r1) goto L_0x001b
            r1 = 1
            int r4 = r4 + r1
            r4 = r0[r4]
            p.d r0 = r4.f5965f
            if (r0 == 0) goto L_0x001b
            p.d r0 = r0.f5965f
            if (r0 != r4) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.f0(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:254:0x044a, code lost:
        if ((r4 instanceof p.C0264a) != false) goto L_0x044f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0435 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0502 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0530 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:367:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:371:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(m.C0259d r37, boolean r38, boolean r39, boolean r40, boolean r41, m.i r42, m.i r43, p.e.b r44, boolean r45, p.d r46, p.d r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            r36 = this;
            r0 = r36
            r10 = r37
            r11 = r42
            r12 = r43
            r13 = r46
            r14 = r47
            r15 = r50
            r1 = r51
            r2 = r59
            r3 = r60
            r4 = r61
            m.i r9 = r10.q(r13)
            m.i r8 = r10.q(r14)
            p.d r5 = r46.j()
            m.i r7 = r10.q(r5)
            p.d r5 = r47.j()
            m.i r6 = r10.q(r5)
            m.C0259d.w()
            boolean r16 = r46.o()
            boolean r17 = r47.o()
            p.d r5 = r0.f6004V
            boolean r18 = r5.o()
            if (r17 == 0) goto L_0x0044
            int r5 = r16 + 1
            goto L_0x0046
        L_0x0044:
            r5 = r16
        L_0x0046:
            if (r18 == 0) goto L_0x004a
            int r5 = r5 + 1
        L_0x004a:
            if (r53 == 0) goto L_0x004f
            r19 = 3
            goto L_0x0051
        L_0x004f:
            r19 = r58
        L_0x0051:
            int[] r20 = p.e.a.f6062b
            int r21 = r44.ordinal()
            r12 = r20[r21]
            r2 = 1
            if (r12 == r2) goto L_0x0065
            r2 = 2
            if (r12 == r2) goto L_0x0065
            r2 = 3
            if (r12 == r2) goto L_0x0065
            r2 = 4
            if (r12 == r2) goto L_0x006a
        L_0x0065:
            r12 = r19
        L_0x0067:
            r19 = 0
            goto L_0x0070
        L_0x006a:
            r12 = r19
            if (r12 == r2) goto L_0x0067
            r19 = 1
        L_0x0070:
            int r2 = r0.f6031l
            r14 = -1
            if (r2 == r14) goto L_0x007d
            if (r38 == 0) goto L_0x007d
            r0.f6031l = r14
            r49 = r2
            r19 = 0
        L_0x007d:
            int r2 = r0.f6033m
            if (r2 == r14) goto L_0x0088
            if (r38 != 0) goto L_0x0088
            r0.f6033m = r14
            r19 = 0
            goto L_0x008a
        L_0x0088:
            r2 = r49
        L_0x008a:
            int r14 = r0.f6046s0
            r49 = r2
            r2 = 8
            if (r14 != r2) goto L_0x0096
            r14 = 0
            r19 = 0
            goto L_0x0098
        L_0x0096:
            r14 = r49
        L_0x0098:
            if (r63 == 0) goto L_0x00a5
            if (r16 != 0) goto L_0x00aa
            if (r17 != 0) goto L_0x00aa
            if (r18 != 0) goto L_0x00aa
            r2 = r48
            r10.f(r9, r2)
        L_0x00a5:
            r24 = r6
            r6 = 8
            goto L_0x00b9
        L_0x00aa:
            if (r16 == 0) goto L_0x00a5
            if (r17 != 0) goto L_0x00a5
            int r2 = r46.f()
            r24 = r6
            r6 = 8
            r10.e(r9, r7, r2, r6)
        L_0x00b9:
            if (r19 != 0) goto L_0x00e4
            if (r45 == 0) goto L_0x00d2
            r2 = 3
            r6 = 0
            r10.e(r8, r9, r6, r2)
            r2 = 8
            if (r15 <= 0) goto L_0x00c9
            r10.h(r8, r9, r15, r2)
        L_0x00c9:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00d7
            r10.j(r8, r9, r1, r2)
            goto L_0x00d7
        L_0x00d2:
            r2 = 8
            r10.e(r8, r9, r14, r2)
        L_0x00d7:
            r1 = r5
            r2 = r7
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r41
        L_0x00e0:
            r24 = r3
            goto L_0x01c4
        L_0x00e4:
            r1 = 2
            if (r5 == r1) goto L_0x0107
            if (r53 != 0) goto L_0x0107
            r1 = 1
            if (r12 == r1) goto L_0x00ee
            if (r12 != 0) goto L_0x0107
        L_0x00ee:
            int r1 = java.lang.Math.max(r3, r14)
            if (r4 <= 0) goto L_0x00f8
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00f8:
            r2 = 8
            r10.e(r8, r9, r1, r2)
            r19 = r41
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r25 = 0
            goto L_0x00e0
        L_0x0107:
            r1 = -2
            if (r3 != r1) goto L_0x010c
            r2 = r14
            goto L_0x010d
        L_0x010c:
            r2 = r3
        L_0x010d:
            if (r4 != r1) goto L_0x0111
            r1 = r14
            goto L_0x0112
        L_0x0111:
            r1 = r4
        L_0x0112:
            if (r14 <= 0) goto L_0x0118
            r3 = 1
            if (r12 == r3) goto L_0x0118
            r14 = 0
        L_0x0118:
            r3 = 8
            if (r2 <= 0) goto L_0x0123
            r10.h(r8, r9, r2, r3)
            int r14 = java.lang.Math.max(r14, r2)
        L_0x0123:
            r4 = 1
            if (r1 <= 0) goto L_0x0132
            if (r39 == 0) goto L_0x012b
            if (r12 != r4) goto L_0x012b
            goto L_0x012e
        L_0x012b:
            r10.j(r8, r9, r1, r3)
        L_0x012e:
            int r14 = java.lang.Math.min(r14, r1)
        L_0x0132:
            if (r12 != r4) goto L_0x014f
            if (r39 == 0) goto L_0x013a
            r10.e(r8, r9, r14, r3)
            goto L_0x0141
        L_0x013a:
            r4 = 5
            r10.e(r8, r9, r14, r4)
            r10.j(r8, r9, r14, r3)
        L_0x0141:
            r4 = r1
            r1 = r5
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r41
            r24 = r2
            r2 = r7
            goto L_0x01c4
        L_0x014f:
            r3 = 2
            if (r12 != r3) goto L_0x01b3
            p.d$b r3 = r46.k()
            p.d$b r4 = p.d.b.TOP
            if (r3 == r4) goto L_0x017e
            p.d$b r3 = r46.k()
            p.d$b r6 = p.d.b.BOTTOM
            if (r3 != r6) goto L_0x0163
            goto L_0x017e
        L_0x0163:
            p.e r3 = r0.f6010a0
            p.d$b r4 = p.d.b.LEFT
            p.d r3 = r3.o(r4)
            m.i r3 = r10.q(r3)
            p.e r4 = r0.f6010a0
            p.d$b r6 = p.d.b.RIGHT
        L_0x0173:
            p.d r4 = r4.o(r6)
            m.i r4 = r10.q(r4)
            r14 = r3
            r6 = r4
            goto L_0x018d
        L_0x017e:
            p.e r3 = r0.f6010a0
            p.d r3 = r3.o(r4)
            m.i r3 = r10.q(r3)
            p.e r4 = r0.f6010a0
            p.d$b r6 = p.d.b.BOTTOM
            goto L_0x0173
        L_0x018d:
            m.b r3 = r37.r()
            r4 = r8
            r45 = r1
            r1 = r5
            r5 = r9
            r15 = r24
            r51 = r2
            r2 = r7
            r7 = r14
            r14 = r8
            r8 = r62
            m.b r3 = r3.k(r4, r5, r6, r7, r8)
            r10.d(r3)
            if (r39 == 0) goto L_0x01aa
            r19 = 0
        L_0x01aa:
            r4 = r45
            r24 = r51
            r25 = r19
            r19 = r41
            goto L_0x01c4
        L_0x01b3:
            r45 = r1
            r51 = r2
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r4 = r45
            r24 = r51
            r25 = r19
            r19 = 1
        L_0x01c4:
            if (r63 == 0) goto L_0x01c8
            if (r55 == 0) goto L_0x01d3
        L_0x01c8:
            r5 = r43
            r8 = r9
            r3 = 0
            r7 = 2
            r13 = 8
            r18 = 1
            goto L_0x052e
        L_0x01d3:
            if (r16 != 0) goto L_0x01de
            if (r17 != 0) goto L_0x01de
            if (r18 != 0) goto L_0x01de
        L_0x01d9:
            r2 = r15
            r1 = 5
            r3 = 0
            goto L_0x04fe
        L_0x01de:
            if (r16 == 0) goto L_0x01f7
            if (r17 != 0) goto L_0x01f7
            p.d r1 = r13.f5965f
            p.e r1 = r1.f5963d
            if (r39 == 0) goto L_0x01ef
            boolean r1 = r1 instanceof p.C0264a
            if (r1 == 0) goto L_0x01ef
            r2 = 8
            goto L_0x01f0
        L_0x01ef:
            r2 = 5
        L_0x01f0:
            r20 = r39
            r1 = r2
        L_0x01f3:
            r2 = r15
        L_0x01f4:
            r3 = 0
            goto L_0x0500
        L_0x01f7:
            if (r16 != 0) goto L_0x0225
            if (r17 == 0) goto L_0x0225
            int r1 = r47.f()
            int r1 = -r1
            r2 = 8
            r10.e(r14, r15, r1, r2)
            if (r39 == 0) goto L_0x01d9
            boolean r1 = r0.f6027j
            if (r1 == 0) goto L_0x021f
            boolean r1 = r9.f5875g
            if (r1 == 0) goto L_0x021f
            p.e r1 = r0.f6010a0
            if (r1 == 0) goto L_0x021f
            p.f r1 = (p.f) r1
            if (r38 == 0) goto L_0x021b
            r1.z1(r13)
            goto L_0x01d9
        L_0x021b:
            r1.E1(r13)
            goto L_0x01d9
        L_0x021f:
            r1 = 0
            r2 = 5
            r10.h(r9, r11, r1, r2)
            goto L_0x01d9
        L_0x0225:
            r1 = 0
            if (r16 == 0) goto L_0x01d9
            if (r17 == 0) goto L_0x01d9
            p.d r3 = r13.f5965f
            p.e r8 = r3.f5963d
            r6 = r47
            r7 = 0
            p.d r1 = r6.f5965f
            p.e r5 = r1.f5963d
            p.e r3 = r36.K()
            r16 = 6
            if (r25 == 0) goto L_0x037b
            if (r12 != 0) goto L_0x02a6
            if (r4 != 0) goto L_0x026a
            if (r24 != 0) goto L_0x026a
            boolean r1 = r2.f5875g
            if (r1 == 0) goto L_0x025d
            boolean r1 = r15.f5875g
            if (r1 == 0) goto L_0x025d
            int r1 = r46.f()
            r4 = 8
            r10.e(r9, r2, r1, r4)
            int r1 = r47.f()
            int r1 = -r1
            r10.e(r14, r15, r1, r4)
            return
        L_0x025d:
            r4 = 8
            r1 = 8
            r17 = 8
            r18 = 0
            r21 = 1
            r23 = 0
            goto L_0x0275
        L_0x026a:
            r4 = 8
            r1 = 5
            r17 = 5
            r18 = 1
            r21 = 0
            r23 = 1
        L_0x0275:
            boolean r4 = r8 instanceof p.C0264a
            if (r4 != 0) goto L_0x0294
            boolean r4 = r5 instanceof p.C0264a
            if (r4 == 0) goto L_0x027e
            goto L_0x0294
        L_0x027e:
            r4 = r43
            r22 = r17
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
            r20 = 6
        L_0x028f:
            r23 = r1
            r1 = 3
            goto L_0x03c3
        L_0x0294:
            r4 = r43
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
            r20 = 6
            r22 = 4
            goto L_0x028f
        L_0x02a6:
            r1 = 2
            r17 = 8
            if (r12 != r1) goto L_0x02d3
            boolean r1 = r8 instanceof p.C0264a
            if (r1 != 0) goto L_0x02c8
            boolean r1 = r5 instanceof p.C0264a
            if (r1 == 0) goto L_0x02b4
            goto L_0x02c8
        L_0x02b4:
            r4 = r43
            r1 = 3
            r7 = 1
            r18 = 5
            r20 = 6
            r22 = 5
        L_0x02be:
            r23 = 5
        L_0x02c0:
            r26 = 1
            r27 = 1
        L_0x02c4:
            r28 = 0
            goto L_0x03c3
        L_0x02c8:
            r4 = r43
            r1 = 3
            r7 = 1
        L_0x02cc:
            r18 = 5
            r20 = 6
            r22 = 4
            goto L_0x02be
        L_0x02d3:
            r1 = 1
            if (r12 != r1) goto L_0x02e3
            r4 = r43
            r1 = 3
            r7 = 1
            r18 = 5
            r20 = 6
            r22 = 4
            r23 = 8
            goto L_0x02c0
        L_0x02e3:
            r1 = 3
            if (r12 != r1) goto L_0x036a
            int r1 = r0.f5988F
            r7 = -1
            if (r1 != r7) goto L_0x0309
            r4 = r43
            r1 = 3
            r7 = 1
            r18 = 5
            if (r56 == 0) goto L_0x0306
            if (r39 == 0) goto L_0x0303
            r20 = 5
        L_0x02f7:
            r22 = 5
            r23 = 8
        L_0x02fb:
            r26 = 1
            r27 = 1
            r28 = 1
            goto L_0x03c3
        L_0x0303:
            r20 = 4
            goto L_0x02f7
        L_0x0306:
            r20 = 8
            goto L_0x02f7
        L_0x0309:
            if (r53 == 0) goto L_0x032e
            r1 = r59
            r7 = 2
            if (r1 == r7) goto L_0x0318
            r7 = 1
            if (r1 != r7) goto L_0x0314
            goto L_0x0319
        L_0x0314:
            r1 = 8
            r4 = 5
            goto L_0x031b
        L_0x0318:
            r7 = 1
        L_0x0319:
            r1 = 5
            r4 = 4
        L_0x031b:
            r23 = r1
            r22 = r4
            r1 = 3
            r18 = 5
            r20 = 6
            r26 = 1
            r27 = 1
            r28 = 1
            r4 = r43
            goto L_0x03c3
        L_0x032e:
            r7 = 1
            if (r4 <= 0) goto L_0x033d
            r4 = r43
            r1 = 3
            r18 = 5
            r20 = 6
            r22 = 5
        L_0x033a:
            r23 = 5
            goto L_0x02fb
        L_0x033d:
            if (r4 != 0) goto L_0x0360
            if (r24 != 0) goto L_0x0360
            if (r56 != 0) goto L_0x034d
            r4 = r43
            r1 = 3
            r18 = 5
            r20 = 6
            r22 = 8
            goto L_0x033a
        L_0x034d:
            if (r8 == r3) goto L_0x0353
            if (r5 == r3) goto L_0x0353
            r1 = 4
            goto L_0x0354
        L_0x0353:
            r1 = 5
        L_0x0354:
            r4 = r43
            r23 = r1
            r1 = 3
            r18 = 5
            r20 = 6
            r22 = 4
            goto L_0x02fb
        L_0x0360:
            r4 = r43
            r1 = 3
            r18 = 5
            r20 = 6
            r22 = 4
            goto L_0x033a
        L_0x036a:
            r7 = 1
            r4 = r43
            r18 = 5
            r20 = 6
            r22 = 4
            r23 = 5
            r26 = 0
            r27 = 0
            goto L_0x02c4
        L_0x037b:
            r7 = 1
            r17 = 8
            boolean r1 = r2.f5875g
            if (r1 == 0) goto L_0x03be
            boolean r1 = r15.f5875g
            if (r1 == 0) goto L_0x03be
            int r1 = r46.f()
            int r3 = r47.f()
            r4 = 8
            r53 = r37
            r54 = r9
            r55 = r2
            r56 = r1
            r57 = r52
            r58 = r15
            r59 = r14
            r60 = r3
            r61 = r4
            r53.c(r54, r55, r56, r57, r58, r59, r60, r61)
            if (r39 == 0) goto L_0x03bd
            if (r19 == 0) goto L_0x03bd
            p.d r1 = r6.f5965f
            if (r1 == 0) goto L_0x03b4
            int r1 = r47.f()
            r4 = r43
            goto L_0x03b7
        L_0x03b4:
            r4 = r43
            r1 = 0
        L_0x03b7:
            if (r15 == r4) goto L_0x03bd
            r2 = 5
            r10.h(r4, r14, r1, r2)
        L_0x03bd:
            return
        L_0x03be:
            r4 = r43
            r1 = 3
            goto L_0x02cc
        L_0x03c3:
            if (r26 == 0) goto L_0x03ce
            if (r2 != r15) goto L_0x03ce
            if (r8 == r3) goto L_0x03ce
            r26 = 0
            r29 = 0
            goto L_0x03d0
        L_0x03ce:
            r29 = 1
        L_0x03d0:
            if (r27 == 0) goto L_0x0418
            if (r25 != 0) goto L_0x03e5
            if (r54 != 0) goto L_0x03e5
            if (r56 != 0) goto L_0x03e5
            if (r2 != r11) goto L_0x03e5
            if (r15 != r4) goto L_0x03e5
            r20 = 0
            r23 = 8
            r27 = 8
            r29 = 0
            goto L_0x03e9
        L_0x03e5:
            r27 = r20
            r20 = r39
        L_0x03e9:
            int r30 = r46.f()
            int r31 = r47.f()
            r13 = 3
            r1 = r37
            r41 = r2
            r7 = 5
            r13 = 8
            r17 = 4
            r18 = 1
            r2 = r9
            r32 = r3
            r3 = r41
            r4 = r30
            r33 = r5
            r5 = r52
            r6 = r15
            r7 = r14
            r34 = r8
            r8 = r31
            r35 = r9
            r9 = r27
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0415:
            r2 = r29
            goto L_0x042b
        L_0x0418:
            r41 = r2
            r32 = r3
            r33 = r5
            r34 = r8
            r35 = r9
            r13 = 8
            r17 = 4
            r18 = 1
            r20 = r39
            goto L_0x0415
        L_0x042b:
            int r1 = r0.f6046s0
            if (r1 != r13) goto L_0x0436
            boolean r1 = r47.m()
            if (r1 != 0) goto L_0x0436
            return
        L_0x0436:
            r1 = r41
            if (r26 == 0) goto L_0x046b
            if (r20 == 0) goto L_0x0451
            if (r1 == r15) goto L_0x0451
            if (r25 != 0) goto L_0x0451
            r3 = r34
            boolean r4 = r3 instanceof p.C0264a
            if (r4 != 0) goto L_0x044d
            r4 = r33
            boolean r5 = r4 instanceof p.C0264a
            if (r5 == 0) goto L_0x0455
            goto L_0x044f
        L_0x044d:
            r4 = r33
        L_0x044f:
            r5 = 6
            goto L_0x0457
        L_0x0451:
            r4 = r33
            r3 = r34
        L_0x0455:
            r5 = r23
        L_0x0457:
            int r6 = r46.f()
            r8 = r35
            r10.h(r8, r1, r6, r5)
            int r6 = r47.f()
            int r6 = -r6
            r10.j(r14, r15, r6, r5)
            r23 = r5
            goto L_0x0471
        L_0x046b:
            r4 = r33
            r3 = r34
            r8 = r35
        L_0x0471:
            if (r20 == 0) goto L_0x0485
            if (r57 == 0) goto L_0x0485
            boolean r5 = r3 instanceof p.C0264a
            if (r5 != 0) goto L_0x0485
            boolean r5 = r4 instanceof p.C0264a
            if (r5 != 0) goto L_0x0485
            r5 = r32
            if (r4 == r5) goto L_0x0487
            r2 = 1
            r6 = 6
            r7 = 6
            goto L_0x048b
        L_0x0485:
            r5 = r32
        L_0x0487:
            r6 = r22
            r7 = r23
        L_0x048b:
            if (r2 == 0) goto L_0x04d4
            if (r28 == 0) goto L_0x04b5
            if (r56 == 0) goto L_0x0493
            if (r40 == 0) goto L_0x04b5
        L_0x0493:
            if (r3 == r5) goto L_0x049a
            if (r4 != r5) goto L_0x0498
            goto L_0x049a
        L_0x0498:
            r2 = r6
            goto L_0x049b
        L_0x049a:
            r2 = 6
        L_0x049b:
            boolean r9 = r3 instanceof p.h
            if (r9 != 0) goto L_0x04a3
            boolean r9 = r4 instanceof p.h
            if (r9 == 0) goto L_0x04a4
        L_0x04a3:
            r2 = 5
        L_0x04a4:
            boolean r9 = r3 instanceof p.C0264a
            if (r9 != 0) goto L_0x04ac
            boolean r9 = r4 instanceof p.C0264a
            if (r9 == 0) goto L_0x04ad
        L_0x04ac:
            r2 = 5
        L_0x04ad:
            if (r56 == 0) goto L_0x04b0
            r2 = 5
        L_0x04b0:
            int r2 = java.lang.Math.max(r2, r6)
            goto L_0x04b6
        L_0x04b5:
            r2 = r6
        L_0x04b6:
            if (r20 == 0) goto L_0x04c5
            int r2 = java.lang.Math.min(r7, r2)
            if (r53 == 0) goto L_0x04c5
            if (r56 != 0) goto L_0x04c5
            if (r3 == r5) goto L_0x04c4
            if (r4 != r5) goto L_0x04c5
        L_0x04c4:
            r2 = 4
        L_0x04c5:
            int r3 = r46.f()
            r10.e(r8, r1, r3, r2)
            int r3 = r47.f()
            int r3 = -r3
            r10.e(r14, r15, r3, r2)
        L_0x04d4:
            if (r20 == 0) goto L_0x04e5
            if (r11 != r1) goto L_0x04dd
            int r2 = r46.f()
            goto L_0x04de
        L_0x04dd:
            r2 = 0
        L_0x04de:
            if (r1 == r11) goto L_0x04e5
            r1 = 5
            r10.h(r8, r11, r2, r1)
            goto L_0x04e6
        L_0x04e5:
            r1 = 5
        L_0x04e6:
            if (r20 == 0) goto L_0x01f3
            if (r25 == 0) goto L_0x01f3
            r2 = r15
            if (r50 != 0) goto L_0x01f4
            if (r24 != 0) goto L_0x01f4
            if (r25 == 0) goto L_0x04f9
            r3 = 3
            if (r12 != r3) goto L_0x04f9
            r3 = 0
            r10.h(r14, r8, r3, r13)
            goto L_0x0500
        L_0x04f9:
            r3 = 0
            r10.h(r14, r8, r3, r1)
            goto L_0x0500
        L_0x04fe:
            r20 = r39
        L_0x0500:
            if (r20 == 0) goto L_0x052d
            if (r19 == 0) goto L_0x052d
            r4 = r47
            p.d r5 = r4.f5965f
            if (r5 == 0) goto L_0x050e
            int r3 = r47.f()
        L_0x050e:
            r5 = r43
            if (r2 == r5) goto L_0x052d
            boolean r2 = r0.f6027j
            if (r2 == 0) goto L_0x052a
            boolean r2 = r14.f5875g
            if (r2 == 0) goto L_0x052a
            p.e r2 = r0.f6010a0
            if (r2 == 0) goto L_0x052a
            p.f r2 = (p.f) r2
            if (r38 == 0) goto L_0x0526
            r2.y1(r4)
            goto L_0x0529
        L_0x0526:
            r2.D1(r4)
        L_0x0529:
            return
        L_0x052a:
            r10.h(r5, r14, r3, r1)
        L_0x052d:
            return
        L_0x052e:
            if (r1 >= r7) goto L_0x0568
            if (r39 == 0) goto L_0x0568
            if (r19 == 0) goto L_0x0568
            r10.h(r8, r11, r3, r13)
            if (r38 != 0) goto L_0x0542
            p.d r1 = r0.f6001S
            p.d r1 = r1.f5965f
            if (r1 != 0) goto L_0x0540
            goto L_0x0542
        L_0x0540:
            r2 = 0
            goto L_0x0543
        L_0x0542:
            r2 = 1
        L_0x0543:
            if (r38 != 0) goto L_0x0563
            p.d r1 = r0.f6001S
            p.d r1 = r1.f5965f
            if (r1 == 0) goto L_0x0563
            p.e r1 = r1.f5963d
            float r2 = r1.f6016d0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0562
            p.e$b[] r1 = r1.f6008Z
            r2 = r1[r3]
            p.e$b r4 = p.e.b.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x0562
            r1 = r1[r18]
            if (r1 != r4) goto L_0x0562
            r2 = 1
            goto L_0x0563
        L_0x0562:
            r2 = 0
        L_0x0563:
            if (r2 == 0) goto L_0x0568
            r10.h(r5, r14, r3, r13)
        L_0x0568:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.i(m.d, boolean, boolean, boolean, boolean, m.i, m.i, p.e$b, boolean, p.d, p.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void x0(StringBuilder sb, String str, float f2, float f3) {
        if (f2 != f3) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(f2);
            sb.append(",\n");
        }
    }

    private void y0(StringBuilder sb, String str, int i2, int i3) {
        if (i2 != i3) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(i2);
            sb.append(",\n");
        }
    }

    private void z0(StringBuilder sb, String str, float f2, int i2) {
        if (f2 != 0.0f) {
            sb.append(str);
            sb.append(" :  [");
            sb.append(f2);
            sb.append(",");
            sb.append(i2);
            sb.append("");
            sb.append("],\n");
        }
    }

    public b A() {
        return this.f6008Z[0];
    }

    public void A0(int i2) {
        boolean z2;
        this.f6032l0 = i2;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f5992J = z2;
    }

    public int B() {
        int i2;
        d dVar = this.f5997O;
        if (dVar != null) {
            i2 = dVar.f5966g;
        } else {
            i2 = 0;
        }
        d dVar2 = this.f5999Q;
        if (dVar2 != null) {
            return i2 + dVar2.f5966g;
        }
        return i2;
    }

    public void B0(Object obj) {
        this.f6042q0 = obj;
    }

    public int C() {
        return this.f5995M;
    }

    public void C0(String str) {
        this.f6050u0 = str;
    }

    public int D() {
        return this.f5996N;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0091
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x0091
        L_0x000b:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L_0x0039
            int r6 = r1 + -1
            if (r2 >= r6) goto L_0x0039
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002b
            goto L_0x0036
        L_0x002b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0035
            r3 = 1
            goto L_0x0036
        L_0x0035:
            r3 = -1
        L_0x0036:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L_0x0039:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L_0x0077
            int r1 = r1 - r4
            if (r2 >= r1) goto L_0x0077
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0087
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0087
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x0086 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0087
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0087
            if (r5 != r4) goto L_0x0071
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0088
        L_0x0071:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0088
        L_0x0077:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L_0x0087
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0088
        L_0x0086:
        L_0x0087:
            r9 = 0
        L_0x0088:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0090
            r8.f6016d0 = r9
            r8.f6018e0 = r5
        L_0x0090:
            return
        L_0x0091:
            r8.f6016d0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.D0(java.lang.String):void");
    }

    public int E(int i2) {
        if (i2 == 0) {
            return W();
        }
        if (i2 == 1) {
            return x();
        }
        return 0;
    }

    public void E0(int i2) {
        if (this.f5992J) {
            int i3 = i2 - this.f6032l0;
            int i4 = this.f6014c0 + i3;
            this.f6022g0 = i3;
            this.f5998P.t(i3);
            this.f6000R.t(i4);
            this.f6001S.t(i2);
            this.f6041q = true;
        }
    }

    public int F() {
        return this.f5990H[1];
    }

    public void F0(int i2, int i3) {
        if (!this.f6039p) {
            this.f5997O.t(i2);
            this.f5999Q.t(i3);
            this.f6020f0 = i2;
            this.f6012b0 = i3 - i2;
            this.f6039p = true;
        }
    }

    public int G() {
        return this.f5990H[0];
    }

    public void G0(int i2) {
        this.f5997O.t(i2);
        this.f6020f0 = i2;
    }

    public int H() {
        return this.f6036n0;
    }

    public void H0(int i2) {
        this.f5998P.t(i2);
        this.f6022g0 = i2;
    }

    public int I() {
        return this.f6034m0;
    }

    public void I0(int i2, int i3) {
        if (!this.f6041q) {
            this.f5998P.t(i2);
            this.f6000R.t(i3);
            this.f6022g0 = i2;
            this.f6014c0 = i3 - i2;
            if (this.f5992J) {
                this.f6001S.t(i2 + this.f6032l0);
            }
            this.f6041q = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f6000R;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p.e J(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            p.d r3 = r2.f5999Q
            p.d r0 = r3.f5965f
            if (r0 == 0) goto L_0x001f
            p.d r1 = r0.f5965f
            if (r1 != r3) goto L_0x001f
            p.e r3 = r0.f5963d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            p.d r3 = r2.f6000R
            p.d r0 = r3.f5965f
            if (r0 == 0) goto L_0x001f
            p.d r1 = r0.f5965f
            if (r1 != r3) goto L_0x001f
            p.e r3 = r0.f5963d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.J(int):p.e");
    }

    public void J0(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.f6020f0 = i2;
        this.f6022g0 = i3;
        if (this.f6046s0 == 8) {
            this.f6012b0 = 0;
            this.f6014c0 = 0;
            return;
        }
        b[] bVarArr = this.f6008Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i8 < (i7 = this.f6012b0)) {
            i8 = i7;
        }
        if (bVarArr[1] == bVar2 && i9 < (i6 = this.f6014c0)) {
            i9 = i6;
        }
        this.f6012b0 = i8;
        this.f6014c0 = i9;
        int i10 = this.f6036n0;
        if (i9 < i10) {
            this.f6014c0 = i10;
        }
        int i11 = this.f6034m0;
        if (i8 < i11) {
            this.f6012b0 = i11;
        }
        int i12 = this.f5980A;
        if (i12 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f6012b0 = Math.min(this.f6012b0, i12);
        }
        int i13 = this.f5986D;
        if (i13 > 0 && this.f6008Z[1] == b.MATCH_CONSTRAINT) {
            this.f6014c0 = Math.min(this.f6014c0, i13);
        }
        int i14 = this.f6012b0;
        if (i8 != i14) {
            this.f6031l = i14;
        }
        int i15 = this.f6014c0;
        if (i9 != i15) {
            this.f6033m = i15;
        }
    }

    public e K() {
        return this.f6010a0;
    }

    public void K0(boolean z2) {
        this.f5992J = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f5998P;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p.e L(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            p.d r3 = r2.f5997O
            p.d r0 = r3.f5965f
            if (r0 == 0) goto L_0x001f
            p.d r1 = r0.f5965f
            if (r1 != r3) goto L_0x001f
            p.e r3 = r0.f5963d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            p.d r3 = r2.f5998P
            p.d r0 = r3.f5965f
            if (r0 == 0) goto L_0x001f
            p.d r1 = r0.f5965f
            if (r1 != r3) goto L_0x001f
            p.e r3 = r0.f5963d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.L(int):p.e");
    }

    public void L0(int i2) {
        this.f6014c0 = i2;
        int i3 = this.f6036n0;
        if (i2 < i3) {
            this.f6014c0 = i3;
        }
    }

    public int M() {
        return X() + this.f6012b0;
    }

    public void M0(float f2) {
        this.f6038o0 = f2;
    }

    public p N(int i2) {
        if (i2 == 0) {
            return this.f6017e;
        }
        if (i2 == 1) {
            return this.f6019f;
        }
        return null;
    }

    public void N0(int i2) {
        this.f6060z0 = i2;
    }

    public void O(StringBuilder sb) {
        sb.append("  " + this.f6037o + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.f6012b0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f6014c0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f6020f0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f6022g0);
        sb.append("\n");
        Q(sb, "left", this.f5997O);
        Q(sb, "top", this.f5998P);
        Q(sb, "right", this.f5999Q);
        Q(sb, "bottom", this.f6000R);
        Q(sb, "baseline", this.f6001S);
        Q(sb, "centerX", this.f6002T);
        Q(sb, "centerY", this.f6003U);
        P(sb, "    width", this.f6012b0, this.f6034m0, this.f5990H[0], this.f6031l, this.f6059z, this.f6053w, this.f5982B, this.D0[0]);
        P(sb, "    height", this.f6014c0, this.f6036n0, this.f5990H[1], this.f6033m, this.f5984C, this.f6055x, this.f5987E, this.D0[1]);
        z0(sb, "    dimensionRatio", this.f6016d0, this.f6018e0);
        x0(sb, "    horizontalBias", this.f6038o0, K0);
        x0(sb, "    verticalBias", this.f6040p0, K0);
        y0(sb, "    horizontalChainStyle", this.f6060z0, 0);
        y0(sb, "    verticalChainStyle", this.f5981A0, 0);
        sb.append("  }");
    }

    public void O0(int i2, int i3) {
        this.f6020f0 = i2;
        int i4 = i3 - i2;
        this.f6012b0 = i4;
        int i5 = this.f6034m0;
        if (i4 < i5) {
            this.f6012b0 = i5;
        }
    }

    public void P0(b bVar) {
        this.f6008Z[0] = bVar;
    }

    public void Q0(int i2, int i3, int i4, float f2) {
        this.f6053w = i2;
        this.f6059z = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.f5980A = i4;
        this.f5982B = f2;
        if (f2 > 0.0f && f2 < 1.0f && i2 == 0) {
            this.f6053w = 2;
        }
    }

    public float R() {
        return this.f6040p0;
    }

    public void R0(float f2) {
        this.D0[0] = f2;
    }

    public int S() {
        return this.f5981A0;
    }

    /* access modifiers changed from: protected */
    public void S0(int i2, boolean z2) {
        this.f6007Y[i2] = z2;
    }

    public b T() {
        return this.f6008Z[1];
    }

    public void T0(boolean z2) {
        this.f5993K = z2;
    }

    public int U() {
        int i2;
        if (this.f5997O != null) {
            i2 = this.f5998P.f5966g;
        } else {
            i2 = 0;
        }
        if (this.f5999Q != null) {
            return i2 + this.f6000R.f5966g;
        }
        return i2;
    }

    public void U0(boolean z2) {
        this.f5994L = z2;
    }

    public int V() {
        return this.f6046s0;
    }

    public void V0(int i2, int i3) {
        this.f5995M = i2;
        this.f5996N = i3;
        Y0(false);
    }

    public int W() {
        if (this.f6046s0 == 8) {
            return 0;
        }
        return this.f6012b0;
    }

    public void W0(int i2) {
        this.f5990H[1] = i2;
    }

    public int X() {
        e eVar = this.f6010a0;
        if (eVar == null || !(eVar instanceof f)) {
            return this.f6020f0;
        }
        return ((f) eVar).S0 + this.f6020f0;
    }

    public void X0(int i2) {
        this.f5990H[0] = i2;
    }

    public int Y() {
        e eVar = this.f6010a0;
        if (eVar == null || !(eVar instanceof f)) {
            return this.f6022g0;
        }
        return ((f) eVar).T0 + this.f6022g0;
    }

    public void Y0(boolean z2) {
        this.f6025i = z2;
    }

    public boolean Z() {
        return this.f5992J;
    }

    public void Z0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.f6036n0 = i2;
    }

    public boolean a0(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i2 == 0) {
            if (this.f5997O.f5965f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (this.f5999Q.f5965f != null) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (i6 + i7 < 2) {
                return true;
            }
            return false;
        }
        if (this.f5998P.f5965f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (this.f6000R.f5965f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i8 = i3 + i4;
        if (this.f6001S.f5965f != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (i8 + i5 < 2) {
            return true;
        }
        return false;
    }

    public void a1(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.f6034m0 = i2;
    }

    public boolean b0() {
        int size = this.f6006X.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((d) this.f6006X.get(i2)).m()) {
                return true;
            }
        }
        return false;
    }

    public void b1(int i2, int i3) {
        this.f6020f0 = i2;
        this.f6022g0 = i3;
    }

    public boolean c0() {
        if (this.f6031l == -1 && this.f6033m == -1) {
            return false;
        }
        return true;
    }

    public void c1(e eVar) {
        this.f6010a0 = eVar;
    }

    public boolean d0(int i2, int i3) {
        d dVar;
        d dVar2;
        if (i2 == 0) {
            d dVar3 = this.f5997O.f5965f;
            if (dVar3 == null || !dVar3.n() || (dVar2 = this.f5999Q.f5965f) == null || !dVar2.n() || (this.f5999Q.f5965f.e() - this.f5999Q.f()) - (this.f5997O.f5965f.e() + this.f5997O.f()) < i3) {
                return false;
            }
            return true;
        }
        d dVar4 = this.f5998P.f5965f;
        if (dVar4 == null || !dVar4.n() || (dVar = this.f6000R.f5965f) == null || !dVar.n() || (this.f6000R.f5965f.e() - this.f6000R.f()) - (this.f5998P.f5965f.e() + this.f5998P.f()) < i3) {
            return false;
        }
        return true;
        return false;
    }

    public void d1(float f2) {
        this.f6040p0 = f2;
    }

    public void e(f fVar, C0259d dVar, HashSet hashSet, int i2, boolean z2) {
        if (z2) {
            if (hashSet.contains(this)) {
                k.a(fVar, dVar, this);
                hashSet.remove(this);
                g(dVar, fVar.T1(64));
            } else {
                return;
            }
        }
        if (i2 == 0) {
            HashSet d2 = this.f5997O.d();
            if (d2 != null) {
                Iterator it = d2.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f5963d.e(fVar, dVar, hashSet, i2, true);
                }
            }
            HashSet d3 = this.f5999Q.d();
            if (d3 != null) {
                Iterator it2 = d3.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f5963d.e(fVar, dVar, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet d4 = this.f5998P.d();
        if (d4 != null) {
            Iterator it3 = d4.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f5963d.e(fVar, dVar, hashSet, i2, true);
            }
        }
        HashSet d5 = this.f6000R.d();
        if (d5 != null) {
            Iterator it4 = d5.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f5963d.e(fVar, dVar, hashSet, i2, true);
            }
        }
        HashSet d6 = this.f6001S.d();
        if (d6 != null) {
            Iterator it5 = d6.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f5963d.e(fVar, dVar, hashSet, i2, true);
            }
        }
    }

    public void e0(d.b bVar, e eVar, d.b bVar2, int i2, int i3) {
        o(bVar).b(eVar.o(bVar2), i2, i3, true);
    }

    public void e1(int i2) {
        this.f5981A0 = i2;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        if ((this instanceof l) || (this instanceof h)) {
            return true;
        }
        return false;
    }

    public void f1(int i2, int i3) {
        this.f6022g0 = i2;
        int i4 = i3 - i2;
        this.f6014c0 = i4;
        int i5 = this.f6036n0;
        if (i4 < i5) {
            this.f6014c0 = i5;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:195:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x05b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(m.C0259d r54, boolean r55) {
        /*
            r53 = this;
            r15 = r53
            r14 = r54
            p.d r0 = r15.f5997O
            m.i r13 = r14.q(r0)
            p.d r0 = r15.f5999Q
            m.i r12 = r14.q(r0)
            p.d r0 = r15.f5998P
            m.i r11 = r14.q(r0)
            p.d r0 = r15.f6000R
            m.i r10 = r14.q(r0)
            p.d r0 = r15.f6001S
            m.i r9 = r14.q(r0)
            p.e r0 = r15.f6010a0
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x004f
            if (r0 == 0) goto L_0x0036
            p.e$b[] r2 = r0.f6008Z
            r2 = r2[r6]
            p.e$b r3 = p.e.b.WRAP_CONTENT
            if (r2 != r3) goto L_0x0036
            r2 = 1
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            if (r0 == 0) goto L_0x0043
            p.e$b[] r0 = r0.f6008Z
            r0 = r0[r7]
            p.e$b r3 = p.e.b.WRAP_CONTENT
            if (r0 != r3) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            int r3 = r15.f6051v
            if (r3 == r7) goto L_0x0055
            if (r3 == r8) goto L_0x0052
            if (r3 == r1) goto L_0x004f
            r5 = r0
            r4 = r2
            goto L_0x0057
        L_0x004f:
            r4 = 0
        L_0x0050:
            r5 = 0
            goto L_0x0057
        L_0x0052:
            r5 = r0
            r4 = 0
            goto L_0x0057
        L_0x0055:
            r4 = r2
            goto L_0x0050
        L_0x0057:
            int r0 = r15.f6046s0
            r3 = 8
            if (r0 != r3) goto L_0x0072
            boolean r0 = r15.f6048t0
            if (r0 != 0) goto L_0x0072
            boolean r0 = r53.b0()
            if (r0 != 0) goto L_0x0072
            boolean[] r0 = r15.f6007Y
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x0072
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x0072
            return
        L_0x0072:
            boolean r0 = r15.f6039p
            r2 = 5
            if (r0 != 0) goto L_0x007b
            boolean r8 = r15.f6041q
            if (r8 == 0) goto L_0x00f8
        L_0x007b:
            if (r0 == 0) goto L_0x00aa
            int r0 = r15.f6020f0
            r14.f(r13, r0)
            int r0 = r15.f6020f0
            int r8 = r15.f6012b0
            int r0 = r0 + r8
            r14.f(r12, r0)
            if (r4 == 0) goto L_0x00aa
            p.e r0 = r15.f6010a0
            if (r0 == 0) goto L_0x00aa
            boolean r8 = r15.f6029k
            if (r8 == 0) goto L_0x00a1
            p.f r0 = (p.f) r0
            p.d r8 = r15.f5997O
            r0.z1(r8)
            p.d r8 = r15.f5999Q
            r0.y1(r8)
            goto L_0x00aa
        L_0x00a1:
            p.d r0 = r0.f5999Q
            m.i r0 = r14.q(r0)
            r14.h(r0, r12, r6, r2)
        L_0x00aa:
            boolean r0 = r15.f6041q
            if (r0 == 0) goto L_0x00eb
            int r0 = r15.f6022g0
            r14.f(r11, r0)
            int r0 = r15.f6022g0
            int r8 = r15.f6014c0
            int r0 = r0 + r8
            r14.f(r10, r0)
            p.d r0 = r15.f6001S
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x00cb
            int r0 = r15.f6022g0
            int r8 = r15.f6032l0
            int r0 = r0 + r8
            r14.f(r9, r0)
        L_0x00cb:
            if (r5 == 0) goto L_0x00eb
            p.e r0 = r15.f6010a0
            if (r0 == 0) goto L_0x00eb
            boolean r8 = r15.f6029k
            if (r8 == 0) goto L_0x00e2
            p.f r0 = (p.f) r0
            p.d r8 = r15.f5998P
            r0.E1(r8)
            p.d r8 = r15.f6000R
            r0.D1(r8)
            goto L_0x00eb
        L_0x00e2:
            p.d r0 = r0.f6000R
            m.i r0 = r14.q(r0)
            r14.h(r0, r10, r6, r2)
        L_0x00eb:
            boolean r0 = r15.f6039p
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r15.f6041q
            if (r0 == 0) goto L_0x00f8
            r15.f6039p = r6
            r15.f6041q = r6
            return
        L_0x00f8:
            boolean r0 = m.C0259d.f5830r
            if (r55 == 0) goto L_0x0180
            q.l r0 = r15.f6017e
            if (r0 == 0) goto L_0x0180
            q.n r8 = r15.f6019f
            if (r8 == 0) goto L_0x0180
            q.f r2 = r0.f6185h
            boolean r1 = r2.f6134j
            if (r1 == 0) goto L_0x0180
            q.f r0 = r0.f6186i
            boolean r0 = r0.f6134j
            if (r0 == 0) goto L_0x0180
            q.f r0 = r8.f6185h
            boolean r0 = r0.f6134j
            if (r0 == 0) goto L_0x0180
            q.f r0 = r8.f6186i
            boolean r0 = r0.f6134j
            if (r0 == 0) goto L_0x0180
            int r0 = r2.f6131g
            r14.f(r13, r0)
            q.l r0 = r15.f6017e
            q.f r0 = r0.f6186i
            int r0 = r0.f6131g
            r14.f(r12, r0)
            q.n r0 = r15.f6019f
            q.f r0 = r0.f6185h
            int r0 = r0.f6131g
            r14.f(r11, r0)
            q.n r0 = r15.f6019f
            q.f r0 = r0.f6186i
            int r0 = r0.f6131g
            r14.f(r10, r0)
            q.n r0 = r15.f6019f
            q.f r0 = r0.f6160k
            int r0 = r0.f6131g
            r14.f(r9, r0)
            p.e r0 = r15.f6010a0
            if (r0 == 0) goto L_0x017b
            if (r4 == 0) goto L_0x0162
            boolean[] r0 = r15.f6021g
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0162
            boolean r0 = r53.i0()
            if (r0 != 0) goto L_0x0162
            p.e r0 = r15.f6010a0
            p.d r0 = r0.f5999Q
            m.i r0 = r14.q(r0)
            r14.h(r0, r12, r6, r3)
        L_0x0162:
            if (r5 == 0) goto L_0x017b
            boolean[] r0 = r15.f6021g
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x017b
            boolean r0 = r53.k0()
            if (r0 != 0) goto L_0x017b
            p.e r0 = r15.f6010a0
            p.d r0 = r0.f6000R
            m.i r0 = r14.q(r0)
            r14.h(r0, r10, r6, r3)
        L_0x017b:
            r15.f6039p = r6
            r15.f6041q = r6
            return
        L_0x0180:
            p.e r0 = r15.f6010a0
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r15.f0(r6)
            if (r0 == 0) goto L_0x0193
            p.e r0 = r15.f6010a0
            p.f r0 = (p.f) r0
            r0.v1(r15, r6)
            r0 = 1
            goto L_0x0197
        L_0x0193:
            boolean r0 = r53.i0()
        L_0x0197:
            boolean r1 = r15.f0(r7)
            if (r1 == 0) goto L_0x01a6
            p.e r1 = r15.f6010a0
            p.f r1 = (p.f) r1
            r1.v1(r15, r7)
            r1 = 1
            goto L_0x01aa
        L_0x01a6:
            boolean r1 = r53.k0()
        L_0x01aa:
            if (r0 != 0) goto L_0x01c9
            if (r4 == 0) goto L_0x01c9
            int r2 = r15.f6046s0
            if (r2 == r3) goto L_0x01c9
            p.d r2 = r15.f5997O
            p.d r2 = r2.f5965f
            if (r2 != 0) goto L_0x01c9
            p.d r2 = r15.f5999Q
            p.d r2 = r2.f5965f
            if (r2 != 0) goto L_0x01c9
            p.e r2 = r15.f6010a0
            p.d r2 = r2.f5999Q
            m.i r2 = r14.q(r2)
            r14.h(r2, r12, r6, r7)
        L_0x01c9:
            if (r1 != 0) goto L_0x01ec
            if (r5 == 0) goto L_0x01ec
            int r2 = r15.f6046s0
            if (r2 == r3) goto L_0x01ec
            p.d r2 = r15.f5998P
            p.d r2 = r2.f5965f
            if (r2 != 0) goto L_0x01ec
            p.d r2 = r15.f6000R
            p.d r2 = r2.f5965f
            if (r2 != 0) goto L_0x01ec
            p.d r2 = r15.f6001S
            if (r2 != 0) goto L_0x01ec
            p.e r2 = r15.f6010a0
            p.d r2 = r2.f6000R
            m.i r2 = r14.q(r2)
            r14.h(r2, r10, r6, r7)
        L_0x01ec:
            r29 = r0
            r28 = r1
            goto L_0x01f5
        L_0x01f1:
            r28 = 0
            r29 = 0
        L_0x01f5:
            int r0 = r15.f6012b0
            int r1 = r15.f6034m0
            if (r0 >= r1) goto L_0x01fc
            goto L_0x01fd
        L_0x01fc:
            r1 = r0
        L_0x01fd:
            int r2 = r15.f6014c0
            int r8 = r15.f6036n0
            if (r2 >= r8) goto L_0x0204
            goto L_0x0205
        L_0x0204:
            r8 = r2
        L_0x0205:
            p.e$b[] r3 = r15.f6008Z
            r7 = r3[r6]
            p.e$b r6 = p.e.b.MATCH_CONSTRAINT
            r22 = r1
            if (r7 == r6) goto L_0x0213
            r1 = 1
        L_0x0210:
            r20 = 1
            goto L_0x0215
        L_0x0213:
            r1 = 0
            goto L_0x0210
        L_0x0215:
            r3 = r3[r20]
            r23 = r8
            r27 = r9
            if (r3 == r6) goto L_0x021f
            r8 = 1
            goto L_0x0220
        L_0x021f:
            r8 = 0
        L_0x0220:
            int r9 = r15.f6018e0
            r15.f5988F = r9
            r30 = r10
            float r10 = r15.f6016d0
            r15.f5989G = r10
            r31 = r11
            int r11 = r15.f6053w
            r32 = r12
            int r12 = r15.f6055x
            r24 = 0
            r33 = r13
            int r24 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x02a4
            int r13 = r15.f6046s0
            r14 = 8
            if (r13 == r14) goto L_0x02a4
            if (r7 != r6) goto L_0x0245
            if (r11 != 0) goto L_0x0245
            r11 = 3
        L_0x0245:
            if (r3 != r6) goto L_0x024a
            if (r12 != 0) goto L_0x024a
            r12 = 3
        L_0x024a:
            if (r7 != r6) goto L_0x0257
            if (r3 != r6) goto L_0x0257
            r13 = 3
            if (r11 != r13) goto L_0x0258
            if (r12 != r13) goto L_0x0258
            r15.o1(r4, r5, r1, r8)
            goto L_0x029d
        L_0x0257:
            r13 = 3
        L_0x0258:
            r1 = 4
            if (r7 != r6) goto L_0x0277
            if (r11 != r13) goto L_0x0277
            r8 = 0
            r15.f5988F = r8
            float r0 = (float) r2
            float r10 = r10 * r0
            int r0 = (int) r10
            r1 = r0
            if (r3 == r6) goto L_0x026f
            r35 = r12
            r34 = r23
            r14 = 0
            r36 = 4
            goto L_0x02ad
        L_0x026f:
            r36 = r11
            r35 = r12
        L_0x0273:
            r34 = r23
        L_0x0275:
            r14 = 1
            goto L_0x02ad
        L_0x0277:
            if (r3 != r6) goto L_0x029d
            if (r12 != r13) goto L_0x029d
            r2 = 1
            r15.f5988F = r2
            r2 = -1
            if (r9 != r2) goto L_0x0286
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r10
            r15.f5989G = r2
        L_0x0286:
            float r2 = r15.f5989G
            float r0 = (float) r0
            float r2 = r2 * r0
            int r8 = (int) r2
            r34 = r8
            r36 = r11
            if (r7 == r6) goto L_0x0298
            r1 = r22
            r14 = 0
            r35 = 4
            goto L_0x02ad
        L_0x0298:
            r35 = r12
            r1 = r22
            goto L_0x0275
        L_0x029d:
            r36 = r11
            r35 = r12
            r1 = r22
            goto L_0x0273
        L_0x02a4:
            r36 = r11
            r35 = r12
            r1 = r22
            r34 = r23
            r14 = 0
        L_0x02ad:
            int[] r0 = r15.f6057y
            r2 = 0
            r0[r2] = r36
            r2 = 1
            r0[r2] = r35
            r15.f6023h = r14
            if (r14 == 0) goto L_0x02c3
            int r0 = r15.f5988F
            r2 = -1
            if (r0 == 0) goto L_0x02c0
            if (r0 != r2) goto L_0x02c4
        L_0x02c0:
            r18 = 1
            goto L_0x02c6
        L_0x02c3:
            r2 = -1
        L_0x02c4:
            r18 = 0
        L_0x02c6:
            if (r14 == 0) goto L_0x02d2
            int r0 = r15.f5988F
            r3 = 1
            if (r0 == r3) goto L_0x02cf
            if (r0 != r2) goto L_0x02d2
        L_0x02cf:
            r37 = 1
            goto L_0x02d4
        L_0x02d2:
            r37 = 0
        L_0x02d4:
            p.e$b[] r0 = r15.f6008Z
            r2 = 0
            r0 = r0[r2]
            p.e$b r13 = p.e.b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02e3
            boolean r0 = r15 instanceof p.f
            if (r0 == 0) goto L_0x02e3
            r9 = 1
            goto L_0x02e4
        L_0x02e3:
            r9 = 0
        L_0x02e4:
            if (r9 == 0) goto L_0x02e9
            r22 = 0
            goto L_0x02eb
        L_0x02e9:
            r22 = r1
        L_0x02eb:
            p.d r0 = r15.f6004V
            boolean r0 = r0.o()
            r1 = 1
            r38 = r0 ^ 1
            boolean[] r0 = r15.f6007Y
            r2 = 0
            boolean r23 = r0[r2]
            boolean r39 = r0[r1]
            int r0 = r15.f6047t
            r40 = 0
            r8 = 2
            if (r0 == r8) goto L_0x0370
            boolean r0 = r15.f6039p
            if (r0 != 0) goto L_0x0370
            if (r55 == 0) goto L_0x0318
            q.l r0 = r15.f6017e
            if (r0 == 0) goto L_0x0318
            q.f r1 = r0.f6185h
            boolean r2 = r1.f6134j
            if (r2 == 0) goto L_0x0318
            q.f r0 = r0.f6186i
            boolean r0 = r0.f6134j
            if (r0 != 0) goto L_0x0322
        L_0x0318:
            r12 = r54
            r10 = r32
            r11 = r33
            r3 = 8
            goto L_0x0386
        L_0x0322:
            if (r55 == 0) goto L_0x036e
            int r0 = r1.f6131g
            r12 = r54
            r11 = r33
            r12.f(r11, r0)
            q.l r0 = r15.f6017e
            q.f r0 = r0.f6186i
            int r0 = r0.f6131g
            r10 = r32
            r12.f(r10, r0)
            p.e r0 = r15.f6010a0
            if (r0 == 0) goto L_0x0358
            if (r4 == 0) goto L_0x0358
            boolean[] r0 = r15.f6021g
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x0358
            boolean r0 = r53.i0()
            if (r0 != 0) goto L_0x0358
            p.e r0 = r15.f6010a0
            p.d r0 = r0.f5999Q
            m.i r0 = r12.q(r0)
            r3 = 8
            r12.h(r0, r10, r1, r3)
        L_0x0358:
            r46 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r32 = r14
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r10
            r31 = r11
            goto L_0x0427
        L_0x036e:
            r12 = r54
        L_0x0370:
            r46 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r32
            r31 = r33
            r32 = r14
            goto L_0x0427
        L_0x0386:
            p.e r0 = r15.f6010a0
            if (r0 == 0) goto L_0x0392
            p.d r0 = r0.f5999Q
            m.i r0 = r12.q(r0)
            r7 = r0
            goto L_0x0394
        L_0x0392:
            r7 = r40
        L_0x0394:
            p.e r0 = r15.f6010a0
            if (r0 == 0) goto L_0x03a1
            p.d r0 = r0.f5997O
            m.i r0 = r12.q(r0)
            r16 = r0
            goto L_0x03a3
        L_0x03a1:
            r16 = r40
        L_0x03a3:
            boolean[] r0 = r15.f6021g
            r19 = 0
            boolean r21 = r0[r19]
            p.e$b[] r0 = r15.f6008Z
            r32 = r0[r19]
            p.d r1 = r15.f5997O
            p.d r2 = r15.f5999Q
            r33 = r2
            int r2 = r15.f6020f0
            r41 = r2
            int r2 = r15.f6034m0
            int[] r3 = r15.f5990H
            r43 = r3[r19]
            float r3 = r15.f6038o0
            r20 = 1
            r0 = r0[r20]
            if (r0 != r6) goto L_0x03c8
            r44 = 1
            goto L_0x03ca
        L_0x03c8:
            r44 = 0
        L_0x03ca:
            int r0 = r15.f6059z
            r24 = r0
            int r0 = r15.f5980A
            r25 = r0
            float r0 = r15.f5982B
            r26 = r0
            r0 = 1
            r17 = r33
            r33 = r41
            r41 = r2
            r2 = r0
            r0 = r53
            r45 = r1
            r1 = r54
            r42 = r3
            r3 = r4
            r46 = r4
            r4 = r5
            r47 = r5
            r5 = r21
            r48 = r6
            r6 = r16
            r8 = r32
            r49 = r27
            r16 = r10
            r50 = r30
            r10 = r45
            r19 = r11
            r51 = r31
            r11 = r17
            r30 = r16
            r12 = r33
            r52 = r13
            r31 = r19
            r13 = r22
            r32 = r14
            r14 = r41
            r15 = r43
            r16 = r42
            r17 = r18
            r18 = r44
            r19 = r29
            r20 = r28
            r21 = r23
            r22 = r36
            r23 = r35
            r27 = r38
            r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0427:
            if (r55 == 0) goto L_0x048d
            r15 = r53
            q.n r0 = r15.f6019f
            if (r0 == 0) goto L_0x0480
            q.f r1 = r0.f6185h
            boolean r2 = r1.f6134j
            if (r2 == 0) goto L_0x0480
            q.f r0 = r0.f6186i
            boolean r0 = r0.f6134j
            if (r0 == 0) goto L_0x0480
            int r0 = r1.f6131g
            r14 = r54
            r13 = r51
            r14.f(r13, r0)
            q.n r0 = r15.f6019f
            q.f r0 = r0.f6186i
            int r0 = r0.f6131g
            r12 = r50
            r14.f(r12, r0)
            q.n r0 = r15.f6019f
            q.f r0 = r0.f6160k
            int r0 = r0.f6131g
            r1 = r49
            r14.f(r1, r0)
            p.e r0 = r15.f6010a0
            if (r0 == 0) goto L_0x047a
            if (r28 != 0) goto L_0x047a
            if (r47 == 0) goto L_0x047a
            boolean[] r2 = r15.f6021g
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x0476
            p.d r0 = r0.f6000R
            m.i r0 = r14.q(r0)
            r2 = 8
            r10 = 0
            r14.h(r0, r12, r10, r2)
            goto L_0x047e
        L_0x0476:
            r2 = 8
            r10 = 0
            goto L_0x047e
        L_0x047a:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x047e:
            r7 = 0
            goto L_0x049c
        L_0x0480:
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x049b
        L_0x048d:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r53
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
        L_0x049b:
            r7 = 1
        L_0x049c:
            int r0 = r15.f6049u
            r3 = 2
            if (r0 != r3) goto L_0x04a3
            r6 = 0
            goto L_0x04a4
        L_0x04a3:
            r6 = r7
        L_0x04a4:
            if (r6 == 0) goto L_0x0583
            boolean r0 = r15.f6041q
            if (r0 != 0) goto L_0x0583
            p.e$b[] r0 = r15.f6008Z
            r0 = r0[r11]
            r3 = r52
            if (r0 != r3) goto L_0x04b8
            boolean r0 = r15 instanceof p.f
            if (r0 == 0) goto L_0x04b8
            r9 = 1
            goto L_0x04b9
        L_0x04b8:
            r9 = 0
        L_0x04b9:
            if (r9 == 0) goto L_0x04bd
            r34 = 0
        L_0x04bd:
            p.e r0 = r15.f6010a0
            if (r0 == 0) goto L_0x04c9
            p.d r0 = r0.f6000R
            m.i r0 = r14.q(r0)
            r7 = r0
            goto L_0x04cb
        L_0x04c9:
            r7 = r40
        L_0x04cb:
            p.e r0 = r15.f6010a0
            if (r0 == 0) goto L_0x04d7
            p.d r0 = r0.f5998P
            m.i r0 = r14.q(r0)
            r6 = r0
            goto L_0x04d9
        L_0x04d7:
            r6 = r40
        L_0x04d9:
            int r0 = r15.f6032l0
            if (r0 > 0) goto L_0x04e1
            int r0 = r15.f6046s0
            if (r0 != r2) goto L_0x051f
        L_0x04e1:
            p.d r0 = r15.f6001S
            p.d r3 = r0.f5965f
            if (r3 == 0) goto L_0x050e
            int r0 = r53.p()
            r14.e(r1, r13, r0, r2)
            p.d r0 = r15.f6001S
            p.d r0 = r0.f5965f
            m.i r0 = r14.q(r0)
            p.d r3 = r15.f6001S
            int r3 = r3.f()
            r14.e(r1, r0, r3, r2)
            if (r47 == 0) goto L_0x050b
            p.d r0 = r15.f6000R
            m.i r0 = r14.q(r0)
            r1 = 5
            r14.h(r7, r0, r10, r1)
        L_0x050b:
            r27 = 0
            goto L_0x0521
        L_0x050e:
            int r3 = r15.f6046s0
            if (r3 != r2) goto L_0x051a
            int r0 = r0.f()
        L_0x0516:
            r14.e(r1, r13, r0, r2)
            goto L_0x051f
        L_0x051a:
            int r0 = r53.p()
            goto L_0x0516
        L_0x051f:
            r27 = r38
        L_0x0521:
            boolean[] r0 = r15.f6021g
            boolean r5 = r0[r11]
            p.e$b[] r0 = r15.f6008Z
            r8 = r0[r11]
            p.d r4 = r15.f5998P
            p.d r3 = r15.f6000R
            int r1 = r15.f6022g0
            int r2 = r15.f6036n0
            int[] r10 = r15.f5990H
            r16 = r10[r11]
            float r10 = r15.f6040p0
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L_0x0542
            r18 = 1
            goto L_0x0544
        L_0x0542:
            r18 = 0
        L_0x0544:
            int r0 = r15.f5984C
            r24 = r0
            int r0 = r15.f5986D
            r25 = r0
            float r0 = r15.f5987E
            r26 = r0
            r0 = 0
            r19 = r2
            r2 = r0
            r0 = r53
            r20 = r1
            r1 = r54
            r11 = r3
            r3 = r47
            r21 = r4
            r4 = r46
            r17 = r10
            r10 = r21
            r33 = r12
            r12 = r20
            r38 = r13
            r13 = r34
            r14 = r19
            r15 = r16
            r16 = r17
            r17 = r37
            r19 = r28
            r20 = r29
            r21 = r39
            r22 = r35
            r23 = r36
            r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0587
        L_0x0583:
            r33 = r12
            r38 = r13
        L_0x0587:
            r7 = r53
            if (r32 == 0) goto L_0x05ad
            int r0 = r7.f5988F
            r6 = 8
            r1 = 1
            float r5 = r7.f5989G
            if (r0 != r1) goto L_0x05a2
            r0 = r54
            r1 = r33
            r2 = r38
            r3 = r30
            r4 = r31
        L_0x059e:
            r0.k(r1, r2, r3, r4, r5, r6)
            goto L_0x05ad
        L_0x05a2:
            r0 = r54
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r38
            goto L_0x059e
        L_0x05ad:
            p.d r0 = r7.f6004V
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x05d5
            p.d r0 = r7.f6004V
            p.d r0 = r0.j()
            p.e r0 = r0.h()
            float r1 = r7.f5991I
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            p.d r2 = r7.f6004V
            int r2 = r2.f()
            r3 = r54
            r3.b(r7, r0, r1, r2)
        L_0x05d5:
            r0 = 0
            r7.f6039p = r0
            r7.f6041q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.g(m.d, boolean):void");
    }

    public boolean g0() {
        return this.f6043r;
    }

    public void g1(b bVar) {
        this.f6008Z[1] = bVar;
    }

    public boolean h() {
        if (this.f6046s0 != 8) {
            return true;
        }
        return false;
    }

    public boolean h0(int i2) {
        return this.f6007Y[i2];
    }

    public void h1(int i2, int i3, int i4, float f2) {
        this.f6055x = i2;
        this.f5984C = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.f5986D = i4;
        this.f5987E = f2;
        if (f2 > 0.0f && f2 < 1.0f && i2 == 0) {
            this.f6055x = 2;
        }
    }

    public boolean i0() {
        d dVar = this.f5997O;
        d dVar2 = dVar.f5965f;
        if (dVar2 != null && dVar2.f5965f == dVar) {
            return true;
        }
        d dVar3 = this.f5999Q;
        d dVar4 = dVar3.f5965f;
        if (dVar4 == null || dVar4.f5965f != dVar3) {
            return false;
        }
        return true;
    }

    public void i1(float f2) {
        this.D0[1] = f2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015c, code lost:
        if (r11 != null) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018d, code lost:
        if (r11.o() != false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01bc, code lost:
        if (r11.o() != false) goto L_0x018f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(p.d.b r9, p.e r10, p.d.b r11, int r12) {
        /*
            r8 = this;
            p.d$b r0 = p.d.b.CENTER
            r1 = 0
            if (r9 != r0) goto L_0x00a3
            p.d$b r9 = p.d.b.LEFT
            if (r11 != r0) goto L_0x0074
            p.d r11 = r8.o(r9)
            p.d$b r12 = p.d.b.RIGHT
            p.d r2 = r8.o(r12)
            p.d$b r3 = p.d.b.TOP
            p.d r4 = r8.o(r3)
            p.d$b r5 = p.d.b.BOTTOM
            p.d r6 = r8.o(r5)
            r7 = 1
            if (r11 == 0) goto L_0x0028
            boolean r11 = r11.o()
            if (r11 != 0) goto L_0x0030
        L_0x0028:
            if (r2 == 0) goto L_0x0032
            boolean r11 = r2.o()
            if (r11 == 0) goto L_0x0032
        L_0x0030:
            r9 = 0
            goto L_0x0039
        L_0x0032:
            r8.j(r9, r10, r9, r1)
            r8.j(r12, r10, r12, r1)
            r9 = 1
        L_0x0039:
            if (r4 == 0) goto L_0x0041
            boolean r11 = r4.o()
            if (r11 != 0) goto L_0x0049
        L_0x0041:
            if (r6 == 0) goto L_0x004b
            boolean r11 = r6.o()
            if (r11 == 0) goto L_0x004b
        L_0x0049:
            r7 = 0
            goto L_0x0051
        L_0x004b:
            r8.j(r3, r10, r3, r1)
            r8.j(r5, r10, r5, r1)
        L_0x0051:
            if (r9 == 0) goto L_0x005e
            if (r7 == 0) goto L_0x005e
            p.d r9 = r8.o(r0)
            p.d r10 = r10.o(r0)
            goto L_0x0093
        L_0x005e:
            if (r9 == 0) goto L_0x006f
            p.d$b r9 = p.d.b.CENTER_X
        L_0x0062:
            p.d r11 = r8.o(r9)
            p.d r9 = r10.o(r9)
            r11.a(r9, r1)
            goto L_0x01c2
        L_0x006f:
            if (r7 == 0) goto L_0x01c2
            p.d$b r9 = p.d.b.CENTER_Y
            goto L_0x0062
        L_0x0074:
            if (r11 == r9) goto L_0x0098
            p.d$b r12 = p.d.b.RIGHT
            if (r11 != r12) goto L_0x007b
            goto L_0x0098
        L_0x007b:
            p.d$b r9 = p.d.b.TOP
            if (r11 == r9) goto L_0x0083
            p.d$b r12 = p.d.b.BOTTOM
            if (r11 != r12) goto L_0x01c2
        L_0x0083:
            r8.j(r9, r10, r11, r1)
            p.d$b r9 = p.d.b.BOTTOM
            r8.j(r9, r10, r11, r1)
        L_0x008b:
            p.d r9 = r8.o(r0)
        L_0x008f:
            p.d r10 = r10.o(r11)
        L_0x0093:
            r9.a(r10, r1)
            goto L_0x01c2
        L_0x0098:
            r8.j(r9, r10, r11, r1)
            p.d$b r9 = p.d.b.RIGHT
            r8.j(r9, r10, r11, r1)     // Catch:{ all -> 0x00a1 }
            goto L_0x008b
        L_0x00a1:
            r9 = move-exception
            throw r9
        L_0x00a3:
            p.d$b r2 = p.d.b.CENTER_X
            if (r9 != r2) goto L_0x00c8
            p.d$b r3 = p.d.b.LEFT
            if (r11 == r3) goto L_0x00af
            p.d$b r4 = p.d.b.RIGHT
            if (r11 != r4) goto L_0x00c8
        L_0x00af:
            p.d r9 = r8.o(r3)
            p.d r10 = r10.o(r11)
            p.d$b r11 = p.d.b.RIGHT
            p.d r11 = r8.o(r11)
            r9.a(r10, r1)
            r11.a(r10, r1)
            p.d r9 = r8.o(r2)
            goto L_0x0093
        L_0x00c8:
            p.d$b r3 = p.d.b.CENTER_Y
            if (r9 != r3) goto L_0x00f1
            p.d$b r4 = p.d.b.TOP
            if (r11 == r4) goto L_0x00d4
            p.d$b r5 = p.d.b.BOTTOM
            if (r11 != r5) goto L_0x00f1
        L_0x00d4:
            p.d r9 = r10.o(r11)
            p.d r10 = r8.o(r4)
            r10.a(r9, r1)
            p.d$b r10 = p.d.b.BOTTOM
            p.d r10 = r8.o(r10)
            r10.a(r9, r1)
            p.d r10 = r8.o(r3)
            r10.a(r9, r1)
            goto L_0x01c2
        L_0x00f1:
            if (r9 != r2) goto L_0x0115
            if (r11 != r2) goto L_0x0115
            p.d$b r9 = p.d.b.LEFT
            p.d r12 = r8.o(r9)
            p.d r9 = r10.o(r9)
            r12.a(r9, r1)
            p.d$b r9 = p.d.b.RIGHT
            p.d r12 = r8.o(r9)
            p.d r9 = r10.o(r9)
            r12.a(r9, r1)
            p.d r9 = r8.o(r2)
            goto L_0x008f
        L_0x0115:
            if (r9 != r3) goto L_0x0139
            if (r11 != r3) goto L_0x0139
            p.d$b r9 = p.d.b.TOP
            p.d r12 = r8.o(r9)
            p.d r9 = r10.o(r9)
            r12.a(r9, r1)
            p.d$b r9 = p.d.b.BOTTOM
            p.d r12 = r8.o(r9)
            p.d r9 = r10.o(r9)
            r12.a(r9, r1)
            p.d r9 = r8.o(r3)
            goto L_0x008f
        L_0x0139:
            p.d r1 = r8.o(r9)
            p.d r10 = r10.o(r11)
            boolean r11 = r1.p(r10)
            if (r11 == 0) goto L_0x01c2
            p.d$b r11 = p.d.b.BASELINE
            if (r9 != r11) goto L_0x015f
            p.d$b r9 = p.d.b.TOP
            p.d r9 = r8.o(r9)
            p.d$b r11 = p.d.b.BOTTOM
            p.d r11 = r8.o(r11)
            if (r9 == 0) goto L_0x015c
            r9.q()
        L_0x015c:
            if (r11 == 0) goto L_0x01bf
            goto L_0x0192
        L_0x015f:
            p.d$b r4 = p.d.b.TOP
            if (r9 == r4) goto L_0x0196
            p.d$b r4 = p.d.b.BOTTOM
            if (r9 != r4) goto L_0x0168
            goto L_0x0196
        L_0x0168:
            p.d$b r11 = p.d.b.LEFT
            if (r9 == r11) goto L_0x0170
            p.d$b r11 = p.d.b.RIGHT
            if (r9 != r11) goto L_0x01bf
        L_0x0170:
            p.d r11 = r8.o(r0)
            p.d r0 = r11.j()
            if (r0 == r10) goto L_0x017d
            r11.q()
        L_0x017d:
            p.d r9 = r8.o(r9)
            p.d r9 = r9.g()
            p.d r11 = r8.o(r2)
            boolean r0 = r11.o()
            if (r0 == 0) goto L_0x01bf
        L_0x018f:
            r9.q()
        L_0x0192:
            r11.q()
            goto L_0x01bf
        L_0x0196:
            p.d r11 = r8.o(r11)
            if (r11 == 0) goto L_0x019f
            r11.q()
        L_0x019f:
            p.d r11 = r8.o(r0)
            p.d r0 = r11.j()
            if (r0 == r10) goto L_0x01ac
            r11.q()
        L_0x01ac:
            p.d r9 = r8.o(r9)
            p.d r9 = r9.g()
            p.d r11 = r8.o(r3)
            boolean r0 = r11.o()
            if (r0 == 0) goto L_0x01bf
            goto L_0x018f
        L_0x01bf:
            r1.a(r10, r12)
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.j(p.d$b, p.e, p.d$b, int):void");
    }

    public boolean j0() {
        return this.f5993K;
    }

    public void j1(int i2) {
        this.f6046s0 = i2;
    }

    public void k(d dVar, d dVar2, int i2) {
        if (dVar.h() == this) {
            j(dVar.k(), dVar2.h(), dVar2.k(), i2);
        }
    }

    public boolean k0() {
        d dVar = this.f5998P;
        d dVar2 = dVar.f5965f;
        if (dVar2 != null && dVar2.f5965f == dVar) {
            return true;
        }
        d dVar3 = this.f6000R;
        d dVar4 = dVar3.f5965f;
        if (dVar4 == null || dVar4.f5965f != dVar3) {
            return false;
        }
        return true;
    }

    public void k1(int i2) {
        this.f6012b0 = i2;
        int i3 = this.f6034m0;
        if (i2 < i3) {
            this.f6012b0 = i3;
        }
    }

    public void l(e eVar, float f2, int i2) {
        d.b bVar = d.b.CENTER;
        e0(bVar, eVar, bVar, i2, 0);
        this.f5991I = f2;
    }

    public boolean l0() {
        return this.f5994L;
    }

    public void l1(int i2) {
        if (i2 >= 0 && i2 <= 3) {
            this.f6051v = i2;
        }
    }

    public void m(C0259d dVar) {
        dVar.q(this.f5997O);
        dVar.q(this.f5998P);
        dVar.q(this.f5999Q);
        dVar.q(this.f6000R);
        if (this.f6032l0 > 0) {
            dVar.q(this.f6001S);
        }
    }

    public boolean m0() {
        if (!this.f6025i || this.f6046s0 == 8) {
            return false;
        }
        return true;
    }

    public void m1(int i2) {
        this.f6020f0 = i2;
    }

    public void n() {
        if (this.f6017e == null) {
            this.f6017e = new l(this);
        }
        if (this.f6019f == null) {
            this.f6019f = new n(this);
        }
    }

    public boolean n0() {
        if (this.f6039p || (this.f5997O.n() && this.f5999Q.n())) {
            return true;
        }
        return false;
    }

    public void n1(int i2) {
        this.f6022g0 = i2;
    }

    public d o(d.b bVar) {
        switch (a.f6061a[bVar.ordinal()]) {
            case 1:
                return this.f5997O;
            case 2:
                return this.f5998P;
            case 3:
                return this.f5999Q;
            case 4:
                return this.f6000R;
            case 5:
                return this.f6001S;
            case 6:
                return this.f6004V;
            case 7:
                return this.f6002T;
            case 8:
                return this.f6003U;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean o0() {
        if (this.f6041q || (this.f5998P.n() && this.f6000R.n())) {
            return true;
        }
        return false;
    }

    public void o1(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.f5988F == -1) {
            if (z4 && !z5) {
                this.f5988F = 0;
            } else if (!z4 && z5) {
                this.f5988F = 1;
                if (this.f6018e0 == -1) {
                    this.f5989G = 1.0f / this.f5989G;
                }
            }
        }
        if (this.f5988F == 0 && (!this.f5998P.o() || !this.f6000R.o())) {
            this.f5988F = 1;
        } else if (this.f5988F == 1 && (!this.f5997O.o() || !this.f5999Q.o())) {
            this.f5988F = 0;
        }
        if (this.f5988F == -1 && (!this.f5998P.o() || !this.f6000R.o() || !this.f5997O.o() || !this.f5999Q.o())) {
            if (this.f5998P.o() && this.f6000R.o()) {
                this.f5988F = 0;
            } else if (this.f5997O.o() && this.f5999Q.o()) {
                this.f5989G = 1.0f / this.f5989G;
                this.f5988F = 1;
            }
        }
        if (this.f5988F == -1) {
            int i2 = this.f6059z;
            if (i2 > 0 && this.f5984C == 0) {
                this.f5988F = 0;
            } else if (i2 == 0 && this.f5984C > 0) {
                this.f5989G = 1.0f / this.f5989G;
                this.f5988F = 1;
            }
        }
    }

    public int p() {
        return this.f6032l0;
    }

    public boolean p0() {
        return this.f6045s;
    }

    public void p1(boolean z2, boolean z3) {
        int i2;
        int i3;
        boolean k2 = z2 & this.f6017e.k();
        boolean k3 = z3 & this.f6019f.k();
        l lVar = this.f6017e;
        int i4 = lVar.f6185h.f6131g;
        n nVar = this.f6019f;
        int i5 = nVar.f6185h.f6131g;
        int i6 = lVar.f6186i.f6131g;
        int i7 = nVar.f6186i.f6131g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i4 = 0;
            i7 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (k2) {
            this.f6020f0 = i4;
        }
        if (k3) {
            this.f6022g0 = i5;
        }
        if (this.f6046s0 == 8) {
            this.f6012b0 = 0;
            this.f6014c0 = 0;
            return;
        }
        if (k2) {
            if (this.f6008Z[0] == b.FIXED && i9 < (i3 = this.f6012b0)) {
                i9 = i3;
            }
            this.f6012b0 = i9;
            int i11 = this.f6034m0;
            if (i9 < i11) {
                this.f6012b0 = i11;
            }
        }
        if (k3) {
            if (this.f6008Z[1] == b.FIXED && i10 < (i2 = this.f6014c0)) {
                i10 = i2;
            }
            this.f6014c0 = i10;
            int i12 = this.f6036n0;
            if (i10 < i12) {
                this.f6014c0 = i12;
            }
        }
    }

    public float q(int i2) {
        if (i2 == 0) {
            return this.f6038o0;
        }
        if (i2 == 1) {
            return this.f6040p0;
        }
        return -1.0f;
    }

    public void q0() {
        this.f6043r = true;
    }

    public void q1(C0259d dVar, boolean z2) {
        n nVar;
        l lVar;
        int x2 = dVar.x(this.f5997O);
        int x3 = dVar.x(this.f5998P);
        int x4 = dVar.x(this.f5999Q);
        int x5 = dVar.x(this.f6000R);
        if (z2 && (lVar = this.f6017e) != null) {
            f fVar = lVar.f6185h;
            if (fVar.f6134j) {
                f fVar2 = lVar.f6186i;
                if (fVar2.f6134j) {
                    x2 = fVar.f6131g;
                    x4 = fVar2.f6131g;
                }
            }
        }
        if (z2 && (nVar = this.f6019f) != null) {
            f fVar3 = nVar.f6185h;
            if (fVar3.f6134j) {
                f fVar4 = nVar.f6186i;
                if (fVar4.f6134j) {
                    x3 = fVar3.f6131g;
                    x5 = fVar4.f6131g;
                }
            }
        }
        int i2 = x5 - x3;
        if (x4 - x2 < 0 || i2 < 0 || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE || x5 == Integer.MIN_VALUE || x5 == Integer.MAX_VALUE) {
            x2 = 0;
            x5 = 0;
            x3 = 0;
            x4 = 0;
        }
        J0(x2, x3, x4, x5);
    }

    public int r() {
        return Y() + this.f6014c0;
    }

    public void r0() {
        this.f6045s = true;
    }

    public Object s() {
        return this.f6042q0;
    }

    public boolean s0() {
        b[] bVarArr = this.f6008Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && bVarArr[1] == bVar2) {
            return true;
        }
        return false;
    }

    public String t() {
        return this.f6050u0;
    }

    public void t0() {
        this.f5997O.q();
        this.f5998P.q();
        this.f5999Q.q();
        this.f6000R.q();
        this.f6001S.q();
        this.f6002T.q();
        this.f6003U.q();
        this.f6004V.q();
        this.f6010a0 = null;
        this.f5991I = 0.0f;
        this.f6012b0 = 0;
        this.f6014c0 = 0;
        this.f6016d0 = 0.0f;
        this.f6018e0 = -1;
        this.f6020f0 = 0;
        this.f6022g0 = 0;
        this.f6028j0 = 0;
        this.f6030k0 = 0;
        this.f6032l0 = 0;
        this.f6034m0 = 0;
        this.f6036n0 = 0;
        float f2 = K0;
        this.f6038o0 = f2;
        this.f6040p0 = f2;
        b[] bVarArr = this.f6008Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f6042q0 = null;
        this.f6044r0 = 0;
        this.f6046s0 = 0;
        this.f6052v0 = null;
        this.f6054w0 = false;
        this.f6056x0 = false;
        this.f6060z0 = 0;
        this.f5981A0 = 0;
        this.f5983B0 = false;
        this.f5985C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f6047t = -1;
        this.f6049u = -1;
        int[] iArr = this.f5990H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f6053w = 0;
        this.f6055x = 0;
        this.f5982B = 1.0f;
        this.f5987E = 1.0f;
        this.f5980A = Integer.MAX_VALUE;
        this.f5986D = Integer.MAX_VALUE;
        this.f6059z = 0;
        this.f5984C = 0;
        this.f6023h = false;
        this.f5988F = -1;
        this.f5989G = 1.0f;
        this.f6058y0 = false;
        boolean[] zArr = this.f6021g;
        zArr[0] = true;
        zArr[1] = true;
        this.f5994L = false;
        boolean[] zArr2 = this.f6007Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f6025i = true;
        int[] iArr2 = this.f6057y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f6031l = -1;
        this.f6033m = -1;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f6052v0 != null) {
            str = "type: " + this.f6052v0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f6050u0 != null) {
            str2 = "id: " + this.f6050u0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f6020f0);
        sb.append(", ");
        sb.append(this.f6022g0);
        sb.append(") - (");
        sb.append(this.f6012b0);
        sb.append(" x ");
        sb.append(this.f6014c0);
        sb.append(")");
        return sb.toString();
    }

    public b u(int i2) {
        if (i2 == 0) {
            return A();
        }
        if (i2 == 1) {
            return T();
        }
        return null;
    }

    public void u0() {
        e K2 = K();
        if (K2 == null || !(K2 instanceof f) || !((f) K()).L1()) {
            int size = this.f6006X.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((d) this.f6006X.get(i2)).q();
            }
        }
    }

    public float v() {
        return this.f6016d0;
    }

    public void v0() {
        this.f6039p = false;
        this.f6041q = false;
        this.f6043r = false;
        this.f6045s = false;
        int size = this.f6006X.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((d) this.f6006X.get(i2)).r();
        }
    }

    public int w() {
        return this.f6018e0;
    }

    public void w0(C0258c cVar) {
        this.f5997O.s(cVar);
        this.f5998P.s(cVar);
        this.f5999Q.s(cVar);
        this.f6000R.s(cVar);
        this.f6001S.s(cVar);
        this.f6004V.s(cVar);
        this.f6002T.s(cVar);
        this.f6003U.s(cVar);
    }

    public int x() {
        if (this.f6046s0 == 8) {
            return 0;
        }
        return this.f6014c0;
    }

    public float y() {
        return this.f6038o0;
    }

    public int z() {
        return this.f6060z0;
    }
}
