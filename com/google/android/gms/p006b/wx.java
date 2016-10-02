package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.b.wx */
final class wx implements wv {
    private IBinder f4322a;

    wx(IBinder iBinder) {
        this.f4322a = iBinder;
    }

    public final void m4867a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonCallbacks");
            obtain.writeInt(i);
            this.f4322a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f4322a;
    }
}
