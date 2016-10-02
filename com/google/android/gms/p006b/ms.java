package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.b.ms */
public final class ms implements mq {
    private IBinder f3659a;

    public ms(IBinder iBinder) {
        this.f3659a = iBinder;
    }

    public final void m4216a(mn mnVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
            obtain.writeStrongBinder(mnVar != null ? mnVar.asBinder() : null);
            this.f3659a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3659a;
    }
}
