package q;

import java.util.ArrayList;
import java.util.List;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f6125a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6126b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6127c = false;

    /* renamed from: d  reason: collision with root package name */
    p f6128d;

    /* renamed from: e  reason: collision with root package name */
    a f6129e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    int f6130f;

    /* renamed from: g  reason: collision with root package name */
    public int f6131g;

    /* renamed from: h  reason: collision with root package name */
    int f6132h = 1;

    /* renamed from: i  reason: collision with root package name */
    g f6133i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6134j = false;

    /* renamed from: k  reason: collision with root package name */
    List f6135k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List f6136l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f6128d = pVar;
    }

    public void a(d dVar) {
        for (f fVar : this.f6136l) {
            if (!fVar.f6134j) {
                return;
            }
        }
        this.f6127c = true;
        d dVar2 = this.f6125a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f6126b) {
            this.f6128d.a(this);
            return;
        }
        f fVar2 = null;
        int i2 = 0;
        for (f fVar3 : this.f6136l) {
            if (!(fVar3 instanceof g)) {
                i2++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i2 == 1 && fVar2.f6134j) {
            g gVar = this.f6133i;
            if (gVar != null) {
                if (gVar.f6134j) {
                    this.f6130f = this.f6132h * gVar.f6131g;
                } else {
                    return;
                }
            }
            d(fVar2.f6131g + this.f6130f);
        }
        d dVar3 = this.f6125a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f6135k.add(dVar);
        if (this.f6134j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f6136l.clear();
        this.f6135k.clear();
        this.f6134j = false;
        this.f6131g = 0;
        this.f6127c = false;
        this.f6126b = false;
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

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6128d.f6179b.t());
        sb.append(":");
        sb.append(this.f6129e);
        sb.append("(");
        if (this.f6134j) {
            obj = Integer.valueOf(this.f6131g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f6136l.size());
        sb.append(":d=");
        sb.append(this.f6135k.size());
        sb.append(">");
        return sb.toString();
    }
}
