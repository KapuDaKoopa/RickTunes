package com.google.tagmanager;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class be {
    private static be f5117f;
    private final bi f5118a;
    private final Context f5119b;
    private final C0805f f5120c;
    private volatile bj f5121d;
    private final ConcurrentMap f5122e;

    private be(Context context, bi biVar, C0805f c0805f) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.f5119b = context.getApplicationContext();
        this.f5118a = biVar;
        this.f5121d = bj.STANDARD;
        this.f5122e = new ConcurrentHashMap();
        this.f5120c = c0805f;
        this.f5120c.m5893a(new bf(this));
        this.f5120c.m5893a(new C0800a(this.f5119b));
    }

    public static be m5861a(Context context) {
        be beVar;
        synchronized (be.class) {
            if (f5117f == null) {
                if (context == null) {
                    C0824z.m5936a();
                    throw new NullPointerException();
                }
                f5117f = new be(context, new bg(), new C0805f(new C0812n(context)));
            }
            beVar = f5117f;
        }
        return beVar;
    }

    static /* synthetic */ void m5862a(be beVar, String str) {
        for (C0803d b : beVar.f5122e.values()) {
            b.m5883b().m5855a(str);
        }
    }

    public final bj m5863a() {
        return this.f5121d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final synchronized boolean m5864a(android.net.Uri r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r2 = com.google.tagmanager.am.m5839a();	 Catch:{ all -> 0x0033 }
        r0 = r2.m5841a(r6);	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0075;
    L_0x000b:
        r3 = r2.m5844d();	 Catch:{ all -> 0x0033 }
        r0 = com.google.tagmanager.bh.f5124a;	 Catch:{ all -> 0x0033 }
        r1 = r2.m5842b();	 Catch:{ all -> 0x0033 }
        r1 = r1.ordinal();	 Catch:{ all -> 0x0033 }
        r0 = r0[r1];	 Catch:{ all -> 0x0033 }
        switch(r0) {
            case 1: goto L_0x0021;
            case 2: goto L_0x0036;
            case 3: goto L_0x0036;
            default: goto L_0x001e;
        };
    L_0x001e:
        r0 = 1;
    L_0x001f:
        monitor-exit(r5);
        return r0;
    L_0x0021:
        r0 = r5.f5122e;	 Catch:{ all -> 0x0033 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0033 }
        r0 = (com.google.tagmanager.C0803d) r0;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x001e;
    L_0x002b:
        r1 = 0;
        r0.m5882a(r1);	 Catch:{ all -> 0x0033 }
        r0.m5881a();	 Catch:{ all -> 0x0033 }
        goto L_0x001e;
    L_0x0033:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
    L_0x0036:
        r0 = r5.f5122e;	 Catch:{ all -> 0x0033 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0033 }
        r4 = r0.iterator();	 Catch:{ all -> 0x0033 }
    L_0x0040:
        r0 = r4.hasNext();	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x001e;
    L_0x0046:
        r0 = r4.next();	 Catch:{ all -> 0x0033 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0033 }
        r1 = r0.getValue();	 Catch:{ all -> 0x0033 }
        r1 = (com.google.tagmanager.C0803d) r1;	 Catch:{ all -> 0x0033 }
        r0 = r0.getKey();	 Catch:{ all -> 0x0033 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0033 }
        r0 = r0.equals(r3);	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0069;
    L_0x005e:
        r0 = r2.m5843c();	 Catch:{ all -> 0x0033 }
        r1.m5882a(r0);	 Catch:{ all -> 0x0033 }
        r1.m5881a();	 Catch:{ all -> 0x0033 }
        goto L_0x0040;
    L_0x0069:
        r0 = r1.f5140a;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0040;
    L_0x006d:
        r0 = 0;
        r1.m5882a(r0);	 Catch:{ all -> 0x0033 }
        r1.m5881a();	 Catch:{ all -> 0x0033 }
        goto L_0x0040;
    L_0x0075:
        r0 = 0;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.tagmanager.be.a(android.net.Uri):boolean");
    }
}
