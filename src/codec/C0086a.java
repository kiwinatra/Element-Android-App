package a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.a  reason: case insensitive filesystem */
public interface C0086a extends IInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final String f297a = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: a.a$b */
    public static class b {
        /* access modifiers changed from: private */
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void a(int i2, Bundle bundle);

    /* renamed from: a.a$a  reason: collision with other inner class name */
    public static abstract class C0009a extends Binder implements C0086a {

        /* renamed from: a.a$a$a  reason: collision with other inner class name */
        private static class C0010a implements C0086a {

            /* renamed from: b  reason: collision with root package name */
            private IBinder f298b;

            C0010a(IBinder iBinder) {
                this.f298b = iBinder;
            }

            public IBinder asBinder() {
                return this.f298b;
            }
        }

        public C0009a() {
            attachInterface(this, C0086a.f297a);
        }

        public static C0086a b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0086a.f297a);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0086a)) {
                return new C0010a(iBinder);
            }
            return (C0086a) queryLocalInterface;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = C0086a.f297a;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                a(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
