package com.google.analytics.tracking.android;

import android.content.Context;
import com.google.android.gms.C0772e;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.google.analytics.tracking.android.z */
final class C0312z implements bf, C0296d, C0297e {
    volatile long f1697a;
    volatile ad f1698b;
    final Queue f1699c;
    volatile Timer f1700d;
    C0288l f1701e;
    long f1702f;
    private volatile C0287a f1703g;
    private C0290f f1704h;
    private C0290f f1705i;
    private final ap f1706j;
    private final C0289h f1707k;
    private final Context f1708l;
    private volatile int f1709m;
    private volatile Timer f1710n;
    private volatile Timer f1711o;
    private boolean f1712p;
    private boolean f1713q;
    private boolean f1714r;
    private boolean f1715s;

    C0312z(Context context, C0289h c0289h) {
        this(context, c0289h, ap.m1817a(context));
    }

    private C0312z(Context context, C0289h c0289h, ap apVar) {
        this.f1699c = new ConcurrentLinkedQueue();
        this.f1702f = 300000;
        this.f1705i = null;
        this.f1708l = context;
        this.f1707k = c0289h;
        this.f1706j = apVar;
        this.f1701e = new aa(this);
        this.f1709m = 0;
        this.f1698b = ad.DISCONNECTED;
    }

    private static Timer m1964a(Timer timer) {
        if (timer != null) {
            timer.cancel();
        }
        return null;
    }

    private void m1965k() {
        this.f1710n = C0312z.m1964a(this.f1710n);
        this.f1711o = C0312z.m1964a(this.f1711o);
        this.f1700d = C0312z.m1964a(this.f1700d);
    }

    private void m1966l() {
        this.f1704h.m1856b();
        this.f1712p = false;
    }

    private void m1967m() {
        this.f1710n = C0312z.m1964a(this.f1710n);
        this.f1710n = new Timer("Service Reconnect");
        this.f1710n.schedule(new ah(), 5000);
    }

    public final synchronized void m1968a() {
        this.f1711o = C0312z.m1964a(this.f1711o);
        this.f1709m = 0;
        as.m1831c("Connected to service");
        this.f1698b = ad.CONNECTED_SERVICE;
        if (this.f1714r) {
            m1979j();
            this.f1714r = false;
        } else {
            m1976g();
            this.f1700d = C0312z.m1964a(this.f1700d);
            this.f1700d = new Timer("disconnect check");
            this.f1700d.schedule(new ae(), this.f1702f);
        }
    }

    public final synchronized void m1969a(int i) {
        this.f1698b = ad.PENDING_CONNECTION;
        if (this.f1709m < 2) {
            as.m1832d("Service unavailable (code=" + i + "), will retry.");
            m1967m();
        } else {
            as.m1832d("Service unavailable (code=" + i + "), using local store.");
            m1977h();
        }
    }

    public final void m1970a(Map map, long j, String str, List list) {
        as.m1831c("putHit called");
        this.f1699c.add(new ag(map, j, str, list));
        m1976g();
    }

    public final synchronized void m1971b() {
        if (this.f1698b == ad.PENDING_DISCONNECT) {
            as.m1831c("Disconnected from service");
            m1965k();
            this.f1698b = ad.DISCONNECTED;
        } else {
            as.m1831c("Unexpected disconnect.");
            this.f1698b = ad.PENDING_CONNECTION;
            if (this.f1709m < 2) {
                m1967m();
            } else {
                m1977h();
            }
        }
    }

