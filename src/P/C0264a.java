package p;

import m.C0259d;
import m.i;
import p.d;
import p.e;

/* renamed from: p.a  reason: case insensitive filesystem */
public class C0264a extends j {
    private int N0 = 0;
    private boolean O0 = true;
    private int P0 = 0;
    boolean Q0 = false;

    public void A1(int i2) {
        this.N0 = i2;
    }

    public void B1(int i2) {
        this.P0 = i2;
    }

    public void g(C0259d dVar, boolean z2) {
        d[] dVarArr;
        boolean z3;
        i iVar;
        d dVar2;
        int i2;
        int i3;
        int i4;
        i iVar2;
        int i5;
        d[] dVarArr2 = this.f6005W;
        dVarArr2[0] = this.f5997O;
        dVarArr2[2] = this.f5998P;
        dVarArr2[1] = this.f5999Q;
        dVarArr2[3] = this.f6000R;
        int i6 = 0;
        while (true) {
            dVarArr = this.f6005W;
            if (i6 >= dVarArr.length) {
                break;
            }
            d dVar3 = dVarArr[i6];
            dVar3.f5968i = dVar.q(dVar3);
            i6++;
        }
        int i7 = this.N0;
        if (i7 >= 0 && i7 < 4) {
            d dVar4 = dVarArr[i7];
            if (!this.Q0) {
                t1();
            }
            if (this.Q0) {
                this.Q0 = false;
                int i8 = this.N0;
                if (i8 == 0 || i8 == 1) {
                    dVar.f(this.f5997O.f5968i, this.f6020f0);
                    iVar2 = this.f5999Q.f5968i;
                    i5 = this.f6020f0;
                } else if (i8 == 2 || i8 == 3) {
                    dVar.f(this.f5998P.f5968i, this.f6022g0);
                    iVar2 = this.f6000R.f5968i;
                    i5 = this.f6022g0;
                } else {
                    return;
                }
                dVar.f(iVar2, i5);
                return;
            }
            int i9 = 0;
            while (true) {
                if (i9 >= this.M0) {
                    z3 = false;
                    break;
                }
                e eVar = this.L0[i9];
                if ((this.O0 || eVar.h()) && ((((i3 = this.N0) == 0 || i3 == 1) && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f5997O.f5965f != null && eVar.f5999Q.f5965f != null) || (((i4 = this.N0) == 2 || i4 == 3) && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.f5998P.f5965f != null && eVar.f6000R.f5965f != null))) {
                    z3 = true;
                } else {
                    i9++;
                }
            }
            z3 = true;
            boolean z4 = this.f5997O.l() || this.f5999Q.l();
            boolean z5 = this.f5998P.l() || this.f6000R.l();
            int i10 = !(!z3 && (((i2 = this.N0) == 0 && z4) || ((i2 == 2 && z5) || ((i2 == 1 && z4) || (i2 == 3 && z5))))) ? 4 : 5;
            for (int i11 = 0; i11 < this.M0; i11++) {
                e eVar2 = this.L0[i11];
                if (this.O0 || eVar2.h()) {
                    i q2 = dVar.q(eVar2.f6005W[this.N0]);
                    d[] dVarArr3 = eVar2.f6005W;
                    int i12 = this.N0;
                    d dVar5 = dVarArr3[i12];
                    dVar5.f5968i = q2;
                    d dVar6 = dVar5.f5965f;
                    int i13 = (dVar6 == null || dVar6.f5963d != this) ? 0 : dVar5.f5966g;
                    if (i12 == 0 || i12 == 2) {
                        dVar.i(dVar4.f5968i, q2, this.P0 - i13, z3);
                    } else {
                        dVar.g(dVar4.f5968i, q2, this.P0 + i13, z3);
                    }
                    dVar.e(dVar4.f5968i, q2, this.P0 + i13, i10);
                }
            }
            int i14 = this.N0;
            if (i14 == 0) {
                dVar.e(this.f5999Q.f5968i, this.f5997O.f5968i, 0, 8);
                dVar.e(this.f5997O.f5968i, this.f6010a0.f5999Q.f5968i, 0, 4);
                iVar = this.f5997O.f5968i;
                dVar2 = this.f6010a0.f5997O;
            } else if (i14 == 1) {
                dVar.e(this.f5997O.f5968i, this.f5999Q.f5968i, 0, 8);
                dVar.e(this.f5997O.f5968i, this.f6010a0.f5997O.f5968i, 0, 4);
                iVar = this.f5997O.f5968i;
                dVar2 = this.f6010a0.f5999Q;
            } else if (i14 == 2) {
                dVar.e(this.f6000R.f5968i, this.f5998P.f5968i, 0, 8);
                dVar.e(this.f5998P.f5968i, this.f6010a0.f6000R.f5968i, 0, 4);
                iVar = this.f5998P.f5968i;
                dVar2 = this.f6010a0.f5998P;
            } else if (i14 == 3) {
                dVar.e(this.f5998P.f5968i, this.f6000R.f5968i, 0, 8);
                dVar.e(this.f5998P.f5968i, this.f6010a0.f5998P.f5968i, 0, 4);
                iVar = this.f5998P.f5968i;
                dVar2 = this.f6010a0.f6000R;
            } else {
                return;
            }
            dVar.e(iVar, dVar2.f5968i, 0, 0);
        }
    }

