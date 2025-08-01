package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

import static androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP;

public final class MediaBrowserCompat {

    @RestrictTo(LIBRARY_GROUP)
    public static class MediaItem implements Parcelable {
        private static final int FLAG_BROWSABLE = 1;
        private static final int FLAG_PLAYABLE = 2;

        private final int mFlags;
        private final MediaDescriptionCompat mDescription;

        public MediaItem(@NonNull MediaDescriptionCompat description, int flags) {
            if (description == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if ((flags & (FLAG_BROWSABLE | FLAG_PLAYABLE)) == 0) {
                throw new IllegalArgumentException("Invalid flags");
            }
            this.mFlags = flags;
            this.mDescription = description;
        }

        MediaItem(Parcel in) {
            this.mFlags = in.readInt();
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(in);
        }

        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            @Override
            public MediaItem createFromParcel(Parcel source) {
                return new MediaItem(source);
            }

            @Override
            public MediaItem[] newArray(int size) {
                return new MediaItem[size];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(mFlags);
            mDescription.writeToParcel(dest, flags);
        }

        public int getFlags() {
            return mFlags;
        }

        public boolean isBrowsable() {
            return (mFlags & FLAG_BROWSABLE) != 0;
        }

        public boolean isPlayable() {
            return (mFlags & FLAG_PLAYABLE) != 0;
        }

        @NonNull
        public MediaDescriptionCompat getDescription() {
            return mDescription;
        }

        @NonNull
        @Override
        public String toString() {
            return "MediaItem{"
                    + "mFlags=" + mFlags
                    + ", mDescription=" + mDescription
                    + '}';
        }
    }
}