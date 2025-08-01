package i0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import k0.g;
import k0.k;
import k0.n;

public class a extends Drawable implements n, androidx.core.graphics.drawable.b {

    
    private b f5557a;

    static final class b extends Drawable.ConstantState {

        
        g f5558a;

        
        boolean f5559b;

        public b(b bVar) {
            this.f5558a = (g) bVar.f5558a.getConstantState().newDrawable();
            this.f5559b = bVar.f5559b;
        }

        
        public a newDrawable() {
            return new a(new b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public b(g gVar) {
            this.f5558a = gVar;
            this.f5559b = false;
        }
    }

    private a(b bVar) {
        this.f5557a = bVar;
    }

    
    public a mutate() {
        this.f5557a = new b(this.f5557a);
        return this;
    }

    public void draw(Canvas canvas) {
        b bVar = this.f5557a;
        if (bVar.f5559b) {
            bVar.f5558a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f5557a;
    }

    public int getOpacity() {
        return this.f5557a.f5558a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f5557a.f5558a.setBounds(rect);
    }

    
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f5557a.f5558a.setState(iArr)) {
            onStateChange = true;
        }
        boolean c2 = b.c(iArr);
        b bVar = this.f5557a;
        if (bVar.f5559b == c2) {
            return onStateChange;
        }
        bVar.f5559b = c2;
        return true;
    }

    public void setAlpha(int i2) {
        this.f5557a.f5558a.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5557a.f5558a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f5557a.f5558a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i2) {
        this.f5557a.f5558a.setTint(i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f5557a.f5558a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f5557a.f5558a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }
}
