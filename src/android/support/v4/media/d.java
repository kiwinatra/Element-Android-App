package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

abstract class d {

    static class a {
        public static void a(Object obj, Uri uri) {
            MediaDescription.Builder unused = ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    public static Uri a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
