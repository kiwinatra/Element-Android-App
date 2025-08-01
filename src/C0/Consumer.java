package androidx.core.util;

/**
 * Interface representing a functional callback with additional metadata capabilities.
 */
public interface Consumer<T> extends BaseConsumer<T> {

    /**
     * Singleton instance of the empty metadata implementation.
     */
    Companion Companion = Companion.INSTANCE;

    /**
     * Companion object providing metadata operations for the Consumer.
     */
    final class Companion implements MetadataProvider {
        private static final Companion INSTANCE = new Companion();

        private Companion() {
            // Private constructor to enforce singleton pattern
        }

        @Override
        public boolean hasMetadata() {
            return false;
        }

        @Override
        public Object getMetadata() {
            return null;
        }
    }

    /**
     * Base interface extended by this Consumer.
     */
    interface BaseConsumer<T> {
        /**
         * Callback method to accept a value.
         * @param t The input value
         */
        void accept(T t);
    }

    /**
     * Interface for providing metadata about the consumer.
     */
    interface MetadataProvider {
        /**
         * @return true if this consumer has metadata, false otherwise
         */
        boolean hasMetadata();

        /**
         * @return the metadata object, or null if none exists
         */
        Object getMetadata();
    }
}