package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ScopeDetail implements SafeParcelable {
    public static final C0614c CREATOR;
    final int f2869a;
    String f2870b;
    String f2871c;
    String f2872d;
    String f2873e;
    String f2874f;
    List f2875g;
    public FACLData f2876h;

    static {
        CREATOR = new C0614c();
    }

    ScopeDetail(int i, String str, String str2, String str3, String str4, String str5, List list, FACLData fACLData) {
        this.f2869a = i;
        this.f2870b = str;
        this.f2871c = str2;
        this.f2872d = str3;
        this.f2873e = str4;
        this.f2874f = str5;
        this.f2875g = list;
        this.f2876h = fACLData;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0614c.m3411a(this, parcel, i);
    }
}
