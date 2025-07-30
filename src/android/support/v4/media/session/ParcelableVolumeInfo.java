package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f339a;

    /* renamed from: b  reason: collision with root package name */
    public int f340b;

    /* renamed from: c  reason: collision with root package name */
    public int f341c;

    /* renamed from: d  reason: collision with root package name */
    public int f342d;

    /* renamed from: e  reason: collision with root package name */
    public int f343e;

    static class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f339a = parcel.readInt();
        this.f341c = parcel.readInt();
        this.f342d = parcel.readInt();
        this.f343e = parcel.readInt();
        this.f340b = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f339a);
        parcel.writeInt(this.f341c);
        parcel.writeInt(this.f342d);
        parcel.writeInt(this.f343e);
        parcel.writeInt(this.f340b);
    }
}
