package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;

/* loaded from: classes.dex */
public enum MessageDialogFeature implements DialogFeature {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);
    
    private int minVersion;

    @Override // com.facebook.internal.DialogFeature
    public String getAction() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }

    MessageDialogFeature(int i) {
        this.minVersion = i;
    }

    @Override // com.facebook.internal.DialogFeature
    public int getMinVersion() {
        return this.minVersion;
    }
}
