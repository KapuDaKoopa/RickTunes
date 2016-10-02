package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.common.stats.a */
public final class C0764a implements Creator {
    static void m5733a(ConnectionEvent connectionEvent, Parcel parcel) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, connectionEvent.f4933a);
        C0738c.m5593a(parcel, 2, connectionEvent.m5707a());
        C0738c.m5598a(parcel, 4, connectionEvent.m5709c());
        C0738c.m5598a(parcel, 5, connectionEvent.m5710d());
        C0738c.m5598a(parcel, 6, connectionEvent.m5711e());
        C0738c.m5598a(parcel, 7, connectionEvent.m5712f());
        C0738c.m5598a(parcel, 8, connectionEvent.m5713g());
        C0738c.m5593a(parcel, 10, connectionEvent.m5717k());
        C0738c.m5593a(parcel, 11, connectionEvent.m5716j());
        C0738c.m5606b(parcel, 12, connectionEvent.m5708b());
        C0738c.m5598a(parcel, 13, connectionEvent.m5714h());
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0736a.m5564a(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    j = C0736a.m5575f(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    str2 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsBackground /*6*/:
                    str3 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance /*7*/:
                    str4 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsButtonBackground /*8*/:
                    str5 = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                    j2 = C0736a.m5575f(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiZoomControls /*11*/:
                    j3 = C0736a.m5575f(parcel, readInt);
                    break;
                case C0772e.MapAttrs_uiZoomGestures /*12*/:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.MapAttrs_useViewLifecycle /*13*/:
                    str6 = C0736a.m5580k(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ConnectionEvent(i, j, i2, str, str2, str3, str4, str5, str6, j2, j3);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionEvent[i];
    }
}
