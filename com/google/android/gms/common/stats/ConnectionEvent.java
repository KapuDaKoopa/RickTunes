package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ConnectionEvent extends C0763g implements SafeParcelable {
    public static final Creator CREATOR;
    final int f4933a;
    private final long f4934b;
    private int f4935c;
    private final String f4936d;
    private final String f4937e;
    private final String f4938f;
    private final String f4939g;
    private final String f4940h;
    private final String f4941i;
    private final long f4942j;
    private final long f4943k;
    private long f4944l;

    static {
        CREATOR = new C0764a();
    }

    ConnectionEvent(int i, long j, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this.f4933a = i;
        this.f4934b = j;
        this.f4935c = i2;
        this.f4936d = str;
        this.f4937e = str2;
        this.f4938f = str3;
        this.f4939g = str4;
        this.f4944l = -1;
        this.f4940h = str5;
        this.f4941i = str6;
        this.f4942j = j2;
        this.f4943k = j3;
    }

    public ConnectionEvent(long j, int i, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this(1, j, i, str, str2, str3, str4, str5, str6, j2, j3);
    }

    public final long m5707a() {
        return this.f4934b;
    }

    public final int m5708b() {
        return this.f4935c;
    }

    public final String m5709c() {
        return this.f4936d;
    }

    public final String m5710d() {
        return this.f4937e;
    }

    public final int describeContents() {
        return 0;
    }

    public final String m5711e() {
        return this.f4938f;
    }

    public final String m5712f() {
        return this.f4939g;
    }

    public final String m5713g() {
        return this.f4940h;
    }

    public final String m5714h() {
        return this.f4941i;
    }

    public final long m5715i() {
        return this.f4944l;
    }

    public final long m5716j() {
        return this.f4943k;
    }

    public final long m5717k() {
        return this.f4942j;
    }

    public final String m5718l() {
        return "\t" + this.f4936d + "/" + this.f4937e + "\t" + this.f4938f + "/" + this.f4939g + "\t" + (this.f4940h == null ? "" : this.f4940h) + "\t" + this.f4943k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0764a.m5733a(this, parcel);
    }
}
