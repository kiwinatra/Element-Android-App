package p0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import w0.i;

final class x implements Map, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final x f6096a = new x();

    private x() {
    }

    public boolean a(Void voidR) {
        i.e(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    public Set c() {
        return y.f6097a;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return a((Void) obj);
    }

    public Set d() {
        return y.f6097a;
    }

    public int e() {
        return 0;
    }

    public final /* bridge */ Set entrySet() {
        return c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public Collection f() {
        return w.f6095a;
    }

    /* renamed from: g */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set keySet() {
        return d();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return e();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return f();
    }
}
