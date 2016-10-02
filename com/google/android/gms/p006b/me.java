package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p017a.C0314a;

/* renamed from: com.google.android.gms.b.me */
final class me implements mc {
    private IBinder f3644a;

    me(IBinder iBinder) {
        this.f3644a = iBinder;
    }

    public final IBinder m4209a(C0314a c0314a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
            obtain.writeStrongBinder(c0314a != null ? c0314a.asBinder() : null);
            this.f3644a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            return readStrongBinder;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f3644a;
    }
}
