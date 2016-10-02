package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class SaveRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2706a;
    private final Credential f2707b;

    static {
        CREATOR = new C0555k();
    }

    SaveRequest(int i, Credential credential) {
        this.f2706a = i;
        this.f2707b = credential;
    }

    public final Credential m3183a() {
        return this.f2707b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0555k.m3207a(this, parcel, i);
    }
}
