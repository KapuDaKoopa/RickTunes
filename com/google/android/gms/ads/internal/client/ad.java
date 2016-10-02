package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;

final class ad implements ab {
    private IBinder f1929a;

    ad(IBinder iBinder) {
        this.f1929a = iBinder;
    }

    public final void m2282a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdClickListener");
            this.f1929a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1929a;
    }
}
