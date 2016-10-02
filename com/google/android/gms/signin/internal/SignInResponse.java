package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SignInResponse implements SafeParcelable {
    public static final Creator CREATOR;
    final int f5032a;
    private final ConnectionResult f5033b;
    private final ResolveAccountResponse f5034c;

    static {
        CREATOR = new C0796n();
    }

    public SignInResponse() {
        this(new ConnectionResult(8, null));
    }

    SignInResponse(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f5032a = i;
        this.f5033b = connectionResult;
        this.f5034c = resolveAccountResponse;
    }

    private SignInResponse(ConnectionResult connectionResult) {
        this(1, connectionResult, null);
    }

    public final ConnectionResult m5756a() {
        return this.f5033b;
    }

    public final ResolveAccountResponse m5757b() {
        return this.f5034c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0796n.m5796a(this, parcel, i);
    }
}
