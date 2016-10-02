package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.av;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.images.f */
final class C0715f {
    public final Uri f4774a;

    public C0715f(Uri uri) {
        this.f4774a = uri;
    }

    public final boolean equals(Object obj) {
        return !(obj instanceof C0715f) ? false : this == obj ? true : av.m5525a(((C0715f) obj).f4774a, this.f4774a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4774a});
    }
}
