package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.common.server.response.f */
public final class C0762f implements Creator {
    static void m5702a(SafeParcelResponse safeParcelResponse, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, safeParcelResponse.m5695d());
        Parcel e = safeParcelResponse.m5696e();
        if (e != null) {
            int a2 = C0738c.m5590a(parcel, 2);
            parcel.appendFrom(e, 0, e.dataSize());
            C0738c.m5605b(parcel, a2);
        }
        C0738c.m5596a(parcel, 3, safeParcelResponse.m5697f(), i);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        FieldMappingDictionary fieldMappingDictionary = null;
        int a = C0736a.m5564a(parcel);
        int i = 0;
        Parcel parcel2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    parcel2 = C0736a.m5588s(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    fieldMappingDictionary = (FieldMappingDictionary) C0736a.m5566a(parcel, readInt, FieldMappingDictionary.CREATOR);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new SafeParcelResponse(i, parcel2, fieldMappingDictionary);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
