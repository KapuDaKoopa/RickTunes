package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FavaDiagnosticsEntity implements SafeParcelable {
    public static final C0753a CREATOR;
    final int f4893a;
    public final String f4894b;
    public final int f4895c;

    static {
        CREATOR = new C0753a();
    }

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f4893a = i;
        this.f4894b = str;
        this.f4895c = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0753a.m5644a(this, parcel);
    }
}
