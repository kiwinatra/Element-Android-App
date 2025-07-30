package k0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public float f5707a;

    /* renamed from: b  reason: collision with root package name */
    public float f5708b;

    /* renamed from: c  reason: collision with root package name */
    public float f5709c;

    /* renamed from: d  reason: collision with root package name */
    public float f5710d;

    /* renamed from: e  reason: collision with root package name */
    public float f5711e;

    /* renamed from: f  reason: collision with root package name */
    public float f5712f;

    /* renamed from: g  reason: collision with root package name */
    private final List f5713g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List f5714h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private boolean f5715i;

    class a extends g {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f5716c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Matrix f5717d;

        a(List list, Matrix matrix) {
            this.f5716c = list;
            this.f5717d = matrix;
        }

        public void a(Matrix matrix, j0.a aVar, int i2, Canvas canvas) {
            for (g a2 : this.f5716c) {
                a2.a(this.f5717d, aVar, i2, canvas);
            }
        }
    }

    static class b extends g {

        /* renamed from: c  reason: collision with root package name */
        private final d f5719c;

        public b(d dVar) {
            this.f5719c = dVar;
        }

        public void a(Matrix matrix, j0.a aVar, int i2, Canvas canvas) {
            float h2 = this.f5719c.m();
            float i3 = this.f5719c.n();
            aVar.a(canvas, matrix, new RectF(this.f5719c.k(), this.f5719c.o(), this.f5719c.l(), this.f5719c.j()), i2, h2, i3);
        }
    }

    static class c extends g {

        /* renamed from: c  reason: collision with root package name */
        private final e f5720c;

        /* renamed from: d  reason: collision with root package name */
        private final float f5721d;

        /* renamed from: e  reason: collision with root package name */
        private final float f5722e;

        public c(e eVar, float f2, float f3) {
            this.f5720c = eVar;
            this.f5721d = f2;
            this.f5722e = f3;
        }

        public void a(Matrix matrix, j0.a aVar, int i2, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f5720c.f5731c - this.f5722e), (double) (this.f5720c.f5730b - this.f5721d)), 0.0f);
            this.f5734a.set(matrix);
            this.f5734a.preTranslate(this.f5721d, this.f5722e);
            this.f5734a.preRotate(c());
            aVar.b(canvas, this.f5734a, rectF, i2);
        }

        /* access modifiers changed from: package-private */
        public float c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f5720c.f5731c - this.f5722e) / (this.f5720c.f5730b - this.f5721d))));
        }
    }

    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f5723h = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public float f5724b;

        /* renamed from: c  reason: collision with root package name */
        public float f5725c;

        /* renamed from: d  reason: collision with root package name */
        public float f5726d;

        /* renamed from: e  reason: collision with root package name */
        public float f5727e;

        /* renamed from: f  reason: collision with root package name */
        public float f5728f;

        /* renamed from: g  reason: collision with root package name */
        public float f5729g;

        public d(float f2, float f3, float f4, float f5) {
            q(f2);
            u(f3);
            r(f4);
            p(f5);
        }

        /* access modifiers changed from: private */
        public float j() {
            return this.f5727e;
        }

        /* access modifiers changed from: private */
        public float k() {
            return this.f5724b;
        }

        /* access modifiers changed from: private */
        public float l() {
            return this.f5726d;
        }

        /* access modifiers changed from: private */
        public float m() {
            return this.f5728f;
        }

        /* access modifiers changed from: private */
        public float n() {
            return this.f5729g;
        }

        /* access modifiers changed from: private */
        public float o() {
            return this.f5725c;
        }

        private void p(float f2) {
            this.f5727e = f2;
        }

        private void q(float f2) {
            this.f5724b = f2;
        }

        private void r(float f2) {
            this.f5726d = f2;
        }

        /* access modifiers changed from: private */
        public void s(float f2) {
            this.f5728f = f2;
        }

        /* access modifiers changed from: private */
        public void t(float f2) {
            this.f5729g = f2;
        }

        private void u(float f2) {
            this.f5725c = f2;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5732a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f5723h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f5730b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public float f5731c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5732a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f5730b, this.f5731c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f5732a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* renamed from: b  reason: collision with root package name */
        static final Matrix f5733b = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        final Matrix f5734a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, j0.a aVar, int i2, Canvas canvas);

        public final void b(j0.a aVar, int i2, Canvas canvas) {
            a(f5733b, aVar, i2, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f2) {
        if (g() != f2) {
            float g2 = ((f2 - g()) + 360.0f) % 360.0f;
            if (g2 <= 180.0f) {
                d dVar = new d(i(), j(), i(), j());
                dVar.s(g());
                dVar.t(g2);
                this.f5714h.add(new b(dVar));
                p(f2);
            }
        }
    }

    private void c(g gVar, float f2, float f3) {
        b(f2);
        this.f5714h.add(gVar);
        p(f3);
    }

    private float g() {
        return this.f5711e;
    }

    private float h() {
        return this.f5712f;
    }

    private void p(float f2) {
        this.f5711e = f2;
    }

    private void q(float f2) {
        this.f5712f = f2;
    }

    private void r(float f2) {
        this.f5709c = f2;
    }

    private void s(float f2) {
        this.f5710d = f2;
    }

    private void t(float f2) {
        this.f5707a = f2;
    }

    private void u(float f2) {
        this.f5708b = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        boolean z2;
        float f8;
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.f5713g.add(dVar);
        b bVar = new b(dVar);
        float f9 = f6 + f7;
        if (f7 < 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        if (z2) {
            f8 = (180.0f + f9) % 360.0f;
        } else {
            f8 = f9;
        }
        c(bVar, f6, f8);
        double d2 = (double) f9;
        r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        s(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f5713g.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((f) this.f5713g.get(i2)).a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f5715i;
    }

    /* access modifiers changed from: package-private */
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f5714h), new Matrix(matrix));
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f5709c;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f5710d;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.f5707a;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f5708b;
    }

    public void m(float f2, float f3) {
        e eVar = new e();
        float unused = eVar.f5730b = f2;
        float unused2 = eVar.f5731c = f3;
        this.f5713g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f2);
        s(f3);
    }

    public void n(float f2, float f3) {
        o(f2, f3, 270.0f, 0.0f);
    }

    public void o(float f2, float f3, float f4, float f5) {
        t(f2);
        u(f3);
        r(f2);
        s(f3);
        p(f4);
        q((f4 + f5) % 360.0f);
        this.f5713g.clear();
        this.f5714h.clear();
        this.f5715i = false;
    }
}
