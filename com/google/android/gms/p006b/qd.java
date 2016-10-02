package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.purchase.C0443k;
import com.google.android.gms.ads.internal.purchase.C0444l;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.C0706q;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Future;

@op
/* renamed from: com.google.android.gms.b.qd */
public final class qd implements qw {
    public final Object f3974a;
    public final String f3975b;
    public at f3976c;
    public final HashSet f3977d;
    public final HashMap f3978e;
    Boolean f3979f;
    public boolean f3980g;
    private final qe f3981h;
    private BigInteger f3982i;
    private boolean f3983j;
    private boolean f3984k;
    private int f3985l;
    private boolean f3986m;
    private Context f3987n;
    private VersionInfoParcel f3988o;
    private cn f3989p;
    private boolean f3990q;
    private bi f3991r;
    private bj f3992s;
    private bh f3993t;
    private String f3994u;
    private final LinkedList f3995v;
    private final oo f3996w;
    private String f3997x;
    private boolean f3998y;

    public qd() {
        this.f3974a = new Object();
        this.f3982i = BigInteger.ONE;
        this.f3977d = new HashSet();
        this.f3978e = new HashMap();
        this.f3983j = false;
        this.f3984k = true;
        this.f3985l = 0;
        this.f3986m = false;
        this.f3989p = null;
        this.f3990q = true;
        this.f3991r = null;
        this.f3992s = null;
        this.f3993t = null;
        this.f3995v = new LinkedList();
        this.f3996w = null;
        this.f3979f = null;
        this.f3980g = false;
        this.f3998y = false;
        this.f3975b = rd.m4434b();
        this.f3981h = new qe(this.f3975b);
    }

    private boolean m4357k() {
        boolean z;
        synchronized (this.f3974a) {
            z = this.f3990q;
        }
        return z;
    }

