package l;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class g {

    
    static Object[] f5788d;

    
    static int f5789e;

    
    static Object[] f5790f;

    
    static int f5791g;

    
    int[] f5792a;

    
    Object[] f5793b;

    
    int f5794c;

    public g() {
        this.f5792a = c.f5757a;
        this.f5793b = c.f5759c;
        this.f5794c = 0;
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (g.class) {
                try {
                    Object[] objArr = f5790f;
                    if (objArr != null) {
                        this.f5793b = objArr;
                        f5790f = (Object[]) objArr[0];
                        this.f5792a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f5791g--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i2 == 4) {
            synchronized (g.class) {
                try {
                    Object[] objArr2 = f5788d;
                    if (objArr2 != null) {
                        this.f5793b = objArr2;
                        f5788d = (Object[]) objArr2[0];
                        this.f5792a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f5789e--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f5792a = new int[i2];
        this.f5793b = new Object[(i2 << 1)];
    }

    private static int b(int[] iArr, int i2, int i3) {
        try {
            return c.a(iArr, i2, i3);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                try {
                    if (f5791g < 10) {
                        objArr[0] = f5790f;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f5790f = objArr;
                        f5791g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                try {
                    if (f5789e < 10) {
                        objArr[0] = f5788d;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f5788d = objArr;
                        f5789e++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void c(int i2) {
        int i3 = this.f5794c;
        int[] iArr = this.f5792a;
        if (iArr.length < i2) {
            Object[] objArr = this.f5793b;
            a(i2);
            if (this.f5794c > 0) {
                System.arraycopy(iArr, 0, this.f5792a, 0, i3);
                System.arraycopy(objArr, 0, this.f5793b, 0, i3 << 1);
            }
            d(iArr, objArr, i3);
        }
        if (this.f5794c != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f5794c;
        if (i2 > 0) {
            int[] iArr = this.f5792a;
            Object[] objArr = this.f5793b;
            this.f5792a = c.f5757a;
            this.f5793b = c.f5759c;
            this.f5794c = 0;
            d(iArr, objArr, i2);
        }
        if (this.f5794c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    
    public int e(Object obj, int i2) {
        int i3 = this.f5794c;
        if (i3 == 0) {
            return -1;
        }
        int b2 = b(this.f5792a, i3, i2);
        if (b2 < 0 || obj.equals(this.f5793b[b2 << 1])) {
            return b2;
        }
        int i4 = b2 + 1;
        while (i4 < i3 && this.f5792a[i4] == i2) {
            if (obj.equals(this.f5793b[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        int i5 = b2 - 1;
        while (i5 >= 0 && this.f5792a[i5] == i2) {
            if (obj.equals(this.f5793b[i5 << 1])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f5794c) {
                try {
                    Object i3 = i(i2);
                    Object m2 = m(i2);
                    Object obj2 = gVar.get(i3);
                    if (m2 == null) {
                        if (obj2 != null || !gVar.containsKey(i3)) {
                            return false;
                        }
                    } else if (!m2.equals(obj2)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i4 = 0;
            while (i4 < this.f5794c) {
                try {
                    Object i5 = i(i4);
                    Object m3 = m(i4);
                    Object obj3 = map.get(i5);
                    if (m3 == null) {
                        if (obj3 != null || !map.containsKey(i5)) {
                            return false;
                        }
                    } else if (!m3.equals(obj3)) {
                        return false;
                    }
                    i4++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        if (obj == null) {
            return g();
        }
        return e(obj, obj.hashCode());
    }

    
    public int g() {
        int i2 = this.f5794c;
        if (i2 == 0) {
            return -1;
        }
        int b2 = b(this.f5792a, i2, 0);
        if (b2 < 0 || this.f5793b[b2 << 1] == null) {
            return b2;
        }
        int i3 = b2 + 1;
        while (i3 < i2 && this.f5792a[i3] == 0) {
            if (this.f5793b[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = b2 - 1;
        while (i4 >= 0 && this.f5792a[i4] == 0) {
            if (this.f5793b[i4 << 1] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return this.f5793b[(f2 << 1) + 1];
        }
        return obj2;
    }

    
    public int h(Object obj) {
        int i2 = this.f5794c * 2;
        Object[] objArr = this.f5793b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i2;
        int[] iArr = this.f5792a;
        Object[] objArr = this.f5793b;
        int i3 = this.f5794c;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            int i7 = iArr[i5];
            if (obj == null) {
                i2 = 0;
            } else {
                i2 = obj.hashCode();
            }
            i6 += i2 ^ i7;
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public Object i(int i2) {
        return this.f5793b[i2 << 1];
    }

    public boolean isEmpty() {
        if (this.f5794c <= 0) {
            return true;
        }
        return false;
    }

    public void j(g gVar) {
        int i2 = gVar.f5794c;
        c(this.f5794c + i2);
        if (this.f5794c != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(gVar.i(i3), gVar.m(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(gVar.f5792a, 0, this.f5792a, 0, i2);
            System.arraycopy(gVar.f5793b, 0, this.f5793b, 0, i2 << 1);
            this.f5794c = i2;
        }
    }

    public Object k(int i2) {
        Object[] objArr = this.f5793b;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f5794c;
        int i5 = 0;
        if (i4 <= 1) {
            d(this.f5792a, objArr, i4);
            this.f5792a = c.f5757a;
            this.f5793b = c.f5759c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f5792a;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, iArr, i2, i9);
                    Object[] objArr2 = this.f5793b;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i3, i9 << 1);
                }
                Object[] objArr3 = this.f5793b;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                a(i7);
                if (i4 == this.f5794c) {
                    if (i2 > 0) {
                        System.arraycopy(iArr, 0, this.f5792a, 0, i2);
                        System.arraycopy(objArr, 0, this.f5793b, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr, i11, this.f5792a, i2, i12);
                        System.arraycopy(objArr, i11 << 1, this.f5793b, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.f5794c) {
            this.f5794c = i5;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public Object l(int i2, Object obj) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f5793b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public Object m(int i2) {
        return this.f5793b[(i2 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i2;
        int i3;
        int i4 = this.f5794c;
        if (obj == null) {
            i3 = g();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            i3 = e(obj, hashCode);
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            Object[] objArr = this.f5793b;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~i3;
        int[] iArr = this.f5792a;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            Object[] objArr2 = this.f5793b;
            a(i7);
            if (i4 == this.f5794c) {
                int[] iArr2 = this.f5792a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f5793b, 0, objArr2.length);
                }
                d(iArr, objArr2, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.f5792a;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.f5793b;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f5794c - i6) << 1);
        }
        int i9 = this.f5794c;
        if (i4 == i9) {
            int[] iArr4 = this.f5792a;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr4 = this.f5793b;
                int i10 = i6 << 1;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.f5794c = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return k(f2);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 >= 0) {
            return l(f2, obj2);
        }
        return null;
    }

    public int size() {
        return this.f5794c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5794c * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5794c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object i3 = i(i2);
            if (i3 != this) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m2 = m(i2);
            if (m2 != this) {
                sb.append(m2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public g(int i2) {
        if (i2 == 0) {
            this.f5792a = c.f5757a;
            this.f5793b = c.f5759c;
        } else {
            a(i2);
        }
        this.f5794c = 0;
    }

    public boolean remove(Object obj, Object obj2) {
        int f2 = f(obj);
        if (f2 < 0) {
            return false;
        }
        Object m2 = m(f2);
        if (obj2 != m2 && (obj2 == null || !obj2.equals(m2))) {
            return false;
        }
        k(f2);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int f2 = f(obj);
        if (f2 < 0) {
            return false;
        }
        Object m2 = m(f2);
        if (m2 != obj2 && (obj2 == null || !obj2.equals(m2))) {
            return false;
        }
        l(f2, obj3);
        return true;
    }

    public g(g gVar) {
        this();
        if (gVar != null) {
            j(gVar);
        }
    }
}
