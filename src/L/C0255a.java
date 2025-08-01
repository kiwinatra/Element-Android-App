package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;


public class C0255a extends g implements Map {

    
    f f5744h;

    
    class C0078a extends f {
        C0078a() {
        }

        
        public void a() {
            C0255a.this.clear();
        }

        
        public Object b(int i2, int i3) {
            return C0255a.this.f5793b[(i2 << 1) + i3];
        }

        
        public Map c() {
            return C0255a.this;
        }

        
        public int d() {
            return C0255a.this.f5794c;
        }

        
        public int e(Object obj) {
            return C0255a.this.f(obj);
        }

        
        public int f(Object obj) {
            return C0255a.this.h(obj);
        }

        
        public void g(Object obj, Object obj2) {
            C0255a.this.put(obj, obj2);
        }

        
        public void h(int i2) {
            C0255a.this.k(i2);
        }

        
        public Object i(int i2, Object obj) {
            return C0255a.this.l(i2, obj);
        }
    }

    public C0255a() {
    }

    private f n() {
        if (this.f5744h == null) {
            this.f5744h = new C0078a();
        }
        return this.f5744h;
    }

    public Set entrySet() {
        return n().l();
    }

    public Set keySet() {
        return n().m();
    }

    public boolean o(Collection collection) {
        return f.p(this, collection);
    }

    public void putAll(Map map) {
        c(this.f5794c + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection values() {
        return n().n();
    }

    public C0255a(int i2) {
        super(i2);
    }

    public C0255a(g gVar) {
        super(gVar);
    }
}
