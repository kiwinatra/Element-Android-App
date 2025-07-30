package o0;

import java.io.Serializable;
import v0.a;
import w0.e;
import w0.i;

final class f implements a, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private a f5933a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f5934b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5935c;

    public f(a aVar, Object obj) {
        i.e(aVar, "initializer");
        this.f5933a = aVar;
        this.f5934b = h.f5936a;
        this.f5935c = obj == null ? this : obj;
    }

    public boolean a() {
        if (this.f5934b != h.f5936a) {
            return true;
        }
        return false;
    }

    public Object getValue() {
        Object obj;
        Object obj2 = this.f5934b;
        h hVar = h.f5936a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f5935c) {
            obj = this.f5934b;
            if (obj == hVar) {
                a aVar = this.f5933a;
                i.b(aVar);
                obj = aVar.a();
                this.f5934b = obj;
                this.f5933a = null;
            }
        }
        return obj;
    }

    public String toString() {
        if (a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(a aVar, Object obj, int i2, e eVar) {
        this(aVar, (i2 & 2) != 0 ? null : obj);
    }
}
