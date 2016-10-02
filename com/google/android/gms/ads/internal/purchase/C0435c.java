package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.stats.C0765b;
import com.google.android.gms.p006b.nc;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.qi;
import com.google.android.gms.p006b.qk;
import java.util.List;

@op
/* renamed from: com.google.android.gms.ads.internal.purchase.c */
public final class C0435c extends qi implements ServiceConnection {
    private final Object f2272a;
    private boolean f2273b;
    private Context f2274c;
    private nc f2275d;
    private C0434b f2276e;
    private C0441i f2277f;
    private List f2278g;
    private C0445n f2279h;

    public C0435c(Context context, nc ncVar, C0445n c0445n) {
        this(context, ncVar, c0445n, new C0434b(context), C0441i.m2791a(context.getApplicationContext()));
    }

    private C0435c(Context context, nc ncVar, C0445n c0445n, C0434b c0434b, C0441i c0441i) {
        this.f2272a = new Object();
        this.f2273b = false;
        this.f2278g = null;
        this.f2274c = context;
        this.f2275d = ncVar;
        this.f2279h = c0445n;
        this.f2276e = c0434b;
        this.f2277f = c0441i;
        this.f2278g = this.f2277f.m2795a();
    }

    private void m2758a(long j) {
        do {
            if (!m2760b(j)) {
                qk.m4383a();
            }
        } while (!this.f2273b);
    }

