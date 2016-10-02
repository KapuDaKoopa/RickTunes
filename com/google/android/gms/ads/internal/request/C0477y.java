package com.google.android.gms.ads.internal.request;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.internal.request.y */
final class C0477y implements C0475w {
    private IBinder f2503a;

    C0477y(IBinder iBinder) {
        this.f2503a = iBinder;
    }

    public final AdResponseParcel m2917a(AdRequestInfoParcel adRequestInfoParcel) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            AdResponseParcel a;
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (adRequestInfoParcel != null) {
                obtain.writeInt(1);
                adRequestInfoParcel.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f2503a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                C0473u c0473u = AdResponseParcel.CREATOR;
                a = C0473u.m2911a(obtain2);
            } else {
                a = null;
            }
            obtain2.recycle();
            obtain.recycle();
            return a;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m2918a(AdRequestInfoParcel adRequestInfoParcel, C0449z c0449z) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (adRequestInfoParcel != null) {
                obtain.writeInt(1);
                adRequestInfoParcel.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeStrongBinder(c0449z != null ? c0449z.asBinder() : null);
            this.f2503a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2503a;
    }
}
