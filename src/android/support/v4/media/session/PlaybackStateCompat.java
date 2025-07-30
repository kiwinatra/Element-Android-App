package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int f344a;

    /* renamed from: b  reason: collision with root package name */
    final long f345b;

    /* renamed from: c  reason: collision with root package name */
    final long f346c;

    /* renamed from: d  reason: collision with root package name */
    final float f347d;

    /* renamed from: e  reason: collision with root package name */
    final long f348e;

    /* renamed from: f  reason: collision with root package name */
    final int f349f;

    /* renamed from: g  reason: collision with root package name */
    final CharSequence f350g;

    /* renamed from: h  reason: collision with root package name */
    final long f351h;

    /* renamed from: i  reason: collision with root package name */
    List f352i;

    /* renamed from: j  reason: collision with root package name */
    final long f353j;

    /* renamed from: k  reason: collision with root package name */
    final Bundle f354k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f355a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f356b;

        /* renamed from: c  reason: collision with root package name */
        private final int f357c;

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f358d;

        static class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        CustomAction(Parcel parcel) {
            this.f355a = parcel.readString();
            this.f356b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f357c = parcel.readInt();
            this.f358d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f356b + ", mIcon=" + this.f357c + ", mExtras=" + this.f358d;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f355a);
            TextUtils.writeToParcel(this.f356b, parcel, i2);
            parcel.writeInt(this.f357c);
            parcel.writeBundle(this.f358d);
        }
    }

    static class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f344a = parcel.readInt();
        this.f345b = parcel.readLong();
        this.f347d = parcel.readFloat();
        this.f351h = parcel.readLong();
        this.f346c = parcel.readLong();
        this.f348e = parcel.readLong();
        this.f350g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f352i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f353j = parcel.readLong();
        this.f354k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f349f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f344a + ", position=" + this.f345b + ", buffered position=" + this.f346c + ", speed=" + this.f347d + ", updated=" + this.f351h + ", actions=" + this.f348e + ", error code=" + this.f349f + ", error message=" + this.f350g + ", custom actions=" + this.f352i + ", active item id=" + this.f353j + "}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f344a);
        parcel.writeLong(this.f345b);
        parcel.writeFloat(this.f347d);
        parcel.writeLong(this.f351h);
        parcel.writeLong(this.f346c);
        parcel.writeLong(this.f348e);
        TextUtils.writeToParcel(this.f350g, parcel, i2);
        parcel.writeTypedList(this.f352i);
        parcel.writeLong(this.f353j);
        parcel.writeBundle(this.f354k);
        parcel.writeInt(this.f349f);
    }
}
