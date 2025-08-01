package androidx.activity.result.contract;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Abstract base class for Activity Result Contracts that defines the protocol
 * for parsing activity results.
 *
 * @param <I> Input type for creating intents
 * @param <O> Output type for parsed results
 */
public abstract class ActivityResultContract<I, O> {

    /**
     * Parses the activity result into the output type.
     *
     * @param resultCode The result code from the activity
     * @param intent The result data intent, may be null
     * @return The parsed output
     */
    @Nullable
    public abstract O parseResult(int resultCode, @Nullable Intent intent);

    /**
     * Creates an intent for starting the activity.
     *
     * @param context The context used to create the intent
     * @param input The input required to create the intent
     * @return The created intent
     */
    @NonNull
    public abstract Intent createIntent(@NonNull android.content.Context context, @NonNull I input);

    /**
     * Gets the synchronous result if available without starting an activity.
     *
     * @param input The input required for the contract
     * @return The synchronous result if available, null otherwise
     */
    @Nullable
    public SynchronousResult<O> getSynchronousResult(
            @NonNull android.content.Context context,
            @NonNull I input) {
        return null;
    }

    /**
     * Wrapper class for synchronous results.
     *
     * @param <O> The output type
     */
    public static final class SynchronousResult<O> {
        @NonNull
        private final O mResult;

        public SynchronousResult(@NonNull O result) {
            mResult = result;
        }

        @NonNull
        public O getResult() {
            return mResult;
        }
    }
}