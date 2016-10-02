package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GeneratePasswordRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2704a;
    private final PasswordSpecification f2705b;

    static {
        CREATOR = new C0548d();
    }

    GeneratePasswordRequest(int i, PasswordSpecification passwordSpecification) {
        this.f2704a = i;
        this.f2705b = passwordSpecification;
    }

    public final PasswordSpecification m3182a() {
        return this.f2705b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0548d.m3188a(this, parcel, i);
    }
}
