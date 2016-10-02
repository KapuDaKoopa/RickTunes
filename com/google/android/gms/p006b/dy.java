package com.google.android.gms.p006b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.p017a.C0314a;
import java.util.List;

/* renamed from: com.google.android.gms.b.dy */
public abstract class dy extends Binder implements dx {
    public dy() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        String a;
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                C0314a g = m2529g();
                parcel2.writeNoException();
                if (g != null) {
                    iBinder = g.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                a = m2523a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                List b = m2524b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                a = m2525c();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                dj d = m2526d();
                parcel2.writeNoException();
                if (d != null) {
                    iBinder = d.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                a = m2527e();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                a = m2528f();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                Bundle h = m2530h();
                parcel2.writeNoException();
                if (h != null) {
                    parcel2.writeInt(1);
                    h.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                m2531i();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
