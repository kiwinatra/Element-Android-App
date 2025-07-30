package k0;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f5609a;

    /* renamed from: b  reason: collision with root package name */
    private final float f5610b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f5609a;
            f2 += ((b) cVar).f5610b;
        }
        this.f5609a = cVar;
        this.f5610b = f2;
    }

    public float a(RectF rectF) {
        return Math.max(0.0f, this.f5609a.a(rectF) + this.f5610b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f5609a.equals(bVar.f5609a) || this.f5610b != bVar.f5610b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5609a, Float.valueOf(this.f5610b)});
    }
}
