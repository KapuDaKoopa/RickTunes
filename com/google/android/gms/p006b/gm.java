package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@op
/* renamed from: com.google.android.gms.b.gm */
public final class gm extends gg {
    private static final Set f3287d;
    private static final DecimalFormat f3288e;
    private File f3289f;
    private boolean f3290g;

    static {
        f3287d = Collections.synchronizedSet(new HashSet());
        f3288e = new DecimalFormat("#,###");
    }

    public gm(tf tfVar) {
        super(tfVar);
        File cacheDir = this.a.getCacheDir();
        if (cacheDir == null) {
            C0501b.m3025a("Context.getCacheDir() returned null");
            return;
        }
        this.f3289f = new File(cacheDir, "admobVideoStreams");
        if (!this.f3289f.isDirectory() && !this.f3289f.mkdirs()) {
            C0501b.m3025a("Could not create preload cache directory at " + this.f3289f.getAbsolutePath());
            this.f3289f = null;
        } else if (!this.f3289f.setReadable(true, false) || !this.f3289f.setExecutable(true, false)) {
            C0501b.m3025a("Could not set cache file permissions at " + this.f3289f.getAbsolutePath());
            this.f3289f = null;
        }
    }

    private File m3757a(File file) {
        return new File(this.f3289f, file.getName() + ".done");
    }

