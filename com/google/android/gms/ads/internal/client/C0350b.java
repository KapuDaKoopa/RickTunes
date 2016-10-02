package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.search.C0524a;
import com.google.android.gms.p006b.op;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@op
/* renamed from: com.google.android.gms.ads.internal.client.b */
public final class C0350b {
    public static final String f1937a;
    private final Date f1938b;
    private final String f1939c;
    private final int f1940d;
    private final Set f1941e;
    private final Location f1942f;
    private final boolean f1943g;
    private final Bundle f1944h;
    private final Map f1945i;
    private final String f1946j;
    private final String f1947k;
    private final C0524a f1948l;
    private final int f1949m;
    private final Set f1950n;
    private final Bundle f1951o;
    private final Set f1952p;
    private final boolean f1953q;

    static {
        C0374z.m2455a();
        f1937a = C0500a.m3012a("emulator");
    }

    public C0350b(C0351c c0351c) {
        this(c0351c, (byte) 0);
    }

    private C0350b(C0351c c0351c, byte b) {
        this.f1938b = c0351c.f1962g;
        this.f1939c = c0351c.f1963h;
        this.f1940d = c0351c.f1964i;
        this.f1941e = Collections.unmodifiableSet(c0351c.f1956a);
        this.f1942f = c0351c.f1965j;
        this.f1943g = c0351c.f1966k;
        this.f1944h = c0351c.f1957b;
        this.f1945i = Collections.unmodifiableMap(c0351c.f1958c);
        this.f1946j = c0351c.f1967l;
        this.f1947k = c0351c.f1968m;
        this.f1948l = null;
        this.f1949m = c0351c.f1969n;
        this.f1950n = Collections.unmodifiableSet(c0351c.f1959d);
        this.f1951o = c0351c.f1960e;
        this.f1952p = Collections.unmodifiableSet(c0351c.f1961f);
        this.f1953q = c0351c.f1970o;
    }

    public final Bundle m2348a(Class cls) {
        return this.f1944h.getBundle(cls.getName());
    }

    public final Date m2349a() {
        return this.f1938b;
    }

    public final boolean m2350a(Context context) {
        Set set = this.f1950n;
        C0374z.m2455a();
        return set.contains(C0500a.m3011a(context));
    }

    public final String m2351b() {
        return this.f1939c;
    }

    public final int m2352c() {
        return this.f1940d;
    }

    public final Set m2353d() {
        return this.f1941e;
    }

    public final Location m2354e() {
        return this.f1942f;
    }

    public final boolean m2355f() {
        return this.f1943g;
    }

    public final String m2356g() {
        return this.f1946j;
    }

    public final String m2357h() {
        return this.f1947k;
    }

    public final C0524a m2358i() {
        return this.f1948l;
    }

    public final Map m2359j() {
        return this.f1945i;
    }

    public final Bundle m2360k() {
        return this.f1944h;
    }

    public final int m2361l() {
        return this.f1949m;
    }

    public final Bundle m2362m() {
        return this.f1951o;
    }

    public final Set m2363n() {
        return this.f1952p;
    }

    public final boolean m2364o() {
        return this.f1953q;
    }
}
