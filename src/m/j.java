package m;

import java.util.Arrays;
import m.C0257b;

public class j implements C0257b.a {

    /* renamed from: n  reason: collision with root package name */
    private static float f5892n = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    private final int f5893a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f5894b = 16;

    /* renamed from: c  reason: collision with root package name */
    private int f5895c = 16;

    /* renamed from: d  reason: collision with root package name */
    int[] f5896d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    int[] f5897e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    int[] f5898f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    float[] f5899g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    int[] f5900h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    int[] f5901i = new int[16];

    /* renamed from: j  reason: collision with root package name */
    int f5902j = 0;

    /* renamed from: k  reason: collision with root package name */
    int f5903k = -1;

    /* renamed from: l  reason: collision with root package name */
    private final C0257b f5904l;

    /* renamed from: m  reason: collision with root package name */
    protected final C0258c f5905m;

    j(C0257b bVar, C0258c cVar) {
        this.f5904l = bVar;
        this.f5905m = cVar;
        clear();
    }

    private void l(i iVar, int i2) {
        int[] iArr;
        int i3 = iVar.f5871c % this.f5895c;
        int[] iArr2 = this.f5896d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f5897e;
                int i5 = iArr[i4];
                if (i5 == -1) {
                    break;
                }
                i4 = i5;
            }
            iArr[i4] = i2;
        }
        this.f5897e[i2] = -1;
    }

    private void m(int i2, i iVar, float f2) {
        this.f5898f[i2] = iVar.f5871c;
        this.f5899g[i2] = f2;
        this.f5900h[i2] = -1;
        this.f5901i[i2] = -1;
        iVar.a(this.f5904l);
        iVar.f5881m++;
        this.f5902j++;
    }

    private int n() {
        for (int i2 = 0; i2 < this.f5894b; i2++) {
            if (this.f5898f[i2] == -1) {
                return i2;
            }
        }
        return -1;
    }

    private void o() {
        int i2 = this.f5894b * 2;
        this.f5898f = Arrays.copyOf(this.f5898f, i2);
        this.f5899g = Arrays.copyOf(this.f5899g, i2);
        this.f5900h = Arrays.copyOf(this.f5900h, i2);
        this.f5901i = Arrays.copyOf(this.f5901i, i2);
        this.f5897e = Arrays.copyOf(this.f5897e, i2);
        for (int i3 = this.f5894b; i3 < i2; i3++) {
            this.f5898f[i3] = -1;
            this.f5897e[i3] = -1;
        }
        this.f5894b = i2;
    }

    private void q(int i2, i iVar, float f2) {
        int n2 = n();
        m(n2, iVar, f2);
        if (i2 != -1) {
            this.f5900h[n2] = i2;
            int[] iArr = this.f5901i;
            iArr[n2] = iArr[i2];
            iArr[i2] = n2;
        } else {
            this.f5900h[n2] = -1;
            if (this.f5902j > 0) {
                this.f5901i[n2] = this.f5903k;
                this.f5903k = n2;
            } else {
                this.f5901i[n2] = -1;
            }
        }
        int i3 = this.f5901i[n2];
        if (i3 != -1) {
            this.f5900h[i3] = n2;
        }
        l(iVar, n2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(m.i r6) {
        /*
            r5 = this;
            int r6 = r6.f5871c
            int r0 = r5.f5895c
            int r0 = r6 % r0
            int[] r1 = r5.f5896d
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto L_0x000e
            return
        L_0x000e:
            int[] r4 = r5.f5898f
            r4 = r4[r2]
            if (r4 != r6) goto L_0x001d
            int[] r6 = r5.f5897e
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L_0x0039
        L_0x001d:
            int[] r0 = r5.f5897e
            r1 = r0[r2]
            if (r1 == r3) goto L_0x002b
            int[] r4 = r5.f5898f
            r4 = r4[r1]
            if (r4 == r6) goto L_0x002b
            r2 = r1
            goto L_0x001d
        L_0x002b:
            if (r1 == r3) goto L_0x0039
            int[] r4 = r5.f5898f
            r4 = r4[r1]
            if (r4 != r6) goto L_0x0039
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.j.r(m.i):void");
    }

    public float a(int i2) {
        int i3 = this.f5902j;
        int i4 = this.f5903k;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f5899g[i4];
            }
            i4 = this.f5901i[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public void b(i iVar, float f2) {
        float f3 = f5892n;
        if (f2 <= (-f3) || f2 >= f3) {
            if (this.f5902j == 0) {
                m(0, iVar, f2);
                l(iVar, 0);
                this.f5903k = 0;
                return;
            }
            int p2 = p(iVar);
            if (p2 != -1) {
                this.f5899g[p2] = f2;
                return;
            }
            if (this.f5902j + 1 >= this.f5894b) {
                o();
            }
            int i2 = this.f5902j;
            int i3 = this.f5903k;
            int i4 = -1;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = this.f5898f[i3];
                int i7 = iVar.f5871c;
                if (i6 == i7) {
                    this.f5899g[i3] = f2;
                    return;
                }
                if (i6 < i7) {
                    i4 = i3;
                }
                i3 = this.f5901i[i3];
                if (i3 == -1) {
                    break;
                }
            }
            q(i4, iVar, f2);
            return;
        }
        i(iVar, true);
    }

    public void c(i iVar, float f2, boolean z2) {
        float f3 = f5892n;
        if (f2 <= (-f3) || f2 >= f3) {
            int p2 = p(iVar);
            if (p2 == -1) {
                b(iVar, f2);
                return;
            }
            float[] fArr = this.f5899g;
            float f4 = fArr[p2] + f2;
            fArr[p2] = f4;
            float f5 = f5892n;
            if (f4 > (-f5) && f4 < f5) {
                fArr[p2] = 0.0f;
                i(iVar, z2);
            }
        }
    }

    public void clear() {
        int i2 = this.f5902j;
        for (int i3 = 0; i3 < i2; i3++) {
            i e2 = e(i3);
            if (e2 != null) {
                e2.d(this.f5904l);
            }
        }
        for (int i4 = 0; i4 < this.f5894b; i4++) {
            this.f5898f[i4] = -1;
            this.f5897e[i4] = -1;
        }
        for (int i5 = 0; i5 < this.f5895c; i5++) {
            this.f5896d[i5] = -1;
        }
        this.f5902j = 0;
        this.f5903k = -1;
    }

    public boolean d(i iVar) {
        if (p(iVar) != -1) {
            return true;
        }
        return false;
    }

    public i e(int i2) {
        int i3 = this.f5902j;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f5903k;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.f5905m.f5829d[this.f5898f[i4]];
            }
            i4 = this.f5901i[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    public void f(float f2) {
        int i2 = this.f5902j;
        int i3 = this.f5903k;
        int i4 = 0;
        while (i4 < i2) {
            float[] fArr = this.f5899g;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f5901i[i3];
            if (i3 != -1) {
                i4++;
            } else {
                return;
            }
        }
    }

    public float g(i iVar) {
        int p2 = p(iVar);
        if (p2 != -1) {
            return this.f5899g[p2];
        }
        return 0.0f;
    }

    public float h(C0257b bVar, boolean z2) {
        float g2 = g(bVar.f5820a);
        i(bVar.f5820a, z2);
        j jVar = (j) bVar.f5824e;
        int k2 = jVar.k();
        int i2 = 0;
        int i3 = 0;
        while (i2 < k2) {
            int i4 = jVar.f5898f[i3];
            if (i4 != -1) {
                c(this.f5905m.f5829d[i4], jVar.f5899g[i3] * g2, z2);
                i2++;
            }
            i3++;
        }
        return g2;
    }

    public float i(i iVar, boolean z2) {
        int p2 = p(iVar);
        if (p2 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f2 = this.f5899g[p2];
        if (this.f5903k == p2) {
            this.f5903k = this.f5901i[p2];
        }
        this.f5898f[p2] = -1;
        int[] iArr = this.f5900h;
        int i2 = iArr[p2];
        if (i2 != -1) {
            int[] iArr2 = this.f5901i;
            iArr2[i2] = iArr2[p2];
        }
        int i3 = this.f5901i[p2];
        if (i3 != -1) {
            iArr[i3] = iArr[p2];
        }
        this.f5902j--;
        iVar.f5881m--;
        if (z2) {
            iVar.d(this.f5904l);
        }
        return f2;
    }

    public void j() {
        int i2 = this.f5902j;
        int i3 = this.f5903k;
        int i4 = 0;
        while (i4 < i2) {
            float[] fArr = this.f5899g;
            fArr[i3] = fArr[i3] * -1.0f;
            i3 = this.f5901i[i3];
            if (i3 != -1) {
                i4++;
            } else {
                return;
            }
        }
    }

    public int k() {
        return this.f5902j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int p(m.i r4) {
        /*
            r3 = this;
            int r0 = r3.f5902j
            r1 = -1
            if (r0 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x0008
            goto L_0x0033
        L_0x0008:
            int r4 = r4.f5871c
            int r0 = r3.f5895c
            int r0 = r4 % r0
            int[] r2 = r3.f5896d
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0015
            return r1
        L_0x0015:
            int[] r2 = r3.f5898f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x001c
            return r0
        L_0x001c:
            int[] r2 = r3.f5897e
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0029
            int[] r2 = r3.f5898f
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0029
            goto L_0x001c
        L_0x0029:
            if (r0 != r1) goto L_0x002c
            return r1
        L_0x002c:
            int[] r2 = r3.f5898f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0033
            return r0
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m.j.p(m.i):int");
    }

    public String toString() {
        StringBuilder sb;
        String str;
        String str2 = hashCode() + " { ";
        int i2 = this.f5902j;
        for (int i3 = 0; i3 < i2; i3++) {
            i e2 = e(i3);
            if (e2 != null) {
                String str3 = str2 + e2 + " = " + a(i3) + " ";
                int p2 = p(e2);
                String str4 = str3 + "[p: ";
                if (this.f5900h[p2] != -1) {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(this.f5905m.f5829d[this.f5898f[this.f5900h[p2]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append("none");
                }
                String str5 = sb.toString() + ", n: ";
                if (this.f5901i[p2] != -1) {
                    str = str5 + this.f5905m.f5829d[this.f5898f[this.f5901i[p2]]];
                } else {
                    str = str5 + "none";
                }
                str2 = str + "]";
            }
        }
        return str2 + " }";
    }
}
