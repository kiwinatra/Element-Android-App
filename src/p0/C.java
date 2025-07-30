package p0;

import java.util.Collections;
import java.util.Map;
import o0.e;
import w0.i;

abstract class C extends B {
    public static int a(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map b(e eVar) {
        i.e(eVar, "pair");
        Map singletonMap = Collections.singletonMap(eVar.c(), eVar.d());
        i.d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final Map c(Map map) {
        i.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        i.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
