package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b implements Collection, Set {

    
    private static final int[] f5746e = new int[0];

    
    private static final Object[] f5747f = new Object[0];

    
    private static Object[] f5748g;

    
    private static int f5749h;

    
    private static Object[] f5750i;

    
    private static int f5751j;

    
    private int[] f5752a;

    
    Object[] f5753b;

    
    int f5754c;

    
    private f f5755d;

    class a extends f {
        a() {
        }

        
        public void a() {
            b.this.clear();
        }

        
        public Object b(int i2, int i3) {
            return b.this.f5753b[i2];
        }

        
        public Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        
        public int d() {
            return b.this.f5754c;
        }

        
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        
        public void g(Object obj, Object obj2) {
            b.this.add(obj);
        }

        
        public void h(int i2) {
            b.this.g(i2);
        }

        
        public Object i(int i2, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                try {
                    Object[] objArr = f5750i;
                    if (objArr != null) {
                        this.f5753b = objArr;
                        f5750i = (Object[]) objArr[0];
                        this.f5752a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f5751j--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                try {
                    Object[] objArr2 = f5748g;
                    if (objArr2 != null) {
                        this.f5753b = objArr2;
                        f5748g = (Object[]) objArr2[0];
                        this.f5752a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f5749h--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f5752a = new int[i2];
        this.f5753b = new Object[i2];
    }

    private static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                try {
                    if (f5751j < 10) {
                        objArr[0] = f5750i;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f5750i = objArr;
                        f5751j++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                try {
                    if (f5749h < 10) {
                        objArr[0] = f5748g;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f5748g = objArr;
                        f5749h++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private f d() {
        if (this.f5755d == null) {
            this.f5755d = new a();
        }
        return this.f5755d;
    }

    private int e(Object obj, int i2) {
        int i3 = this.f5754c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.f5752a, i3, i2);
        if (a2 < 0 || obj.equals(this.f5753b[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f5752a[i4] == i2) {
            if (obj.equals(this.f5753b[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f5752a[i5] == i2) {
            if (obj.equals(this.f5753b[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    private int f() {
        int i2 = this.f5754c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.f5752a, i2, 0);
        if (a2 < 0 || this.f5753b[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f5752a[i3] == 0) {
            if (this.f5753b[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f5752a[i4] == 0) {
            if (this.f5753b[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean add(Object obj) {
        int i2;
        int i3;
        if (obj == null) {
            i3 = f();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            i3 = e(obj, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f5754c;
        int[] iArr = this.f5752a;
        if (i5 >= iArr.length) {
            int i6 = 8;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f5753b;
            a(i6);
            int[] iArr2 = this.f5752a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f5753b, 0, objArr.length);
            }
            c(iArr, objArr, this.f5754c);
        }
        int i7 = this.f5754c;
        if (i4 < i7) {
            int[] iArr3 = this.f5752a;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f5753b;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f5754c - i4);
        }
        this.f5752a[i4] = i2;
        this.f5753b[i4] = obj;
        this.f5754c++;
        return true;
    }

    public boolean addAll(Collection collection) {
        b(this.f5754c + collection.size());
        boolean z2 = false;
        for (Object add : collection) {
            z2 |= add(add);
        }
        return z2;
    }

    public void b(int i2) {
        int[] iArr = this.f5752a;
        if (iArr.length < i2) {
            Object[] objArr = this.f5753b;
            a(i2);
            int i3 = this.f5754c;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f5752a, 0, i3);
                System.arraycopy(objArr, 0, this.f5753b, 0, this.f5754c);
            }
            c(iArr, objArr, this.f5754c);
        }
    }

    public void clear() {
        int i2 = this.f5754c;
        if (i2 != 0) {
            c(this.f5752a, this.f5753b, i2);
            this.f5752a = f5746e;
            this.f5753b = f5747f;
            this.f5754c = 0;
        }
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f5754c) {
                try {
                    if (!set.contains(h(i2))) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public Object g(int i2) {
        Object[] objArr = this.f5753b;
        Object obj = objArr[i2];
        int i3 = this.f5754c;
        if (i3 <= 1) {
            c(this.f5752a, objArr, i3);
            this.f5752a = f5746e;
            this.f5753b = f5747f;
            this.f5754c = 0;
        } else {
            int[] iArr = this.f5752a;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.f5754c = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr2 = this.f5753b;
                    System.arraycopy(objArr2, i6, objArr2, i2, this.f5754c - i2);
                }
                this.f5753b[this.f5754c] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                a(i4);
                this.f5754c--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f5752a, 0, i2);
                    System.arraycopy(objArr, 0, this.f5753b, 0, i2);
                }
                int i7 = this.f5754c;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.f5752a, i2, i7 - i2);
                    System.arraycopy(objArr, i8, this.f5753b, i2, this.f5754c - i2);
                }
            }
        }
        return obj;
    }

    public Object h(int i2) {
        return this.f5753b[i2];
    }

    public int hashCode() {
        int[] iArr = this.f5752a;
        int i2 = this.f5754c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return f();
        }
        return e(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        if (this.f5754c <= 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return d().m().iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        g(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        boolean z2 = false;
        for (Object remove : collection) {
            z2 |= remove(remove);
        }
        return z2;
    }

    public boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i2 = this.f5754c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f5753b[i2])) {
                g(i2);
                z2 = true;
            }
        }
        return z2;
    }

    public int size() {
        return this.f5754c;
    }

    public Object[] toArray() {
        int i2 = this.f5754c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f5753b, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5754c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5754c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f5752a = f5746e;
            this.f5753b = f5747f;
        } else {
            a(i2);
        }
        this.f5754c = 0;
    }

    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f5754c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f5754c);
        }
        System.arraycopy(this.f5753b, 0, objArr, 0, this.f5754c);
        int length = objArr.length;
        int i2 = this.f5754c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
