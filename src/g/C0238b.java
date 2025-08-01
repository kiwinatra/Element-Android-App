package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;


public abstract class C0238b extends Drawable implements Drawable.Callback {

    
    private d f5409a;

    
    private Rect f5410b;

    
    private Drawable f5411c;

    
    private Drawable f5412d;

    
    private int f5413e = 255;

    
    private boolean f5414f;

    
    private int f5415g = -1;

    
    private boolean f5416h;

    
    private Runnable f5417i;

    
    private long f5418j;

    
    private long f5419k;

    
    private c f5420l;

    
    class a implements Runnable {
        a() {
        }

        public void run() {
            C0238b.this.a(true);
            C0238b.this.invalidateSelf();
        }
    }

    
    private static class C0073b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    
    static abstract class d extends Drawable.ConstantState {

        
        int f5423A = 0;

        
        int f5424B = 0;

        
        boolean f5425C;

        
        ColorFilter f5426D;

        
        boolean f5427E;

        
        ColorStateList f5428F;

        
        PorterDuff.Mode f5429G;

        
        boolean f5430H;

        
        boolean f5431I;

        
        final C0238b f5432a;

        
        Resources f5433b;

        
        int f5434c;

        
        int f5435d;

        
        int f5436e;

        
        SparseArray f5437f;

        
        Drawable[] f5438g;

        
        int f5439h;

        
        boolean f5440i = false;

        
        boolean f5441j;

        
        Rect f5442k;

        
        boolean f5443l = false;

        
        boolean f5444m;

        
        int f5445n;

        
        int f5446o;

        
        int f5447p;

        
        int f5448q;

        
        boolean f5449r;

        
        int f5450s;

        
        boolean f5451t;

        
        boolean f5452u;

        
        boolean f5453v;

        
        boolean f5454w;

        
        boolean f5455x = true;

        
        boolean f5456y;

        
        int f5457z;

