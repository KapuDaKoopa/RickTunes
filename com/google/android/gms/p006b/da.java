package com.google.android.gms.p006b;

import android.view.View;
import com.google.android.gms.ads.internal.C0376r;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;

@op
/* renamed from: com.google.android.gms.b.da */
public final class da extends dd {
    private final C0376r f3127a;
    private final String f3128b;
    private final String f3129c;

    public da(C0376r c0376r, String str, String str2) {
        this.f3127a = c0376r;
        this.f3128b = str;
        this.f3129c = str2;
    }

    public final String m3614a() {
        return this.f3128b;
    }

    public final void m3615a(C0314a c0314a) {
        if (c0314a != null) {
            this.f3127a.m2463b((View) C0317d.m1997a(c0314a));
        }
    }

    public final String m3616b() {
        return this.f3129c;
    }

    public final void m3617c() {
        this.f3127a.m2464x();
    }

    public final void m3618d() {
        this.f3127a.m2465y();
    }
}
