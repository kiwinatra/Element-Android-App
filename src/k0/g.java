package k0;

import a0.C0087a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import c0.C0212a;
import com.google.android.material.drawable.f;
import java.util.BitSet;
import k0.k;
import k0.l;
import k0.m;

public class g extends Drawable implements androidx.core.graphics.drawable.b, n {

    
    private static final String f5612x = "g";

    
    private static final Paint f5613y;

    
    private c f5614a;
    

    
    public final m.g[] f5615b;
    

    
    public final m.g[] f5616c;
    

    
    public final BitSet f5617d;
    

    
    public boolean f5618e;

    
    private final Matrix f5619f;

    
    private final Path f5620g;

    
    private final Path f5621h;

    
    private final RectF f5622i;

    
    private final RectF f5623j;

    
    private final Region f5624k;

    
    private final Region f5625l;

    
    private k f5626m;

    
    private final Paint f5627n;

    
    private final Paint f5628o;

    
    private final j0.a f5629p;

    
    private final l.b f5630q;

    
    private final l f5631r;

    
    private PorterDuffColorFilter f5632s;

    
    private PorterDuffColorFilter f5633t;

    
    private int f5634u;

    
    private final RectF f5635v;

    
    private boolean f5636w;

    class a implements l.b {
        a() {
        }

        public void a(m mVar, Matrix matrix, int i2) {
            g.this.f5617d.set(i2 + 4, mVar.e());
            g.this.f5616c[i2] = mVar.f(matrix);
        }

        public void b(m mVar, Matrix matrix, int i2) {
            g.this.f5617d.set(i2, mVar.e());
            g.this.f5615b[i2] = mVar.f(matrix);
        }
    }

    class b implements k.c {

        
        final  float f5638a;

        b(float f2) {
            this.f5638a = f2;
        }

        public c a(c cVar) {
            if (cVar instanceof i) {
                return cVar;
            }
            return new b(this.f5638a, cVar);
        }
    }

    protected static class c extends Drawable.ConstantState {

        
        k f5640a;

        
        C0212a f5641b;

        
        ColorFilter f5642c;

        
        ColorStateList f5643d = null;

        
        ColorStateList f5644e = null;

        
        ColorStateList f5645f = null;

        
        ColorStateList f5646g = null;

        
        PorterDuff.Mode f5647h = PorterDuff.Mode.SRC_IN;

        
        Rect f5648i = null;

        
        float f5649j = 1.0f;

        
        float f5650k = 1.0f;

        
        float f5651l;

        
        int f5652m = 255;

        
        float f5653n = 0.0f;

        
        float f5654o = 0.0f;

        
        float f5655p = 0.0f;

        
        int f5656q = 0;

        
        int f5657r = 0;

        
        int f5658s = 0;

        
        int f5659t = 0;

        
        boolean f5660u = false;

        
        Paint.Style f5661v = Paint.Style.FILL_AND_STROKE;

        public c(c cVar) {
            this.f5640a = cVar.f5640a;
            this.f5641b = cVar.f5641b;
            this.f5651l = cVar.f5651l;
            this.f5642c = cVar.f5642c;
            this.f5643d = cVar.f5643d;
            this.f5644e = cVar.f5644e;
            this.f5647h = cVar.f5647h;
            this.f5646g = cVar.f5646g;
            this.f5652m = cVar.f5652m;
            this.f5649j = cVar.f5649j;
            this.f5658s = cVar.f5658s;
            this.f5656q = cVar.f5656q;
            this.f5660u = cVar.f5660u;
            this.f5650k = cVar.f5650k;
            this.f5653n = cVar.f5653n;
            this.f5654o = cVar.f5654o;
            this.f5655p = cVar.f5655p;
            this.f5657r = cVar.f5657r;
            this.f5659t = cVar.f5659t;
            this.f5645f = cVar.f5645f;
            this.f5661v = cVar.f5661v;
            if (cVar.f5648i != null) {
                this.f5648i = new Rect(cVar.f5648i);
            }
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            g gVar = new g(this);
            boolean unused = gVar.f5618e = true;
            return gVar;
        }

