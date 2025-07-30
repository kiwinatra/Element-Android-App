package H;

import android.text.Editable;
import androidx.emoji2.text.o;

final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f74a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Editable.Factory f75b;

    /* renamed from: c  reason: collision with root package name */
    private static Class f76c;

    private b() {
        try {
            f76c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f75b == null) {
            synchronized (f74a) {
                try {
                    if (f75b == null) {
                        f75b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f75b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class cls = f76c;
        if (cls != null) {
            return o.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
