package k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;


public class C0254b implements Iterable {

    
    c f5595a;

    
    private c f5596b;

    
    private final WeakHashMap f5597c = new WeakHashMap();

    
    private int f5598d = 0;

    
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        
        public c b(c cVar) {
            return cVar.f5602d;
        }

        
        public c c(c cVar) {
            return cVar.f5601c;
        }
    }

    
    private static class C0077b extends e {
        C0077b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        
        public c b(c cVar) {
            return cVar.f5601c;
        }

        
        public c c(c cVar) {
            return cVar.f5602d;
        }
    }

    
    static class c implements Map.Entry {

        
        final Object f5599a;

        
        final Object f5600b;

        
        c f5601c;

        
        c f5602d;

        c(Object obj, Object obj2) {
            this.f5599a = obj;
            this.f5600b = obj2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f5599a.equals(cVar.f5599a) || !this.f5600b.equals(cVar.f5600b)) {
                return false;
            }
            return true;
        }

        public Object getKey() {
            return this.f5599a;
        }

        public Object getValue() {
            return this.f5600b;
        }

        public int hashCode() {
            return this.f5599a.hashCode() ^ this.f5600b.hashCode();
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f5599a + "=" + this.f5600b;
        }
    }

    
    public class d extends f implements Iterator {

        
        private c f5603a;

        
        private boolean f5604b = true;

        d() {
        }

        
        public void a(c cVar) {
            boolean z2;
            c cVar2 = this.f5603a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f5602d;
                this.f5603a = cVar3;
                if (cVar3 == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f5604b = z2;
            }
        }

        
        public Map.Entry next() {
            c cVar;
            if (this.f5604b) {
                this.f5604b = false;
                cVar = C0254b.this.f5595a;
            } else {
                c cVar2 = this.f5603a;
                if (cVar2 != null) {
                    cVar = cVar2.f5601c;
                } else {
                    cVar = null;
                }
            }
            this.f5603a = cVar;
            return this.f5603a;
        }

        public boolean hasNext() {
            if (!this.f5604b) {
                c cVar = this.f5603a;
                if (cVar == null || cVar.f5601c == null) {
                    return false;
                }
                return true;
            } else if (C0254b.this.f5595a != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    
    private static abstract class e extends f implements Iterator {

        
        c f5606a;

        
        c f5607b;

        e(c cVar, c cVar2) {
            this.f5606a = cVar2;
            this.f5607b = cVar;
        }

        private c e() {
            c cVar = this.f5607b;
            c cVar2 = this.f5606a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        public void a(c cVar) {
            if (this.f5606a == cVar && cVar == this.f5607b) {
                this.f5607b = null;
                this.f5606a = null;
            }
            c cVar2 = this.f5606a;
            if (cVar2 == cVar) {
                this.f5606a = b(cVar2);
            }
            if (this.f5607b == cVar) {
                this.f5607b = e();
            }
        }

        
        public abstract c b(c cVar);

        
        public abstract c c(c cVar);

        
        public Map.Entry next() {
            c cVar = this.f5607b;
            this.f5607b = e();
            return cVar;
        }

        public boolean hasNext() {
            if (this.f5607b != null) {
                return true;
            }
            return false;
        }
    }

    
    public static abstract class f {
        
        public abstract void a(c cVar);
    }

    public Iterator a() {
        C0077b bVar = new C0077b(this.f5596b, this.f5595a);
        this.f5597c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Map.Entry b() {
        return this.f5595a;
    }

    
    public c c(Object obj) {
        c cVar = this.f5595a;
        while (cVar != null && !cVar.f5599a.equals(obj)) {
            cVar = cVar.f5601c;
        }
        return cVar;
    }

    public d d() {
        d dVar = new d();
        this.f5597c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry e() {
        return this.f5596b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0254b)) {
            return false;
        }
        C0254b bVar = (C0254b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    
    public c f(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f5598d++;
        c cVar2 = this.f5596b;
        if (cVar2 == null) {
            this.f5595a = cVar;
        } else {
            cVar2.f5601c = cVar;
            cVar.f5602d = cVar2;
        }
        this.f5596b = cVar;
        return cVar;
    }

    public Object g(Object obj, Object obj2) {
        c c2 = c(obj);
        if (c2 != null) {
            return c2.f5600b;
        }
        f(obj, obj2);
        return null;
    }

    public Object h(Object obj) {
        c c2 = c(obj);
        if (c2 == null) {
            return null;
        }
        this.f5598d--;
        if (!this.f5597c.isEmpty()) {
            for (f a2 : this.f5597c.keySet()) {
                a2.a(c2);
            }
        }
        c cVar = c2.f5602d;
        c cVar2 = c2.f5601c;
        if (cVar != null) {
            cVar.f5601c = cVar2;
        } else {
            this.f5595a = cVar2;
        }
        c cVar3 = c2.f5601c;
        if (cVar3 != null) {
            cVar3.f5602d = cVar;
        } else {
            this.f5596b = cVar;
        }
        c2.f5601c = null;
        c2.f5602d = null;
        return c2.f5600b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((Map.Entry) it.next()).hashCode();
        }
        return i2;
    }

    public Iterator iterator() {
        a aVar = new a(this.f5595a, this.f5596b);
        this.f5597c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f5598d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
