package com.google.tagmanager;

import com.google.analytics.p009a.p011b.C0284j;

/* renamed from: com.google.tagmanager.d */
public final class C0803d {
    volatile String f5140a;
    private final be f5141b;
    private C0284j f5142c;
    private C0804e f5143d;
    private aw f5144e;
    private C0802c f5145f;
    private volatile long f5146g;
    private volatile int f5147h;

    private synchronized void m5879c() {
        if (!(this.f5143d == null || m5880d())) {
            C0804e c0804e = this.f5143d;
            String str = this.f5142c.f1477d;
        }
    }

    private boolean m5880d() {
        return this.f5141b.m5863a() == bj.DEFAULT_CONTAINER;
    }

    public final synchronized void m5881a() {
        Object obj = 1;
        synchronized (this) {
            if (m5883b() == null) {
                C0824z.m5937a("refresh called for closed container");
            } else {
                try {
                    if (m5880d()) {
                        C0824z.m5937a("Container is in DEFAULT_CONTAINER mode. Refresh request is ignored.");
                    } else {
                        long a = this.f5145f.m5878a();
                        if (this.f5146g == 0) {
                            this.f5147h--;
                        } else {
                            long j = a - this.f5146g;
                            if (j >= 5000) {
                                if (this.f5147h < 30) {
                                    this.f5147h = Math.min(30, ((int) Math.floor((double) (j / 900000))) + this.f5147h);
                                }
                                if (this.f5147h > 0) {
                                    this.f5147h--;
                                }
                            }
                            obj = null;
                        }
                        if (obj != null) {
                            C0824z.m5940d();
                            m5879c();
                            this.f5146g = a;
                        } else {
                            C0824z.m5940d();
                        }
                    }
                } catch (Exception e) {
                    "Calling refresh() throws an exception: " + e.getMessage();
                    C0824z.m5936a();
                }
            }
        }
    }

    final synchronized void m5882a(String str) {
        this.f5140a = str;
        if (this.f5143d != null) {
            C0804e c0804e = this.f5143d;
        }
    }

    final synchronized aw m5883b() {
        return this.f5144e;
    }
}
