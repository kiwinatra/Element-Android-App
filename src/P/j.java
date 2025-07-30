package p;

import java.util.ArrayList;
import java.util.Arrays;
import q.i;
import q.o;

public abstract class j extends e implements i {
    public e[] L0 = new e[4];
    public int M0 = 0;

    public void a() {
        this.M0 = 0;
        Arrays.fill(this.L0, (Object) null);
    }

    public void c(e eVar) {
        if (eVar != this && eVar != null) {
            int i2 = this.M0 + 1;
            e[] eVarArr = this.L0;
            if (i2 > eVarArr.length) {
                this.L0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            e[] eVarArr2 = this.L0;
            int i3 = this.M0;
            eVarArr2[i3] = eVar;
            this.M0 = i3 + 1;
        }
    }

    public void r1(ArrayList arrayList, int i2, o oVar) {
        for (int i3 = 0; i3 < this.M0; i3++) {
            oVar.a(this.L0[i3]);
        }
        for (int i4 = 0; i4 < this.M0; i4++) {
            i.a(this.L0[i4], i2, arrayList, oVar);
        }
    }

    public int s1(int i2) {
        int i3;
        int i4;
        for (int i5 = 0; i5 < this.M0; i5++) {
            e eVar = this.L0[i5];
            if (i2 == 0 && (i4 = eVar.I0) != -1) {
                return i4;
            }
            if (i2 == 1 && (i3 = eVar.J0) != -1) {
                return i3;
            }
        }
        return -1;
    }

    public void b(f fVar) {
    }
}
