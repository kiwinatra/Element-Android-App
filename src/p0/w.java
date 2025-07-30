package p0;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import w0.d;
import w0.i;

public final class w implements List, Serializable, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public static final w f6095a = new w();

    private w() {
    }

    public boolean a(Void voidR) {
        i.e(voidR, "element");
        return false;
    }

    public /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public Void get(int i2) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i2 + '.');
    }

    public int c() {
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

    public int d(Void voidR) {
        i.e(voidR, "element");
        return -1;
    }

    public int e(Void voidR) {
        i.e(voidR, "element");
        return -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof List) || !((List) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return d((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return v.f6094a;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return e((Void) obj);
    }

    public ListIterator listIterator() {
        return v.f6094a;
    }

    public /* bridge */ /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return c();
    }

    public List subList(int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3);
    }

    public Object[] toArray() {
        return d.a(this);
    }

    public String toString() {
        return "[]";
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i2) {
        if (i2 == 0) {
            return v.f6094a;
        }
        throw new IndexOutOfBoundsException("Index: " + i2);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        i.e(objArr, "array");
        return d.b(this, objArr);
    }
}
