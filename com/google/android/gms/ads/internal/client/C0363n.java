package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.ads.internal.client.n */
public final class C0363n implements Creator {
    static void m2430a(SearchAdRequestParcel searchAdRequestParcel, Parcel parcel) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, searchAdRequestParcel.f1913a);
        C0738c.m5606b(parcel, 2, searchAdRequestParcel.f1914b);
        C0738c.m5606b(parcel, 3, searchAdRequestParcel.f1915c);
        C0738c.m5606b(parcel, 4, searchAdRequestParcel.f1916d);
        C0738c.m5606b(parcel, 5, searchAdRequestParcel.f1917e);
        C0738c.m5606b(parcel, 6, searchAdRequestParcel.f1918f);
        C0738c.m5606b(parcel, 7, searchAdRequestParcel.f1919g);
        C0738c.m5606b(parcel, 8, searchAdRequestParcel.f1920h);
        C0738c.m5606b(parcel, 9, searchAdRequestParcel.f1921i);
        C0738c.m5598a(parcel, 10, searchAdRequestParcel.f1922j);
        C0738c.m5606b(parcel, 11, searchAdRequestParcel.f1923k);
        C0738c.m5598a(parcel, 12, searchAdRequestParcel.f1924l);
        C0738c.m5606b(parcel, 13, searchAdRequestParcel.f1925m);
        C0738c.m5606b(parcel, 14, searchAdRequestParcel.f1926n);
        C0738c.m5598a(parcel, 15, searchAdRequestParcel.f1927o);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0736a.m5564a(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = 0;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    i3 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    i4 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    i5 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    i6 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    i7 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    i8 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                    i9 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiZoomControls /*11*/:
                    i10 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiZoomGestures /*12*/:
                    str2 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.MapAttrs_useViewLifecycle /*13*/:
                    i11 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.MapAttrs_zOrderOnTop /*14*/:
                    i12 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiMapToolbar /*15*/:
                    str3 = C0736a.m5580k(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new SearchAdRequestParcel(i, i2, i3, i4, i5, i6, i7, i8, i9, str, i10, str2, i11, i12, str3);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SearchAdRequestParcel[i];
    }
}
