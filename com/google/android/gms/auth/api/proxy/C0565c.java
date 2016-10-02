package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.auth.api.proxy.c */
public final class C0565c implements Creator {
    static void m3215a(ProxyRequest proxyRequest, Parcel parcel) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5598a(parcel, 1, proxyRequest.f2730k);
        C0738c.m5606b(parcel, 1000, proxyRequest.f2729j);
        C0738c.m5606b(parcel, 2, proxyRequest.f2731l);
        C0738c.m5593a(parcel, 3, proxyRequest.f2732m);
        C0738c.m5601a(parcel, 4, proxyRequest.f2733n);
        C0738c.m5594a(parcel, 5, proxyRequest.f2734o);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int a = C0736a.m5564a(parcel);
        long j = 0;
        byte[] bArr = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    str = C0736a.m5580k(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    j = C0736a.m5575f(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                    bArr = C0736a.m5583n(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance /*5*/:
                    bundle = C0736a.m5582m(parcel, readInt);
                    break;
                case 1000:
                    i2 = C0736a.m5573d(parcel, readInt);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new ProxyRequest(i2, str, i, j, bArr, bundle);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }
}