        public c(k kVar, C0212a aVar) {
            this.f5640a = kVar;
            this.f5641b = aVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        f5613y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    private float B() {
        if (I()) {
            return this.f5628o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean G() {
        c cVar = this.f5614a;
        int i2 = cVar.f5656q;
        if (i2 == 1 || cVar.f5657r <= 0 || (i2 != 2 && !Q())) {
            return false;
        }
        return true;
    }

    private boolean H() {
        Paint.Style style = this.f5614a.f5661v;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            return true;
        }
        return false;
    }

    private boolean I() {
        Paint.Style style = this.f5614a.f5661v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f5628o.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    private void K() {
        super.invalidateSelf();
    }

    private void N(Canvas canvas) {
        if (G()) {
            canvas.save();
            P(canvas);
            if (!this.f5636w) {
                n(canvas);
            } else {
                int width = (int) (this.f5635v.width() - ((float) getBounds().width()));
                int height = (int) (this.f5635v.height() - ((float) getBounds().height()));
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f5635v.width()) + (this.f5614a.f5657r * 2) + width, ((int) this.f5635v.height()) + (this.f5614a.f5657r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f2 = (float) ((getBounds().left - this.f5614a.f5657r) - width);
                float f3 = (float) ((getBounds().top - this.f5614a.f5657r) - height);
                canvas2.translate(-f2, -f3);
                n(canvas2);
                canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
                createBitmap.recycle();
            }
            canvas.restore();
        }
    }

    private static int O(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private void P(Canvas canvas) {
        canvas.translate((float) y(), (float) z());
    }

    private boolean b0(int[] iArr) {
        boolean z2;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f5614a.f5643d == null || (color2 = this.f5627n.getColor()) == (colorForState2 = this.f5614a.f5643d.getColorForState(iArr, color2))) {
            z2 = false;
        } else {
            this.f5627n.setColor(colorForState2);
            z2 = true;
        }
        if (this.f5614a.f5644e == null || (color = this.f5628o.getColor()) == (colorForState = this.f5614a.f5644e.getColorForState(iArr, color))) {
            return z2;
        }
        this.f5628o.setColor(colorForState);
        return true;
    }

    private boolean c0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f5632s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f5633t;
        c cVar = this.f5614a;
        this.f5632s = k(cVar.f5646g, cVar.f5647h, this.f5627n, true);
        c cVar2 = this.f5614a;
        this.f5633t = k(cVar2.f5645f, cVar2.f5647h, this.f5628o, false);
        c cVar3 = this.f5614a;
        if (cVar3.f5660u) {
            this.f5629p.d(cVar3.f5646g.getColorForState(getState(), 0));
        }
        if (!x.c.a(porterDuffColorFilter, this.f5632s) || !x.c.a(porterDuffColorFilter2, this.f5633t)) {
            return true;
        }
        return false;
    }

    private void d0() {
        float F2 = F();
        this.f5614a.f5657r = (int) Math.ceil((double) (0.75f * F2));
        this.f5614a.f5658s = (int) Math.ceil((double) (F2 * 0.25f));
        c0();
        K();
    }

    private PorterDuffColorFilter f(Paint paint, boolean z2) {
        if (!z2) {
            return null;
        }
        int color = paint.getColor();
        int l2 = l(color);
        this.f5634u = l2;
        if (l2 != color) {
            return new PorterDuffColorFilter(l2, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f5614a.f5649j != 1.0f) {
            this.f5619f.reset();
            Matrix matrix = this.f5619f;
            float f2 = this.f5614a.f5649j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f5619f);
        }
        path.computeBounds(this.f5635v, true);
    }

    private void i() {
        k y2 = A().y(new b(-B()));
        this.f5626m = y2;
        this.f5631r.d(y2, this.f5614a.f5650k, t(), this.f5621h);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z2) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = l(colorForState);
        }
        this.f5634u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        if (colorStateList == null || mode == null) {
            return f(paint, z2);
        }
        return j(colorStateList, mode, z2);
    }

