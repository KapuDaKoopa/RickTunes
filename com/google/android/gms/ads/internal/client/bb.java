package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;

final class bb implements az {
    private IBinder f1954a;

    bb(IBinder iBinder) {
        this.f1954a = iBinder;
    }

    public final long m2365a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
            this.f1954a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            long readLong = obtain2.readLong();
            return readLong;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1954a;
    }
}
