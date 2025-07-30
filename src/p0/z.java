package p0;

import java.util.Iterator;

public abstract class z implements Iterator {
    public abstract int a();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
