package com.google.android.gms.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p006b.za;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Arrays;

public class LogEventParcelable implements SafeParcelable {
    public static final C0651h CREATOR;
    public final int f4461a;
    public PlayLoggerContext f4462b;
    public byte[] f4463c;
    public int[] f4464d;
    public final za f4465e;
    public final C0649e f4466f;
    public final C0649e f4467g;

    static {
        CREATOR = new C0651h();
    }

    LogEventParcelable(int i, PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr) {
        this.f4461a = i;
        this.f4462b = playLoggerContext;
        this.f4463c = bArr;
        this.f4464d = iArr;
        this.f4465e = null;
        this.f4466f = null;
        this.f4467g = null;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, za zaVar, C0649e c0649e, C0649e c0649e2, int[] iArr) {
        this.f4461a = 1;
        this.f4462b = playLoggerContext;
        this.f4465e = zaVar;
        this.f4466f = c0649e;
        this.f4467g = c0649e2;
        this.f4464d = iArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventParcelable)) {
            return false;
        }
        LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
        return this.f4461a == logEventParcelable.f4461a && av.m5525a(this.f4462b, logEventParcelable.f4462b) && Arrays.equals(this.f4463c, logEventParcelable.f4463c) && Arrays.equals(this.f4464d, logEventParcelable.f4464d) && av.m5525a(this.f4465e, logEventParcelable.f4465e) && av.m5525a(this.f4466f, logEventParcelable.f4466f) && av.m5525a(this.f4467g, logEventParcelable.f4467g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4461a), this.f4462b, this.f4463c, this.f4464d, this.f4465e, this.f4466f, this.f4467g});
    }

    public String toString() {
        String str = null;
        StringBuilder stringBuilder = new StringBuilder("LogEventParcelable[");
        stringBuilder.append(this.f4461a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f4462b);
        stringBuilder.append(", ");
        stringBuilder.append(this.f4463c == null ? null : new String(this.f4463c));
        stringBuilder.append(", ");
        if (this.f4464d != null) {
            str = new au(", ").m5523a(new StringBuilder(), Arrays.asList(new int[][]{this.f4464d})).toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(this.f4465e);
        stringBuilder.append(", ");
        stringBuilder.append(this.f4466f);
        stringBuilder.append(", ");
        stringBuilder.append(this.f4467g);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0651h.m5053a(this, parcel, i);
    }
}
