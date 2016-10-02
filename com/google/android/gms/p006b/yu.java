package com.google.android.gms.p006b;

import java.util.Arrays;

/* renamed from: com.google.android.gms.b.yu */
final class yu {
    final int f4391a;
    final byte[] f4392b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yu)) {
            return false;
        }
        yu yuVar = (yu) obj;
        return this.f4391a == yuVar.f4391a && Arrays.equals(this.f4392b, yuVar.f4392b);
    }

    public final int hashCode() {
        return ((this.f4391a + 527) * 31) + Arrays.hashCode(this.f4392b);
    }
}
