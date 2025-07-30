package i0;

import a0.C0087a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f5560a = true;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f5561b = {16842919};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f5562c = {16843623, 16842908};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f5563d = {16842908};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f5564e = {16843623};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f5565f = {16842913, 16842919};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f5566g = {16842913, 16843623, 16842908};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f5567h = {16842913, 16842908};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f5568i = {16842913, 16843623};

    /* renamed from: j  reason: collision with root package name */
    private static final int[] f5569j = {16842913};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f5570k = {16842910, 16842919};

    /* renamed from: l  reason: collision with root package name */
    static final String f5571l = b.class.getSimpleName();

    private static class a {
        /* access modifiers changed from: private */
        public static Drawable b(Context context, int i2) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(C0087a.g(context, T.a.f171f, ColorStateList.valueOf(0)), (Drawable) null, new InsetDrawable(gradientDrawable, i2, i2, i2, i2));
        }
    }

    public static Drawable a(Context context, int i2) {
        return a.b(context, i2);
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f5570k, 0)) != 0) {
            Log.w(f5571l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean c(int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z2 = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z3 = true;
            }
        }
        if (!z2 || !z3) {
            return false;
        }
        return true;
    }
}
