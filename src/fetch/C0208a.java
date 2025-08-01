package b;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import w0.i;


public final class C0208a {

    
    private final Set f4133a = new CopyOnWriteArraySet();

    
    private volatile Context f4134b;

    public final void a(C0209b bVar) {
        i.e(bVar, "listener");
        Context context = this.f4134b;
        if (context != null) {
            bVar.a(context);
        }
        this.f4133a.add(bVar);
    }

    public final void b() {
        this.f4134b = null;
    }

    public final void c(Context context) {
        i.e(context, "context");
        this.f4134b = context;
        for (C0209b a2 : this.f4133a) {
            a2.a(context);
        }
    }
}
