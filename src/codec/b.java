package a;

import a.C0086a;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final boolean f299a = false;

    /* renamed from: b  reason: collision with root package name */
    final Handler f300b = null;

    /* renamed from: c  reason: collision with root package name */
    C0086a f301c;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    /* renamed from: a.b$b  reason: collision with other inner class name */
    class C0011b extends C0086a.C0009a {
        C0011b() {
        }

        public void a(int i2, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f300b;
            if (handler != null) {
                handler.post(new c(i2, bundle));
            } else {
                bVar.c(i2, bundle);
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f303a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f304b;

        c(int i2, Bundle bundle) {
            this.f303a = i2;
            this.f304b = bundle;
        }

        public void run() {
            b.this.c(this.f303a, this.f304b);
        }
    }

    b(Parcel parcel) {
        this.f301c = C0086a.C0009a.b(parcel.readStrongBinder());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            try {
                if (this.f301c == null) {
                    this.f301c = new C0011b();
                }
                parcel.writeStrongBinder(this.f301c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c(int i2, Bundle bundle) {
    }
}
