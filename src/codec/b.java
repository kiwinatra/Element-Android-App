package b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * A message handler that can be passed between processes via Parcelable.
 * Handles incoming messages either synchronously or via a Handler.
 */
public class MessageHandler implements Parcelable {

    private static final boolean DEFAULT_ASYNC = false;
    
    private final boolean mAsync;
    private final Handler mHandler;
    private MessageReceiver mReceiver;
    
    private final Object mLock = new Object();

    protected MessageHandler(Parcel in) {
        IBinder binder = in.readStrongBinder();
        mReceiver = MessageReceiver.Stub.asInterface(binder);
        mAsync = DEFAULT_ASYNC;
        mHandler = null;
    }

    /**
     * Interface for receiving messages
     */
    public interface MessageCallback {
        void onMessageReceived(int messageId, @Nullable Bundle data);
    }

    private static class MessageReceiverImpl extends MessageReceiver.Stub {
        private final MessageHandler mHandler;

        MessageReceiverImpl(MessageHandler handler) {
            mHandler = handler;
        }

        @Override
        public void sendMessage(int messageId, Bundle data) {
            mHandler.dispatchMessage(messageId, data);
        }
    }

    private class MessageDispatchTask implements Runnable {
        private final int mMessageId;
        private final Bundle mData;

        MessageDispatchTask(int messageId, Bundle data) {
            this.mMessageId = messageId;
            this.mData = data;
        }

        @Override
        public void run() {
            handleMessage(mMessageId, mData);
        }
    }

    protected void dispatchMessage(int messageId, Bundle data) {
        if (mAsync && mHandler != null) {
            mHandler.post(new MessageDispatchTask(messageId, data));
        } else {
            handleMessage(messageId, data);
        }
    }

    /**
     * Override this to handle incoming messages
     */
    protected void handleMessage(int messageId, @Nullable Bundle data) {
        // Default implementation does nothing
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        synchronized (mLock) {
            if (mReceiver == null) {
                mReceiver = new MessageReceiverImpl(this);
            }
            dest.writeStrongBinder(mReceiver.asBinder());
        }
    }

    public static final Parcelable.Creator<MessageHandler> CREATOR = 
        new Parcelable.Creator<MessageHandler>() {
            @Override
            public MessageHandler createFromParcel(Parcel source) {
                return new MessageHandler(source);
            }

            @Override
            public MessageHandler[] newArray(int size) {
                return new MessageHandler[size];
            }
        };
}