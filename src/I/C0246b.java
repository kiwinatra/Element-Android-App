package i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import l.g;
import u.C0287b;


abstract class C0246b {

    
    final Context f5543a;

    
    private g f5544b;

    
    private g f5545c;

    C0246b(Context context) {
        this.f5543a = context;
    }

    
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof C0287b)) {
            return menuItem;
        }
        C0287b bVar = (C0287b) menuItem;
        if (this.f5544b == null) {
            this.f5544b = new g();
        }
        MenuItem menuItem2 = (MenuItem) this.f5544b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0247c cVar = new C0247c(this.f5543a, bVar);
        this.f5544b.put(bVar, cVar);
        return cVar;
    }

    
    public final void e() {
        g gVar = this.f5544b;
        if (gVar != null) {
            gVar.clear();
        }
        g gVar2 = this.f5545c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    
    public final void f(int i2) {
        if (this.f5544b != null) {
            int i3 = 0;
            while (i3 < this.f5544b.size()) {
                if (((C0287b) this.f5544b.i(i3)).getGroupId() == i2) {
                    this.f5544b.k(i3);
                    i3--;
                }
                i3++;
            }
        }
    }

    
    public final void g(int i2) {
        if (this.f5544b != null) {
            for (int i3 = 0; i3 < this.f5544b.size(); i3++) {
                if (((C0287b) this.f5544b.i(i3)).getItemId() == i2) {
                    this.f5544b.k(i3);
                    return;
                }
            }
        }
    }

    
    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
