package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.C0496t;
import com.google.android.gms.p006b.C0640x;
import com.google.android.gms.p006b.ck;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.qx;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@op
/* renamed from: com.google.android.gms.ads.internal.s */
final class C0497s implements C0496t, Runnable {
    CountDownLatch f2517a;
    private final List f2518b;
    private final AtomicReference f2519c;
    private as f2520d;

    public C0497s(as asVar) {
        this.f2518b = new Vector();
        this.f2519c = new AtomicReference();
        this.f2517a = new CountDownLatch(1);
        this.f2520d = asVar;
        C0374z.m2455a();
        if (C0500a.m3020b()) {
            qx.m4394a((Runnable) this);
        } else {
            run();
        }
    }

    private boolean m2987a() {
        try {
            this.f2517a.await();
            return true;
        } catch (Throwable e) {
            C0501b.m3026a("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    private static Context m2988b(Context context) {
        if (!((Boolean) ar.m2249n().m3580a(ck.f3074m)).booleanValue()) {
            return context;
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    private void m2989b() {
        if (!this.f2518b.isEmpty()) {
            for (Object[] objArr : this.f2518b) {
                if (objArr.length == 1) {
                    ((C0496t) this.f2519c.get()).m2986a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((C0496t) this.f2519c.get()).m2985a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f2518b.clear();
        }
    }

    public final String m2990a(Context context) {
        if (m2987a()) {
            C0496t c0496t = (C0496t) this.f2519c.get();
            if (c0496t != null) {
                m2989b();
                return c0496t.m2983a(C0497s.m2988b(context));
            }
        }
        return "";
    }

    public final String m2991a(Context context, String str) {
        if (m2987a()) {
            C0496t c0496t = (C0496t) this.f2519c.get();
            if (c0496t != null) {
                m2989b();
                return c0496t.m2984a(C0497s.m2988b(context), str);
            }
        }
        return "";
    }

    public final void m2992a(int i, int i2, int i3) {
        C0496t c0496t = (C0496t) this.f2519c.get();
        if (c0496t != null) {
            m2989b();
            c0496t.m2985a(i, i2, i3);
            return;
        }
        this.f2518b.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public final void m2993a(MotionEvent motionEvent) {
        C0496t c0496t = (C0496t) this.f2519c.get();
        if (c0496t != null) {
            m2989b();
            c0496t.m2986a(motionEvent);
            return;
        }
        this.f2518b.add(new Object[]{motionEvent});
    }

    public final void run() {
        try {
            boolean z = !((Boolean) ar.m2249n().m3580a(ck.f3086y)).booleanValue() || this.f2520d.f1860e.f2542e;
            this.f2519c.set(C0640x.m4872a(this.f2520d.f1860e.f2539b, C0497s.m2988b(this.f2520d.f1858c), z));
        } finally {
            this.f2517a.countDown();
            this.f2520d = null;
        }
    }
}
