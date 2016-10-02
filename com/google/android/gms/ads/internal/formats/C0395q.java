package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.ads.internal.formats.q */
public final class C0395q implements Creator {
    public static NativeAdOptionsParcel m2594a(Parcel parcel) {
        boolean z = false;
        int a = C0736a.m5564a(parcel);
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    z2 = C0736a.m5572c(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    z = C0736a.m5572c(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new NativeAdOptionsParcel(i2, z2, i, z);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    static void m2595a(NativeAdOptionsParcel nativeAdOptionsParcel, Parcel parcel) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, nativeAdOptionsParcel.f2047a);
        C0738c.m5600a(parcel, 2, nativeAdOptionsParcel.f2048b);
        C0738c.m5606b(parcel, 3, nativeAdOptionsParcel.f2049c);
        C0738c.m5600a(parcel, 4, nativeAdOptionsParcel.f2050d);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0395q.m2594a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NativeAdOptionsParcel[i];
    }
}
