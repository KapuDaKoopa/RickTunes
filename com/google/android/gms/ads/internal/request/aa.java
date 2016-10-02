package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.C0772e;

public abstract class aa extends Binder implements C0449z {
    public aa() {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                AdResponseParcel a;
                parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (parcel.readInt() != 0) {
                    C0473u c0473u = AdResponseParcel.CREATOR;
                    a = C0473u.m2911a(parcel);
                } else {
                    a = null;
                }
                m2810a(a);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.request.IAdResponseListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
