package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0772e;

/* renamed from: com.google.android.gms.ads.internal.request.x */
public abstract class C0476x extends Binder implements C0475w {
    public C0476x() {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public static C0475w m2916a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C0475w)) ? new C0477y(iBinder) : (C0475w) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C0449z c0449z = null;
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                AdRequestInfoParcel a;
                parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                if (parcel.readInt() != 0) {
                    C0471s c0471s = AdRequestInfoParcel.CREATOR;
                    a = C0471s.m2908a(parcel);
                }
                AdResponseParcel a2 = m2914a(a);
                parcel2.writeNoException();
                if (a2 != null) {
                    parcel2.writeInt(1);
                    a2.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                AdRequestInfoParcel a3;
                parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                if (parcel.readInt() != 0) {
                    C0471s c0471s2 = AdRequestInfoParcel.CREATOR;
                    a3 = C0471s.m2908a(parcel);
                } else {
                    a3 = null;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    c0449z = (queryLocalInterface == null || !(queryLocalInterface instanceof C0449z)) ? new ab(readStrongBinder) : (C0449z) queryLocalInterface;
                }
                m2915a(a3, c0449z);
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
