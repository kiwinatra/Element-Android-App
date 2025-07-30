package p0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import w0.i;

/* renamed from: p0.i  reason: case insensitive filesystem */
abstract class C0275i extends C0274h {
    public static List f(Object[] objArr) {
        i.e(objArr, "<this>");
        return (List) g(objArr, new ArrayList());
    }

    public static final Collection g(Object[] objArr, Collection collection) {
        i.e(objArr, "<this>");
        i.e(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static final int h(Object[] objArr) {
        i.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static char i(char[] cArr) {
        i.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }
}
