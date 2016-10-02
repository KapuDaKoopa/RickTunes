package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.credentials.j */
public final class C0556j implements Creator {
    static void m3208a(PasswordSpecification passwordSpecification, Parcel parcel) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5598a(parcel, 1, passwordSpecification.f2687d);
        C0738c.m5606b(parcel, 1000, passwordSpecification.f2686c);
        C0738c.m5599a(parcel, 2, passwordSpecification.f2688e);
        List list = passwordSpecification.f2689f;
        if (list != null) {
            int a2 = C0738c.m5590a(parcel, 3);
            int size = list.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                parcel.writeInt(((Integer) list.get(i)).intValue());
            }
            C0738c.m5605b(parcel, a2);
        }
        C0738c.m5606b(parcel, 4, passwordSpecification.f2690g);
        C0738c.m5606b(parcel, 5, passwordSpecification.f2691h);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0736a.m5564a(parcel);
        int i = 0;
        int i2 = 0;
        List list = null;
        List list2 = null;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    list2 = C0736a.m5587r(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    int a2 = C0736a.m5565a(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (a2 != 0) {
                        list = new ArrayList();
                        int readInt2 = parcel.readInt();
                        for (readInt = 0; readInt < readInt2; readInt++) {
                            list.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(dataPosition + a2);
                        break;
                    }
                    list = null;
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case 1000:
                    i3 = C0736a.m5573d(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new PasswordSpecification(i3, str, list2, list, i2, i);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PasswordSpecification[i];
    }
}
