package androidx.activity.result.contract;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Contract for receiving activity results that simply wraps the result code and Intent.
 */
public final class ActivityResultContract extends ActivityResultContract<Void, ActivityResult> {

    public static final class Companion {
        private Companion() {}

        @NonNull
        public static Companion getInstance() {
            return new Companion();
        }
    }

    @NonNull
    @Override
    public ActivityResult parseResult(int resultCode, @Nullable Intent intent) {
        return new ActivityResult(resultCode, intent);
    }

    @NonNull
    @Override
    public Intent createIntent(@NonNull Context context, @Nullable Void input) {
        throw new UnsupportedOperationException(
            "This contract should only be used for receiving results, not starting activities");
    }

    @NonNull
    public static ActivityResult emptyResult() {
        return new ActivityResult(Activity.RESULT_CANCELED, null);
    }
}