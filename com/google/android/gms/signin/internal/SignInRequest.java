package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SignInRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f5030a;
    final ResolveAccountRequest f5031b;

    static {
        CREATOR = new C0795m();
    }

    SignInRequest(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f5030a = i;
        this.f5031b = resolveAccountRequest;
    }

    public SignInRequest(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    public final ResolveAccountRequest m5755a() {
        return this.f5031b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0795m.m5795a(this, parcel, i);
    }
}
