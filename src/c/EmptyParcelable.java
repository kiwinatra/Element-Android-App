package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

import static androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP;

@RestrictTo(LIBRARY_GROUP)
public abstract class AbsParcelable implements Parcelable {
    public static final Creator<AbsParcelable> CREATOR = new ClassLoaderCreatorImpl();
    public static final AbsParcelable EMPTY = new EmptyParcelable();

    private final Parcelable mSuperState;

    private static final class EmptyParcelable extends AbsParcelable {
        EmptyParcelable() {
            super(null);
        }
    }

    private static final class ClassLoaderCreatorImpl implements ClassLoaderCreator<AbsParcelable> {
        private ClassLoaderCreatorImpl() {}

        @Override
        public AbsParcelable createFromParcel(Parcel source) {
            return createFromParcel(source, null);
        }

        @Override
        public AbsParcelable createFromParcel(Parcel source, ClassLoader loader) {
            Parcelable superState = source.readParcelable(loader);
            if (superState == null) {
                return EMPTY;
            }
            throw new IllegalStateException("superState must be null when reading EMPTY parcelable");
        }

        @Override
        public AbsParcelable[] newArray(int size) {
            return new AbsParcelable[size];
        }
    }

    private AbsParcelable() {
        this.mSuperState = null;
    }

    @Nullable
    public final Parcelable getSuperState() {
        return mSuperState;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeParcelable(mSuperState, flags);
    }

    protected AbsParcelable(@NonNull Parcel source, @Nullable ClassLoader loader) {
        Parcelable superState = source.readParcelable(loader);
        mSuperState = superState == null ? EMPTY : superState;
    }

    protected AbsParcelable(@NonNull Parcelable superState) {
        if (superState == null) {
            throw new IllegalArgumentException("SuperState must not be null");
        }
        mSuperState = superState == EMPTY ? null : superState;
    }

    // Synthetic constructor for EMPTY instance
    private AbsParcelable(@SuppressWarnings("unused") EmptyParcelable ignored) {
        this();
    }
}