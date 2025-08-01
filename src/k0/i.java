package k0;

import android.graphics.RectF;
import java.util.Arrays;

public final class i implements c {

    
    private final float f5662a;

    public i(float f2) {
        this.f5662a = f2;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    public float a(RectF rectF) {
        return this.f5662a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && this.f5662a == ((i) obj).f5662a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5662a)});
    }
}
