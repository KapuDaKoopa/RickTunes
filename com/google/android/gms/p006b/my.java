package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p017a.C0314a;

/* renamed from: com.google.android.gms.b.my */
final class my implements mw {
    private IBinder f3661a;

    my(IBinder iBinder) {
        this.f3661a = iBinder;
    }

    public final IBinder m4222a(C0314a c0314a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            this.f3661a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            return readStrongBinder;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3661a;
    }
}
