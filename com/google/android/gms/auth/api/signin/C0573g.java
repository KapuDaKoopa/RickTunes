package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.g */
public final class C0573g implements Creator {
    static void m3269a(GoogleSignInOptions googleSignInOptions, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, googleSignInOptions.f2762e);
        C0738c.m5607b(parcel, 2, googleSignInOptions.m3243a());
        C0738c.m5596a(parcel, 3, googleSignInOptions.m3244b(), i);
        C0738c.m5600a(parcel, 4, googleSignInOptions.m3245c());
        C0738c.m5600a(parcel, 5, googleSignInOptions.m3246d());
        C0738c.m5600a(parcel, 6, googleSignInOptions.m3247e());
        C0738c.m5598a(parcel, 7, googleSignInOptions.m3248f());
        C0738c.m5598a(parcel, 8, googleSignInOptions.m3249g());
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int a = C0736a.m5564a(parcel);
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        Account account = null;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    arrayList = C0736a.m5571c(parcel, readInt, Scope.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    account = (Account) C0736a.m5566a(parcel, readInt, Account.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    z3 = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    z2 = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    z = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    str2 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GoogleSignInOptions(i, arrayList, account, z3, z2, z, str2, str);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
