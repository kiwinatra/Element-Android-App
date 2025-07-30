package M;

import M.a;
import w0.e;
import w0.i;

public final class d extends a {
    public d() {
        this((a) null, 1, (e) null);
    }

    public final void b(a.b bVar, Object obj) {
        i.e(bVar, "key");
        a().put(bVar, obj);
    }

    public d(a aVar) {
        i.e(aVar, "initialExtras");
        a().putAll(aVar.a());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(a aVar, int i2, e eVar) {
        this((i2 & 1) != 0 ? a.C0007a.f132b : aVar);
    }
}
