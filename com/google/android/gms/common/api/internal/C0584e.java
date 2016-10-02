package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.C0583o;
import com.google.android.gms.common.api.C0638p;
import com.google.android.gms.common.api.C0653q;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.api.C0662r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ah;
import com.google.android.gms.common.internal.ax;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.api.internal.e */
public abstract class C0584e extends C0583o {
    private final WeakReference f2821a;
    private final CountDownLatch f2822b;
    private C0662r f2823c;
    public final Object f2824d;
    protected final C0665f f2825e;
    public final ArrayList f2826f;
    public volatile C0653q f2827g;
    public volatile boolean f2828h;
    private boolean f2829i;
    private boolean f2830j;
    private boolean f2831k;
    private ah f2832l;
    private Integer f2833m;
    private volatile az f2834n;

    protected C0584e(C0660i c0660i) {
        this.f2824d = new Object();
        this.f2822b = new CountDownLatch(1);
        this.f2826f = new ArrayList();
        this.f2825e = new C0665f(c0660i != null ? c0660i.m5094c() : Looper.getMainLooper());
        this.f2821a = new WeakReference(c0660i);
    }

    private void m3337b(C0653q c0653q) {
        this.f2827g = c0653q;
        this.f2832l = null;
        this.f2822b.countDown();
        this.f2827g.m5066a();
        if (this.f2823c != null) {
            this.f2825e.m5182a();
            if (!this.f2829i) {
                this.f2825e.m5183a(this.f2823c, m3339c());
            }
        }
        Iterator it = this.f2826f.iterator();
        while (it.hasNext()) {
            ((C0638p) it.next()).m4824a();
        }
        this.f2826f.clear();
    }

    private boolean m3338b() {
        boolean z;
        synchronized (this.f2824d) {
            z = this.f2829i;
        }
        return z;
    }

    private C0653q m3339c() {
        C0653q c0653q;
        boolean z = true;
        synchronized (this.f2824d) {
            if (this.f2828h) {
                z = false;
            }
            ax.m5532a(z, (Object) "Result has already been consumed.");
            ax.m5532a(m3347e(), (Object) "Result is not ready.");
            c0653q = this.f2827g;
            this.f2827g = null;
            this.f2823c = null;
            this.f2828h = true;
        }
        m3346d();
        return c0653q;
    }

    protected abstract C0653q m3340a(Status status);

    public final Integer m3341a() {
        return this.f2833m;
    }

    public final void m3342a(C0638p c0638p) {
        boolean z = true;
        ax.m5532a(!this.f2828h, (Object) "Result has already been consumed.");
        if (c0638p == null) {
            z = false;
        }
        ax.m5536b(z, "Callback cannot be null.");
        synchronized (this.f2824d) {
            if (m3347e()) {
                this.f2827g.m5066a();
                c0638p.m4824a();
            } else {
                this.f2826f.add(c0638p);
            }
        }
    }

    public final void m3343a(C0653q c0653q) {
        boolean z = true;
        synchronized (this.f2824d) {
            if (this.f2830j || this.f2829i) {
                return;
            }
            ax.m5532a(!m3347e(), (Object) "Results have already been set");
            if (this.f2828h) {
                z = false;
            }
            ax.m5532a(z, (Object) "Result has already been consumed");
            m3337b(c0653q);
        }
    }

    public final void m3344a(C0662r c0662r) {
        boolean z = true;
        ax.m5532a(!this.f2828h, (Object) "Result has already been consumed.");
        synchronized (this.f2824d) {
            if (this.f2834n != null) {
                z = false;
            }
            ax.m5532a(z, (Object) "Cannot set callbacks if then() has been called.");
            if (m3338b()) {
            } else if (!this.f2831k || (((C0660i) this.f2821a.get()) != null && (c0662r instanceof az))) {
                if (m3347e()) {
                    this.f2825e.m5183a(c0662r, m3339c());
                } else {
                    this.f2823c = c0662r;
                }
            } else {
                m3348f();
            }
        }
    }

    public final void m3345c(Status status) {
        synchronized (this.f2824d) {
            if (!m3347e()) {
                m3343a(m3340a(status));
                this.f2830j = true;
            }
        }
    }

    protected void m3346d() {
    }

    public final boolean m3347e() {
        return this.f2822b.getCount() == 0;
    }

    public final void m3348f() {
        synchronized (this.f2824d) {
            if (this.f2829i || this.f2828h) {
                return;
            }
            if (this.f2832l != null) {
                try {
                    this.f2832l.m5418a();
                } catch (RemoteException e) {
                }
            }
            C0653q c0653q = this.f2827g;
            this.f2823c = null;
            this.f2829i = true;
            m3337b(m3340a(Status.f4518e));
        }
    }

    public final void m3349g() {
        synchronized (this.f2824d) {
            if (((C0660i) this.f2821a.get()) == null) {
                m3348f();
                return;
            }
            if (this.f2823c == null || (this.f2823c instanceof az)) {
                this.f2831k = true;
            } else {
                m3348f();
            }
        }
    }
}
