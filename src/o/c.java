package O;

import android.os.Bundle;
import androidx.lifecycle.C0190g;
import androidx.savedstate.Recreator;
import w0.e;
import w0.i;

public final class c {

    
    public static final a f156d = new a((e) null);

    
    private final d f157a;

    
    private final androidx.savedstate.a f158b;

    
    private boolean f159c;

    public static final class a {
        private a() {
        }

        public final c a(d dVar) {
            i.e(dVar, "owner");
            return new c(dVar, (e) null);
        }

        public  a(e eVar) {
            this();
        }
    }

    private c(d dVar) {
        this.f157a = dVar;
        this.f158b = new androidx.savedstate.a();
    }

    public static final c a(d dVar) {
        return f156d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f158b;
    }

    public final void c() {
        C0190g v2 = this.f157a.v();
        if (v2.b() == C0190g.b.INITIALIZED) {
            v2.a(new Recreator(this.f157a));
            this.f158b.e(v2);
            this.f159c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void d(Bundle bundle) {
        if (!this.f159c) {
            c();
        }
        C0190g v2 = this.f157a.v();
        if (!v2.b().b(C0190g.b.STARTED)) {
            this.f158b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + v2.b()).toString());
    }

    public final void e(Bundle bundle) {
        i.e(bundle, "outBundle");
        this.f158b.g(bundle);
    }

    public  c(d dVar, e eVar) {
        this(dVar);
    }
}
