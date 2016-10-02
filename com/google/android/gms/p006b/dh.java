package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.b.dh */
public final class dh implements df {
    private IBinder f3132a;

    public dh(IBinder iBinder) {
        this.f3132a = iBinder;
    }

    public final void m3625a(dc dcVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
            obtain.writeStrongBinder(dcVar != null ? dcVar.asBinder() : null);
            this.f3132a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3132a;
    }
}
