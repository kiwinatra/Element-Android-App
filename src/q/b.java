package Q;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static long f160a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f161b;

    public static void a(String str) {
        c.a(str);
    }

    public static void b() {
        c.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        try {
            if (f161b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return e();
    }

    private static boolean e() {
        Class<Trace> cls = Trace.class;
        try {
            if (f161b == null) {
                f160a = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f161b = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f161b.invoke((Object) null, new Object[]{Long.valueOf(f160a)})).booleanValue();
        } catch (Exception e2) {
            c("isTagEnabled", e2);
            return false;
        }
    }
}
