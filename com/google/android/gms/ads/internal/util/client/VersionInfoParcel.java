package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;

@op
public final class VersionInfoParcel implements SafeParcelable {
    public static final C0502c CREATOR;
    public final int f2538a;
    public String f2539b;
    public int f2540c;
    public int f2541d;
    public boolean f2542e;

    static {
        CREATOR = new C0502c();
    }

    public VersionInfoParcel() {
        this(1, "afma-sdk-a-v8487000.8487000.0", 8487000, 8487000, true);
    }

    VersionInfoParcel(int i, String str, int i2, int i3, boolean z) {
        this.f2538a = i;
        this.f2539b = str;
        this.f2540c = i2;
        this.f2541d = i3;
        this.f2542e = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0502c.m3028a(this, parcel);
    }
}
