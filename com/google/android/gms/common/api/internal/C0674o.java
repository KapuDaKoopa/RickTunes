package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.C0697i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0467c;
import com.google.android.gms.common.api.C0531b;
import com.google.android.gms.common.api.C0654a;
import com.google.android.gms.common.api.C0655d;
import com.google.android.gms.common.internal.C0727j;
import com.google.android.gms.common.internal.ae;
import com.google.android.gms.p006b.ye;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.o */
public final class C0674o implements ak {
    final al f4618a;
    final Lock f4619b;
    final Context f4620c;
    final C0697i f4621d;
    ye f4622e;
    boolean f4623f;
    boolean f4624g;
    ae f4625h;
    boolean f4626i;
    boolean f4627j;
    final C0727j f4628k;
    private ConnectionResult f4629l;
    private int f4630m;
    private int f4631n;
    private int f4632o;
    private final Bundle f4633p;
    private final Set f4634q;
    private int f4635r;
    private final Map f4636s;
    private final C0531b f4637t;
    private ArrayList f4638u;

    public C0674o(al alVar, C0727j c0727j, Map map, C0697i c0697i, C0531b c0531b, Lock lock, Context context) {
        this.f4631n = 0;
        this.f4633p = new Bundle();
        this.f4634q = new HashSet();
        this.f4638u = new ArrayList();
        this.f4618a = alVar;
        this.f4628k = c0727j;
        this.f4636s = map;
        this.f4621d = c0697i;
        this.f4637t = c0531b;
        this.f4619b = lock;
        this.f4620c = context;
    }

    private void m5223a(boolean z) {
        if (this.f4622e != null) {
            if (this.f4622e.m2869h() && z) {
                this.f4622e.m4907f();
            }
            this.f4622e.m2868g();
            this.f4625h = null;
        }
    }

    private static String m5224c(int i) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    private void m5225g() {
        al alVar = this.f4618a;
        alVar.f4555a.lock();
        try {
            alVar.f4567m.m5305l();
            alVar.f4565k = new C0671l(alVar);
            alVar.f4565k.m5136a();
            alVar.f4556b.signalAll();
            ao.m5168a().execute(new C0675p(this));
            if (this.f4622e != null) {
                if (this.f4626i) {
                    this.f4622e.m4905a(this.f4625h, this.f4627j);
                }
                m5223a(false);
            }
            for (C0655d c0655d : this.f4618a.f4561g.keySet()) {
                ((C0467c) this.f4618a.f4560f.get(c0655d)).m2868g();
            }
            this.f4618a.f4568n.m5170a(this.f4633p.isEmpty() ? null : this.f4633p);
        } finally {
            alVar.f4555a.unlock();
        }
    }

    private void m5226h() {
        Iterator it = this.f4638u.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        this.f4638u.clear();
    }

    public final C0586c m5227a(C0586c c0586c) {
        this.f4618a.f4567m.f4656a.add(c0586c);
        return c0586c;
    }

    public final void m5228a() {
        this.f4618a.f4561g.clear();
        this.f4623f = false;
        this.f4629l = null;
        this.f4631n = 0;
        this.f4635r = 2;
        this.f4624g = false;
        this.f4626i = false;
        Map hashMap = new HashMap();
        for (C0654a c0654a : this.f4636s.keySet()) {
            C0467c c0467c = (C0467c) this.f4618a.f4560f.get(c0654a.m5074b());
            int intValue = ((Integer) this.f4636s.get(c0654a)).intValue();
            c0654a.m5073a();
            if (c0467c.m2870i()) {
                this.f4623f = true;
                if (intValue < this.f4635r) {
                    this.f4635r = intValue;
                }
                if (intValue != 0) {
                    this.f4634q.add(c0654a.m5074b());
                }
            }
            hashMap.put(c0467c, new C0677q(this, c0654a, intValue));
        }
        if (this.f4623f) {
            this.f4628k.f4847h = Integer.valueOf(this.f4618a.f4567m.m5308o());
            C0464l c0687w = new C0687w();
            this.f4622e = (ye) this.f4637t.m3133a(this.f4620c, this.f4618a.f4567m.m5297c(), this.f4628k, this.f4628k.f4846g, c0687w, c0687w);
        }
        this.f4632o = this.f4618a.f4560f.size();
        this.f4638u.add(ao.m5168a().submit(new C0679r(this, hashMap)));
    }

    public final void m5229a(int i) {
        m5234b(new ConnectionResult(8, null));
    }

