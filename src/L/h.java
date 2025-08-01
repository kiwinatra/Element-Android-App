package l;

public class h implements Cloneable {

    
    private static final Object f5795e = new Object();

    
    private boolean f5796a;

    
    private int[] f5797b;

    
    private Object[] f5798c;

    
    private int f5799d;

    public h() {
        this(10);
    }

    private void d() {
        int i2 = this.f5799d;
        int[] iArr = this.f5797b;
        Object[] objArr = this.f5798c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f5795e) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f5796a = false;
        this.f5799d = i3;
    }

    public void a(int i2, Object obj) {
        int i3 = this.f5799d;
        if (i3 == 0 || i2 > this.f5797b[i3 - 1]) {
            if (this.f5796a && i3 >= this.f5797b.length) {
                d();
            }
            int i4 = this.f5799d;
            if (i4 >= this.f5797b.length) {
                int e2 = c.e(i4 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f5797b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f5798c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f5797b = iArr;
                this.f5798c = objArr;
            }
            this.f5797b[i4] = i2;
            this.f5798c[i4] = obj;
            this.f5799d = i4 + 1;
            return;
        }
        i(i2, obj);
    }

    public void b() {
        int i2 = this.f5799d;
        Object[] objArr = this.f5798c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f5799d = 0;
        this.f5796a = false;
    }

    
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.f5797b = (int[]) this.f5797b.clone();
            hVar.f5798c = (Object[]) this.f5798c.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public Object e(int i2) {
        return f(i2, (Object) null);
    }

    public Object f(int i2, Object obj) {
        Object obj2;
        int a2 = c.a(this.f5797b, this.f5799d, i2);
        if (a2 < 0 || (obj2 = this.f5798c[a2]) == f5795e) {
            return obj;
        }
        return obj2;
    }

    public int g(Object obj) {
        if (this.f5796a) {
            d();
        }
        for (int i2 = 0; i2 < this.f5799d; i2++) {
            if (this.f5798c[i2] == obj) {
                return i2;
            }
        }
        return -1;
    }

    public int h(int i2) {
        if (this.f5796a) {
            d();
        }
        return this.f5797b[i2];
    }

    public void i(int i2, Object obj) {
        int a2 = c.a(this.f5797b, this.f5799d, i2);
        if (a2 >= 0) {
            this.f5798c[a2] = obj;
            return;
        }
        int i3 = ~a2;
        int i4 = this.f5799d;
        if (i3 < i4) {
            Object[] objArr = this.f5798c;
            if (objArr[i3] == f5795e) {
                this.f5797b[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f5796a && i4 >= this.f5797b.length) {
            d();
            i3 = ~c.a(this.f5797b, this.f5799d, i2);
        }
        int i5 = this.f5799d;
        if (i5 >= this.f5797b.length) {
            int e2 = c.e(i5 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f5797b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f5798c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5797b = iArr;
            this.f5798c = objArr2;
        }
        int i6 = this.f5799d;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f5797b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f5798c;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f5799d - i3);
        }
        this.f5797b[i3] = i2;
        this.f5798c[i3] = obj;
        this.f5799d++;
    }

    public int j() {
        if (this.f5796a) {
            d();
        }
        return this.f5799d;
    }

    public Object k(int i2) {
        if (this.f5796a) {
            d();
        }
        return this.f5798c[i2];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5799d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f5799d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(h(i2));
            sb.append('=');
            Object k2 = k(i2);
            if (k2 != this) {
                sb.append(k2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public h(int i2) {
        this.f5796a = false;
        if (i2 == 0) {
            this.f5797b = c.f5757a;
            this.f5798c = c.f5759c;
            return;
        }
        int e2 = c.e(i2);
        this.f5797b = new int[e2];
        this.f5798c = new Object[e2];
    }
}
