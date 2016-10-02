package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.auth.api.proxy.b */
public final class C0564b implements Creator {
    static void m3214a(ProxyGrpcRequest proxyGrpcRequest, Parcel parcel) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5598a(parcel, 1, proxyGrpcRequest.f2715b);
        C0738c.m5606b(parcel, 1000, proxyGrpcRequest.f2714a);
        C0738c.m5606b(parcel, 2, proxyGrpcRequest.f2716c);
        C0738c.m5593a(parcel, 3, proxyGrpcRequest.f2717d);
        C0738c.m5601a(parcel, 4, proxyGrpcRequest.f2718e);
        C0738c.m5598a(parcel, 5, proxyGrpcRequest.f2719f);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int a = C0736a.m5564a(parcel);
        long j = 0;
        byte[] bArr = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    str2 = C0736a.m5580k(parcel, readInt);
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
                    str = C0736a.m5580k(parcel, readInt);
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
            return new ProxyGrpcRequest(i2, str2, i, j, bArr, str);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyGrpcRequest[i];
    }
}
