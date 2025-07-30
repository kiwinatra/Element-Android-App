package q;

import p.C0264a;
import p.e;
import q.f;

class k extends p {
    public k(e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f6185h.f6135k.add(fVar);
        fVar.f6136l.add(this.f6185h);
    }

    public void a(d dVar) {
        C0264a aVar = (C0264a) this.f6179b;
        int v1 = aVar.v1();
        int i2 = 0;
        int i3 = -1;
        for (f fVar : this.f6185h.f6136l) {
            int i4 = fVar.f6131g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (v1 == 0 || v1 == 2) {
            this.f6185h.d(i3 + aVar.w1());
        } else {
            this.f6185h.d(i2 + aVar.w1());
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        p pVar;
        e eVar = this.f6179b;
        if (eVar instanceof C0264a) {
            this.f6185h.f6126b = true;
            C0264a aVar = (C0264a) eVar;
            int v1 = aVar.v1();
            boolean u1 = aVar.u1();
            int i2 = 0;
            if (v1 == 0) {
                this.f6185h.f6129e = f.a.LEFT;
                while (i2 < aVar.M0) {
                    e eVar2 = aVar.L0[i2];
                    if (u1 || eVar2.V() != 8) {
                        f fVar = eVar2.f6017e.f6185h;
                        fVar.f6135k.add(this.f6185h);
                        this.f6185h.f6136l.add(fVar);
                    }
                    i2++;
                }
                q(this.f6179b.f6017e.f6185h);
                pVar = this.f6179b.f6017e;
            } else if (v1 != 1) {
                if (v1 == 2) {
                    this.f6185h.f6129e = f.a.TOP;
                    while (i2 < aVar.M0) {
                        e eVar3 = aVar.L0[i2];
                        if (u1 || eVar3.V() != 8) {
                            f fVar2 = eVar3.f6019f.f6185h;
                            fVar2.f6135k.add(this.f6185h);
                            this.f6185h.f6136l.add(fVar2);
                        }
                        i2++;
                    }
                } else if (v1 == 3) {
                    this.f6185h.f6129e = f.a.BOTTOM;
                    while (i2 < aVar.M0) {
                        e eVar4 = aVar.L0[i2];
                        if (u1 || eVar4.V() != 8) {
                            f fVar3 = eVar4.f6019f.f6186i;
                            fVar3.f6135k.add(this.f6185h);
                            this.f6185h.f6136l.add(fVar3);
                        }
                        i2++;
                    }
                } else {
                    return;
                }
                q(this.f6179b.f6019f.f6185h);
                pVar = this.f6179b.f6019f;
            } else {
                this.f6185h.f6129e = f.a.RIGHT;
                while (i2 < aVar.M0) {
                    e eVar5 = aVar.L0[i2];
                    if (u1 || eVar5.V() != 8) {
                        f fVar4 = eVar5.f6017e.f6186i;
                        fVar4.f6135k.add(this.f6185h);
                        this.f6185h.f6136l.add(fVar4);
                    }
                    i2++;
                }
                q(this.f6179b.f6017e.f6185h);
                pVar = this.f6179b.f6017e;
            }
            q(pVar.f6186i);
        }
    }

    public void e() {
        e eVar = this.f6179b;
        if (eVar instanceof C0264a) {
            int v1 = ((C0264a) eVar).v1();
            if (v1 == 0 || v1 == 1) {
                this.f6179b.m1(this.f6185h.f6131g);
            } else {
                this.f6179b.n1(this.f6185h.f6131g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f6180c = null;
        this.f6185h.c();
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return false;
    }
}
