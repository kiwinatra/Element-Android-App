package h0;

import android.graphics.Typeface;

public final class a extends f {

    
    private final Typeface f5496a;

    
    private final C0074a f5497b;

    
    private boolean f5498c;

    
    public interface C0074a {
        void a(Typeface typeface);
    }

    public a(C0074a aVar, Typeface typeface) {
        this.f5496a = typeface;
        this.f5497b = aVar;
    }

    private void d(Typeface typeface) {
        if (!this.f5498c) {
            this.f5497b.a(typeface);
        }
    }

    public void a(int i2) {
        d(this.f5496a);
    }

    public void b(Typeface typeface, boolean z2) {
        d(typeface);
    }

    public void c() {
        this.f5498c = true;
    }
}
