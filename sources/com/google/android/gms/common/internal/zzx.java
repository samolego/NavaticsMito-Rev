package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface zzx extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class zza extends Binder implements zzx {

        /* renamed from: com.google.android.gms.common.internal.zzx$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C3242zza implements zzx {
            private IBinder zzajf;

            C3242zza(IBinder iBinder) {
                this.zzajf = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.zzajf;
            }

            @Override // com.google.android.gms.common.internal.zzx
            public void zza(ResolveAccountResponse resolveAccountResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                    if (resolveAccountResponse != null) {
                        obtain.writeInt(1);
                        resolveAccountResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zzajf.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static zzx zzdx(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof zzx)) ? new C3242zza(iBinder) : (zzx) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                return true;
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            zza(parcel.readInt() != 0 ? ResolveAccountResponse.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void zza(ResolveAccountResponse resolveAccountResponse) throws RemoteException;
}
