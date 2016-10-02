package com.google.android.gms.p006b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* renamed from: com.google.android.gms.b.vc */
public abstract class vc extends Binder implements vb {
    public static vb m4792a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof vb)) ? new vd(iBinder) : (vb) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ProxyGrpcRequest proxyGrpcRequest = null;
        uy a;
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                ProxyRequest proxyRequest;
                parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
                a = uz.m4767a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    proxyRequest = (ProxyRequest) ProxyRequest.CREATOR.createFromParcel(parcel);
                }
                m4791a(a, proxyRequest);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                parcel.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
                a = uz.m4767a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    proxyGrpcRequest = (ProxyGrpcRequest) ProxyGrpcRequest.CREATOR.createFromParcel(parcel);
                }
                m4790a(a, proxyGrpcRequest);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.auth.api.internal.IAuthService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
