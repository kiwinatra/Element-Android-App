package p0;

import java.util.List;
import w0.i;

abstract class m extends l {
    public static List b() {
        return w.f6095a;
    }

    public static final int c(List list) {
        i.e(list, "<this>");
        return list.size() - 1;
    }

    public static List d(Object... objArr) {
        i.e(objArr, "elements");
        if (objArr.length > 0) {
            return C0274h.b(objArr);
        }
        return k.b();
    }

    public static void e() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
