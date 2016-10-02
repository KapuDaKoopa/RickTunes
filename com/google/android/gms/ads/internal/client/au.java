package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.p006b.kf;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0315b;

public abstract class au extends Binder implements at {
    public static at m2343a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof at)) ? new av(iBinder) : (at) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        AdSizeParcel adSizeParcel = null;
        C0314a a;
        C0371v c0371v;
        IBinder a2;
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                a = C0315b.m1995a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    c0371v = AdSizeParcel.CREATOR;
                    adSizeParcel = C0371v.m2446a(parcel);
                }
                a2 = m2341a(a, adSizeParcel, parcel.readString(), kf.m3956a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a2);
                return true;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                a = C0315b.m1995a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    c0371v = AdSizeParcel.CREATOR;
                    adSizeParcel = C0371v.m2446a(parcel);
                }
                a2 = m2342a(a, adSizeParcel, parcel.readString(), kf.m3956a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a2);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
