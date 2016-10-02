package com.google.android.gms.p006b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.andromo.dev576782.app537736.hp;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0369t;
import com.google.android.gms.ads.internal.client.C0371v;
import com.google.android.gms.ads.internal.formats.C0395q;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.C0491a;
import com.google.android.gms.ads.internal.reward.mediation.client.C0493c;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0315b;

/* renamed from: com.google.android.gms.b.ki */
public abstract class ki extends Binder implements kh {
    public ki() {
        attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static kh m3984a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof kh)) ? new kj(iBinder) : (kh) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        AdRequestParcel adRequestParcel = null;
        C0314a a;
        C0371v c0371v;
        AdSizeParcel a2;
        C0369t c0369t;
        AdRequestParcel a3;
        IBinder asBinder;
        AdRequestParcel a4;
        C0369t c0369t2;
        String readString;
        Bundle j;
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = C0315b.m1995a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    c0371v = AdSizeParcel.CREATOR;
                    a2 = C0371v.m2446a(parcel);
                } else {
                    a2 = null;
                }
                if (parcel.readInt() != 0) {
                    c0369t = AdRequestParcel.CREATOR;
                    a3 = C0369t.m2442a(parcel);
                } else {
                    a3 = null;
                }
                m3969a(a, a2, a3, parcel.readString(), kl.m3917a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = m3964a();
                parcel2.writeNoException();
                if (a != null) {
                    asBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = C0315b.m1995a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    c0369t = AdRequestParcel.CREATOR;
                    adRequestParcel = C0369t.m2442a(parcel);
                }
                m3966a(a, adRequestParcel, parcel.readString(), kl.m3917a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                m3973b();
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                m3974c();
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = C0315b.m1995a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    c0371v = AdSizeParcel.CREATOR;
                    a2 = C0371v.m2446a(parcel);
                } else {
                    a2 = null;
                }
                if (parcel.readInt() != 0) {
                    c0369t = AdRequestParcel.CREATOR;
                    a3 = C0369t.m2442a(parcel);
                } else {
                    a3 = null;
                }
                m3970a(a, a2, a3, parcel.readString(), parcel.readString(), kl.m3917a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = C0315b.m1995a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    c0369t = AdRequestParcel.CREATOR;
                    a4 = C0369t.m2442a(parcel);
                } else {
                    a4 = null;
                }
                m3967a(a, a4, parcel.readString(), parcel.readString(), kl.m3917a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                m3975d();
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                m3976e();
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                C0491a c0491a;
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = C0315b.m1995a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    c0369t2 = AdRequestParcel.CREATOR;
                    a4 = C0369t.m2442a(parcel);
                } else {
                    a4 = null;
                }
                readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0491a = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C0491a)) {
                        Object c0493c = new C0493c(readStrongBinder);
                    } else {
                        c0491a = (C0491a) queryLocalInterface;
                    }
                }
                m3965a(a, a4, readString, c0491a, parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0772e.MapAttrs_uiZoomControls /*11*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                if (parcel.readInt() != 0) {
                    c0369t = AdRequestParcel.CREATOR;
                    adRequestParcel = C0369t.m2442a(parcel);
                }
                m3971a(adRequestParcel, parcel.readString());
                parcel2.writeNoException();
                return true;
            case C0772e.MapAttrs_uiZoomGestures /*12*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                m3977f();
                parcel2.writeNoException();
                return true;
            case C0772e.MapAttrs_useViewLifecycle /*13*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                boolean g = m3978g();
                parcel2.writeNoException();
                parcel2.writeInt(g ? 1 : 0);
                return true;
            case C0772e.MapAttrs_zOrderOnTop /*14*/:
                NativeAdOptionsParcel a5;
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                a = C0315b.m1995a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    c0369t2 = AdRequestParcel.CREATOR;
                    a4 = C0369t.m2442a(parcel);
                } else {
                    a4 = null;
                }
                readString = parcel.readString();
                String readString2 = parcel.readString();
                kk a6 = kl.m3917a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    C0395q c0395q = NativeAdOptionsParcel.CREATOR;
                    a5 = C0395q.m2594a(parcel);
                } else {
                    a5 = null;
                }
                m3968a(a, a4, readString, readString2, a6, a5, parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case C0772e.MapAttrs_uiMapToolbar /*15*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                kr h = m3979h();
                parcel2.writeNoException();
                if (h != null) {
                    asBinder = h.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case C0772e.MapAttrs_ambientEnabled /*16*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                ku i3 = m3980i();
                parcel2.writeNoException();
                if (i3 != null) {
                    asBinder = i3.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case hp.SherlockTheme_actionModeCloseDrawable /*17*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                j = m3981j();
                parcel2.writeNoException();
                if (j != null) {
                    parcel2.writeInt(1);
                    j.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case hp.SherlockTheme_actionModeShareDrawable /*18*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                j = m3982k();
                parcel2.writeNoException();
                if (j != null) {
                    parcel2.writeInt(1);
                    j.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case hp.SherlockTheme_actionModePopupWindowStyle /*19*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                j = m3983l();
                parcel2.writeNoException();
                if (j != null) {
                    parcel2.writeInt(1);
                    j.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case hp.SherlockTheme_buttonStyleSmall /*20*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                if (parcel.readInt() != 0) {
                    c0369t = AdRequestParcel.CREATOR;
                    adRequestParcel = C0369t.m2442a(parcel);
                }
                m3972a(adRequestParcel, parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
