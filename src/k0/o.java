package k0;

import W.a;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    boolean f5735a = false;

    /* renamed from: b  reason: collision with root package name */
    boolean f5736b = false;

    /* renamed from: c  reason: collision with root package name */
    k f5737c;

    /* renamed from: d  reason: collision with root package name */
    RectF f5738d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    final Path f5739e = new Path();

    public static o a(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return new r(view);
        }
        if (i2 >= 22) {
            return new q(view);
        }
        return new p();
    }

    private boolean c() {
        RectF rectF = this.f5738d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom) {
            return false;
        }
        return true;
    }

    private void j() {
        if (c() && this.f5737c != null) {
            l.k().d(this.f5737c, 1.0f, this.f5738d, this.f5739e);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void b(View view);

    public void d(Canvas canvas, a.C0008a aVar) {
        if (!i() || this.f5739e.isEmpty()) {
            aVar.a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f5739e);
        aVar.a(canvas);
        canvas.restore();
    }

    public void e(View view, RectF rectF) {
        this.f5738d = rectF;
        j();
        b(view);
    }

    public void f(View view, k kVar) {
        this.f5737c = kVar;
        j();
        b(view);
    }

    public void g(View view, boolean z2) {
        if (z2 != this.f5735a) {
            this.f5735a = z2;
            b(view);
        }
    }

    public void h(View view, boolean z2) {
        this.f5736b = z2;
        b(view);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean i();
}
