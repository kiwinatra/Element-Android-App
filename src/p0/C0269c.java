package p0;

import java.util.AbstractList;
import java.util.List;

/* renamed from: p0.c  reason: case insensitive filesystem */
public abstract class C0269c extends AbstractList implements List {
    protected C0269c() {
    }

    public abstract int a();

    public abstract Object b(int i2);

    public final /* bridge */ Object remove(int i2) {
        return b(i2);
    }

    public final /* bridge */ int size() {
        return a();
    }
}
