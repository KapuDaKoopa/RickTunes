package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.op;

@op
public final class AdLauncherIntentInfoParcel implements SafeParcelable {
    public static final C0411b CREATOR;
    public final int f2149a;
    public final String f2150b;
    public final String f2151c;
    public final String f2152d;
    public final String f2153e;
    public final String f2154f;
    public final String f2155g;
    public final String f2156h;
    public final Intent f2157i;

    static {
        CREATOR = new C0411b();
    }

    public AdLauncherIntentInfoParcel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f2149a = i;
        this.f2150b = str;
        this.f2151c = str2;
        this.f2152d = str3;
        this.f2153e = str4;
        this.f2154f = str5;
        this.f2155g = str6;
        this.f2156h = str7;
        this.f2157i = intent;
    }

    public AdLauncherIntentInfoParcel(Intent intent) {
        this(2, null, null, null, null, null, null, null, intent);
    }

    public AdLauncherIntentInfoParcel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(2, str, str2, str3, str4, str5, str6, str7, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C0411b.m2635a(this, parcel, i);
    }
}
