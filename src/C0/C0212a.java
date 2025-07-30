package c0;

import T.a;
import a0.C0087a;
import android.content.Context;
import android.graphics.Color;
import h0.b;

/* renamed from: c0.a  reason: case insensitive filesystem */
public class C0212a {

    /* renamed from: f  reason: collision with root package name */
    private static final int f4141f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4142a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4143b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4144c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4145d;

    /* renamed from: e  reason: collision with root package name */
    private final float f4146e;

    public C0212a(Context context) {
        this(b.b(context, a.elevationOverlayEnabled, false), C0087a.b(context, a.elevationOverlayColor, 0), C0087a.b(context, a.elevationOverlayAccentColor, 0), C0087a.b(context, a.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i2) {
        if (androidx.core.graphics.a.k(i2, 255) == this.f4145d) {
            return true;
        }
        return false;
    }

    public float a(float f2) {
        float f3 = this.f4146e;
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f2 / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i2, float f2) {
        int i3;
        float a2 = a(f2);
        int alpha = Color.alpha(i2);
        int k2 = C0087a.k(androidx.core.graphics.a.k(i2, 255), this.f4143b, a2);
        if (a2 > 0.0f && (i3 = this.f4144c) != 0) {
            k2 = C0087a.j(k2, androidx.core.graphics.a.k(i3, f4141f));
        }
        return androidx.core.graphics.a.k(k2, alpha);
    }

    public int c(int i2, float f2) {
        if (!this.f4142a || !e(i2)) {
            return i2;
        }
        return b(i2, f2);
    }

    public boolean d() {
        return this.f4142a;
    }

    public C0212a(boolean z2, int i2, int i3, int i4, float f2) {
        this.f4142a = z2;
        this.f4143b = i2;
        this.f4144c = i3;
        this.f4145d = i4;
        this.f4146e = f2;
    }
}
