package k0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f5689a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f5690b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f5691c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f5692d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final Path f5693e = new Path();

    /* renamed from: f  reason: collision with root package name */
    private final Path f5694f = new Path();

    /* renamed from: g  reason: collision with root package name */
    private final m f5695g = new m();

    /* renamed from: h  reason: collision with root package name */
    private final float[] f5696h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    private final float[] f5697i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    private final Path f5698j = new Path();

    /* renamed from: k  reason: collision with root package name */
    private final Path f5699k = new Path();

    /* renamed from: l  reason: collision with root package name */
    private boolean f5700l = true;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final l f5701a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i2);

        void b(m mVar, Matrix matrix, int i2);
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final k f5702a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f5703b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f5704c;

        /* renamed from: d  reason: collision with root package name */
        public final b f5705d;

        /* renamed from: e  reason: collision with root package name */
        public final float f5706e;

        c(k kVar, float f2, RectF rectF, b bVar, Path path) {
            this.f5705d = bVar;
            this.f5702a = kVar;
            this.f5706e = f2;
            this.f5704c = rectF;
            this.f5703b = path;
        }
    }

    public l() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f5689a[i2] = new m();
            this.f5690b[i2] = new Matrix();
            this.f5691c[i2] = new Matrix();
        }
    }

    private float a(int i2) {
        return (float) (((i2 + 1) % 4) * 90);
    }

    private void b(c cVar, int i2) {
        this.f5696h[0] = this.f5689a[i2].k();
        this.f5696h[1] = this.f5689a[i2].l();
        this.f5690b[i2].mapPoints(this.f5696h);
        Path path = cVar.f5703b;
        float[] fArr = this.f5696h;
        if (i2 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f5689a[i2].d(this.f5690b[i2], cVar.f5703b);
        b bVar = cVar.f5705d;
        if (bVar != null) {
            bVar.b(this.f5689a[i2], this.f5690b[i2], i2);
        }
    }

    private void c(c cVar, int i2) {
        m mVar;
        Matrix matrix;
        Path path;
        int i3 = (i2 + 1) % 4;
        this.f5696h[0] = this.f5689a[i2].i();
        this.f5696h[1] = this.f5689a[i2].j();
        this.f5690b[i2].mapPoints(this.f5696h);
        this.f5697i[0] = this.f5689a[i3].k();
        this.f5697i[1] = this.f5689a[i3].l();
        this.f5690b[i3].mapPoints(this.f5697i);
        float[] fArr = this.f5696h;
        float f2 = fArr[0];
        float[] fArr2 = this.f5697i;
        float max = Math.max(((float) Math.hypot((double) (f2 - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i4 = i(cVar.f5704c, i2);
        this.f5695g.n(0.0f, 0.0f);
        f j2 = j(i2, cVar.f5702a);
        j2.b(max, i4, cVar.f5706e, this.f5695g);
        this.f5698j.reset();
        this.f5695g.d(this.f5691c[i2], this.f5698j);
        if (!this.f5700l || (!j2.a() && !l(this.f5698j, i2) && !l(this.f5698j, i3))) {
            mVar = this.f5695g;
            matrix = this.f5691c[i2];
            path = cVar.f5703b;
        } else {
            Path path2 = this.f5698j;
            path2.op(path2, this.f5694f, Path.Op.DIFFERENCE);
            this.f5696h[0] = this.f5695g.k();
            this.f5696h[1] = this.f5695g.l();
            this.f5691c[i2].mapPoints(this.f5696h);
            Path path3 = this.f5693e;
            float[] fArr3 = this.f5696h;
            path3.moveTo(fArr3[0], fArr3[1]);
            mVar = this.f5695g;
            matrix = this.f5691c[i2];
            path = this.f5693e;
        }
        mVar.d(matrix, path);
        b bVar = cVar.f5705d;
        if (bVar != null) {
            bVar.a(this.f5695g, this.f5691c[i2], i2);
        }
    }

    private void f(int i2, RectF rectF, PointF pointF) {
        float f2;
        float f3;
        float f4;
        if (i2 == 1) {
            f2 = rectF.right;
            f4 = rectF.bottom;
        } else if (i2 != 2) {
            if (i2 != 3) {
                f3 = rectF.right;
            } else {
                f3 = rectF.left;
            }
            f4 = rectF.top;
        } else {
            f2 = rectF.left;
            f4 = rectF.bottom;
        }
        pointF.set(f3, f4);
    }

    private c g(int i2, k kVar) {
        if (i2 == 1) {
            return kVar.l();
        }
        if (i2 == 2) {
            return kVar.j();
        }
        if (i2 != 3) {
            return kVar.t();
        }
        return kVar.r();
    }

    private d h(int i2, k kVar) {
        if (i2 == 1) {
            return kVar.k();
        }
        if (i2 == 2) {
            return kVar.i();
        }
        if (i2 != 3) {
            return kVar.s();
        }
        return kVar.q();
    }

    private float i(RectF rectF, int i2) {
        float centerX;
        float f2;
        float[] fArr = this.f5696h;
        m mVar = this.f5689a[i2];
        fArr[0] = mVar.f5709c;
        fArr[1] = mVar.f5710d;
        this.f5690b[i2].mapPoints(fArr);
        if (i2 == 1 || i2 == 3) {
            centerX = rectF.centerX();
            f2 = this.f5696h[0];
        } else {
            centerX = rectF.centerY();
            f2 = this.f5696h[1];
        }
        return Math.abs(centerX - f2);
    }

    private f j(int i2, k kVar) {
        if (i2 == 1) {
            return kVar.h();
        }
        if (i2 == 2) {
            return kVar.n();
        }
        if (i2 != 3) {
            return kVar.o();
        }
        return kVar.p();
    }

    public static l k() {
        return a.f5701a;
    }

    private boolean l(Path path, int i2) {
        this.f5699k.reset();
        this.f5689a[i2].d(this.f5690b[i2], this.f5699k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f5699k.computeBounds(rectF, true);
        path.op(this.f5699k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    private void m(c cVar, int i2) {
        h(i2, cVar.f5702a).b(this.f5689a[i2], 90.0f, cVar.f5706e, cVar.f5704c, g(i2, cVar.f5702a));
        float a2 = a(i2);
        this.f5690b[i2].reset();
        f(i2, cVar.f5704c, this.f5692d);
        Matrix matrix = this.f5690b[i2];
        PointF pointF = this.f5692d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f5690b[i2].preRotate(a2);
    }

    private void n(int i2) {
        this.f5696h[0] = this.f5689a[i2].i();
        this.f5696h[1] = this.f5689a[i2].j();
        this.f5690b[i2].mapPoints(this.f5696h);
        float a2 = a(i2);
        this.f5691c[i2].reset();
        Matrix matrix = this.f5691c[i2];
        float[] fArr = this.f5696h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f5691c[i2].preRotate(a2);
    }

    public void d(k kVar, float f2, RectF rectF, Path path) {
        e(kVar, f2, rectF, (b) null, path);
    }

    public void e(k kVar, float f2, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f5693e.rewind();
        this.f5694f.rewind();
        this.f5694f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f2, rectF, bVar, path);
        for (int i2 = 0; i2 < 4; i2++) {
            m(cVar, i2);
            n(i2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            b(cVar, i3);
            c(cVar, i3);
        }
        path.close();
        this.f5693e.close();
        if (!this.f5693e.isEmpty()) {
            path.op(this.f5693e, Path.Op.UNION);
        }
    }
}