    public final void m5230a(Bundle bundle) {
        if (m5237b(1)) {
            if (bundle != null) {
                this.f4633p.putAll(bundle);
            }
            if (m5239d()) {
                m5225g();
            }
        }
    }

    public final void m5231a(ConnectionResult connectionResult, C0654a c0654a, int i) {
        if (m5237b(1)) {
            m5235b(connectionResult, c0654a, i);
            if (m5239d()) {
                m5225g();
            }
        }
    }

    final boolean m5232a(ConnectionResult connectionResult) {
        return this.f4635r != 2 ? this.f4635r == 1 && !connectionResult.m5056a() : true;
    }

    public final C0586c m5233b(C0586c c0586c) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    final void m5234b(ConnectionResult connectionResult) {
        m5226h();
        m5223a(!connectionResult.m5056a());
        this.f4618a.m5156a(connectionResult);
        this.f4618a.f4568n.m5171a(connectionResult);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m5235b(com.google.android.gms.common.ConnectionResult r6, com.google.android.gms.common.api.C0654a r7, int r8) {
        /*
        r5 = this;
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1 = 0;
        r0 = 1;
        r2 = 2;
        if (r8 == r2) goto L_0x0024;
    L_0x0008:
        r7.m5073a();
        if (r8 != r0) goto L_0x0016;
    L_0x000d:
        r2 = r6.m5056a();
        if (r2 == 0) goto L_0x0030;
    L_0x0013:
        r2 = r0;
    L_0x0014:
        if (r2 == 0) goto L_0x0040;
    L_0x0016:
        r2 = r5.f4629l;
        if (r2 == 0) goto L_0x001e;
    L_0x001a:
        r2 = r5.f4630m;
        if (r4 >= r2) goto L_0x0040;
    L_0x001e:
        if (r0 == 0) goto L_0x0024;
    L_0x0020:
        r5.f4629l = r6;
        r5.f4630m = r4;
    L_0x0024:
        r0 = r5.f4618a;
        r0 = r0.f4561g;
        r1 = r7.m5074b();
        r0.put(r1, r6);
        return;
    L_0x0030:
        r2 = r5.f4621d;
        r3 = r6.m5058c();
        r2 = r2.m5326b(r3);
        if (r2 == 0) goto L_0x003e;
    L_0x003c:
        r2 = r0;
        goto L_0x0014;
    L_0x003e:
        r2 = r1;
        goto L_0x0014;
    L_0x0040:
        r0 = r1;
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.o.b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, int):void");
    }

    public final boolean m5236b() {
        m5226h();
        m5223a(true);
        this.f4618a.m5156a(null);
        return true;
    }

    final boolean m5237b(int i) {
        if (this.f4631n == i) {
            return true;
        }
        this.f4618a.f4567m.m5307n();
        Log.wtf("GoogleApiClientConnecting", "GoogleApiClient connecting is in step " + C0674o.m5224c(this.f4631n) + " but received callback for step " + C0674o.m5224c(i), new Exception());
        m5234b(new ConnectionResult(8, null));
        return false;
    }

    public final void m5238c() {
    }

    final boolean m5239d() {
        this.f4632o--;
        if (this.f4632o > 0) {
            return false;
        }
        if (this.f4632o < 0) {
            this.f4618a.f4567m.m5307n();
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m5234b(new ConnectionResult(8, null));
            return false;
        } else if (this.f4629l == null) {
            return true;
        } else {
            this.f4618a.f4566l = this.f4630m;
            m5234b(this.f4629l);
            return false;
        }
    }

    final void m5240e() {
        if (this.f4632o == 0) {
            if (!this.f4623f || this.f4624g) {
                ArrayList arrayList = new ArrayList();
                this.f4631n = 1;
                this.f4632o = this.f4618a.f4560f.size();
                for (C0655d c0655d : this.f4618a.f4560f.keySet()) {
                    if (!this.f4618a.f4561g.containsKey(c0655d)) {
                        arrayList.add(this.f4618a.f4560f.get(c0655d));
                    } else if (m5239d()) {
                        m5225g();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f4638u.add(ao.m5168a().submit(new C0681t(this, arrayList)));
                }
            }
        }
    }

    final void m5241f() {
        this.f4623f = false;
        this.f4618a.f4567m.f4659d = Collections.emptySet();
        for (C0655d c0655d : this.f4634q) {
            if (!this.f4618a.f4561g.containsKey(c0655d)) {
                this.f4618a.f4561g.put(c0655d, new ConnectionResult(17, null));
            }
        }
    }
}
