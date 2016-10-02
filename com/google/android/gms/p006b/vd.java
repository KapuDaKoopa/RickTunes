package com.google.android.gms.p006b;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* renamed from: com.google.android.gms.b.vd */
final class vd implements vb {
    private IBinder f4271a;

    vd(IBinder iBinder) {
        this.f4271a = iBinder;
    }

    public final void m4793a(uy uyVar, ProxyGrpcRequest proxyGrpcRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
            obtain.writeStrongBinder(uyVar != null ? uyVar.asBinder() : null);
            if (proxyGrpcRequest != null) {
                obtain.writeInt(1);
                proxyGrpcRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4271a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void m4794a(uy uyVar, ProxyRequest proxyRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.auth.api.internal.IAuthService");
            obtain.writeStrongBinder(uyVar != null ? uyVar.asBinder() : null);
            if (proxyRequest != null) {
                obtain.writeInt(1);
                proxyRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f4271a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f4271a;
    }
}
