package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0259a;
import com.google.android.gms.ads.C0326b;
import com.google.android.gms.ads.C0327c;
import com.google.android.gms.ads.C0328d;
import com.google.android.gms.ads.C0332e;
import com.google.android.gms.ads.C0333f;
import com.google.android.gms.ads.C0341h;
import com.google.android.gms.ads.formats.C0263f;
import com.google.android.gms.ads.formats.C0264h;
import com.google.android.gms.ads.formats.C0336c;
import com.google.android.gms.ads.internal.client.C0351c;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.mediation.C0239d;
import com.google.android.gms.ads.mediation.C0240h;
import com.google.android.gms.ads.mediation.C0508a;
import com.google.android.gms.ads.mediation.C0509c;
import com.google.android.gms.ads.mediation.C0518e;
import com.google.android.gms.ads.mediation.C0519g;
import com.google.android.gms.ads.mediation.C0520i;
import com.google.android.gms.ads.mediation.C0521m;
import com.google.android.gms.ads.p007b.C0243b;
import com.google.android.gms.ads.p007b.p008a.C0238a;
import com.google.android.gms.ads.p007b.p008a.C0324b;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.uh;
import java.util.Date;
import java.util.Set;

@op
/* renamed from: com.google.ads.mediation.a */
public abstract class C0242a implements C0238a, C0239d, C0240h, uh {
    protected AdView f1314a;
    protected C0341h f1315b;
    final C0243b f1316c;
    private C0326b f1317d;
    private Context f1318e;
    private C0341h f1319f;
    private C0324b f1320g;
    private String f1321h;

    public C0242a() {
        this.f1316c = new C0244b(this);
    }

    private C0328d m1688a(Context context, C0508a c0508a, Bundle bundle, Bundle bundle2) {
        int i = 1;
        C0332e c0332e = new C0332e();
        Date a = c0508a.m3060a();
        if (a != null) {
            c0332e.f1746a.f1962g = a;
        }
        int b = c0508a.m3061b();
        if (b != 0) {
            c0332e.f1746a.f1964i = b;
        }
        Set<String> c = c0508a.m3062c();
        if (c != null) {
            for (String add : c) {
                c0332e.f1746a.f1956a.add(add);
            }
        }
        Location d = c0508a.m3063d();
        if (d != null) {
            c0332e.f1746a.f1965j = d;
        }
        if (c0508a.m3065f()) {
            C0374z.m2455a();
            c0332e.f1746a.m2369a(C0500a.m3011a(context));
        }
        if (c0508a.m3064e() != -1) {
            if (c0508a.m3064e() == 1) {
                b = 1;
            } else {
                byte b2 = (byte) 0;
            }
            C0351c c0351c = c0332e.f1746a;
            if (b == 0) {
                i = 0;
            }
            c0351c.f1969n = i;
        }
        c0332e.f1746a.f1970o = c0508a.m3066g();
        Bundle a2 = m1690a(bundle, bundle2);
        Class cls = AdMobAdapter.class;
        c0332e.f1746a.f1957b.putBundle(cls.getName(), a2);
        if (cls.equals(AdMobAdapter.class) && a2.getBoolean("_emulatorLiveAds")) {
            C0351c c0351c2 = c0332e.f1746a;
            c0351c2.f1959d.remove(C0328d.f1743a);
        }
        return new C0328d((byte) 0);
    }

    protected abstract Bundle m1690a(Bundle bundle, Bundle bundle2);

    public String m1691a(Bundle bundle) {
        return bundle.getString("pubid");
    }

    public final void m1692a() {
        if (this.f1314a != null) {
            this.f1314a.m2009c();
            this.f1314a = null;
        }
        if (this.f1315b != null) {
            this.f1315b = null;
        }
        if (this.f1317d != null) {
            this.f1317d = null;
        }
        if (this.f1319f != null) {
            this.f1319f = null;
        }
    }

    public final void m1693a(Context context, C0518e c0518e, Bundle bundle, C0333f c0333f, C0508a c0508a, Bundle bundle2) {
        this.f1314a = new AdView(context);
        this.f1314a.setAdSize(new C0333f(c0333f.m2043b(), c0333f.m2041a()));
        this.f1314a.setAdUnitId(m1691a(bundle));
        this.f1314a.setAdListener(new C0261e(this, c0518e));
        this.f1314a.m2007a(m1688a(context, c0508a, bundle2, bundle));
    }

    public final void m1694a(Context context, C0519g c0519g, Bundle bundle, C0508a c0508a, Bundle bundle2) {
        this.f1315b = new C0341h(context);
        this.f1315b.m2073a(m1691a(bundle));
        this.f1315b.m2070a(new C0262f(this, c0519g));
        this.f1315b.m2072a(m1688a(context, c0508a, bundle2, bundle));
    }

    public final void m1695a(Context context, C0520i c0520i, Bundle bundle, C0521m c0521m, Bundle bundle2) {
        C0264h c0265g = new C0265g(this, c0520i);
        C0327c a = new C0327c(context, bundle.getString("pubid")).m2036a((C0259a) c0265g);
        C0336c h = c0521m.m3102h();
        if (h != null) {
            a.m2037a(h);
        }
        if (c0521m.m3103i()) {
            a.m2038a((C0263f) c0265g);
        }
        if (c0521m.m3104j()) {
            a.m2039a(c0265g);
        }
        this.f1317d = a.m2035a();
        this.f1317d.m2034a(m1688a(context, c0521m, bundle2, bundle));
    }

    public final void m1696a(Context context, String str, C0324b c0324b) {
        this.f1318e = context.getApplicationContext();
        this.f1321h = str;
        this.f1320g = c0324b;
        this.f1320g.m2024a(this);
    }

    public final void m1697a(C0508a c0508a, Bundle bundle, Bundle bundle2) {
        if (this.f1318e == null || this.f1320g == null) {
            C0501b.m3027a(6);
            return;
        }
        this.f1319f = new C0341h(this.f1318e);
        this.f1319f.m2074b();
        this.f1319f.m2073a(m1691a(bundle));
        this.f1319f.m2071a(this.f1316c);
        this.f1319f.m2075b(this.f1321h);
        this.f1319f.m2072a(m1688a(this.f1318e, c0508a, bundle2, bundle));
    }

    public final void m1698b() {
        if (this.f1314a != null) {
            this.f1314a.m2008b();
        }
    }

    public final void m1699c() {
        if (this.f1314a != null) {
            this.f1314a.m2006a();
        }
    }

    public final View m1700d() {
        return this.f1314a;
    }

    public final void m1701e() {
        this.f1315b.m2069a();
    }

    public final Bundle m1702f() {
        C0509c c0509c = new C0509c();
        c0509c.f2573a = 1;
        Bundle bundle = new Bundle();
        bundle.putInt("capabilities", c0509c.f2573a);
        return bundle;
    }

    public final void m1703g() {
        this.f1319f.m2069a();
    }

    public final boolean m1704h() {
        return this.f1320g != null;
    }
}