    public static g m(Context context, float f2, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(C0087a.c(context, T.a.colorSurface, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.J(context);
        gVar.T(colorStateList);
        gVar.S(f2);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f5617d.cardinality() > 0) {
            Log.w(f5612x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f5614a.f5658s != 0) {
            canvas.drawPath(this.f5620g, this.f5629p.c());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f5615b[i2].b(this.f5629p, this.f5614a.f5657r, canvas);
            this.f5616c[i2].b(this.f5629p, this.f5614a.f5657r, canvas);
        }
        if (this.f5636w) {
            int y2 = y();
            int z2 = z();
            canvas.translate((float) (-y2), (float) (-z2));
            canvas.drawPath(this.f5620g, f5613y);
            canvas.translate((float) y2, (float) z2);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.f5627n, this.f5620g, this.f5614a.f5640a, s());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a2 = kVar.t().a(rectF) * this.f5614a.f5650k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private RectF t() {
        this.f5623j.set(s());
        float B2 = B();
        this.f5623j.inset(B2, B2);
        return this.f5623j;
    }

    public k A() {
        return this.f5614a.f5640a;
    }

    public float C() {
        return this.f5614a.f5640a.r().a(s());
    }

    public float D() {
        return this.f5614a.f5640a.t().a(s());
    }

    public float E() {
        return this.f5614a.f5655p;
    }

    public float F() {
        return u() + E();
    }

    public void J(Context context) {
        this.f5614a.f5641b = new C0212a(context);
        d0();
    }

    public boolean L() {
        C0212a aVar = this.f5614a.f5641b;
        if (aVar == null || !aVar.d()) {
            return false;
        }
        return true;
    }

    public boolean M() {
        return this.f5614a.f5640a.u(s());
    }

    public boolean Q() {
        int i2 = Build.VERSION.SDK_INT;
        if (M() || this.f5620g.isConvex() || i2 >= 29) {
            return false;
        }
        return true;
    }

    public void R(c cVar) {
        setShapeAppearanceModel(this.f5614a.f5640a.x(cVar));
    }

    public void S(float f2) {
        c cVar = this.f5614a;
        if (cVar.f5654o != f2) {
            cVar.f5654o = f2;
            d0();
        }
    }

    public void T(ColorStateList colorStateList) {
        c cVar = this.f5614a;
        if (cVar.f5643d != colorStateList) {
            cVar.f5643d = colorStateList;
            onStateChange(getState());
        }
    }

    public void U(float f2) {
        c cVar = this.f5614a;
        if (cVar.f5650k != f2) {
            cVar.f5650k = f2;
            this.f5618e = true;
            invalidateSelf();
        }
    }

    public void V(int i2, int i3, int i4, int i5) {
        c cVar = this.f5614a;
        if (cVar.f5648i == null) {
            cVar.f5648i = new Rect();
        }
        this.f5614a.f5648i.set(i2, i3, i4, i5);
        invalidateSelf();
    }

    public void W(float f2) {
        c cVar = this.f5614a;
        if (cVar.f5653n != f2) {
            cVar.f5653n = f2;
            d0();
        }
    }

    public void X(float f2, int i2) {
        a0(f2);
        Z(ColorStateList.valueOf(i2));
    }

    public void Y(float f2, ColorStateList colorStateList) {
        a0(f2);
        Z(colorStateList);
    }

    public void Z(ColorStateList colorStateList) {
        c cVar = this.f5614a;
        if (cVar.f5644e != colorStateList) {
            cVar.f5644e = colorStateList;
            onStateChange(getState());
        }
    }

    public void a0(float f2) {
        this.f5614a.f5651l = f2;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f5627n.setColorFilter(this.f5632s);
        int alpha = this.f5627n.getAlpha();
        this.f5627n.setAlpha(O(alpha, this.f5614a.f5652m));
        this.f5628o.setColorFilter(this.f5633t);
        this.f5628o.setStrokeWidth(this.f5614a.f5651l);
        int alpha2 = this.f5628o.getAlpha();
        this.f5628o.setAlpha(O(alpha2, this.f5614a.f5652m));
        if (this.f5618e) {
            i();
            g(s(), this.f5620g);
            this.f5618e = false;
        }
        N(canvas);
        if (H()) {
            o(canvas);
        }
        if (I()) {
            r(canvas);
        }
        this.f5627n.setAlpha(alpha);
        this.f5628o.setAlpha(alpha2);
    }

    public int getAlpha() {
        return this.f5614a.f5652m;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f5614a;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f5614a.f5656q != 2) {
            if (M()) {
                outline.setRoundRect(getBounds(), C() * this.f5614a.f5650k);
                return;
            }
            g(s(), this.f5620g);
            f.i(outline, this.f5620g);
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f5614a.f5648i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f5624k.set(getBounds());
        g(s(), this.f5620g);
        this.f5625l.setPath(this.f5620g, this.f5624k);
        this.f5624k.op(this.f5625l, Region.Op.DIFFERENCE);
        return this.f5624k;
    }

    
    public final void h(RectF rectF, Path path) {
        l lVar = this.f5631r;
        c cVar = this.f5614a;
        k kVar = cVar.f5640a;
        float f2 = cVar.f5650k;
        lVar.e(kVar, f2, rectF, this.f5630q, path);
    }

    public void invalidateSelf() {
        this.f5618e = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (super.isStateful() || (((colorStateList = this.f5614a.f5646g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f5614a.f5645f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f5614a.f5644e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f5614a.f5643d) != null && colorStateList4.isStateful()))))) {
            return true;
        }
        return false;
    }

    
    public int l(int i2) {
        float F2 = F() + x();
        C0212a aVar = this.f5614a.f5641b;
        if (aVar != null) {
            return aVar.c(i2, F2);
        }
        return i2;
    }

    public Drawable mutate() {
        this.f5614a = new c(this.f5614a);
        return this;
    }

    
    public void onBoundsChange(Rect rect) {
        this.f5618e = true;
        super.onBoundsChange(rect);
    }

    
    public boolean onStateChange(int[] iArr) {
        boolean z2;
        boolean b02 = b0(iArr);
        boolean c02 = c0();
        if (b02 || c02) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    
    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f5614a.f5640a, rectF);
    }

    
    public void r(Canvas canvas) {
        q(canvas, this.f5628o, this.f5621h, this.f5626m, t());
    }

    
    public RectF s() {
        this.f5622i.set(getBounds());
        return this.f5622i;
    }

