package b;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import w0.i;

/* renamed from: b.a  reason: case insensitive filesystem */
public final class C0208a {

    /* renamed from: a  reason: collision with root package name */
    private final Set f4133a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
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
