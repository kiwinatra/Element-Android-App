package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.a;
import e.C0233a;
import e.i;
import e.j;

/* renamed from: g.d  reason: case insensitive filesystem */
public class C0240d extends Drawable {

    /* renamed from: m  reason: collision with root package name */
    private static final float f5459m = ((float) Math.toRadians(45.0d));

    /* renamed from: a  reason: collision with root package name */
    private final Paint f5460a;

    /* renamed from: b  reason: collision with root package name */
    private float f5461b;

    /* renamed from: c  reason: collision with root package name */
    private float f5462c;

    /* renamed from: d  reason: collision with root package name */
    private float f5463d;

    /* renamed from: e  reason: collision with root package name */
    private float f5464e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5465f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f5466g = new Path();

    /* renamed from: h  reason: collision with root package name */
    private final int f5467h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5468i = false;

    /* renamed from: j  reason: collision with root package name */
    private float f5469j;

    /* renamed from: k  reason: collision with root package name */
    private float f5470k;

    /* renamed from: l  reason: collision with root package name */
    private int f5471l = 2;

    public C0240d(Context context) {
        Paint paint = new Paint();
        this.f5460a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, j.Z0, C0233a.drawerArrowStyle, i.Base_Widget_AppCompat_DrawerArrowToggle);
        c(obtainStyledAttributes.getColor(j.d1, 0));
        b(obtainStyledAttributes.getDimension(j.h1, 0.0f));
        f(obtainStyledAttributes.getBoolean(j.g1, true));
        d((float) Math.round(obtainStyledAttributes.getDimension(j.f1, 0.0f)));
        this.f5467h = obtainStyledAttributes.getDimensionPixelSize(j.e1, 0);
        this.f5462c = (float) Math.round(obtainStyledAttributes.getDimension(j.c1, 0.0f));
        this.f5461b = (float) Math.round(obtainStyledAttributes.getDimension(j.a1, 0.0f));
        this.f5463d = obtainStyledAttributes.getDimension(j.b1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private static float a(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public void b(float f2) {
        if (this.f5460a.getStrokeWidth() != f2) {
            this.f5460a.setStrokeWidth(f2);
            this.f5470k = (float) (((double) (f2 / 2.0f)) * Math.cos((double) f5459m));
            invalidateSelf();
        }
    }

    public void c(int i2) {
        if (i2 != this.f5460a.getColor()) {
            this.f5460a.setColor(i2);
            invalidateSelf();
        }
    }

    public void d(float f2) {
        if (f2 != this.f5464e) {
            this.f5464e = f2;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i2 = this.f5471l;
        boolean z2 = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? a.f(this) == 0 : a.f(this) == 1))) {
            z2 = true;
        }
        float f2 = this.f5461b;
        float a2 = a(this.f5462c, (float) Math.sqrt((double) (f2 * f2 * 2.0f)), this.f5469j);
        float a3 = a(this.f5462c, this.f5463d, this.f5469j);
        float round = (float) Math.round(a(0.0f, this.f5470k, this.f5469j));
        float a4 = a(0.0f, f5459m, this.f5469j);
        double d2 = (double) a2;
        float a5 = a(z2 ? 0.0f : -180.0f, z2 ? 180.0f : 0.0f, this.f5469j);
        double d3 = (double) a4;
        boolean z3 = z2;
        float round2 = (float) Math.round(Math.cos(d3) * d2);
        float round3 = (float) Math.round(d2 * Math.sin(d3));
        this.f5466g.rewind();
        float a6 = a(this.f5464e + this.f5460a.getStrokeWidth(), -this.f5470k, this.f5469j);
        float f3 = (-a3) / 2.0f;
        this.f5466g.moveTo(f3 + round, 0.0f);
        this.f5466g.rLineTo(a3 - (round * 2.0f), 0.0f);
        this.f5466g.moveTo(f3, a6);
        this.f5466g.rLineTo(round2, round3);
        this.f5466g.moveTo(f3, -a6);
        this.f5466g.rLineTo(round2, -round3);
        this.f5466g.close();
        canvas.save();
        float strokeWidth = this.f5460a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f4 = this.f5464e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f4))) / 4) * 2)) + (strokeWidth * 1.5f) + f4);
        if (this.f5465f) {
            canvas2.rotate(a5 * ((float) (this.f5468i ^ z3 ? -1 : 1)));
        } else if (z3) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f5466g, this.f5460a);
        canvas.restore();
    }

    public void e(float f2) {
        if (this.f5469j != f2) {
            this.f5469j = f2;
            invalidateSelf();
        }
    }

    public void f(boolean z2) {
        if (this.f5465f != z2) {
            this.f5465f = z2;
            invalidateSelf();
        }
    }

    public void g(boolean z2) {
        if (this.f5468i != z2) {
            this.f5468i = z2;
            invalidateSelf();
        }
    }

    public int getIntrinsicHeight() {
        return this.f5467h;
    }

    public int getIntrinsicWidth() {
        return this.f5467h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
        if (i2 != this.f5460a.getAlpha()) {
            this.f5460a.setAlpha(i2);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5460a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
