package g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;


public abstract class C0239c extends Drawable implements Drawable.Callback {

    
    private Drawable f5458a;

    public C0239c(Drawable drawable) {
        a(drawable);
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f5458a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f5458a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f5458a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f5458a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f5458a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f5458a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f5458a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f5458a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f5458a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f5458a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f5458a.getPadding(rect);
    }

    public int[] getState() {
        return this.f5458a.getState();
    }

    public Region getTransparentRegion() {
        return this.f5458a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.f5458a);
    }

    public boolean isStateful() {
        return this.f5458a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f5458a.jumpToCurrentState();
    }

    
    public void onBoundsChange(Rect rect) {
        this.f5458a.setBounds(rect);
    }

    
    public boolean onLevelChange(int i2) {
        return this.f5458a.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.f5458a.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z2) {
        a.j(this.f5458a, z2);
    }

    public void setChangingConfigurations(int i2) {
        this.f5458a.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5458a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z2) {
        this.f5458a.setDither(z2);
    }

    public void setFilterBitmap(boolean z2) {
        this.f5458a.setFilterBitmap(z2);
    }

    public void setHotspot(float f2, float f3) {
        a.k(this.f5458a, f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        a.l(this.f5458a, i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        return this.f5458a.setState(iArr);
    }

    public void setTint(int i2) {
        a.n(this.f5458a, i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.o(this.f5458a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.p(this.f5458a, mode);
    }

    public boolean setVisible(boolean z2, boolean z3) {
        if (super.setVisible(z2, z3) || this.f5458a.setVisible(z2, z3)) {
            return true;
        }
        return false;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
