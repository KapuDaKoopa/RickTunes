package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.p006b.dj;
import com.google.android.gms.p006b.du;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;
import java.util.List;

@op
/* renamed from: com.google.android.gms.ads.internal.formats.d */
public final class C0383d extends du implements C0382i {
    private String f2067a;
    private List f2068b;
    private String f2069c;
    private dj f2070d;
    private String f2071e;
    private double f2072f;
    private String f2073g;
    private String f2074h;
    private C0379a f2075i;
    private Bundle f2076j;
    private Object f2077k;
    private C0386h f2078l;

    public C0383d(String str, List list, String str2, dj djVar, String str3, double d, String str4, String str5, C0379a c0379a, Bundle bundle) {
        this.f2077k = new Object();
        this.f2067a = str;
        this.f2068b = list;
        this.f2069c = str2;
        this.f2070d = djVar;
        this.f2071e = str3;
        this.f2072f = d;
        this.f2073g = str4;
        this.f2074h = str5;
        this.f2075i = c0379a;
        this.f2076j = bundle;
    }

    public final String m2508a() {
        return this.f2067a;
    }

    public final void m2509a(C0386h c0386h) {
        synchronized (this.f2077k) {
            this.f2078l = c0386h;
        }
    }

    public final List m2510b() {
        return this.f2068b;
    }

    public final String m2511c() {
        return this.f2069c;
    }

    public final dj m2512d() {
        return this.f2070d;
    }

    public final String m2513e() {
        return this.f2071e;
    }

    public final double m2514f() {
        return this.f2072f;
    }

    public final String m2515g() {
        return this.f2073g;
    }

    public final String m2516h() {
        return this.f2074h;
    }

    public final C0314a m2517i() {
        return C0317d.m1996a(this.f2078l);
    }

    public final String m2518j() {
        return "2";
    }

    public final String m2519k() {
        return "";
    }

    public final C0379a m2520l() {
        return this.f2075i;
    }

    public final Bundle m2521m() {
        return this.f2076j;
    }

    public final void m2522n() {
        this.f2067a = null;
        this.f2068b = null;
        this.f2069c = null;
        this.f2070d = null;
        this.f2071e = null;
        this.f2072f = 0.0d;
        this.f2073g = null;
        this.f2074h = null;
        this.f2075i = null;
        this.f2076j = null;
        this.f2077k = null;
        this.f2078l = null;
    }
}
