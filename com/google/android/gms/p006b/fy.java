package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.fy */
public final class fy extends qi {
    private final String f3256a;
    private final String f3257b;
    private final int f3258c;
    private final String f3259d;
    private final tf f3260e;

    public fy(tf tfVar, String str) {
        this.f3256a = "play.google.com";
        this.f3257b = "market";
        this.f3258c = 10;
        this.f3260e = tfVar;
        this.f3259d = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m3733a() {
        /*
        r8 = this;
        r0 = 0;
        r2 = r8.f3259d;
    L_0x0003:
        r1 = 10;
        if (r0 >= r1) goto L_0x011c;
    L_0x0007:
        r4 = r0 + 1;
        r0 = new java.net.URL;	 Catch:{ IndexOutOfBoundsException -> 0x00c5, IOException -> 0x00dc, RuntimeException -> 0x00f3 }
        r0.<init>(r2);	 Catch:{ IndexOutOfBoundsException -> 0x00c5, IOException -> 0x00dc, RuntimeException -> 0x00f3 }
        r1 = "play.google.com";
        r3 = r0.getHost();	 Catch:{ IndexOutOfBoundsException -> 0x00c5, IOException -> 0x00dc, RuntimeException -> 0x00f3 }
        r1 = r1.equalsIgnoreCase(r3);	 Catch:{ IndexOutOfBoundsException -> 0x00c5, IOException -> 0x00dc, RuntimeException -> 0x00f3 }
        if (r1 == 0) goto L_0x003b;
    L_0x001a:
        r0 = r2;
    L_0x001b:
        r0 = android.net.Uri.parse(r0);
        r1 = new android.content.Intent;
        r2 = "android.intent.action.VIEW";
        r1.<init>(r2);
        r2 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r1.addFlags(r2);
        r1.setData(r0);
        com.google.android.gms.ads.internal.ar.m2240e();
        r0 = r8.f3260e;
        r0 = r0.getContext();
        com.google.android.gms.p006b.rd.m4414a(r0, r1);
        return;
    L_0x003b:
        r1 = "market";
        r3 = r0.getProtocol();	 Catch:{ IndexOutOfBoundsException -> 0x00c5, IOException -> 0x00dc, RuntimeException -> 0x00f3 }
        r1 = r1.equalsIgnoreCase(r3);	 Catch:{ IndexOutOfBoundsException -> 0x00c5, IOException -> 0x00dc, RuntimeException -> 0x00f3 }
        if (r1 == 0) goto L_0x0049;
    L_0x0047:
        r0 = r2;
        goto L_0x001b;
    L_0x0049:
        r0 = r0.openConnection();	 Catch:{ IndexOutOfBoundsException -> 0x00c5, IOException -> 0x00dc, RuntimeException -> 0x00f3 }
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ IndexOutOfBoundsException -> 0x00c5, IOException -> 0x00dc, RuntimeException -> 0x00f3 }
        r1 = com.google.android.gms.ads.internal.ar.m2240e();	 Catch:{ all -> 0x00c0 }
        r3 = r8.f3260e;	 Catch:{ all -> 0x00c0 }
        r3 = r3.getContext();	 Catch:{ all -> 0x00c0 }
        r5 = r8.f3260e;	 Catch:{ all -> 0x00c0 }
        r5 = r5.m4582o();	 Catch:{ all -> 0x00c0 }
        r5 = r5.f2539b;	 Catch:{ all -> 0x00c0 }
        r6 = 0;
        r1.m4456a(r3, r5, r6, r0);	 Catch:{ all -> 0x00c0 }
        r1 = r0.getResponseCode();	 Catch:{ all -> 0x00c0 }
        r5 = r0.getHeaderFields();	 Catch:{ all -> 0x00c0 }
        r3 = "";
        r6 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r1 < r6) goto L_0x0119;
    L_0x0073:
        r6 = 399; // 0x18f float:5.59E-43 double:1.97E-321;
        if (r1 > r6) goto L_0x0119;
    L_0x0077:
        r1 = 0;
        r6 = "Location";
        r6 = r5.containsKey(r6);	 Catch:{ all -> 0x00c0 }
        if (r6 == 0) goto L_0x00a8;
    L_0x0080:
        r1 = "Location";
        r1 = r5.get(r1);	 Catch:{ all -> 0x00c0 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x00c0 }
    L_0x0088:
        if (r1 == 0) goto L_0x0119;
    L_0x008a:
        r5 = r1.size();	 Catch:{ all -> 0x00c0 }
        if (r5 <= 0) goto L_0x0119;
    L_0x0090:
        r3 = 0;
        r1 = r1.get(r3);	 Catch:{ all -> 0x00c0 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x00c0 }
    L_0x0097:
        r3 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x00c0 }
        if (r3 == 0) goto L_0x00b9;
    L_0x009d:
        r1 = "Arrived at landing page, this ideally should not happen. Will open it in browser.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r1);	 Catch:{ all -> 0x00c0 }
        r0.disconnect();	 Catch:{ IndexOutOfBoundsException -> 0x00c5, IOException -> 0x00dc, RuntimeException -> 0x00f3 }
        r0 = r2;
        goto L_0x001b;
    L_0x00a8:
        r6 = "location";
        r6 = r5.containsKey(r6);	 Catch:{ all -> 0x00c0 }
        if (r6 == 0) goto L_0x0088;
    L_0x00b0:
        r1 = "location";
        r1 = r5.get(r1);	 Catch:{ all -> 0x00c0 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x00c0 }
        goto L_0x0088;
    L_0x00b9:
        r0.disconnect();	 Catch:{ IndexOutOfBoundsException -> 0x0114, IOException -> 0x010f, RuntimeException -> 0x010a }
        r0 = r4;
        r2 = r1;
        goto L_0x0003;
    L_0x00c0:
        r1 = move-exception;
        r0.disconnect();	 Catch:{ IndexOutOfBoundsException -> 0x00c5, IOException -> 0x00dc, RuntimeException -> 0x00f3 }
        throw r1;	 Catch:{ IndexOutOfBoundsException -> 0x00c5, IOException -> 0x00dc, RuntimeException -> 0x00f3 }
    L_0x00c5:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
    L_0x00c8:
        r2 = new java.lang.StringBuilder;
        r3 = "Error while parsing ping URL: ";
        r2.<init>(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r2, r1);
        goto L_0x001b;
    L_0x00dc:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
    L_0x00df:
        r2 = new java.lang.StringBuilder;
        r3 = "Error while pinging URL: ";
        r2.<init>(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r2, r1);
        goto L_0x001b;
    L_0x00f3:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
    L_0x00f6:
        r2 = new java.lang.StringBuilder;
        r3 = "Error while pinging URL: ";
        r2.<init>(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r2, r1);
        goto L_0x001b;
    L_0x010a:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r7;
        goto L_0x00f6;
    L_0x010f:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r7;
        goto L_0x00df;
    L_0x0114:
        r0 = move-exception;
        r7 = r0;
        r0 = r1;
        r1 = r7;
        goto L_0x00c8;
    L_0x0119:
        r1 = r3;
        goto L_0x0097;
    L_0x011c:
        r0 = r2;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.fy.a():void");
    }

    public final void m3734b() {
    }
}
