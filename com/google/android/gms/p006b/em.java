package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.b.em */
public final class em implements ek {
    private IBinder f3152a;

    public em(IBinder iBinder) {
        this.f3152a = iBinder;
    }

    public final void m3691a(eb ebVar, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
            obtain.writeStrongBinder(ebVar != null ? ebVar.asBinder() : null);
            obtain.writeString(str);
            this.f3152a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3152a;
    }
}
