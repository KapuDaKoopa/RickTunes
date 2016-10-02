package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.andromo.dev576782.app537736.hp;
import com.google.android.gms.C0772e;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.request.s */
public final class C0471s implements Creator {
    public static AdRequestInfoParcel m2908a(Parcel parcel) {
        int a = C0736a.m5564a(parcel);
        int i = 0;
        Bundle bundle = null;
        AdRequestParcel adRequestParcel = null;
        AdSizeParcel adSizeParcel = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        int i2 = 0;
        List list = null;
        Bundle bundle3 = null;
        boolean z = false;
        Messenger messenger = null;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list2 = null;
        String str7 = null;
        NativeAdOptionsParcel nativeAdOptionsParcel = null;
        List list3 = null;
        long j2 = 0;
        CapabilityParcel capabilityParcel = null;
        String str8 = null;
        float f2 = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    bundle = C0736a.m5582m(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    adRequestParcel = (AdRequestParcel) C0736a.m5566a(parcel, readInt, AdRequestParcel.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    adSizeParcel = (AdSizeParcel) C0736a.m5566a(parcel, readInt, AdSizeParcel.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    applicationInfo = (ApplicationInfo) C0736a.m5566a(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    packageInfo = (PackageInfo) C0736a.m5566a(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    str2 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                    str3 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                    str4 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiZoomControls /*11*/:
                    versionInfoParcel = (VersionInfoParcel) C0736a.m5566a(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case C0772e.MapAttrs_uiZoomGestures /*12*/:
                    bundle2 = C0736a.m5582m(parcel, readInt);
                    break;
                case C0772e.MapAttrs_useViewLifecycle /*13*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.MapAttrs_zOrderOnTop /*14*/:
                    list = C0736a.m5587r(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiMapToolbar /*15*/:
                    bundle3 = C0736a.m5582m(parcel, readInt);
                    break;
                case C0772e.MapAttrs_ambientEnabled /*16*/:
                    z = C0736a.m5572c(parcel, readInt);
                    break;
                case hp.SherlockTheme_actionModeCloseDrawable /*17*/:
                    messenger = (Messenger) C0736a.m5566a(parcel, readInt, Messenger.CREATOR);
                    break;
                case hp.SherlockTheme_actionModeShareDrawable /*18*/:
                    i3 = C0736a.m5573d(parcel, readInt);
                    break;
                case hp.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    i4 = C0736a.m5573d(parcel, readInt);
                    break;
                case hp.SherlockTheme_buttonStyleSmall /*20*/:
                    f = C0736a.m5577h(parcel, readInt);
                    break;
                case hp.SherlockTheme_selectableItemBackground /*21*/:
                    str5 = C0736a.m5580k(parcel, readInt);
                    break;
                case hp.SherlockTheme_textAppearanceSmall /*25*/:
                    j = C0736a.m5575f(parcel, readInt);
                    break;
                case hp.SherlockTheme_textColorPrimary /*26*/:
                    str6 = C0736a.m5580k(parcel, readInt);
                    break;
                case hp.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                    list2 = C0736a.m5587r(parcel, readInt);
                    break;
                case hp.SherlockTheme_textColorPrimaryInverse /*28*/:
                    str7 = C0736a.m5580k(parcel, readInt);
                    break;
                case hp.SherlockTheme_spinnerItemStyle /*29*/:
                    nativeAdOptionsParcel = (NativeAdOptionsParcel) C0736a.m5566a(parcel, readInt, NativeAdOptionsParcel.CREATOR);
                    break;
                case hp.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                    list3 = C0736a.m5587r(parcel, readInt);
                    break;
                case hp.SherlockTheme_searchAutoCompleteTextView /*31*/:
                    j2 = C0736a.m5575f(parcel, readInt);
                    break;
                case hp.SherlockTheme_searchDropdownBackground /*32*/:
                    capabilityParcel = (CapabilityParcel) C0736a.m5566a(parcel, readInt, CapabilityParcel.CREATOR);
                    break;
                case hp.SherlockTheme_searchViewCloseIcon /*33*/:
                    str8 = C0736a.m5580k(parcel, readInt);
                    break;
                case hp.SherlockTheme_searchViewGoIcon /*34*/:
                    f2 = C0736a.m5577h(parcel, readInt);
                    break;
                case hp.SherlockTheme_searchViewSearchIcon /*35*/:
                    i5 = C0736a.m5573d(parcel, readInt);
                    break;
                case hp.SherlockTheme_searchViewVoiceIcon /*36*/:
                    i6 = C0736a.m5573d(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new AdRequestInfoParcel(i, bundle, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i2, list, bundle3, z, messenger, i3, i4, f, str5, j, str6, list2, str7, nativeAdOptionsParcel, list3, j2, capabilityParcel, str8, f2, i5, i6);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    static void m2909a(AdRequestInfoParcel adRequestInfoParcel, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, adRequestInfoParcel.f2322a);
        C0738c.m5594a(parcel, 2, adRequestInfoParcel.f2323b);
        C0738c.m5596a(parcel, 3, adRequestInfoParcel.f2324c, i);
        C0738c.m5596a(parcel, 4, adRequestInfoParcel.f2325d, i);
        C0738c.m5598a(parcel, 5, adRequestInfoParcel.f2326e);
        C0738c.m5596a(parcel, 6, adRequestInfoParcel.f2327f, i);
        C0738c.m5596a(parcel, 7, adRequestInfoParcel.f2328g, i);
        C0738c.m5598a(parcel, 8, adRequestInfoParcel.f2329h);
        C0738c.m5598a(parcel, 9, adRequestInfoParcel.f2330i);
        C0738c.m5598a(parcel, 10, adRequestInfoParcel.f2331j);
        C0738c.m5596a(parcel, 11, adRequestInfoParcel.f2332k, i);
        C0738c.m5594a(parcel, 12, adRequestInfoParcel.f2333l);
        C0738c.m5606b(parcel, 13, adRequestInfoParcel.f2334m);
        C0738c.m5599a(parcel, 14, adRequestInfoParcel.f2335n);
        C0738c.m5594a(parcel, 15, adRequestInfoParcel.f2336o);
        C0738c.m5596a(parcel, 17, adRequestInfoParcel.f2338q, i);
        C0738c.m5600a(parcel, 16, adRequestInfoParcel.f2337p);
        C0738c.m5606b(parcel, 19, adRequestInfoParcel.f2340s);
        C0738c.m5606b(parcel, 18, adRequestInfoParcel.f2339r);
        C0738c.m5598a(parcel, 21, adRequestInfoParcel.f2342u);
        C0738c.m5591a(parcel, 20, adRequestInfoParcel.f2341t);
        C0738c.m5593a(parcel, 25, adRequestInfoParcel.f2343v);
        C0738c.m5599a(parcel, 27, adRequestInfoParcel.f2345x);
        C0738c.m5598a(parcel, 26, adRequestInfoParcel.f2344w);
        C0738c.m5596a(parcel, 29, adRequestInfoParcel.f2347z, i);
        C0738c.m5598a(parcel, 28, adRequestInfoParcel.f2346y);
        C0738c.m5593a(parcel, 31, adRequestInfoParcel.f2316B);
        C0738c.m5599a(parcel, 30, adRequestInfoParcel.f2315A);
        C0738c.m5591a(parcel, 34, adRequestInfoParcel.f2319E);
        C0738c.m5606b(parcel, 35, adRequestInfoParcel.f2320F);
        C0738c.m5596a(parcel, 32, adRequestInfoParcel.f2317C, i);
        C0738c.m5598a(parcel, 33, adRequestInfoParcel.f2318D);
        C0738c.m5606b(parcel, 36, adRequestInfoParcel.f2321G);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0471s.m2908a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdRequestInfoParcel[i];
    }
}
