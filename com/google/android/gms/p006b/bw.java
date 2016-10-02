package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.bw */
public final class bw {
    final long f3006a;
    final String f3007b;
    final int f3008c;

    bw(long j, String str, int i) {
        this.f3006a = j;
        this.f3007b = str;
        this.f3008c = i;
    }

    public final boolean equals(Object obj) {
        return (obj == null || !(obj instanceof bw)) ? false : ((bw) obj).f3006a == this.f3006a && ((bw) obj).f3008c == this.f3008c;
    }

    public final int hashCode() {
        return (int) this.f3006a;
    }
}
