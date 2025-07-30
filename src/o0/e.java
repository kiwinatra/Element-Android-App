package o0;

import java.io.Serializable;
import w0.i;

public final class e implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5931a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f5932b;

    public e(Object obj, Object obj2) {
        this.f5931a = obj;
        this.f5932b = obj2;
    }

    public final Object a() {
        return this.f5931a;
    }

    public final Object b() {
        return this.f5932b;
    }

    public final Object c() {
        return this.f5931a;
    }

    public final Object d() {
        return this.f5932b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (i.a(this.f5931a, eVar.f5931a) && i.a(this.f5932b, eVar.f5932b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i2;
        Object obj = this.f5931a;
        int i3 = 0;
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        int i4 = i2 * 31;
        Object obj2 = this.f5932b;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        }
        return i4 + i3;
    }

    public String toString() {
        return '(' + this.f5931a + ", " + this.f5932b + ')';
    }
}
