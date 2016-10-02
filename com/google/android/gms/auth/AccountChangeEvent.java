package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class AccountChangeEvent implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2607a;
    final long f2608b;
    final String f2609c;
    final int f2610d;
    final int f2611e;
    final String f2612f;

    static {
        CREATOR = new C0529a();
    }

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f2607a = i;
        this.f2608b = j;
        this.f2609c = (String) ax.m5527a((Object) str);
        this.f2610d = i2;
        this.f2611e = i3;
        this.f2612f = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f2607a == accountChangeEvent.f2607a && this.f2608b == accountChangeEvent.f2608b && av.m5525a(this.f2609c, accountChangeEvent.f2609c) && this.f2610d == accountChangeEvent.f2610d && this.f2611e == accountChangeEvent.f2611e && av.m5525a(this.f2612f, accountChangeEvent.f2612f);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2607a), Long.valueOf(this.f2608b), this.f2609c, Integer.valueOf(this.f2610d), Integer.valueOf(this.f2611e), this.f2612f});
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.f2610d) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                str = "ADDED";
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                str = "REMOVED";
                break;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                str = "RENAMED_FROM";
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                str = "RENAMED_TO";
                break;
        }
        return "AccountChangeEvent {accountName = " + this.f2609c + ", changeType = " + str + ", changeData = " + this.f2612f + ", eventIndex = " + this.f2611e + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0529a.m3132a(this, parcel);
    }
}
