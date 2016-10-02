package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;

@op
public class StringParcel implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2390a;
    String f2391b;

    static {
        CREATOR = new am();
    }

    StringParcel(int i, String str) {
        this.f2390a = i;
        this.f2391b = str;
    }

    public StringParcel(String str) {
        this.f2390a = 1;
        this.f2391b = str;
    }

    public final String m2809a() {
        return this.f2391b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        am.m2832a(this, parcel);
    }
}
