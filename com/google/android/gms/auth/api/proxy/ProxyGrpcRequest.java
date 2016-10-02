package com.google.android.gms.auth.api.proxy;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ProxyGrpcRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2714a;
    public final String f2715b;
    public final int f2716c;
    public final long f2717d;
    public final byte[] f2718e;
    public final String f2719f;

    static {
        CREATOR = new C0564b();
    }

    ProxyGrpcRequest(int i, String str, int i2, long j, byte[] bArr, String str2) {
        this.f2714a = i;
        this.f2715b = str;
        this.f2716c = i2;
        this.f2717d = j;
        this.f2718e = bArr;
        this.f2719f = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0564b.m3214a(this, parcel);
    }
}
