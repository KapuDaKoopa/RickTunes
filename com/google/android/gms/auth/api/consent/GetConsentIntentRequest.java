package com.google.android.gms.auth.api.consent;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetConsentIntentRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final ScopeDetail[] f2649a;
    private final int f2650b;
    private final String f2651c;
    private final int f2652d;
    private final String f2653e;
    private final Account f2654f;
    private final boolean f2655g;
    private final int f2656h;
    private final String f2657i;

    static {
        CREATOR = new C0535b();
    }

    GetConsentIntentRequest(int i, String str, int i2, String str2, Account account, ScopeDetail[] scopeDetailArr, boolean z, int i3, String str3) {
        this.f2650b = i;
        this.f2651c = str;
        this.f2652d = i2;
        this.f2653e = str2;
        this.f2654f = (Account) ax.m5527a((Object) account);
        this.f2649a = scopeDetailArr;
        this.f2655g = z;
        this.f2656h = i3;
        this.f2657i = str3;
    }

    public final int m3137a() {
        return this.f2650b;
    }

    public final String m3138b() {
        return this.f2651c;
    }

    public final int m3139c() {
        return this.f2652d;
    }

    public final String m3140d() {
        return this.f2653e;
    }

    public int describeContents() {
        return 0;
    }

    public final Account m3141e() {
        return this.f2654f;
    }

    public final boolean m3142f() {
        return this.f2655g;
    }

    public final int m3143g() {
        return this.f2656h;
    }

    public final String m3144h() {
        return this.f2657i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0535b.m3145a(this, parcel, i);
    }
}
