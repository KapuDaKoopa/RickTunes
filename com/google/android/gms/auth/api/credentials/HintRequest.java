package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class HintRequest implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2676a;
    private final CredentialPickerConfig f2677b;
    private final boolean f2678c;
    private final boolean f2679d;
    private final String[] f2680e;

    static {
        CREATOR = new C0543h();
    }

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr) {
        this.f2676a = i;
        this.f2677b = (CredentialPickerConfig) ax.m5527a((Object) credentialPickerConfig);
        this.f2678c = z;
        this.f2679d = z2;
        this.f2680e = (String[]) ax.m5527a((Object) strArr);
    }

    public final CredentialPickerConfig m3161a() {
        return this.f2677b;
    }

    public final boolean m3162b() {
        return this.f2678c;
    }

    public final boolean m3163c() {
        return this.f2679d;
    }

    public final String[] m3164d() {
        return this.f2680e;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0543h.m3179a(this, parcel, i);
    }
}
