package com.google.android.gms.auth;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

public class TokenData implements SafeParcelable {
    public static final C0611d CREATOR;
    final int f2619a;
    private final String f2620b;
    private final Long f2621c;
    private final boolean f2622d;
    private final boolean f2623e;
    private final List f2624f;

    static {
        CREATOR = new C0611d();
    }

    TokenData(int i, String str, Long l, boolean z, boolean z2, List list) {
        this.f2619a = i;
        this.f2620b = ax.m5529a(str);
        this.f2621c = l;
        this.f2622d = z;
        this.f2623e = z2;
        this.f2624f = list;
    }

    public final String m3127a() {
        return this.f2620b;
    }

    public final Long m3128b() {
        return this.f2621c;
    }

    public final boolean m3129c() {
        return this.f2622d;
    }

    public final boolean m3130d() {
        return this.f2623e;
    }

    public int describeContents() {
        return 0;
    }

    public final List m3131e() {
        return this.f2624f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f2620b, tokenData.f2620b) && av.m5525a(this.f2621c, tokenData.f2621c) && this.f2622d == tokenData.f2622d && this.f2623e == tokenData.f2623e && av.m5525a(this.f2624f, tokenData.f2624f);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2620b, this.f2621c, Boolean.valueOf(this.f2622d), Boolean.valueOf(this.f2623e), this.f2624f});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0611d.m3408a(this, parcel);
    }
}
