package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.auth.api.credentials.internal.d */
public final class C0548d implements Creator {
    static void m3188a(GeneratePasswordRequest generatePasswordRequest, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5596a(parcel, 1, generatePasswordRequest.m3182a(), i);
        C0738c.m5606b(parcel, 1000, generatePasswordRequest.f2704a);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0736a.m5564a(parcel);
        int i = 0;
        PasswordSpecification passwordSpecification = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    passwordSpecification = (PasswordSpecification) C0736a.m5566a(parcel, readInt, PasswordSpecification.CREATOR);
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
            return new GeneratePasswordRequest(i, passwordSpecification);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GeneratePasswordRequest[i];
    }
}
