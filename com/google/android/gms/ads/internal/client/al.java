package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.formats.C0395q;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.p006b.ee;
import com.google.android.gms.p006b.eg;
import com.google.android.gms.p006b.eh;
import com.google.android.gms.p006b.ej;
import com.google.android.gms.p006b.ek;
import com.google.android.gms.p006b.em;
import com.google.android.gms.p006b.en;
import com.google.android.gms.p006b.ep;

public abstract class al extends Binder implements ak {
    public al() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public static ak m2308a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof ak)) ? new am(iBinder) : (ak) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        NativeAdOptionsParcel nativeAdOptionsParcel = null;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                ah a = m2301a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a != null ? a.asBinder() : null);
                return true;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                m2302a(af.m2288a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                ee egVar;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    egVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ee)) ? new eg(readStrongBinder) : (ee) queryLocalInterface;
                }
                m2305a(egVar);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                eh ejVar;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    ejVar = (queryLocalInterface == null || !(queryLocalInterface instanceof eh)) ? new ej(readStrongBinder) : (eh) queryLocalInterface;
                }
                m2306a(ejVar);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                en enVar;
                ek emVar;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                String readString = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    enVar = null;
                } else {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof en)) {
                        Object epVar = new ep(readStrongBinder);
                    } else {
                        enVar = (en) queryLocalInterface;
                    }
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    emVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ek)) ? new em(readStrongBinder2) : (ek) queryLocalInterface;
                }
                m2307a(readString, enVar, emVar);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (parcel.readInt() != 0) {
                    C0395q c0395q = NativeAdOptionsParcel.CREATOR;
                    nativeAdOptionsParcel = C0395q.m2594a(parcel);
                }
                m2304a(nativeAdOptionsParcel);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                m2303a(ba.m2279a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
