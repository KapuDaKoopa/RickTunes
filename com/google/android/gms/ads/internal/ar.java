package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.C0407a;
import com.google.android.gms.ads.internal.overlay.C0428r;
import com.google.android.gms.ads.internal.purchase.C0443k;
import com.google.android.gms.ads.internal.request.C0451c;
import com.google.android.gms.p006b.cg;
import com.google.android.gms.p006b.ch;
import com.google.android.gms.p006b.ci;
import com.google.android.gms.p006b.cp;
import com.google.android.gms.p006b.gf;
import com.google.android.gms.p006b.hp;
import com.google.android.gms.p006b.jx;
import com.google.android.gms.p006b.nu;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.pk;
import com.google.android.gms.p006b.qd;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.rg;
import com.google.android.gms.p006b.rh;
import com.google.android.gms.p006b.ri;
import com.google.android.gms.p006b.rk;
import com.google.android.gms.p006b.rl;
import com.google.android.gms.p006b.rm;
import com.google.android.gms.p006b.rn;
import com.google.android.gms.p006b.ro;
import com.google.android.gms.p006b.se;
import com.google.android.gms.p006b.tm;
import com.google.android.gms.p006b.xf;
import com.google.android.gms.p006b.xg;

@op
public final class ar {
    private static final Object f1820a;
    private static ar f1821b;
    private final C0451c f1822c;
    private final C0407a f1823d;
    private final C0428r f1824e;
    private final nu f1825f;
    private final rd f1826g;
    private final tm f1827h;
    private final rg f1828i;
    private final qd f1829j;
    private final xf f1830k;
    private final cp f1831l;
    private final pk f1832m;
    private final ch f1833n;
    private final cg f1834o;
    private final ci f1835p;
    private final C0443k f1836q;
    private final hp f1837r;
    private final se f1838s;
    private final jx f1839t;
    private final ai f1840u;
    private final gf f1841v;

    static {
        f1820a = new Object();
        ar arVar = new ar();
        synchronized (f1820a) {
            f1821b = arVar;
        }
    }

    protected ar() {
        this.f1822c = new C0451c();
        this.f1823d = new C0407a();
        this.f1824e = new C0428r();
        this.f1825f = new nu();
        this.f1826g = new rd();
        this.f1827h = new tm();
        int i = VERSION.SDK_INT;
        rg roVar = i >= 19 ? new ro() : i >= 18 ? new rm() : i >= 17 ? new rl() : i >= 16 ? new rn() : i >= 14 ? new rk() : i >= 11 ? new ri() : i >= 9 ? new rh() : new rg();
        this.f1828i = roVar;
        rd rdVar = this.f1826g;
        this.f1829j = new qd();
        this.f1830k = new xg();
        this.f1831l = new cp();
        this.f1832m = new pk();
        this.f1833n = new ch();
        this.f1834o = new cg();
        this.f1835p = new ci();
        this.f1836q = new C0443k();
        this.f1837r = new hp();
        this.f1838s = new se();
        this.f1839t = new jx();
        this.f1840u = new ai();
        this.f1841v = new gf();
    }

    public static C0451c m2236a() {
        return m2256u().f1822c;
    }

    public static C0407a m2237b() {
        return m2256u().f1823d;
    }

    public static C0428r m2238c() {
        return m2256u().f1824e;
    }

    public static nu m2239d() {
        return m2256u().f1825f;
    }

    public static rd m2240e() {
        return m2256u().f1826g;
    }

    public static tm m2241f() {
        return m2256u().f1827h;
    }

    public static rg m2242g() {
        return m2256u().f1828i;
    }

    public static qd m2243h() {
        return m2256u().f1829j;
    }

    public static xf m2244i() {
        return m2256u().f1830k;
    }

    public static cp m2245j() {
        return m2256u().f1831l;
    }

    public static pk m2246k() {
        return m2256u().f1832m;
    }

    public static ch m2247l() {
        return m2256u().f1833n;
    }

    public static cg m2248m() {
        return m2256u().f1834o;
    }

    public static ci m2249n() {
        return m2256u().f1835p;
    }

    public static C0443k m2250o() {
        return m2256u().f1836q;
    }

    public static hp m2251p() {
        return m2256u().f1837r;
    }

    public static se m2252q() {
        return m2256u().f1838s;
    }

    public static jx m2253r() {
        return m2256u().f1839t;
    }

    public static ai m2254s() {
        return m2256u().f1840u;
    }

    public static gf m2255t() {
        return m2256u().f1841v;
    }

    private static ar m2256u() {
        ar arVar;
        synchronized (f1820a) {
            arVar = f1821b;
        }
        return arVar;
    }
}
