package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class AccountChangeEventsResponse implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2617a;
    final List f2618b;

    static {
        CREATOR = new C0610c();
    }

    AccountChangeEventsResponse(int i, List list) {
        this.f2617a = i;
        this.f2618b = (List) ax.m5527a((Object) list);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0610c.m3407a(this, parcel);
    }
}
