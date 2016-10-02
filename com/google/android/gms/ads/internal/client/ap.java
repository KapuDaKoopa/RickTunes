package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p006b.ke;
import com.google.android.gms.p017a.C0314a;

final class ap implements an {
    private IBinder f1933a;

    ap(IBinder iBinder) {
        this.f1933a = iBinder;
    }

    public final IBinder m2318a(C0314a c0314a, String str, ke keVar, int i) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            obtain.writeString(str);
            if (keVar != null) {
                iBinder = keVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i);
            this.f1933a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            iBinder = obtain2.readStrongBinder();
            return iBinder;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1933a;
    }
}
