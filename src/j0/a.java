package j0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

public class a {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f5582i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f5583j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f5584k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f5585l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f5586a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f5587b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f5588c;

    /* renamed from: d  reason: collision with root package name */
    private int f5589d;

    /* renamed from: e  reason: collision with root package name */
    private int f5590e;

    /* renamed from: f  reason: collision with root package name */
    private int f5591f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f5592g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f5593h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        boolean z2;
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i3 = i2;
        float f4 = f3;
        if (f4 < 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        Path path = this.f5592g;
        if (z2) {
            int[] iArr = f5584k;
            iArr[0] = 0;
            iArr[1] = this.f5591f;
            iArr[2] = this.f5590e;
            iArr[3] = this.f5589d;
            float f5 = f2;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f2, f4);
            path.close();
            float f6 = (float) (-i3);
            rectF2.inset(f6, f6);
            int[] iArr2 = f5584k;
            iArr2[0] = 0;
            iArr2[1] = this.f5589d;
            iArr2[2] = this.f5590e;
            iArr2[3] = this.f5591f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f7 = 1.0f - (((float) i3) / width);
            float[] fArr = f5585l;
            fArr[1] = f7;
            fArr[2] = ((1.0f - f7) / 2.0f) + f7;
            this.f5587b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f5584k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z2) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f5593h);
            }
            canvas.drawArc(rectF, f2, f3, true, this.f5587b);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        int[] iArr = f5582i;
        iArr[0] = this.f5591f;
        iArr[1] = this.f5590e;
        iArr[2] = this.f5589d;
        Paint paint = this.f5588c;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, f5583j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f5588c);
        canvas.restore();
    }

    public Paint c() {
        return this.f5586a;
    }

    public void d(int i2) {
        this.f5589d = androidx.core.graphics.a.k(i2, 68);
        this.f5590e = androidx.core.graphics.a.k(i2, 20);
        this.f5591f = androidx.core.graphics.a.k(i2, 0);
        this.f5586a.setColor(this.f5589d);
    }

    public a(int i2) {
        this.f5592g = new Path();
        Paint paint = new Paint();
        this.f5593h = paint;
        this.f5586a = new Paint();
        d(i2);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f5587b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f5588c = new Paint(paint2);
    }
}
