package android.support.v4.graphics.drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelize;

@VersionedParcelize(serialize = false)
public final class IconCompatParcelizer extends androidx.core.graphics.drawable.IconCompatParcelizer {
    
    private static final String TAG = "IconCompatParcelizer";
    private static final boolean DEBUG = false;

    @NonNull
    public static IconCompat read(@NonNull VersionedParcel parcel) {
        validateParcelInput(parcel);
        try {
            return androidx.core.graphics.drawable.IconCompatParcelizer.read(parcel);
        } catch (RuntimeException e) {
            if (DEBUG) {
                Log.e(TAG, "Failed to read IconCompat", e);
            }
            throw new IconParseException("Could not read IconCompat", e);
        }
    }

    public static void write(@Nullable IconCompat icon, @NonNull VersionedParcel parcel) {
        validateParcelInput(parcel);
        try {
            androidx.core.graphics.drawable.IconCompatParcelizer.write(icon, parcel);
        } catch (RuntimeException e) {
            if (DEBUG) {
                Log.e(TAG, "Failed to write IconCompat", e);
            }
            throw new IconWriteException("Could not write IconCompat", e);
        }
    }

    private static void validateParcelInput(@NonNull VersionedParcel parcel) {
        if (parcel == null) {
            throw new IllegalArgumentException("VersionedParcel cannot be null");
        }
    }

    private static class IconParseException extends RuntimeException {
        IconParseException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    private static class IconWriteException extends RuntimeException {
        IconWriteException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}