package com.google.android.gms.p006b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.p017a.C0315b;

/* renamed from: com.google.android.gms.b.md */
public abstract class md extends Binder implements mc {
    public static mc m4208a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof mc)) ? new me(iBinder) : (mc) queryLocalInterface;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                IBinder a = m4207a(C0315b.m1995a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
