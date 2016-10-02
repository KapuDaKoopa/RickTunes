package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Credential implements SafeParcelable {
    public static final Creator CREATOR;
    final int f2658a;
    private final String f2659b;
    private final String f2660c;
    private final Uri f2661d;
    private final List f2662e;
    private final String f2663f;
    private final String f2664g;
    private final String f2665h;
    private final String f2666i;

    static {
        CREATOR = new C0540e();
    }

    Credential(int i, String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        this.f2658a = i;
        String trim = ((String) ax.m5528a((Object) str, (Object) "credential identifier cannot be null")).trim();
        ax.m5530a(trim, (Object) "credential identifier cannot be empty");
        this.f2659b = trim;
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f2660c = str2;
        this.f2661d = uri;
        this.f2662e = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f2663f = str3;
        if (str3 == null || !str3.isEmpty()) {
            if (!TextUtils.isEmpty(str4)) {
                trim = Uri.parse(str4).getScheme();
                boolean z = "http".equalsIgnoreCase(trim) || "https".equalsIgnoreCase(trim);
                ax.m5535b(z);
            }
            this.f2664g = str4;
            this.f2665h = str5;
            this.f2666i = str6;
            if (!TextUtils.isEmpty(this.f2663f) && !TextUtils.isEmpty(this.f2664g)) {
                throw new IllegalStateException("password and accountType cannot both be set");
            }
            return;
        }
        throw new IllegalArgumentException("password cannot be empty");
    }

    public final String m3146a() {
        return this.f2659b;
    }

    public final String m3147b() {
        return this.f2660c;
    }

    public final Uri m3148c() {
        return this.f2661d;
    }

    public final List m3149d() {
        return this.f2662e;
    }

    public int describeContents() {
        return 0;
    }

    public final String m3150e() {
        return this.f2663f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f2659b, credential.f2659b) && TextUtils.equals(this.f2660c, credential.f2660c) && av.m5525a(this.f2661d, credential.f2661d) && TextUtils.equals(this.f2663f, credential.f2663f) && TextUtils.equals(this.f2664g, credential.f2664g) && TextUtils.equals(this.f2665h, credential.f2665h);
    }

    public final String m3151f() {
        return this.f2665h;
    }

    public final String m3152g() {
        return this.f2664g;
    }

    public final String m3153h() {
        return this.f2666i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2659b, this.f2660c, this.f2661d, this.f2663f, this.f2664g, this.f2665h});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0540e.m3176a(this, parcel, i);
    }
}
