package com.google.android.gms.p006b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.p017a.C0315b;
import java.util.List;

/* renamed from: com.google.android.gms.b.ks */
public abstract class ks extends Binder implements kr {
    public ks() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public static kr m4028a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof kr)) ? new kt(iBinder) : (kr) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        String a;
        boolean j;
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                a = m4014a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                List b = m4016b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                a = m4018c();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                dj d = m4019d();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(d != null ? d.asBinder() : null);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                a = m4020e();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                double f = m4021f();
                parcel2.writeNoException();
                parcel2.writeDouble(f);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                a = m4022g();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                a = m4023h();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                m4024i();
                parcel2.writeNoException();
                return true;
            case C0772e.MapAttrs_uiZoomControls /*11*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                m4015a(C0315b.m1995a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.MapAttrs_uiZoomGestures /*12*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                m4017b(C0315b.m1995a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.MapAttrs_useViewLifecycle /*13*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                j = m4025j();
                parcel2.writeNoException();
                if (j) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case C0772e.MapAttrs_zOrderOnTop /*14*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                j = m4026k();
                parcel2.writeNoException();
                if (j) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case C0772e.MapAttrs_uiMapToolbar /*15*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                Bundle l = m4027l();
                parcel2.writeNoException();
                if (l != null) {
                    parcel2.writeInt(1);
                    l.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
