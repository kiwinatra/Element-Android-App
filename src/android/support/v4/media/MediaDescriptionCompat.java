package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.support.v4.media.d;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f308a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f309b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f310c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f311d;

    /* renamed from: e  reason: collision with root package name */
    private final Bitmap f312e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f313f;

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f314g;

    /* renamed from: h  reason: collision with root package name */
    private final Uri f315h;

    /* renamed from: i  reason: collision with root package name */
    private Object f316i;

    static class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.c(a.a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f317a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f318b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f319c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f320d;

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f321e;

        /* renamed from: f  reason: collision with root package name */
        private Uri f322f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f323g;

        /* renamed from: h  reason: collision with root package name */
        private Uri f324h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f317a, this.f318b, this.f319c, this.f320d, this.f321e, this.f322f, this.f323g, this.f324h);
        }

        public b b(CharSequence charSequence) {
            this.f320d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f323g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f321e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f322f = uri;
            return this;
        }

        public b f(String str) {
            this.f317a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f324h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f319c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f318b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f308a = str;
        this.f309b = charSequence;
        this.f310c = charSequence2;
        this.f311d = charSequence3;
        this.f312e = bitmap;
        this.f313f = uri;
        this.f314g = bundle;
        this.f315h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat c(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x007a
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            java.lang.String r3 = android.support.v4.media.a.f(r9)
            r2.f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.a.h(r9)
            r2.i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.a.g(r9)
            r2.h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.a.b(r9)
            r2.b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.a.d(r9)
            r2.d(r3)
            android.net.Uri r3 = android.support.v4.media.a.e(r9)
            r2.e(r3)
            android.os.Bundle r3 = android.support.v4.media.a.c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x0046
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x0047
        L_0x0046:
            r5 = r0
        L_0x0047:
            if (r5 == 0) goto L_0x005f
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0059
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x0059
            goto L_0x0060
        L_0x0059:
            r3.remove(r4)
            r3.remove(r6)
        L_0x005f:
            r0 = r3
        L_0x0060:
            r2.c(r0)
            if (r5 == 0) goto L_0x0069
            r2.g(r5)
            goto L_0x0074
        L_0x0069:
            r0 = 23
            if (r1 < r0) goto L_0x0074
            android.net.Uri r0 = android.support.v4.media.d.a(r9)
            r2.g(r0)
        L_0x0074:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.f316i = r9
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.c(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object d() {
        Object obj = this.f316i;
        if (obj != null) {
            return obj;
        }
        int i2 = Build.VERSION.SDK_INT;
        Object b2 = a.C0012a.b();
        a.C0012a.g(b2, this.f308a);
        a.C0012a.i(b2, this.f309b);
        a.C0012a.h(b2, this.f310c);
        a.C0012a.c(b2, this.f311d);
        a.C0012a.e(b2, this.f312e);
        a.C0012a.f(b2, this.f313f);
        Bundle bundle = this.f314g;
        if (i2 < 23 && this.f315h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f315h);
        }
        a.C0012a.d(b2, bundle);
        if (i2 >= 23) {
            d.a.a(b2, this.f315h);
        }
        Object a2 = a.C0012a.a(b2);
        this.f316i = a2;
        return a2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f309b + ", " + this.f310c + ", " + this.f311d;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        a.i(d(), parcel, i2);
    }
}
