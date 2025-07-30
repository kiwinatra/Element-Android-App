package p;

import java.util.ArrayList;
import m.C0258c;

public abstract class m extends e {
    public ArrayList L0 = new ArrayList();

    public void c(e eVar) {
        this.L0.add(eVar);
        if (eVar.K() != null) {
            ((m) eVar.K()).t1(eVar);
        }
        eVar.c1(this);
    }

    public ArrayList r1() {
        return this.L0;
    }

    public abstract void s1();

    public void t0() {
        this.L0.clear();
        super.t0();
    }

    public void t1(e eVar) {
        this.L0.remove(eVar);
        eVar.t0();
    }

    public void u1() {
        this.L0.clear();
    }

    public void w0(C0258c cVar) {
        super.w0(cVar);
        int size = this.L0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((e) this.L0.get(i2)).w0(cVar);
        }
    }
}
