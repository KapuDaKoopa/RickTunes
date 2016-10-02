package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.common.internal.m */
public final class C0730m implements Creator {
    static void m5552a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, getServiceRequest.f4786a);
        C0738c.m5606b(parcel, 2, getServiceRequest.f4787b);
        C0738c.m5606b(parcel, 3, getServiceRequest.f4788c);
        C0738c.m5598a(parcel, 4, getServiceRequest.f4789d);
        C0738c.m5595a(parcel, 5, getServiceRequest.f4790e);
        C0738c.m5602a(parcel, 6, getServiceRequest.f4791f, i);
        C0738c.m5594a(parcel, 7, getServiceRequest.f4792g);
        C0738c.m5596a(parcel, 8, getServiceRequest.f4793h, i);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        Account account = null;
        int a = C0736a.m5564a(parcel);
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i3 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    iBinder = C0736a.m5581l(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    scopeArr = (Scope[]) C0736a.m5570b(parcel, readInt, Scope.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    bundle = C0736a.m5582m(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    account = (Account) C0736a.m5566a(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GetServiceRequest(i3, i2, i, str, iBinder, scopeArr, bundle, account);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
