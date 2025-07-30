package p;

import m.C0259d;
import p.e;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f6087a = new boolean[3];

    static void a(f fVar, C0259d dVar, e eVar) {
        eVar.f6047t = -1;
        eVar.f6049u = -1;
        e.b bVar = fVar.f6008Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f6008Z[0] == e.b.MATCH_PARENT) {
            int i2 = eVar.f5997O.f5966g;
            int W2 = fVar.W() - eVar.f5999Q.f5966g;
            d dVar2 = eVar.f5997O;
            dVar2.f5968i = dVar.q(dVar2);
            d dVar3 = eVar.f5999Q;
            dVar3.f5968i = dVar.q(dVar3);
            dVar.f(eVar.f5997O.f5968i, i2);
            dVar.f(eVar.f5999Q.f5968i, W2);
            eVar.f6047t = 2;
            eVar.O0(i2, W2);
        }
        if (fVar.f6008Z[1] != bVar2 && eVar.f6008Z[1] == e.b.MATCH_PARENT) {
            int i3 = eVar.f5998P.f5966g;
            int x2 = fVar.x() - eVar.f6000R.f5966g;
            d dVar4 = eVar.f5998P;
            dVar4.f5968i = dVar.q(dVar4);
            d dVar5 = eVar.f6000R;
            dVar5.f5968i = dVar.q(dVar5);
            dVar.f(eVar.f5998P.f5968i, i3);
            dVar.f(eVar.f6000R.f5968i, x2);
            if (eVar.f6032l0 > 0 || eVar.V() == 8) {
                d dVar6 = eVar.f6001S;
                dVar6.f5968i = dVar.q(dVar6);
                dVar.f(eVar.f6001S.f5968i, eVar.f6032l0 + i3);
            }
            eVar.f6049u = 2;
            eVar.f1(i3, x2);
        }
    }

    public static final boolean b(int i2, int i3) {
        if ((i2 & i3) == i3) {
            return true;
        }
        return false;
    }
}
