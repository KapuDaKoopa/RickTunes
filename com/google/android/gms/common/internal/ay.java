package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

public final class ay implements Creator {
    static void m5538a(ResolveAccountRequest resolveAccountRequest, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, resolveAccountRequest.f4794a);
        C0738c.m5596a(parcel, 2, resolveAccountRequest.m5393a(), i);
        C0738c.m5606b(parcel, 3, resolveAccountRequest.m5394b());
        C0738c.m5596a(parcel, 4, resolveAccountRequest.m5395c(), i);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0736a.m5564a(parcel);
        int i = 0;
        Account account = null;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    account = (Account) C0736a.m5566a(parcel, readInt, Account.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    googleSignInAccount = (GoogleSignInAccount) C0736a.m5566a(parcel, readInt, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ResolveAccountRequest(i2, account, i, googleSignInAccount);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }
}
