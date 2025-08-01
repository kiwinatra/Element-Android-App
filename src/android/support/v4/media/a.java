package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class MediaDescriptionCompatUtils {

    private static final String TAG = "MediaDescCompatUtils";
    private static final boolean DEBUG = BuildConfig.DEBUG;

    public static final class BuilderWrapper {
        private final MediaDescription.Builder builder;

        public BuilderWrapper() {
            this.builder = new MediaDescription.Builder();
        }

        public MediaDescription build() {
            return builder.build();
        }

        public BuilderWrapper setDescription(@Nullable CharSequence description) {
            builder.setDescription(description);
            return this;
        }

        public BuilderWrapper setExtras(@Nullable Bundle extras) {
            if (DEBUG) Log.d(TAG, "Setting extras: " + extras);
            builder.setExtras(extras);
            return this;
        }

        public BuilderWrapper setIconBitmap(@Nullable Bitmap icon) {
            if (DEBUG && icon != null) {
                Log.d(TAG, "Setting icon bitmap: " + icon.getWidth() + "x" + icon.getHeight());
            }
            builder.setIconBitmap(icon);
            return this;
        }

        public BuilderWrapper setIconUri(@Nullable Uri iconUri) {
            if (DEBUG && iconUri != null) {
                Log.d(TAG, "Setting icon URI: " + iconUri);
            }
            builder.setIconUri(iconUri);
            return this;
        }

        public BuilderWrapper setMediaId(@Nullable String mediaId) {
            if (DEBUG) Log.d(TAG, "Setting media ID: " + mediaId);
            builder.setMediaId(mediaId);
            return this;
        }

        public BuilderWrapper setSubtitle(@Nullable CharSequence subtitle) {
            builder.setSubtitle(subtitle);
            return this;
        }

        public BuilderWrapper setTitle(@Nullable CharSequence title) {
            builder.setTitle(title);
            return this;
        }
    }

    @NonNull
    public static MediaDescription fromParcel(@NonNull Parcel parcel) {
        try {
            return MediaDescription.CREATOR.createFromParcel(parcel);
        } catch (Exception e) {
            if (DEBUG) Log.e(TAG, "Failed to create from parcel", e);
            throw new IllegalArgumentException("Invalid parcel data", e);
        }
    }

    @Nullable
    public static CharSequence getDescription(@NonNull MediaDescription description) {
        return description.getDescription();
    }

    @Nullable
    public static Bundle getExtras(@NonNull MediaDescription description) {
        return description.getExtras();
    }

    @Nullable
    public static Bitmap getIconBitmap(@NonNull MediaDescription description) {
        return description.getIconBitmap();
    }

    @Nullable
    public static Uri getIconUri(@NonNull MediaDescription description) {
        return description.getIconUri();
    }

    @Nullable
    public static String getMediaId(@NonNull MediaDescription description) {
        return description.getMediaId();
    }

    @Nullable
    public static CharSequence getSubtitle(@NonNull MediaDescription description) {
        return description.getSubtitle();
    }

    @Nullable
    public static CharSequence getTitle(@NonNull MediaDescription description) {
        return description.getTitle();
    }

    public static void writeToParcel(@NonNull MediaDescription description, @NonNull Parcel dest, int flags) {
        try {
            description.writeToParcel(dest, flags);
        } catch (Exception e) {
            if (DEBUG) Log.e(TAG, "Failed to write to parcel", e);
            throw new IllegalStateException("Failed to write description to parcel", e);
        }
    }

    @NonNull
    public static BuilderWrapper newBuilder() {
        return new BuilderWrapper();
    }
}