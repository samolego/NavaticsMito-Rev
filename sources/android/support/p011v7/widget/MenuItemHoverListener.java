package android.support.p011v7.widget;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.p011v7.view.menu.MenuBuilder;
import android.view.MenuItem;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.MenuItemHoverListener */
/* loaded from: classes.dex */
public interface MenuItemHoverListener {
    void onItemHoverEnter(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem);

    void onItemHoverExit(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem);
}
