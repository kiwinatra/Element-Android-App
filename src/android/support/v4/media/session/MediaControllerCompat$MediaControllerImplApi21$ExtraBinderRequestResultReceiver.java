package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference f332a;

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i2, Bundle bundle) {
        b.a(this.f332a.get());
    }
}
