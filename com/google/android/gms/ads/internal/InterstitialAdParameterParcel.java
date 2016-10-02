package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;

@op
public final class InterstitialAdParameterParcel implements SafeParcelable {
    public static final aa CREATOR;
    public final int f1768a;
    public final boolean f1769b;
    public final boolean f1770c;
    public final String f1771d;
    public final boolean f1772e;
    public final float f1773f;

    static {
        CREATOR = new aa();
    }

    InterstitialAdParameterParcel(int i, boolean z, boolean z2, String str, boolean z3, float f) {
        this.f1768a = i;
        this.f1769b = z;
        this.f1770c = z2;
        this.f1771d = str;
        this.f1772e = z3;
        this.f1773f = f;
    }

    public InterstitialAdParameterParcel(boolean z, boolean z2, String str, boolean z3, float f) {
        this(2, z, z2, str, z3, f);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aa.m2090a(this, parcel);
    }
}
