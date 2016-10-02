package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.ads.formats.C0336c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;

@op
public class NativeAdOptionsParcel implements SafeParcelable {
    public static final C0395q CREATOR;
    public final int f2047a;
    public final boolean f2048b;
    public final int f2049c;
    public final boolean f2050d;

    static {
        CREATOR = new C0395q();
    }

    public NativeAdOptionsParcel(int i, boolean z, int i2, boolean z2) {
        this.f2047a = i;
        this.f2048b = z;
        this.f2049c = i2;
        this.f2050d = z2;
    }

    public NativeAdOptionsParcel(C0336c c0336c) {
        this(1, c0336c.f1760a, c0336c.f1761b, c0336c.f1762c);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0395q.m2595a(this, parcel);
    }
}
