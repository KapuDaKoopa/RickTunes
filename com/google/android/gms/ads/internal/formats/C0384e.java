package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.p006b.dj;
import com.google.android.gms.p006b.dy;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;
import java.util.List;

@op
/* renamed from: com.google.android.gms.ads.internal.formats.e */
public final class C0384e extends dy implements C0382i {
    private String f2079a;
    private List f2080b;
    private String f2081c;
    private dj f2082d;
    private String f2083e;
    private String f2084f;
    private C0379a f2085g;
    private Bundle f2086h;
    private Object f2087i;
    private C0386h f2088j;

    public C0384e(String str, List list, String str2, dj djVar, String str3, String str4, C0379a c0379a, Bundle bundle) {
        this.f2087i = new Object();
        this.f2079a = str;
        this.f2080b = list;
        this.f2081c = str2;
        this.f2082d = djVar;
        this.f2083e = str3;
        this.f2084f = str4;
        this.f2085g = c0379a;
        this.f2086h = bundle;
    }

    public final String m2532a() {
        return this.f2079a;
    }

    public final void m2533a(C0386h c0386h) {
        synchronized (this.f2087i) {
            this.f2088j = c0386h;
        }
    }

    public final List m2534b() {
        return this.f2080b;
    }

    public final String m2535c() {
        return this.f2081c;
    }

    public final dj m2536d() {
        return this.f2082d;
    }

    public final String m2537e() {
        return this.f2083e;
    }

    public final String m2538f() {
        return this.f2084f;
    }

    public final C0314a m2539g() {
        return C0317d.m1996a(this.f2088j);
    }

    public final Bundle m2540h() {
        return this.f2086h;
    }

    public final void m2541i() {
        this.f2079a = null;
        this.f2080b = null;
        this.f2081c = null;
        this.f2082d = null;
        this.f2083e = null;
        this.f2084f = null;
        this.f2085g = null;
        this.f2086h = null;
        this.f2087i = null;
        this.f2088j = null;
    }

    public final String m2542j() {
        return "1";
    }

    public final String m2543k() {
        return "";
    }

    public final C0379a m2544l() {
        return this.f2085g;
    }
}
