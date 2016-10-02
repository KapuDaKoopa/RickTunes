package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public final class Status implements C0653q, SafeParcelable {
    public static final Creator CREATOR;
    public static final Status f4514a;
    public static final Status f4515b;
    public static final Status f4516c;
    public static final Status f4517d;
    public static final Status f4518e;
    private final int f4519f;
    private final int f4520g;
    private final String f4521h;
    private final PendingIntent f4522i;

    static {
        f4514a = new Status(0);
        f4515b = new Status(14);
        f4516c = new Status(8);
        f4517d = new Status(15);
        f4518e = new Status(16);
        CREATOR = new C0696x();
    }

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f4519f = i;
        this.f4520g = i2;
        this.f4521h = str;
        this.f4522i = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public final Status m5067a() {
        return this;
    }

    final PendingIntent m5068b() {
        return this.f4522i;
    }

    public final String m5069c() {
        return this.f4521h;
    }

    final int m5070d() {
        return this.f4519f;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean m5071e() {
        return this.f4520g <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4519f == status.f4519f && this.f4520g == status.f4520g && av.m5525a(this.f4521h, status.f4521h) && av.m5525a(this.f4522i, status.f4522i);
    }

    public final int m5072f() {
        return this.f4520g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4519f), Integer.valueOf(this.f4520g), this.f4521h, this.f4522i});
    }

    public final String toString() {
        return av.m5524a(this).m5526a("statusCode", this.f4521h != null ? this.f4521h : C0659h.m5081a(this.f4520g)).m5526a("resolution", this.f4522i).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0696x.m5316a(this, parcel, i);
    }
}
