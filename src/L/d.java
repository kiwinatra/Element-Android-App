package l;

public class d implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f5760e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f5761a;

    /* renamed from: b  reason: co5llision with root package name */
    private long[] f5762b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f5763c;

    /* renamed from: d  reason: collision with root package name */
    private int f5764d;

    public d() {
        this(10);
    }

    private void d() {
        int i2 = this.f5764d;
        long[] jArr = this.f5762b;
        Object[] objArr = this.f5763c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f5760e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f5761a = false;
        this.f5764d = i3;
    }

    public void a(long j2, Object obj) {
        int i2 = this.f5764d;
        if (i2 == 0 || j2 > this.f5762b[i2 - 1]) {
            if (this.f5761a && i2 >= this.f5762b.length) {
                d();
            }
            int i3 = this.f5764d;
            if (i3 >= this.f5762b.length) {
                int f2 = c.f(i3 + 1);
                long[] jArr = new long[f2];
                Object[] objArr = new Object[f2];
                long[] jArr2 = this.f5762b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f5763c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f5762b = jArr;
                this.f5763c = objArr;
            }
            this.f5762b[i3] = j2;
            this.f5763c[i3] = obj;
            this.f5764d = i3 + 1;
            return;
        }
        i(j2, obj);
    }

    public void b() {
        int i2 = this.f5764d;
        Object[] objArr = this.f5763c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f5764d = 0;
        this.f5761a = false;
    }

    /* renamed from: c */
    public d clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f5762b = (long[]) this.f5762b.clone();
            dVar.f5763c = (Object[]) this.f5763c.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public Object e(long j2) {
        return f(j2, (Object) null);
    }

    public Object f(long j2, Object obj) {
        Object obj2;
        int b2 = c.b(this.f5762b, this.f5764d, j2);
        if (b2 < 0 || (obj2 = this.f5763c[b2]) == f5760e) {
            return obj;
        }
        return obj2;
    }

    public int g(long j2) {
        if (this.f5761a) {
            d();
        }
        return c.b(this.f5762b, this.f5764d, j2);
    }

    public long h(int i2) {
        if (this.f5761a) {
            d();
        }
        return this.f5762b[i2];
    }

    public void i(long j2, Object obj) {
        int b2 = c.b(this.f5762b, this.f5764d, j2);
        if (b2 >= 0) {
            this.f5763c[b2] = obj;
            return;
        }
        int i2 = ~b2;
        int i3 = this.f5764d;
        if (i2 < i3) {
            Object[] objArr = this.f5763c;
            if (objArr[i2] == f5760e) {
                this.f5762b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f5761a && i3 >= this.f5762b.length) {
            d();
            i2 = ~c.b(this.f5762b, this.f5764d, j2);
        }
        int i4 = this.f5764d;
        if (i4 >= this.f5762b.length) {
            int f2 = c.f(i4 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f5762b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f5763c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5762b = jArr;
            this.f5763c = objArr2;
        }
        int i5 = this.f5764d;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f5762b;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f5763c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f5764d - i2);
        }
        this.f5762b[i2] = j2;
        this.f5763c[i2] = obj;
        this.f5764d++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f5763c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f5762b
            int r1 = r2.f5764d
            int r3 = l.c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f5763c
            r0 = r4[r3]
            java.lang.Object r1 = f5760e
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f5761a = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.d.j(long):void");
    }

    public void k(int i2) {
        Object[] objArr = this.f5763c;
        Object obj = objArr[i2];
        Object obj2 = f5760e;
        if (obj != obj2) {
            objArr[i2] = obj2;
            this.f5761a = true;
        }
    }

    public int l() {
        if (this.f5761a) {
            d();
        }
        return this.f5764d;
    }

    public Object m(int i2) {
        if (this.f5761a) {
            d();
        }
        return this.f5763c[i2];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5764d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5764d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(h(i2));
            sb.append('=');
            Object m2 = m(i2);
            if (m2 != this) {
                sb.append(m2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public d(int i2) {
        this.f5761a = false;
        if (i2 == 0) {
            this.f5762b = c.f5758b;
            this.f5763c = c.f5759c;
            return;
        }
        int f2 = c.f(i2);
        this.f5762b = new long[f2];
        this.f5763c = new Object[f2];
    }
}
