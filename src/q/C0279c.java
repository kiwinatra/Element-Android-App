package q;

import java.util.ArrayList;
import java.util.Iterator;
import p.e;
import p.f;

/* renamed from: q.c  reason: case insensitive filesystem */
public class C0279c extends p {

    /* renamed from: k  reason: collision with root package name */
    ArrayList f6114k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private int f6115l;

    public C0279c(e eVar, int i2) {
        super(eVar);
        this.f6183f = i2;
        q();
    }

    private void q() {
        e eVar;
        int i2;
        e eVar2 = this.f6179b;
        do {
            eVar = eVar2;
            eVar2 = eVar2.L(this.f6183f);
        } while (eVar2 != null);
        this.f6179b = eVar;
        this.f6114k.add(eVar.N(this.f6183f));
        e J2 = eVar.J(this.f6183f);
        while (J2 != null) {
            this.f6114k.add(J2.N(this.f6183f));
            J2 = J2.J(this.f6183f);
        }
        Iterator it = this.f6114k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            int i3 = this.f6183f;
            if (i3 == 0) {
                pVar.f6179b.f6013c = this;
            } else if (i3 == 1) {
                pVar.f6179b.f6015d = this;
            }
        }
        if (this.f6183f == 0 && ((f) this.f6179b.K()).P1() && this.f6114k.size() > 1) {
            ArrayList arrayList = this.f6114k;
            this.f6179b = ((p) arrayList.get(arrayList.size() - 1)).f6179b;
        }
        if (this.f6183f == 0) {
            i2 = this.f6179b.z();
        } else {
            i2 = this.f6179b.S();
        }
        this.f6115l = i2;
    }

    private e r() {
        for (int i2 = 0; i2 < this.f6114k.size(); i2++) {
            p pVar = (p) this.f6114k.get(i2);
            if (pVar.f6179b.V() != 8) {
                return pVar.f6179b;
            }
        }
        return null;
    }

    private e s() {
        for (int size = this.f6114k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f6114k.get(size);
            if (pVar.f6179b.V() != 8) {
                return pVar.f6179b;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(q.d r27) {
        /*
            r26 = this;
            r0 = r26
            q.f r1 = r0.f6185h
            boolean r1 = r1.f6134j
            if (r1 == 0) goto L_0x03f4
            q.f r1 = r0.f6186i
            boolean r1 = r1.f6134j
            if (r1 != 0) goto L_0x0010
            goto L_0x03f4
        L_0x0010:
            p.e r1 = r0.f6179b
            p.e r1 = r1.K()
            boolean r2 = r1 instanceof p.f
            if (r2 == 0) goto L_0x0021
            p.f r1 = (p.f) r1
            boolean r1 = r1.P1()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            q.f r2 = r0.f6186i
            int r2 = r2.f6131g
            q.f r4 = r0.f6185h
            int r4 = r4.f6131g
            int r2 = r2 - r4
            java.util.ArrayList r4 = r0.f6114k
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList r8 = r0.f6114k
            java.lang.Object r8 = r8.get(r5)
            q.p r8 = (q.p) r8
            p.e r8 = r8.f6179b
            int r8 = r8.V()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = -1
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList r10 = r0.f6114k
            java.lang.Object r10 = r10.get(r9)
            q.p r10 = (q.p) r10
            p.e r10 = r10.f6179b
            int r10 = r10.V()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList r3 = r0.f6114k
            java.lang.Object r3 = r3.get(r13)
            q.p r3 = (q.p) r3
            p.e r11 = r3.f6179b
            int r11 = r11.V()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            q.f r11 = r3.f6185h
            int r11 = r11.f6130f
            int r14 = r14 + r11
        L_0x008e:
            q.g r11 = r3.f6182e
            int r7 = r11.f6131g
            p.e$b r10 = r3.f6181d
            p.e$b r12 = p.e.b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.f6183f
            if (r11 != 0) goto L_0x00ac
            p.e r12 = r3.f6179b
            q.l r12 = r12.f6017e
            q.g r12 = r12.f6182e
            boolean r12 = r12.f6134j
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            p.e r11 = r3.f6179b
            q.n r11 = r11.f6019f
            q.g r11 = r11.f6182e
            boolean r11 = r11.f6134j
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.f6178a
            if (r7 != r12) goto L_0x00cc
            if (r9 != 0) goto L_0x00cc
            int r7 = r11.f6146m
            int r15 = r15 + 1
        L_0x00ca:
            r10 = 1
            goto L_0x00d5
        L_0x00cc:
            boolean r7 = r11.f6134j
            if (r7 == 0) goto L_0x00d3
            r7 = r19
            goto L_0x00ca
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            p.e r7 = r3.f6179b
            float[] r7 = r7.D0
            int r10 = r0.f6183f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            q.f r3 = r3.f6186i
            int r3 = r3.f6130f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            q.f r7 = r0.f6185h
            int r7 = r7.f6131g
            if (r1 == 0) goto L_0x0118
            q.f r7 = r0.f6186i
            int r7 = r7.f6131g
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x0129
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            if (r1 == 0) goto L_0x0128
            int r7 = r7 + r10
            goto L_0x0129
        L_0x0128:
            int r7 = r7 - r10
        L_0x0129:
            if (r15 <= 0) goto L_0x021e
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x0135:
            if (r12 >= r4) goto L_0x01d2
            java.util.ArrayList r9 = r0.f6114k
            java.lang.Object r9 = r9.get(r12)
            q.p r9 = (q.p) r9
            r19 = r11
            p.e r11 = r9.f6179b
            int r11 = r11.V()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0157
        L_0x014d:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
            goto L_0x01c0
        L_0x0157:
            p.e$b r11 = r9.f6181d
            p.e$b r14 = p.e.b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x014d
            q.g r11 = r9.f6182e
            boolean r14 = r11.f6134j
            if (r14 != 0) goto L_0x014d
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x017b
            p.e r14 = r9.f6179b
            float[] r14 = r14.D0
            r21 = r7
            int r7 = r0.f6183f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x017f
        L_0x017b:
            r21 = r7
            r7 = r19
        L_0x017f:
            int r14 = r0.f6183f
            if (r14 != 0) goto L_0x018e
            p.e r14 = r9.f6179b
            r22 = r10
            int r10 = r14.f5980A
            int r14 = r14.f6059z
            r23 = r1
            goto L_0x019d
        L_0x018e:
            r22 = r10
            p.e r10 = r9.f6179b
            int r14 = r10.f5986D
            int r10 = r10.f5984C
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x019d:
            int r1 = r9.f6178a
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01ab
            int r1 = r11.f6146m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01ac
        L_0x01ab:
            r1 = r7
        L_0x01ac:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01b6
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01b6:
            if (r1 == r7) goto L_0x01bb
            int r13 = r13 + 1
            r7 = r1
        L_0x01bb:
            q.g r1 = r9.f6182e
            r1.d(r7)
        L_0x01c0:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0135
        L_0x01d2:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x020f
            int r15 = r15 - r13
            r1 = 0
            r14 = 0
        L_0x01df:
            if (r1 >= r4) goto L_0x0211
            java.util.ArrayList r3 = r0.f6114k
            java.lang.Object r3 = r3.get(r1)
            q.p r3 = (q.p) r3
            p.e r7 = r3.f6179b
            int r7 = r7.V()
            r9 = 8
            if (r7 != r9) goto L_0x01f4
            goto L_0x020c
        L_0x01f4:
            if (r1 <= 0) goto L_0x01fd
            if (r1 < r5) goto L_0x01fd
            q.f r7 = r3.f6185h
            int r7 = r7.f6130f
            int r14 = r14 + r7
        L_0x01fd:
            q.g r7 = r3.f6182e
            int r7 = r7.f6131g
            int r14 = r14 + r7
            if (r1 >= r8) goto L_0x020c
            if (r1 >= r6) goto L_0x020c
            q.f r3 = r3.f6186i
            int r3 = r3.f6130f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x020c:
            int r1 = r1 + 1
            goto L_0x01df
        L_0x020f:
            r14 = r20
        L_0x0211:
            int r1 = r0.f6115l
            r3 = 2
            if (r1 != r3) goto L_0x021c
            if (r13 != 0) goto L_0x021c
            r1 = 0
            r0.f6115l = r1
            goto L_0x0228
        L_0x021c:
            r1 = 0
            goto L_0x0228
        L_0x021e:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x0228:
            if (r14 <= r2) goto L_0x022c
            r0.f6115l = r3
        L_0x022c:
            if (r24 <= 0) goto L_0x0234
            if (r15 != 0) goto L_0x0234
            if (r5 != r6) goto L_0x0234
            r0.f6115l = r3
        L_0x0234:
            int r3 = r0.f6115l
            r7 = 1
            r9 = r24
            if (r3 != r7) goto L_0x02ca
            if (r9 <= r7) goto L_0x0242
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x0249
        L_0x0242:
            if (r9 != r7) goto L_0x0248
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x0249
        L_0x0248:
            r2 = 0
        L_0x0249:
            if (r15 <= 0) goto L_0x024c
            r2 = 0
        L_0x024c:
            r7 = r21
            r3 = 0
        L_0x024f:
            if (r3 >= r4) goto L_0x03f4
            if (r23 == 0) goto L_0x0258
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x0259
        L_0x0258:
            r1 = r3
        L_0x0259:
            java.util.ArrayList r9 = r0.f6114k
            java.lang.Object r1 = r9.get(r1)
            q.p r1 = (q.p) r1
            p.e r9 = r1.f6179b
            int r9 = r9.V()
            r10 = 8
            if (r9 != r10) goto L_0x0276
            q.f r9 = r1.f6185h
            r9.d(r7)
            q.f r1 = r1.f6186i
            r1.d(r7)
            goto L_0x02c7
        L_0x0276:
            if (r3 <= 0) goto L_0x027d
            if (r23 == 0) goto L_0x027c
            int r7 = r7 - r2
            goto L_0x027d
        L_0x027c:
            int r7 = r7 + r2
        L_0x027d:
            if (r3 <= 0) goto L_0x028a
            if (r3 < r5) goto L_0x028a
            q.f r9 = r1.f6185h
            int r9 = r9.f6130f
            if (r23 == 0) goto L_0x0289
            int r7 = r7 - r9
            goto L_0x028a
        L_0x0289:
            int r7 = r7 + r9
        L_0x028a:
            if (r23 == 0) goto L_0x0292
            q.f r9 = r1.f6186i
        L_0x028e:
            r9.d(r7)
            goto L_0x0295
        L_0x0292:
            q.f r9 = r1.f6185h
            goto L_0x028e
        L_0x0295:
            q.g r9 = r1.f6182e
            int r10 = r9.f6131g
            p.e$b r11 = r1.f6181d
            p.e$b r12 = p.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02a6
            int r11 = r1.f6178a
            r12 = 1
            if (r11 != r12) goto L_0x02a6
            int r10 = r9.f6146m
        L_0x02a6:
            if (r23 == 0) goto L_0x02aa
            int r7 = r7 - r10
            goto L_0x02ab
        L_0x02aa:
            int r7 = r7 + r10
        L_0x02ab:
            if (r23 == 0) goto L_0x02b4
            q.f r9 = r1.f6185h
        L_0x02af:
            r9.d(r7)
            r9 = 1
            goto L_0x02b7
        L_0x02b4:
            q.f r9 = r1.f6186i
            goto L_0x02af
        L_0x02b7:
            r1.f6184g = r9
            if (r3 >= r8) goto L_0x02c7
            if (r3 >= r6) goto L_0x02c7
            q.f r1 = r1.f6186i
            int r1 = r1.f6130f
            int r1 = -r1
            if (r23 == 0) goto L_0x02c6
            int r7 = r7 - r1
            goto L_0x02c7
        L_0x02c6:
            int r7 = r7 + r1
        L_0x02c7:
            int r3 = r3 + 1
            goto L_0x024f
        L_0x02ca:
            if (r3 != 0) goto L_0x0351
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02d4
            r2 = 0
        L_0x02d4:
            r7 = r21
            r3 = 0
        L_0x02d7:
            if (r3 >= r4) goto L_0x03f4
            if (r23 == 0) goto L_0x02e0
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02e1
        L_0x02e0:
            r1 = r3
        L_0x02e1:
            java.util.ArrayList r9 = r0.f6114k
            java.lang.Object r1 = r9.get(r1)
            q.p r1 = (q.p) r1
            p.e r9 = r1.f6179b
            int r9 = r9.V()
            r10 = 8
            if (r9 != r10) goto L_0x02fe
            q.f r9 = r1.f6185h
            r9.d(r7)
            q.f r1 = r1.f6186i
            r1.d(r7)
            goto L_0x034e
        L_0x02fe:
            if (r23 == 0) goto L_0x0302
            int r7 = r7 - r2
            goto L_0x0303
        L_0x0302:
            int r7 = r7 + r2
        L_0x0303:
            if (r3 <= 0) goto L_0x0310
            if (r3 < r5) goto L_0x0310
            q.f r9 = r1.f6185h
            int r9 = r9.f6130f
            if (r23 == 0) goto L_0x030f
            int r7 = r7 - r9
            goto L_0x0310
        L_0x030f:
            int r7 = r7 + r9
        L_0x0310:
            if (r23 == 0) goto L_0x0318
            q.f r9 = r1.f6186i
        L_0x0314:
            r9.d(r7)
            goto L_0x031b
        L_0x0318:
            q.f r9 = r1.f6185h
            goto L_0x0314
        L_0x031b:
            q.g r9 = r1.f6182e
            int r10 = r9.f6131g
            p.e$b r11 = r1.f6181d
            p.e$b r12 = p.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0330
            int r11 = r1.f6178a
            r12 = 1
            if (r11 != r12) goto L_0x0330
            int r9 = r9.f6146m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x0330:
            if (r23 == 0) goto L_0x0334
            int r7 = r7 - r10
            goto L_0x0335
        L_0x0334:
            int r7 = r7 + r10
        L_0x0335:
            if (r23 == 0) goto L_0x033d
            q.f r9 = r1.f6185h
        L_0x0339:
            r9.d(r7)
            goto L_0x0340
        L_0x033d:
            q.f r9 = r1.f6186i
            goto L_0x0339
        L_0x0340:
            if (r3 >= r8) goto L_0x034e
            if (r3 >= r6) goto L_0x034e
            q.f r1 = r1.f6186i
            int r1 = r1.f6130f
            int r1 = -r1
            if (r23 == 0) goto L_0x034d
            int r7 = r7 - r1
            goto L_0x034e
        L_0x034d:
            int r7 = r7 + r1
        L_0x034e:
            int r3 = r3 + 1
            goto L_0x02d7
        L_0x0351:
            r7 = 2
            if (r3 != r7) goto L_0x03f4
            int r3 = r0.f6183f
            if (r3 != 0) goto L_0x035f
            p.e r3 = r0.f6179b
            float r3 = r3.y()
            goto L_0x0365
        L_0x035f:
            p.e r3 = r0.f6179b
            float r3 = r3.R()
        L_0x0365:
            if (r23 == 0) goto L_0x036b
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x036b:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0377
            if (r15 <= 0) goto L_0x0378
        L_0x0377:
            r2 = 0
        L_0x0378:
            if (r23 == 0) goto L_0x037d
            int r7 = r21 - r2
            goto L_0x037f
        L_0x037d:
            int r7 = r21 + r2
        L_0x037f:
            r3 = 0
        L_0x0380:
            if (r3 >= r4) goto L_0x03f4
            if (r23 == 0) goto L_0x0389
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x038a
        L_0x0389:
            r1 = r3
        L_0x038a:
            java.util.ArrayList r2 = r0.f6114k
            java.lang.Object r1 = r2.get(r1)
            q.p r1 = (q.p) r1
            p.e r2 = r1.f6179b
            int r2 = r2.V()
            r9 = 8
            if (r2 != r9) goto L_0x03a8
            q.f r2 = r1.f6185h
            r2.d(r7)
            q.f r1 = r1.f6186i
            r1.d(r7)
            r12 = 1
            goto L_0x03f1
        L_0x03a8:
            if (r3 <= 0) goto L_0x03b5
            if (r3 < r5) goto L_0x03b5
            q.f r2 = r1.f6185h
            int r2 = r2.f6130f
            if (r23 == 0) goto L_0x03b4
            int r7 = r7 - r2
            goto L_0x03b5
        L_0x03b4:
            int r7 = r7 + r2
        L_0x03b5:
            if (r23 == 0) goto L_0x03bd
            q.f r2 = r1.f6186i
        L_0x03b9:
            r2.d(r7)
            goto L_0x03c0
        L_0x03bd:
            q.f r2 = r1.f6185h
            goto L_0x03b9
        L_0x03c0:
            q.g r2 = r1.f6182e
            int r10 = r2.f6131g
            p.e$b r11 = r1.f6181d
            p.e$b r12 = p.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03d2
            int r11 = r1.f6178a
            r12 = 1
            if (r11 != r12) goto L_0x03d3
            int r10 = r2.f6146m
            goto L_0x03d3
        L_0x03d2:
            r12 = 1
        L_0x03d3:
            if (r23 == 0) goto L_0x03d7
            int r7 = r7 - r10
            goto L_0x03d8
        L_0x03d7:
            int r7 = r7 + r10
        L_0x03d8:
            if (r23 == 0) goto L_0x03e0
            q.f r2 = r1.f6185h
        L_0x03dc:
            r2.d(r7)
            goto L_0x03e3
        L_0x03e0:
            q.f r2 = r1.f6186i
            goto L_0x03dc
        L_0x03e3:
            if (r3 >= r8) goto L_0x03f1
            if (r3 >= r6) goto L_0x03f1
            q.f r1 = r1.f6186i
            int r1 = r1.f6130f
            int r1 = -r1
            if (r23 == 0) goto L_0x03f0
            int r7 = r7 - r1
            goto L_0x03f1
        L_0x03f0:
            int r7 = r7 + r1
        L_0x03f1:
            int r3 = r3 + 1
            goto L_0x0380
        L_0x03f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C0279c.a(q.d):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r1 != null) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f6114k
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            q.p r1 = (q.p) r1
            r1.d()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList r0 = r5.f6114k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList r2 = r5.f6114k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            q.p r2 = (q.p) r2
            p.e r2 = r2.f6179b
            java.util.ArrayList r4 = r5.f6114k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            q.p r0 = (q.p) r0
            p.e r0 = r0.f6179b
            int r4 = r5.f6183f
            if (r4 != 0) goto L_0x0070
            p.d r1 = r2.f5997O
            p.d r0 = r0.f5999Q
            q.f r2 = r5.i(r1, r3)
            int r1 = r1.f()
            p.e r4 = r5.r()
            if (r4 == 0) goto L_0x0052
            p.d r1 = r4.f5997O
            int r1 = r1.f()
        L_0x0052:
            if (r2 == 0) goto L_0x0059
            q.f r4 = r5.f6185h
            r5.b(r4, r2, r1)
        L_0x0059:
            q.f r1 = r5.i(r0, r3)
            int r0 = r0.f()
            p.e r2 = r5.s()
            if (r2 == 0) goto L_0x006d
            p.d r0 = r2.f5999Q
            int r0 = r0.f()
        L_0x006d:
            if (r1 == 0) goto L_0x00ab
            goto L_0x00a5
        L_0x0070:
            p.d r2 = r2.f5998P
            p.d r0 = r0.f6000R
            q.f r3 = r5.i(r2, r1)
            int r2 = r2.f()
            p.e r4 = r5.r()
            if (r4 == 0) goto L_0x0088
            p.d r2 = r4.f5998P
            int r2 = r2.f()
        L_0x0088:
            if (r3 == 0) goto L_0x008f
            q.f r4 = r5.f6185h
            r5.b(r4, r3, r2)
        L_0x008f:
            q.f r1 = r5.i(r0, r1)
            int r0 = r0.f()
            p.e r2 = r5.s()
            if (r2 == 0) goto L_0x00a3
            p.d r0 = r2.f6000R
            int r0 = r0.f()
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
        L_0x00a5:
            q.f r2 = r5.f6186i
            int r0 = -r0
            r5.b(r2, r1, r0)
        L_0x00ab:
            q.f r0 = r5.f6185h
            r0.f6125a = r5
            q.f r0 = r5.f6186i
            r0.f6125a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C0279c.d():void");
    }

    public void e() {
        for (int i2 = 0; i2 < this.f6114k.size(); i2++) {
            ((p) this.f6114k.get(i2)).e();
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f6180c = null;
        Iterator it = this.f6114k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    public long j() {
        int size = this.f6114k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            p pVar = (p) this.f6114k.get(i2);
            j2 = j2 + ((long) pVar.f6185h.f6130f) + pVar.j() + ((long) pVar.f6186i.f6130f);
        }
        return j2;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        int size = this.f6114k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((p) this.f6114k.get(i2)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f6183f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator it = this.f6114k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append((p) it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
