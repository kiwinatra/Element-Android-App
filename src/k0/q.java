package k0;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

class q extends o {

    /* renamed from: f  reason: collision with root package name */
    private boolean f5740f = false;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public float f5741g = 0.0f;

    class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            q qVar = q.this;
            if (qVar.f5737c != null && !qVar.f5738d.isEmpty()) {
                q qVar2 = q.this;
                RectF rectF = qVar2.f5738d;
                outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, qVar2.f5741g);
            }
        }
    }

    q(View view) {
        m(view);
    }

    private float l() {
        RectF rectF;
        k kVar = this.f5737c;
        if (kVar == null || (rectF = this.f5738d) == null) {
            return 0.0f;
        }
        return kVar.f5670f.a(rectF);
    }

    private void m(View view) {
        view.setOutlineProvider(new a());
    }

    private boolean n() {
        k kVar;
        if (this.f5738d.isEmpty() || (kVar = this.f5737c) == null) {
            return false;
        }
        return kVar.u(this.f5738d);
    }

    private boolean o() {
        k kVar;
        RectF rectF;
        float f2;
        float f3;
        float f4;
        float f5;
        if (!this.f5738d.isEmpty() && (kVar = this.f5737c) != null && this.f5736b && !kVar.u(this.f5738d) && p(this.f5737c)) {
            float a2 = this.f5737c.r().a(this.f5738d);
            float a3 = this.f5737c.t().a(this.f5738d);
            float a4 = this.f5737c.j().a(this.f5738d);
            float a5 = this.f5737c.l().a(this.f5738d);
            int i2 = (a2 > 0.0f ? 1 : (a2 == 0.0f ? 0 : -1));
            if (i2 == 0 && a4 == 0.0f && a3 == a5) {
                RectF rectF2 = this.f5738d;
                rectF2.set(rectF2.left - a3, rectF2.top, rectF2.right, rectF2.bottom);
                this.f5741g = a3;
                return true;
            } else if (i2 == 0 && a3 == 0.0f && a4 == a5) {
                RectF rectF3 = this.f5738d;
                rectF3.set(rectF3.left, rectF3.top - a4, rectF3.right, rectF3.bottom);
                this.f5741g = a4;
                return true;
            } else {
                if (a3 == 0.0f && a5 == 0.0f && a2 == a4) {
                    rectF = this.f5738d;
                    f2 = rectF.left;
                    f3 = rectF.top;
                    f4 = rectF.right + a2;
                    f5 = rectF.bottom;
                } else if (a4 == 0.0f && a5 == 0.0f && a2 == a3) {
                    rectF = this.f5738d;
                    f2 = rectF.left;
                    f3 = rectF.top;
                    f4 = rectF.right;
                    f5 = rectF.bottom + a2;
                }
                rectF.set(f2, f3, f4, f5);
                this.f5741g = a2;
                return true;
            }
        }
        return false;
    }

    private static boolean p(k kVar) {
        if (!(kVar.q() instanceof j) || !(kVar.s() instanceof j) || !(kVar.i() instanceof j) || !(kVar.k() instanceof j)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void b(View view) {
        boolean z2;
        this.f5741g = l();
        if (n() || o()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f5740f = z2;
        view.setClipToOutline(!i());
        if (i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        if (!this.f5740f || this.f5735a) {
            return true;
        }
        return false;
    }
}
