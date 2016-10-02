package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;

@op
public class CapabilityParcel implements SafeParcelable {
    public static final Creator CREATOR;
    public final int f2382a;
    public final boolean f2383b;
    public final boolean f2384c;
    public final boolean f2385d;

    static {
        CREATOR = new C0474v();
    }

    CapabilityParcel(int i, boolean z, boolean z2, boolean z3) {
        this.f2382a = i;
        this.f2383b = z;
        this.f2384c = z2;
        this.f2385d = z3;
    }

    public CapabilityParcel(boolean z, boolean z2) {
        this(2, z, z2, false);
    }

    public final Bundle m2806a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("iap_supported", this.f2383b);
        bundle.putBoolean("default_iap_supported", this.f2384c);
        bundle.putBoolean("app_streaming_supported", this.f2385d);
        return bundle;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0474v.m2913a(this, parcel);
    }
}
