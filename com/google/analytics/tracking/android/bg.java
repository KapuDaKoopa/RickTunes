package com.google.analytics.tracking.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

final class bg implements C0293o {
    private final String f1626a;
    private final HttpClient f1627b;
    private final Context f1628c;
    private ap f1629d;
    private URL f1630e;

    bg(HttpClient httpClient, Context context) {
        this(httpClient, ap.m1817a(context), context);
    }

    private bg(HttpClient httpClient, ap apVar, Context context) {
        this.f1628c = context.getApplicationContext();
        String str = VERSION.RELEASE;
        String a = bk.m1911a(Locale.getDefault());
        String str2 = Build.MODEL;
        String str3 = Build.ID;
        this.f1626a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", "3.0", str, a, str2, str3});
        this.f1627b = httpClient;
        this.f1629d = apVar;
    }

    private URL m1899a(aq aqVar) {
        if (this.f1630e != null) {
            return this.f1630e;
        }
        try {
            return new URL("http:".equals(aqVar.f1591d) ? "http://www.google-analytics.com/collect" : "https://ssl.google-analytics.com/collect");
        } catch (MalformedURLException e) {
            as.m1827a("Error trying to parse the hardcoded host url. This really shouldn't happen.");
            return null;
        }
    }

    private HttpEntityEnclosingRequest m1900a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            as.m1832d("Empty hit, discarding.");
            return null;
        }
        HttpEntityEnclosingRequest basicHttpEntityEnclosingRequest;
        String str3 = str2 + "?" + str;
        if (str3.length() < 2036) {
            basicHttpEntityEnclosingRequest = new BasicHttpEntityEnclosingRequest("GET", str3);
        } else {
            basicHttpEntityEnclosingRequest = new BasicHttpEntityEnclosingRequest("POST", str2);
            try {
                basicHttpEntityEnclosingRequest.setEntity(new StringEntity(str));
            } catch (UnsupportedEncodingException e) {
                as.m1832d("Encoding error, discarding hit");
                return null;
            }
        }
        basicHttpEntityEnclosingRequest.addHeader("User-Agent", this.f1626a);
        return basicHttpEntityEnclosingRequest;
    }

    private static void m1901a(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Object obj : httpEntityEnclosingRequest.getAllHeaders()) {
            stringBuffer.append(obj.toString()).append("\n");
        }
        stringBuffer.append(httpEntityEnclosingRequest.getRequestLine().toString()).append("\n");
        if (httpEntityEnclosingRequest.getEntity() != null) {
            try {
                InputStream content = httpEntityEnclosingRequest.getEntity().getContent();
                if (content != null) {
                    int available = content.available();
                    if (available > 0) {
                        byte[] bArr = new byte[available];
                        content.read(bArr);
                        stringBuffer.append("POST:\n");
                        stringBuffer.append(new String(bArr)).append("\n");
                    }
                }
            } catch (IOException e) {
                as.m1831c("Error Writing hit to log...");
            }
        }
        as.m1831c(stringBuffer.toString());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m1902a(java.util.List r18) {
        /*
        r17 = this;
        r4 = 0;
        r2 = r18.size();
        r3 = 40;
        r6 = java.lang.Math.min(r2, r3);
        r3 = 1;
        r2 = 0;
        r5 = r2;
    L_0x000e:
        if (r5 >= r6) goto L_0x0150;
    L_0x0010:
        r0 = r18;
        r2 = r0.get(r5);
        r2 = (com.google.analytics.tracking.android.aq) r2;
        r0 = r17;
        r7 = r0.m1899a(r2);
        if (r7 != 0) goto L_0x0047;
    L_0x0020:
        r7 = com.google.analytics.tracking.android.as.m1828a();
        if (r7 == 0) goto L_0x0041;
    L_0x0026:
        r7 = new java.lang.StringBuilder;
        r8 = "No destination: discarding hit: ";
        r7.<init>(r8);
        r2 = r2.f1588a;
        r2 = r7.append(r2);
        r2 = r2.toString();
        com.google.analytics.tracking.android.as.m1832d(r2);
    L_0x003a:
        r2 = r4 + 1;
    L_0x003c:
        r4 = r5 + 1;
        r5 = r4;
        r4 = r2;
        goto L_0x000e;
    L_0x0041:
        r2 = "No destination: discarding hit.";
        com.google.analytics.tracking.android.as.m1832d(r2);
        goto L_0x003a;
    L_0x0047:
        r8 = new org.apache.http.HttpHost;
        r9 = r7.getHost();
        r10 = r7.getPort();
        r11 = r7.getProtocol();
        r8.<init>(r9, r10, r11);
        r7 = r7.getPath();
        r9 = r2.f1588a;
        r9 = android.text.TextUtils.isEmpty(r9);
        if (r9 == 0) goto L_0x0071;
    L_0x0064:
        r2 = "";
    L_0x0066:
        r0 = r17;
        r7 = r0.m1900a(r2, r7);
        if (r7 != 0) goto L_0x00a9;
    L_0x006e:
        r2 = r4 + 1;
        goto L_0x003c;
    L_0x0071:
        r10 = java.lang.System.currentTimeMillis();
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r12 = r2.f1588a;
        r9.append(r12);
        r12 = r2.f1590c;
        r14 = 0;
        r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r12 <= 0) goto L_0x0099;
    L_0x0087:
        r12 = r2.f1590c;
        r10 = r10 - r12;
        r12 = 0;
        r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r12 < 0) goto L_0x0099;
    L_0x0090:
        r12 = "&qt=";
        r12 = r9.append(r12);
        r12.append(r10);
    L_0x0099:
        r10 = "&z=";
        r10 = r9.append(r10);
        r12 = r2.f1589b;
        r10.append(r12);
        r2 = r9.toString();
        goto L_0x0066;
    L_0x00a9:
        r9 = "Host";
        r10 = r8.toHostString();
        r7.addHeader(r9, r10);
        r9 = com.google.analytics.tracking.android.as.m1828a();
        if (r9 == 0) goto L_0x00bb;
    L_0x00b8:
        m1901a(r7);
    L_0x00bb:
        r2 = r2.length();
        r9 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        if (r2 <= r9) goto L_0x00d2;
    L_0x00c3:
        r2 = "Hit too long (> 8192 bytes)--not sent";
        com.google.analytics.tracking.android.as.m1832d(r2);
        r2 = r3;
    L_0x00c9:
        r3 = r4 + 1;
        r16 = r2;
        r2 = r3;
        r3 = r16;
        goto L_0x003c;
    L_0x00d2:
        r0 = r17;
        r2 = r0.f1629d;
        r2 = r2.m1823b();
        if (r2 == 0) goto L_0x00e3;
    L_0x00dc:
        r2 = "Dry run enabled. Hit not actually sent.";
        com.google.analytics.tracking.android.as.m1830b(r2);
        r2 = r3;
        goto L_0x00c9;
    L_0x00e3:
        if (r3 == 0) goto L_0x0155;
    L_0x00e5:
        r0 = r17;
        r2 = r0.f1628c;	 Catch:{ ClientProtocolException -> 0x0152, IOException -> 0x012c }
        com.google.analytics.tracking.android.C0308v.m1948b(r2);	 Catch:{ ClientProtocolException -> 0x0152, IOException -> 0x012c }
        r2 = 0;
    L_0x00ed:
        r0 = r17;
        r3 = r0.f1627b;	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
        r3 = r3.execute(r8, r7);	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
        r7 = r3.getStatusLine();	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
        r7 = r7.getStatusCode();	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
        r8 = r3.getEntity();	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
        if (r8 == 0) goto L_0x0106;
    L_0x0103:
        r8.consumeContent();	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
    L_0x0106:
        r8 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r7 == r8) goto L_0x00c9;
    L_0x010a:
        r7 = new java.lang.StringBuilder;	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
        r8 = "Bad response: ";
        r7.<init>(r8);	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
        r3 = r3.getStatusLine();	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
        r3 = r3.getStatusCode();	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
        r3 = r7.append(r3);	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
        r3 = r3.toString();	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
        com.google.analytics.tracking.android.as.m1832d(r3);	 Catch:{ ClientProtocolException -> 0x0125, IOException -> 0x012c }
        goto L_0x00c9;
    L_0x0125:
        r3 = move-exception;
    L_0x0126:
        r3 = "ClientProtocolException sending hit; discarding hit...";
        com.google.analytics.tracking.android.as.m1832d(r3);
        goto L_0x00c9;
    L_0x012c:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r5 = "Exception sending hit: ";
        r3.<init>(r5);
        r5 = r2.getClass();
        r5 = r5.getSimpleName();
        r3 = r3.append(r5);
        r3 = r3.toString();
        com.google.analytics.tracking.android.as.m1832d(r3);
        r2 = r2.getMessage();
        com.google.analytics.tracking.android.as.m1832d(r2);
        r2 = r4;
    L_0x014f:
        return r2;
    L_0x0150:
        r2 = r4;
        goto L_0x014f;
    L_0x0152:
        r2 = move-exception;
        r2 = r3;
        goto L_0x0126;
    L_0x0155:
        r2 = r3;
        goto L_0x00ed;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.analytics.tracking.android.bg.a(java.util.List):int");
    }

    public final void m1903a(String str) {
        try {
            this.f1630e = new URL(str);
        } catch (MalformedURLException e) {
            this.f1630e = null;
        }
    }

    public final boolean m1904a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f1628c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        as.m1831c("...no network connectivity");
        return false;
    }
}
