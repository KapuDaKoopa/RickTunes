package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.C0653q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AuthAccountResult implements C0653q, SafeParcelable {
    public static final Creator CREATOR;
    final int f5020a;
    private int f5021b;
    private Intent f5022c;

    static {
        CREATOR = new C0786a();
    }

    public AuthAccountResult() {
        this((byte) 0);
    }

    private AuthAccountResult(byte b) {
        this(2, 0, null);
    }

    AuthAccountResult(int i, int i2, Intent intent) {
        this.f5020a = i;
        this.f5021b = i2;
        this.f5022c = intent;
    }

    public final Status m5749a() {
        return this.f5021b == 0 ? Status.f4514a : Status.f4518e;
    }

    public final int m5750b() {
        return this.f5021b;
    }

    public final Intent m5751c() {
        return this.f5022c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0786a.m5758a(this, parcel, i);
    }
}
