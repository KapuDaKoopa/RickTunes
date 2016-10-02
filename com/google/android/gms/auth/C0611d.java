package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;
import java.util.List;

/* renamed from: com.google.android.gms.auth.d */
public final class C0611d implements Creator {
    static void m3408a(TokenData tokenData, Parcel parcel) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, tokenData.f2619a);
        C0738c.m5598a(parcel, 2, tokenData.m3127a());
        Long b = tokenData.m3128b();
        if (b != null) {
            C0738c.m5592a(parcel, 3, 8);
            parcel.writeLong(b.longValue());
        }
        C0738c.m5600a(parcel, 4, tokenData.m3129c());
        C0738c.m5600a(parcel, 5, tokenData.m3130d());
        C0738c.m5599a(parcel, 6, tokenData.m3131e());
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = C0736a.m5564a(parcel);
        List list = null;
        boolean z2 = false;
        Long l = null;
        String str = null;
        int i = 0;
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
                    int a2 = C0736a.m5565a(parcel, readInt);
                    if (a2 != 0) {
                        C0736a.m5567a(parcel, a2, 8);
                        l = Long.valueOf(parcel.readLong());
                        break;
                    }
                    l = null;
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    z2 = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    z = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    list = C0736a.m5587r(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new TokenData(i, str, l, z2, z, list);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
