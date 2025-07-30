package p0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o0.g;
import w0.i;

abstract class u extends t {
    public static boolean g(Iterable iterable, Object obj) {
        i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (h(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static final int h(Iterable iterable, Object obj) {
        i.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i2 = 0;
        for (Object next : iterable) {
            if (i2 < 0) {
                k.e();
            }
            if (i.a(obj, next)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static List i(Iterable iterable, Iterable iterable2) {
        i.e(iterable, "<this>");
        i.e(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(k.f(iterable, 10), k.f(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(g.a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
