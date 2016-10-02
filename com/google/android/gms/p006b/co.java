package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.co */
final class co implements Runnable {
    final /* synthetic */ cn f3103a;

    co(cn cnVar) {
        this.f3103a = cnVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r6 = this;
        r3 = r6.f3103a;
    L_0x0002:
        r0 = r3.f3094a;	 Catch:{ InterruptedException -> 0x004c }
        r0 = r0.take();	 Catch:{ InterruptedException -> 0x004c }
        r0 = (com.google.android.gms.p006b.cz) r0;	 Catch:{ InterruptedException -> 0x004c }
        r2 = r0.m3605c();	 Catch:{ InterruptedException -> 0x004c }
        r1 = android.text.TextUtils.isEmpty(r2);
        if (r1 != 0) goto L_0x0002;
    L_0x0014:
        r1 = r3.f3096c;
        r0 = r0.m3606d();
        r0 = r3.m3586a(r1, r0);
        r1 = r3.f3098e;
        r1 = android.net.Uri.parse(r1);
        r4 = r1.buildUpon();
        r0 = r0.entrySet();
        r5 = r0.iterator();
    L_0x0030:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0053;
    L_0x0036:
        r0 = r5.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (java.lang.String) r1;
        r0 = r0.getValue();
        r0 = (java.lang.String) r0;
        r4.appendQueryParameter(r1, r0);
        goto L_0x0030;
    L_0x004c:
        r0 = move-exception;
        r1 = "CsiReporter:reporter interrupted";
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r1, r0);
        return;
    L_0x0053:
        r0 = new java.lang.StringBuilder;
        r1 = r4.build();
        r1 = r1.toString();
        r0.<init>(r1);
        r1 = "&it=";
        r1 = r0.append(r1);
        r1.append(r2);
        r0 = r0.toString();
        r1 = r3.f3101h;
        r1 = r1.get();
        if (r1 == 0) goto L_0x00c5;
    L_0x0075:
        r4 = r3.f3102i;
        if (r4 == 0) goto L_0x00be;
    L_0x0079:
        r2 = 0;
        r1 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0099, all -> 0x00af }
        r5 = 1;
        r1.<init>(r4, r5);	 Catch:{ IOException -> 0x0099, all -> 0x00af }
        r0 = r0.getBytes();	 Catch:{ IOException -> 0x00d3 }
        r1.write(r0);	 Catch:{ IOException -> 0x00d3 }
        r0 = 10;
        r1.write(r0);	 Catch:{ IOException -> 0x00d3 }
        r1.close();	 Catch:{ IOException -> 0x0091 }
        goto L_0x0002;
    L_0x0091:
        r0 = move-exception;
        r1 = "CsiReporter: Cannot close file: sdk_csi_data.txt.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r1, r0);
        goto L_0x0002;
    L_0x0099:
        r0 = move-exception;
        r1 = r2;
    L_0x009b:
        r2 = "CsiReporter: Cannot write to file: sdk_csi_data.txt.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r2, r0);	 Catch:{ all -> 0x00d1 }
        if (r1 == 0) goto L_0x0002;
    L_0x00a2:
        r1.close();	 Catch:{ IOException -> 0x00a7 }
        goto L_0x0002;
    L_0x00a7:
        r0 = move-exception;
        r1 = "CsiReporter: Cannot close file: sdk_csi_data.txt.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r1, r0);
        goto L_0x0002;
    L_0x00af:
        r0 = move-exception;
        r1 = r2;
    L_0x00b1:
        if (r1 == 0) goto L_0x00b6;
    L_0x00b3:
        r1.close();	 Catch:{ IOException -> 0x00b7 }
    L_0x00b6:
        throw r0;
    L_0x00b7:
        r1 = move-exception;
        r2 = "CsiReporter: Cannot close file: sdk_csi_data.txt.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r2, r1);
        goto L_0x00b6;
    L_0x00be:
        r0 = "CsiReporter: File doesn't exists. Cannot write CSI data to file.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r0);
        goto L_0x0002;
    L_0x00c5:
        com.google.android.gms.ads.internal.ar.m2240e();
        r1 = r3.f3099f;
        r2 = r3.f3100g;
        com.google.android.gms.p006b.rd.m4415a(r1, r2, r0);
        goto L_0x0002;
    L_0x00d1:
        r0 = move-exception;
        goto L_0x00b1;
    L_0x00d3:
        r0 = move-exception;
        goto L_0x009b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.co.run():void");
    }
}
