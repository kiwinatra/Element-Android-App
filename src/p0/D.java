package p0;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o0.e;
import w0.i;

abstract class D extends C {
    public static Map d() {
        x xVar = x.f6096a;
        i.c(xVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return xVar;
    }

    public static final Map e(Map map) {
        i.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return A.d();
        }
        if (size != 1) {
            return map;
        }
        return C.c(map);
    }

    public static final void f(Map map, Iterable iterable) {
        i.e(map, "<this>");
        i.e(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            map.put(eVar.a(), eVar.b());
        }
    }

    public static Map g(Iterable iterable) {
        Object next;
        i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return e(h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return A.d();
        }
        if (size != 1) {
            return h(iterable, new LinkedHashMap(A.a(collection.size())));
        }
        if (iterable instanceof List) {
            next = ((List) iterable).get(0);
        } else {
            next = iterable.iterator().next();
        }
        return C.b((e) next);
    }

    public static final Map h(Iterable iterable, Map map) {
        i.e(iterable, "<this>");
        i.e(map, "destination");
        f(map, iterable);
        return map;
    }
}
