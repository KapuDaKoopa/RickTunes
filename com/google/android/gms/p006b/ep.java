package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.b.ep */
public final class ep implements en {
    private IBinder f3153a;

    public ep(IBinder iBinder) {
        this.f3153a = iBinder;
    }

    public final void m3693a(eb ebVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
            obtain.writeStrongBinder(ebVar != null ? ebVar.asBinder() : null);
            this.f3153a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3153a;
    }
}
