package C;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f9b = new C0000a();

    /* renamed from: a  reason: collision with root package name */
    private final Parcelable f10a;

    /* renamed from: C.a$a  reason: collision with other inner class name */
    class C0000a extends a {
        C0000a() {
            super((C0000a) null);
        }
    }

    class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f9b;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    private a() {
        this.f10a = null;
    }

    public final Parcelable c() {
        return this.f10a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f10a, i2);
    }

    /* synthetic */ a(C0000a aVar) {
        this();
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f10a = readParcelable == null ? f9b : readParcelable;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f10a = parcelable == f9b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
}
