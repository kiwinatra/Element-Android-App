package q;

import java.util.List;
import p.d;
import p.e;
import p.i;
import q.f;
import q.p;

public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    private static int[] f6150k = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6151a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                q.p$b[] r0 = q.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6151a = r0
                q.p$b r1 = q.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6151a     // Catch:{ NoSuchFieldError -> 0x001d }
                q.p$b r1 = q.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6151a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q.p$b r1 = q.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q.l.a.<clinit>():void");
        }
    }

    public l(e eVar) {
        super(eVar);
        this.f6185h.f6129e = f.a.LEFT;
        this.f6186i.f6129e = f.a.RIGHT;
        this.f6183f = 0;
    }

    private void q(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 == -1) {
            int i9 = (int) ((((float) i8) * f2) + 0.5f);
            int i10 = (int) ((((float) i7) / f2) + 0.5f);
            if (i9 <= i7) {
                iArr[0] = i9;
                iArr[1] = i8;
            } else if (i10 <= i8) {
                iArr[0] = i7;
                iArr[1] = i10;
            }
        } else if (i6 == 0) {
            iArr[0] = (int) ((((float) i8) * f2) + 0.5f);
            iArr[1] = i8;
        } else if (i6 == 1) {
            iArr[0] = i7;
            iArr[1] = (int) ((((float) i7) * f2) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x029d, code lost:
        if (r14 != 1) goto L_0x02f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(q.d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = q.l.a.f6151a
            q.p$b r1 = r8.f6187j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            p.e r0 = r8.f6179b
            p.d r1 = r0.f5997O
            p.d r0 = r0.f5999Q
            r3 = r17
            r8.n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.p(r17)
        L_0x002e:
            q.g r0 = r8.f6182e
            boolean r0 = r0.f6134j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x02f0
            p.e$b r0 = r8.f6181d
            p.e$b r3 = p.e.b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x02f0
            p.e r0 = r8.f6179b
            int r3 = r0.f6053w
            if (r3 == r1) goto L_0x02d5
            if (r3 == r2) goto L_0x0046
            goto L_0x02f0
        L_0x0046:
            int r1 = r0.f6055x
            r3 = -1
            if (r1 == 0) goto L_0x0082
            if (r1 != r2) goto L_0x004e
            goto L_0x0082
        L_0x004e:
            int r0 = r0.w()
            if (r0 == r3) goto L_0x005a
            if (r0 == 0) goto L_0x006c
            if (r0 == r9) goto L_0x005a
            r0 = 0
            goto L_0x007b
        L_0x005a:
            p.e r0 = r8.f6179b
            q.n r1 = r0.f6019f
            q.g r1 = r1.f6182e
            int r1 = r1.f6131g
            float r1 = (float) r1
            float r0 = r0.v()
            float r1 = r1 * r0
        L_0x0069:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L_0x007b
        L_0x006c:
            p.e r0 = r8.f6179b
            q.n r1 = r0.f6019f
            q.g r1 = r1.f6182e
            int r1 = r1.f6131g
            float r1 = (float) r1
            float r0 = r0.v()
            float r1 = r1 / r0
            goto L_0x0069
        L_0x007b:
            q.g r1 = r8.f6182e
            r1.d(r0)
            goto L_0x02f0
        L_0x0082:
            q.n r1 = r0.f6019f
            q.f r12 = r1.f6185h
            q.f r13 = r1.f6186i
            p.d r1 = r0.f5997O
            p.d r1 = r1.f5965f
            if (r1 == 0) goto L_0x0090
            r1 = 1
            goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            p.d r2 = r0.f5998P
            p.d r2 = r2.f5965f
            if (r2 == 0) goto L_0x0099
            r2 = 1
            goto L_0x009a
        L_0x0099:
            r2 = 0
        L_0x009a:
            p.d r4 = r0.f5999Q
            p.d r4 = r4.f5965f
            if (r4 == 0) goto L_0x00a2
            r4 = 1
            goto L_0x00a3
        L_0x00a2:
            r4 = 0
        L_0x00a3:
            p.d r5 = r0.f6000R
            p.d r5 = r5.f5965f
            if (r5 == 0) goto L_0x00ab
            r5 = 1
            goto L_0x00ac
        L_0x00ab:
            r5 = 0
        L_0x00ac:
            int r14 = r0.w()
            if (r1 == 0) goto L_0x01f3
            if (r2 == 0) goto L_0x01f3
            if (r4 == 0) goto L_0x01f3
            if (r5 == 0) goto L_0x01f3
            p.e r0 = r8.f6179b
            float r15 = r0.v()
            boolean r0 = r12.f6134j
            if (r0 == 0) goto L_0x0121
            boolean r0 = r13.f6134j
            if (r0 == 0) goto L_0x0121
            q.f r0 = r8.f6185h
            boolean r1 = r0.f6127c
            if (r1 == 0) goto L_0x0120
            q.f r1 = r8.f6186i
            boolean r1 = r1.f6127c
            if (r1 != 0) goto L_0x00d3
            goto L_0x0120
        L_0x00d3:
            java.util.List r0 = r0.f6136l
            java.lang.Object r0 = r0.get(r10)
            q.f r0 = (q.f) r0
            int r0 = r0.f6131g
            q.f r1 = r8.f6185h
            int r1 = r1.f6130f
            int r2 = r0 + r1
            q.f r0 = r8.f6186i
            java.util.List r0 = r0.f6136l
            java.lang.Object r0 = r0.get(r10)
            q.f r0 = (q.f) r0
            int r0 = r0.f6131g
            q.f r1 = r8.f6186i
            int r1 = r1.f6130f
            int r3 = r0 - r1
            int r0 = r12.f6131g
            int r1 = r12.f6130f
            int r4 = r0 + r1
            int r0 = r13.f6131g
            int r1 = r13.f6130f
            int r5 = r0 - r1
            int[] r1 = f6150k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            q.g r0 = r8.f6182e
            int[] r1 = f6150k
            r1 = r1[r10]
            r0.d(r1)
            p.e r0 = r8.f6179b
            q.n r0 = r0.f6019f
            q.g r0 = r0.f6182e
            int[] r1 = f6150k
            r1 = r1[r9]
            r0.d(r1)
        L_0x0120:
            return
        L_0x0121:
            q.f r0 = r8.f6185h
            boolean r1 = r0.f6134j
            if (r1 == 0) goto L_0x017e
            q.f r1 = r8.f6186i
            boolean r2 = r1.f6134j
            if (r2 == 0) goto L_0x017e
            boolean r2 = r12.f6127c
            if (r2 == 0) goto L_0x017d
            boolean r2 = r13.f6127c
            if (r2 != 0) goto L_0x0136
            goto L_0x017d
        L_0x0136:
            int r2 = r0.f6131g
            int r0 = r0.f6130f
            int r2 = r2 + r0
            int r0 = r1.f6131g
            int r1 = r1.f6130f
            int r3 = r0 - r1
            java.util.List r0 = r12.f6136l
            java.lang.Object r0 = r0.get(r10)
            q.f r0 = (q.f) r0
            int r0 = r0.f6131g
            int r1 = r12.f6130f
            int r4 = r0 + r1
            java.util.List r0 = r13.f6136l
            java.lang.Object r0 = r0.get(r10)
            q.f r0 = (q.f) r0
            int r0 = r0.f6131g
            int r1 = r13.f6130f
            int r5 = r0 - r1
            int[] r1 = f6150k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            q.g r0 = r8.f6182e
            int[] r1 = f6150k
            r1 = r1[r10]
            r0.d(r1)
            p.e r0 = r8.f6179b
            q.n r0 = r0.f6019f
            q.g r0 = r0.f6182e
            int[] r1 = f6150k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x017e
        L_0x017d:
            return
        L_0x017e:
            q.f r0 = r8.f6185h
            boolean r1 = r0.f6127c
            if (r1 == 0) goto L_0x01f2
            q.f r1 = r8.f6186i
            boolean r1 = r1.f6127c
            if (r1 == 0) goto L_0x01f2
            boolean r1 = r12.f6127c
            if (r1 == 0) goto L_0x01f2
            boolean r1 = r13.f6127c
            if (r1 != 0) goto L_0x0193
            goto L_0x01f2
        L_0x0193:
            java.util.List r0 = r0.f6136l
            java.lang.Object r0 = r0.get(r10)
            q.f r0 = (q.f) r0
            int r0 = r0.f6131g
            q.f r1 = r8.f6185h
            int r1 = r1.f6130f
            int r2 = r0 + r1
            q.f r0 = r8.f6186i
            java.util.List r0 = r0.f6136l
            java.lang.Object r0 = r0.get(r10)
            q.f r0 = (q.f) r0
            int r0 = r0.f6131g
            q.f r1 = r8.f6186i
            int r1 = r1.f6130f
            int r3 = r0 - r1
            java.util.List r0 = r12.f6136l
            java.lang.Object r0 = r0.get(r10)
            q.f r0 = (q.f) r0
            int r0 = r0.f6131g
            int r1 = r12.f6130f
            int r4 = r0 + r1
            java.util.List r0 = r13.f6136l
            java.lang.Object r0 = r0.get(r10)
            q.f r0 = (q.f) r0
            int r0 = r0.f6131g
            int r1 = r13.f6130f
            int r5 = r0 - r1
            int[] r1 = f6150k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            q.g r0 = r8.f6182e
            int[] r1 = f6150k
            r1 = r1[r10]
            r0.d(r1)
            p.e r0 = r8.f6179b
            q.n r0 = r0.f6019f
            q.g r0 = r0.f6182e
            int[] r1 = f6150k
            r1 = r1[r9]
        L_0x01ed:
            r0.d(r1)
            goto L_0x02f0
        L_0x01f2:
            return
        L_0x01f3:
            if (r1 == 0) goto L_0x026c
            if (r4 == 0) goto L_0x026c
            q.f r0 = r8.f6185h
            boolean r0 = r0.f6127c
            if (r0 == 0) goto L_0x026b
            q.f r0 = r8.f6186i
            boolean r0 = r0.f6127c
            if (r0 != 0) goto L_0x0204
            goto L_0x026b
        L_0x0204:
            p.e r0 = r8.f6179b
            float r0 = r0.v()
            q.f r1 = r8.f6185h
            java.util.List r1 = r1.f6136l
            java.lang.Object r1 = r1.get(r10)
            q.f r1 = (q.f) r1
            int r1 = r1.f6131g
            q.f r2 = r8.f6185h
            int r2 = r2.f6130f
            int r1 = r1 + r2
            q.f r2 = r8.f6186i
            java.util.List r2 = r2.f6136l
            java.lang.Object r2 = r2.get(r10)
            q.f r2 = (q.f) r2
            int r2 = r2.f6131g
            q.f r4 = r8.f6186i
            int r4 = r4.f6130f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0258
            if (r14 == 0) goto L_0x0258
            if (r14 == r9) goto L_0x0234
            goto L_0x02f0
        L_0x0234:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0248
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x0246:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0248:
            q.g r0 = r8.f6182e
            r0.d(r1)
            p.e r0 = r8.f6179b
            q.n r0 = r0.f6019f
            q.g r0 = r0.f6182e
            r0.d(r3)
            goto L_0x02f0
        L_0x0258:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0248
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x0246
        L_0x026b:
            return
        L_0x026c:
            if (r2 == 0) goto L_0x02f0
            if (r5 == 0) goto L_0x02f0
            boolean r0 = r12.f6127c
            if (r0 == 0) goto L_0x02d4
            boolean r0 = r13.f6127c
            if (r0 != 0) goto L_0x0279
            goto L_0x02d4
        L_0x0279:
            p.e r0 = r8.f6179b
            float r0 = r0.v()
            java.util.List r1 = r12.f6136l
            java.lang.Object r1 = r1.get(r10)
            q.f r1 = (q.f) r1
            int r1 = r1.f6131g
            int r2 = r12.f6130f
            int r1 = r1 + r2
            java.util.List r2 = r13.f6136l
            java.lang.Object r2 = r2.get(r10)
            q.f r2 = (q.f) r2
            int r2 = r2.f6131g
            int r4 = r13.f6130f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02c1
            if (r14 == 0) goto L_0x02a0
            if (r14 == r9) goto L_0x02c1
            goto L_0x02f0
        L_0x02a0:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02b4
            float r1 = (float) r3
            float r1 = r1 / r0
        L_0x02b2:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02b4:
            q.g r0 = r8.f6182e
            r0.d(r3)
            p.e r0 = r8.f6179b
            q.n r0 = r0.f6019f
            q.g r0 = r0.f6182e
            goto L_0x01ed
        L_0x02c1:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02b4
            float r1 = (float) r3
            float r1 = r1 * r0
            goto L_0x02b2
        L_0x02d4:
            return
        L_0x02d5:
            p.e r0 = r0.K()
            if (r0 == 0) goto L_0x02f0
            q.l r0 = r0.f6017e
            q.g r0 = r0.f6182e
            boolean r1 = r0.f6134j
            if (r1 == 0) goto L_0x02f0
            p.e r1 = r8.f6179b
            float r1 = r1.f5982B
            int r0 = r0.f6131g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            goto L_0x007b
        L_0x02f0:
            q.f r0 = r8.f6185h
            boolean r1 = r0.f6127c
            if (r1 == 0) goto L_0x0412
            q.f r1 = r8.f6186i
            boolean r2 = r1.f6127c
            if (r2 != 0) goto L_0x02fe
            goto L_0x0412
        L_0x02fe:
            boolean r0 = r0.f6134j
            if (r0 == 0) goto L_0x030d
            boolean r0 = r1.f6134j
            if (r0 == 0) goto L_0x030d
            q.g r0 = r8.f6182e
            boolean r0 = r0.f6134j
            if (r0 == 0) goto L_0x030d
            return
        L_0x030d:
            q.g r0 = r8.f6182e
            boolean r0 = r0.f6134j
            if (r0 != 0) goto L_0x0357
            p.e$b r0 = r8.f6181d
            p.e$b r1 = p.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0357
            p.e r0 = r8.f6179b
            int r1 = r0.f6053w
            if (r1 != 0) goto L_0x0357
            boolean r0 = r0.i0()
            if (r0 != 0) goto L_0x0357
            q.f r0 = r8.f6185h
            java.util.List r0 = r0.f6136l
            java.lang.Object r0 = r0.get(r10)
            q.f r0 = (q.f) r0
            q.f r1 = r8.f6186i
            java.util.List r1 = r1.f6136l
            java.lang.Object r1 = r1.get(r10)
            q.f r1 = (q.f) r1
            int r0 = r0.f6131g
            q.f r2 = r8.f6185h
            int r3 = r2.f6130f
            int r0 = r0 + r3
            int r1 = r1.f6131g
            q.f r3 = r8.f6186i
            int r3 = r3.f6130f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.d(r0)
            q.f r0 = r8.f6186i
            r0.d(r1)
            q.g r0 = r8.f6182e
            r0.d(r3)
            return
        L_0x0357:
            q.g r0 = r8.f6182e
            boolean r0 = r0.f6134j
            if (r0 != 0) goto L_0x03bb
            p.e$b r0 = r8.f6181d
            p.e$b r1 = p.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03bb
            int r0 = r8.f6178a
            if (r0 != r9) goto L_0x03bb
            q.f r0 = r8.f6185h
            java.util.List r0 = r0.f6136l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03bb
            q.f r0 = r8.f6186i
            java.util.List r0 = r0.f6136l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03bb
            q.f r0 = r8.f6185h
            java.util.List r0 = r0.f6136l
            java.lang.Object r0 = r0.get(r10)
            q.f r0 = (q.f) r0
            q.f r1 = r8.f6186i
            java.util.List r1 = r1.f6136l
            java.lang.Object r1 = r1.get(r10)
            q.f r1 = (q.f) r1
            int r0 = r0.f6131g
            q.f r2 = r8.f6185h
            int r2 = r2.f6130f
            int r0 = r0 + r2
            int r1 = r1.f6131g
            q.f r2 = r8.f6186i
            int r2 = r2.f6130f
            int r1 = r1 + r2
            int r1 = r1 - r0
            q.g r0 = r8.f6182e
            int r0 = r0.f6146m
            int r0 = java.lang.Math.min(r1, r0)
            p.e r1 = r8.f6179b
            int r2 = r1.f5980A
            int r1 = r1.f6059z
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03b6
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03b6:
            q.g r1 = r8.f6182e
            r1.d(r0)
        L_0x03bb:
            q.g r0 = r8.f6182e
            boolean r0 = r0.f6134j
            if (r0 != 0) goto L_0x03c2
            return
        L_0x03c2:
            q.f r0 = r8.f6185h
            java.util.List r0 = r0.f6136l
            java.lang.Object r0 = r0.get(r10)
            q.f r0 = (q.f) r0
            q.f r1 = r8.f6186i
            java.util.List r1 = r1.f6136l
            java.lang.Object r1 = r1.get(r10)
            q.f r1 = (q.f) r1
            int r2 = r0.f6131g
            q.f r3 = r8.f6185h
            int r3 = r3.f6130f
            int r2 = r2 + r3
            int r3 = r1.f6131g
            q.f r4 = r8.f6186i
            int r4 = r4.f6130f
            int r3 = r3 + r4
            p.e r4 = r8.f6179b
            float r4 = r4.y()
            if (r0 != r1) goto L_0x03f2
            int r2 = r0.f6131g
            int r3 = r1.f6131g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x03f2:
            int r3 = r3 - r2
            q.g r0 = r8.f6182e
            int r0 = r0.f6131g
            int r3 = r3 - r0
            q.f r0 = r8.f6185h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.d(r1)
            q.f r0 = r8.f6186i
            q.f r1 = r8.f6185h
            int r1 = r1.f6131g
            q.g r2 = r8.f6182e
            int r2 = r2.f6131g
            int r1 = r1 + r2
            r0.d(r1)
        L_0x0412:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.l.a(q.d):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        int i2;
        f fVar;
        f fVar2;
        f fVar3;
        d dVar;
        List list;
        Object obj;
        f fVar4;
        int i3;
        f fVar5;
        f fVar6;
        int i4;
        f fVar7;
        f fVar8;
        e K2;
        e K3;
        e eVar = this.f6179b;
        if (eVar.f6009a) {
            this.f6182e.d(eVar.W());
        }
        if (!this.f6182e.f6134j) {
            e.b A2 = this.f6179b.A();
            this.f6181d = A2;
            if (A2 != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (A2 == bVar && (K3 = this.f6179b.K()) != null && (K3.A() == e.b.FIXED || K3.A() == bVar)) {
                    int W2 = (K3.W() - this.f6179b.f5997O.f()) - this.f6179b.f5999Q.f();
                    b(this.f6185h, K3.f6017e.f6185h, this.f6179b.f5997O.f());
                    b(this.f6186i, K3.f6017e.f6186i, -this.f6179b.f5999Q.f());
                    this.f6182e.d(W2);
                    return;
                } else if (this.f6181d == e.b.FIXED) {
                    this.f6182e.d(this.f6179b.W());
                }
            }
        } else {
            e.b bVar2 = this.f6181d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (K2 = this.f6179b.K()) != null && (K2.A() == e.b.FIXED || K2.A() == bVar3)) {
                b(this.f6185h, K2.f6017e.f6185h, this.f6179b.f5997O.f());
                b(this.f6186i, K2.f6017e.f6186i, -this.f6179b.f5999Q.f());
                return;
            }
        }
        g gVar = this.f6182e;
        if (gVar.f6134j) {
            e eVar2 = this.f6179b;
            if (eVar2.f6009a) {
                d[] dVarArr = eVar2.f6005W;
                d dVar2 = dVarArr[0];
                d dVar3 = dVar2.f5965f;
                if (dVar3 == null || dVarArr[1].f5965f == null) {
                    if (dVar3 != null) {
                        fVar8 = h(dVar2);
                        if (fVar8 != null) {
                            fVar7 = this.f6185h;
                            i4 = this.f6179b.f6005W[0].f();
                        } else {
                            return;
                        }
                    } else {
                        d dVar4 = dVarArr[1];
                        if (dVar4.f5965f != null) {
                            f h2 = h(dVar4);
                            if (h2 != null) {
                                b(this.f6186i, h2, -this.f6179b.f6005W[1].f());
                                fVar6 = this.f6185h;
                                fVar5 = this.f6186i;
                                i3 = -this.f6182e.f6131g;
                                b(fVar6, fVar5, i3);
                                return;
                            }
                            return;
                        } else if (!(eVar2 instanceof i) && eVar2.K() != null && this.f6179b.o(d.b.CENTER).f5965f == null) {
                            fVar8 = this.f6179b.K().f6017e.f6185h;
                            fVar7 = this.f6185h;
                            i4 = this.f6179b.X();
                        } else {
                            return;
                        }
                    }
                    b(fVar7, fVar8, i4);
                    fVar6 = this.f6186i;
                    fVar5 = this.f6185h;
                    i3 = this.f6182e.f6131g;
                    b(fVar6, fVar5, i3);
                    return;
                } else if (eVar2.i0()) {
                    this.f6185h.f6130f = this.f6179b.f6005W[0].f();
                    fVar3 = this.f6186i;
                    dVar = this.f6179b.f6005W[1];
                    fVar3.f6130f = -dVar.f();
                } else {
                    f h3 = h(this.f6179b.f6005W[0]);
                    if (h3 != null) {
                        b(this.f6185h, h3, this.f6179b.f6005W[0].f());
                    }
                    f h4 = h(this.f6179b.f6005W[1]);
                    if (h4 != null) {
                        b(this.f6186i, h4, -this.f6179b.f6005W[1].f());
                    }
                    this.f6185h.f6126b = true;
                    this.f6186i.f6126b = true;
                    return;
                }
            }
        }
        if (this.f6181d == e.b.MATCH_CONSTRAINT) {
            e eVar3 = this.f6179b;
            int i5 = eVar3.f6053w;
            if (i5 == 2) {
                e K4 = eVar3.K();
                if (K4 != null) {
                    g gVar2 = K4.f6019f.f6182e;
                    this.f6182e.f6136l.add(gVar2);
                    gVar2.f6135k.add(this.f6182e);
                    g gVar3 = this.f6182e;
                    gVar3.f6126b = true;
                    gVar3.f6135k.add(this.f6185h);
                    list = this.f6182e.f6135k;
                    obj = this.f6186i;
                }
            } else if (i5 == 3) {
                if (eVar3.f6055x == 3) {
                    this.f6185h.f6125a = this;
                    this.f6186i.f6125a = this;
                    n nVar = eVar3.f6019f;
                    nVar.f6185h.f6125a = this;
                    nVar.f6186i.f6125a = this;
                    gVar.f6125a = this;
                    if (eVar3.k0()) {
                        this.f6182e.f6136l.add(this.f6179b.f6019f.f6182e);
                        this.f6179b.f6019f.f6182e.f6135k.add(this.f6182e);
                        n nVar2 = this.f6179b.f6019f;
                        nVar2.f6182e.f6125a = this;
                        this.f6182e.f6136l.add(nVar2.f6185h);
                        this.f6182e.f6136l.add(this.f6179b.f6019f.f6186i);
                        this.f6179b.f6019f.f6185h.f6135k.add(this.f6182e);
                        list = this.f6179b.f6019f.f6186i.f6135k;
                    } else if (this.f6179b.i0()) {
                        this.f6179b.f6019f.f6182e.f6136l.add(this.f6182e);
                        list = this.f6182e.f6135k;
                        obj = this.f6179b.f6019f.f6182e;
                    } else {
                        fVar4 = this.f6179b.f6019f.f6182e;
                        list = fVar4.f6136l;
                    }
                } else {
                    g gVar4 = eVar3.f6019f.f6182e;
                    gVar.f6136l.add(gVar4);
                    gVar4.f6135k.add(this.f6182e);
                    this.f6179b.f6019f.f6185h.f6135k.add(this.f6182e);
                    this.f6179b.f6019f.f6186i.f6135k.add(this.f6182e);
                    g gVar5 = this.f6182e;
                    gVar5.f6126b = true;
                    gVar5.f6135k.add(this.f6185h);
                    this.f6182e.f6135k.add(this.f6186i);
                    this.f6185h.f6136l.add(this.f6182e);
                    fVar4 = this.f6186i;
                    list = fVar4.f6136l;
                }
                obj = this.f6182e;
            }
            list.add(obj);
        }
        e eVar4 = this.f6179b;
        d[] dVarArr2 = eVar4.f6005W;
        d dVar5 = dVarArr2[0];
        d dVar6 = dVar5.f5965f;
        if (dVar6 == null || dVarArr2[1].f5965f == null) {
            if (dVar6 != null) {
                fVar2 = h(dVar5);
                if (fVar2 != null) {
                    fVar = this.f6185h;
                    i2 = this.f6179b.f6005W[0].f();
                } else {
                    return;
                }
            } else {
                d dVar7 = dVarArr2[1];
                if (dVar7.f5965f != null) {
                    f h5 = h(dVar7);
                    if (h5 != null) {
                        b(this.f6186i, h5, -this.f6179b.f6005W[1].f());
                        c(this.f6185h, this.f6186i, -1, this.f6182e);
                        return;
                    }
                    return;
                } else if (!(eVar4 instanceof i) && eVar4.K() != null) {
                    fVar2 = this.f6179b.K().f6017e.f6185h;
                    fVar = this.f6185h;
                    i2 = this.f6179b.X();
                } else {
                    return;
                }
            }
            b(fVar, fVar2, i2);
            c(this.f6186i, this.f6185h, 1, this.f6182e);
        } else if (eVar4.i0()) {
            this.f6185h.f6130f = this.f6179b.f6005W[0].f();
            fVar3 = this.f6186i;
            dVar = this.f6179b.f6005W[1];
            fVar3.f6130f = -dVar.f();
        } else {
            f h6 = h(this.f6179b.f6005W[0]);
            f h7 = h(this.f6179b.f6005W[1]);
            if (h6 != null) {
                h6.b(this);
            }
            if (h7 != null) {
                h7.b(this);
            }
            this.f6187j = p.b.CENTER;
        }
    }

    public void e() {
        f fVar = this.f6185h;
        if (fVar.f6134j) {
            this.f6179b.m1(fVar.f6131g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f6180c = null;
        this.f6185h.c();
        this.f6186i.c();
        this.f6182e.c();
        this.f6184g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (this.f6181d != e.b.MATCH_CONSTRAINT || this.f6179b.f6053w == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f6184g = false;
        this.f6185h.c();
        this.f6185h.f6134j = false;
        this.f6186i.c();
        this.f6186i.f6134j = false;
        this.f6182e.f6134j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f6179b.t();
    }
}
