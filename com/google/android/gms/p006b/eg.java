package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.b.eg */
public final class eg implements ee {
    private IBinder f3150a;

    public eg(IBinder iBinder) {
        this.f3150a = iBinder;
    }

    public final void m3687a(dt dtVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
            obtain.writeStrongBinder(dtVar != null ? dtVar.asBinder() : null);
            this.f3150a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3150a;
    }
}
