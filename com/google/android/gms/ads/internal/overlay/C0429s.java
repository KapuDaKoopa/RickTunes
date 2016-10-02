package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.andromo.dev576782.app537736.hp;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.ads.internal.overlay.s */
public final class C0429s implements Creator {
    static void m2713a(AdOverlayInfoParcel adOverlayInfoParcel, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, adOverlayInfoParcel.f2158a);
        C0738c.m5596a(parcel, 2, adOverlayInfoParcel.f2159b, i);
        C0738c.m5595a(parcel, 3, adOverlayInfoParcel.m2619a());
        C0738c.m5595a(parcel, 4, adOverlayInfoParcel.m2620b());
        C0738c.m5595a(parcel, 5, adOverlayInfoParcel.m2621c());
        C0738c.m5595a(parcel, 6, adOverlayInfoParcel.m2622d());
        C0738c.m5598a(parcel, 7, adOverlayInfoParcel.f2164g);
        C0738c.m5600a(parcel, 8, adOverlayInfoParcel.f2165h);
        C0738c.m5598a(parcel, 9, adOverlayInfoParcel.f2166i);
        C0738c.m5595a(parcel, 10, adOverlayInfoParcel.m2624f());
        C0738c.m5606b(parcel, 11, adOverlayInfoParcel.f2168k);
        C0738c.m5606b(parcel, 12, adOverlayInfoParcel.f2169l);
        C0738c.m5598a(parcel, 13, adOverlayInfoParcel.f2170m);
        C0738c.m5596a(parcel, 14, adOverlayInfoParcel.f2171n, i);
        C0738c.m5595a(parcel, 15, adOverlayInfoParcel.m2623e());
        C0738c.m5596a(parcel, 17, adOverlayInfoParcel.f2174q, i);
        C0738c.m5598a(parcel, 16, adOverlayInfoParcel.f2173p);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0736a.m5564a(parcel);
        int i = 0;
        AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        IBinder iBinder6 = null;
        String str4 = null;
        InterstitialAdParameterParcel interstitialAdParameterParcel = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    adLauncherIntentInfoParcel = (AdLauncherIntentInfoParcel) C0736a.m5566a(parcel, readInt, AdLauncherIntentInfoParcel.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    iBinder = C0736a.m5581l(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    iBinder2 = C0736a.m5581l(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    iBinder3 = C0736a.m5581l(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    iBinder4 = C0736a.m5581l(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    z = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                    str2 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                    iBinder5 = C0736a.m5581l(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiZoomControls /*11*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiZoomGestures /*12*/:
                    i3 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.MapAttrs_useViewLifecycle /*13*/:
                    str3 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.MapAttrs_zOrderOnTop /*14*/:
                    versionInfoParcel = (VersionInfoParcel) C0736a.m5566a(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case C0772e.MapAttrs_uiMapToolbar /*15*/:
                    iBinder6 = C0736a.m5581l(parcel, readInt);
                    break;
                case C0772e.MapAttrs_ambientEnabled /*16*/:
                    str4 = C0736a.m5580k(parcel, readInt);
                    break;
                case hp.SherlockTheme_actionModeCloseDrawable /*17*/:
                    interstitialAdParameterParcel = (InterstitialAdParameterParcel) C0736a.m5566a(parcel, readInt, InterstitialAdParameterParcel.CREATOR);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new AdOverlayInfoParcel(i, adLauncherIntentInfoParcel, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, versionInfoParcel, iBinder6, str4, interstitialAdParameterParcel);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
