package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class f {

    /* renamed from: a  reason: collision with root package name */
    b f5773a;

    /* renamed from: b  reason: collision with root package name */
    c f5774b;

    /* renamed from: c  reason: collision with root package name */
    e f5775c;

    final class a implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        final int f5776a;

        /* renamed from: b  reason: collision with root package name */
        int f5777b;

        /* renamed from: c  reason: collision with root package name */
        int f5778c;

        /* renamed from: d  reason: collision with root package name */
        boolean f5779d = false;

        a(int i2) {
            this.f5776a = i2;
            this.f5777b = f.this.d();
        }

        public boolean hasNext() {
            if (this.f5778c < this.f5777b) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (hasNext()) {
                Object b2 = f.this.b(this.f5778c, this.f5776a);
                this.f5778c++;
                this.f5779d = true;
                return b2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f5779d) {
                int i2 = this.f5778c - 1;
                this.f5778c = i2;
                this.f5777b--;
                this.f5779d = false;
                f.this.h(i2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class b implements Set {
        b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            int d2 = f.this.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                f.this.g(entry.getKey(), entry.getValue());
            }
            if (d2 != f.this.d()) {
                return true;
            }
            return false;
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e2 = f.this.e(entry.getKey());
            if (e2 < 0) {
                return false;
            }
            return c.c(f.this.b(e2, 1), entry.getValue());
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
            return f.k(this, obj);
        }

        public int hashCode() {
            int i2;
            int i3;
            int i4 = 0;
            for (int d2 = f.this.d() - 1; d2 >= 0; d2--) {
                Object b2 = f.this.b(d2, 0);
                Object b3 = f.this.b(d2, 1);
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                if (b3 == null) {
                    i3 = 0;
                } else {
                    i3 = b3.hashCode();
                }
                i4 += i2 ^ i3;
            }
            return i4;
        }

        public boolean isEmpty() {
            if (f.this.d() == 0) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set {
        c() {
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (f.this.e(obj) >= 0) {
                return true;
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            return f.j(f.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public int hashCode() {
            int i2;
            int i3 = 0;
            for (int d2 = f.this.d() - 1; d2 >= 0; d2--) {
                Object b2 = f.this.b(d2, 0);
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                i3 += i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            if (f.this.d() == 0) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e2 = f.this.e(obj);
            if (e2 < 0) {
                return false;
            }
            f.this.h(e2);
            return true;
        }

        public boolean removeAll(Collection collection) {
            return f.o(f.this.c(), collection);
        }

        public boolean retainAll(Collection collection) {
            return f.p(f.this.c(), collection);
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(0);
        }

        public Object[] toArray(Object[] objArr) {
            return f.this.r(objArr, 0);
        }
    }

    final class d implements Iterator, Map.Entry {

        /* renamed from: a  reason: collision with root package name */
        int f5783a;

        /* renamed from: b  reason: collision with root package name */
        int f5784b;

        /* renamed from: c  reason: collision with root package name */
        boolean f5785c = false;

        d() {
            this.f5783a = f.this.d() - 1;
            this.f5784b = -1;
        }

        /* renamed from: a */
        public Map.Entry next() {
            if (hasNext()) {
                this.f5784b++;
                this.f5785c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f5785c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!c.c(entry.getKey(), f.this.b(this.f5784b, 0)) || !c.c(entry.getValue(), f.this.b(this.f5784b, 1))) {
                    return false;
                }
                return true;
            }
        }

        public Object getKey() {
            if (this.f5785c) {
                return f.this.b(this.f5784b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object getValue() {
            if (this.f5785c) {
                return f.this.b(this.f5784b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            if (this.f5784b < this.f5783a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i2;
            if (this.f5785c) {
                int i3 = 0;
                Object b2 = f.this.b(this.f5784b, 0);
                Object b3 = f.this.b(this.f5784b, 1);
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                if (b3 != null) {
                    i3 = b3.hashCode();
                }
                return i2 ^ i3;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f5785c) {
                f.this.h(this.f5784b);
                this.f5784b--;
                this.f5783a--;
                this.f5785c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public Object setValue(Object obj) {
            if (this.f5785c) {
                return f.this.i(this.f5784b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection {
        e() {
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (f.this.f(obj) >= 0) {
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

        public boolean isEmpty() {
            if (f.this.d() == 0) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f2 = f.this.f(obj);
            if (f2 < 0) {
                return false;
            }
            f.this.h(f2);
            return true;
        }

        public boolean removeAll(Collection collection) {
            int d2 = f.this.d();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < d2) {
                if (collection.contains(f.this.b(i2, 1))) {
                    f.this.h(i2);
                    i2--;
                    d2--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        public boolean retainAll(Collection collection) {
            int d2 = f.this.d();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < d2) {
                if (!collection.contains(f.this.b(i2, 1))) {
                    f.this.h(i2);
                    i2--;
                    d2--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(1);
        }

        public Object[] toArray(Object[] objArr) {
            return f.this.r(objArr, 1);
        }
    }

    f() {
    }

    public static boolean j(Map map, Collection collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean o(Map map, Collection collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    public static boolean p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract Object b(int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract Map c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e(Object obj);

    /* access modifiers changed from: protected */
    public abstract int f(Object obj);

    /* access modifiers changed from: protected */
    public abstract void g(Object obj, Object obj2);

    /* access modifiers changed from: protected */
    public abstract void h(int i2);

    /* access modifiers changed from: protected */
    public abstract Object i(int i2, Object obj);

    public Set l() {
        if (this.f5773a == null) {
            this.f5773a = new b();
        }
        return this.f5773a;
    }

    public Set m() {
        if (this.f5774b == null) {
            this.f5774b = new c();
        }
        return this.f5774b;
    }

    public Collection n() {
        if (this.f5775c == null) {
            this.f5775c = new e();
        }
        return this.f5775c;
    }

    public Object[] q(int i2) {
        int d2 = d();
        Object[] objArr = new Object[d2];
        for (int i3 = 0; i3 < d2; i3++) {
            objArr[i3] = b(i3, i2);
        }
        return objArr;
    }

    public Object[] r(Object[] objArr, int i2) {
        int d2 = d();
        if (objArr.length < d2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d2);
        }
        for (int i3 = 0; i3 < d2; i3++) {
            objArr[i3] = b(i3, i2);
        }
        if (objArr.length > d2) {
            objArr[d2] = null;
        }
        return objArr;
    }
}
