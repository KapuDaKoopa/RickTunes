package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ProxyRequest implements SafeParcelable {
    public static final Creator CREATOR;
    public static final int f2720a;
    public static final int f2721b;
    public static final int f2722c;
    public static final int f2723d;
    public static final int f2724e;
    public static final int f2725f;
    public static final int f2726g;
    public static final int f2727h;
    public static final int f2728i;
    final int f2729j;
    public final String f2730k;
    public final int f2731l;
    public final long f2732m;
    public final byte[] f2733n;
    Bundle f2734o;

    static {
        CREATOR = new C0565c();
        f2720a = 0;
        f2721b = 1;
        f2722c = 2;
        f2723d = 3;
        f2724e = 4;
        f2725f = 5;
        f2726g = 6;
        f2727h = 7;
        f2728i = 7;
    }

    ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f2729j = i;
        this.f2730k = str;
        this.f2731l = i2;
        this.f2732m = j;
        this.f2733n = bArr;
        this.f2734o = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ProxyRequest[ url: " + this.f2730k + ", method: " + this.f2731l + " ]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0565c.m3215a(this, parcel);
    }
}
