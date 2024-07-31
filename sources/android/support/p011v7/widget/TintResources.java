package android.support.p011v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.TintResources */
/* loaded from: classes.dex */
class TintResources extends ResourcesWrapper {
    private final WeakReference<Context> mContextRef;

    public TintResources(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.mContextRef = new WeakReference<>(context);
    }

    @Override // android.support.p011v7.widget.ResourcesWrapper, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = this.mContextRef.get();
        if (drawable != null && context != null) {
            AppCompatDrawableManager.get();
            AppCompatDrawableManager.tintDrawableUsingColorFilter(context, i, drawable);
        }
        return drawable;
    }
}
