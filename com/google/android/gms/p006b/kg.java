package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.b.kg */
final class kg implements ke {
    private IBinder f3540a;

    kg(IBinder iBinder) {
        this.f3540a = iBinder;
    }

    public final kh m3962a(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            obtain.writeString(str);
            this.f3540a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            kh a = ki.m3984a(obtain2.readStrongBinder());
            return a;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3540a;
    }

    public final boolean m3963b(String str) {
        boolean z = false;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
            obtain.writeString(str);
            this.f3540a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
