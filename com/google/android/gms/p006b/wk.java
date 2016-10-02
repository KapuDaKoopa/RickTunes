package com.google.android.gms.p006b;

import java.util.Arrays;

/* renamed from: com.google.android.gms.b.wk */
public final class wk {
    public final int f4314a;
    public final int f4315b;

    public wk(int i, int i2) {
        this.f4314a = i;
        this.f4315b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wk)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        wk wkVar = (wk) obj;
        return wkVar.f4314a == this.f4314a && wkVar.f4315b == this.f4315b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4314a), Integer.valueOf(this.f4315b)});
    }
}
