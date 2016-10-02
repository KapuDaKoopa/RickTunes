package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0772e;

public abstract class ai extends Binder implements ah {
    public ai() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public static ah m2297a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ah)) ? new aj(iBinder) : (ah) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                AdRequestParcel a;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoader");
                if (parcel.readInt() != 0) {
                    C0369t c0369t = AdRequestParcel.CREATOR;
                    a = C0369t.m2442a(parcel);
                } else {
                    a = null;
                }
                m2294a(a);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoader");
                String b = m2296b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                return true;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoader");
                boolean a2 = m2295a();
                parcel2.writeNoException();
                parcel2.writeInt(a2 ? 1 : 0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoader");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
