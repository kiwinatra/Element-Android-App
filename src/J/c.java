package J;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p0.A;
import p0.G;
import p0.k;
import w0.e;
import w0.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f108a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static C0006c f109b = C0006c.f120d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* renamed from: J.c$c  reason: collision with other inner class name */
    public static final class C0006c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f119c = new a((e) null);

        /* renamed from: d  reason: collision with root package name */
        public static final C0006c f120d = new C0006c(G.a(), (b) null, A.d());

        /* renamed from: a  reason: collision with root package name */
        private final Set f121a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f122b;

        /* renamed from: J.c$c$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(e eVar) {
                this();
            }
        }

        public C0006c(Set set, b bVar, Map map) {
            i.e(set, "flags");
            i.e(map, "allowedViolations");
            this.f121a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f122b = linkedHashMap;
        }

        public final Set a() {
            return this.f121a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f122b;
        }
    }

    private c() {
    }

    private final C0006c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.W()) {
                w D2 = fragment.D();
                i.d(D2, "declaringFragment.parentFragmentManager");
                if (D2.z0() != null) {
                    C0006c z02 = D2.z0();
                    i.b(z02);
                    return z02;
                }
            }
            fragment = fragment.C();
        }
        return f109b;
    }

    private final void c(C0006c cVar, g gVar) {
        Fragment a2 = gVar.a();
        String name = a2.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, gVar);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            j(a2, new b(name, gVar));
        }
    }

    /* access modifiers changed from: private */
    public static final void d(String str, g gVar) {
        i.e(gVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, gVar);
        throw gVar;
    }

    private final void e(g gVar) {
        if (w.G0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + gVar.a().getClass().getName(), gVar);
        }
    }

    public static final void f(Fragment fragment, String str) {
        i.e(fragment, "fragment");
        i.e(str, "previousFragmentId");
        a aVar = new a(fragment, str);
        c cVar = f108a;
        cVar.e(aVar);
        C0006c b2 = cVar.b(fragment);
        if (b2.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.k(b2, fragment.getClass(), aVar.getClass())) {
            cVar.c(b2, aVar);
        }
    }

    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        i.e(fragment, "fragment");
        d dVar = new d(fragment, viewGroup);
        c cVar = f108a;
        cVar.e(dVar);
        C0006c b2 = cVar.b(fragment);
        if (b2.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.k(b2, fragment.getClass(), dVar.getClass())) {
            cVar.c(b2, dVar);
        }
    }

    public static final void h(Fragment fragment) {
        i.e(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f108a;
        cVar.e(eVar);
        C0006c b2 = cVar.b(fragment);
        if (b2.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.k(b2, fragment.getClass(), eVar.getClass())) {
            cVar.c(b2, eVar);
        }
    }

    public static final void i(Fragment fragment, ViewGroup viewGroup) {
        i.e(fragment, "fragment");
        i.e(viewGroup, "container");
        h hVar = new h(fragment, viewGroup);
        c cVar = f108a;
        cVar.e(hVar);
        C0006c b2 = cVar.b(fragment);
        if (b2.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.k(b2, fragment.getClass(), hVar.getClass())) {
            cVar.c(b2, hVar);
        }
    }

    private final void j(Fragment fragment, Runnable runnable) {
        if (fragment.W()) {
            Handler u2 = fragment.D().t0().u();
            i.d(u2, "fragment.parentFragmentManager.host.handler");
            if (!i.a(u2.getLooper(), Looper.myLooper())) {
                u2.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    private final boolean k(C0006c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (i.a(cls2.getSuperclass(), g.class) || !k.g(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
