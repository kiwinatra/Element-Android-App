package p0;

import java.util.Collection;
import w0.i;

abstract class n extends m {
    public static int f(Iterable iterable, int i2) {
        i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i2;
    }
}
