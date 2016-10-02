package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.ads.internal.client.v */
public final class C0371v implements Creator {
    public static AdSizeParcel m2446a(Parcel parcel) {
        AdSizeParcel[] adSizeParcelArr = null;
        boolean z = false;
        int a = C0736a.m5564a(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        int i5 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i5 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    i4 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    i3 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    z4 = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    adSizeParcelArr = (AdSizeParcel[]) C0736a.m5570b(parcel, readInt, AdSizeParcel.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                    z3 = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                    z2 = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiZoomControls /*11*/:
                    z = C0736a.m5572c(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new AdSizeParcel(i5, str, i4, i3, z4, i2, i, adSizeParcelArr, z3, z2, z);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    static void m2447a(AdSizeParcel adSizeParcel, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, adSizeParcel.f1902a);
        C0738c.m5598a(parcel, 2, adSizeParcel.f1903b);
        C0738c.m5606b(parcel, 3, adSizeParcel.f1904c);
        C0738c.m5606b(parcel, 4, adSizeParcel.f1905d);
        C0738c.m5600a(parcel, 5, adSizeParcel.f1906e);
        C0738c.m5606b(parcel, 6, adSizeParcel.f1907f);
        C0738c.m5606b(parcel, 7, adSizeParcel.f1908g);
        C0738c.m5602a(parcel, 8, adSizeParcel.f1909h, i);
        C0738c.m5600a(parcel, 9, adSizeParcel.f1910i);
        C0738c.m5600a(parcel, 10, adSizeParcel.f1911j);
        C0738c.m5600a(parcel, 11, adSizeParcel.f1912k);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0371v.m2446a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdSizeParcel[i];
    }
}
