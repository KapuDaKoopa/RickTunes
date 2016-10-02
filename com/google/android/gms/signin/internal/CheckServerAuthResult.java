package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CheckServerAuthResult implements SafeParcelable {
    public static final Creator CREATOR;
    final int f5023a;
    final boolean f5024b;
    final List f5025c;

    static {
        CREATOR = new C0787c();
    }

    CheckServerAuthResult(int i, boolean z, List list) {
        this.f5023a = i;
        this.f5024b = z;
        this.f5025c = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0787c.m5759a(this, parcel);
    }
}