    public final void m3758a() {
        this.f3290g = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m3759a(java.lang.String r27) {
        /*
        r26 = this;
        r0 = r26;
        r2 = r0.f3289f;
        if (r2 != 0) goto L_0x0013;
    L_0x0006:
        r2 = 0;
        r3 = "noCacheDir";
        r4 = 0;
        r0 = r26;
        r1 = r27;
        r0.m3754a(r1, r2, r3, r4);
        r2 = 0;
    L_0x0012:
        return r2;
    L_0x0013:
        r0 = r26;
        r2 = r0.f3289f;
        if (r2 != 0) goto L_0x0048;
    L_0x0019:
        r2 = 0;
        r3 = r2;
    L_0x001b:
        r2 = com.google.android.gms.p006b.ck.f3076o;
        r4 = com.google.android.gms.ads.internal.ar.m2249n();
        r2 = r4.m3580a(r2);
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        if (r3 <= r2) goto L_0x00b9;
    L_0x002d:
        r0 = r26;
        r2 = r0.f3289f;
        if (r2 != 0) goto L_0x006f;
    L_0x0033:
        r2 = 0;
    L_0x0034:
        if (r2 != 0) goto L_0x0013;
    L_0x0036:
        r2 = "Unable to expire stream cache";
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r2);
        r2 = 0;
        r3 = "expireFailed";
        r4 = 0;
        r0 = r26;
        r1 = r27;
        r0.m3754a(r1, r2, r3, r4);
        r2 = 0;
        goto L_0x0012;
    L_0x0048:
        r3 = 0;
        r0 = r26;
        r2 = r0.f3289f;
        r4 = r2.listFiles();
        r5 = r4.length;
        r2 = 0;
        r25 = r2;
        r2 = r3;
        r3 = r25;
    L_0x0058:
        if (r3 >= r5) goto L_0x006d;
    L_0x005a:
        r6 = r4[r3];
        r6 = r6.getName();
        r7 = ".done";
        r6 = r6.endsWith(r7);
        if (r6 != 0) goto L_0x006a;
    L_0x0068:
        r2 = r2 + 1;
    L_0x006a:
        r3 = r3 + 1;
        goto L_0x0058;
    L_0x006d:
        r3 = r2;
        goto L_0x001b;
    L_0x006f:
        r7 = 0;
        r4 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r0 = r26;
        r2 = r0.f3289f;
        r9 = r2.listFiles();
        r10 = r9.length;
        r2 = 0;
        r8 = r2;
    L_0x0080:
        if (r8 >= r10) goto L_0x009f;
    L_0x0082:
        r6 = r9[r8];
        r2 = r6.getName();
        r3 = ".done";
        r2 = r2.endsWith(r3);
        if (r2 != 0) goto L_0x0457;
    L_0x0090:
        r2 = r6.lastModified();
        r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r11 >= 0) goto L_0x0457;
    L_0x0098:
        r4 = r6;
    L_0x0099:
        r5 = r8 + 1;
        r8 = r5;
        r7 = r4;
        r4 = r2;
        goto L_0x0080;
    L_0x009f:
        r2 = 0;
        if (r7 == 0) goto L_0x0034;
    L_0x00a2:
        r2 = r7.delete();
        r0 = r26;
        r3 = r0.m3757a(r7);
        r4 = r3.isFile();
        if (r4 == 0) goto L_0x0034;
    L_0x00b2:
        r3 = r3.delete();
        r2 = r2 & r3;
        goto L_0x0034;
    L_0x00b9:
        com.google.android.gms.ads.internal.client.C0374z.m2455a();
        r2 = com.google.android.gms.ads.internal.util.client.C0500a.m3012a(r27);
        r11 = new java.io.File;
        r0 = r26;
        r3 = r0.f3289f;
        r11.<init>(r3, r2);
        r0 = r26;
        r12 = r0.m3757a(r11);
        r2 = r11.isFile();
        if (r2 == 0) goto L_0x0102;
    L_0x00d5:
        r2 = r12.isFile();
        if (r2 == 0) goto L_0x0102;
    L_0x00db:
        r2 = r11.length();
        r2 = (int) r2;
        r3 = new java.lang.StringBuilder;
        r4 = "Stream cache hit at ";
        r3.<init>(r4);
        r0 = r27;
        r3 = r3.append(r0);
        r3.toString();
        r3 = 3;
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r3);
        r3 = r11.getAbsolutePath();
        r0 = r26;
        r1 = r27;
        r0.m3753a(r1, r3, r2);
        r2 = 1;
        goto L_0x0012;
    L_0x0102:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r26;
        r3 = r0.f3289f;
        r3 = r3.getAbsolutePath();
        r2 = r2.append(r3);
        r0 = r27;
        r2 = r2.append(r0);
        r13 = r2.toString();
        r3 = f3287d;
        monitor-enter(r3);
        r2 = f3287d;	 Catch:{ all -> 0x014e }
        r2 = r2.contains(r13);	 Catch:{ all -> 0x014e }
        if (r2 == 0) goto L_0x0151;
    L_0x0128:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x014e }
        r4 = "Stream cache already in progress at ";
        r2.<init>(r4);	 Catch:{ all -> 0x014e }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ all -> 0x014e }
        r2 = r2.toString();	 Catch:{ all -> 0x014e }
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r2);	 Catch:{ all -> 0x014e }
        r2 = r11.getAbsolutePath();	 Catch:{ all -> 0x014e }
        r4 = "inProgress";
        r5 = 0;
        r0 = r26;
        r1 = r27;
        r0.m3754a(r1, r2, r4, r5);	 Catch:{ all -> 0x014e }
        r2 = 0;
        monitor-exit(r3);	 Catch:{ all -> 0x014e }
        goto L_0x0012;
    L_0x014e:
        r2 = move-exception;
        monitor-exit(r3);
        throw r2;
    L_0x0151:
        r2 = f3287d;	 Catch:{ all -> 0x014e }
        r2.add(r13);	 Catch:{ all -> 0x014e }
        monitor-exit(r3);	 Catch:{ all -> 0x014e }
        r5 = 0;
        r9 = "error";
        r8 = 0;
        r2 = new java.net.URL;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r0 = r27;
        r2.<init>(r0);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r3 = r2.openConnection();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = com.google.android.gms.p006b.ck.f3081t;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r4 = com.google.android.gms.ads.internal.ar.m2249n();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r4.m3580a(r2);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = (java.lang.Integer) r2;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r2.intValue();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r3.setConnectTimeout(r2);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r3.setReadTimeout(r2);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r3 instanceof java.net.HttpURLConnection;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        if (r2 == 0) goto L_0x0227;
    L_0x0180:
        r0 = r3;
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r0;
        r2 = r2.getResponseCode();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r2 < r4) goto L_0x0227;
    L_0x018c:
        r4 = "badUrl";
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x043c }
        r6 = "HTTP request failed. Code: ";
        r3.<init>(r6);	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x043c }
        r6 = java.lang.Integer.toString(r2);	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x043c }
        r3 = r3.append(r6);	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x043c }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x043c }
        r6 = new java.io.IOException;	 Catch:{ IOException -> 0x01c2, RuntimeException -> 0x0440 }
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01c2, RuntimeException -> 0x0440 }
        r8 = "HTTP status code ";
        r7.<init>(r8);	 Catch:{ IOException -> 0x01c2, RuntimeException -> 0x0440 }
        r2 = r7.append(r2);	 Catch:{ IOException -> 0x01c2, RuntimeException -> 0x0440 }
        r7 = " at ";
        r2 = r2.append(r7);	 Catch:{ IOException -> 0x01c2, RuntimeException -> 0x0440 }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x01c2, RuntimeException -> 0x0440 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x01c2, RuntimeException -> 0x0440 }
        r6.<init>(r2);	 Catch:{ IOException -> 0x01c2, RuntimeException -> 0x0440 }
        throw r6;	 Catch:{ IOException -> 0x01c2, RuntimeException -> 0x0440 }
    L_0x01c2:
        r2 = move-exception;
    L_0x01c3:
        r6 = r2 instanceof java.lang.RuntimeException;
        if (r6 == 0) goto L_0x01cf;
    L_0x01c7:
        r6 = com.google.android.gms.ads.internal.ar.m2243h();
        r7 = 1;
        r6.m4367a(r2, r7);
    L_0x01cf:
        r5.close();	 Catch:{ IOException -> 0x0431, NullPointerException -> 0x0434 }
    L_0x01d2:
        r0 = r26;
        r5 = r0.f3290g;
        if (r5 == 0) goto L_0x0415;
    L_0x01d8:
        r2 = new java.lang.StringBuilder;
        r5 = "Preload aborted for URL \"";
        r2.<init>(r5);
        r0 = r27;
        r2 = r2.append(r0);
        r5 = "\"";
        r2 = r2.append(r5);
        r2.toString();
        r2 = 4;
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r2);
    L_0x01f2:
        r2 = r11.exists();
        if (r2 == 0) goto L_0x0214;
    L_0x01f8:
        r2 = r11.delete();
        if (r2 != 0) goto L_0x0214;
    L_0x01fe:
        r2 = new java.lang.StringBuilder;
        r5 = "Could not delete partial cache file at ";
        r2.<init>(r5);
        r5 = r11.getAbsolutePath();
        r2 = r2.append(r5);
        r2 = r2.toString();
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r2);
    L_0x0214:
        r2 = r11.getAbsolutePath();
        r0 = r26;
        r1 = r27;
        r0.m3754a(r1, r2, r4, r3);
        r2 = f3287d;
        r2.remove(r13);
        r2 = 0;
        goto L_0x0012;
    L_0x0227:
        r7 = r3.getContentLength();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        if (r7 >= 0) goto L_0x0257;
    L_0x022d:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r3 = "Stream cache aborted, missing content-length header at ";
        r2.<init>(r3);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r2);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r11.getAbsolutePath();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r3 = "contentLengthMissing";
        r4 = 0;
        r0 = r26;
        r1 = r27;
        r0.m3754a(r1, r2, r3, r4);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = f3287d;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2.remove(r13);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = 0;
        goto L_0x0012;
    L_0x0257:
        r2 = f3288e;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r14 = (long) r7;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r4 = r2.format(r14);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = com.google.android.gms.p006b.ck.f3077p;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r6 = com.google.android.gms.ads.internal.ar.m2249n();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r6.m3580a(r2);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = (java.lang.Integer) r2;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r14 = r2.intValue();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        if (r7 <= r14) goto L_0x02b2;
    L_0x0270:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r3 = "Content length ";
        r2.<init>(r3);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r3 = " exceeds limit at ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r2);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r3 = "File too big for full file cache. Size: ";
        r2.<init>(r3);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r3 = r11.getAbsolutePath();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r4 = "sizeExceeded";
        r0 = r26;
        r1 = r27;
        r0.m3754a(r1, r3, r4, r2);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = f3287d;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2.remove(r13);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = 0;
        goto L_0x0012;
    L_0x02b2:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r6 = "Caching ";
        r2.<init>(r6);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r4 = " bytes from ";
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2.toString();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = 3;
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r2);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r2 = r3.getInputStream();	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r15 = java.nio.channels.Channels.newChannel(r2);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r10 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r10.<init>(r11);	 Catch:{ IOException -> 0x044e, RuntimeException -> 0x0437 }
        r16 = r10.getChannel();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r17 = java.nio.ByteBuffer.allocate(r2);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r18 = com.google.android.gms.ads.internal.ar.m2244i();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r6 = 0;
        r20 = r18.m4887a();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = com.google.android.gms.p006b.ck.f3080s;	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r3 = com.google.android.gms.ads.internal.ar.m2249n();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = r3.m3580a(r2);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = (java.lang.Long) r2;	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = r2.longValue();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r19 = new com.google.android.gms.b.sh;	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r0 = r19;
        r0.<init>(r2);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = com.google.android.gms.p006b.ck.f3079r;	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r3 = com.google.android.gms.ads.internal.ar.m2249n();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = r3.m3580a(r2);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = (java.lang.Long) r2;	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r22 = r2.longValue();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
    L_0x0317:
        r0 = r17;
        r2 = r15.read(r0);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        if (r2 < 0) goto L_0x03bb;
    L_0x031f:
        r6 = r6 + r2;
        if (r6 <= r14) goto L_0x0343;
    L_0x0322:
        r4 = "sizeExceeded";
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        r3 = "File too big for full file cache. Size: ";
        r2.<init>(r3);	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        r3 = java.lang.Integer.toString(r6);	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        r3 = r2.toString();	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x033f, RuntimeException -> 0x0380 }
        r5 = "stream cache file size limit exceeded";
        r2.<init>(r5);	 Catch:{ IOException -> 0x033f, RuntimeException -> 0x0380 }
        throw r2;	 Catch:{ IOException -> 0x033f, RuntimeException -> 0x0380 }
    L_0x033f:
        r2 = move-exception;
        r5 = r10;
        goto L_0x01c3;
    L_0x0343:
        r17.flip();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
    L_0x0346:
        r2 = r16.write(r17);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        if (r2 > 0) goto L_0x0346;
    L_0x034c:
        r17.clear();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = r18.m4887a();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = r2 - r20;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r22;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0384;
    L_0x035d:
        r4 = "downloadTimeout";
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        r3 = "Timeout exceeded. Limit: ";
        r2.<init>(r3);	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        r3 = java.lang.Long.toString(r22);	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        r3 = " sec";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        r3 = r2.toString();	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x033f, RuntimeException -> 0x0380 }
        r5 = "stream cache time limit exceeded";
        r2.<init>(r5);	 Catch:{ IOException -> 0x033f, RuntimeException -> 0x0380 }
        throw r2;	 Catch:{ IOException -> 0x033f, RuntimeException -> 0x0380 }
    L_0x0380:
        r2 = move-exception;
        r5 = r10;
        goto L_0x01c3;
    L_0x0384:
        r0 = r26;
        r2 = r0.f3290g;	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        if (r2 == 0) goto L_0x0399;
    L_0x038a:
        r4 = "externalAbort";
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        r3 = "abort requested";
        r2.<init>(r3);	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
        throw r2;	 Catch:{ IOException -> 0x0394, RuntimeException -> 0x0449 }
    L_0x0394:
        r2 = move-exception;
        r3 = r8;
        r5 = r10;
        goto L_0x01c3;
    L_0x0399:
        r2 = r19.m4526a();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        if (r2 == 0) goto L_0x0317;
    L_0x039f:
        r5 = r11.getAbsolutePath();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r24 = com.google.android.gms.ads.internal.util.client.C0500a.f2543a;	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = new com.google.android.gms.b.gh;	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r3 = r26;
        r4 = r27;
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r0 = r24;
        r0.post(r2);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        goto L_0x0317;
    L_0x03b5:
        r2 = move-exception;
        r3 = r8;
        r4 = r9;
        r5 = r10;
        goto L_0x01c3;
    L_0x03bb:
        r10.close();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = 3;
        r2 = com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r2);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        if (r2 == 0) goto L_0x03ea;
    L_0x03c5:
        r2 = f3288e;	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r4 = (long) r6;	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = r2.format(r4);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r4 = "Preloaded ";
        r3.<init>(r4);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r3 = " bytes from ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r0 = r27;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2.toString();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = 3;
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r2);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
    L_0x03ea:
        r2 = 1;
        r3 = 0;
        r11.setReadable(r2, r3);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = r12.isFile();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        if (r2 == 0) goto L_0x040f;
    L_0x03f5:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r12.setLastModified(r2);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
    L_0x03fc:
        r2 = r11.getAbsolutePath();	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r0 = r26;
        r1 = r27;
        r0.m3753a(r1, r2, r6);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = f3287d;	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2.remove(r13);	 Catch:{ IOException -> 0x03b5, RuntimeException -> 0x0443 }
        r2 = 1;
        goto L_0x0012;
    L_0x040f:
        r12.createNewFile();	 Catch:{ IOException -> 0x0413, RuntimeException -> 0x0443 }
        goto L_0x03fc;
    L_0x0413:
        r2 = move-exception;
        goto L_0x03fc;
    L_0x0415:
        r5 = new java.lang.StringBuilder;
        r6 = "Preload failed for URL \"";
        r5.<init>(r6);
        r0 = r27;
        r5 = r5.append(r0);
        r6 = "\"";
        r5 = r5.append(r6);
        r5 = r5.toString();
        com.google.android.gms.ads.internal.util.client.C0501b.m3026a(r5, r2);
        goto L_0x01f2;
    L_0x0431:
        r5 = move-exception;
        goto L_0x01d2;
    L_0x0434:
        r5 = move-exception;
        goto L_0x01d2;
    L_0x0437:
        r2 = move-exception;
        r3 = r8;
        r4 = r9;
        goto L_0x01c3;
    L_0x043c:
        r2 = move-exception;
        r3 = r8;
        goto L_0x01c3;
    L_0x0440:
        r2 = move-exception;
        goto L_0x01c3;
    L_0x0443:
        r2 = move-exception;
        r3 = r8;
        r4 = r9;
        r5 = r10;
        goto L_0x01c3;
    L_0x0449:
        r2 = move-exception;
        r3 = r8;
        r5 = r10;
        goto L_0x01c3;
    L_0x044e:
        r2 = move-exception;
        r3 = r8;
        r4 = r9;
        goto L_0x01c3;
    L_0x0453:
        r2 = move-exception;
        r3 = r8;
        goto L_0x01c3;
    L_0x0457:
        r2 = r4;
        r4 = r7;
        goto L_0x0099;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.gm.a(java.lang.String):boolean");
    }
}
