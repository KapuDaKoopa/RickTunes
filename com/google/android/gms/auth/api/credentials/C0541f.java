package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.auth.api.credentials.f */
public final class C0541f implements Creator {
    static void m3177a(CredentialPickerConfig credentialPickerConfig, Parcel parcel) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5600a(parcel, 1, credentialPickerConfig.m3154a());
        C0738c.m5606b(parcel, 1000, credentialPickerConfig.f2667a);
        C0738c.m5600a(parcel, 2, credentialPickerConfig.m3155b());
        C0738c.m5600a(parcel, 3, credentialPickerConfig.m3156c());
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = C0736a.m5564a(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    z3 = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    z2 = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    z = C0736a.m5572c(parcel, readInt);
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
            return new CredentialPickerConfig(i, z3, z2, z);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
