package q;

import java.util.ArrayList;
import p.f;

class m {

    /* renamed from: h  reason: collision with root package name */
    public static int f6152h;

    /* renamed from: a  reason: collision with root package name */
    public int f6153a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6154b = false;

    /* renamed from: c  reason: collision with root package name */
    p f6155c = null;

    /* renamed from: d  reason: collision with root package name */
    p f6156d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList f6157e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    int f6158f;

    /* renamed from: g  reason: collision with root package name */
    int f6159g;

    public m(p pVar, int i2) {
        int i3 = f6152h;
        this.f6158f = i3;
        f6152h = i3 + 1;
        this.f6155c = pVar;
        this.f6156d = pVar;
        this.f6159g = i2;
    }

    private long c(f fVar, long j2) {
        p pVar = fVar.f6128d;
        if (pVar instanceof k) {
            return j2;
        }
        int size = fVar.f6135k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) fVar.f6135k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f6128d != pVar) {
                    j3 = Math.min(j3, c(fVar2, ((long) fVar2.f6130f) + j2));
                }
            }
        }
        if (fVar != pVar.f6186i) {
            return j3;
        }
        long j4 = j2 - pVar.j();
        return Math.min(Math.min(j3, c(pVar.f6185h, j4)), j4 - ((long) pVar.f6185h.f6130f));
    }

    private long d(f fVar, long j2) {
        p pVar = fVar.f6128d;
        if (pVar instanceof k) {
            return j2;
        }
        int size = fVar.f6135k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) fVar.f6135k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f6128d != pVar) {
                    j3 = Math.max(j3, d(fVar2, ((long) fVar2.f6130f) + j2));
                }
            }
        }
        if (fVar != pVar.f6185h) {
            return j3;
        }
        long j4 = j2 + pVar.j();
        return Math.max(Math.max(j3, d(pVar.f6186i, j4)), j4 - ((long) pVar.f6186i.f6130f));
    }

    public void a(p pVar) {
        this.f6157e.add(pVar);
        this.f6156d = pVar;
    }

    public long b(f fVar, int i2) {
        p pVar;
        p pVar2;
        long j2;
        p pVar3;
        long j3;
        long j4;
        p pVar4 = this.f6155c;
        long j5 = 0;
        if (pVar4 instanceof C0279c) {
            if (((C0279c) pVar4).f6183f != i2) {
                return 0;
            }
        } else if (i2 == 0) {
            if (!(pVar4 instanceof l)) {
                return 0;
            }
        } else if (!(pVar4 instanceof n)) {
            return 0;
        }
        if (i2 == 0) {
            pVar = fVar.f6017e;
        } else {
            pVar = fVar.f6019f;
        }
        f fVar2 = pVar.f6185h;
        if (i2 == 0) {
            pVar2 = fVar.f6017e;
        } else {
            pVar2 = fVar.f6019f;
        }
        f fVar3 = pVar2.f6186i;
        boolean contains = pVar4.f6185h.f6136l.contains(fVar2);
        boolean contains2 = this.f6155c.f6186i.f6136l.contains(fVar3);
        long j6 = this.f6155c.j();
        if (!contains || !contains2) {
            if (contains) {
                f fVar4 = this.f6155c.f6185h;
                j4 = d(fVar4, (long) fVar4.f6130f);
                j3 = ((long) this.f6155c.f6185h.f6130f) + j6;
            } else if (contains2) {
                f fVar5 = this.f6155c.f6186i;
                long c2 = c(fVar5, (long) fVar5.f6130f);
                j3 = ((long) (-this.f6155c.f6186i.f6130f)) + j6;
                j4 = -c2;
            } else {
                p pVar5 = this.f6155c;
                j2 = ((long) pVar5.f6185h.f6130f) + pVar5.j();
                pVar3 = this.f6155c;
            }
            return Math.max(j4, j3);
        }
        long d2 = d(this.f6155c.f6185h, 0);
        long c3 = c(this.f6155c.f6186i, 0);
        long j7 = d2 - j6;
        p pVar6 = this.f6155c;
        int i3 = pVar6.f6186i.f6130f;
        if (j7 >= ((long) (-i3))) {
            j7 += (long) i3;
        }
        int i4 = pVar6.f6185h.f6130f;
        long j8 = ((-c3) - j6) - ((long) i4);
        if (j8 >= ((long) i4)) {
            j8 -= (long) i4;
        }
        float q2 = pVar6.f6179b.q(i2);
        if (q2 > 0.0f) {
            j5 = (long) ((((float) j8) / q2) + (((float) j7) / (1.0f - q2)));
        }
        float f2 = (float) j5;
        long j9 = ((long) ((f2 * q2) + 0.5f)) + j6 + ((long) ((f2 * (1.0f - q2)) + 0.5f));
        pVar3 = this.f6155c;
        j2 = ((long) pVar3.f6185h.f6130f) + j9;
        return j2 - ((long) pVar3.f6186i.f6130f);
    }
}
