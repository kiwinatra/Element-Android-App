package androidx.coroutines;

import kotlinx.coroutines.Job;
import kotlinx.coroutines.CancellationException;

/**
 * Utility class for handling coroutine cancellation operations.
 */
public abstract class CoroutineCancellation {

    /**
     * Cancels the specified job with an optional cancellation exception.
     *
     * @param job The job to cancel
     * @param cancellationException Optional cancellation exception that may specify the cancellation cause
     */
    public static final void cancelJob(
        @NotNull Job job, 
        @Nullable CancellationException cancellationException
    ) {
        CoroutineUtils.cancelJob(job, cancellationException);
    }

    /**
     * Cancels the specified job with a default cancellation exception.
     *
     * @param job The job to cancel
     */
    public static final void cancelJob(@NotNull Job job) {
        cancelJob(job, null);
    }
}