package android.support.p008v4.media.session;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.p008v4.media.session.MediaControllerCompatApi23;

@RequiresApi(24)
/* renamed from: android.support.v4.media.session.MediaControllerCompatApi24 */
/* loaded from: classes.dex */
class MediaControllerCompatApi24 {
    MediaControllerCompatApi24() {
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompatApi24$TransportControls */
    /* loaded from: classes.dex */
    public static class TransportControls extends MediaControllerCompatApi23.TransportControls {
        public static void prepare(Object obj) {
            ((MediaController.TransportControls) obj).prepare();
        }

        public static void prepareFromMediaId(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromMediaId(str, bundle);
        }

        public static void prepareFromSearch(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromSearch(str, bundle);
        }

        public static void prepareFromUri(Object obj, Uri uri, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromUri(uri, bundle);
        }
    }
}
