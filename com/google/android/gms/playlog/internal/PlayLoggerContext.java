package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class PlayLoggerContext implements SafeParcelable {
    public static final C0785b CREATOR;
    public final int f5010a;
    public final String f5011b;
    public final int f5012c;
    public final int f5013d;
    public final String f5014e;
    public final String f5015f;
    public final boolean f5016g;
    public final String f5017h;
    public final boolean f5018i;
    public final int f5019j;

    static {
        CREATOR = new C0785b();
    }

    public PlayLoggerContext(int i, String str, int i2, int i3, String str2, String str3, boolean z, String str4, boolean z2, int i4) {
        this.f5010a = i;
        this.f5011b = str;
        this.f5012c = i2;
        this.f5013d = i3;
        this.f5014e = str2;
        this.f5015f = str3;
        this.f5016g = z;
        this.f5017h = str4;
        this.f5018i = z2;
        this.f5019j = i4;
    }

    public PlayLoggerContext(String str, int i, int i2, String str2, String str3, String str4, boolean z, int i3) {
        this.f5010a = 1;
        this.f5011b = (String) ax.m5527a((Object) str);
        this.f5012c = i;
        this.f5013d = i2;
        this.f5017h = str2;
        this.f5014e = str3;
        this.f5015f = str4;
        this.f5016g = !z;
        this.f5018i = z;
        this.f5019j = i3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayLoggerContext)) {
            return false;
        }
        PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
        return this.f5010a == playLoggerContext.f5010a && this.f5011b.equals(playLoggerContext.f5011b) && this.f5012c == playLoggerContext.f5012c && this.f5013d == playLoggerContext.f5013d && av.m5525a(this.f5017h, playLoggerContext.f5017h) && av.m5525a(this.f5014e, playLoggerContext.f5014e) && av.m5525a(this.f5015f, playLoggerContext.f5015f) && this.f5016g == playLoggerContext.f5016g && this.f5018i == playLoggerContext.f5018i && this.f5019j == playLoggerContext.f5019j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5010a), this.f5011b, Integer.valueOf(this.f5012c), Integer.valueOf(this.f5013d), this.f5017h, this.f5014e, this.f5015f, Boolean.valueOf(this.f5016g), Boolean.valueOf(this.f5018i), Integer.valueOf(this.f5019j)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlayLoggerContext[");
        stringBuilder.append("versionCode=").append(this.f5010a).append(',');
        stringBuilder.append("package=").append(this.f5011b).append(',');
        stringBuilder.append("packageVersionCode=").append(this.f5012c).append(',');
        stringBuilder.append("logSource=").append(this.f5013d).append(',');
        stringBuilder.append("logSourceName=").append(this.f5017h).append(',');
        stringBuilder.append("uploadAccount=").append(this.f5014e).append(',');
        stringBuilder.append("loggingId=").append(this.f5015f).append(',');
        stringBuilder.append("logAndroidId=").append(this.f5016g).append(',');
        stringBuilder.append("isAnonymous=").append(this.f5018i).append(',');
        stringBuilder.append("qosTier=").append(this.f5019j);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0785b.m5748a(this, parcel);
    }
}
