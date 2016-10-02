package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FACLData implements SafeParcelable {
    public static final C0613b CREATOR;
    final int f2864a;
    FACLConfig f2865b;
    String f2866c;
    boolean f2867d;
    String f2868e;

    static {
        CREATOR = new C0613b();
    }

    FACLData(int i, FACLConfig fACLConfig, String str, boolean z, String str2) {
        this.f2864a = i;
        this.f2865b = fACLConfig;
        this.f2866c = str;
        this.f2867d = z;
        this.f2868e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0613b.m3410a(this, parcel, i);
    }
}
