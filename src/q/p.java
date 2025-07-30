package q;

import p.d;
import p.e;

public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f6178a;

    /* renamed from: b  reason: collision with root package name */
    e f6179b;

    /* renamed from: c  reason: collision with root package name */
    m f6180c;

    /* renamed from: d  reason: collision with root package name */
    protected e.b f6181d;

    /* renamed from: e  reason: collision with root package name */
    g f6182e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f6183f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f6184g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f6185h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f6186i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    protected b f6187j = b.NONE;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6188a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                p.d$b[] r0 = p.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6188a = r0
                p.d$b r1 = p.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6188a     // Catch:{ NoSuchFieldError -> 0x001d }
                p.d$b r1 = p.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6188a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p.d$b r1 = p.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6188a     // Catch:{ NoSuchFieldError -> 0x0033 }
                p.d$b r1 = p.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6188a     // Catch:{ NoSuchFieldError -> 0x003e }
                p.d$b r1 = p.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q.p.a.<clinit>():void");
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(e eVar) {
        this.f6179b = eVar;
    }

    private void l(int i2, int i3) {
        g gVar;
        int g2;
        p pVar;
        float f2;
        int i4;
        int i5 = this.f6178a;
        if (i5 != 0) {
            if (i5 == 1) {
                int g3 = g(this.f6182e.f6146m, i2);
                gVar = this.f6182e;
                g2 = Math.min(g3, i3);
                gVar.d(g2);
            } else if (i5 == 2) {
                e K2 = this.f6179b.K();
                if (K2 != null) {
                    if (i2 == 0) {
                        pVar = K2.f6017e;
                    } else {
                        pVar = K2.f6019f;
                    }
                    g gVar2 = pVar.f6182e;
                    if (gVar2.f6134j) {
                        e eVar = this.f6179b;
                        if (i2 == 0) {
                            f2 = eVar.f5982B;
                        } else {
                            f2 = eVar.f5987E;
                        }
                        i3 = (int) ((((float) gVar2.f6131g) * f2) + 0.5f);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i5 == 3) {
                e eVar2 = this.f6179b;
                p pVar2 = eVar2.f6017e;
                e.b bVar = pVar2.f6181d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar2.f6178a == 3) {
                    n nVar = eVar2.f6019f;
                    if (nVar.f6181d == bVar2 && nVar.f6178a == 3) {
                        return;
                    }
                }
                if (i2 == 0) {
                    pVar2 = eVar2.f6019f;
                }
                if (pVar2.f6182e.f6134j) {
                    float v2 = eVar2.v();
                    if (i2 == 1) {
                        i4 = (int) ((((float) pVar2.f6182e.f6131g) / v2) + 0.5f);
                    } else {
                        i4 = (int) ((v2 * ((float) pVar2.f6182e.f6131g)) + 0.5f);
                    }
                    this.f6182e.d(i4);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        gVar = this.f6182e;
        g2 = g(i3, i2);
        gVar.d(g2);
    }

    public abstract void a(d dVar);

    /* access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i2) {
        fVar.f6136l.add(fVar2);
        fVar.f6130f = i2;
        fVar2.f6135k.add(fVar);
    }

    /* access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f6136l.add(fVar2);
        fVar.f6136l.add(this.f6182e);
        fVar.f6132h = i2;
        fVar.f6133i = gVar;
        fVar2.f6135k.add(fVar);
        gVar.f6135k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final int g(int i2, int i3) {
        int i4;
        if (i3 == 0) {
            e eVar = this.f6179b;
            int i5 = eVar.f5980A;
            i4 = Math.max(eVar.f6059z, i2);
            if (i5 > 0) {
                i4 = Math.min(i5, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        } else {
            e eVar2 = this.f6179b;
            int i6 = eVar2.f5986D;
            int max = Math.max(eVar2.f5984C, i2);
            if (i6 > 0) {
                max = Math.min(i6, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public final f h(d dVar) {
        p pVar;
        p pVar2;
        d dVar2 = dVar.f5965f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f5963d;
        int i2 = a.f6188a[dVar2.f5964e.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                pVar2 = eVar.f6017e;
            } else if (i2 == 3) {
                pVar = eVar.f6019f;
            } else if (i2 == 4) {
                return eVar.f6019f.f6160k;
            } else {
                if (i2 != 5) {
                    return null;
                }
                pVar2 = eVar.f6019f;
            }
            return pVar2.f6186i;
        }
        pVar = eVar.f6017e;
        return pVar.f6185h;
    }

    /* access modifiers changed from: protected */
    public final f i(d dVar, int i2) {
        p pVar;
        d dVar2 = dVar.f5965f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f5963d;
        if (i2 == 0) {
            pVar = eVar.f6017e;
        } else {
            pVar = eVar.f6019f;
        }
        int i3 = a.f6188a[dVar2.f5964e.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f6186i;
        }
        return pVar.f6185h;
    }

    public long j() {
        g gVar = this.f6182e;
        if (gVar.f6134j) {
            return (long) gVar.f6131g;
        }
        return 0;
    }

    public boolean k() {
        return this.f6184g;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean m();

    /* access modifiers changed from: protected */
    public void n(d dVar, d dVar2, d dVar3, int i2) {
        float f2;
        f fVar;
        f h2 = h(dVar2);
        f h3 = h(dVar3);
        if (h2.f6134j && h3.f6134j) {
            int f3 = h2.f6131g + dVar2.f();
            int f4 = h3.f6131g - dVar3.f();
            int i3 = f4 - f3;
            if (!this.f6182e.f6134j && this.f6181d == e.b.MATCH_CONSTRAINT) {
                l(i2, i3);
            }
            g gVar = this.f6182e;
            if (gVar.f6134j) {
                if (gVar.f6131g == i3) {
                    this.f6185h.d(f3);
                    fVar = this.f6186i;
                } else {
                    e eVar = this.f6179b;
                    if (i2 == 0) {
                        f2 = eVar.y();
                    } else {
                        f2 = eVar.R();
                    }
                    if (h2 == h3) {
                        f3 = h2.f6131g;
                        f4 = h3.f6131g;
                        f2 = 0.5f;
                    }
                    this.f6185h.d((int) (((float) f3) + 0.5f + (((float) ((f4 - f3) - this.f6182e.f6131g)) * f2)));
                    fVar = this.f6186i;
                    f4 = this.f6185h.f6131g + this.f6182e.f6131g;
                }
                fVar.d(f4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o(d dVar) {
    }

    /* access modifiers changed from: protected */
    public void p(d dVar) {
    }
}
