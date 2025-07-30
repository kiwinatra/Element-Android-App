package p0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class v implements ListIterator {

    /* renamed from: a  reason: collision with root package name */
    public static final v f6094a = new v();

    private v() {
    }

    /* renamed from: a */
    public Void next() {
        throw new NoSuchElementException();
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public Void previous() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
