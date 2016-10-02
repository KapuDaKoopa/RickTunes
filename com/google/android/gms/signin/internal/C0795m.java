package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.C0736a;
import com.google.android.gms.common.internal.safeparcel.C0737b;
import com.google.android.gms.common.internal.safeparcel.C0738c;

/* renamed from: com.google.android.gms.signin.internal.m */
public final class C0795m implements Creator {
    static void m5795a(SignInRequest signInRequest, Parcel parcel, int i) {
        int a = C0738c.m5590a(parcel, 20293);
        C0738c.m5606b(parcel, 1, signInRequest.f5030a);
        C0738c.m5596a(parcel, 2, signInRequest.m5755a(), i);
        C0738c.m5605b(parcel, a);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C0736a.m5564a(parcel);
        int i = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (Menu.USER_MASK & readInt) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    i = C0736a.m5573d(parcel, readInt);
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    resolveAccountRequest = (ResolveAccountRequest) C0736a.m5566a(parcel, readInt, ResolveAccountRequest.CREATOR);
                    break;
                default:
                    C0736a.m5568b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new SignInRequest(i, resolveAccountRequest);
        }
        throw new C0737b("Overread allowed size end=" + a, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInRequest[i];
    }
}
