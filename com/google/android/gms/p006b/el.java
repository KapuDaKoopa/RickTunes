package com.google.android.gms.p006b;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.C0772e;

/* renamed from: com.google.android.gms.b.el */
public abstract class el extends Binder implements ek {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                m3690a(ec.m2551a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
