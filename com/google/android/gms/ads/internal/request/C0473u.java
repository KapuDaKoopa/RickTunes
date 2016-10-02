package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.andromo.dev576782.app537736.hp;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.request.u */
public final class C0473u implements Creator {
    public static AdResponseParcel m2911a(Parcel parcel) {
        int a = C0736a.m5564a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        int i2 = 0;
        List list2 = null;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        List list3 = null;
        long j3 = 0;
        int i3 = 0;
        String str3 = null;
        long j4 = 0;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        String str6 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i4 = 0;
        LargeParcelTeleporter largeParcelTeleporter = null;
        String str7 = null;
        String str8 = null;
        boolean z8 = false;
        boolean z9 = false;
        RewardItemParcel rewardItemParcel = null;
        List list4 = null;
        List list5 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    str2 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    list = C0736a.m5587r(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    list2 = C0736a.m5587r(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    j = C0736a.m5575f(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    z = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                    j2 = C0736a.m5575f(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                    list3 = C0736a.m5587r(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiZoomControls /*11*/:
                    j3 = C0736a.m5575f(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiZoomGestures /*12*/:
                    i3 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.MapAttrs_useViewLifecycle /*13*/:
                    str3 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.MapAttrs_zOrderOnTop /*14*/:
                    j4 = C0736a.m5575f(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiMapToolbar /*15*/:
                    str4 = C0736a.m5580k(parcel, readInt);
                    break;
                case hp.SherlockTheme_actionModeShareDrawable /*18*/:
                    z2 = C0736a.m5572c(parcel, readInt);
                    break;
                case hp.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    str5 = C0736a.m5580k(parcel, readInt);
                    break;
                case hp.SherlockTheme_selectableItemBackground /*21*/:
                    str6 = C0736a.m5580k(parcel, readInt);
                    break;
                case hp.SherlockTheme_windowContentOverlay /*22*/:
                    z3 = C0736a.m5572c(parcel, readInt);
                    break;
                case hp.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    z4 = C0736a.m5572c(parcel, readInt);
                    break;
                case hp.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    z5 = C0736a.m5572c(parcel, readInt);
                    break;
                case hp.SherlockTheme_textAppearanceSmall /*25*/:
                    z6 = C0736a.m5572c(parcel, readInt);
                    break;
                case hp.SherlockTheme_textColorPrimary /*26*/:
                    z7 = C0736a.m5572c(parcel, readInt);
                    break;
                case hp.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    i4 = C0736a.m5573d(parcel, readInt);
                    break;
                case hp.SherlockTheme_textColorPrimaryInverse /*28*/:
                    largeParcelTeleporter = (LargeParcelTeleporter) C0736a.m5566a(parcel, readInt, LargeParcelTeleporter.CREATOR);
                    break;
                case hp.SherlockTheme_spinnerItemStyle /*29*/:
                    str7 = C0736a.m5580k(parcel, readInt);
                    break;
                case hp.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    str8 = C0736a.m5580k(parcel, readInt);
                    break;
                case hp.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    z8 = C0736a.m5572c(parcel, readInt);
                    break;
                case hp.SherlockTheme_searchDropdownBackground /*32*/:
                    z9 = C0736a.m5572c(parcel, readInt);
                    break;
                case hp.SherlockTheme_searchViewCloseIcon /*33*/:
                    rewardItemParcel = (RewardItemParcel) C0736a.m5566a(parcel, readInt, RewardItemParcel.CREATOR);
                    break;
                case hp.SherlockTheme_searchViewGoIcon /*34*/:
                    list4 = C0736a.m5587r(parcel, readInt);
                    break;
                case hp.SherlockTheme_searchViewSearchIcon /*35*/:
                    list5 = C0736a.m5587r(parcel, readInt);
                    break;
                case hp.SherlockTheme_searchViewVoiceIcon /*36*/:
                    z10 = C0736a.m5572c(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new AdResponseParcel(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, i4, largeParcelTeleporter, str7, str8, z8, z9, rewardItemParcel, list4, list5, z10);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    static void m2912a(AdResponseParcel adResponseParcel, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, adResponseParcel.f2356a);
        C0738c.m5598a(parcel, 2, adResponseParcel.f2357b);
        C0738c.m5598a(parcel, 3, adResponseParcel.f2358c);
        C0738c.m5599a(parcel, 4, adResponseParcel.f2359d);
        C0738c.m5606b(parcel, 5, adResponseParcel.f2360e);
        C0738c.m5599a(parcel, 6, adResponseParcel.f2361f);
        C0738c.m5593a(parcel, 7, adResponseParcel.f2362g);
        C0738c.m5600a(parcel, 8, adResponseParcel.f2363h);
        C0738c.m5593a(parcel, 9, adResponseParcel.f2364i);
        C0738c.m5599a(parcel, 10, adResponseParcel.f2365j);
        C0738c.m5593a(parcel, 11, adResponseParcel.f2366k);
        C0738c.m5606b(parcel, 12, adResponseParcel.f2367l);
        C0738c.m5598a(parcel, 13, adResponseParcel.f2368m);
        C0738c.m5593a(parcel, 14, adResponseParcel.f2369n);
        C0738c.m5598a(parcel, 15, adResponseParcel.f2370o);
        C0738c.m5598a(parcel, 19, adResponseParcel.f2372q);
        C0738c.m5600a(parcel, 18, adResponseParcel.f2371p);
        C0738c.m5598a(parcel, 21, adResponseParcel.f2373r);
        C0738c.m5600a(parcel, 23, adResponseParcel.f2375t);
        C0738c.m5600a(parcel, 22, adResponseParcel.f2374s);
        C0738c.m5600a(parcel, 25, adResponseParcel.f2377v);
        C0738c.m5600a(parcel, 24, adResponseParcel.f2376u);
        C0738c.m5606b(parcel, 27, adResponseParcel.f2379x);
        C0738c.m5600a(parcel, 26, adResponseParcel.f2378w);
        C0738c.m5598a(parcel, 29, adResponseParcel.f2381z);
        C0738c.m5596a(parcel, 28, adResponseParcel.f2380y, i);
        C0738c.m5600a(parcel, 31, adResponseParcel.f2349B);
        C0738c.m5598a(parcel, 30, adResponseParcel.f2348A);
        C0738c.m5599a(parcel, 34, adResponseParcel.f2352E);
        C0738c.m5599a(parcel, 35, adResponseParcel.f2353F);
        C0738c.m5600a(parcel, 32, adResponseParcel.f2350C);
        C0738c.m5596a(parcel, 33, adResponseParcel.f2351D, i);
        C0738c.m5600a(parcel, 36, adResponseParcel.f2354G);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0473u.m2911a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdResponseParcel[i];
    }
}
