package com.google.analytics.tracking.android;

import android.content.Context;
import android.os.Handler;

/* renamed from: com.google.analytics.tracking.android.w */
public final class C0309w extends be {
    private static final Object f1680a;
    private static C0309w f1681o;
    private Context f1682b;
    private C0290f f1683c;
    private volatile C0289h f1684d;
    private int f1685e;
    private boolean f1686f;
    private boolean f1687g;
    private String f1688h;
    private boolean f1689i;
    private boolean f1690j;
    private C0298g f1691k;
    private Handler f1692l;
    private C0308v f1693m;
    private boolean f1694n;

    static {
        f1680a = new Object();
    }

    private C0309w() {
        this.f1685e = 1800;
        this.f1686f = true;
        this.f1689i = true;
        this.f1690j = true;
        this.f1691k = new C0310x(this);
        this.f1694n = false;
    }

    public static C0309w m1950a() {
        if (f1681o == null) {
            f1681o = new C0309w();
        }
        return f1681o;
    }

    @Deprecated
    public final synchronized void m1956a(int i) {
        if (this.f1692l == null) {
            as.m1831c("Dispatch period set with null handler. Dispatch will run once initialization is complete.");
            this.f1685e = i;
        } else {
            an.m1810a().m1811a(ao.SET_DISPATCH_PERIOD);
            if (!this.f1694n && this.f1689i && this.f1685e > 0) {
                this.f1692l.removeMessages(1, f1680a);
            }
            this.f1685e = i;
            if (i > 0 && !this.f1694n && this.f1689i) {
                this.f1692l.sendMessageDelayed(this.f1692l.obtainMessage(1, f1680a), (long) (i * 1000));
            }
        }
    }

    final synchronized void m1957a(Context context, C0289h c0289h) {
        if (this.f1682b == null) {
            this.f1682b = context.getApplicationContext();
            if (this.f1684d == null) {
                this.f1684d = c0289h;
                if (this.f1686f) {
                    m1961c();
                    this.f1686f = false;
                }
                if (this.f1687g) {
                    if (this.f1684d == null) {
                        as.m1831c("setForceLocalDispatch() queued. It will be called once initialization is complete.");
                        this.f1687g = true;
                    } else {
                        an.m1810a().m1811a(ao.SET_FORCE_LOCAL_DISPATCH);
                        this.f1684d.m1788c();
                    }
                    this.f1687g = false;
                }
            }
        }
    }

    final synchronized void m1958a(boolean z) {
        m1959a(this.f1694n, z);
    }

    final synchronized void m1959a(boolean z, boolean z2) {
        if (!(this.f1694n == z && this.f1689i == z2)) {
            if (z || !z2) {
                if (this.f1685e > 0) {
                    this.f1692l.removeMessages(1, f1680a);
                }
            }
            if (!z && z2 && this.f1685e > 0) {
                this.f1692l.sendMessageDelayed(this.f1692l.obtainMessage(1, f1680a), (long) (this.f1685e * 1000));
            }
            StringBuilder stringBuilder = new StringBuilder("PowerSaveMode ");
            String str = (z || !z2) ? "initiated." : "terminated.";
            as.m1831c(stringBuilder.append(str).toString());
            this.f1694n = z;
            this.f1689i = z2;
        }
    }

    final synchronized C0290f m1960b() {
        if (this.f1683c == null) {
            if (this.f1682b == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.f1683c = new ay(this.f1691k, this.f1682b);
            if (this.f1688h != null) {
                this.f1683c.m1857c().m1897a(this.f1688h);
                this.f1688h = null;
            }
        }
        if (this.f1692l == null) {
            this.f1692l = new Handler(this.f1682b.getMainLooper(), new C0311y(this));
            if (this.f1685e > 0) {
                this.f1692l.sendMessageDelayed(this.f1692l.obtainMessage(1, f1680a), (long) (this.f1685e * 1000));
            }
        }
        if (this.f1693m == null && this.f1690j) {
            this.f1693m = new C0308v(this);
            this.f1693m.m1949a(this.f1682b);
        }
        return this.f1683c;
    }

    @Deprecated
    public final synchronized void m1961c() {
        if (this.f1684d == null) {
            as.m1831c("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f1686f = true;
        } else {
            an.m1810a().m1811a(ao.DISPATCH);
            this.f1684d.m1785a();
        }
    }

    final synchronized void m1962d() {
        if (!this.f1694n && this.f1689i && this.f1685e > 0) {
            this.f1692l.removeMessages(1, f1680a);
            this.f1692l.sendMessage(this.f1692l.obtainMessage(1, f1680a));
        }
    }
}
