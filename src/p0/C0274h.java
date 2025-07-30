package p0;

import java.util.Arrays;
import java.util.List;
import w0.i;

/* renamed from: p0.h  reason: case insensitive filesystem */
abstract class C0274h extends C0273g {
    public static final List b(Object[] objArr) {
        i.e(objArr, "<this>");
        List a2 = C0276j.a(objArr);
        i.d(a2, "asList(this)");
        return a2;
    }

    public static final Object[] c(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        i.e(objArr, "<this>");
        i.e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
        return objArr2;
    }

    public static /* synthetic */ Object[] d(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        return c(objArr, objArr2, i2, i3, i4);
    }

    public static final void e(Object[] objArr, Object obj, int i2, int i3) {
        i.e(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, obj);
    }
}
