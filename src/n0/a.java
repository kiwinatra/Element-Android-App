package n0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;

public abstract class a {

    
    private static final int[] f5909a = {16842752, T.a.theme};

    
    private static final int[] f5910b = {T.a.materialThemeOverlay};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5909a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return resourceId;
        }
        return resourceId2;
    }

    private static int b(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5910b, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i2, int i3) {
        boolean z2;
        int b2 = b(context, attributeSet, i2, i3);
        if (!(context instanceof d) || ((d) context).c() != b2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (b2 == 0 || z2) {
            return context;
        }
        d dVar = new d(context, b2);
        int a2 = a(context, attributeSet);
        if (a2 != 0) {
            dVar.getTheme().applyStyle(a2, true);
        }
        return dVar;
    }
}
