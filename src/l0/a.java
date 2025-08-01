package l0;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import y.L;

public final  class a implements L {

    
    public final  SideSheetBehavior f5800a;

    
    public final  int f5801b;

    public  a(SideSheetBehavior sideSheetBehavior, int i2) {
        this.f5800a = sideSheetBehavior;
        this.f5801b = i2;
    }

    public final boolean a(View view, L.a aVar) {
        return this.f5800a.x0(this.f5801b, view, aVar);
    }
}
