package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.b.ej */
public final class ej implements eh {
    private IBinder f3151a;

    public ej(IBinder iBinder) {
        this.f3151a = iBinder;
    }

    public final void m3689a(dx dxVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
            obtain.writeStrongBinder(dxVar != null ? dxVar.asBinder() : null);
            this.f3151a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3151a;
    }
}
