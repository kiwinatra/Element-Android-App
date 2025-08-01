package k0;

import T.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

public class k {

    
    public static final c f5664m = new i(0.5f);

    
    d f5665a;

    
    d f5666b;

    
    d f5667c;

    
    d f5668d;

    
    c f5669e;

    
    c f5670f;

    
    c f5671g;

    
    c f5672h;

    
    f f5673i;

    
    f f5674j;

    
    f f5675k;

    
    f f5676l;

    public static final class b {
        

        
        public d f5677a = h.b();
        

        
        public d f5678b = h.b();
        

        
        public d f5679c = h.b();
        

        
        public d f5680d = h.b();
        

        
        public c f5681e = new a(0.0f);
        

        
        public c f5682f = new a(0.0f);
        

        
        public c f5683g = new a(0.0f);
        

        
        public c f5684h = new a(0.0f);
        

        
        public f f5685i = h.c();
        

        
        public f f5686j = h.c();
        

        
        public f f5687k = h.c();
        

        
        public f f5688l = h.c();

        public b() {
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f5663a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f5611a;
            }
            return -1.0f;
        }

        public b A(float f2) {
            this.f5681e = new a(f2);
            return this;
        }

        public b B(c cVar) {
            this.f5681e = cVar;
            return this;
        }

        public b C(int i2, c cVar) {
            return D(h.a(i2)).F(cVar);
        }

        public b D(d dVar) {
            this.f5678b = dVar;
            float n2 = n(dVar);
            if (n2 != -1.0f) {
                E(n2);
            }
            return this;
        }

        public b E(float f2) {
            this.f5682f = new a(f2);
            return this;
        }

        public b F(c cVar) {
            this.f5682f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f2) {
            return A(f2).E(f2).w(f2).s(f2);
        }

        public b p(c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i2, c cVar) {
            return r(h.a(i2)).t(cVar);
        }

        public b r(d dVar) {
            this.f5680d = dVar;
            float n2 = n(dVar);
            if (n2 != -1.0f) {
                s(n2);
            }
            return this;
        }

        public b s(float f2) {
            this.f5684h = new a(f2);
            return this;
        }

        public b t(c cVar) {
            this.f5684h = cVar;
            return this;
        }

        public b u(int i2, c cVar) {
            return v(h.a(i2)).x(cVar);
        }

        public b v(d dVar) {
            this.f5679c = dVar;
            float n2 = n(dVar);
            if (n2 != -1.0f) {
                w(n2);
            }
            return this;
        }

        public b w(float f2) {
            this.f5683g = new a(f2);
            return this;
        }

        public b x(c cVar) {
            this.f5683g = cVar;
            return this;
        }

        public b y(int i2, c cVar) {
            return z(h.a(i2)).B(cVar);
        }

        public b z(d dVar) {
            this.f5677a = dVar;
            float n2 = n(dVar);
            if (n2 != -1.0f) {
                A(n2);
            }
            return this;
        }

        public b(k kVar) {
            this.f5677a = kVar.f5665a;
            this.f5678b = kVar.f5666b;
            this.f5679c = kVar.f5667c;
            this.f5680d = kVar.f5668d;
            this.f5681e = kVar.f5669e;
            this.f5682f = kVar.f5670f;
            this.f5683g = kVar.f5671g;
            this.f5684h = kVar.f5672h;
            this.f5685i = kVar.f5673i;
            this.f5686j = kVar.f5674j;
            this.f5687k = kVar.f5675k;
            this.f5688l = kVar.f5676l;
        }
    }

    public interface c {
        c a(c cVar);
    }

    public k() {
        this.f5665a = h.b();
        this.f5666b = h.b();
        this.f5667c = h.b();
        this.f5668d = h.b();
        this.f5669e = new a(0.0f);
        this.f5670f = new a(0.0f);
        this.f5671g = new a(0.0f);
        this.f5672h = new a(0.0f);
        this.f5673i = h.c();
        this.f5674j = h.c();
        this.f5675k = h.c();
        this.f5676l = h.c();
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i2, int i3) {
        return c(context, i2, i3, 0);
    }

    private static b c(Context context, int i2, int i3, int i4) {
        return d(context, i2, i3, new a((float) i4));
    }

    private static b d(Context context, int i2, int i3, c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(j.R4);
        try {
            int i4 = obtainStyledAttributes.getInt(j.S4, 0);
            int i5 = obtainStyledAttributes.getInt(j.V4, i4);
            int i6 = obtainStyledAttributes.getInt(j.W4, i4);
            int i7 = obtainStyledAttributes.getInt(j.U4, i4);
            int i8 = obtainStyledAttributes.getInt(j.T4, i4);
            c m2 = m(obtainStyledAttributes, j.X4, cVar);
            c m3 = m(obtainStyledAttributes, j.a5, m2);
            c m4 = m(obtainStyledAttributes, j.b5, m2);
            c m5 = m(obtainStyledAttributes, j.Z4, m2);
            return new b().y(i5, m3).C(i6, m4).u(i7, m5).q(i8, m(obtainStyledAttributes, j.Y4, m2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i2, int i3) {
        return f(context, attributeSet, i2, i3, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        return g(context, attributeSet, i2, i3, new a((float) i4));
    }

    public static b g(Context context, AttributeSet attributeSet, int i2, int i3, c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.n3, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(j.o3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(j.p3, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static c m(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i3 = peekValue.type;
        if (i3 == 5) {
            return new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i3 == 6) {
            return new i(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public f h() {
        return this.f5675k;
    }

    public d i() {
        return this.f5668d;
    }

    public c j() {
        return this.f5672h;
    }

    public d k() {
        return this.f5667c;
    }

    public c l() {
        return this.f5671g;
    }

    public f n() {
        return this.f5676l;
    }

    public f o() {
        return this.f5674j;
    }

    public f p() {
        return this.f5673i;
    }

    public d q() {
        return this.f5665a;
    }

    public c r() {
        return this.f5669e;
    }

    public d s() {
        return this.f5666b;
    }

    public c t() {
        return this.f5670f;
    }

    public boolean u(RectF rectF) {
        boolean z2;
        boolean z3;
        boolean z4;
        Class<f> cls = f.class;
        if (!this.f5676l.getClass().equals(cls) || !this.f5674j.getClass().equals(cls) || !this.f5673i.getClass().equals(cls) || !this.f5675k.getClass().equals(cls)) {
            z2 = false;
        } else {
            z2 = true;
        }
        float a2 = this.f5669e.a(rectF);
        if (this.f5670f.a(rectF) == a2 && this.f5672h.a(rectF) == a2 && this.f5671g.a(rectF) == a2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(this.f5666b instanceof j) || !(this.f5665a instanceof j) || !(this.f5667c instanceof j) || !(this.f5668d instanceof j)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }

    public b v() {
        return new b(this);
    }

    public k w(float f2) {
        return v().o(f2).m();
    }

    public k x(c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f5665a = bVar.f5677a;
        this.f5666b = bVar.f5678b;
        this.f5667c = bVar.f5679c;
        this.f5668d = bVar.f5680d;
        this.f5669e = bVar.f5681e;
        this.f5670f = bVar.f5682f;
        this.f5671g = bVar.f5683g;
        this.f5672h = bVar.f5684h;
        this.f5673i = bVar.f5685i;
        this.f5674j = bVar.f5686j;
        this.f5675k = bVar.f5687k;
        this.f5676l = bVar.f5688l;
    }
}
