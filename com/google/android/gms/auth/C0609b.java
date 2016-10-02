package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.auth.b */
public final class C0609b implements Creator {
    static void m3406a(AccountChangeEventsRequest accountChangeEventsRequest, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, accountChangeEventsRequest.f2613a);
        C0738c.m5606b(parcel, 2, accountChangeEventsRequest.f2614b);
        C0738c.m5598a(parcel, 3, accountChangeEventsRequest.f2615c);
        C0738c.m5596a(parcel, 4, accountChangeEventsRequest.f2616d, i);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Account account = null;
        int a = C0736a.m5564a(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    account = (Account) C0736a.m5566a(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new AccountChangeEventsRequest(i2, i, str, account);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEventsRequest[i];
    }
}
