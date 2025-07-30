package p0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import w0.d;
import w0.i;

public final class y implements Set, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final y f6097a = new y();

    private y() {
    }

    public boolean a(Void voidR) {
        i.e(voidR, "element");
        return false;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return a((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        i.e(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Set) || !((Set) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return v.f6094a;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return b();
    }

    public Object[] toArray() {
        return d.a(this);
    }

    public String toString() {
        return "[]";
    }

    public Object[] toArray(Object[] objArr) {
        i.e(objArr, "array");
        return d.b(this, objArr);
    }
}
