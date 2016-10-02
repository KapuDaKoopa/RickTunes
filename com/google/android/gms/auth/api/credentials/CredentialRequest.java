package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CredentialRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2671a;
    private final boolean f2672b;
    private final String[] f2673c;
    private final CredentialPickerConfig f2674d;
    private final CredentialPickerConfig f2675e;

    static {
        CREATOR = new C0542g();
    }

    CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2) {
        this.f2671a = i;
        this.f2672b = z;
        this.f2673c = (String[]) ax.m5527a((Object) strArr);
        if (credentialPickerConfig == null) {
            credentialPickerConfig = new C0536a().m3170a();
        }
        this.f2674d = credentialPickerConfig;
        if (credentialPickerConfig2 == null) {
            credentialPickerConfig2 = new C0536a().m3170a();
        }
        this.f2675e = credentialPickerConfig2;
    }

    public final boolean m3157a() {
        return this.f2672b;
    }

    public final String[] m3158b() {
        return this.f2673c;
    }

    public final CredentialPickerConfig m3159c() {
        return this.f2674d;
    }

    public final CredentialPickerConfig m3160d() {
        return this.f2675e;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0542g.m3178a(this, parcel, i);
    }
}