        d(d dVar, C0238b bVar, Resources resources) {
            Resources resources2;
            int i2;
            SparseArray sparseArray;
            this.f5432a = bVar;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else if (dVar != null) {
                resources2 = dVar.f5433b;
            } else {
                resources2 = null;
            }
            this.f5433b = resources2;
            if (dVar != null) {
                i2 = dVar.f5434c;
            } else {
                i2 = 0;
            }
            int f2 = C0238b.f(resources, i2);
            this.f5434c = f2;
            if (dVar != null) {
                this.f5435d = dVar.f5435d;
                this.f5436e = dVar.f5436e;
                this.f5453v = true;
                this.f5454w = true;
                this.f5440i = dVar.f5440i;
                this.f5443l = dVar.f5443l;
                this.f5455x = dVar.f5455x;
                this.f5456y = dVar.f5456y;
                this.f5457z = dVar.f5457z;
                this.f5423A = dVar.f5423A;
                this.f5424B = dVar.f5424B;
                this.f5425C = dVar.f5425C;
                this.f5426D = dVar.f5426D;
                this.f5427E = dVar.f5427E;
                this.f5428F = dVar.f5428F;
                this.f5429G = dVar.f5429G;
                this.f5430H = dVar.f5430H;
                this.f5431I = dVar.f5431I;
                if (dVar.f5434c == f2) {
                    if (dVar.f5441j) {
                        this.f5442k = dVar.f5442k != null ? new Rect(dVar.f5442k) : rect;
                        this.f5441j = true;
                    }
                    if (dVar.f5444m) {
                        this.f5445n = dVar.f5445n;
                        this.f5446o = dVar.f5446o;
                        this.f5447p = dVar.f5447p;
                        this.f5448q = dVar.f5448q;
                        this.f5444m = true;
                    }
                }
                if (dVar.f5449r) {
                    this.f5450s = dVar.f5450s;
                    this.f5449r = true;
                }
                if (dVar.f5451t) {
                    this.f5452u = dVar.f5452u;
                    this.f5451t = true;
                }
                Drawable[] drawableArr = dVar.f5438g;
                this.f5438g = new Drawable[drawableArr.length];
                this.f5439h = dVar.f5439h;
                SparseArray sparseArray2 = dVar.f5437f;
                if (sparseArray2 != null) {
                    sparseArray = sparseArray2.clone();
                } else {
                    sparseArray = new SparseArray(this.f5439h);
                }
                this.f5437f = sparseArray;
                int i3 = this.f5439h;
                for (int i4 = 0; i4 < i3; i4++) {
                    Drawable drawable = drawableArr[i4];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f5437f.put(i4, constantState);
                        } else {
                            this.f5438g[i4] = drawableArr[i4];
                        }
                    }
                }
                return;
            }
            this.f5438g = new Drawable[10];
            this.f5439h = 0;
        }

        private void e() {
            SparseArray sparseArray = this.f5437f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f5438g[this.f5437f.keyAt(i2)] = s(((Drawable.ConstantState) this.f5437f.valueAt(i2)).newDrawable(this.f5433b));
                }
                this.f5437f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, this.f5457z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f5432a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f5439h;
            if (i2 >= this.f5438g.length) {
                o(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f5432a);
            this.f5438g[i2] = drawable;
            this.f5439h++;
            this.f5436e = drawable.getChangingConfigurations() | this.f5436e;
            p();
            this.f5442k = null;
            this.f5441j = false;
            this.f5444m = false;
            this.f5453v = false;
            return i2;
        }

        
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i2 = this.f5439h;
                Drawable[] drawableArr = this.f5438g;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null && androidx.core.graphics.drawable.a.b(drawable)) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i3], theme);
                        this.f5436e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                y(C0073b.c(theme));
            }
        }

        public boolean c() {
            if (this.f5453v) {
                return this.f5454w;
            }
            e();
            this.f5453v = true;
            int i2 = this.f5439h;
            Drawable[] drawableArr = this.f5438g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.f5454w = false;
                    return false;
                }
            }
            this.f5454w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i2 = this.f5439h;
            Drawable[] drawableArr = this.f5438g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f5437f.get(i3);
                    if (constantState != null && C0073b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        
        public void d() {
            this.f5444m = true;
            e();
            int i2 = this.f5439h;
            Drawable[] drawableArr = this.f5438g;
            this.f5446o = -1;
            this.f5445n = -1;
            this.f5448q = 0;
            this.f5447p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f5445n) {
                    this.f5445n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f5446o) {
                    this.f5446o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f5447p) {
                    this.f5447p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f5448q) {
                    this.f5448q = minimumHeight;
                }
            }
        }

        
        public final int f() {
            return this.f5438g.length;
        }

        public final Drawable g(int i2) {
            int indexOfKey;
            Drawable drawable = this.f5438g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f5437f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable s2 = s(((Drawable.ConstantState) this.f5437f.valueAt(indexOfKey)).newDrawable(this.f5433b));
            this.f5438g[i2] = s2;
            this.f5437f.removeAt(indexOfKey);
            if (this.f5437f.size() == 0) {
                this.f5437f = null;
            }
            return s2;
        }

        public int getChangingConfigurations() {
            return this.f5435d | this.f5436e;
        }

        public final int h() {
            return this.f5439h;
        }

        public final int i() {
            if (!this.f5444m) {
                d();
            }
            return this.f5446o;
        }

        public final int j() {
            if (!this.f5444m) {
                d();
            }
            return this.f5448q;
        }

        public final int k() {
            if (!this.f5444m) {
                d();
            }
            return this.f5447p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f5440i) {
                return null;
            }
            Rect rect2 = this.f5442k;
            if (rect2 != null || this.f5441j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i2 = this.f5439h;
            Drawable[] drawableArr = this.f5438g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect3.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect3.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect3.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect3.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.f5441j = true;
            this.f5442k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f5444m) {
                d();
            }
            return this.f5445n;
        }

        public final int n() {
            int i2;
            if (this.f5449r) {
                return this.f5450s;
            }
            e();
            int i3 = this.f5439h;
            Drawable[] drawableArr = this.f5438g;
            if (i3 > 0) {
                i2 = drawableArr[0].getOpacity();
            } else {
                i2 = -2;
            }
            for (int i4 = 1; i4 < i3; i4++) {
                i2 = Drawable.resolveOpacity(i2, drawableArr[i4].getOpacity());
            }
            this.f5450s = i2;
            this.f5449r = true;
            return i2;
        }

        public void o(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f5438g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f5438g = drawableArr;
        }

        
        public void p() {
            this.f5449r = false;
            this.f5451t = false;
        }

        public final boolean q() {
            return this.f5443l;
        }

        
        public abstract void r();

        public final void t(boolean z2) {
            this.f5443l = z2;
        }

        public final void u(int i2) {
            this.f5423A = i2;
        }

        public final void v(int i2) {
            this.f5424B = i2;
        }

        
        public final boolean w(int i2, int i3) {
            boolean z2;
            int i4 = this.f5439h;
            Drawable[] drawableArr = this.f5438g;
            boolean z3 = false;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        z2 = androidx.core.graphics.drawable.a.m(drawable, i2);
                    } else {
                        z2 = false;
                    }
                    if (i5 == i3) {
                        z3 = z2;
                    }
                }
            }
            this.f5457z = i2;
            return z3;
        }

        public final void x(boolean z2) {
            this.f5440i = z2;
        }

        
        public final void y(Resources resources) {
            if (resources != null) {
                this.f5433b = resources;
                int f2 = C0238b.f(resources, this.f5434c);
                int i2 = this.f5434c;
                this.f5434c = f2;
                if (i2 != f2) {
                    this.f5444m = false;
                    this.f5441j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f5420l == null) {
            this.f5420l = new c();
        }
        drawable.setCallback(this.f5420l.b(drawable.getCallback()));
        try {
            if (this.f5409a.f5423A <= 0 && this.f5414f) {
                drawable.setAlpha(this.f5413e);
            }
            d dVar = this.f5409a;
            if (dVar.f5427E) {
                drawable.setColorFilter(dVar.f5426D);
            } else {
                if (dVar.f5430H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.f5428F);
                }
                d dVar2 = this.f5409a;
                if (dVar2.f5431I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.f5429G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f5409a.f5455x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            }
            androidx.core.graphics.drawable.a.j(drawable, this.f5409a.f5425C);
            Rect rect = this.f5410b;
            if (rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f5420l.a());
        } catch (Throwable th) {
            drawable.setCallback(this.f5420l.a());
            throw th;
        }
    }

    private boolean e() {
        if (!isAutoMirrored() || androidx.core.graphics.drawable.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    static int f(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    
    
    
    
    
    public void a(boolean r14) {
        
        throw new UnsupportedOperationException("Method not decompiled: g.C0238b.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f5409a.b(theme);
    }

    
    public abstract d b();

    
    public int c() {
        return this.f5415g;
    }

    public boolean canApplyTheme() {
        return this.f5409a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f5412d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    
    
    
    
    public boolean g(int r10) {
        
        throw new UnsupportedOperationException("Method not decompiled: g.C0238b.g(int):boolean");
    }

    public int getAlpha() {
        return this.f5413e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f5409a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f5409a.c()) {
            return null;
        }
        this.f5409a.f5435d = getChangingConfigurations();
        return this.f5409a;
    }

    public Drawable getCurrent() {
        return this.f5411c;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f5410b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f5409a.q()) {
            return this.f5409a.i();
        }
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f5409a.q()) {
            return this.f5409a.m();
        }
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f5409a.q()) {
            return this.f5409a.j();
        }
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f5409a.q()) {
            return this.f5409a.k();
        }
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f5411c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f5409a.n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            C0073b.b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z2;
        Rect l2 = this.f5409a.l();
        if (l2 != null) {
            rect.set(l2);
            if ((l2.right | l2.left | l2.top | l2.bottom) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            Drawable drawable = this.f5411c;
            if (drawable != null) {
                z2 = drawable.getPadding(rect);
            } else {
                z2 = super.getPadding(rect);
            }
        }
        if (e()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return z2;
    }

    
    public void h(d dVar) {
        this.f5409a = dVar;
        int i2 = this.f5415g;
        if (i2 >= 0) {
            Drawable g2 = dVar.g(i2);
            this.f5411c = g2;
            if (g2 != null) {
                d(g2);
            }
        }
        this.f5412d = null;
    }

    
    public final void i(Resources resources) {
        this.f5409a.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f5409a;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable == this.f5411c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f5409a.f5425C;
    }

    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f5412d;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f5412d = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f5411c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f5414f) {
                this.f5411c.setAlpha(this.f5413e);
            }
        }
        if (this.f5419k != 0) {
            this.f5419k = 0;
            z2 = true;
        }
        if (this.f5418j != 0) {
            this.f5418j = 0;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f5416h && super.mutate() == this) {
            d b2 = b();
            b2.r();
            h(b2);
            this.f5416h = true;
        }
        return this;
    }

    
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5412d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f5411c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return this.f5409a.w(i2, c());
    }

    
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f5412d;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f5411c;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f5411c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.f5414f || this.f5413e != i2) {
            this.f5414f = true;
            this.f5413e = i2;
            Drawable drawable = this.f5411c;
            if (drawable == null) {
                return;
            }
            if (this.f5418j == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z2) {
        d dVar = this.f5409a;
        if (dVar.f5425C != z2) {
            dVar.f5425C = z2;
            Drawable drawable = this.f5411c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z2);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f5409a;
        dVar.f5427E = true;
        if (dVar.f5426D != colorFilter) {
            dVar.f5426D = colorFilter;
            Drawable drawable = this.f5411c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z2) {
        d dVar = this.f5409a;
        if (dVar.f5455x != z2) {
            dVar.f5455x = z2;
            Drawable drawable = this.f5411c;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f5410b;
        if (rect == null) {
            this.f5410b = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f5411c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i2, i3, i4, i5);
        }
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f5409a;
        dVar.f5430H = true;
        if (dVar.f5428F != colorStateList) {
            dVar.f5428F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f5411c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f5409a;
        dVar.f5431I = true;
        if (dVar.f5429G != mode) {
            dVar.f5429G = mode;
            androidx.core.graphics.drawable.a.p(this.f5411c, mode);
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f5412d;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f5411c;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f5411c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    
    static class c implements Drawable.Callback {

        
        private Drawable.Callback f5422a;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f5422a;
            this.f5422a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f5422a = callback;
            return this;
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f5422a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f5422a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        public void invalidateDrawable(Drawable drawable) {
        }
    }
}
