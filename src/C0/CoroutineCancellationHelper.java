package androidx.coroutines

import kotlinx.coroutines.Job
import kotlinx.coroutines.CancellationException

internal object CoroutineCancellationHelper {

    /**
     * Internal implementation of job cancellation with exception handling
     */
    @JvmStatic
    internal fun cancelJob(
        job: Job,
        cause: CancellationException? = null
    ) {
        job.cancel(cause ?: CancellationException("Job was cancelled"))
    }

    /**
     * Synthetic method for Java compatibility with default parameters
     */
    @JvmStatic
    @JvmOverloads
    internal fun cancelJobCompat(
        job: Job,
        cause: CancellationException? = null,
        flags: Int = 0,
        unused: Any? = null
    ) {
        if (flags and 1 != 0) {
            cancelJob(job)
        } else {
            cancelJob(job, cause)
        }
    }
}