    private boolean m2760b(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f2272a.wait(elapsedRealtime);
        } catch (InterruptedException e) {
            C0501b.m3025a("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public final void m2762a() {
        synchronized (this.f2272a) {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            C0765b.m5734a().m5740a(this.f2274c, intent, this);
            m2758a(SystemClock.elapsedRealtime());
            C0765b.m5734a().m5738a(this.f2274c, this);
            this.f2276e.f2269a = null;
        }
    }

    public final void m2763b() {
        synchronized (this.f2272a) {
            C0765b.m5734a().m5738a(this.f2274c, this);
            this.f2276e.f2269a = null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r16, android.os.IBinder r17) {
        /*
        r15 = this;
        r7 = r15.f2272a;
        monitor-enter(r7);
        r1 = r15.f2276e;	 Catch:{ all -> 0x002f }
        r0 = r17;
        r1.m2754a(r0);	 Catch:{ all -> 0x002f }
        r1 = r15.f2278g;	 Catch:{ all -> 0x002f }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x002f }
        if (r1 != 0) goto L_0x00f2;
    L_0x0012:
        r8 = new java.util.HashMap;	 Catch:{ all -> 0x002f }
        r8.<init>();	 Catch:{ all -> 0x002f }
        r1 = r15.f2278g;	 Catch:{ all -> 0x002f }
        r2 = r1.iterator();	 Catch:{ all -> 0x002f }
    L_0x001d:
        r1 = r2.hasNext();	 Catch:{ all -> 0x002f }
        if (r1 == 0) goto L_0x0032;
    L_0x0023:
        r1 = r2.next();	 Catch:{ all -> 0x002f }
        r1 = (com.google.android.gms.ads.internal.purchase.C0439g) r1;	 Catch:{ all -> 0x002f }
        r3 = r1.f2298c;	 Catch:{ all -> 0x002f }
        r8.put(r3, r1);	 Catch:{ all -> 0x002f }
        goto L_0x001d;
    L_0x002f:
        r1 = move-exception;
        monitor-exit(r7);
        throw r1;
    L_0x0032:
        r1 = 0;
    L_0x0033:
        r2 = r15.f2276e;	 Catch:{ all -> 0x002f }
        r3 = r15.f2274c;	 Catch:{ all -> 0x002f }
        r3 = r3.getPackageName();	 Catch:{ all -> 0x002f }
        r1 = r2.m2755b(r3, r1);	 Catch:{ all -> 0x002f }
        if (r1 == 0) goto L_0x00d2;
    L_0x0041:
        com.google.android.gms.ads.internal.ar.m2250o();	 Catch:{ all -> 0x002f }
        r2 = com.google.android.gms.ads.internal.purchase.C0443k.m2799a(r1);	 Catch:{ all -> 0x002f }
        if (r2 != 0) goto L_0x00d2;
    L_0x004a:
        r2 = "INAPP_PURCHASE_ITEM_LIST";
        r9 = r1.getStringArrayList(r2);	 Catch:{ all -> 0x002f }
        r2 = "INAPP_PURCHASE_DATA_LIST";
        r10 = r1.getStringArrayList(r2);	 Catch:{ all -> 0x002f }
        r2 = "INAPP_DATA_SIGNATURE_LIST";
        r11 = r1.getStringArrayList(r2);	 Catch:{ all -> 0x002f }
        r2 = "INAPP_CONTINUATION_TOKEN";
        r5 = r1.getString(r2);	 Catch:{ all -> 0x002f }
        r1 = 0;
        r6 = r1;
    L_0x0064:
        r1 = r9.size();	 Catch:{ all -> 0x002f }
        if (r6 >= r1) goto L_0x00ca;
    L_0x006a:
        r1 = r9.get(r6);	 Catch:{ all -> 0x002f }
        r1 = r8.containsKey(r1);	 Catch:{ all -> 0x002f }
        if (r1 == 0) goto L_0x00c6;
    L_0x0074:
        r1 = r9.get(r6);	 Catch:{ all -> 0x002f }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x002f }
        r2 = r10.get(r6);	 Catch:{ all -> 0x002f }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x002f }
        r3 = r11.get(r6);	 Catch:{ all -> 0x002f }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x002f }
        r4 = r8.get(r1);	 Catch:{ all -> 0x002f }
        r4 = (com.google.android.gms.ads.internal.purchase.C0439g) r4;	 Catch:{ all -> 0x002f }
        com.google.android.gms.ads.internal.ar.m2250o();	 Catch:{ all -> 0x002f }
        r12 = com.google.android.gms.ads.internal.purchase.C0443k.m2800a(r2);	 Catch:{ all -> 0x002f }
        r13 = r4.f2297b;	 Catch:{ all -> 0x002f }
        r12 = r13.equals(r12);	 Catch:{ all -> 0x002f }
        if (r12 == 0) goto L_0x00c6;
    L_0x009b:
        r12 = new android.content.Intent;	 Catch:{ all -> 0x002f }
        r12.<init>();	 Catch:{ all -> 0x002f }
        com.google.android.gms.ads.internal.ar.m2250o();	 Catch:{ all -> 0x002f }
        r13 = "RESPONSE_CODE";
        r14 = 0;
        r12.putExtra(r13, r14);	 Catch:{ all -> 0x002f }
        com.google.android.gms.ads.internal.ar.m2250o();	 Catch:{ all -> 0x002f }
        r13 = "INAPP_PURCHASE_DATA";
        r12.putExtra(r13, r2);	 Catch:{ all -> 0x002f }
        com.google.android.gms.ads.internal.ar.m2250o();	 Catch:{ all -> 0x002f }
        r2 = "INAPP_DATA_SIGNATURE";
        r12.putExtra(r2, r3);	 Catch:{ all -> 0x002f }
        r2 = com.google.android.gms.p006b.rd.f4041a;	 Catch:{ all -> 0x002f }
        r3 = new com.google.android.gms.ads.internal.purchase.d;	 Catch:{ all -> 0x002f }
        r3.<init>(r15, r4, r12);	 Catch:{ all -> 0x002f }
        r2.post(r3);	 Catch:{ all -> 0x002f }
        r8.remove(r1);	 Catch:{ all -> 0x002f }
    L_0x00c6:
        r1 = r6 + 1;
        r6 = r1;
        goto L_0x0064;
    L_0x00ca:
        if (r5 == 0) goto L_0x00d2;
    L_0x00cc:
        r1 = r8.isEmpty();	 Catch:{ all -> 0x002f }
        if (r1 == 0) goto L_0x00fc;
    L_0x00d2:
        r1 = r8.keySet();	 Catch:{ all -> 0x002f }
        r2 = r1.iterator();	 Catch:{ all -> 0x002f }
    L_0x00da:
        r1 = r2.hasNext();	 Catch:{ all -> 0x002f }
        if (r1 == 0) goto L_0x00f2;
    L_0x00e0:
        r1 = r2.next();	 Catch:{ all -> 0x002f }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x002f }
        r3 = r15.f2277f;	 Catch:{ all -> 0x002f }
        r1 = r8.get(r1);	 Catch:{ all -> 0x002f }
        r1 = (com.google.android.gms.ads.internal.purchase.C0439g) r1;	 Catch:{ all -> 0x002f }
        r3.m2796a(r1);	 Catch:{ all -> 0x002f }
        goto L_0x00da;
    L_0x00f2:
        r1 = 1;
        r15.f2273b = r1;	 Catch:{ all -> 0x002f }
        r1 = r15.f2272a;	 Catch:{ all -> 0x002f }
        r1.notify();	 Catch:{ all -> 0x002f }
        monitor-exit(r7);	 Catch:{ all -> 0x002f }
        return;
    L_0x00fc:
        r1 = r5;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.purchase.c.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C0501b.m3027a(4);
        this.f2276e.f2269a = null;
    }
}
