package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class IdpTokenType implements SafeParcelable {
    public static final Creator CREATOR;
    public static final IdpTokenType f2792a;
    public static final IdpTokenType f2793b;
    final int f2794c;
    private final String f2795d;

    static {
        f2792a = new IdpTokenType("accessToken");
        f2793b = new IdpTokenType("idToken");
        CREATOR = new C0599t();
    }

    IdpTokenType(int i, String str) {
        this.f2794c = i;
        this.f2795d = ax.m5529a(str);
    }

    private IdpTokenType(String str) {
        this(1, str);
    }

    public final String m3274a() {
        return this.f2795d;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f2795d.equals(((IdpTokenType) obj).f2795d);
        } catch (ClassCastException e) {
            return false;
        }
    }

    public final int hashCode() {
        return this.f2795d.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0599t.m3402a(this, parcel);
    }
}
