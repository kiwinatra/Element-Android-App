package h0;

import T.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.h;

public class d {

    
    public final ColorStateList f5499a;

    
    public final ColorStateList f5500b;

    
    public final ColorStateList f5501c;

    
    public final String f5502d;

    
    public final int f5503e;

    
    public final int f5504f;

    
    public final boolean f5505g;

    
    public final float f5506h;

    
    public final float f5507i;

    
    public final float f5508j;

    
    public final boolean f5509k;

    
    public final float f5510l;

    
    private ColorStateList f5511m;

    
    private float f5512n;

    
    private final int f5513o;
    

    
    public boolean f5514p = false;
    

    
    public Typeface f5515q;

    class a extends h.e {

        
        final  f f5516a;

        a(f fVar) {
            this.f5516a = fVar;
        }

        public void h(int i2) {
            boolean unused = d.this.f5514p = true;
            this.f5516a.a(i2);
        }

        public void i(Typeface typeface) {
            d dVar = d.this;
            Typeface unused = dVar.f5515q = Typeface.create(typeface, dVar.f5503e);
            boolean unused2 = d.this.f5514p = true;
            this.f5516a.b(d.this.f5515q, false);
        }
    }

    class b extends f {

        
        final  Context f5518a;

        
        final  TextPaint f5519b;

        
        final  f f5520c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f5518a = context;
            this.f5519b = textPaint;
            this.f5520c = fVar;
        }

        public void a(int i2) {
            this.f5520c.a(i2);
        }

        public void b(Typeface typeface, boolean z2) {
            d.this.p(this.f5518a, this.f5519b, typeface);
            this.f5520c.b(typeface, z2);
        }
    }

    public d(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, j.F5);
        l(obtainStyledAttributes.getDimension(j.G5, 0.0f));
        k(c.a(context, obtainStyledAttributes, j.J5));
        this.f5499a = c.a(context, obtainStyledAttributes, j.K5);
        this.f5500b = c.a(context, obtainStyledAttributes, j.L5);
        this.f5503e = obtainStyledAttributes.getInt(j.I5, 0);
        this.f5504f = obtainStyledAttributes.getInt(j.H5, 1);
        int e2 = c.e(obtainStyledAttributes, j.R5, j.Q5);
        this.f5513o = obtainStyledAttributes.getResourceId(e2, 0);
        this.f5502d = obtainStyledAttributes.getString(e2);
        this.f5505g = obtainStyledAttributes.getBoolean(j.S5, false);
        this.f5501c = c.a(context, obtainStyledAttributes, j.M5);
        this.f5506h = obtainStyledAttributes.getFloat(j.N5, 0.0f);
        this.f5507i = obtainStyledAttributes.getFloat(j.O5, 0.0f);
        this.f5508j = obtainStyledAttributes.getFloat(j.P5, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, j.r3);
        int i3 = j.s3;
        this.f5509k = obtainStyledAttributes2.hasValue(i3);
        this.f5510l = obtainStyledAttributes2.getFloat(i3, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        Typeface typeface;
        String str;
        if (this.f5515q == null && (str = this.f5502d) != null) {
            this.f5515q = Typeface.create(str, this.f5503e);
        }
        if (this.f5515q == null) {
            int i2 = this.f5504f;
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                typeface = Typeface.SERIF;
            } else if (i2 != 3) {
                typeface = Typeface.DEFAULT;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.f5515q = typeface;
            this.f5515q = Typeface.create(this.f5515q, this.f5503e);
        }
    }

    private boolean m(Context context) {
        Typeface typeface;
        if (e.a()) {
            return true;
        }
        int i2 = this.f5513o;
        if (i2 != 0) {
            typeface = h.c(context, i2);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public Typeface e() {
        d();
        return this.f5515q;
    }

    public Typeface f(Context context) {
        if (this.f5514p) {
            return this.f5515q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g2 = h.g(context, this.f5513o);
                this.f5515q = g2;
                if (g2 != null) {
                    this.f5515q = Typeface.create(g2, this.f5503e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f5502d, e2);
            }
        }
        d();
        this.f5514p = true;
        return this.f5515q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i2 = this.f5513o;
        if (i2 == 0) {
            this.f5514p = true;
        }
        if (this.f5514p) {
            fVar.b(this.f5515q, true);
            return;
        }
        try {
            h.i(context, i2, new a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f5514p = true;
            fVar.a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f5502d, e2);
            this.f5514p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f5511m;
    }

    public float j() {
        return this.f5512n;
    }

    public void k(ColorStateList colorStateList) {
        this.f5511m = colorStateList;
    }

    public void l(float f2) {
        this.f5512n = f2;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        int i2;
        int i3;
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f5511m;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i2 = -16777216;
        }
        textPaint.setColor(i2);
        float f2 = this.f5508j;
        float f3 = this.f5506h;
        float f4 = this.f5507i;
        ColorStateList colorStateList2 = this.f5501c;
        if (colorStateList2 != null) {
            i3 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i3 = 0;
        }
        textPaint.setShadowLayer(f2, f3, f4, i3);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z2;
        float f2;
        Typeface a2 = j.a(context, typeface);
        if (a2 != null) {
            typeface = a2;
        }
        textPaint.setTypeface(typeface);
        int i2 = this.f5503e & (~typeface.getStyle());
        if ((i2 & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        textPaint.setFakeBoldText(z2);
        if ((i2 & 2) != 0) {
            f2 = -0.25f;
        } else {
            f2 = 0.0f;
        }
        textPaint.setTextSkewX(f2);
        textPaint.setTextSize(this.f5512n);
        if (this.f5509k) {
            textPaint.setLetterSpacing(this.f5510l);
        }
    }
}