    public final Bundle m4358a(Context context, qf qfVar, String str) {
        Bundle bundle;
        synchronized (this.f3974a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f3981h.m4379a(context, str));
            Bundle bundle2 = new Bundle();
            for (String str2 : this.f3978e.keySet()) {
                bundle2.putBundle(str2, ((qg) this.f3978e.get(str2)).m4380a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f3977d.iterator();
            while (it.hasNext()) {
                arrayList.add(((qb) it.next()).m4355a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            qfVar.m2142a(this.f3977d);
            this.f3977d.clear();
        }
        return bundle;
    }

    public final bj m4359a(Context context) {
        if (!((Boolean) ar.m2249n().m3580a(ck.f3045J)).booleanValue() || !xn.m4900a(14) || m4357k()) {
            return null;
        }
        synchronized (this.f3974a) {
            if (this.f3991r == null) {
                if (context instanceof Activity) {
                    this.f3991r = new bi((Application) context.getApplicationContext(), (Activity) context);
                } else {
                    return null;
                }
            }
            if (this.f3993t == null) {
                this.f3993t = new bh();
            }
            if (this.f3992s == null) {
                this.f3992s = new bj(this.f3991r, this.f3993t, new oo(this.f3987n, this.f3988o, null, null));
            }
            this.f3992s.m3516a();
            bj bjVar = this.f3992s;
            return bjVar;
        }
    }

    public final String m4360a() {
        String bigInteger;
        synchronized (this.f3974a) {
            bigInteger = this.f3982i.toString();
            this.f3982i = this.f3982i.add(BigInteger.ONE);
        }
        return bigInteger;
    }

    public final String m4361a(int i, String str) {
        Resources resources = this.f3988o.f2542e ? this.f3987n.getResources() : C0706q.m5357c(this.f3987n);
        return resources == null ? str : resources.getString(i);
    }

    public final Future m4362a(Context context, boolean z) {
        Future g;
        synchronized (this.f3974a) {
            if (z != this.f3984k) {
                this.f3984k = z;
                g = new qn(context, z).m2709g();
            } else {
                g = null;
            }
        }
        return g;
    }

    public final Future m4363a(String str) {
        Future g;
        synchronized (this.f3974a) {
            if (str != null) {
                if (!str.equals(this.f3994u)) {
                    this.f3994u = str;
                    g = new qt(this.f3987n, str).m2709g();
                }
            }
            g = null;
        }
        return g;
    }

    @TargetApi(23)
    public final void m4364a(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (this.f3974a) {
            if (!this.f3986m) {
                this.f3987n = context.getApplicationContext();
                this.f3988o = versionInfoParcel;
                new qo(context, this).m2709g();
                new qq(context, this).m2709g();
                new qs(context, this).m2709g();
                new qu(context, this).m2709g();
                oo.m4309a(this.f3987n, Thread.currentThread(), this.f3988o);
                this.f3997x = ar.m2240e().m4453a(context, versionInfoParcel.f2539b);
                if (xn.m4900a(23) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                    this.f3998y = true;
                }
                this.f3976c = new at(context.getApplicationContext(), this.f3988o, new il(context.getApplicationContext(), this.f3988o, (String) ar.m2249n().m3580a(ck.f3063b)));
                cm cmVar = new cm(this.f3987n, this.f3988o.f2539b);
                try {
                    cn cnVar;
                    ar.m2245j();
                    if (!cmVar.f3089a) {
                        qk.m4383a();
                        cnVar = null;
                    } else if (cmVar.f3092d == null) {
                        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
                    } else if (TextUtils.isEmpty(cmVar.f3093e)) {
                        throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
                    } else {
                        cnVar = new cn(cmVar.f3092d, cmVar.f3093e, cmVar.f3090b, cmVar.f3091c);
                    }
                    this.f3989p = cnVar;
                } catch (Throwable e) {
                    C0501b.m3026a("Cannot initialize CSI reporter.", e);
                }
                C0443k o = ar.m2250o();
                Context context2 = this.f3987n;
                ServiceConnection c0444l = new C0444l(o, context2);
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                intent.setPackage("com.android.vending");
                context2.bindService(intent, c0444l, 1);
                this.f3986m = true;
            }
        }
    }

    public final void m4365a(Bundle bundle) {
        synchronized (this.f3974a) {
            this.f3984k = bundle.containsKey("use_https") ? bundle.getBoolean("use_https") : this.f3984k;
            this.f3985l = bundle.containsKey("webview_cache_version") ? bundle.getInt("webview_cache_version") : this.f3985l;
            if (bundle.containsKey("content_url_opted_out")) {
                m4368a(bundle.getBoolean("content_url_opted_out"));
            }
            if (bundle.containsKey("content_url_hashes")) {
                this.f3994u = bundle.getString("content_url_hashes");
            }
        }
    }

    public final void m4366a(qb qbVar) {
        synchronized (this.f3974a) {
            this.f3977d.add(qbVar);
        }
    }

    public final void m4367a(Throwable th, boolean z) {
        new oo(this.f3987n, this.f3988o, null, null).m4312a(th, z);
    }

    public final void m4368a(boolean z) {
        synchronized (this.f3974a) {
            if (this.f3990q != z) {
                new qr(this.f3987n, z).m2709g();
            }
            this.f3990q = z;
            bj a = m4359a(this.f3987n);
            if (!(a == null || a.isAlive())) {
                C0501b.m3027a(4);
                a.m3516a();
            }
        }
    }

    public final qe m4369b() {
        qe qeVar;
        synchronized (this.f3974a) {
            qeVar = this.f3981h;
        }
        return qeVar;
    }

    public final cn m4370c() {
        cn cnVar;
        synchronized (this.f3974a) {
            cnVar = this.f3989p;
        }
        return cnVar;
    }

    public final boolean m4371d() {
        boolean z;
        synchronized (this.f3974a) {
            z = this.f3983j;
            this.f3983j = true;
        }
        return z;
    }

    public final boolean m4372e() {
        boolean z;
        synchronized (this.f3974a) {
            z = this.f3984k || this.f3998y;
        }
        return z;
    }

    public final String m4373f() {
        String str;
        synchronized (this.f3974a) {
            str = this.f3997x;
        }
        return str;
    }

    public final String m4374g() {
        String str;
        synchronized (this.f3974a) {
            str = this.f3994u;
        }
        return str;
    }

    public final Boolean m4375h() {
        Boolean bool;
        synchronized (this.f3974a) {
            bool = this.f3979f;
        }
        return bool;
    }

    public final boolean m4376i() {
        boolean z;
        synchronized (this.f3974a) {
            if (this.f3985l < ((Integer) ar.m2249n().m3580a(ck.aa)).intValue()) {
                this.f3985l = ((Integer) ar.m2249n().m3580a(ck.aa)).intValue();
                new qp(this.f3987n, this.f3985l).m2709g();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean m4377j() {
        boolean z;
        synchronized (this.f3974a) {
            z = this.f3980g;
        }
        return z;
    }
}
