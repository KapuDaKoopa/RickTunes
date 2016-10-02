package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

/* renamed from: com.google.android.gms.clearcut.h */
public final class C0651h implements Creator {
    public static LogEventParcelable m5052a(Parcel parcel) {
        int a = C0736a.m5564a(parcel);
        byte[] bArr = null;
        PlayLoggerContext playLoggerContext = null;
        int i = 0;
        int[] iArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    playLoggerContext = (PlayLoggerContext) C0736a.m5566a(parcel, readInt, PlayLoggerContext.CREATOR);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    bArr = C0736a.m5583n(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    iArr = C0736a.m5584o(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new LogEventParcelable(i, playLoggerContext, bArr, iArr);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    static void m5053a(LogEventParcelable logEventParcelable, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, logEventParcelable.f4461a);
        C0738c.m5596a(parcel, 2, logEventParcelable.f4462b, i);
        C0738c.m5601a(parcel, 3, logEventParcelable.f4463c);
        int[] iArr = logEventParcelable.f4464d;
        if (iArr != null) {
            int a2 = C0738c.m5590a(parcel, 4);
            parcel.writeIntArray(iArr);
            C0738c.m5605b(parcel, a2);
        }
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0651h.m5052a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
