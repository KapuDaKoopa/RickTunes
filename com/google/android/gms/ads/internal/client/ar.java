package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.andromo.dev576782.app537736.hp;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.reward.client.C0484g;
import com.google.android.gms.ads.internal.reward.client.C0486i;
import com.google.android.gms.p006b.df;
import com.google.android.gms.p006b.dh;
import com.google.android.gms.p006b.mq;
import com.google.android.gms.p006b.ms;
import com.google.android.gms.p006b.nc;
import com.google.android.gms.p006b.ne;
import com.google.android.gms.p017a.C0314a;

public abstract class ar extends Binder implements aq {
    public ar() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static aq m2137a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof aq)) ? new as(iBinder) : (aq) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        C0484g c0484g = null;
        boolean c;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        AdSizeParcel i4;
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                IBinder asBinder;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                C0314a a = m2115a();
                parcel2.writeNoException();
                if (a != null) {
                    asBinder = a.asBinder();
                }
                parcel2.writeStrongBinder(asBinder);
                return true;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m2128b();
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                c = m2129c();
                parcel2.writeNoException();
                parcel2.writeInt(c ? 1 : 0);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                AdRequestParcel a2;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (parcel.readInt() != 0) {
                    C0369t c0369t = AdRequestParcel.CREATOR;
                    a2 = C0369t.m2442a(parcel);
                }
                c = m2127a(a2);
                parcel2.writeNoException();
                if (c) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m2130d();
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                c_();
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m2118a(af.m2288a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                aw ayVar;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    ayVar = (queryLocalInterface == null || !(queryLocalInterface instanceof aw)) ? new ay(readStrongBinder) : (aw) queryLocalInterface;
                }
                m2119a(ayVar);
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m2131f();
                parcel2.writeNoException();
                return true;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m2132g();
                parcel2.writeNoException();
                return true;
            case C0772e.MapAttrs_uiZoomControls /*11*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m2133h();
                parcel2.writeNoException();
                return true;
            case C0772e.MapAttrs_uiZoomGestures /*12*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                i4 = m2134i();
                parcel2.writeNoException();
                if (i4 != null) {
                    parcel2.writeInt(1);
                    i4.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case C0772e.MapAttrs_useViewLifecycle /*13*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (parcel.readInt() != 0) {
                    C0371v c0371v = AdSizeParcel.CREATOR;
                    i4 = C0371v.m2446a(parcel);
                }
                m2116a(i4);
                parcel2.writeNoException();
                return true;
            case C0772e.MapAttrs_zOrderOnTop /*14*/:
                mq msVar;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    msVar = (queryLocalInterface == null || !(queryLocalInterface instanceof mq)) ? new ms(readStrongBinder) : (mq) queryLocalInterface;
                }
                m2123a(msVar);
                parcel2.writeNoException();
                return true;
            case C0772e.MapAttrs_uiMapToolbar /*15*/:
                nc neVar;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    neVar = (queryLocalInterface == null || !(queryLocalInterface instanceof nc)) ? new ne(readStrongBinder) : (nc) queryLocalInterface;
                }
                m2124a(neVar, parcel.readString());
                parcel2.writeNoException();
                return true;
            case hp.SherlockTheme_actionModeShareDrawable /*18*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                String j = m2135j();
                parcel2.writeNoException();
                parcel2.writeString(j);
                return true;
            case hp.SherlockTheme_actionModePopupWindowStyle /*19*/:
                df dhVar;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    dhVar = (queryLocalInterface == null || !(queryLocalInterface instanceof df)) ? new dh(readStrongBinder) : (df) queryLocalInterface;
                }
                m2122a(dhVar);
                parcel2.writeNoException();
                return true;
            case hp.SherlockTheme_buttonStyleSmall /*20*/:
                ab adVar;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    adVar = (queryLocalInterface == null || !(queryLocalInterface instanceof ab)) ? new ad(readStrongBinder) : (ab) queryLocalInterface;
                }
                m2117a(adVar);
                parcel2.writeNoException();
                return true;
            case hp.SherlockTheme_selectableItemBackground /*21*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m2120a(ba.m2279a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case hp.SherlockTheme_windowContentOverlay /*22*/:
                boolean z;
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                m2126a(z);
                parcel2.writeNoException();
                return true;
            case hp.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                c = m2136k();
                parcel2.writeNoException();
                if (c) {
                    i3 = 1;
                }
                parcel2.writeInt(i3);
                return true;
            case hp.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c0484g = (queryLocalInterface == null || !(queryLocalInterface instanceof C0484g)) ? new C0486i(readStrongBinder) : (C0484g) queryLocalInterface;
                }
                m2121a(c0484g);
                parcel2.writeNoException();
                return true;
            case hp.SherlockTheme_textAppearanceSmall /*25*/:
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                m2125a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 1598968902:
                parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManager");
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
