package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p017a.C0314a;

/* renamed from: com.google.android.gms.b.ds */
final class ds implements dq {
    private IBinder f3140a;

    ds(IBinder iBinder) {
        this.f3140a = iBinder;
    }

    public final IBinder m3639a(C0314a c0314a, C0314a c0314a2, C0314a c0314a3, int i) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            obtain.writeStrongBinder(c0314a2 != null ? c0314a2.asBinder() : null);
            if (c0314a3 != null) {
                iBinder = c0314a3.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i);
            this.f3140a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            iBinder = obtain2.readStrongBinder();
            return iBinder;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3140a;
    }
}
