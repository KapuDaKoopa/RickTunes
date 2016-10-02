package com.google.android.gms.ads.internal.reward.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p006b.ke;
import com.google.android.gms.p017a.C0314a;

/* renamed from: com.google.android.gms.ads.internal.reward.client.f */
final class C0483f implements C0481d {
    private IBinder f2508a;

    C0483f(IBinder iBinder) {
        this.f2508a = iBinder;
    }

    public final IBinder m2925a(C0314a c0314a, ke keVar, int i) {
        IBinder iBinder = null;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            if (keVar != null) {
                iBinder = keVar.asBinder();
            }
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i);
            this.f2508a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            iBinder = obtain2.readStrongBinder();
            return iBinder;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f2508a;
    }
}
