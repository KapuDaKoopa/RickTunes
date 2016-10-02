package com.google.android.gms.p006b;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C0335b;
import com.google.android.gms.ads.internal.formats.C0381c;
import com.google.android.gms.ads.mediation.C0246k;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;
import java.util.ArrayList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.b.la */
public final class la extends ks {
    private final C0246k f3558a;

    public la(C0246k c0246k) {
        this.f3558a = c0246k;
    }

    public final String m4115a() {
        return this.f3558a.f1326d;
    }

    public final void m4116a(C0314a c0314a) {
        C0246k c0246k = this.f3558a;
        C0317d.m1997a(c0314a);
    }

    public final List m4117b() {
        List<C0335b> list = this.f3558a.f1327e;
        if (list == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (C0335b c0335b : list) {
            arrayList.add(new C0381c(c0335b.m2051a(), c0335b.m2052b(), c0335b.m2053c()));
        }
        return arrayList;
    }

    public final void m4118b(C0314a c0314a) {
        this.f3558a.m1723a((View) C0317d.m1997a(c0314a));
    }

    public final String m4119c() {
        return this.f3558a.f1328f;
    }

    public final dj m4120d() {
        C0335b c0335b = this.f3558a.f1329g;
        return c0335b != null ? new C0381c(c0335b.m2051a(), c0335b.m2052b(), c0335b.m2053c()) : null;
    }

    public final String m4121e() {
        return this.f3558a.f1330h;
    }

    public final double m4122f() {
        return this.f3558a.f1331i;
    }

    public final String m4123g() {
        return this.f3558a.f1332j;
    }

    public final String m4124h() {
        return this.f3558a.f1333k;
    }

    public final void m4125i() {
        C0246k c0246k = this.f3558a;
    }

    public final boolean m4126j() {
        return this.f3558a.m1725c();
    }

    public final boolean m4127k() {
        return this.f3558a.m1726d();
    }

    public final Bundle m4128l() {
        return this.f3558a.m1727e();
    }
}
