package k;

import java.util.HashMap;
import java.util.Map;
import k.C0254b;


public class C0253a extends C0254b {

    
    private final HashMap f5594e = new HashMap();

    
    public C0254b.c c(Object obj) {
        return (C0254b.c) this.f5594e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f5594e.containsKey(obj);
    }

    public Object g(Object obj, Object obj2) {
        C0254b.c c2 = c(obj);
        if (c2 != null) {
            return c2.f5600b;
        }
        this.f5594e.put(obj, f(obj, obj2));
        return null;
    }

    public Object h(Object obj) {
        Object h2 = super.h(obj);
        this.f5594e.remove(obj);
        return h2;
    }

    public Map.Entry i(Object obj) {
        if (contains(obj)) {
            return ((C0254b.c) this.f5594e.get(obj)).f5602d;
        }
        return null;
    }
}
