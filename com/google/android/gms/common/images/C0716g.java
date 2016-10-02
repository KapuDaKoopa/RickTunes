package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.av;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.images.g */
public final class C0716g extends C0714e {
    private WeakReference f4775e;

    protected final void m5386a() {
        if (((C0710a) this.f4775e.get()) != null) {
            Uri uri = this.a.f4774a;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0716g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0716g c0716g = (C0716g) obj;
        C0710a c0710a = (C0710a) this.f4775e.get();
        C0710a c0710a2 = (C0710a) c0716g.f4775e.get();
        return c0710a2 != null && c0710a != null && av.m5525a(c0710a2, c0710a) && av.m5525a(c0716g.a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
