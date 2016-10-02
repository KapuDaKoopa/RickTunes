package com.andromo.dev576782.app537736;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

/* renamed from: com.andromo.dev576782.app537736.n */
public final class C0212n implements Comparable {
    public final ResolveInfo f1207a;
    public float f1208b;
    final /* synthetic */ C0211m f1209c;

    public C0212n(C0211m c0211m, ResolveInfo resolveInfo) {
        this.f1209c = c0211m;
        this.f1207a = resolveInfo;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return Float.floatToIntBits(((C0212n) obj).f1208b) - Float.floatToIntBits(this.f1208b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return Float.floatToIntBits(this.f1208b) == Float.floatToIntBits(((C0212n) obj).f1208b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1208b) + 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("resolveInfo:").append(this.f1207a.toString());
        stringBuilder.append("; weight:").append(new BigDecimal((double) this.f1208b));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
