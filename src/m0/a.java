package m0;

import T.j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.F;
import h0.b;
import h0.c;

public class a extends F {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private void s(Resources.Theme theme, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i2, j.r3);
        int w2 = w(getContext(), obtainStyledAttributes, j.t3, j.u3);
        obtainStyledAttributes.recycle();
        if (w2 >= 0) {
            setLineHeight(w2);
        }
    }

    private static boolean t(Context context) {
        return b.b(context, T.a.textAppearanceLineHeightEnabled, true);
    }

    private static int u(Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.v3, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(j.w3, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void v(AttributeSet attributeSet, int i2, int i3) {
        int u2;
        Context context = getContext();
        if (t(context)) {
            Resources.Theme theme = context.getTheme();
            if (!x(context, theme, attributeSet, i2, i3) && (u2 = u(theme, attributeSet, i2, i3)) != -1) {
                s(theme, u2);
            }
        }
    }

    private static int w(Context context, TypedArray typedArray, int... iArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < iArr.length && i2 < 0; i3++) {
            i2 = c.c(context, typedArray, iArr[i3], -1);
        }
        return i2;
    }

    private static boolean x(Context context, Resources.Theme theme, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.v3, i2, i3);
        int w2 = w(context, obtainStyledAttributes, j.x3, j.y3);
        obtainStyledAttributes.recycle();
        if (w2 != -1) {
            return true;
        }
        return false;
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (t(context)) {
            s(context.getTheme(), i2);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(n0.a.c(context, attributeSet, i2, 0), attributeSet, i2);
        v(attributeSet, i2, 0);
    }
}
