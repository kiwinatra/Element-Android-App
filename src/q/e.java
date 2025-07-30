package q;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p.e;
import p.f;
import p.h;
import p.j;
import q.C0278b;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private f f6116a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6117b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6118c = true;

    /* renamed from: d  reason: collision with root package name */
    private f f6119d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f6120e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f6121f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private C0278b.C0079b f6122g = null;

    /* renamed from: h  reason: collision with root package name */
    private C0278b.a f6123h = new C0278b.a();

    /* renamed from: i  reason: collision with root package name */
    ArrayList f6124i = new ArrayList();

    public e(f fVar) {
        this.f6116a = fVar;
        this.f6119d = fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: q.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: q.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(q.f r9, int r10, int r11, q.f r12, java.util.ArrayList r13, q.m r14) {
        /*
            r8 = this;
            q.p r9 = r9.f6128d
            q.m r0 = r9.f6180c
            if (r0 != 0) goto L_0x0109
            p.f r0 = r8.f6116a
            q.l r1 = r0.f6017e
            if (r9 == r1) goto L_0x0109
            q.n r0 = r0.f6019f
            if (r9 != r0) goto L_0x0012
            goto L_0x0109
        L_0x0012:
            if (r14 != 0) goto L_0x001c
            q.m r14 = new q.m
            r14.<init>(r9, r11)
            r13.add(r14)
        L_0x001c:
            r9.f6180c = r14
            r14.a(r9)
            q.f r11 = r9.f6185h
            java.util.List r11 = r11.f6135k
            java.util.Iterator r11 = r11.iterator()
        L_0x0029:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r11.next()
            q.d r0 = (q.d) r0
            boolean r1 = r0 instanceof q.f
            if (r1 == 0) goto L_0x0029
            r1 = r0
            q.f r1 = (q.f) r1
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x0029
        L_0x0046:
            q.f r11 = r9.f6186i
            java.util.List r11 = r11.f6135k
            java.util.Iterator r11 = r11.iterator()
        L_0x004e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r11.next()
            q.d r0 = (q.d) r0
            boolean r1 = r0 instanceof q.f
            if (r1 == 0) goto L_0x004e
            r1 = r0
            q.f r1 = (q.f) r1
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x004e
        L_0x006b:
            r11 = 1
            if (r10 != r11) goto L_0x009a
            boolean r0 = r9 instanceof q.n
            if (r0 == 0) goto L_0x009a
            r0 = r9
            q.n r0 = (q.n) r0
            q.f r0 = r0.f6160k
            java.util.List r0 = r0.f6135k
            java.util.Iterator r7 = r0.iterator()
        L_0x007d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r7.next()
            q.d r0 = (q.d) r0
            boolean r1 = r0 instanceof q.f
            if (r1 == 0) goto L_0x007d
            r1 = r0
            q.f r1 = (q.f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x007d
        L_0x009a:
            q.f r0 = r9.f6185h
            java.util.List r0 = r0.f6136l
            java.util.Iterator r7 = r0.iterator()
        L_0x00a2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r7.next()
            r1 = r0
            q.f r1 = (q.f) r1
            if (r1 != r12) goto L_0x00b3
            r14.f6154b = r11
        L_0x00b3:
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00a2
        L_0x00bd:
            q.f r0 = r9.f6186i
            java.util.List r0 = r0.f6136l
            java.util.Iterator r7 = r0.iterator()
        L_0x00c5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r7.next()
            r1 = r0
            q.f r1 = (q.f) r1
            if (r1 != r12) goto L_0x00d6
            r14.f6154b = r11
        L_0x00d6:
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00c5
        L_0x00e0:
            if (r10 != r11) goto L_0x0109
            boolean r11 = r9 instanceof q.n
            if (r11 == 0) goto L_0x0109
            q.n r9 = (q.n) r9
            q.f r9 = r9.f6160k
            java.util.List r9 = r9.f6136l
            java.util.Iterator r9 = r9.iterator()
        L_0x00f0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0109
            java.lang.Object r11 = r9.next()
            r1 = r11
            q.f r1 = (q.f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0107 }
            goto L_0x00f0
        L_0x0107:
            r9 = move-exception
            throw r9
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.a(q.f, int, int, q.f, java.util.ArrayList, q.m):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01e9, code lost:
        r4 = r0.f6008Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        if (r2.f6055x == 0) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(p.f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList r1 = r0.L0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x025f
            java.lang.Object r2 = r1.next()
            p.e r2 = (p.e) r2
            p.e$b[] r4 = r2.f6008Z
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.V()
            r7 = 8
            if (r6 != r7) goto L_0x0027
        L_0x0024:
            r2.f6009a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.f5982B
            r11 = 1065353216(0x3f800000, float:1.0)
            r7 = 2
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0036
            p.e$b r6 = p.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f6053w = r7
        L_0x0036:
            float r6 = r2.f5987E
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            p.e$b r6 = p.e.b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f6055x = r7
        L_0x0042:
            float r6 = r2.v()
            r8 = 0
            r9 = 3
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0077
            p.e$b r6 = p.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            p.e$b r8 = p.e.b.WRAP_CONTENT
            if (r4 == r8) goto L_0x0058
            p.e$b r8 = p.e.b.FIXED
            if (r4 != r8) goto L_0x005b
        L_0x0058:
            r2.f6053w = r9
            goto L_0x0077
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            p.e$b r8 = p.e.b.WRAP_CONTENT
            if (r5 == r8) goto L_0x0065
            p.e$b r8 = p.e.b.FIXED
            if (r5 != r8) goto L_0x0068
        L_0x0065:
            r2.f6055x = r9
            goto L_0x0077
        L_0x0068:
            if (r5 != r6) goto L_0x0077
            if (r4 != r6) goto L_0x0077
            int r6 = r2.f6053w
            if (r6 != 0) goto L_0x0072
            r2.f6053w = r9
        L_0x0072:
            int r6 = r2.f6055x
            if (r6 != 0) goto L_0x0077
            goto L_0x0065
        L_0x0077:
            p.e$b r6 = p.e.b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008d
            int r8 = r2.f6053w
            if (r8 != r10) goto L_0x008d
            p.d r8 = r2.f5997O
            p.d r8 = r8.f5965f
            if (r8 == 0) goto L_0x008b
            p.d r8 = r2.f5999Q
            p.d r8 = r8.f5965f
            if (r8 != 0) goto L_0x008d
        L_0x008b:
            p.e$b r5 = p.e.b.WRAP_CONTENT
        L_0x008d:
            r8 = r5
            if (r4 != r6) goto L_0x00a2
            int r5 = r2.f6055x
            if (r5 != r10) goto L_0x00a2
            p.d r5 = r2.f5998P
            p.d r5 = r5.f5965f
            if (r5 == 0) goto L_0x00a0
            p.d r5 = r2.f6000R
            p.d r5 = r5.f5965f
            if (r5 != 0) goto L_0x00a2
        L_0x00a0:
            p.e$b r4 = p.e.b.WRAP_CONTENT
        L_0x00a2:
            r12 = r4
            q.l r4 = r2.f6017e
            r4.f6181d = r8
            int r5 = r2.f6053w
            r4.f6178a = r5
            q.n r4 = r2.f6019f
            r4.f6181d = r12
            int r13 = r2.f6055x
            r4.f6178a = r13
            p.e$b r4 = p.e.b.MATCH_PARENT
            if (r8 == r4) goto L_0x00bf
            p.e$b r14 = p.e.b.FIXED
            if (r8 == r14) goto L_0x00bf
            p.e$b r14 = p.e.b.WRAP_CONTENT
            if (r8 != r14) goto L_0x00cb
        L_0x00bf:
            if (r12 == r4) goto L_0x0224
            p.e$b r14 = p.e.b.FIXED
            if (r12 == r14) goto L_0x0224
            p.e$b r14 = p.e.b.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cb
            goto L_0x0224
        L_0x00cb:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r8 != r6) goto L_0x015b
            p.e$b r15 = p.e.b.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d7
            p.e$b r11 = p.e.b.FIXED
            if (r12 != r11) goto L_0x015b
        L_0x00d7:
            if (r5 != r9) goto L_0x0111
            if (r12 != r15) goto L_0x00e5
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.l(r5, r6, r7, r8, r9)
        L_0x00e5:
            int r9 = r2.x()
            float r3 = (float) r9
            float r4 = r2.f6016d0
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
        L_0x00f0:
            p.e$b r8 = p.e.b.FIXED
        L_0x00f2:
            r4 = r16
            r5 = r2
            r6 = r8
        L_0x00f6:
            r4.l(r5, r6, r7, r8, r9)
            q.l r3 = r2.f6017e
            q.g r3 = r3.f6182e
            int r4 = r2.W()
            r3.d(r4)
            q.n r3 = r2.f6019f
            q.g r3 = r3.f6182e
            int r4 = r2.x()
            r3.d(r4)
            goto L_0x0024
        L_0x0111:
            if (r5 != r10) goto L_0x0129
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.l(r5, r6, r7, r8, r9)
            q.l r3 = r2.f6017e
            q.g r3 = r3.f6182e
            int r2 = r2.W()
        L_0x0125:
            r3.f6146m = r2
            goto L_0x0008
        L_0x0129:
            if (r5 != r7) goto L_0x014a
            p.e$b[] r11 = r0.f6008Z
            r11 = r11[r3]
            p.e$b r15 = p.e.b.FIXED
            if (r11 == r15) goto L_0x0135
            if (r11 != r4) goto L_0x015b
        L_0x0135:
            float r3 = r2.f5982B
            int r4 = r17.W()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            int r9 = r2.x()
        L_0x0144:
            r4 = r16
            r5 = r2
            r6 = r15
        L_0x0148:
            r8 = r12
            goto L_0x00f6
        L_0x014a:
            p.d[] r11 = r2.f6005W
            r7 = r11[r3]
            p.d r7 = r7.f5965f
            if (r7 == 0) goto L_0x0158
            r7 = r11[r10]
            p.d r7 = r7.f5965f
            if (r7 != 0) goto L_0x015b
        L_0x0158:
            r7 = 0
            r9 = 0
            goto L_0x0144
        L_0x015b:
            if (r12 != r6) goto L_0x01db
            p.e$b r11 = p.e.b.WRAP_CONTENT
            if (r8 == r11) goto L_0x0165
            p.e$b r7 = p.e.b.FIXED
            if (r8 != r7) goto L_0x01db
        L_0x0165:
            if (r13 != r9) goto L_0x018b
            if (r8 != r11) goto L_0x0173
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.l(r5, r6, r7, r8, r9)
        L_0x0173:
            int r7 = r2.W()
            float r3 = r2.f6016d0
            int r4 = r2.w()
            r5 = -1
            if (r4 != r5) goto L_0x0184
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x0184:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00f0
        L_0x018b:
            if (r13 != r10) goto L_0x01a0
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r11
            r4.l(r5, r6, r7, r8, r9)
        L_0x0197:
            q.n r3 = r2.f6019f
            q.g r3 = r3.f6182e
            int r2 = r2.x()
            goto L_0x0125
        L_0x01a0:
            r7 = 2
            if (r13 != r7) goto L_0x01c4
            p.e$b[] r7 = r0.f6008Z
            r7 = r7[r10]
            p.e$b r9 = p.e.b.FIXED
            if (r7 == r9) goto L_0x01ad
            if (r7 != r4) goto L_0x01db
        L_0x01ad:
            float r3 = r2.f5987E
            int r7 = r2.W()
            int r4 = r17.x()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r8
            r8 = r9
            r9 = r3
            goto L_0x00f6
        L_0x01c4:
            p.d[] r4 = r2.f6005W
            r7 = 2
            r15 = r4[r7]
            p.d r7 = r15.f5965f
            if (r7 == 0) goto L_0x01d3
            r4 = r4[r9]
            p.d r4 = r4.f5965f
            if (r4 != 0) goto L_0x01db
        L_0x01d3:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            goto L_0x0148
        L_0x01db:
            if (r8 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x020d
            if (r13 != r10) goto L_0x01e4
            goto L_0x020d
        L_0x01e4:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            p.e$b[] r4 = r0.f6008Z
            r3 = r4[r3]
            p.e$b r8 = p.e.b.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.f5982B
            float r4 = r2.f5987E
            int r5 = r17.W()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.x()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            goto L_0x00f2
        L_0x020d:
            p.e$b r8 = p.e.b.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.l(r5, r6, r7, r8, r9)
            q.l r3 = r2.f6017e
            q.g r3 = r3.f6182e
            int r4 = r2.W()
            r3.f6146m = r4
            goto L_0x0197
        L_0x0224:
            int r3 = r2.W()
            if (r8 != r4) goto L_0x023d
            int r3 = r17.W()
            p.d r5 = r2.f5997O
            int r5 = r5.f5966g
            int r3 = r3 - r5
            p.d r5 = r2.f5999Q
            int r5 = r5.f5966g
            int r3 = r3 - r5
            p.e$b r5 = p.e.b.FIXED
            r7 = r3
            r6 = r5
            goto L_0x023f
        L_0x023d:
            r7 = r3
            r6 = r8
        L_0x023f:
            int r3 = r2.x()
            if (r12 != r4) goto L_0x0258
            int r3 = r17.x()
            p.d r4 = r2.f5998P
            int r4 = r4.f5966g
            int r3 = r3 - r4
            p.d r4 = r2.f6000R
            int r4 = r4.f5966g
            int r3 = r3 - r4
            p.e$b r4 = p.e.b.FIXED
            r9 = r3
            r8 = r4
            goto L_0x025a
        L_0x0258:
            r9 = r3
            r8 = r12
        L_0x025a:
            r4 = r16
            r5 = r2
            goto L_0x00f6
        L_0x025f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.b(p.f):boolean");
    }

    private int e(f fVar, int i2) {
        int size = this.f6124i.size();
        long j2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j2 = Math.max(j2, ((m) this.f6124i.get(i3)).b(fVar, i2));
        }
        return (int) j2;
    }

    private void i(p pVar, int i2, ArrayList arrayList) {
        for (d dVar : pVar.f6185h.f6135k) {
            if (dVar instanceof f) {
                a((f) dVar, i2, 0, pVar.f6186i, arrayList, (m) null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f6185h, i2, 0, pVar.f6186i, arrayList, (m) null);
            }
        }
        for (d dVar2 : pVar.f6186i.f6135k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, 1, pVar.f6185h, arrayList, (m) null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f6186i, i2, 1, pVar.f6185h, arrayList, (m) null);
            }
        }
        if (i2 == 1) {
            for (d dVar3 : ((n) pVar).f6160k.f6135k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, (f) null, arrayList, (m) null);
                }
            }
        }
    }

    private void l(p.e eVar, e.b bVar, int i2, e.b bVar2, int i3) {
        C0278b.a aVar = this.f6123h;
        aVar.f6104a = bVar;
        aVar.f6105b = bVar2;
        aVar.f6106c = i2;
        aVar.f6107d = i3;
        this.f6122g.b(eVar, aVar);
        eVar.k1(this.f6123h.f6108e);
        eVar.L0(this.f6123h.f6109f);
        eVar.K0(this.f6123h.f6111h);
        eVar.A0(this.f6123h.f6110g);
    }

    public void c() {
        d(this.f6120e);
        this.f6124i.clear();
        m.f6152h = 0;
        i(this.f6116a.f6017e, 0, this.f6124i);
        i(this.f6116a.f6019f, 1, this.f6124i);
        this.f6117b = false;
    }

    public void d(ArrayList arrayList) {
        Object kVar;
        arrayList.clear();
        this.f6119d.f6017e.f();
        this.f6119d.f6019f.f();
        arrayList.add(this.f6119d.f6017e);
        arrayList.add(this.f6119d.f6019f);
        Iterator it = this.f6119d.L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            p.e eVar = (p.e) it.next();
            if (eVar instanceof h) {
                kVar = new j(eVar);
            } else {
                if (eVar.i0()) {
                    if (eVar.f6013c == null) {
                        eVar.f6013c = new C0279c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f6013c);
                } else {
                    arrayList.add(eVar.f6017e);
                }
                if (eVar.k0()) {
                    if (eVar.f6015d == null) {
                        eVar.f6015d = new C0279c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f6015d);
                } else {
                    arrayList.add(eVar.f6019f);
                }
                if (eVar instanceof j) {
                    kVar = new k(eVar);
                }
            }
            arrayList.add(kVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f6179b != this.f6119d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (this.f6117b || this.f6118c) {
            Iterator it = this.f6116a.L0.iterator();
            while (it.hasNext()) {
                p.e eVar = (p.e) it.next();
                eVar.n();
                eVar.f6009a = false;
                eVar.f6017e.r();
                eVar.f6019f.q();
            }
            this.f6116a.n();
            f fVar = this.f6116a;
            fVar.f6009a = false;
            fVar.f6017e.r();
            this.f6116a.f6019f.q();
            this.f6118c = false;
        }
        if (b(this.f6119d)) {
            return false;
        }
        this.f6116a.m1(0);
        this.f6116a.n1(0);
        e.b u2 = this.f6116a.u(0);
        e.b u3 = this.f6116a.u(1);
        if (this.f6117b) {
            c();
        }
        int X2 = this.f6116a.X();
        int Y2 = this.f6116a.Y();
        this.f6116a.f6017e.f6185h.d(X2);
        this.f6116a.f6019f.f6185h.d(Y2);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (u2 == bVar || u3 == bVar) {
            if (z2) {
                Iterator it2 = this.f6120e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((p) it2.next()).m()) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z2 && u2 == e.b.WRAP_CONTENT) {
                this.f6116a.P0(e.b.FIXED);
                f fVar2 = this.f6116a;
                fVar2.k1(e(fVar2, 0));
                f fVar3 = this.f6116a;
                fVar3.f6017e.f6182e.d(fVar3.W());
            }
            if (z2 && u3 == e.b.WRAP_CONTENT) {
                this.f6116a.g1(e.b.FIXED);
                f fVar4 = this.f6116a;
                fVar4.L0(e(fVar4, 1));
                f fVar5 = this.f6116a;
                fVar5.f6019f.f6182e.d(fVar5.x());
            }
        }
        f fVar6 = this.f6116a;
        e.b bVar2 = fVar6.f6008Z[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int W2 = fVar6.W() + X2;
            this.f6116a.f6017e.f6186i.d(W2);
            this.f6116a.f6017e.f6182e.d(W2 - X2);
            m();
            f fVar7 = this.f6116a;
            e.b bVar4 = fVar7.f6008Z[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int x2 = fVar7.x() + Y2;
                this.f6116a.f6019f.f6186i.d(x2);
                this.f6116a.f6019f.f6182e.d(x2 - Y2);
            }
            m();
            z3 = true;
        } else {
            z3 = false;
        }
        Iterator it3 = this.f6120e.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f6179b != this.f6116a || pVar.f6184g) {
                pVar.e();
            }
        }
        Iterator it4 = this.f6120e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z4 = true;
                break;
            }
            p pVar2 = (p) it4.next();
            if ((z3 || pVar2.f6179b != this.f6116a) && (!pVar2.f6185h.f6134j || ((!pVar2.f6186i.f6134j && !(pVar2 instanceof j)) || (!pVar2.f6182e.f6134j && !(pVar2 instanceof C0279c) && !(pVar2 instanceof j))))) {
                break;
            }
        }
        this.f6116a.P0(u2);
        this.f6116a.g1(u3);
        return z4;
    }

    public boolean g(boolean z2) {
        if (this.f6117b) {
            Iterator it = this.f6116a.L0.iterator();
            while (it.hasNext()) {
                p.e eVar = (p.e) it.next();
                eVar.n();
                eVar.f6009a = false;
                l lVar = eVar.f6017e;
                lVar.f6182e.f6134j = false;
                lVar.f6184g = false;
                lVar.r();
                n nVar = eVar.f6019f;
                nVar.f6182e.f6134j = false;
                nVar.f6184g = false;
                nVar.q();
            }
            this.f6116a.n();
            f fVar = this.f6116a;
            fVar.f6009a = false;
            l lVar2 = fVar.f6017e;
            lVar2.f6182e.f6134j = false;
            lVar2.f6184g = false;
            lVar2.r();
            n nVar2 = this.f6116a.f6019f;
            nVar2.f6182e.f6134j = false;
            nVar2.f6184g = false;
            nVar2.q();
            c();
        }
        if (b(this.f6119d)) {
            return false;
        }
        this.f6116a.m1(0);
        this.f6116a.n1(0);
        this.f6116a.f6017e.f6185h.d(0);
        this.f6116a.f6019f.f6185h.d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(boolean r10, int r11) {
        /*
            r9 = this;
            p.f r0 = r9.f6116a
            r1 = 0
            p.e$b r0 = r0.u(r1)
            p.f r2 = r9.f6116a
            r3 = 1
            p.e$b r2 = r2.u(r3)
            p.f r4 = r9.f6116a
            int r4 = r4.X()
            p.f r5 = r9.f6116a
            int r5 = r5.Y()
            if (r10 == 0) goto L_0x0086
            p.e$b r6 = p.e.b.WRAP_CONTENT
            if (r0 == r6) goto L_0x0022
            if (r2 != r6) goto L_0x0086
        L_0x0022:
            java.util.ArrayList r6 = r9.f6120e
            java.util.Iterator r6 = r6.iterator()
        L_0x0028:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x003f
            java.lang.Object r7 = r6.next()
            q.p r7 = (q.p) r7
            int r8 = r7.f6183f
            if (r8 != r11) goto L_0x0028
            boolean r7 = r7.m()
            if (r7 != 0) goto L_0x0028
            r10 = 0
        L_0x003f:
            if (r11 != 0) goto L_0x0065
            if (r10 == 0) goto L_0x0086
            p.e$b r10 = p.e.b.WRAP_CONTENT
            if (r0 != r10) goto L_0x0086
            p.f r10 = r9.f6116a
            p.e$b r6 = p.e.b.FIXED
            r10.P0(r6)
            p.f r10 = r9.f6116a
            int r6 = r9.e(r10, r1)
            r10.k1(r6)
            p.f r10 = r9.f6116a
            q.l r6 = r10.f6017e
            q.g r6 = r6.f6182e
            int r10 = r10.W()
        L_0x0061:
            r6.d(r10)
            goto L_0x0086
        L_0x0065:
            if (r10 == 0) goto L_0x0086
            p.e$b r10 = p.e.b.WRAP_CONTENT
            if (r2 != r10) goto L_0x0086
            p.f r10 = r9.f6116a
            p.e$b r6 = p.e.b.FIXED
            r10.g1(r6)
            p.f r10 = r9.f6116a
            int r6 = r9.e(r10, r3)
            r10.L0(r6)
            p.f r10 = r9.f6116a
            q.n r6 = r10.f6019f
            q.g r6 = r6.f6182e
            int r10 = r10.x()
            goto L_0x0061
        L_0x0086:
            p.f r10 = r9.f6116a
            if (r11 != 0) goto L_0x00b0
            p.e$b[] r5 = r10.f6008Z
            r5 = r5[r1]
            p.e$b r6 = p.e.b.FIXED
            if (r5 == r6) goto L_0x0096
            p.e$b r6 = p.e.b.MATCH_PARENT
            if (r5 != r6) goto L_0x00bd
        L_0x0096:
            int r10 = r10.W()
            int r10 = r10 + r4
            p.f r5 = r9.f6116a
            q.l r5 = r5.f6017e
            q.f r5 = r5.f6186i
            r5.d(r10)
            p.f r5 = r9.f6116a
            q.l r5 = r5.f6017e
            q.g r5 = r5.f6182e
            int r10 = r10 - r4
            r5.d(r10)
        L_0x00ae:
            r10 = 1
            goto L_0x00d8
        L_0x00b0:
            p.e$b[] r4 = r10.f6008Z
            r4 = r4[r3]
            p.e$b r6 = p.e.b.FIXED
            if (r4 == r6) goto L_0x00bf
            p.e$b r6 = p.e.b.MATCH_PARENT
            if (r4 != r6) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r10 = 0
            goto L_0x00d8
        L_0x00bf:
            int r10 = r10.x()
            int r10 = r10 + r5
            p.f r4 = r9.f6116a
            q.n r4 = r4.f6019f
            q.f r4 = r4.f6186i
            r4.d(r10)
            p.f r4 = r9.f6116a
            q.n r4 = r4.f6019f
            q.g r4 = r4.f6182e
            int r10 = r10 - r5
            r4.d(r10)
            goto L_0x00ae
        L_0x00d8:
            r9.m()
            java.util.ArrayList r4 = r9.f6120e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0101
            java.lang.Object r5 = r4.next()
            q.p r5 = (q.p) r5
            int r6 = r5.f6183f
            if (r6 == r11) goto L_0x00f2
            goto L_0x00e1
        L_0x00f2:
            p.e r6 = r5.f6179b
            p.f r7 = r9.f6116a
            if (r6 != r7) goto L_0x00fd
            boolean r6 = r5.f6184g
            if (r6 != 0) goto L_0x00fd
            goto L_0x00e1
        L_0x00fd:
            r5.e()
            goto L_0x00e1
        L_0x0101:
            java.util.ArrayList r4 = r9.f6120e
            java.util.Iterator r4 = r4.iterator()
        L_0x0107:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013a
            java.lang.Object r5 = r4.next()
            q.p r5 = (q.p) r5
            int r6 = r5.f6183f
            if (r6 == r11) goto L_0x0118
            goto L_0x0107
        L_0x0118:
            if (r10 != 0) goto L_0x0121
            p.e r6 = r5.f6179b
            p.f r7 = r9.f6116a
            if (r6 != r7) goto L_0x0121
            goto L_0x0107
        L_0x0121:
            q.f r6 = r5.f6185h
            boolean r6 = r6.f6134j
            if (r6 != 0) goto L_0x0128
            goto L_0x013b
        L_0x0128:
            q.f r6 = r5.f6186i
            boolean r6 = r6.f6134j
            if (r6 != 0) goto L_0x012f
            goto L_0x013b
        L_0x012f:
            boolean r6 = r5 instanceof q.C0279c
            if (r6 != 0) goto L_0x0107
            q.g r5 = r5.f6182e
            boolean r5 = r5.f6134j
            if (r5 != 0) goto L_0x0107
            goto L_0x013b
        L_0x013a:
            r1 = 1
        L_0x013b:
            p.f r10 = r9.f6116a
            r10.P0(r0)
            p.f r10 = r9.f6116a
            r10.g1(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.e.h(boolean, int):boolean");
    }

    public void j() {
        this.f6117b = true;
    }

    public void k() {
        this.f6118c = true;
    }

    public void m() {
        boolean z2;
        g gVar;
        g gVar2;
        int W2;
        g gVar3;
        int W3;
        Iterator it = this.f6116a.L0.iterator();
        while (it.hasNext()) {
            p.e eVar = (p.e) it.next();
            if (!eVar.f6009a) {
                e.b[] bVarArr = eVar.f6008Z;
                boolean z3 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i2 = eVar.f6053w;
                int i3 = eVar.f6055x;
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i3 == 1)) {
                    z3 = true;
                }
                g gVar4 = eVar.f6017e.f6182e;
                boolean z4 = gVar4.f6134j;
                g gVar5 = eVar.f6019f.f6182e;
                boolean z5 = gVar5.f6134j;
                if (!z4 || !z5) {
                    if (!z4 || !z3) {
                        if (z5 && z2) {
                            int i4 = gVar4.f6131g;
                            l(eVar, bVar3, i4, e.b.FIXED, gVar5.f6131g);
                            if (bVar == e.b.MATCH_CONSTRAINT) {
                                gVar3 = eVar.f6017e.f6182e;
                                W3 = eVar.W();
                            } else {
                                gVar2 = eVar.f6017e.f6182e;
                                W2 = eVar.W();
                                gVar2.d(W2);
                            }
                        }
                        if (eVar.f6009a && (gVar = eVar.f6019f.f6161l) != null) {
                            gVar.d(eVar.p());
                        }
                    } else {
                        e.b bVar4 = e.b.FIXED;
                        int i5 = gVar4.f6131g;
                        l(eVar, bVar4, i5, bVar3, gVar5.f6131g);
                        if (bVar2 == e.b.MATCH_CONSTRAINT) {
                            gVar3 = eVar.f6019f.f6182e;
                            W3 = eVar.x();
                        } else {
                            gVar2 = eVar.f6019f.f6182e;
                            W2 = eVar.x();
                            gVar2.d(W2);
                        }
                    }
                    gVar3.f6146m = W3;
                    gVar.d(eVar.p());
                } else {
                    e.b bVar5 = e.b.FIXED;
                    l(eVar, bVar5, gVar4.f6131g, bVar5, gVar5.f6131g);
                }
                eVar.f6009a = true;
                gVar.d(eVar.p());
            }
        }
    }

    public void n(C0278b.C0079b bVar) {
        this.f6122g = bVar;
    }
}
