package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.C0772e;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0315b;

/* renamed from: com.google.android.gms.ads.internal.reward.mediation.client.b */
public abstract class C0492b extends Binder implements C0491a {
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                m2953a(C0315b.m1995a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                m2954a(C0315b.m1995a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                m2956b(C0315b.m1995a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                m2958c(C0315b.m1995a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                m2959d(C0315b.m1995a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                m2960e(C0315b.m1995a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                RewardItemParcel a;
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                C0314a a2 = C0315b.m1995a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    C0495e c0495e = RewardItemParcel.CREATOR;
                    a = C0495e.m2981a(parcel);
                } else {
                    a = null;
                }
                m2955a(a2, a);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                m2961f(C0315b.m1995a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                m2957b(C0315b.m1995a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                m2962g(C0315b.m1995a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
