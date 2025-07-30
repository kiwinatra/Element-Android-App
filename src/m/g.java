package m;

class g implements C0261f {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f5856a;

    /* renamed from: b  reason: collision with root package name */
    private int f5857b;

    g(int i2) {
        if (i2 > 0) {
            this.f5856a = new Object[i2];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public boolean a(Object obj) {
        int i2 = this.f5857b;
        Object[] objArr = this.f5856a;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = obj;
        this.f5857b = i2 + 1;
        return true;
    }

    public Object b() {
        int i2 = this.f5857b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f5856a;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f5857b = i2 - 1;
        return obj;
    }

    public void c(Object[] objArr, int i2) {
        if (i2 > objArr.length) {
            i2 = objArr.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            int i4 = this.f5857b;
            Object[] objArr2 = this.f5856a;
            if (i4 < objArr2.length) {
                objArr2[i4] = obj;
                this.f5857b = i4 + 1;
            }
        }
    }
}
