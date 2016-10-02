package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@Deprecated
public class ValidateAccountRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f4807a;
    final IBinder f4808b;
    private final int f4809c;
    private final Scope[] f4810d;
    private final Bundle f4811e;
    private final String f4812f;

    static {
        CREATOR = new C0723f();
    }

    ValidateAccountRequest(int i, int i2, IBinder iBinder, Scope[] scopeArr, Bundle bundle, String str) {
        this.f4807a = i;
        this.f4809c = i2;
        this.f4808b = iBinder;
        this.f4810d = scopeArr;
        this.f4811e = bundle;
        this.f4812f = str;
    }

    public final int m5403a() {
        return this.f4809c;
    }

    public final Scope[] m5404b() {
        return this.f4810d;
    }

    public final String m5405c() {
        return this.f4812f;
    }

    public final Bundle m5406d() {
        return this.f4811e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0723f.m5549a(this, parcel, i);
    }
}
