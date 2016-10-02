package com.google.android.gms.p006b;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C0335b;
import com.google.android.gms.ads.internal.formats.C0381c;
import com.google.android.gms.ads.mediation.C0257l;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;
import java.util.ArrayList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.b.lb */
public final class lb extends kv {
    private final C0257l f3559a;

    public lb(C0257l c0257l) {
        this.f3559a = c0257l;
    }

    public final String m4129a() {
        return this.f3559a.f1346d;
    }

    public final void m4130a(C0314a c0314a) {
        C0257l c0257l = this.f3559a;
        C0317d.m1997a(c0314a);
    }

    public final List m4131b() {
        List<C0335b> list = this.f3559a.f1347e;
        if (list == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (C0335b c0335b : list) {
            arrayList.add(new C0381c(c0335b.m2051a(), c0335b.m2052b(), c0335b.m2053c()));
        }
        return arrayList;
    }

    public final void m4132b(C0314a c0314a) {
        this.f3559a.m1723a((View) C0317d.m1997a(c0314a));
    }

    public final String m4133c() {
        return this.f3559a.f1348f;
    }

    public final dj m4134d() {
        C0335b c0335b = this.f3559a.f1349g;
        return c0335b != null ? new C0381c(c0335b.m2051a(), c0335b.m2052b(), c0335b.m2053c()) : null;
    }

    public final String m4135e() {
        return this.f3559a.f1350h;
    }

    public final String m4136f() {
        return this.f3559a.f1351i;
    }

    public final void m4137g() {
        C0257l c0257l = this.f3559a;
    }

    public final boolean m4138h() {
        return this.f3559a.m1725c();
    }

    public final boolean m4139i() {
        return this.f3559a.m1726d();
    }

    public final Bundle m4140j() {
        return this.f3559a.m1727e();
    }
}
