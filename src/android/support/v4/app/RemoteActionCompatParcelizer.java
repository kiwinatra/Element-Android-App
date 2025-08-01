package android.support.v4.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelize;

@VersionedParcelize
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    
    private static final String TAG = "RemoteActionCompatParcelizer";
    private static final boolean DEBUG = BuildConfig.DEBUG;
    
    @NonNull
    public static RemoteActionCompat read(@NonNull VersionedParcel parcel) {
        if (DEBUG) Log.d(TAG, "Reading RemoteActionCompat from parcel");
        try {
            return androidx.core.app.RemoteActionCompatParcelizer.read(parcel);
        } catch (Exception e) {
            if (DEBUG) Log.e(TAG, "Error reading RemoteActionCompat", e);
            throw new ParcelFormatException("Failed to read RemoteActionCompat", e);
        }
    }

    public static void write(@Nullable RemoteActionCompat obj, @NonNull VersionedParcel parcel) {
        if (DEBUG) Log.d(TAG, "Writing RemoteActionCompat to parcel");
        if (parcel == null) {
            throw new IllegalArgumentException("Parcel cannot be null");
        }
        try {
            androidx.core.app.RemoteActionCompatParcelizer.write(obj, parcel);
        } catch (Exception e) {
            if (DEBUG) Log.e(TAG, "Error writing RemoteActionCompat", e);
            throw new ParcelFormatException("Failed to write RemoteActionCompat", e);
        }
    }
    
    private static void validateParcel(@NonNull VersionedParcel parcel) {
        if (parcel == null) {
            throw new IllegalStateException("VersionedParcel is in invalid state");
        }
    }
}