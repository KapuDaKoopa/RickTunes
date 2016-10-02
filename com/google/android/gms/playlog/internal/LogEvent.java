package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class LogEvent implements SafeParcelable {
    public static final C0784a CREATOR;
    public final int f5004a;
    public final long f5005b;
    public final long f5006c;
    public final String f5007d;
    public final byte[] f5008e;
    public final Bundle f5009f;

    static {
        CREATOR = new C0784a();
    }

    LogEvent(int i, long j, long j2, String str, byte[] bArr, Bundle bundle) {
        this.f5004a = i;
        this.f5005b = j;
        this.f5006c = j2;
        this.f5007d = str;
        this.f5008e = bArr;
        this.f5009f = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tag=").append(this.f5007d).append(",");
        stringBuilder.append("eventTime=").append(this.f5005b).append(",");
        stringBuilder.append("eventUptime=").append(this.f5006c).append(",");
        if (!(this.f5009f == null || this.f5009f.isEmpty())) {
            stringBuilder.append("keyValues=");
            for (String str : this.f5009f.keySet()) {
                stringBuilder.append("(").append(str).append(",");
                stringBuilder.append(this.f5009f.getString(str)).append(")");
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0784a.m5747a(this, parcel);
    }
}
