package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* renamed from: com.google.android.gms.b.va */
final class va implements uy {
    private IBinder f4270a;

    va(IBinder iBinder) {
        this.f4270a = iBinder;
    }

    public final void m4789a(ProxyResponse proxyResponse) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthCallbacks");
            if (proxyResponse != null) {
                obtain.writeInt(1);
                proxyResponse.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4270a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f4270a;
    }
}
