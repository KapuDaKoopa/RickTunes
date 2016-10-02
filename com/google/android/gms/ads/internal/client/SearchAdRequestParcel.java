package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.search.C0524a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;

@op
public final class SearchAdRequestParcel implements SafeParcelable {
    public static final C0363n CREATOR;
    public final int f1913a;
    public final int f1914b;
    public final int f1915c;
    public final int f1916d;
    public final int f1917e;
    public final int f1918f;
    public final int f1919g;
    public final int f1920h;
    public final int f1921i;
    public final String f1922j;
    public final int f1923k;
    public final String f1924l;
    public final int f1925m;
    public final int f1926n;
    public final String f1927o;

    static {
        CREATOR = new C0363n();
    }

    SearchAdRequestParcel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, int i10, String str2, int i11, int i12, String str3) {
        this.f1913a = i;
        this.f1914b = i2;
        this.f1915c = i3;
        this.f1916d = i4;
        this.f1917e = i5;
        this.f1918f = i6;
        this.f1919g = i7;
        this.f1920h = i8;
        this.f1921i = i9;
        this.f1922j = str;
        this.f1923k = i10;
        this.f1924l = str2;
        this.f1925m = i11;
        this.f1926n = i12;
        this.f1927o = str3;
    }

    public SearchAdRequestParcel(C0524a c0524a) {
        this.f1913a = 1;
        this.f1914b = c0524a.m3106a();
        this.f1915c = c0524a.m3107b();
        this.f1916d = c0524a.m3108c();
        this.f1917e = c0524a.m3109d();
        this.f1918f = c0524a.m3110e();
        this.f1919g = c0524a.m3111f();
        this.f1920h = c0524a.m3112g();
        this.f1921i = c0524a.m3113h();
        this.f1922j = c0524a.m3114i();
        this.f1923k = c0524a.m3115j();
        this.f1924l = c0524a.m3116k();
        this.f1925m = c0524a.m3117l();
        this.f1926n = c0524a.m3118m();
        this.f1927o = c0524a.m3119n();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0363n.m2430a(this, parcel);
    }
}
