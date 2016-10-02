package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.auth.firstparty.shared.c */
public final class C0614c implements Creator {
    static void m3411a(ScopeDetail scopeDetail, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, scopeDetail.f2869a);
        C0738c.m5598a(parcel, 2, scopeDetail.f2870b);
        C0738c.m5598a(parcel, 3, scopeDetail.f2871c);
        C0738c.m5598a(parcel, 4, scopeDetail.f2872d);
        C0738c.m5598a(parcel, 5, scopeDetail.f2873e);
        C0738c.m5598a(parcel, 6, scopeDetail.f2874f);
        C0738c.m5599a(parcel, 7, scopeDetail.f2875g);
        C0738c.m5596a(parcel, 8, scopeDetail.f2876h, i);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        FACLData fACLData = null;
        int a = C0736a.m5564a(parcel);
        int i = 0;
        List arrayList = new ArrayList();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    str5 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    str4 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    str3 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    str2 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    arrayList = C0736a.m5587r(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    fACLData = (FACLData) C0736a.m5566a(parcel, readInt, FACLData.CREATOR);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ScopeDetail(i, str5, str4, str3, str2, str, arrayList, fACLData);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ScopeDetail[i];
    }
}
