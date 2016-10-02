package com.google.android.gms.p006b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.p017a.C0314a;
import java.util.List;

/* renamed from: com.google.android.gms.b.du */
public abstract class du extends Binder implements dt {
    public du() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IBinder iBinder = null;
        String a;
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                C0314a i3 = m2501i();
                parcel2.writeNoException();
                if (i3 != null) {
                    iBinder = i3.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                a = m2493a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                List b = m2494b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                a = m2495c();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                dj d = m2496d();
                parcel2.writeNoException();
                if (d != null) {
                    iBinder = d.asBinder();
                }
                parcel2.writeStrongBinder(iBinder);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                a = m2497e();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                double f = m2498f();
                parcel2.writeNoException();
                parcel2.writeDouble(f);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                a = m2499g();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                a = m2500h();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.MapAttrs_uiZoomControls /*11*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                Bundle m = m2502m();
                parcel2.writeNoException();
                if (m != null) {
                    parcel2.writeInt(1);
                    m.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case C0772e.MapAttrs_uiZoomGestures /*12*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                m2503n();
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
