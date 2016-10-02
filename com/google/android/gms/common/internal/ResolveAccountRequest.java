package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ResolveAccountRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f4794a;
    private final Account f4795b;
    private final int f4796c;
    private final GoogleSignInAccount f4797d;

    static {
        CREATOR = new ay();
    }

    ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f4794a = i;
        this.f4795b = account;
        this.f4796c = i2;
        this.f4797d = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final Account m5393a() {
        return this.f4795b;
    }

    public final int m5394b() {
        return this.f4796c;
    }

    public final GoogleSignInAccount m5395c() {
        return this.f4797d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ay.m5538a(this, parcel, i);
    }
}
