package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class IdToken implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2681a;
    private final String f2682b;
    private final String f2683c;

    static {
        CREATOR = new C0544i();
    }

    IdToken(int i, String str, String str2) {
        this.f2681a = i;
        this.f2682b = str;
        this.f2683c = str2;
    }

    public final String m3165a() {
        return this.f2682b;
    }

    public final String m3166b() {
        return this.f2683c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0544i.m3180a(this, parcel);
    }
}
