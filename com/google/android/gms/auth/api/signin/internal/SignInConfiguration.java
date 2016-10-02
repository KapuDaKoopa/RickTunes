package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.EmailSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONObject;

public final class SignInConfiguration implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2796a;
    private final String f2797b;
    private String f2798c;
    private EmailSignInOptions f2799d;
    private GoogleSignInOptions f2800e;
    private String f2801f;

    static {
        CREATOR = new ab();
    }

    SignInConfiguration(int i, String str, String str2, EmailSignInOptions emailSignInOptions, GoogleSignInOptions googleSignInOptions, String str3) {
        this.f2796a = i;
        this.f2797b = ax.m5529a(str);
        this.f2798c = str2;
        this.f2799d = emailSignInOptions;
        this.f2800e = googleSignInOptions;
        this.f2801f = str3;
    }

    public SignInConfiguration(String str) {
        this(2, str, null, null, null, null);
    }

    private JSONObject m3275g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("consumerPackageName", this.f2797b);
            if (!TextUtils.isEmpty(this.f2798c)) {
                jSONObject.put("serverClientId", this.f2798c);
            }
            if (this.f2799d != null) {
                jSONObject.put("emailSignInOptions", this.f2799d.m3221d());
            }
            if (this.f2800e != null) {
                jSONObject.put("googleSignInOptions", this.f2800e.m3250h());
            }
            if (!TextUtils.isEmpty(this.f2801f)) {
                jSONObject.put("apiKey", this.f2801f);
            }
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final SignInConfiguration m3276a(GoogleSignInOptions googleSignInOptions) {
        this.f2800e = (GoogleSignInOptions) ax.m5528a((Object) googleSignInOptions, (Object) "GoogleSignInOptions cannot be null.");
        return this;
    }

    public final String m3277a() {
        return this.f2797b;
    }

    public final String m3278b() {
        return this.f2798c;
    }

    public final EmailSignInOptions m3279c() {
        return this.f2799d;
    }

    public final GoogleSignInOptions m3280d() {
        return this.f2800e;
    }

    public final int describeContents() {
        return 0;
    }

    public final String m3281e() {
        return this.f2801f;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (!this.f2797b.equals(signInConfiguration.f2797b)) {
                return false;
            }
            if (TextUtils.isEmpty(this.f2798c)) {
                if (!TextUtils.isEmpty(signInConfiguration.f2798c)) {
                    return false;
                }
            } else if (!this.f2798c.equals(signInConfiguration.f2798c)) {
                return false;
            }
            if (TextUtils.isEmpty(this.f2801f)) {
                if (!TextUtils.isEmpty(signInConfiguration.f2801f)) {
                    return false;
                }
            } else if (!this.f2801f.equals(signInConfiguration.f2801f)) {
                return false;
            }
            if (this.f2799d == null) {
                if (signInConfiguration.f2799d != null) {
                    return false;
                }
            } else if (!this.f2799d.equals(signInConfiguration.f2799d)) {
                return false;
            }
            if (this.f2800e == null) {
                if (signInConfiguration.f2800e != null) {
                    return false;
                }
            } else if (!this.f2800e.equals(signInConfiguration.f2800e)) {
                return false;
            }
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public final String m3282f() {
        return m3275g().toString();
    }

    public final int hashCode() {
        return new C0591j().m3379a(this.f2797b).m3379a(this.f2798c).m3379a(this.f2801f).m3379a(this.f2799d).m3379a(this.f2800e).m3378a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ab.m3298a(this, parcel, i);
    }
}
