package a0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.a;
import h0.b;

/* renamed from: a0.a  reason: case insensitive filesystem */
public abstract class C0087a {
    public static int a(int i2, int i3) {
        return a.k(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static int b(Context context, int i2, int i3) {
        Integer f2 = f(context, i2);
        if (f2 != null) {
            return f2.intValue();
        }
        return i3;
    }

    public static int c(Context context, int i2, String str) {
        return m(context, b.e(context, i2, str));
    }

    public static int d(View view, int i2) {
        return m(view.getContext(), b.f(view, i2));
    }

    public static int e(View view, int i2, int i3) {
        return b(view.getContext(), i2, i3);
    }

    public static Integer f(Context context, int i2) {
        TypedValue a2 = b.a(context, i2);
        if (a2 != null) {
            return Integer.valueOf(m(context, a2));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i2, ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        TypedValue a2 = b.a(context, i2);
        if (a2 != null) {
            colorStateList2 = n(context, a2);
        } else {
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            return colorStateList;
        }
        return colorStateList2;
    }

    public static ColorStateList h(Context context, int i2) {
        TypedValue a2 = b.a(context, i2);
        if (a2 == null) {
            return null;
        }
        int i3 = a2.resourceId;
        if (i3 != 0) {
            return androidx.core.content.a.b(context, i3);
        }
        int i4 = a2.data;
        if (i4 != 0) {
            return ColorStateList.valueOf(i4);
        }
        return null;
    }

    public static boolean i(int i2) {
        if (i2 == 0 || a.d(i2) <= 0.5d) {
            return false;
        }
        return true;
    }

    public static int j(int i2, int i3) {
        return a.g(i3, i2);
    }

    public static int k(int i2, int i3, float f2) {
        return j(i2, a.k(i3, Math.round(((float) Color.alpha(i3)) * f2)));
    }

    public static int l(View view, int i2, int i3, float f2) {
        return k(d(view, i2), d(view, i3), f2);
    }

    private static int m(Context context, TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        if (i2 != 0) {
            return androidx.core.content.a.a(context, i2);
        }
        return typedValue.data;
    }

    private static ColorStateList n(Context context, TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        if (i2 != 0) {
            return androidx.core.content.a.b(context, i2);
        }
        return ColorStateList.valueOf(typedValue.data);
    }
}
