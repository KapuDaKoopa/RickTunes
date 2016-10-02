package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CredentialPickerConfig implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2667a;
    private final boolean f2668b;
    private final boolean f2669c;
    private final boolean f2670d;

    static {
        CREATOR = new C0541f();
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3) {
        this.f2667a = i;
        this.f2668b = z;
        this.f2669c = z2;
        this.f2670d = z3;
    }

    private CredentialPickerConfig(C0536a c0536a) {
        this(1, c0536a.f2694a, c0536a.f2695b, c0536a.f2696c);
    }

    public final boolean m3154a() {
        return this.f2668b;
    }

    public final boolean m3155b() {
        return this.f2669c;
    }

    public final boolean m3156c() {
        return this.f2670d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0541f.m3177a(this, parcel);
    }
}
