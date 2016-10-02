package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

final class aa {
    private final String f4813a;
    private final ComponentName f4814b;

    public aa(String str) {
        this.f4813a = ax.m5529a(str);
        this.f4814b = null;
    }

    public final Intent m5407a() {
        return this.f4813a != null ? new Intent(this.f4813a).setPackage("com.google.android.gms") : new Intent().setComponent(this.f4814b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return av.m5525a(this.f4813a, aaVar.f4813a) && av.m5525a(this.f4814b, aaVar.f4814b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4813a, this.f4814b});
    }

    public final String toString() {
        return this.f4813a == null ? this.f4814b.flattenToString() : this.f4813a;
    }
}
