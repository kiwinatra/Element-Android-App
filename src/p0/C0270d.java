package p0;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import w0.e;
import w0.i;
import z0.d;

/* renamed from: p0.d  reason: case insensitive filesystem */
public final class C0270d extends C0269c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f6089d = new a((e) null);

    /* renamed from: e  reason: collision with root package name */
    private static final Object[] f6090e = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    private int f6091a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f6092b = f6090e;

    /* renamed from: c  reason: collision with root package name */
    private int f6093c;

    /* renamed from: p0.d$a */
    public static final class a {
        private a() {
        }

        public final int a(int i2, int i3) {
            int i4 = i2 + (i2 >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 <= 0) {
                return i4;
            }
            if (i3 > 2147483639) {
                return Integer.MAX_VALUE;
            }
            return 2147483639;
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }

    private final void e(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f6092b.length;
        while (i2 < length && it.hasNext()) {
            this.f6092b[i2] = it.next();
            i2++;
        }
        int i3 = this.f6091a;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f6092b[i4] = it.next();
        }
        this.f6093c = size() + collection.size();
    }

    private final void f(int i2) {
        Object[] objArr = new Object[i2];
        Object[] objArr2 = this.f6092b;
        C0274h.c(objArr2, objArr, 0, this.f6091a, objArr2.length);
        Object[] objArr3 = this.f6092b;
        int length = objArr3.length;
        int i3 = this.f6091a;
        C0274h.c(objArr3, objArr, length - i3, 0, i3);
        this.f6091a = 0;
        this.f6092b = objArr;
    }

    private final int g(int i2) {
        if (i2 == 0) {
            return C0275i.h(this.f6092b);
        }
        return i2 - 1;
    }

    private final void h(int i2) {
        if (i2 >= 0) {
            Object[] objArr = this.f6092b;
            if (i2 > objArr.length) {
                if (objArr == f6090e) {
                    this.f6092b = new Object[d.a(i2, 10)];
                } else {
                    f(f6089d.a(objArr.length, i2));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    private final int i(int i2) {
        if (i2 == C0275i.h(this.f6092b)) {
            return 0;
        }
        return i2 + 1;
    }

    private final int j(int i2) {
        if (i2 < 0) {
            return i2 + this.f6092b.length;
        }
        return i2;
    }

    private final int k(int i2) {
        Object[] objArr = this.f6092b;
        if (i2 >= objArr.length) {
            return i2 - objArr.length;
        }
        return i2;
    }

    public int a() {
        return this.f6093c;
    }

    public void add(int i2, Object obj) {
        C0268b.f6088a.b(i2, size());
        if (i2 == size()) {
            d(obj);
        } else if (i2 == 0) {
            c(obj);
        } else {
            h(size() + 1);
            int k2 = k(this.f6091a + i2);
            if (i2 < ((size() + 1) >> 1)) {
                int g2 = g(k2);
                int g3 = g(this.f6091a);
                int i3 = this.f6091a;
                if (g2 >= i3) {
                    Object[] objArr = this.f6092b;
                    objArr[g3] = objArr[i3];
                    C0274h.c(objArr, objArr, i3, i3 + 1, g2 + 1);
                } else {
                    Object[] objArr2 = this.f6092b;
                    C0274h.c(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                    Object[] objArr3 = this.f6092b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C0274h.c(objArr3, objArr3, 0, 1, g2 + 1);
                }
                this.f6092b[g2] = obj;
                this.f6091a = g3;
            } else {
                int k3 = k(this.f6091a + size());
                Object[] objArr4 = this.f6092b;
                if (k2 < k3) {
                    C0274h.c(objArr4, objArr4, k2 + 1, k2, k3);
                } else {
                    C0274h.c(objArr4, objArr4, 1, 0, k3);
                    Object[] objArr5 = this.f6092b;
                    objArr5[0] = objArr5[objArr5.length - 1];
                    C0274h.c(objArr5, objArr5, k2 + 1, k2, objArr5.length - 1);
                }
                this.f6092b[k2] = obj;
            }
            this.f6093c = size() + 1;
        }
    }

    public boolean addAll(int i2, Collection collection) {
        i.e(collection, "elements");
        C0268b.f6088a.b(i2, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == size()) {
            return addAll(collection);
        }
        h(size() + collection.size());
        int k2 = k(this.f6091a + size());
        int k3 = k(this.f6091a + i2);
        int size = collection.size();
        if (i2 < ((size() + 1) >> 1)) {
            int i3 = this.f6091a;
            int i4 = i3 - size;
            if (k3 < i3) {
                Object[] objArr = this.f6092b;
                C0274h.c(objArr, objArr, i4, i3, objArr.length);
                Object[] objArr2 = this.f6092b;
                if (size >= k3) {
                    C0274h.c(objArr2, objArr2, objArr2.length - size, 0, k3);
                } else {
                    C0274h.c(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f6092b;
                    C0274h.c(objArr3, objArr3, 0, size, k3);
                }
            } else if (i4 >= 0) {
                Object[] objArr4 = this.f6092b;
                C0274h.c(objArr4, objArr4, i4, i3, k3);
            } else {
                Object[] objArr5 = this.f6092b;
                i4 += objArr5.length;
                int i5 = k3 - i3;
                int length = objArr5.length - i4;
                if (length >= i5) {
                    C0274h.c(objArr5, objArr5, i4, i3, k3);
                } else {
                    C0274h.c(objArr5, objArr5, i4, i3, i3 + length);
                    Object[] objArr6 = this.f6092b;
                    C0274h.c(objArr6, objArr6, 0, this.f6091a + length, k3);
                }
            }
            this.f6091a = i4;
            e(j(k3 - size), collection);
        } else {
            int i6 = k3 + size;
            if (k3 < k2) {
                int i7 = size + k2;
                Object[] objArr7 = this.f6092b;
                if (i7 > objArr7.length) {
                    if (i6 >= objArr7.length) {
                        i6 -= objArr7.length;
                    } else {
                        int length2 = k2 - (i7 - objArr7.length);
                        C0274h.c(objArr7, objArr7, 0, length2, k2);
                        Object[] objArr8 = this.f6092b;
                        C0274h.c(objArr8, objArr8, i6, k3, length2);
                    }
                }
                C0274h.c(objArr7, objArr7, i6, k3, k2);
            } else {
                Object[] objArr9 = this.f6092b;
                C0274h.c(objArr9, objArr9, size, 0, k2);
                Object[] objArr10 = this.f6092b;
                if (i6 >= objArr10.length) {
                    C0274h.c(objArr10, objArr10, i6 - objArr10.length, k3, objArr10.length);
                } else {
                    C0274h.c(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f6092b;
                    C0274h.c(objArr11, objArr11, i6, k3, objArr11.length - size);
                }
            }
            e(k3, collection);
        }
        return true;
    }

    public Object b(int i2) {
        C0268b.f6088a.a(i2, size());
        if (i2 == m.c(this)) {
            return m();
        }
        if (i2 == 0) {
            return l();
        }
        int k2 = k(this.f6091a + i2);
        Object obj = this.f6092b[k2];
        if (i2 < (size() >> 1)) {
            int i3 = this.f6091a;
            if (k2 >= i3) {
                Object[] objArr = this.f6092b;
                C0274h.c(objArr, objArr, i3 + 1, i3, k2);
            } else {
                Object[] objArr2 = this.f6092b;
                C0274h.c(objArr2, objArr2, 1, 0, k2);
                Object[] objArr3 = this.f6092b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i4 = this.f6091a;
                C0274h.c(objArr3, objArr3, i4 + 1, i4, objArr3.length - 1);
            }
            Object[] objArr4 = this.f6092b;
            int i5 = this.f6091a;
            objArr4[i5] = null;
            this.f6091a = i(i5);
        } else {
            int k3 = k(this.f6091a + m.c(this));
            Object[] objArr5 = this.f6092b;
            if (k2 <= k3) {
                C0274h.c(objArr5, objArr5, k2, k2 + 1, k3 + 1);
            } else {
                C0274h.c(objArr5, objArr5, k2, k2 + 1, objArr5.length);
                Object[] objArr6 = this.f6092b;
                objArr6[objArr6.length - 1] = objArr6[0];
                C0274h.c(objArr6, objArr6, 0, 1, k3 + 1);
            }
            this.f6092b[k3] = null;
        }
        this.f6093c = size() - 1;
        return obj;
    }

    public final void c(Object obj) {
        h(size() + 1);
        int g2 = g(this.f6091a);
        this.f6091a = g2;
        this.f6092b[g2] = obj;
        this.f6093c = size() + 1;
    }

    public void clear() {
        int k2 = k(this.f6091a + size());
        int i2 = this.f6091a;
        if (i2 < k2) {
            C0274h.e(this.f6092b, (Object) null, i2, k2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f6092b;
            C0274h.e(objArr, (Object) null, this.f6091a, objArr.length);
            C0274h.e(this.f6092b, (Object) null, 0, k2);
        }
        this.f6091a = 0;
        this.f6093c = 0;
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(Object obj) {
        h(size() + 1);
        this.f6092b[k(this.f6091a + size())] = obj;
        this.f6093c = size() + 1;
    }

    public Object get(int i2) {
        C0268b.f6088a.a(i2, size());
        return this.f6092b[k(this.f6091a + i2)];
    }

    public int indexOf(Object obj) {
        int k2 = k(this.f6091a + size());
        int i2 = this.f6091a;
        if (i2 < k2) {
            while (i2 < k2) {
                if (!i.a(obj, this.f6092b[i2])) {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < k2) {
            return -1;
        } else {
            int length = this.f6092b.length;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (i3 < k2) {
                        if (i.a(obj, this.f6092b[i3])) {
                            i2 = i3 + this.f6092b.length;
                        } else {
                            i3++;
                        }
                    }
                    return -1;
                } else if (i.a(obj, this.f6092b[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - this.f6091a;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object l() {
        if (!isEmpty()) {
            Object[] objArr = this.f6092b;
            int i2 = this.f6091a;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.f6091a = i(i2);
            this.f6093c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public int lastIndexOf(Object obj) {
        int i2;
        int k2 = k(this.f6091a + size());
        int i3 = this.f6091a;
        if (i3 < k2) {
            i2 = k2 - 1;
            if (i3 <= i2) {
                while (!i.a(obj, this.f6092b[i2])) {
                    if (i2 != i3) {
                        i2--;
                    }
                }
            }
            return -1;
        }
        if (i3 > k2) {
            int i4 = k2 - 1;
            while (true) {
                if (-1 >= i4) {
                    int h2 = C0275i.h(this.f6092b);
                    int i5 = this.f6091a;
                    if (i5 <= h2) {
                        while (!i.a(obj, this.f6092b[i2])) {
                            if (i2 != i5) {
                                h2 = i2 - 1;
                            }
                        }
                    }
                } else if (i.a(obj, this.f6092b[i4])) {
                    i2 = i4 + this.f6092b.length;
                    break;
                } else {
                    i4--;
                }
            }
        }
        return -1;
        return i2 - this.f6091a;
    }

    public final Object m() {
        if (!isEmpty()) {
            int k2 = k(this.f6091a + m.c(this));
            Object[] objArr = this.f6092b;
            Object obj = objArr[k2];
            objArr[k2] = null;
            this.f6093c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            w0.i.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Object[] r0 = r11.f6092b
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0091
        L_0x0013:
            int r0 = r11.f6091a
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.k(r0)
            int r2 = r11.f6091a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0044
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003e
            java.lang.Object[] r6 = r11.f6092b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x003a
            java.lang.Object[] r7 = r11.f6092b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003b
        L_0x003a:
            r1 = 1
        L_0x003b:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003e:
            java.lang.Object[] r12 = r11.f6092b
            p0.C0274h.e(r12, r3, r5, r0)
            goto L_0x0086
        L_0x0044:
            java.lang.Object[] r5 = r11.f6092b
            int r5 = r5.length
            r6 = r2
            r7 = 0
        L_0x0049:
            if (r2 >= r5) goto L_0x0064
            java.lang.Object[] r8 = r11.f6092b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x0060
            java.lang.Object[] r8 = r11.f6092b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0061
        L_0x0060:
            r7 = 1
        L_0x0061:
            int r2 = r2 + 1
            goto L_0x0049
        L_0x0064:
            int r2 = r11.k(r6)
            r5 = r2
        L_0x0069:
            if (r1 >= r0) goto L_0x0085
            java.lang.Object[] r2 = r11.f6092b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0081
            java.lang.Object[] r2 = r11.f6092b
            r2[r5] = r6
            int r5 = r11.i(r5)
            goto L_0x0082
        L_0x0081:
            r7 = 1
        L_0x0082:
            int r1 = r1 + 1
            goto L_0x0069
        L_0x0085:
            r1 = r7
        L_0x0086:
            if (r1 == 0) goto L_0x0091
            int r12 = r11.f6091a
            int r5 = r5 - r12
            int r12 = r11.j(r5)
            r11.f6093c = r12
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C0270d.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            w0.i.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x008e
            java.lang.Object[] r0 = r11.f6092b
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x008e
        L_0x0013:
            int r0 = r11.f6091a
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.k(r0)
            int r2 = r11.f6091a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0043
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003d
            java.lang.Object[] r6 = r11.f6092b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0039
            java.lang.Object[] r7 = r11.f6092b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003d:
            java.lang.Object[] r12 = r11.f6092b
            p0.C0274h.e(r12, r3, r5, r0)
            goto L_0x0083
        L_0x0043:
            java.lang.Object[] r5 = r11.f6092b
            int r5 = r5.length
            r6 = r2
            r7 = 0
        L_0x0048:
            if (r2 >= r5) goto L_0x0062
            java.lang.Object[] r8 = r11.f6092b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x005e
            java.lang.Object[] r8 = r11.f6092b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005f
        L_0x005e:
            r7 = 1
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0062:
            int r2 = r11.k(r6)
            r5 = r2
        L_0x0067:
            if (r1 >= r0) goto L_0x0082
            java.lang.Object[] r2 = r11.f6092b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x007e
            java.lang.Object[] r2 = r11.f6092b
            r2[r5] = r6
            int r5 = r11.i(r5)
            goto L_0x007f
        L_0x007e:
            r7 = 1
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0082:
            r1 = r7
        L_0x0083:
            if (r1 == 0) goto L_0x008e
            int r12 = r11.f6091a
            int r5 = r5 - r12
            int r12 = r11.j(r5)
            r11.f6093c = r12
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C0270d.retainAll(java.util.Collection):boolean");
    }

    public Object set(int i2, Object obj) {
        C0268b.f6088a.a(i2, size());
        int k2 = k(this.f6091a + i2);
        Object[] objArr = this.f6092b;
        Object obj2 = objArr[k2];
        objArr[k2] = obj;
        return obj2;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public boolean add(Object obj) {
        d(obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        h(size() + collection.size());
        e(k(this.f6091a + size()), collection);
        return true;
    }

    public Object[] toArray(Object[] objArr) {
        i.e(objArr, "array");
        if (objArr.length < size()) {
            objArr = C0272f.a(objArr, size());
        }
        int k2 = k(this.f6091a + size());
        int i2 = this.f6091a;
        if (i2 < k2) {
            C0274h.d(this.f6092b, objArr, 0, i2, k2, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f6092b;
            C0274h.c(objArr2, objArr, 0, this.f6091a, objArr2.length);
            Object[] objArr3 = this.f6092b;
            C0274h.c(objArr3, objArr, objArr3.length - this.f6091a, 0, k2);
        }
        if (objArr.length > size()) {
            objArr[size()] = null;
        }
        return objArr;
    }
}
