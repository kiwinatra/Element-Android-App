package l0;

import com.google.android.material.sidesheet.SideSheetBehavior;

public final  class b implements Runnable {

    
    public final  SideSheetBehavior f5802a;

    
    public final  int f5803b;

    public  b(SideSheetBehavior sideSheetBehavior, int i2) {
        this.f5802a = sideSheetBehavior;
        this.f5803b = i2;
    }

    public final void run() {
        this.f5802a.z0(this.f5803b);
    }
}
