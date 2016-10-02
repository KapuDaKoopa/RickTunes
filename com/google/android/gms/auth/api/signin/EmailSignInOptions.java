package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.gms.auth.api.signin.internal.C0591j;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONObject;

public class EmailSignInOptions implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2741a;
    private final Uri f2742b;
    private String f2743c;
    private Uri f2744d;

    static {
        CREATOR = new C0571e();
    }

    EmailSignInOptions(int i, Uri uri, String str, Uri uri2) {
        ax.m5528a((Object) uri, (Object) "Server widget url cannot be null in order to use email/password sign in.");
        ax.m5530a(uri.toString(), (Object) "Server widget url cannot be null in order to use email/password sign in.");
        ax.m5536b(Patterns.WEB_URL.matcher(uri.toString()).matches(), "Invalid server widget url");
        this.f2741a = i;
        this.f2742b = uri;
        this.f2743c = str;
        this.f2744d = uri2;
    }

    private JSONObject m3217e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("serverWidgetUrl", this.f2742b.toString());
            if (!TextUtils.isEmpty(this.f2743c)) {
                jSONObject.put("modeQueryName", this.f2743c);
            }
            if (this.f2744d != null) {
                jSONObject.put("tosUrl", this.f2744d.toString());
            }
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final Uri m3218a() {
        return this.f2742b;
    }

    public final Uri m3219b() {
        return this.f2744d;
    }

    public final String m3220c() {
        return this.f2743c;
    }

    public final String m3221d() {
        return m3217e().toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            EmailSignInOptions emailSignInOptions = (EmailSignInOptions) obj;
            if (!this.f2742b.equals(emailSignInOptions.f2742b)) {
                return false;
            }
            if (this.f2744d == null) {
                if (emailSignInOptions.f2744d != null) {
                    return false;
                }
            } else if (!this.f2744d.equals(emailSignInOptions.f2744d)) {
                return false;
            }
            if (TextUtils.isEmpty(this.f2743c)) {
                if (!TextUtils.isEmpty(emailSignInOptions.f2743c)) {
                    return false;
                }
            } else if (!this.f2743c.equals(emailSignInOptions.f2743c)) {
                return false;
            }
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public int hashCode() {
        return new C0591j().m3379a(this.f2742b).m3379a(this.f2744d).m3379a(this.f2743c).m3378a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0571e.m3267a(this, parcel, i);
    }
}
