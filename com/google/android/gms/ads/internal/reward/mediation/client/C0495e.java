package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.ads.internal.reward.mediation.client.e */
public final class C0495e implements Creator {
    public static RewardItemParcel m2981a(Parcel parcel) {
        int i = 0;
        int a = C0736a.m5564a(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new RewardItemParcel(i2, str, i);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    static void m2982a(RewardItemParcel rewardItemParcel, Parcel parcel) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, rewardItemParcel.f2512a);
        C0738c.m5598a(parcel, 2, rewardItemParcel.f2513b);
        C0738c.m5606b(parcel, 3, rewardItemParcel.f2514c);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0495e.m2981a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RewardItemParcel[i];
    }
}
