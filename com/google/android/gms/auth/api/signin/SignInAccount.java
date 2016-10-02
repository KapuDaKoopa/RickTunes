package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONObject;

public class SignInAccount implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2770a;
    private String f2771b;
    private String f2772c;
    private String f2773d;
    private String f2774e;
    private Uri f2775f;
    private GoogleSignInAccount f2776g;
    private String f2777h;
    private String f2778i;

    static {
        CREATOR = new C0575i();
    }

    SignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, GoogleSignInAccount googleSignInAccount, String str5, String str6) {
        this.f2770a = i;
        this.f2773d = ax.m5530a(str3, (Object) "Email cannot be empty.");
        this.f2774e = str4;
        this.f2775f = uri;
        this.f2771b = str;
        this.f2772c = str2;
        this.f2776g = googleSignInAccount;
        this.f2777h = ax.m5529a(str5);
        this.f2778i = str6;
    }

    public static SignInAccount m3251a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Object optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        C0574h a = C0574h.m3270a(jSONObject.optString("providerId", null));
        SignInAccount signInAccount = new SignInAccount(2, a != null ? a.m3272a() : null, jSONObject.optString("tokenId", null), jSONObject.getString("email"), jSONObject.optString("displayName", null), parse, null, jSONObject.getString("localId"), jSONObject.optString("refreshToken"));
        signInAccount.f2776g = GoogleSignInAccount.m3222a(jSONObject.optString("googleSignInAccount"));
        return signInAccount;
    }

    private JSONObject m3252k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("email", this.f2773d);
            if (!TextUtils.isEmpty(this.f2774e)) {
                jSONObject.put("displayName", this.f2774e);
            }
            if (this.f2775f != null) {
                jSONObject.put("photoUrl", this.f2775f.toString());
            }
            if (!TextUtils.isEmpty(this.f2771b)) {
                jSONObject.put("providerId", this.f2771b);
            }
            if (!TextUtils.isEmpty(this.f2772c)) {
                jSONObject.put("tokenId", this.f2772c);
            }
            if (this.f2776g != null) {
                jSONObject.put("googleSignInAccount", this.f2776g.m3232i());
            }
            if (!TextUtils.isEmpty(this.f2778i)) {
                jSONObject.put("refreshToken", this.f2778i);
            }
            jSONObject.put("localId", this.f2777h);
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final SignInAccount m3253a(GoogleSignInAccount googleSignInAccount) {
        this.f2776g = googleSignInAccount;
        return this;
    }

    public final String m3254a() {
        return this.f2772c;
    }

    public final String m3255b() {
        return this.f2773d;
    }

    public final String m3256c() {
        return this.f2774e;
    }

    public final Uri m3257d() {
        return this.f2775f;
    }

    public int describeContents() {
        return 0;
    }

    public final C0574h m3258e() {
        return C0574h.m3270a(this.f2771b);
    }

    public final GoogleSignInAccount m3259f() {
        return this.f2776g;
    }

    public final String m3260g() {
        return this.f2777h;
    }

    public final String m3261h() {
        return this.f2778i;
    }

    public final String m3262i() {
        return m3252k().toString();
    }

    final String m3263j() {
        return this.f2771b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0575i.m3273a(this, parcel, i);
    }
}
