package p0;

import java.lang.reflect.Array;
import w0.i;

/* renamed from: p0.f  reason: case insensitive filesystem */
abstract class C0272f {
    public static final Object[] a(Object[] objArr, int i2) {
        i.e(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
        i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }
}
