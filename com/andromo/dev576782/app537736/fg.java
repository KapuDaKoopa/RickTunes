package com.andromo.dev576782.app537736;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fg implements hk {
    static final List f899a;
    private volatile boolean f900b;

    static {
        List arrayList = new ArrayList();
        arrayList.add("audio/mpegurl");
        arrayList.add("audio/x-mpegurl");
        arrayList.add("audio/vnd.rn-realaudio");
        arrayList.add("audio/x-pn-realaudio");
        arrayList.add("application/ram");
        arrayList.add("text/plain");
        f899a = Collections.unmodifiableList(arrayList);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.andromo.dev576782.app537736.hl m1430a(java.io.ByteArrayInputStream r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.andromo.dev576782.app537736.ce r19, java.lang.String r20) {
        /*
        r14 = this;
        r9 = new com.andromo.dev576782.app537736.hl;
        r9.<init>();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r9.f1061a = r1;
        r10 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x016c }
        r1 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x016c }
        r0 = r20;
        r1.<init>(r15, r0);	 Catch:{ IOException -> 0x016c }
        r10.<init>(r1);	 Catch:{ IOException -> 0x016c }
        r4 = 0;
        r1 = 0;
        r3 = 0;
        r11 = com.andromo.dev576782.app537736.fj.m1440b(r18);	 Catch:{ all -> 0x0167 }
        r5 = 0;
    L_0x0020:
        r2 = r10.readLine();	 Catch:{ all -> 0x0167 }
        if (r2 == 0) goto L_0x0163;
    L_0x0026:
        r6 = r14.f900b;	 Catch:{ all -> 0x0167 }
        if (r6 != 0) goto L_0x0163;
    L_0x002a:
        r2 = r2.trim();	 Catch:{ all -> 0x0167 }
        r6 = r2.length();	 Catch:{ all -> 0x0167 }
        if (r6 <= 0) goto L_0x0020;
    L_0x0034:
        r6 = 0;
        r6 = r2.charAt(r6);	 Catch:{ all -> 0x0167 }
        r7 = 60;
        if (r6 == r7) goto L_0x0163;
    L_0x003d:
        r7 = 91;
        if (r6 == r7) goto L_0x0163;
    L_0x0041:
        r7 = 35;
        if (r6 != r7) goto L_0x008b;
    L_0x0045:
        r6 = r2.length();	 Catch:{ all -> 0x0167 }
        r7 = 7;
        if (r6 <= r7) goto L_0x017c;
    L_0x004c:
        r6 = "#EXTINF";
        r7 = 0;
        r8 = 7;
        r7 = r2.substring(r7, r8);	 Catch:{ all -> 0x0167 }
        r6 = r6.equalsIgnoreCase(r7);	 Catch:{ all -> 0x0167 }
        if (r6 == 0) goto L_0x017c;
    L_0x005a:
        r6 = 44;
        r7 = 7;
        r6 = r2.indexOf(r6, r7);	 Catch:{ all -> 0x0167 }
        if (r6 < 0) goto L_0x0075;
    L_0x0063:
        r7 = r2.length();	 Catch:{ all -> 0x0167 }
        r8 = r6 + 1;
        if (r7 <= r8) goto L_0x0075;
    L_0x006b:
        r4 = r6 + 1;
        r4 = r2.substring(r4);	 Catch:{ all -> 0x0167 }
        r4 = r4.trim();	 Catch:{ all -> 0x0167 }
    L_0x0075:
        r7 = 58;
        r8 = 0;
        r7 = r2.indexOf(r7, r8);	 Catch:{ all -> 0x0167 }
        if (r7 < 0) goto L_0x0020;
    L_0x007e:
        if (r7 >= r6) goto L_0x0020;
    L_0x0080:
        r1 = r7 + 1;
        r1 = r2.substring(r1, r6);	 Catch:{ all -> 0x0167 }
        r1 = r1.trim();	 Catch:{ all -> 0x0167 }
        goto L_0x0020;
    L_0x008b:
        r6 = com.andromo.dev576782.app537736.eu.m1406a(r16);	 Catch:{ all -> 0x0167 }
        if (r6 == 0) goto L_0x0135;
    L_0x0091:
        r6 = com.andromo.dev576782.app537736.eu.m1406a(r2);	 Catch:{ all -> 0x0167 }
        if (r6 == 0) goto L_0x0120;
    L_0x0097:
        r8 = r2;
    L_0x0098:
        if (r8 == 0) goto L_0x00a0;
    L_0x009a:
        r2 = r8.length();	 Catch:{ all -> 0x0167 }
        if (r2 != 0) goto L_0x0174;
    L_0x00a0:
        r2 = r5 + 1;
        r3 = 2;
        if (r2 > r3) goto L_0x0163;
    L_0x00a5:
        if (r8 == 0) goto L_0x0172;
    L_0x00a7:
        r3 = r8.length();	 Catch:{ all -> 0x0167 }
        if (r3 <= 0) goto L_0x0172;
    L_0x00ad:
        r6 = "";
        r5 = "";
        r3 = "";
        r7 = 0;
        if (r1 == 0) goto L_0x0154;
    L_0x00b6:
        r12 = r1.length();	 Catch:{ all -> 0x0167 }
        if (r12 <= 0) goto L_0x0154;
    L_0x00bc:
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0153 }
    L_0x00c0:
        r7 = r19.m1316b();	 Catch:{ all -> 0x0167 }
        if (r7 != 0) goto L_0x0157;
    L_0x00c6:
        if (r4 == 0) goto L_0x00d0;
    L_0x00c8:
        r7 = r4.length();	 Catch:{ all -> 0x0167 }
        if (r7 == 0) goto L_0x00d0;
    L_0x00ce:
        if (r11 == 0) goto L_0x0157;
    L_0x00d0:
        r3 = com.andromo.dev576782.app537736.fj.m1438a(r8);	 Catch:{ all -> 0x0167 }
        r0 = r17;
        r7 = com.andromo.dev576782.app537736.AudioItem.m970a(r3, r4, r0);	 Catch:{ all -> 0x0167 }
        if (r11 == 0) goto L_0x016e;
    L_0x00dc:
        r4 = 0;
        r0 = r18;
        r6 = com.andromo.dev576782.app537736.AudioItem.m975b(r3, r4, r0);	 Catch:{ all -> 0x0167 }
    L_0x00e3:
        if (r1 != 0) goto L_0x00e9;
    L_0x00e5:
        r1 = r3.m1446f();	 Catch:{ all -> 0x0167 }
    L_0x00e9:
        r5 = r3.m1443c();	 Catch:{ all -> 0x0167 }
        r4 = r3.m1444d();	 Catch:{ all -> 0x0167 }
        r3 = r3.m1445e();	 Catch:{ all -> 0x0167 }
    L_0x00f5:
        r12 = new com.andromo.dev576782.app537736.cd;	 Catch:{ all -> 0x0167 }
        r12.<init>();	 Catch:{ all -> 0x0167 }
        r12.f779a = r8;	 Catch:{ all -> 0x0167 }
        r12.f780b = r7;	 Catch:{ all -> 0x0167 }
        r12.f781c = r6;	 Catch:{ all -> 0x0167 }
        r0 = r19;
        r12.f782d = r0;	 Catch:{ all -> 0x0167 }
        r12.f783e = r5;	 Catch:{ all -> 0x0167 }
        r12.f784f = r4;	 Catch:{ all -> 0x0167 }
        r12.f785g = r3;	 Catch:{ all -> 0x0167 }
        r12.f786h = r1;	 Catch:{ all -> 0x0167 }
        r1 = r12.m1314a();	 Catch:{ all -> 0x0167 }
        r3 = r9.f1061a;	 Catch:{ all -> 0x0167 }
        r3.add(r1);	 Catch:{ all -> 0x0167 }
        r1 = 0;
    L_0x0116:
        r3 = 0;
        r4 = 0;
        r13 = r2;
        r2 = r4;
        r4 = r1;
        r1 = r13;
    L_0x011c:
        r5 = r1;
        r1 = r2;
        goto L_0x0020;
    L_0x0120:
        r0 = r16;
        r2 = com.andromo.dev576782.app537736.eu.m1404a(r2, r0);	 Catch:{ all -> 0x0167 }
        r6 = r2.length();	 Catch:{ all -> 0x0167 }
        if (r6 <= 0) goto L_0x017a;
    L_0x012c:
        r6 = com.andromo.dev576782.app537736.eu.m1408b(r2);	 Catch:{ all -> 0x0167 }
        if (r6 == 0) goto L_0x017a;
    L_0x0132:
        r8 = r2;
        goto L_0x0098;
    L_0x0135:
        r6 = android.webkit.URLUtil.isValidUrl(r2);	 Catch:{ all -> 0x0167 }
        if (r6 == 0) goto L_0x013e;
    L_0x013b:
        r8 = r2;
        goto L_0x0098;
    L_0x013e:
        r0 = r16;
        r2 = com.andromo.dev576782.app537736.gr.m1516a(r2, r0);	 Catch:{ all -> 0x0167 }
        r6 = r2.length();	 Catch:{ all -> 0x0167 }
        if (r6 <= 0) goto L_0x0177;
    L_0x014a:
        r6 = com.andromo.dev576782.app537736.gr.m1518a(r2);	 Catch:{ all -> 0x0167 }
        if (r6 == 0) goto L_0x0177;
    L_0x0150:
        r8 = r2;
        goto L_0x0098;
    L_0x0153:
        r1 = move-exception;
    L_0x0154:
        r1 = r7;
        goto L_0x00c0;
    L_0x0157:
        r0 = r17;
        r4 = com.andromo.dev576782.app537736.AudioItem.m972a(r4, r0);	 Catch:{ all -> 0x0167 }
        r7 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r18;
        goto L_0x00f5;
    L_0x0163:
        r10.close();	 Catch:{ IOException -> 0x016c }
    L_0x0166:
        return r9;
    L_0x0167:
        r1 = move-exception;
        r10.close();	 Catch:{ IOException -> 0x016c }
        throw r1;	 Catch:{ IOException -> 0x016c }
    L_0x016c:
        r1 = move-exception;
        goto L_0x0166;
    L_0x016e:
        r6 = r18;
        goto L_0x00e3;
    L_0x0172:
        r1 = r4;
        goto L_0x0116;
    L_0x0174:
        r2 = r5;
        goto L_0x00a5;
    L_0x0177:
        r8 = r3;
        goto L_0x0098;
    L_0x017a:
        r2 = r3;
        goto L_0x0132;
    L_0x017c:
        r2 = r1;
        r1 = r5;
        goto L_0x011c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.andromo.dev576782.app537736.fg.a(java.io.ByteArrayInputStream, java.lang.String, java.lang.String, java.lang.String, com.andromo.dev576782.app537736.ce, java.lang.String):com.andromo.dev576782.app537736.hl");
    }

    public final List m1431a() {
        return f899a;
    }

    public final boolean m1432b() {
        return false;
    }

    public final void m1433c() {
        this.f900b = true;
    }
}
