package M;

import androidx.lifecycle.A;
import androidx.lifecycle.B;
import androidx.lifecycle.z;
import w0.i;

public final class b implements A.b {

    /* renamed from: a  reason: collision with root package name */
    private final f[] f133a;

    public b(f... fVarArr) {
        i.e(fVarArr, "initializers");
        this.f133a = fVarArr;
    }

    public /* synthetic */ z a(Class cls) {
        return B.a(this, cls);
    }

    public z b(Class cls, a aVar) {
        i.e(cls, "modelClass");
        i.e(aVar, "extras");
        z zVar = null;
        for (f fVar : this.f133a) {
            if (i.a(fVar.a(), cls)) {
                Object b2 = fVar.b().b(aVar);
                if (b2 instanceof z) {
                    zVar = (z) b2;
                } else {
                    zVar = null;
                }
            }
        }
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
