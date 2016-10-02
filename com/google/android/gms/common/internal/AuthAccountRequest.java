package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AuthAccountRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f4776a;
    final IBinder f4777b;
    final Scope[] f4778c;
    Integer f4779d;
    Integer f4780e;

    static {
        CREATOR = new C0725h();
    }

    AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2) {
        this.f4776a = i;
        this.f4777b = iBinder;
        this.f4778c = scopeArr;
        this.f4779d = num;
        this.f4780e = num2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0725h.m5551a(this, parcel, i);
    }
}
