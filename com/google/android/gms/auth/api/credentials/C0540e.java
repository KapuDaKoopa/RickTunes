package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.credentials.e */
public final class C0540e implements Creator {
    static void m3176a(Credential credential, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5598a(parcel, 1, credential.m3146a());
        C0738c.m5606b(parcel, 1000, credential.f2658a);
        C0738c.m5598a(parcel, 2, credential.m3147b());
        C0738c.m5596a(parcel, 3, credential.m3148c(), i);
        C0738c.m5607b(parcel, 4, credential.m3149d());
        C0738c.m5598a(parcel, 5, credential.m3150e());
        C0738c.m5598a(parcel, 6, credential.m3152g());
        C0738c.m5598a(parcel, 7, credential.m3151f());
        C0738c.m5598a(parcel, 8, credential.m3153h());
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = C0736a.m5564a(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    str6 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    str5 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    uri = (Uri) C0736a.m5566a(parcel, readInt, Uri.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    list = C0736a.m5571c(parcel, readInt, IdToken.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    str4 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    str3 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    str2 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case 1000:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new Credential(i, str6, str5, uri, list, str4, str3, str2, str);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }
}
