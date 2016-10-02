package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SignInButtonConfig implements SafeParcelable {
    public static final Creator CREATOR;
    final int f4803a;
    private final int f4804b;
    private final int f4805c;
    private final Scope[] f4806d;

    static {
        CREATOR = new C0720c();
    }

    SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.f4803a = i;
        this.f4804b = i2;
        this.f4805c = i3;
        this.f4806d = scopeArr;
    }

    public SignInButtonConfig(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, scopeArr);
    }

    public final int m5400a() {
        return this.f4804b;
    }

    public final int m5401b() {
        return this.f4805c;
    }

    public final Scope[] m5402c() {
        return this.f4806d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0720c.m5542a(this, parcel, i);
    }
}
