package q;

import p.e;
import p.h;

class j extends p {
    public j(e eVar) {
        super(eVar);
        eVar.f6017e.f();
        eVar.f6019f.f();
        this.f6183f = ((h) eVar).s1();
    }

    private void q(f fVar) {
        this.f6185h.f6135k.add(fVar);
        fVar.f6136l.add(this.f6185h);
    }

    public void a(d dVar) {
        f fVar = this.f6185h;
        if (fVar.f6127c && !fVar.f6134j) {
            this.f6185h.d((int) ((((float) ((f) fVar.f6136l.get(0)).f6131g) * ((h) this.f6179b).v1()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        p pVar;
        f fVar;
        f fVar2;
        h hVar = (h) this.f6179b;
        int t1 = hVar.t1();
        int u1 = hVar.u1();
        hVar.v1();
        if (hVar.s1() == 1) {
            f fVar3 = this.f6185h;
            if (t1 != -1) {
                fVar3.f6136l.add(this.f6179b.f6010a0.f6017e.f6185h);
                this.f6179b.f6010a0.f6017e.f6185h.f6135k.add(this.f6185h);
                fVar2 = this.f6185h;
            } else if (u1 != -1) {
                fVar3.f6136l.add(this.f6179b.f6010a0.f6017e.f6186i);
                this.f6179b.f6010a0.f6017e.f6186i.f6135k.add(this.f6185h);
                fVar2 = this.f6185h;
                t1 = -u1;
            } else {
                fVar3.f6126b = true;
                fVar3.f6136l.add(this.f6179b.f6010a0.f6017e.f6186i);
                this.f6179b.f6010a0.f6017e.f6186i.f6135k.add(this.f6185h);
                q(this.f6179b.f6017e.f6185h);
                pVar = this.f6179b.f6017e;
            }
            fVar2.f6130f = t1;
            q(this.f6179b.f6017e.f6185h);
            pVar = this.f6179b.f6017e;
        } else {
            f fVar4 = this.f6185h;
            if (t1 != -1) {
                fVar4.f6136l.add(this.f6179b.f6010a0.f6019f.f6185h);
                this.f6179b.f6010a0.f6019f.f6185h.f6135k.add(this.f6185h);
                fVar = this.f6185h;
            } else if (u1 != -1) {
                fVar4.f6136l.add(this.f6179b.f6010a0.f6019f.f6186i);
                this.f6179b.f6010a0.f6019f.f6186i.f6135k.add(this.f6185h);
                fVar = this.f6185h;
                t1 = -u1;
            } else {
                fVar4.f6126b = true;
                fVar4.f6136l.add(this.f6179b.f6010a0.f6019f.f6186i);
                this.f6179b.f6010a0.f6019f.f6186i.f6135k.add(this.f6185h);
                q(this.f6179b.f6019f.f6185h);
                pVar = this.f6179b.f6019f;
            }
            fVar.f6130f = t1;
            q(this.f6179b.f6019f.f6185h);
            pVar = this.f6179b.f6019f;
        }
        q(pVar.f6186i);
    }

    public void e() {
        if (((h) this.f6179b).s1() == 1) {
            this.f6179b.m1(this.f6185h.f6131g);
        } else {
            this.f6179b.n1(this.f6185h.f6131g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f6185h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
