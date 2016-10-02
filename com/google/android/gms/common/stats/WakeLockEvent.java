package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class WakeLockEvent extends C0763g implements SafeParcelable {
    public static final Creator CREATOR;
    final int f4945a;
    private final long f4946b;
    private int f4947c;
    private final String f4948d;
    private final int f4949e;
    private final List f4950f;
    private final String f4951g;
    private final long f4952h;
    private int f4953i;
    private final String f4954j;
    private final String f4955k;
    private final float f4956l;
    private final long f4957m;
    private long f4958n;

    static {
        CREATOR = new C0770h();
    }

    WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3) {
        this.f4945a = i;
        this.f4946b = j;
        this.f4947c = i2;
        this.f4948d = str;
        this.f4954j = str3;
        this.f4949e = i3;
        this.f4958n = -1;
        this.f4950f = list;
        this.f4951g = str2;
        this.f4952h = j2;
        this.f4953i = i4;
        this.f4955k = str4;
        this.f4956l = f;
        this.f4957m = j3;
    }

    public final long m5719a() {
        return this.f4946b;
    }

    public final int m5720b() {
        return this.f4947c;
    }

    public final String m5721c() {
        return this.f4948d;
    }

    public final String m5722d() {
        return this.f4954j;
    }

    public final int describeContents() {
        return 0;
    }

    public final int m5723e() {
        return this.f4949e;
    }

    public final List m5724f() {
        return this.f4950f;
    }

    public final String m5725g() {
        return this.f4951g;
    }

    public final long m5726h() {
        return this.f4952h;
    }

    public final long m5727i() {
        return this.f4958n;
    }

    public final int m5728j() {
        return this.f4953i;
    }

    public final String m5729k() {
        return this.f4955k;
    }

    public final String m5730l() {
        return "\t" + this.f4948d + "\t" + this.f4949e + "\t" + (this.f4950f == null ? "" : TextUtils.join(",", this.f4950f)) + "\t" + this.f4953i + "\t" + (this.f4954j == null ? "" : this.f4954j) + "\t" + (this.f4955k == null ? "" : this.f4955k) + "\t" + this.f4956l;
    }

    public final float m5731m() {
        return this.f4956l;
    }

    public final long m5732n() {
        return this.f4957m;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0770h.m5745a(this, parcel);
    }
}
