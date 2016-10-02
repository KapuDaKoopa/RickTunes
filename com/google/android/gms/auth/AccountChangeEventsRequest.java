package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AccountChangeEventsRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2613a;
    int f2614b;
    @Deprecated
    String f2615c;
    Account f2616d;

    static {
        CREATOR = new C0609b();
    }

    public AccountChangeEventsRequest() {
        this.f2613a = 1;
    }

    AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f2613a = i;
        this.f2614b = i2;
        this.f2615c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f2616d = account;
        } else {
            this.f2616d = new Account(str, "com.google");
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0609b.m3406a(this, parcel, i);
    }
}