    public void setAlpha(int i2) {
        c cVar = this.f5614a;
        if (cVar.f5652m != i2) {
            cVar.f5652m = i2;
            K();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5614a.f5642c = colorFilter;
        K();
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f5614a.f5640a = kVar;
        invalidateSelf();
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f5614a.f5646g = colorStateList;
        c0();
        K();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f5614a;
        if (cVar.f5647h != mode) {
            cVar.f5647h = mode;
            c0();
            K();
        }
    }

    public float u() {
        return this.f5614a.f5654o;
    }

    public ColorStateList v() {
        return this.f5614a.f5643d;
    }

    public float w() {
        return this.f5614a.f5650k;
    }

    public float x() {
        return this.f5614a.f5653n;
    }

    public int y() {
        c cVar = this.f5614a;
        return (int) (((double) cVar.f5658s) * Math.sin(Math.toRadians((double) cVar.f5659t)));
    }

    public int z() {
        c cVar = this.f5614a;
        return (int) (((double) cVar.f5658s) * Math.cos(Math.toRadians((double) cVar.f5659t)));
    }

    public g(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(k.e(context, attributeSet, i2, i3).m());
    }

    protected g(c cVar) {
        this.f5615b = new m.g[4];
        this.f5616c = new m.g[4];
        this.f5617d = new BitSet(8);
        this.f5619f = new Matrix();
        this.f5620g = new Path();
        this.f5621h = new Path();
        this.f5622i = new RectF();
        this.f5623j = new RectF();
        this.f5624k = new Region();
        this.f5625l = new Region();
        Paint paint = new Paint(1);
        this.f5627n = paint;
        Paint paint2 = new Paint(1);
        this.f5628o = paint2;
        this.f5629p = new j0.a();
        this.f5631r = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.f5635v = new RectF();
        this.f5636w = true;
        this.f5614a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        c0();
        b0(getState());
        this.f5630q = new a();
    }

    public g(k kVar) {
        this(new c(kVar, (C0212a) null));
    }
}
