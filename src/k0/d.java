package k0;

import android.graphics.RectF;

public abstract class d {
    public abstract void a(m mVar, float f2, float f3, float f4);

    public void b(m mVar, float f2, float f3, RectF rectF, c cVar) {
        a(mVar, f2, f3, cVar.a(rectF));
    }
}
