package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ProxyResponse implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2735a;
    public final int f2736b;
    public final PendingIntent f2737c;
    public final int f2738d;
    final Bundle f2739e;
    public final byte[] f2740f;

    static {
        CREATOR = new C0566d();
    }

    ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f2735a = i;
        this.f2736b = i2;
        this.f2738d = i3;
        this.f2739e = bundle;
        this.f2740f = bArr;
        this.f2737c = pendingIntent;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0566d.m3216a(this, parcel, i);
    }
}
