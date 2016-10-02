package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Scope implements SafeParcelable {
    public static final Creator CREATOR;
    final int f4512a;
    private final String f4513b;

    static {
        CREATOR = new C0695w();
    }

    Scope(int i, String str) {
        ax.m5530a(str, (Object) "scopeUri must not be null or empty");
        this.f4512a = i;
        this.f4513b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final String m5065a() {
        return this.f4513b;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof Scope) ? false : this.f4513b.equals(((Scope) obj).f4513b);
    }

    public final int hashCode() {
        return this.f4513b.hashCode();
    }

    public final String toString() {
        return this.f4513b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0695w.m5315a(this, parcel);
    }
}
