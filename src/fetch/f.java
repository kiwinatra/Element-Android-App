package B;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final c f4a;

    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final InputContentInfo f5a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f5a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public void a() {
            this.f5a.requestPermission();
        }

        public Uri b() {
            return this.f5a.getLinkUri();
        }

        public ClipDescription c() {
            return this.f5a.getDescription();
        }

        public Object d() {
            return this.f5a;
        }

        public Uri e() {
            return this.f5a.getContentUri();
        }

        a(Object obj) {
            this.f5a = (InputContentInfo) obj;
        }
    }

    private interface c {
        void a();

        Uri b();

        ClipDescription c();

        Object d();

        Uri e();
    }

    private f(c cVar) {
        this.f4a = cVar;
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f4a.e();
    }

    public ClipDescription b() {
        return this.f4a.c();
    }

    public Uri c() {
        return this.f4a.b();
    }

    public void d() {
        this.f4a.a();
    }

    public Object e() {
        return this.f4a.d();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f4a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f6a;

        /* renamed from: b  reason: collision with root package name */
        private final ClipDescription f7b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f8c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f6a = uri;
            this.f7b = clipDescription;
            this.f8c = uri2;
        }

        public Uri b() {
            return this.f8c;
        }

        public ClipDescription c() {
            return this.f7b;
        }

        public Object d() {
            return null;
        }

        public Uri e() {
            return this.f6a;
        }

        public void a() {
        }
    }
}
