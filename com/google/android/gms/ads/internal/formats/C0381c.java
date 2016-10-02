package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.p006b.dk;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;

@op
/* renamed from: com.google.android.gms.ads.internal.formats.c */
public final class C0381c extends dk {
    private final Drawable f2064a;
    private final Uri f2065b;
    private final double f2066c;

    public C0381c(Drawable drawable, Uri uri, double d) {
        this.f2064a = drawable;
        this.f2065b = uri;
        this.f2066c = d;
    }

    public final C0314a m2490a() {
        return C0317d.m1996a(this.f2064a);
    }

    public final Uri m2491b() {
        return this.f2065b;
    }

    public final double m2492c() {
        return this.f2066c;
    }
}
