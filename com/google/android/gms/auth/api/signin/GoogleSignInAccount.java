package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.xf;
import com.google.android.gms.p006b.xg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount implements SafeParcelable {
    public static final Creator CREATOR;
    public static xf f2745a;
    private static Comparator f2746l;
    final int f2747b;
    List f2748c;
    private String f2749d;
    private String f2750e;
    private String f2751f;
    private String f2752g;
    private Uri f2753h;
    private String f2754i;
    private long f2755j;
    private String f2756k;

    static {
        CREATOR = new C0572f();
        f2745a = xg.m4890d();
        f2746l = new C0567a();
    }

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list) {
        this.f2747b = i;
        this.f2749d = str;
        this.f2750e = str2;
        this.f2751f = str3;
        this.f2752g = str4;
        this.f2753h = uri;
        this.f2754i = str5;
        this.f2755j = j;
        this.f2756k = str6;
        this.f2748c = list;
    }

    public static GoogleSignInAccount m3222a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Object optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        Object hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.optString("tokenId", null);
        String optString4 = jSONObject.optString("email", null);
        String optString5 = jSONObject.optString("displayName", null);
        Long valueOf = Long.valueOf(parseLong);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(2, optString2, optString3, optString4, optString5, parse, null, (valueOf == null ? Long.valueOf(f2745a.m4887a() / 1000) : valueOf).longValue(), ax.m5529a(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) ax.m5527a(hashSet)));
        googleSignInAccount.f2754i = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    private JSONObject m3223k() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f2749d != null) {
                jSONObject.put("id", this.f2749d);
            }
            if (this.f2750e != null) {
                jSONObject.put("tokenId", this.f2750e);
            }
            if (this.f2751f != null) {
                jSONObject.put("email", this.f2751f);
            }
            if (this.f2752g != null) {
                jSONObject.put("displayName", this.f2752g);
            }
            if (this.f2753h != null) {
                jSONObject.put("photoUrl", this.f2753h.toString());
            }
            if (this.f2754i != null) {
                jSONObject.put("serverAuthCode", this.f2754i);
            }
            jSONObject.put("expirationTime", this.f2755j);
            jSONObject.put("obfuscatedIdentifier", this.f2756k);
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f2748c, f2746l);
            for (Scope a : this.f2748c) {
                jSONArray.put(a.m5065a());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final String m3224a() {
        return this.f2749d;
    }

    public final String m3225b() {
        return this.f2750e;
    }

    public final String m3226c() {
        return this.f2751f;
    }

    public final String m3227d() {
        return this.f2752g;
    }

    public int describeContents() {
        return 0;
    }

    public final Uri m3228e() {
        return this.f2753h;
    }

    public boolean equals(Object obj) {
        return !(obj instanceof GoogleSignInAccount) ? false : ((GoogleSignInAccount) obj).m3223k().toString().equals(m3223k().toString());
    }

    public final String m3229f() {
        return this.f2754i;
    }

    public final long m3230g() {
        return this.f2755j;
    }

    public final String m3231h() {
        return this.f2756k;
    }

    public final String m3232i() {
        return m3223k().toString();
    }

    public final String m3233j() {
        JSONObject k = m3223k();
        k.remove("serverAuthCode");
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0572f.m3268a(this, parcel, i);
    }
}
