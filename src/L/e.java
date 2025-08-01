package l;

import java.util.LinkedHashMap;
import java.util.Locale;

public class e {

    
    private final LinkedHashMap f5765a;

    
    private int f5766b;

    
    private int f5767c;

    
    private int f5768d;

    
    private int f5769e;

    
    private int f5770f;

    
    private int f5771g;

    
    private int f5772h;

    public e(int i2) {
        if (i2 > 0) {
            this.f5767c = i2;
            this.f5765a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int e(Object obj, Object obj2) {
        int f2 = f(obj, obj2);
        if (f2 >= 0) {
            return f2;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    
    public Object a(Object obj) {
        return null;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public final java.lang.Object c(java.lang.Object r5) {
        
        throw new UnsupportedOperationException("Method not decompiled: l.e.c(java.lang.Object):java.lang.Object");
    }

    public final Object d(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f5768d++;
                this.f5766b += e(obj, obj2);
                put = this.f5765a.put(obj, obj2);
                if (put != null) {
                    this.f5766b -= e(obj, put);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (put != null) {
            b(false, obj, put, obj2);
        }
        g(this.f5767c);
        return put;
    }

    
    public int f(Object obj, Object obj2) {
        return 1;
    }

    
    
    public void g(int r5) {
        
        throw new UnsupportedOperationException("Method not decompiled: l.e.g(int):void");
    }

    public final synchronized String toString() {
        int i2;
        try {
            int i3 = this.f5771g;
            int i4 = this.f5772h + i3;
            if (i4 != 0) {
                i2 = (i3 * 100) / i4;
            } else {
                i2 = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f5767c), Integer.valueOf(this.f5771g), Integer.valueOf(this.f5772h), Integer.valueOf(i2)});
    }

    
    public void b(boolean z2, Object obj, Object obj2, Object obj3) {
    }
}
