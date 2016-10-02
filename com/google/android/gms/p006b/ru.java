package com.google.android.gms.p006b;

import com.google.android.gms.common.internal.av;
import java.util.Arrays;

/* renamed from: com.google.android.gms.b.ru */
public final class ru {
    public final String f4066a;
    public final double f4067b;
    public final double f4068c;
    public final double f4069d;
    public final int f4070e;

    public ru(String str, double d, double d2, double d3, int i) {
        this.f4066a = str;
        this.f4068c = d;
        this.f4067b = d2;
        this.f4069d = d3;
        this.f4070e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        return av.m5525a(this.f4066a, ruVar.f4066a) && this.f4067b == ruVar.f4067b && this.f4068c == ruVar.f4068c && this.f4070e == ruVar.f4070e && Double.compare(this.f4069d, ruVar.f4069d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4066a, Double.valueOf(this.f4067b), Double.valueOf(this.f4068c), Double.valueOf(this.f4069d), Integer.valueOf(this.f4070e)});
    }

    public final String toString() {
        return av.m5524a(this).m5526a("name", this.f4066a).m5526a("minBound", Double.valueOf(this.f4068c)).m5526a("maxBound", Double.valueOf(this.f4067b)).m5526a("percent", Double.valueOf(this.f4069d)).m5526a("count", Integer.valueOf(this.f4070e)).toString();
    }
}
