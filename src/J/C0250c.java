package j;

import java.util.concurrent.Executor;


public class C0250c extends C0252e {

    
    private static volatile C0250c f5572c;

    
    private static final Executor f5573d = new C0248a();

    
    private static final Executor f5574e = new C0249b();

    
    private C0252e f5575a;

    
    private final C0252e f5576b;

    private C0250c() {
        C0251d dVar = new C0251d();
        this.f5576b = dVar;
        this.f5575a = dVar;
    }

    public static C0250c f() {
        if (f5572c != null) {
            return f5572c;
        }
        synchronized (C0250c.class) {
            try {
                if (f5572c == null) {
                    f5572c = new C0250c();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f5572c;
    }

    public void a(Runnable runnable) {
        this.f5575a.a(runnable);
    }

    public boolean b() {
        return this.f5575a.b();
    }

    public void c(Runnable runnable) {
        this.f5575a.c(runnable);
    }
}
