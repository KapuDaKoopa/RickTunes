package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.common.internal.c */
public final class C0720c implements Creator {
    static void m5542a(SignInButtonConfig signInButtonConfig, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, signInButtonConfig.f4803a);
        C0738c.m5606b(parcel, 2, signInButtonConfig.m5400a());
        C0738c.m5606b(parcel, 3, signInButtonConfig.m5401b());
        C0738c.m5602a(parcel, 4, signInButtonConfig.m5402c(), i);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = C0736a.m5564a(parcel);
        Scope[] scopeArr = null;
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
                    scopeArr = (Scope[]) C0736a.m5570b(parcel, readInt, Scope.CREATOR);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new SignInButtonConfig(i3, i2, i, scopeArr);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInButtonConfig[i];
    }
}
