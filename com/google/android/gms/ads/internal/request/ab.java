package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.Parcel;

final class ab implements C0449z {
    private IBinder f2422a;

    ab(IBinder iBinder) {
        this.f2422a = iBinder;
    }

    public final void m2811a(AdResponseParcel adResponseParcel) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdResponseListener");
            if (adResponseParcel != null) {
                obtain.writeInt(1);
                adResponseParcel.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2422a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2422a;
    }
}
