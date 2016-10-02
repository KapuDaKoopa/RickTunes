package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.b.xa */
final class xa implements wy {
    private IBinder f4326a;

    xa(IBinder iBinder) {
        this.f4326a = iBinder;
    }

    public final void m4876a(wv wvVar) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
            if (wvVar != null) {
                iBinder = wvVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            this.f4326a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f4326a;
    }
}
