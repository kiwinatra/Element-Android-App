package M;

import A0.b;
import androidx.lifecycle.A;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import u0.a;
import v0.l;
import w0.i;

public final class c {

    
    private final List f134a = new ArrayList();

    public final void a(b bVar, l lVar) {
        i.e(bVar, "clazz");
        i.e(lVar, "initializer");
        this.f134a.add(new f(a.a(bVar), lVar));
    }

    public final A.b b() {
        f[] fVarArr = (f[]) this.f134a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