    public boolean h() {
        return true;
    }

    public boolean n0() {
        return this.Q0;
    }

    public boolean o0() {
        return this.Q0;
    }

    public boolean t1() {
        int i2;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i3;
        int i4;
        int i5 = 0;
        boolean z2 = true;
        while (true) {
            i2 = this.M0;
            if (i5 >= i2) {
                break;
            }
            e eVar = this.L0[i5];
            if ((this.O0 || eVar.h()) && ((((i3 = this.N0) == 0 || i3 == 1) && !eVar.n0()) || (((i4 = this.N0) == 2 || i4 == 3) && !eVar.o0()))) {
                z2 = false;
            }
            i5++;
        }
        if (!z2 || i2 <= 0) {
            return false;
        }
        int i6 = 0;
        boolean z3 = false;
        for (int i7 = 0; i7 < this.M0; i7++) {
            e eVar2 = this.L0[i7];
            if (this.O0 || eVar2.h()) {
                if (!z3) {
                    int i8 = this.N0;
                    if (i8 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i8 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i8 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i8 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z3 = true;
                    }
                    i6 = eVar2.o(bVar3).e();
                    z3 = true;
                }
                int i9 = this.N0;
                if (i9 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i9 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i9 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i9 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    i6 = Math.max(i6, eVar2.o(bVar).e());
                }
                i6 = Math.min(i6, eVar2.o(bVar2).e());
            }
        }
        int i10 = i6 + this.P0;
        int i11 = this.N0;
        if (i11 == 0 || i11 == 1) {
            F0(i10, i10);
        } else {
            I0(i10, i10);
        }
        this.Q0 = true;
        return true;
    }

    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i2 = 0; i2 < this.M0; i2++) {
            e eVar = this.L0[i2];
            if (i2 > 0) {
                str = str + ", ";
            }
            str = str + eVar.t();
        }
        return str + "}";
    }

    public boolean u1() {
        return this.O0;
    }

    public int v1() {
        return this.N0;
    }

    public int w1() {
        return this.P0;
    }

    public int x1() {
        int i2 = this.N0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        if (i2 == 2 || i2 == 3) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void y1() {
        for (int i2 = 0; i2 < this.M0; i2++) {
            e eVar = this.L0[i2];
            if (this.O0 || eVar.h()) {
                int i3 = this.N0;
                if (i3 == 0 || i3 == 1) {
                    eVar.S0(0, true);
                } else if (i3 == 2 || i3 == 3) {
                    eVar.S0(1, true);
                }
            }
        }
    }

    public void z1(boolean z2) {
        this.O0 = z2;
    }
}
