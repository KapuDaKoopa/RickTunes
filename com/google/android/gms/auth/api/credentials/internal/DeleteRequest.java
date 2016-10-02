package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class DeleteRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2702a;
    private final Credential f2703b;

    static {
        CREATOR = new C0547c();
    }

    DeleteRequest(int i, Credential credential) {
        this.f2702a = i;
        this.f2703b = credential;
    }

    public final Credential m3181a() {
        return this.f2703b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0547c.m3187a(this, parcel, i);
    }
}
