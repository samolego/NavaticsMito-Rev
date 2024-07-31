package android.support.p008v4.p010os;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: android.support.v4.os.ParcelableCompat */
/* loaded from: classes.dex */
public final class ParcelableCompat {
    @Deprecated
    public static <T> Parcelable.Creator<T> newCreator(ParcelableCompatCreatorCallbacks<T> parcelableCompatCreatorCallbacks) {
        return new ParcelableCompatCreatorHoneycombMR2(parcelableCompatCreatorCallbacks);
    }

    /* renamed from: android.support.v4.os.ParcelableCompat$ParcelableCompatCreatorHoneycombMR2 */
    /* loaded from: classes.dex */
    static class ParcelableCompatCreatorHoneycombMR2<T> implements Parcelable.ClassLoaderCreator<T> {
        private final ParcelableCompatCreatorCallbacks<T> mCallbacks;

        ParcelableCompatCreatorHoneycombMR2(ParcelableCompatCreatorCallbacks<T> parcelableCompatCreatorCallbacks) {
            this.mCallbacks = parcelableCompatCreatorCallbacks;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.mCallbacks.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.mCallbacks.createFromParcel(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.mCallbacks.newArray(i);
        }
    }

    private ParcelableCompat() {
    }
}
