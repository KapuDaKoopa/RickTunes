package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RecordConsentRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f5026a;
    private final Account f5027b;
    private final Scope[] f5028c;
    private final String f5029d;

    static {
        CREATOR = new C0792j();
    }

    RecordConsentRequest(int i, Account account, Scope[] scopeArr, String str) {
        this.f5026a = i;
        this.f5027b = account;
        this.f5028c = scopeArr;
        this.f5029d = str;
    }

    public final Account m5752a() {
        return this.f5027b;
    }

    public final Scope[] m5753b() {
        return this.f5028c;
    }

    public final String m5754c() {
        return this.f5029d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0792j.m5786a(this, parcel, i);
    }
}
