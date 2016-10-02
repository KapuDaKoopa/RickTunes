package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ResolveAccountResponse implements SafeParcelable {
    public static final Creator CREATOR;
    final int f4798a;
    IBinder f4799b;
    private ConnectionResult f4800c;
    private boolean f4801d;
    private boolean f4802e;

    static {
        CREATOR = new az();
    }

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f4798a = i;
        this.f4799b = iBinder;
        this.f4800c = connectionResult;
        this.f4801d = z;
        this.f4802e = z2;
    }

    public final ae m5396a() {
        return af.m5416a(this.f4799b);
    }

    public final ConnectionResult m5397b() {
        return this.f4800c;
    }

    public final boolean m5398c() {
        return this.f4801d;
    }

    public final boolean m5399d() {
        return this.f4802e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f4800c.equals(resolveAccountResponse.f4800c) && af.m5416a(this.f4799b).equals(af.m5416a(resolveAccountResponse.f4799b));
    }

    public void writeToParcel(Parcel parcel, int i) {
        az.m5539a(this, parcel, i);
    }
}
