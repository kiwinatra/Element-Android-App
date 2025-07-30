package q;

import p.e;
import q.f;

public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f6160k;

    /* renamed from: l  reason: collision with root package name */
    g f6161l = null;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6162a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                q.p$b[] r0 = q.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6162a = r0
                q.p$b r1 = q.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6162a     // Catch:{ NoSuchFieldError -> 0x001d }
                q.p$b r1 = q.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6162a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q.p$b r1 = q.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q.n.a.<clinit>():void");
        }
    }

    public n(e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f6160k = fVar;
        this.f6185h.f6129e = f.a.TOP;
        this.f6186i.f6129e = f.a.BOTTOM;
        fVar.f6129e = f.a.BASELINE;
        this.f6183f = 1;
    }

    public void a(d dVar) {
        int i2;
        float f2;
        int i3 = a.f6162a[this.f6187j.ordinal()];
        if (i3 == 1) {
            p(dVar);
        } else if (i3 == 2) {
            o(dVar);
        } else if (i3 == 3) {
            e eVar = this.f6179b;
            n(dVar, eVar.f5998P, eVar.f6000R, 1);
            return;
        }
        g gVar = this.f6182e;
        if (gVar.f6127c && !gVar.f6134j && this.f6181d == e.b.MATCH_CONSTRAINT) {
            e eVar2 = this.f6179b;
            int i4 = eVar2.f6055x;
            if (i4 == 2) {
                e K2 = eVar2.K();
                if (K2 != null) {
                    g gVar2 = K2.f6019f.f6182e;
                    if (gVar2.f6134j) {
                        i2 = (int) ((((float) gVar2.f6131g) * this.f6179b.f5987E) + 0.5f);
                    }
                }
            } else if (i4 == 3 && eVar2.f6017e.f6182e.f6134j) {
                int w2 = eVar2.w();
                if (w2 != -1) {
                    if (w2 == 0) {
                        e eVar3 = this.f6179b;
                        f2 = ((float) eVar3.f6017e.f6182e.f6131g) * eVar3.v();
                        i2 = (int) (f2 + 0.5f);
                    } else if (w2 != 1) {
                        i2 = 0;
                    }
                }
                e eVar4 = this.f6179b;
                f2 = ((float) eVar4.f6017e.f6182e.f6131g) / eVar4.v();
                i2 = (int) (f2 + 0.5f);
            }
            this.f6182e.d(i2);
        }
        f fVar = this.f6185h;
        if (fVar.f6127c) {
            f fVar2 = this.f6186i;
            if (fVar2.f6127c) {
                if (!fVar.f6134j || !fVar2.f6134j || !this.f6182e.f6134j) {
                    if (!this.f6182e.f6134j && this.f6181d == e.b.MATCH_CONSTRAINT) {
                        e eVar5 = this.f6179b;
                        if (eVar5.f6053w == 0 && !eVar5.k0()) {
                            int i5 = ((f) this.f6185h.f6136l.get(0)).f6131g;
                            f fVar3 = this.f6185h;
                            int i6 = i5 + fVar3.f6130f;
                            int i7 = ((f) this.f6186i.f6136l.get(0)).f6131g + this.f6186i.f6130f;
                            fVar3.d(i6);
                            this.f6186i.d(i7);
                            this.f6182e.d(i7 - i6);
                            return;
                        }
                    }
                    if (!this.f6182e.f6134j && this.f6181d == e.b.MATCH_CONSTRAINT && this.f6178a == 1 && this.f6185h.f6136l.size() > 0 && this.f6186i.f6136l.size() > 0) {
                        int i8 = (((f) this.f6186i.f6136l.get(0)).f6131g + this.f6186i.f6130f) - (((f) this.f6185h.f6136l.get(0)).f6131g + this.f6185h.f6130f);
                        g gVar3 = this.f6182e;
                        int i9 = gVar3.f6146m;
                        if (i8 < i9) {
                            gVar3.d(i8);
                        } else {
                            gVar3.d(i9);
                        }
                    }
                    if (this.f6182e.f6134j && this.f6185h.f6136l.size() > 0 && this.f6186i.f6136l.size() > 0) {
                        f fVar4 = (f) this.f6185h.f6136l.get(0);
                        f fVar5 = (f) this.f6186i.f6136l.get(0);
                        int i10 = fVar4.f6131g + this.f6185h.f6130f;
                        int i11 = fVar5.f6131g + this.f6186i.f6130f;
                        float R2 = this.f6179b.R();
                        if (fVar4 == fVar5) {
                            i10 = fVar4.f6131g;
                            i11 = fVar5.f6131g;
                            R2 = 0.5f;
                        }
                        this.f6185h.d((int) (((float) i10) + 0.5f + (((float) ((i11 - i10) - this.f6182e.f6131g)) * R2)));
                        this.f6186i.d(this.f6185h.f6131g + this.f6182e.f6131g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02dd, code lost:
        if (r10.f6179b.Z() != false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0332, code lost:
        if (r0.f6181d == r1) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0362, code lost:
        if (r10.f6179b.Z() != false) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03d7, code lost:
        if (r0.f6181d == r1) goto L_0x03d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r10 = this;
            p.e r0 = r10.f6179b
            boolean r1 = r0.f6009a
            if (r1 == 0) goto L_0x000f
            q.g r1 = r10.f6182e
            int r0 = r0.x()
            r1.d(r0)
        L_0x000f:
            q.g r0 = r10.f6182e
            boolean r0 = r0.f6134j
            if (r0 != 0) goto L_0x0097
            p.e r0 = r10.f6179b
            p.e$b r0 = r0.T()
            r10.f6181d = r0
            p.e r0 = r10.f6179b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x002c
            q.a r0 = new q.a
            r0.<init>(r10)
            r10.f6161l = r0
        L_0x002c:
            p.e$b r0 = r10.f6181d
            p.e$b r1 = p.e.b.MATCH_CONSTRAINT
            if (r0 == r1) goto L_0x00d1
            p.e$b r1 = p.e.b.MATCH_PARENT
            if (r0 != r1) goto L_0x0085
            p.e r0 = r10.f6179b
            p.e r0 = r0.K()
            if (r0 == 0) goto L_0x0085
            p.e$b r1 = r0.T()
            p.e$b r2 = p.e.b.FIXED
            if (r1 != r2) goto L_0x0085
            int r1 = r0.x()
            p.e r2 = r10.f6179b
            p.d r2 = r2.f5998P
            int r2 = r2.f()
            int r1 = r1 - r2
            p.e r2 = r10.f6179b
            p.d r2 = r2.f6000R
            int r2 = r2.f()
            int r1 = r1 - r2
            q.f r2 = r10.f6185h
            q.n r3 = r0.f6019f
            q.f r3 = r3.f6185h
            p.e r4 = r10.f6179b
            p.d r4 = r4.f5998P
            int r4 = r4.f()
            r10.b(r2, r3, r4)
            q.f r2 = r10.f6186i
            q.n r0 = r0.f6019f
            q.f r0 = r0.f6186i
            p.e r3 = r10.f6179b
            p.d r3 = r3.f6000R
            int r3 = r3.f()
            int r3 = -r3
            r10.b(r2, r0, r3)
            q.g r0 = r10.f6182e
            r0.d(r1)
            return
        L_0x0085:
            p.e$b r0 = r10.f6181d
            p.e$b r1 = p.e.b.FIXED
            if (r0 != r1) goto L_0x00d1
            q.g r0 = r10.f6182e
            p.e r1 = r10.f6179b
            int r1 = r1.x()
            r0.d(r1)
            goto L_0x00d1
        L_0x0097:
            p.e$b r0 = r10.f6181d
            p.e$b r1 = p.e.b.MATCH_PARENT
            if (r0 != r1) goto L_0x00d1
            p.e r0 = r10.f6179b
            p.e r0 = r0.K()
            if (r0 == 0) goto L_0x00d1
            p.e$b r1 = r0.T()
            p.e$b r2 = p.e.b.FIXED
            if (r1 != r2) goto L_0x00d1
            q.f r1 = r10.f6185h
            q.n r2 = r0.f6019f
            q.f r2 = r2.f6185h
            p.e r3 = r10.f6179b
            p.d r3 = r3.f5998P
            int r3 = r3.f()
            r10.b(r1, r2, r3)
            q.f r1 = r10.f6186i
            q.n r0 = r0.f6019f
            q.f r0 = r0.f6186i
            p.e r2 = r10.f6179b
            p.d r2 = r2.f6000R
            int r2 = r2.f()
            int r2 = -r2
            r10.b(r1, r0, r2)
            return
        L_0x00d1:
            q.g r0 = r10.f6182e
            boolean r1 = r0.f6134j
            r2 = 0
            r3 = 4
            r4 = 2
            r5 = 1
            r6 = 3
            if (r1 == 0) goto L_0x022f
            p.e r7 = r10.f6179b
            boolean r8 = r7.f6009a
            if (r8 == 0) goto L_0x022f
            p.d[] r0 = r7.f6005W
            r1 = r0[r4]
            p.d r8 = r1.f5965f
            if (r8 == 0) goto L_0x016a
            r9 = r0[r6]
            p.d r9 = r9.f5965f
            if (r9 == 0) goto L_0x016a
            boolean r0 = r7.k0()
            if (r0 == 0) goto L_0x0114
            q.f r0 = r10.f6185h
            p.e r1 = r10.f6179b
            p.d[] r1 = r1.f6005W
            r1 = r1[r4]
            int r1 = r1.f()
            r0.f6130f = r1
            q.f r0 = r10.f6186i
            p.e r1 = r10.f6179b
            p.d[] r1 = r1.f6005W
            r1 = r1[r6]
            int r1 = r1.f()
            int r1 = -r1
            r0.f6130f = r1
            goto L_0x0153
        L_0x0114:
            p.e r0 = r10.f6179b
            p.d[] r0 = r0.f6005W
            r0 = r0[r4]
            q.f r0 = r10.h(r0)
            if (r0 == 0) goto L_0x012f
            q.f r1 = r10.f6185h
            p.e r2 = r10.f6179b
            p.d[] r2 = r2.f6005W
            r2 = r2[r4]
            int r2 = r2.f()
            r10.b(r1, r0, r2)
        L_0x012f:
            p.e r0 = r10.f6179b
            p.d[] r0 = r0.f6005W
            r0 = r0[r6]
            q.f r0 = r10.h(r0)
            if (r0 == 0) goto L_0x014b
            q.f r1 = r10.f6186i
            p.e r2 = r10.f6179b
            p.d[] r2 = r2.f6005W
            r2 = r2[r6]
            int r2 = r2.f()
            int r2 = -r2
            r10.b(r1, r0, r2)
        L_0x014b:
            q.f r0 = r10.f6185h
            r0.f6126b = r5
            q.f r0 = r10.f6186i
            r0.f6126b = r5
        L_0x0153:
            p.e r0 = r10.f6179b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x0401
        L_0x015b:
            q.f r0 = r10.f6160k
            q.f r1 = r10.f6185h
            p.e r2 = r10.f6179b
            int r2 = r2.p()
        L_0x0165:
            r10.b(r0, r1, r2)
            goto L_0x0401
        L_0x016a:
            if (r8 == 0) goto L_0x0195
            q.f r0 = r10.h(r1)
            if (r0 == 0) goto L_0x0401
            q.f r1 = r10.f6185h
            p.e r2 = r10.f6179b
            p.d[] r2 = r2.f6005W
            r2 = r2[r4]
            int r2 = r2.f()
            r10.b(r1, r0, r2)
            q.f r0 = r10.f6186i
            q.f r1 = r10.f6185h
            q.g r2 = r10.f6182e
            int r2 = r2.f6131g
            r10.b(r0, r1, r2)
            p.e r0 = r10.f6179b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x0401
            goto L_0x015b
        L_0x0195:
            r1 = r0[r6]
            p.d r4 = r1.f5965f
            if (r4 == 0) goto L_0x01c6
            q.f r0 = r10.h(r1)
            if (r0 == 0) goto L_0x01bd
            q.f r1 = r10.f6186i
            p.e r2 = r10.f6179b
            p.d[] r2 = r2.f6005W
            r2 = r2[r6]
            int r2 = r2.f()
            int r2 = -r2
            r10.b(r1, r0, r2)
            q.f r0 = r10.f6185h
            q.f r1 = r10.f6186i
            q.g r2 = r10.f6182e
            int r2 = r2.f6131g
            int r2 = -r2
            r10.b(r0, r1, r2)
        L_0x01bd:
            p.e r0 = r10.f6179b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x0401
            goto L_0x015b
        L_0x01c6:
            r0 = r0[r3]
            p.d r1 = r0.f5965f
            if (r1 == 0) goto L_0x01ef
            q.f r0 = r10.h(r0)
            if (r0 == 0) goto L_0x0401
            q.f r1 = r10.f6160k
            r10.b(r1, r0, r2)
            q.f r0 = r10.f6185h
            q.f r1 = r10.f6160k
            p.e r2 = r10.f6179b
            int r2 = r2.p()
            int r2 = -r2
            r10.b(r0, r1, r2)
            q.f r0 = r10.f6186i
            q.f r1 = r10.f6185h
            q.g r2 = r10.f6182e
            int r2 = r2.f6131g
            goto L_0x0165
        L_0x01ef:
            boolean r0 = r7 instanceof p.i
            if (r0 != 0) goto L_0x0401
            p.e r0 = r7.K()
            if (r0 == 0) goto L_0x0401
            p.e r0 = r10.f6179b
            p.d$b r1 = p.d.b.CENTER
            p.d r0 = r0.o(r1)
            p.d r0 = r0.f5965f
            if (r0 != 0) goto L_0x0401
            p.e r0 = r10.f6179b
            p.e r0 = r0.K()
            q.n r0 = r0.f6019f
            q.f r0 = r0.f6185h
            q.f r1 = r10.f6185h
            p.e r2 = r10.f6179b
            int r2 = r2.Y()
            r10.b(r1, r0, r2)
            q.f r0 = r10.f6186i
            q.f r1 = r10.f6185h
            q.g r2 = r10.f6182e
            int r2 = r2.f6131g
            r10.b(r0, r1, r2)
            p.e r0 = r10.f6179b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x0401
            goto L_0x015b
        L_0x022f:
            if (r1 != 0) goto L_0x027e
            p.e$b r1 = r10.f6181d
            p.e$b r7 = p.e.b.MATCH_CONSTRAINT
            if (r1 != r7) goto L_0x027e
            p.e r0 = r10.f6179b
            int r1 = r0.f6055x
            if (r1 == r4) goto L_0x0274
            if (r1 == r6) goto L_0x0240
            goto L_0x0281
        L_0x0240:
            boolean r0 = r0.k0()
            if (r0 != 0) goto L_0x0281
            p.e r0 = r10.f6179b
            int r1 = r0.f6053w
            if (r1 != r6) goto L_0x024d
            goto L_0x0281
        L_0x024d:
            q.l r0 = r0.f6017e
        L_0x024f:
            q.g r0 = r0.f6182e
            q.g r1 = r10.f6182e
            java.util.List r1 = r1.f6136l
            r1.add(r0)
            java.util.List r0 = r0.f6135k
            q.g r1 = r10.f6182e
            r0.add(r1)
            q.g r0 = r10.f6182e
            r0.f6126b = r5
            java.util.List r0 = r0.f6135k
            q.f r1 = r10.f6185h
            r0.add(r1)
            q.g r0 = r10.f6182e
            java.util.List r0 = r0.f6135k
            q.f r1 = r10.f6186i
            r0.add(r1)
            goto L_0x0281
        L_0x0274:
            p.e r0 = r0.K()
            if (r0 != 0) goto L_0x027b
            goto L_0x0281
        L_0x027b:
            q.n r0 = r0.f6019f
            goto L_0x024f
        L_0x027e:
            r0.b(r10)
        L_0x0281:
            p.e r0 = r10.f6179b
            p.d[] r1 = r0.f6005W
            r7 = r1[r4]
            p.d r8 = r7.f5965f
            if (r8 == 0) goto L_0x02ea
            r9 = r1[r6]
            p.d r9 = r9.f5965f
            if (r9 == 0) goto L_0x02ea
            boolean r0 = r0.k0()
            if (r0 == 0) goto L_0x02b5
            q.f r0 = r10.f6185h
            p.e r1 = r10.f6179b
            p.d[] r1 = r1.f6005W
            r1 = r1[r4]
            int r1 = r1.f()
            r0.f6130f = r1
            q.f r0 = r10.f6186i
            p.e r1 = r10.f6179b
            p.d[] r1 = r1.f6005W
            r1 = r1[r6]
            int r1 = r1.f()
            int r1 = -r1
            r0.f6130f = r1
            goto L_0x02d7
        L_0x02b5:
            p.e r0 = r10.f6179b
            p.d[] r0 = r0.f6005W
            r0 = r0[r4]
            q.f r0 = r10.h(r0)
            p.e r1 = r10.f6179b
            p.d[] r1 = r1.f6005W
            r1 = r1[r6]
            q.f r1 = r10.h(r1)
            if (r0 == 0) goto L_0x02ce
            r0.b(r10)
        L_0x02ce:
            if (r1 == 0) goto L_0x02d3
            r1.b(r10)
        L_0x02d3:
            q.p$b r0 = q.p.b.CENTER
            r10.f6187j = r0
        L_0x02d7:
            p.e r0 = r10.f6179b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x03f3
        L_0x02df:
            q.f r0 = r10.f6160k
            q.f r1 = r10.f6185h
            q.g r2 = r10.f6161l
        L_0x02e5:
            r10.c(r0, r1, r5, r2)
            goto L_0x03f3
        L_0x02ea:
            r9 = 0
            if (r8 == 0) goto L_0x0336
            q.f r0 = r10.h(r7)
            if (r0 == 0) goto L_0x03f3
            q.f r1 = r10.f6185h
            p.e r2 = r10.f6179b
            p.d[] r2 = r2.f6005W
            r2 = r2[r4]
            int r2 = r2.f()
            r10.b(r1, r0, r2)
            q.f r0 = r10.f6186i
            q.f r1 = r10.f6185h
            q.g r2 = r10.f6182e
            r10.c(r0, r1, r5, r2)
            p.e r0 = r10.f6179b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x031c
            q.f r0 = r10.f6160k
            q.f r1 = r10.f6185h
            q.g r2 = r10.f6161l
            r10.c(r0, r1, r5, r2)
        L_0x031c:
            p.e$b r0 = r10.f6181d
            p.e$b r1 = p.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03f3
            p.e r0 = r10.f6179b
            float r0 = r0.v()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f3
            p.e r0 = r10.f6179b
            q.l r0 = r0.f6017e
            p.e$b r2 = r0.f6181d
            if (r2 != r1) goto L_0x03f3
            goto L_0x03d9
        L_0x0336:
            r4 = r1[r6]
            p.d r7 = r4.f5965f
            r8 = -1
            if (r7 == 0) goto L_0x0366
            q.f r0 = r10.h(r4)
            if (r0 == 0) goto L_0x03f3
            q.f r1 = r10.f6186i
            p.e r2 = r10.f6179b
            p.d[] r2 = r2.f6005W
            r2 = r2[r6]
            int r2 = r2.f()
            int r2 = -r2
            r10.b(r1, r0, r2)
            q.f r0 = r10.f6185h
            q.f r1 = r10.f6186i
            q.g r2 = r10.f6182e
            r10.c(r0, r1, r8, r2)
            p.e r0 = r10.f6179b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x03f3
            goto L_0x02df
        L_0x0366:
            r1 = r1[r3]
            p.d r3 = r1.f5965f
            if (r3 == 0) goto L_0x0388
            q.f r0 = r10.h(r1)
            if (r0 == 0) goto L_0x03f3
            q.f r1 = r10.f6160k
            r10.b(r1, r0, r2)
            q.f r0 = r10.f6185h
            q.f r1 = r10.f6160k
            q.g r2 = r10.f6161l
            r10.c(r0, r1, r8, r2)
            q.f r0 = r10.f6186i
            q.f r1 = r10.f6185h
            q.g r2 = r10.f6182e
            goto L_0x02e5
        L_0x0388:
            boolean r1 = r0 instanceof p.i
            if (r1 != 0) goto L_0x03f3
            p.e r0 = r0.K()
            if (r0 == 0) goto L_0x03f3
            p.e r0 = r10.f6179b
            p.e r0 = r0.K()
            q.n r0 = r0.f6019f
            q.f r0 = r0.f6185h
            q.f r1 = r10.f6185h
            p.e r2 = r10.f6179b
            int r2 = r2.Y()
            r10.b(r1, r0, r2)
            q.f r0 = r10.f6186i
            q.f r1 = r10.f6185h
            q.g r2 = r10.f6182e
            r10.c(r0, r1, r5, r2)
            p.e r0 = r10.f6179b
            boolean r0 = r0.Z()
            if (r0 == 0) goto L_0x03c1
            q.f r0 = r10.f6160k
            q.f r1 = r10.f6185h
            q.g r2 = r10.f6161l
            r10.c(r0, r1, r5, r2)
        L_0x03c1:
            p.e$b r0 = r10.f6181d
            p.e$b r1 = p.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03f3
            p.e r0 = r10.f6179b
            float r0 = r0.v()
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x03f3
            p.e r0 = r10.f6179b
            q.l r0 = r0.f6017e
            p.e$b r2 = r0.f6181d
            if (r2 != r1) goto L_0x03f3
        L_0x03d9:
            q.g r0 = r0.f6182e
            java.util.List r0 = r0.f6135k
            q.g r1 = r10.f6182e
            r0.add(r1)
            q.g r0 = r10.f6182e
            java.util.List r0 = r0.f6136l
            p.e r1 = r10.f6179b
            q.l r1 = r1.f6017e
            q.g r1 = r1.f6182e
            r0.add(r1)
            q.g r0 = r10.f6182e
            r0.f6125a = r10
        L_0x03f3:
            q.g r0 = r10.f6182e
            java.util.List r0 = r0.f6136l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0401
            q.g r0 = r10.f6182e
            r0.f6127c = r5
        L_0x0401:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.n.d():void");
    }

    public void e() {
        f fVar = this.f6185h;
        if (fVar.f6134j) {
            this.f6179b.n1(fVar.f6131g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f6180c = null;
        this.f6185h.c();
        this.f6186i.c();
        this.f6160k.c();
        this.f6182e.c();
        this.f6184g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (this.f6181d != e.b.MATCH_CONSTRAINT || this.f6179b.f6055x == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f6184g = false;
        this.f6185h.c();
        this.f6185h.f6134j = false;
        this.f6186i.c();
        this.f6186i.f6134j = false;
        this.f6160k.c();
        this.f6160k.f6134j = false;
        this.f6182e.f6134j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f6179b.t();
    }
}
