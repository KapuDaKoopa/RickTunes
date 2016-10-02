package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class FACLConfig implements SafeParcelable {
    public static final C0612a CREATOR;
    final int f2857a;
    boolean f2858b;
    String f2859c;
    boolean f2860d;
    boolean f2861e;
    boolean f2862f;
    boolean f2863g;

    static {
        CREATOR = new C0612a();
    }

    FACLConfig(int i, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2857a = i;
        this.f2858b = z;
        this.f2859c = str;
        this.f2860d = z2;
        this.f2861e = z3;
        this.f2862f = z4;
        this.f2863g = z5;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FACLConfig)) {
            return false;
        }
        FACLConfig fACLConfig = (FACLConfig) obj;
        return this.f2858b == fACLConfig.f2858b && TextUtils.equals(this.f2859c, fACLConfig.f2859c) && this.f2860d == fACLConfig.f2860d && this.f2861e == fACLConfig.f2861e && this.f2862f == fACLConfig.f2862f && this.f2863g == fACLConfig.f2863g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f2858b), this.f2859c, Boolean.valueOf(this.f2860d), Boolean.valueOf(this.f2861e), Boolean.valueOf(this.f2862f), Boolean.valueOf(this.f2863g)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0612a.m3409a(this, parcel);
    }
}
