package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p017a.C0314a;

final class bg implements be {
    private IBinder f1955a;

    bg(IBinder iBinder) {
        this.f1955a = iBinder;
    }

    public final IBinder m2368a(C0314a c0314a, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            obtain.writeInt(i);
            this.f1955a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            return readStrongBinder;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1955a;
    }
}