    public final void m1972c() {
        switch (ac.f1494a[this.f1698b.ordinal()]) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                m1966l();
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
            default:
                this.f1712p = true;
        }
    }

    public final void m1973d() {
        as.m1831c("clearHits called");
        this.f1699c.clear();
        switch (ac.f1494a[this.f1698b.ordinal()]) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                this.f1704h.m1854a();
                this.f1713q = false;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                this.f1703g.m1779a();
                this.f1713q = false;
            default:
                this.f1713q = true;
        }
    }

    public final synchronized void m1974e() {
        if (!this.f1715s) {
            as.m1831c("setForceLocalDispatch called.");
            this.f1715s = true;
            switch (ac.f1494a[this.f1698b.ordinal()]) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    m1979j();
                    break;
                case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                    this.f1714r = true;
                    break;
                default:
                    break;
            }
        }
    }

    public final void m1975f() {
        if (this.f1703g == null) {
            this.f1703g = new C0291b(this.f1708l, this, this);
            m1978i();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final synchronized void m1976g() {
        /*
        r8 = this;
        monitor-enter(r8);
        r2 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0068 }
        r3 = r8.f1707k;	 Catch:{ all -> 0x0068 }
        r3 = r3.m1790e();	 Catch:{ all -> 0x0068 }
        r2 = r2.equals(r3);	 Catch:{ all -> 0x0068 }
        if (r2 != 0) goto L_0x0021;
    L_0x0011:
        r2 = r8.f1707k;	 Catch:{ all -> 0x0068 }
        r2 = r2.m1789d();	 Catch:{ all -> 0x0068 }
        r3 = new com.google.analytics.tracking.android.ab;	 Catch:{ all -> 0x0068 }
        r3.<init>(r8);	 Catch:{ all -> 0x0068 }
        r2.add(r3);	 Catch:{ all -> 0x0068 }
    L_0x001f:
        monitor-exit(r8);
        return;
    L_0x0021:
        r2 = r8.f1713q;	 Catch:{ all -> 0x0068 }
        if (r2 == 0) goto L_0x0028;
    L_0x0025:
        r8.m1973d();	 Catch:{ all -> 0x0068 }
    L_0x0028:
        r2 = com.google.analytics.tracking.android.ac.f1494a;	 Catch:{ all -> 0x0068 }
        r3 = r8.f1698b;	 Catch:{ all -> 0x0068 }
        r3 = r3.ordinal();	 Catch:{ all -> 0x0068 }
        r2 = r2[r3];	 Catch:{ all -> 0x0068 }
        switch(r2) {
            case 1: goto L_0x0036;
            case 2: goto L_0x0073;
            case 3: goto L_0x0035;
            case 4: goto L_0x0035;
            case 5: goto L_0x0035;
            case 6: goto L_0x00c2;
            default: goto L_0x0035;
        };	 Catch:{ all -> 0x0068 }
    L_0x0035:
        goto L_0x001f;
    L_0x0036:
        r2 = r8.f1699c;	 Catch:{ all -> 0x0068 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0068 }
        if (r2 != 0) goto L_0x006b;
    L_0x003e:
        r2 = r8.f1699c;	 Catch:{ all -> 0x0068 }
        r2 = r2.poll();	 Catch:{ all -> 0x0068 }
        r0 = r2;
        r0 = (com.google.analytics.tracking.android.ag) r0;	 Catch:{ all -> 0x0068 }
        r7 = r0;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0068 }
        r3 = "Sending hit to store  ";
        r2.<init>(r3);	 Catch:{ all -> 0x0068 }
        r2 = r2.append(r7);	 Catch:{ all -> 0x0068 }
        r2 = r2.toString();	 Catch:{ all -> 0x0068 }
        com.google.analytics.tracking.android.as.m1831c(r2);	 Catch:{ all -> 0x0068 }
        r2 = r8.f1704h;	 Catch:{ all -> 0x0068 }
        r3 = r7.f1505a;	 Catch:{ all -> 0x0068 }
        r4 = r7.f1506b;	 Catch:{ all -> 0x0068 }
        r6 = r7.f1507c;	 Catch:{ all -> 0x0068 }
        r7 = r7.f1508d;	 Catch:{ all -> 0x0068 }
        r2.m1855a(r3, r4, r6, r7);	 Catch:{ all -> 0x0068 }
        goto L_0x0036;
    L_0x0068:
        r2 = move-exception;
        monitor-exit(r8);
        throw r2;
    L_0x006b:
        r2 = r8.f1712p;	 Catch:{ all -> 0x0068 }
        if (r2 == 0) goto L_0x001f;
    L_0x006f:
        r8.m1966l();	 Catch:{ all -> 0x0068 }
        goto L_0x001f;
    L_0x0073:
        r2 = r8.f1699c;	 Catch:{ all -> 0x0068 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0068 }
        if (r2 != 0) goto L_0x00b8;
    L_0x007b:
        r2 = r8.f1699c;	 Catch:{ all -> 0x0068 }
        r2 = r2.peek();	 Catch:{ all -> 0x0068 }
        r0 = r2;
        r0 = (com.google.analytics.tracking.android.ag) r0;	 Catch:{ all -> 0x0068 }
        r7 = r0;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0068 }
        r3 = "Sending hit to service   ";
        r2.<init>(r3);	 Catch:{ all -> 0x0068 }
        r2 = r2.append(r7);	 Catch:{ all -> 0x0068 }
        r2 = r2.toString();	 Catch:{ all -> 0x0068 }
        com.google.analytics.tracking.android.as.m1831c(r2);	 Catch:{ all -> 0x0068 }
        r2 = r8.f1706j;	 Catch:{ all -> 0x0068 }
        r2 = r2.m1823b();	 Catch:{ all -> 0x0068 }
        if (r2 != 0) goto L_0x00b2;
    L_0x009f:
        r2 = r8.f1703g;	 Catch:{ all -> 0x0068 }
        r3 = r7.f1505a;	 Catch:{ all -> 0x0068 }
        r4 = r7.f1506b;	 Catch:{ all -> 0x0068 }
        r6 = r7.f1507c;	 Catch:{ all -> 0x0068 }
        r7 = r7.f1508d;	 Catch:{ all -> 0x0068 }
        r2.m1780a(r3, r4, r6, r7);	 Catch:{ all -> 0x0068 }
    L_0x00ac:
        r2 = r8.f1699c;	 Catch:{ all -> 0x0068 }
        r2.poll();	 Catch:{ all -> 0x0068 }
        goto L_0x0073;
    L_0x00b2:
        r2 = "Dry run enabled. Hit not actually sent to service.";
        com.google.analytics.tracking.android.as.m1831c(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x00ac;
    L_0x00b8:
        r2 = r8.f1701e;	 Catch:{ all -> 0x0068 }
        r2 = r2.m1783a();	 Catch:{ all -> 0x0068 }
        r8.f1697a = r2;	 Catch:{ all -> 0x0068 }
        goto L_0x001f;
    L_0x00c2:
        r2 = "Need to reconnect";
        com.google.analytics.tracking.android.as.m1831c(r2);	 Catch:{ all -> 0x0068 }
        r2 = r8.f1699c;	 Catch:{ all -> 0x0068 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0068 }
        if (r2 != 0) goto L_0x001f;
    L_0x00cf:
        r8.m1978i();	 Catch:{ all -> 0x0068 }
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.tracking.android.z.g():void");
    }

    final synchronized void m1977h() {
        if (this.f1698b != ad.CONNECTED_LOCAL) {
            m1965k();
            as.m1831c("falling back to local store");
            if (this.f1705i != null) {
                this.f1704h = this.f1705i;
            } else {
                C0309w a = C0309w.m1950a();
                a.m1957a(this.f1708l, this.f1707k);
                this.f1704h = a.m1960b();
            }
            this.f1698b = ad.CONNECTED_LOCAL;
            m1976g();
        }
    }

    final synchronized void m1978i() {
        if (this.f1715s || this.f1703g == null || this.f1698b == ad.CONNECTED_LOCAL) {
            as.m1832d("client not initialized.");
            m1977h();
        } else {
            try {
                this.f1709m++;
                C0312z.m1964a(this.f1711o);
                this.f1698b = ad.CONNECTING;
                this.f1711o = new Timer("Failed Connect");
                this.f1711o.schedule(new af(), 3000);
                as.m1831c("connecting to Analytics service");
                this.f1703g.m1781b();
            } catch (SecurityException e) {
                as.m1832d("security exception on connectToService");
                m1977h();
            }
        }
    }

    final synchronized void m1979j() {
        if (this.f1703g != null && this.f1698b == ad.CONNECTED_SERVICE) {
            this.f1698b = ad.PENDING_DISCONNECT;
            this.f1703g.m1782c();
        }
    }
}
