package com.google.android.gms.p006b;

import android.support.v4.app.FragmentTransaction;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* renamed from: com.google.android.gms.b.zc */
public final class zc implements kn {
    protected static final boolean f4435a;
    private static int f4436d;
    private static int f4437e;
    protected final zl f4438b;
    protected final zd f4439c;

    static {
        f4435a = yh.f4366b;
        f4436d = 3000;
        f4437e = FragmentTransaction.TRANSIT_ENTER_MASK;
    }

    public zc(zl zlVar) {
        this(zlVar, new zd(f4437e));
    }

    private zc(zl zlVar, zd zdVar) {
        this.f4438b = zlVar;
        this.f4439c = zdVar;
    }

    private static Map m4997a(Header[] headerArr) {
        Map treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }

    private static void m4998a(String str, ue ueVar, xy xyVar) {
        xr m = ueVar.m3563m();
        int l = ueVar.m3562l();
        try {
            m.m3699a(xyVar);
            ueVar.m3552a(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(l)}));
        } catch (xy e) {
            ueVar.m3552a(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(l)}));
            throw e;
        }
    }

    private byte[] m4999a(HttpEntity httpEntity) {
        C0616b c0616b = new C0616b(this.f4439c, (int) httpEntity.getContentLength());
        byte[] bArr = null;
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new xs();
            }
            bArr = this.f4439c.m5003a(1024);
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    break;
                }
                c0616b.write(bArr, 0, read);
            }
            byte[] toByteArray = c0616b.toByteArray();
            return toByteArray;
        } finally {
            try {
                httpEntity.consumeContent();
            } catch (IOException e) {
                yh.m4915a("Error occured when calling consumingContent", new Object[0]);
            }
            this.f4439c.m5002a(bArr);
            c0616b.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.p006b.pu m5000a(com.google.android.gms.p006b.ue r19) {
        /*
        r18 = this;
        r16 = android.os.SystemClock.elapsedRealtime();
    L_0x0004:
        r3 = 0;
        r14 = 0;
        r6 = java.util.Collections.emptyMap();
        r2 = new java.util.HashMap;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
        r2.<init>();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
        r4 = r19.m3559f();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
        if (r4 == 0) goto L_0x0038;
    L_0x0015:
        r5 = r4.f2936b;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
        if (r5 == 0) goto L_0x0020;
    L_0x0019:
        r5 = "If-None-Match";
        r7 = r4.f2936b;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
        r2.put(r5, r7);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
    L_0x0020:
        r8 = r4.f2938d;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
        r10 = 0;
        r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r5 <= 0) goto L_0x0038;
    L_0x0028:
        r5 = new java.util.Date;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
        r8 = r4.f2938d;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
        r5.<init>(r8);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
        r4 = "If-Modified-Since";
        r5 = org.apache.http.impl.cookie.DateUtils.formatDate(r5);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
        r2.put(r4, r5);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
    L_0x0038:
        r0 = r18;
        r4 = r0.f4438b;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
        r0 = r19;
        r15 = r4.m5023a(r0, r2);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0137 }
        r3 = r15.getStatusLine();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r4 = r3.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r2 = r15.getAllHeaders();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r6 = com.google.android.gms.p006b.zc.m4997a(r2);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r2 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r4 != r2) goto L_0x0085;
    L_0x0056:
        r2 = r19.m3559f();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        if (r2 != 0) goto L_0x006c;
    L_0x005c:
        r3 = new com.google.android.gms.b.pu;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r4 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r5 = 0;
        r7 = 1;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r8 = r8 - r16;
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
    L_0x006b:
        return r3;
    L_0x006c:
        r3 = r2.f2941g;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r3.putAll(r6);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r7 = new com.google.android.gms.b.pu;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r8 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r9 = r2.f2935a;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r10 = r2.f2941g;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r11 = 1;
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r12 = r2 - r16;
        r7.<init>(r8, r9, r10, r11, r12);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r3 = r7;
        goto L_0x006b;
    L_0x0085:
        r2 = r15.getEntity();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        if (r2 == 0) goto L_0x00f9;
    L_0x008b:
        r2 = r15.getEntity();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        r0 = r18;
        r5 = r0.m4999a(r2);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
    L_0x0095:
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r8 = r8 - r16;
        r2 = f4435a;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        if (r2 != 0) goto L_0x00a6;
    L_0x009f:
        r2 = f4436d;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r10 = (long) r2;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x00dc;
    L_0x00a6:
        r7 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";
        r2 = 5;
        r10 = new java.lang.Object[r2];	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r2 = 0;
        r10[r2] = r19;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r2 = 1;
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r10[r2] = r8;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r8 = 2;
        if (r5 == 0) goto L_0x00fd;
    L_0x00b8:
        r2 = r5.length;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
    L_0x00bd:
        r10[r8] = r2;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r2 = 3;
        r3 = r3.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r10[r2] = r3;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r2 = 4;
        r3 = r19.m3563m();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r3 = r3.m3700b();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r10[r2] = r3;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        com.google.android.gms.p006b.yh.m4916b(r7, r10);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
    L_0x00dc:
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 < r2) goto L_0x00e4;
    L_0x00e0:
        r2 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        if (r4 <= r2) goto L_0x0100;
    L_0x00e4:
        r2 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r2.<init>();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        throw r2;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
    L_0x00ea:
        r2 = move-exception;
        r2 = "socket";
        r3 = new com.google.android.gms.b.xx;
        r3.<init>();
        r0 = r19;
        com.google.android.gms.p006b.zc.m4998a(r2, r0, r3);
        goto L_0x0004;
    L_0x00f9:
        r2 = 0;
        r5 = new byte[r2];	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0190 }
        goto L_0x0095;
    L_0x00fd:
        r2 = "null";
        goto L_0x00bd;
    L_0x0100:
        r3 = new com.google.android.gms.b.pu;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r7 = 0;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        r8 = r8 - r16;
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010e, MalformedURLException -> 0x011d, IOException -> 0x0194 }
        goto L_0x006b;
    L_0x010e:
        r2 = move-exception;
        r2 = "connection";
        r3 = new com.google.android.gms.b.xx;
        r3.<init>();
        r0 = r19;
        com.google.android.gms.p006b.zc.m4998a(r2, r0, r3);
        goto L_0x0004;
    L_0x011d:
        r2 = move-exception;
        r3 = new java.lang.RuntimeException;
        r4 = new java.lang.StringBuilder;
        r5 = "Bad URL ";
        r4.<init>(r5);
        r5 = r19.m3557d();
        r4 = r4.append(r5);
        r4 = r4.toString();
        r3.<init>(r4, r2);
        throw r3;
    L_0x0137:
        r2 = move-exception;
        r5 = r14;
    L_0x0139:
        if (r3 == 0) goto L_0x017d;
    L_0x013b:
        r2 = r3.getStatusLine();
        r4 = r2.getStatusCode();
        r2 = "Unexpected response code %d for %s";
        r3 = 2;
        r3 = new java.lang.Object[r3];
        r7 = 0;
        r8 = java.lang.Integer.valueOf(r4);
        r3[r7] = r8;
        r7 = 1;
        r8 = r19.m3557d();
        r3[r7] = r8;
        com.google.android.gms.p006b.yh.m4917c(r2, r3);
        if (r5 == 0) goto L_0x0189;
    L_0x015b:
        r3 = new com.google.android.gms.b.pu;
        r7 = 0;
        r8 = android.os.SystemClock.elapsedRealtime();
        r8 = r8 - r16;
        r3.<init>(r4, r5, r6, r7, r8);
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r4 == r2) goto L_0x016f;
    L_0x016b:
        r2 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r4 != r2) goto L_0x0183;
    L_0x016f:
        r2 = "auth";
        r4 = new com.google.android.gms.b.a;
        r4.<init>(r3);
        r0 = r19;
        com.google.android.gms.p006b.zc.m4998a(r2, r0, r4);
        goto L_0x0004;
    L_0x017d:
        r3 = new com.google.android.gms.b.si;
        r3.<init>(r2);
        throw r3;
    L_0x0183:
        r2 = new com.google.android.gms.b.xs;
        r2.<init>(r3);
        throw r2;
    L_0x0189:
        r2 = new com.google.android.gms.b.on;
        r3 = 0;
        r2.<init>(r3);
        throw r2;
    L_0x0190:
        r2 = move-exception;
        r5 = r14;
        r3 = r15;
        goto L_0x0139;
    L_0x0194:
        r2 = move-exception;
        r3 = r15;
        goto L_0x0139;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.zc.a(com.google.android.gms.b.ue):com.google.android.gms.b.pu");
    }
}
