package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* renamed from: fF */
    private final int f2643fF;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GooglePlayServicesRepairableException(int i, String str, Intent intent) {
        super(str, intent);
        this.f2643fF = i;
    }

    public int getConnectionStatusCode() {
        return this.f2643fF;
    }
}
