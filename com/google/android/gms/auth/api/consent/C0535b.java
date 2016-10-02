package com.google.android.gms.auth.api.consent;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.auth.api.consent.b */
public final class C0535b implements Creator {
    static void m3145a(GetConsentIntentRequest getConsentIntentRequest, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, getConsentIntentRequest.m3137a());
        C0738c.m5598a(parcel, 2, getConsentIntentRequest.m3138b());
        C0738c.m5606b(parcel, 3, getConsentIntentRequest.m3139c());
        C0738c.m5598a(parcel, 4, getConsentIntentRequest.m3140d());
        C0738c.m5596a(parcel, 5, getConsentIntentRequest.m3141e(), i);
        C0738c.m5602a(parcel, 6, getConsentIntentRequest.f2649a, i);
        C0738c.m5600a(parcel, 7, getConsentIntentRequest.m3142f());
        C0738c.m5606b(parcel, 8, getConsentIntentRequest.m3143g());
        C0738c.m5598a(parcel, 9, getConsentIntentRequest.m3144h());
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int a = C0736a.m5564a(parcel);
        boolean z = false;
        ScopeDetail[] scopeDetailArr = null;
        Account account = null;
        String str2 = null;
        int i2 = 0;
        String str3 = null;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i3 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    str3 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    str2 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    account = (Account) C0736a.m5566a(parcel, readInt, Account.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    scopeDetailArr = (ScopeDetail[]) C0736a.m5570b(parcel, readInt, ScopeDetail.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    z = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoTextColor /*9*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GetConsentIntentRequest(i3, str3, i2, str2, account, scopeDetailArr, z, i, str);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetConsentIntentRequest[i];
    }
}
