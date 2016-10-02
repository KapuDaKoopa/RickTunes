package com.google.android.gms.ads.internal.reward.client;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;

@op
public final class RewardedVideoAdRequestParcel implements SafeParcelable {
    public static final C0490m CREATOR;
    public final int f2504a;
    public final AdRequestParcel f2505b;
    public final String f2506c;

    static {
        CREATOR = new C0490m();
    }

    public RewardedVideoAdRequestParcel(int i, AdRequestParcel adRequestParcel, String str) {
        this.f2504a = i;
        this.f2505b = adRequestParcel;
        this.f2506c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0490m.m2950a(this, parcel, i);
    }
}
