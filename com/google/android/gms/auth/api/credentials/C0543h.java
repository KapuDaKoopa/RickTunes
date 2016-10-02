package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.auth.api.credentials.h */
public final class C0543h implements Creator {
    static void m3179a(HintRequest hintRequest, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5596a(parcel, 1, hintRequest.m3161a(), i);
        C0738c.m5606b(parcel, 1000, hintRequest.f2676a);
        C0738c.m5600a(parcel, 2, hintRequest.m3162b());
        C0738c.m5600a(parcel, 3, hintRequest.m3163c());
        C0738c.m5603a(parcel, 4, hintRequest.m3164d());
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String[] strArr = null;
        boolean z = false;
        int a = C0736a.m5564a(parcel);
        boolean z2 = false;
        CredentialPickerConfig credentialPickerConfig = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    credentialPickerConfig = (CredentialPickerConfig) C0736a.m5566a(parcel, readInt, CredentialPickerConfig.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    z2 = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    z = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    strArr = C0736a.m5586q(parcel, readInt);
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
            return new HintRequest(i, credentialPickerConfig, z2, z, strArr);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }
}
