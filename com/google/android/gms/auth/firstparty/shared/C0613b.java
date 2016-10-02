package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.auth.firstparty.shared.b */
public final class C0613b implements Creator {
    static void m3410a(FACLData fACLData, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, fACLData.f2864a);
        C0738c.m5596a(parcel, 2, fACLData.f2865b, i);
        C0738c.m5598a(parcel, 3, fACLData.f2866c);
        C0738c.m5600a(parcel, 4, fACLData.f2867d);
        C0738c.m5598a(parcel, 5, fACLData.f2868e);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        String str = null;
        int a = C0736a.m5564a(parcel);
        String str2 = null;
        FACLConfig fACLConfig = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    fACLConfig = (FACLConfig) C0736a.m5566a(parcel, readInt, FACLConfig.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    str2 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    z = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new FACLData(i, fACLConfig, str2, z, str);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FACLData[i];
    }
}
