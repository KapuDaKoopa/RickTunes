package com.andromo.dev576782.app537736;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class gt implements hk {
    static final List f982a;
    private volatile boolean f983b;

    static {
        List arrayList = new ArrayList();
        arrayList.add("audio/scpls");
        arrayList.add("audio/x-scpls");
        arrayList.add("application/pls+xml");
        arrayList.add("text/plain");
        f982a = Collections.unmodifiableList(arrayList);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.andromo.dev576782.app537736.hl m1520a(java.io.ByteArrayInputStream r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.andromo.dev576782.app537736.ce r23, java.lang.String r24) {
        /*
        r18 = this;
        r10 = new com.andromo.dev576782.app537736.hl;
        r10.<init>();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r10.f1061a = r2;
        r11 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x00a3 }
        r2 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x00a3 }
        r0 = r19;
        r1 = r24;
        r2.<init>(r0, r1);	 Catch:{ IOException -> 0x00a3 }
        r11.<init>(r2);	 Catch:{ IOException -> 0x00a3 }
        r3 = -1;
        r2 = 0;
        r12 = com.andromo.dev576782.app537736.fj.m1440b(r22);	 Catch:{ all -> 0x009e }
        r13 = new java.util.HashMap;	 Catch:{ all -> 0x009e }
        r13.<init>();	 Catch:{ all -> 0x009e }
        r14 = new java.util.HashMap;	 Catch:{ all -> 0x009e }
        r14.<init>();	 Catch:{ all -> 0x009e }
        r15 = new java.util.HashMap;	 Catch:{ all -> 0x009e }
        r15.<init>();	 Catch:{ all -> 0x009e }
        r4 = r3;
        r3 = r2;
    L_0x0031:
        r2 = r11.readLine();	 Catch:{ all -> 0x009e }
        if (r2 == 0) goto L_0x00ce;
    L_0x0037:
        r0 = r18;
        r5 = r0.f983b;	 Catch:{ all -> 0x009e }
        if (r5 != 0) goto L_0x00ce;
    L_0x003d:
        r2 = r2.trim();	 Catch:{ all -> 0x009e }
        r5 = r2.length();	 Catch:{ all -> 0x009e }
        if (r5 <= 0) goto L_0x0031;
    L_0x0047:
        if (r3 != 0) goto L_0x0054;
    L_0x0049:
        r5 = "[playlist]";
        r2 = r2.equalsIgnoreCase(r5);	 Catch:{ all -> 0x009e }
        if (r2 == 0) goto L_0x00ce;
    L_0x0051:
        r2 = 1;
        r3 = r2;
        goto L_0x0031;
    L_0x0054:
        r5 = 61;
        r5 = r2.indexOf(r5);	 Catch:{ all -> 0x009e }
        if (r5 <= 0) goto L_0x00ce;
    L_0x005c:
        r6 = 0;
        r6 = r2.substring(r6, r5);	 Catch:{ all -> 0x009e }
        r6 = r6.trim();	 Catch:{ all -> 0x009e }
        r6 = r6.toLowerCase();	 Catch:{ all -> 0x009e }
        r7 = r2.length();	 Catch:{ all -> 0x009e }
        r8 = r5 + 1;
        if (r7 <= r8) goto L_0x008f;
    L_0x0071:
        r5 = r5 + 1;
        r2 = r2.substring(r5);	 Catch:{ all -> 0x009e }
        r2 = r2.trim();	 Catch:{ all -> 0x009e }
    L_0x007b:
        r5 = "numberofentries";
        r5 = r5.equals(r6);	 Catch:{ all -> 0x009e }
        if (r5 == 0) goto L_0x0092;
    L_0x0083:
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x0216 }
        if (r2 < 0) goto L_0x00ce;
    L_0x0089:
        if (r4 < 0) goto L_0x008d;
    L_0x008b:
        if (r4 != r2) goto L_0x00ce;
    L_0x008d:
        r4 = r2;
        goto L_0x0031;
    L_0x008f:
        r2 = "";
        goto L_0x007b;
    L_0x0092:
        r5 = "file";
        r5 = r6.startsWith(r5);	 Catch:{ all -> 0x009e }
        if (r5 == 0) goto L_0x00a5;
    L_0x009a:
        r13.put(r6, r2);	 Catch:{ all -> 0x009e }
        goto L_0x0031;
    L_0x009e:
        r2 = move-exception;
        r11.close();	 Catch:{ IOException -> 0x00a3 }
        throw r2;	 Catch:{ IOException -> 0x00a3 }
    L_0x00a3:
        r2 = move-exception;
    L_0x00a4:
        return r10;
    L_0x00a5:
        r5 = "title";
        r5 = r6.startsWith(r5);	 Catch:{ all -> 0x009e }
        if (r5 == 0) goto L_0x00b1;
    L_0x00ad:
        r14.put(r6, r2);	 Catch:{ all -> 0x009e }
        goto L_0x0031;
    L_0x00b1:
        r5 = "length";
        r5 = r6.startsWith(r5);	 Catch:{ all -> 0x009e }
        if (r5 == 0) goto L_0x00be;
    L_0x00b9:
        r15.put(r6, r2);	 Catch:{ all -> 0x009e }
        goto L_0x0031;
    L_0x00be:
        r5 = "version";
        r5 = r5.equals(r6);	 Catch:{ all -> 0x009e }
        if (r5 == 0) goto L_0x0031;
    L_0x00c6:
        r5 = "2";
        r2 = r5.equals(r2);	 Catch:{ all -> 0x009e }
        if (r2 != 0) goto L_0x0031;
    L_0x00ce:
        if (r3 == 0) goto L_0x0211;
    L_0x00d0:
        r0 = r18;
        r2 = r0.f983b;	 Catch:{ all -> 0x009e }
        if (r2 != 0) goto L_0x0211;
    L_0x00d6:
        if (r4 != 0) goto L_0x00db;
    L_0x00d8:
        r2 = 1;
        r10.f1063c = r2;	 Catch:{ all -> 0x009e }
    L_0x00db:
        r13.size();	 Catch:{ all -> 0x009e }
        if (r4 <= 0) goto L_0x0211;
    L_0x00e0:
        r2 = r13.size();	 Catch:{ all -> 0x009e }
        if (r2 < r4) goto L_0x0211;
    L_0x00e6:
        r2 = 1;
        r16 = r13.size();	 Catch:{ all -> 0x009e }
        r9 = r2;
    L_0x00ec:
        r0 = r16;
        if (r9 > r0) goto L_0x0211;
    L_0x00f0:
        r0 = r18;
        r2 = r0.f983b;	 Catch:{ all -> 0x009e }
        if (r2 != 0) goto L_0x0211;
    L_0x00f6:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009e }
        r3 = "file";
        r2.<init>(r3);	 Catch:{ all -> 0x009e }
        r2 = r2.append(r9);	 Catch:{ all -> 0x009e }
        r2 = r2.toString();	 Catch:{ all -> 0x009e }
        r2 = r13.get(r2);	 Catch:{ all -> 0x009e }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x009e }
        if (r2 == 0) goto L_0x01e5;
    L_0x010d:
        r3 = r2.length();	 Catch:{ all -> 0x009e }
        if (r3 == 0) goto L_0x01e5;
    L_0x0113:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009e }
        r4 = "title";
        r3.<init>(r4);	 Catch:{ all -> 0x009e }
        r3 = r3.append(r9);	 Catch:{ all -> 0x009e }
        r3 = r3.toString();	 Catch:{ all -> 0x009e }
        r3 = r14.get(r3);	 Catch:{ all -> 0x009e }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x009e }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009e }
        r5 = "length";
        r4.<init>(r5);	 Catch:{ all -> 0x009e }
        r4 = r4.append(r9);	 Catch:{ all -> 0x009e }
        r4 = r4.toString();	 Catch:{ all -> 0x009e }
        r4 = r15.get(r4);	 Catch:{ all -> 0x009e }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x009e }
        r6 = 0;
        if (r4 == 0) goto L_0x014a;
    L_0x0140:
        r5 = r4.length();	 Catch:{ all -> 0x009e }
        if (r5 <= 0) goto L_0x014a;
    L_0x0146:
        r6 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0219 }
    L_0x014a:
        r4 = com.andromo.dev576782.app537736.eu.m1406a(r20);	 Catch:{ all -> 0x009e }
        if (r4 == 0) goto L_0x01ea;
    L_0x0150:
        r4 = com.andromo.dev576782.app537736.eu.m1406a(r2);	 Catch:{ all -> 0x009e }
        if (r4 != 0) goto L_0x021f;
    L_0x0156:
        r0 = r20;
        r4 = com.andromo.dev576782.app537736.eu.m1404a(r2, r0);	 Catch:{ all -> 0x009e }
        r5 = r4.length();	 Catch:{ all -> 0x009e }
        if (r5 <= 0) goto L_0x0169;
    L_0x0162:
        r5 = com.andromo.dev576782.app537736.eu.m1408b(r4);	 Catch:{ all -> 0x009e }
        if (r5 == 0) goto L_0x0169;
    L_0x0168:
        r2 = r4;
    L_0x0169:
        r8 = r2;
    L_0x016a:
        if (r8 == 0) goto L_0x01e5;
    L_0x016c:
        r2 = "";
        r2 = r2.equals(r8);	 Catch:{ all -> 0x009e }
        if (r2 != 0) goto L_0x01e5;
    L_0x0174:
        r0 = r18;
        r2 = r0.f983b;	 Catch:{ all -> 0x009e }
        if (r2 != 0) goto L_0x01e5;
    L_0x017a:
        r5 = "";
        r4 = "";
        r2 = "";
        r7 = r23.m1316b();	 Catch:{ all -> 0x009e }
        if (r7 != 0) goto L_0x0205;
    L_0x0186:
        if (r3 == 0) goto L_0x0190;
    L_0x0188:
        r7 = r3.length();	 Catch:{ all -> 0x009e }
        if (r7 == 0) goto L_0x0190;
    L_0x018e:
        if (r12 == 0) goto L_0x0205;
    L_0x0190:
        r2 = com.andromo.dev576782.app537736.fj.m1438a(r8);	 Catch:{ all -> 0x009e }
        r0 = r21;
        r7 = com.andromo.dev576782.app537736.AudioItem.m970a(r2, r3, r0);	 Catch:{ all -> 0x009e }
        if (r12 == 0) goto L_0x021c;
    L_0x019c:
        r3 = 0;
        r0 = r22;
        r5 = com.andromo.dev576782.app537736.AudioItem.m975b(r2, r3, r0);	 Catch:{ all -> 0x009e }
    L_0x01a3:
        if (r6 != 0) goto L_0x01a9;
    L_0x01a5:
        r6 = r2.m1446f();	 Catch:{ all -> 0x009e }
    L_0x01a9:
        r4 = r2.m1443c();	 Catch:{ all -> 0x009e }
        r3 = r2.m1444d();	 Catch:{ all -> 0x009e }
        r2 = r2.m1445e();	 Catch:{ all -> 0x009e }
    L_0x01b5:
        r17 = new com.andromo.dev576782.app537736.cd;	 Catch:{ all -> 0x009e }
        r17.<init>();	 Catch:{ all -> 0x009e }
        r0 = r17;
        r0.f779a = r8;	 Catch:{ all -> 0x009e }
        r0 = r17;
        r0.f780b = r7;	 Catch:{ all -> 0x009e }
        r0 = r17;
        r0.f781c = r5;	 Catch:{ all -> 0x009e }
        r0 = r23;
        r1 = r17;
        r1.f782d = r0;	 Catch:{ all -> 0x009e }
        r0 = r17;
        r0.f783e = r4;	 Catch:{ all -> 0x009e }
        r0 = r17;
        r0.f784f = r3;	 Catch:{ all -> 0x009e }
        r0 = r17;
        r0.f785g = r2;	 Catch:{ all -> 0x009e }
        r0 = r17;
        r0.f786h = r6;	 Catch:{ all -> 0x009e }
        r2 = r17.m1314a();	 Catch:{ all -> 0x009e }
        r3 = r10.f1061a;	 Catch:{ all -> 0x009e }
        r3.add(r2);	 Catch:{ all -> 0x009e }
    L_0x01e5:
        r2 = r9 + 1;
        r9 = r2;
        goto L_0x00ec;
    L_0x01ea:
        r4 = android.webkit.URLUtil.isValidUrl(r2);	 Catch:{ all -> 0x009e }
        if (r4 != 0) goto L_0x021f;
    L_0x01f0:
        r0 = r20;
        r4 = com.andromo.dev576782.app537736.gr.m1516a(r2, r0);	 Catch:{ all -> 0x009e }
        r5 = r4.length();	 Catch:{ all -> 0x009e }
        if (r5 <= 0) goto L_0x021f;
    L_0x01fc:
        r5 = com.andromo.dev576782.app537736.gr.m1518a(r4);	 Catch:{ all -> 0x009e }
        if (r5 == 0) goto L_0x021f;
    L_0x0202:
        r8 = r4;
        goto L_0x016a;
    L_0x0205:
        r0 = r21;
        r3 = com.andromo.dev576782.app537736.AudioItem.m972a(r3, r0);	 Catch:{ all -> 0x009e }
        r7 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r22;
        goto L_0x01b5;
    L_0x0211:
        r11.close();	 Catch:{ IOException -> 0x00a3 }
        goto L_0x00a4;
    L_0x0216:
        r2 = move-exception;
        goto L_0x00ce;
    L_0x0219:
        r4 = move-exception;
        goto L_0x014a;
    L_0x021c:
        r5 = r22;
        goto L_0x01a3;
    L_0x021f:
        r8 = r2;
        goto L_0x016a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.andromo.dev576782.app537736.gt.a(java.io.ByteArrayInputStream, java.lang.String, java.lang.String, java.lang.String, com.andromo.dev576782.app537736.ce, java.lang.String):com.andromo.dev576782.app537736.hl");
    }

    public final List m1521a() {
        return f982a;
    }

    public final boolean m1522b() {
        return false;
    }

    public final void m1523c() {
        this.f983b = true;
    }
}
