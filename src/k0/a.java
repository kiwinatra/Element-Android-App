package k0;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f5608a;

    public a(float f2) {
        this.f5608a = f2;
    }

    public float a(RectF rectF) {
        return this.f5608a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f5608a == ((a) obj).f5608a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5608a)});
    }
}
