package com.andromo.dev576782.app537736;

import android.content.ComponentName;
import java.math.BigDecimal;

/* renamed from: com.andromo.dev576782.app537736.q */
public final class C0215q {
    public final ComponentName f1212a;
    public final long f1213b;
    public final float f1214c;

    public C0215q(ComponentName componentName, long j, float f) {
        this.f1212a = componentName;
        this.f1213b = j;
        this.f1214c = f;
    }

    public C0215q(String str, long j, float f) {
        this(ComponentName.unflattenFromString(str), j, f);
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
        C0215q c0215q = (C0215q) obj;
        if (this.f1212a == null) {
            if (c0215q.f1212a != null) {
                return false;
            }
        } else if (!this.f1212a.equals(c0215q.f1212a)) {
            return false;
        }
        return this.f1213b != c0215q.f1213b ? false : Float.floatToIntBits(this.f1214c) == Float.floatToIntBits(c0215q.f1214c);
    }

    public final int hashCode() {
        return (((((this.f1212a == null ? 0 : this.f1212a.hashCode()) + 31) * 31) + ((int) (this.f1213b ^ (this.f1213b >>> 32)))) * 31) + Float.floatToIntBits(this.f1214c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append("; activity:").append(this.f1212a);
        stringBuilder.append("; time:").append(this.f1213b);
        stringBuilder.append("; weight:").append(new BigDecimal((double) this.f1214c));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
