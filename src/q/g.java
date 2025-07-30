package q;

import q.f;

class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f6146m;

    public g(p pVar) {
        super(pVar);
        f.a aVar;
        if (pVar instanceof l) {
            aVar = f.a.HORIZONTAL_DIMENSION;
        } else {
            aVar = f.a.VERTICAL_DIMENSION;
        }
        this.f6129e = aVar;
    }

    public void d(int i2) {
        if (!this.f6134j) {
            this.f6134j = true;
            this.f6131g = i2;
            for (d dVar : this.f6135k) {
                dVar.a(dVar);
            }
        }
    }
}
