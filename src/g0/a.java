package g0;

import T.i;
import a0.C0087a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0116v;
import androidx.core.widget.c;

public class a extends C0116v {

    
    private static final int f5475g = i.Widget_MaterialComponents_CompoundButton_RadioButton;

    
    private static final int[][] f5476h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    
    private ColorStateList f5477e;

    
    private boolean f5478f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, T.a.f166I);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5477e == null) {
            int d2 = C0087a.d(this, T.a.f170e);
            int d3 = C0087a.d(this, T.a.colorOnSurface);
            int d4 = C0087a.d(this, T.a.colorSurface);
            int[][] iArr = f5476h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C0087a.k(d4, d2, 1.0f);
            iArr2[1] = C0087a.k(d4, d3, 0.54f);
            iArr2[2] = C0087a.k(d4, d3, 0.38f);
            iArr2[3] = C0087a.k(d4, d3, 0.38f);
            this.f5477e = new ColorStateList(iArr, iArr2);
        }
        return this.f5477e;
    }

    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5478f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        ColorStateList colorStateList;
        this.f5478f = z2;
        if (z2) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        c.d(this, colorStateList);
    }

    
    
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        
        throw new UnsupportedOperationException("Method not decompiled: g0.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
// F