package q;

import java.util.ArrayList;
import p.d;
import p.e;
import p.h;
import p.j;

public abstract class i {
    public static o a(e eVar, int i2, ArrayList arrayList, o oVar) {
        int i3;
        d dVar;
        int s1;
        if (i2 == 0) {
            i3 = eVar.I0;
        } else {
            i3 = eVar.J0;
        }
        int i4 = 0;
        if (i3 != -1 && (oVar == null || i3 != oVar.f6165b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i5);
                if (oVar2.c() == i3) {
                    if (oVar != null) {
                        oVar.g(i2, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i5++;
                }
            }
        } else if (i3 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof j) && (s1 = ((j) eVar).s1(i2)) != -1) {
                int i6 = 0;
                while (true) {
                    if (i6 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = (o) arrayList.get(i6);
                    if (oVar3.c() == s1) {
                        oVar = oVar3;
                        break;
                    }
                    i6++;
                }
            }
            if (oVar == null) {
                oVar = new o(i2);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                d r1 = hVar.r1();
                if (hVar.s1() == 0) {
                    i4 = 1;
                }
                r1.c(i4, arrayList, oVar);
            }
            int c2 = oVar.c();
            if (i2 == 0) {
                eVar.I0 = c2;
                eVar.f5997O.c(i2, arrayList, oVar);
                dVar = eVar.f5999Q;
            } else {
                eVar.J0 = c2;
                eVar.f5998P.c(i2, arrayList, oVar);
                eVar.f6001S.c(i2, arrayList, oVar);
                dVar = eVar.f6000R;
            }
            dVar.c(i2, arrayList, oVar);
            eVar.f6004V.c(i2, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = (o) arrayList.get(i3);
            if (i2 == oVar.f6165b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:174:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x038f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(p.f r16, q.C0278b.C0079b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.r1()
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x000c:
            if (r4 >= r2) goto L_0x0033
            java.lang.Object r5 = r1.get(r4)
            p.e r5 = (p.e) r5
            p.e$b r6 = r16.A()
            p.e$b r7 = r16.T()
            p.e$b r8 = r5.A()
            p.e$b r9 = r5.T()
            boolean r6 = d(r6, r7, r8, r9)
            if (r6 != 0) goto L_0x002b
            return r3
        L_0x002b:
            boolean r5 = r5 instanceof p.g
            if (r5 == 0) goto L_0x0030
            return r3
        L_0x0030:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0033:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x003a:
            if (r5 >= r2) goto L_0x0110
            java.lang.Object r13 = r1.get(r5)
            p.e r13 = (p.e) r13
            p.e$b r14 = r16.A()
            p.e$b r15 = r16.T()
            p.e$b r4 = r13.A()
            p.e$b r12 = r13.T()
            boolean r4 = d(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x0062
            q.b$a r4 = r0.p1
            int r12 = q.C0278b.a.f6101k
            r14 = r17
            p.f.S1(r3, r13, r14, r4, r12)
            goto L_0x0064
        L_0x0062:
            r14 = r17
        L_0x0064:
            boolean r4 = r13 instanceof p.h
            if (r4 == 0) goto L_0x008c
            r12 = r13
            p.h r12 = (p.h) r12
            int r15 = r12.s1()
            if (r15 != 0) goto L_0x007b
            if (r8 != 0) goto L_0x0078
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0078:
            r8.add(r12)
        L_0x007b:
            int r15 = r12.s1()
            r3 = 1
            if (r15 != r3) goto L_0x008c
            if (r6 != 0) goto L_0x0089
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0089:
            r6.add(r12)
        L_0x008c:
            boolean r3 = r13 instanceof p.j
            if (r3 == 0) goto L_0x00cd
            boolean r3 = r13 instanceof p.C0264a
            if (r3 == 0) goto L_0x00b6
            r3 = r13
            p.a r3 = (p.C0264a) r3
            int r12 = r3.x1()
            if (r12 != 0) goto L_0x00a7
            if (r7 != 0) goto L_0x00a4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00a4:
            r7.add(r3)
        L_0x00a7:
            int r12 = r3.x1()
            r15 = 1
            if (r12 != r15) goto L_0x00cd
            if (r9 != 0) goto L_0x00ca
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L_0x00ca
        L_0x00b6:
            r3 = r13
            p.j r3 = (p.j) r3
            if (r7 != 0) goto L_0x00c0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00c0:
            r7.add(r3)
            if (r9 != 0) goto L_0x00ca
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00ca:
            r9.add(r3)
        L_0x00cd:
            p.d r3 = r13.f5997O
            p.d r3 = r3.f5965f
            if (r3 != 0) goto L_0x00e9
            p.d r3 = r13.f5999Q
            p.d r3 = r3.f5965f
            if (r3 != 0) goto L_0x00e9
            if (r4 != 0) goto L_0x00e9
            boolean r3 = r13 instanceof p.C0264a
            if (r3 != 0) goto L_0x00e9
            if (r10 != 0) goto L_0x00e6
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x00e6:
            r10.add(r13)
        L_0x00e9:
            p.d r3 = r13.f5998P
            p.d r3 = r3.f5965f
            if (r3 != 0) goto L_0x010b
            p.d r3 = r13.f6000R
            p.d r3 = r3.f5965f
            if (r3 != 0) goto L_0x010b
            p.d r3 = r13.f6001S
            p.d r3 = r3.f5965f
            if (r3 != 0) goto L_0x010b
            if (r4 != 0) goto L_0x010b
            boolean r3 = r13 instanceof p.C0264a
            if (r3 != 0) goto L_0x010b
            if (r11 != 0) goto L_0x0108
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L_0x0108:
            r11.add(r13)
        L_0x010b:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x003a
        L_0x0110:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x012d
            java.util.Iterator r4 = r6.iterator()
        L_0x011b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x012d
            java.lang.Object r5 = r4.next()
            p.h r5 = (p.h) r5
            r6 = 0
            r12 = 0
            a(r5, r6, r3, r12)
            goto L_0x011b
        L_0x012d:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x014e
            java.util.Iterator r4 = r7.iterator()
        L_0x0135:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x014e
            java.lang.Object r5 = r4.next()
            p.j r5 = (p.j) r5
            q.o r7 = a(r5, r6, r3, r12)
            r5.r1(r3, r6, r7)
            r7.b(r3)
            r6 = 0
            r12 = 0
            goto L_0x0135
        L_0x014e:
            p.d$b r4 = p.d.b.LEFT
            p.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0176
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0162:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0176
            java.lang.Object r5 = r4.next()
            p.d r5 = (p.d) r5
            p.e r5 = r5.f5963d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x0162
        L_0x0176:
            p.d$b r4 = p.d.b.RIGHT
            p.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x019e
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x018a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x019e
            java.lang.Object r5 = r4.next()
            p.d r5 = (p.d) r5
            p.e r5 = r5.f5963d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x018a
        L_0x019e:
            p.d$b r4 = p.d.b.CENTER
            p.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x01c6
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x01b2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01c6
            java.lang.Object r5 = r4.next()
            p.d r5 = (p.d) r5
            p.e r5 = r5.f5963d
            r6 = 0
            r7 = 0
            a(r5, r6, r3, r7)
            goto L_0x01b2
        L_0x01c6:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01de
            java.util.Iterator r4 = r10.iterator()
        L_0x01ce:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01de
            java.lang.Object r5 = r4.next()
            p.e r5 = (p.e) r5
            a(r5, r6, r3, r7)
            goto L_0x01ce
        L_0x01de:
            if (r8 == 0) goto L_0x01f5
            java.util.Iterator r4 = r8.iterator()
        L_0x01e4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01f5
            java.lang.Object r5 = r4.next()
            p.h r5 = (p.h) r5
            r6 = 1
            a(r5, r6, r3, r7)
            goto L_0x01e4
        L_0x01f5:
            r6 = 1
            if (r9 == 0) goto L_0x0215
            java.util.Iterator r4 = r9.iterator()
        L_0x01fc:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0215
            java.lang.Object r5 = r4.next()
            p.j r5 = (p.j) r5
            q.o r8 = a(r5, r6, r3, r7)
            r5.r1(r3, r6, r8)
            r8.b(r3)
            r6 = 1
            r7 = 0
            goto L_0x01fc
        L_0x0215:
            p.d$b r4 = p.d.b.TOP
            p.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x023d
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0229:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x023d
            java.lang.Object r5 = r4.next()
            p.d r5 = (p.d) r5
            p.e r5 = r5.f5963d
            r6 = 0
            r7 = 1
            a(r5, r7, r3, r6)
            goto L_0x0229
        L_0x023d:
            p.d$b r4 = p.d.b.BASELINE
            p.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x0265
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0251:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0265
            java.lang.Object r5 = r4.next()
            p.d r5 = (p.d) r5
            p.e r5 = r5.f5963d
            r6 = 0
            r7 = 1
            a(r5, r7, r3, r6)
            goto L_0x0251
        L_0x0265:
            p.d$b r4 = p.d.b.BOTTOM
            p.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x028d
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x0279:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x028d
            java.lang.Object r5 = r4.next()
            p.d r5 = (p.d) r5
            p.e r5 = r5.f5963d
            r6 = 0
            r7 = 1
            a(r5, r7, r3, r6)
            goto L_0x0279
        L_0x028d:
            p.d$b r4 = p.d.b.CENTER
            p.d r4 = r0.o(r4)
            java.util.HashSet r5 = r4.d()
            if (r5 == 0) goto L_0x02b5
            java.util.HashSet r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b5
            java.lang.Object r5 = r4.next()
            p.d r5 = (p.d) r5
            p.e r5 = r5.f5963d
            r6 = 1
            r12 = 0
            a(r5, r6, r3, r12)
            goto L_0x02a1
        L_0x02b5:
            r6 = 1
            r12 = 0
            if (r11 == 0) goto L_0x02cd
            java.util.Iterator r4 = r11.iterator()
        L_0x02bd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02cd
            java.lang.Object r5 = r4.next()
            p.e r5 = (p.e) r5
            a(r5, r6, r3, r12)
            goto L_0x02bd
        L_0x02cd:
            r4 = 0
        L_0x02ce:
            if (r4 >= r2) goto L_0x02fa
            java.lang.Object r5 = r1.get(r4)
            p.e r5 = (p.e) r5
            boolean r6 = r5.s0()
            if (r6 == 0) goto L_0x02f7
            int r6 = r5.I0
            q.o r6 = b(r3, r6)
            int r5 = r5.J0
            q.o r5 = b(r3, r5)
            if (r6 == 0) goto L_0x02f7
            if (r5 == 0) goto L_0x02f7
            r7 = 0
            r6.g(r7, r5)
            r7 = 2
            r5.i(r7)
            r3.remove(r6)
        L_0x02f7:
            int r4 = r4 + 1
            goto L_0x02ce
        L_0x02fa:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0303
            r1 = 0
            return r1
        L_0x0303:
            p.e$b r1 = r16.A()
            p.e$b r2 = p.e.b.WRAP_CONTENT
            if (r1 != r2) goto L_0x0345
            java.util.Iterator r1 = r3.iterator()
            r2 = r12
            r6 = 0
        L_0x0311:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0336
            java.lang.Object r4 = r1.next()
            q.o r4 = (q.o) r4
            int r5 = r4.d()
            r7 = 1
            if (r5 != r7) goto L_0x0325
            goto L_0x0311
        L_0x0325:
            r5 = 0
            r4.h(r5)
            m.d r7 = r16.K1()
            int r7 = r4.f(r7, r5)
            if (r7 <= r6) goto L_0x0311
            r2 = r4
            r6 = r7
            goto L_0x0311
        L_0x0336:
            if (r2 == 0) goto L_0x0345
            p.e$b r1 = p.e.b.FIXED
            r0.P0(r1)
            r0.k1(r6)
            r1 = 1
            r2.h(r1)
            goto L_0x0346
        L_0x0345:
            r2 = r12
        L_0x0346:
            p.e$b r1 = r16.T()
            p.e$b r4 = p.e.b.WRAP_CONTENT
            if (r1 != r4) goto L_0x038a
            java.util.Iterator r1 = r3.iterator()
            r3 = r12
            r6 = 0
        L_0x0354:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0379
            java.lang.Object r4 = r1.next()
            q.o r4 = (q.o) r4
            int r5 = r4.d()
            if (r5 != 0) goto L_0x0367
            goto L_0x0354
        L_0x0367:
            r5 = 0
            r4.h(r5)
            m.d r7 = r16.K1()
            r8 = 1
            int r7 = r4.f(r7, r8)
            if (r7 <= r6) goto L_0x0354
            r3 = r4
            r6 = r7
            goto L_0x0354
        L_0x0379:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x038c
            p.e$b r1 = p.e.b.FIXED
            r0.g1(r1)
            r0.L0(r6)
            r3.h(r8)
            r4 = r3
            goto L_0x038d
        L_0x038a:
            r5 = 0
            r8 = 1
        L_0x038c:
            r4 = r12
        L_0x038d:
            if (r2 != 0) goto L_0x0394
            if (r4 == 0) goto L_0x0392
            goto L_0x0394
        L_0x0392:
            r3 = 0
            goto L_0x0395
        L_0x0394:
            r3 = 1
        L_0x0395:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q.i.c(p.f, q.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        boolean z2;
        boolean z3;
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        if (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 || z3) {
            return true;
        }
        return false;
    }
}
