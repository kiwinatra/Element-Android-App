package p;

import java.util.HashSet;
import p.e;
import q.C0278b;

public abstract class l extends j {
    private int N0 = 0;
    private int O0 = 0;
    private int P0 = 0;
    private int Q0 = 0;
    private int R0 = 0;
    private int S0 = 0;
    private int T0 = 0;
    private int U0 = 0;
    private boolean V0 = false;
    private int W0 = 0;
    private int X0 = 0;
    protected C0278b.a Y0 = new C0278b.a();
    C0278b.C0079b Z0 = null;

    public int A1() {
        return this.U0;
    }

    public int B1() {
        return this.N0;
    }

    public abstract void C1(int i2, int i3, int i4, int i5);

    /* access modifiers changed from: protected */
    public void D1(e eVar, e.b bVar, int i2, e.b bVar2, int i3) {
        while (this.Z0 == null && K() != null) {
            this.Z0 = ((f) K()).I1();
        }
        C0278b.a aVar = this.Y0;
        aVar.f6104a = bVar;
        aVar.f6105b = bVar2;
        aVar.f6106c = i2;
        aVar.f6107d = i3;
        this.Z0.b(eVar, aVar);
        eVar.k1(this.Y0.f6108e);
        eVar.L0(this.Y0.f6109f);
        eVar.K0(this.Y0.f6111h);
        eVar.A0(this.Y0.f6110g);
    }

    /* access modifiers changed from: protected */
    public boolean E1() {
        C0278b.C0079b bVar;
        e eVar = this.f6010a0;
        if (eVar != null) {
            bVar = ((f) eVar).I1();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.M0; i2++) {
            e eVar2 = this.L0[i2];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b u2 = eVar2.u(0);
                e.b u3 = eVar2.u(1);
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (u2 != bVar2 || eVar2.f6053w == 1 || u3 != bVar2 || eVar2.f6055x == 1) {
                    if (u2 == bVar2) {
                        u2 = e.b.WRAP_CONTENT;
                    }
                    if (u3 == bVar2) {
                        u3 = e.b.WRAP_CONTENT;
                    }
                    C0278b.a aVar = this.Y0;
                    aVar.f6104a = u2;
                    aVar.f6105b = u3;
                    aVar.f6106c = eVar2.W();
                    this.Y0.f6107d = eVar2.x();
                    bVar.b(eVar2, this.Y0);
                    eVar2.k1(this.Y0.f6108e);
                    eVar2.L0(this.Y0.f6109f);
                    eVar2.A0(this.Y0.f6110g);
                }
            }
        }
        return true;
    }

    public boolean F1() {
        return this.V0;
    }

    /* access modifiers changed from: protected */
    public void G1(boolean z2) {
        this.V0 = z2;
    }

    public void H1(int i2, int i3) {
        this.W0 = i2;
        this.X0 = i3;
    }

    public void I1(int i2) {
        this.P0 = i2;
        this.N0 = i2;
        this.Q0 = i2;
        this.O0 = i2;
        this.R0 = i2;
        this.S0 = i2;
    }

    public void J1(int i2) {
        this.O0 = i2;
    }

    public void K1(int i2) {
        this.S0 = i2;
    }

    public void L1(int i2) {
        this.P0 = i2;
        this.T0 = i2;
    }

    public void M1(int i2) {
        this.Q0 = i2;
        this.U0 = i2;
    }

    public void N1(int i2) {
        this.R0 = i2;
        this.T0 = i2;
        this.U0 = i2;
    }

    public void O1(int i2) {
        this.N0 = i2;
    }

    public void b(f fVar) {
        u1();
    }

    public void t1(boolean z2) {
        int i2 = this.R0;
        if (i2 <= 0 && this.S0 <= 0) {
            return;
        }
        if (z2) {
            this.T0 = this.S0;
            this.U0 = i2;
            return;
        }
        this.T0 = i2;
        this.U0 = this.S0;
    }

    public void u1() {
        for (int i2 = 0; i2 < this.M0; i2++) {
            e eVar = this.L0[i2];
            if (eVar != null) {
                eVar.U0(true);
            }
        }
    }

    public boolean v1(HashSet hashSet) {
        for (int i2 = 0; i2 < this.M0; i2++) {
            if (hashSet.contains(this.L0[i2])) {
                return true;
            }
        }
        return false;
    }

    public int w1() {
        return this.X0;
    }

    public int x1() {
        return this.W0;
    }

    public int y1() {
        return this.O0;
    }

    public int z1() {
        return this.T0;
    }
}
