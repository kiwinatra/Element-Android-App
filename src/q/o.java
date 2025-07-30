package q;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import m.C0259d;
import p.C0265b;
import p.d;
import p.e;
import p.f;

public class o {

    /* renamed from: g  reason: collision with root package name */
    static int f6163g;

    /* renamed from: a  reason: collision with root package name */
    ArrayList f6164a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    int f6165b;

    /* renamed from: c  reason: collision with root package name */
    boolean f6166c = false;

    /* renamed from: d  reason: collision with root package name */
    int f6167d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList f6168e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f6169f = -1;

    class a {

        /* renamed from: a  reason: collision with root package name */
        WeakReference f6170a;

        /* renamed from: b  reason: collision with root package name */
        int f6171b;

        /* renamed from: c  reason: collision with root package name */
        int f6172c;

        /* renamed from: d  reason: collision with root package name */
        int f6173d;

        /* renamed from: e  reason: collision with root package name */
        int f6174e;

        /* renamed from: f  reason: collision with root package name */
        int f6175f;

        /* renamed from: g  reason: collision with root package name */
        int f6176g;

        public a(e eVar, C0259d dVar, int i2) {
            this.f6170a = new WeakReference(eVar);
            this.f6171b = dVar.x(eVar.f5997O);
            this.f6172c = dVar.x(eVar.f5998P);
            this.f6173d = dVar.x(eVar.f5999Q);
            this.f6174e = dVar.x(eVar.f6000R);
            this.f6175f = dVar.x(eVar.f6001S);
            this.f6176g = i2;
        }
    }

    public o(int i2) {
        int i3 = f6163g;
        f6163g = i3 + 1;
        this.f6165b = i3;
        this.f6167d = i2;
    }

    private String e() {
        int i2 = this.f6167d;
        if (i2 == 0) {
            return "Horizontal";
        }
        if (i2 == 1) {
            return "Vertical";
        }
        if (i2 == 2) {
            return "Both";
        }
        return "Unknown";
    }

    private int j(C0259d dVar, ArrayList arrayList, int i2) {
        int x2;
        d dVar2;
        f fVar = (f) ((e) arrayList.get(0)).K();
        dVar.D();
        fVar.g(dVar, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((e) arrayList.get(i3)).g(dVar, false);
        }
        if (i2 == 0 && fVar.W0 > 0) {
            C0265b.b(fVar, dVar, arrayList, 0);
        }
        if (i2 == 1 && fVar.X0 > 0) {
            C0265b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f6168e = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            this.f6168e.add(new a((e) arrayList.get(i4), dVar, i2));
        }
        if (i2 == 0) {
            x2 = dVar.x(fVar.f5997O);
            dVar2 = fVar.f5999Q;
        } else {
            x2 = dVar.x(fVar.f5998P);
            dVar2 = fVar.f6000R;
        }
        int x3 = dVar.x(dVar2);
        dVar.D();
        return x3 - x2;
    }

    public boolean a(e eVar) {
        if (this.f6164a.contains(eVar)) {
            return false;
        }
        this.f6164a.add(eVar);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f6164a.size();
        if (this.f6169f != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                o oVar = (o) arrayList.get(i2);
                if (this.f6169f == oVar.f6165b) {
                    g(this.f6167d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f6165b;
    }

    public int d() {
        return this.f6167d;
    }

    public int f(C0259d dVar, int i2) {
        if (this.f6164a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f6164a, i2);
    }

    public void g(int i2, o oVar) {
        Iterator it = this.f6164a.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            oVar.a(eVar);
            int c2 = oVar.c();
            if (i2 == 0) {
                eVar.I0 = c2;
            } else {
                eVar.J0 = c2;
            }
        }
        this.f6169f = oVar.f6165b;
    }

    public void h(boolean z2) {
        this.f6166c = z2;
    }

    public void i(int i2) {
        this.f6167d = i2;
    }

    public String toString() {
        String str = e() + " [" + this.f6165b + "] <";
        Iterator it = this.f6164a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((e) it.next()).t();
        }
        return str + " >";
    }
}
