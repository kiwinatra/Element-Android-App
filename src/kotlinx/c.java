package f0;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final d f5379a;

    /* renamed from: b  reason: collision with root package name */
    private final b f5380b;

    /* renamed from: c  reason: collision with root package name */
    private final View f5381c;

    private static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private OnBackInvokedCallback f5382a;

        private b() {
        }

        public void a(b bVar, View view, boolean z2) {
            OnBackInvokedDispatcher a2;
            int i2;
            if (this.f5382a == null && (a2 = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback c2 = c(bVar);
                this.f5382a = c2;
                if (z2) {
                    i2 = 1000000;
                } else {
                    i2 = 0;
                }
                a2.registerOnBackInvokedCallback(i2, c2);
            }
        }

        public void b(View view) {
            OnBackInvokedDispatcher a2 = view.findOnBackInvokedDispatcher();
            if (a2 != null) {
                a2.unregisterOnBackInvokedCallback(this.f5382a);
                this.f5382a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public OnBackInvokedCallback c(b bVar) {
            Objects.requireNonNull(bVar);
            return new e(bVar);
        }

        /* access modifiers changed from: package-private */
        public boolean d() {
            if (this.f5382a != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: f0.c$c  reason: collision with other inner class name */
    private static class C0071c extends b {

        /* renamed from: f0.c$c$a */
        class a implements OnBackAnimationCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f5383a;

            a(b bVar) {
                this.f5383a = bVar;
            }

            public void onBackCancelled() {
                if (C0071c.this.d()) {
                    this.f5383a.d();
                }
            }

            public void onBackInvoked() {
                this.f5383a.a();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (C0071c.this.d()) {
                    this.f5383a.c(new androidx.activity.b(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (C0071c.this.d()) {
                    this.f5383a.b(new androidx.activity.b(backEvent));
                }
            }
        }

        private C0071c() {
            super();
        }

        /* access modifiers changed from: package-private */
        public OnBackInvokedCallback c(b bVar) {
            return new a(bVar);
        }
    }

    private interface d {
        void a(b bVar, View view, boolean z2);

        void b(View view);
    }

    public c(View view) {
        this((b) view, view);
    }

    private static d a() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            return new C0071c();
        }
        if (i2 >= 33) {
            return new b();
        }
        return null;
    }

    private void c(boolean z2) {
        d dVar = this.f5379a;
        if (dVar != null) {
            dVar.a(this.f5380b, this.f5381c, z2);
        }
    }

    public boolean b() {
        if (this.f5379a != null) {
            return true;
        }
        return false;
    }

    public void d() {
        c(true);
    }

    public void e() {
        d dVar = this.f5379a;
        if (dVar != null) {
            dVar.b(this.f5381c);
        }
    }

    public c(b bVar, View view) {
        this.f5379a = a();
        this.f5380b = bVar;
        this.f5381c = view;
    }
}
