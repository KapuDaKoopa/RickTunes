package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.andromo.dev576782.app537736.hp;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.client.t */
public final class C0369t implements Creator {
    public static AdRequestParcel m2442a(Parcel parcel) {
        int a = C0736a.m5564a(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        List list = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        SearchAdRequestParcel searchAdRequestParcel = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    j = C0736a.m5575f(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    bundle = C0736a.m5582m(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    list = C0736a.m5587r(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    z = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    i3 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    z2 = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                    searchAdRequestParcel = (SearchAdRequestParcel) C0736a.m5566a(parcel, readInt, SearchAdRequestParcel.CREATOR);
                    break;
                case C0772e.MapAttrs_uiZoomControls /*11*/:
                    location = (Location) C0736a.m5566a(parcel, readInt, Location.CREATOR);
                    break;
                case C0772e.MapAttrs_uiZoomGestures /*12*/:
                    str2 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.MapAttrs_useViewLifecycle /*13*/:
                    bundle2 = C0736a.m5582m(parcel, readInt);
                    break;
                case C0772e.MapAttrs_zOrderOnTop /*14*/:
                    bundle3 = C0736a.m5582m(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiMapToolbar /*15*/:
                    list2 = C0736a.m5587r(parcel, readInt);
                    break;
                case C0772e.MapAttrs_ambientEnabled /*16*/:
                    str3 = C0736a.m5580k(parcel, readInt);
                    break;
                case hp.SherlockTheme_actionModeCloseDrawable /*17*/:
                    str4 = C0736a.m5580k(parcel, readInt);
                    break;
                case hp.SherlockTheme_actionModeShareDrawable /*18*/:
                    z3 = C0736a.m5572c(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new AdRequestParcel(i, j, bundle, i2, list, z, i3, z2, str, searchAdRequestParcel, location, str2, bundle2, bundle3, list2, str3, str4, z3);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    static void m2443a(AdRequestParcel adRequestParcel, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, adRequestParcel.f1884a);
        C0738c.m5593a(parcel, 2, adRequestParcel.f1885b);
        C0738c.m5594a(parcel, 3, adRequestParcel.f1886c);
        C0738c.m5606b(parcel, 4, adRequestParcel.f1887d);
        C0738c.m5599a(parcel, 5, adRequestParcel.f1888e);
        C0738c.m5600a(parcel, 6, adRequestParcel.f1889f);
        C0738c.m5606b(parcel, 7, adRequestParcel.f1890g);
        C0738c.m5600a(parcel, 8, adRequestParcel.f1891h);
        C0738c.m5598a(parcel, 9, adRequestParcel.f1892i);
        C0738c.m5596a(parcel, 10, adRequestParcel.f1893j, i);
        C0738c.m5596a(parcel, 11, adRequestParcel.f1894k, i);
        C0738c.m5598a(parcel, 12, adRequestParcel.f1895l);
        C0738c.m5594a(parcel, 13, adRequestParcel.f1896m);
        C0738c.m5594a(parcel, 14, adRequestParcel.f1897n);
        C0738c.m5599a(parcel, 15, adRequestParcel.f1898o);
        C0738c.m5598a(parcel, 17, adRequestParcel.f1900q);
        C0738c.m5598a(parcel, 16, adRequestParcel.f1899p);
        C0738c.m5600a(parcel, 18, adRequestParcel.f1901r);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0369t.m2442a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdRequestParcel[i];
    }
}
