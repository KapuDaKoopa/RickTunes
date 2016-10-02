package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;

final class ay implements aw {
    private IBinder f1936a;

    ay(IBinder iBinder) {
        this.f1936a = iBinder;
    }

    public final void m2347a(String str, String str2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAppEventListener");
            obtain.writeString(str);
            obtain.writeString(str2);
            this.f1936a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1936a;
    }
}
