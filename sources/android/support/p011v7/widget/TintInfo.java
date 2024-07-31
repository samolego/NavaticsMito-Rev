package android.support.p011v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* renamed from: android.support.v7.widget.TintInfo */
/* loaded from: classes.dex */
class TintInfo {
    public boolean mHasTintList;
    public boolean mHasTintMode;
    public ColorStateList mTintList;
    public PorterDuff.Mode mTintMode;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clear() {
        this.mTintList = null;
        this.mHasTintList = false;
        this.mTintMode = null;
        this.mHasTintMode = false;
    }
}
