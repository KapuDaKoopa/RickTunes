package com.andromo.dev576782.app537736;

import android.os.AsyncTask;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class ew extends AsyncTask {
    private boolean f878a;
    private ex f879b;
    private long f880c;
    private long f881d;
    private String f882e;
    private long f883f;

    public ew(ex exVar, long j) {
        this.f878a = false;
        this.f879b = exVar;
        this.f883f = j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.andromo.dev576782.app537736.ey m1411a(java.lang.String... r13) {
        /*
        r12 = this;
        r1 = new com.andromo.dev576782.app537736.ey;
        r1.<init>();
        r0 = 0;
        r2 = 0;
        r2 = r13[r2];	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r12.f882e = r2;	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r12.f880c = r2;	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r2 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r3 = r12.f882e;	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r2.<init>(r3);	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r4 = r2.openConnection();	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r2 = "Icy-MetaData";
        r3 = "1";
        r4.setRequestProperty(r2, r3);	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r2 = "Connection";
        r3 = "close";
        r4.setRequestProperty(r2, r3);	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r2 = "Accept";
        r3 = "*/*";
        r4.setRequestProperty(r2, r3);	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r4.connect();	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r3 = -1;
        r5 = r4.getHeaderFields();	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r2 = new java.io.BufferedInputStream;	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r6 = r4.getInputStream();	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r2.<init>(r6);	 Catch:{ MalformedURLException -> 0x01ac, IOException -> 0x01b8, all -> 0x01c5 }
        r0 = "icy-name";
        r0 = r5.containsKey(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        if (r0 == 0) goto L_0x005b;
    L_0x004a:
        r0 = "icy-name";
        r0 = r5.get(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = (java.util.List) r0;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r6 = 0;
        r0 = r0.get(r6);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = (java.lang.String) r0;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r1.f885b = r0;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
    L_0x005b:
        r0 = "icy-metaint";
        r0 = r5.containsKey(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        if (r0 == 0) goto L_0x0082;
    L_0x0063:
        r0 = "icy-metaint";
        r0 = r5.get(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = (java.util.List) r0;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r3 = 0;
        r0 = r0.get(r3);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = (java.lang.String) r0;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r5 = r0;
    L_0x0077:
        r0 = -1;
        if (r5 != r0) goto L_0x0145;
    L_0x007a:
        r0 = 1;
        r12.f878a = r0;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r2.close();	 Catch:{ IOException -> 0x013f }
    L_0x0080:
        r0 = r1;
    L_0x0081:
        return r0;
    L_0x0082:
        r0 = com.andromo.dev576782.app537736.fg.f899a;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = r0.size();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r5 = com.andromo.dev576782.app537736.gt.f982a;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r5 = r5.size();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = r0 + r5;
        r5 = com.andromo.dev576782.app537736.C0196a.f626a;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r5 = r5.size();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = r0 + r5;
        r5 = com.andromo.dev576782.app537736.hm.f1064a;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r5 = r5.size();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = r0 + r5;
        r5 = new java.util.ArrayList;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r5.<init>(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = com.andromo.dev576782.app537736.fg.f899a;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r5.addAll(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = com.andromo.dev576782.app537736.gt.f982a;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r5.addAll(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = com.andromo.dev576782.app537736.C0196a.f626a;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r5.addAll(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = com.andromo.dev576782.app537736.hm.f1064a;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r5.addAll(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = com.andromo.dev576782.app537736.dy.m1356a(r4, r5);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        if (r0 == 0) goto L_0x00c9;
    L_0x00bc:
        r0 = 1;
        r12.f878a = r0;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r2.close();	 Catch:{ IOException -> 0x00c4 }
    L_0x00c2:
        r0 = r1;
        goto L_0x0081;
    L_0x00c4:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x00c2;
    L_0x00c9:
        r5 = new com.andromo.dev576782.app537736.dp;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r5.<init>(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = 0;
    L_0x00d5:
        r4 = r2.read();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r8 = -1;
        if (r4 == r8) goto L_0x011f;
    L_0x00dc:
        r4 = (char) r4;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r5.m1342b(r4);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r4 = "\r\n\r\n";
        r4 = r5.m1339a(r4);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        if (r4 != 0) goto L_0x011f;
    L_0x00e8:
        r4 = r12.isCancelled();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        if (r4 == 0) goto L_0x00f8;
    L_0x00ee:
        r2.close();	 Catch:{ IOException -> 0x00f3 }
    L_0x00f1:
        r0 = r1;
        goto L_0x0081;
    L_0x00f3:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x00f1;
    L_0x00f8:
        r4 = r0 + 1;
        r8 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        if (r0 <= r8) goto L_0x01e3;
    L_0x00ff:
        r0 = 0;
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r8 = r8 - r6;
        r10 = 0;
        r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r4 < 0) goto L_0x0111;
    L_0x010b:
        r10 = r12.f883f;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r4 < 0) goto L_0x00d5;
    L_0x0111:
        r0 = 1;
        r12.f878a = r0;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r2.close();	 Catch:{ IOException -> 0x011a }
    L_0x0117:
        r0 = r1;
        goto L_0x0081;
    L_0x011a:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0117;
    L_0x011f:
        r0 = "\\r\\n(icy-metaint):\\s*(.*)\\r\\n";
        r0 = java.util.regex.Pattern.compile(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r4 = r5.toString();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = r0.matcher(r4);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r4 = r0.find();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        if (r4 == 0) goto L_0x01e0;
    L_0x0133:
        r3 = 2;
        r0 = r0.group(r3);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r5 = r0;
        goto L_0x0077;
    L_0x013f:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x0080;
    L_0x0145:
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r12.f881d = r6;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r3 = 0;
        r0 = 4080; // 0xff0 float:5.717E-42 double:2.016E-320;
        r6 = new java.lang.StringBuilder;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r4 = 4080; // 0xff0 float:5.717E-42 double:2.016E-320;
        r6.<init>(r4);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
    L_0x0155:
        r7 = r2.read();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r4 = -1;
        if (r7 == r4) goto L_0x0180;
    L_0x015c:
        r4 = r3 + 1;
        r3 = r5 + 1;
        if (r4 != r3) goto L_0x01de;
    L_0x0162:
        r0 = r7 * 16;
        r3 = r0;
    L_0x0165:
        r0 = r5 + 1;
        if (r4 <= r0) goto L_0x01a5;
    L_0x0169:
        r0 = r5 + r3;
        if (r4 >= r0) goto L_0x01a5;
    L_0x016d:
        r0 = 1;
    L_0x016e:
        if (r0 == 0) goto L_0x0176;
    L_0x0170:
        if (r7 == 0) goto L_0x0176;
    L_0x0172:
        r0 = (char) r7;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r6.append(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
    L_0x0176:
        r0 = r5 + r3;
        if (r4 > r0) goto L_0x0180;
    L_0x017a:
        r0 = r12.isCancelled();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        if (r0 == 0) goto L_0x01da;
    L_0x0180:
        r0 = r6.toString();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = m1412a(r0);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r3 = "StreamTitle";
        r3 = r0.containsKey(r3);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        if (r3 == 0) goto L_0x019f;
    L_0x0190:
        r3 = "StreamTitle";
        r0 = r0.get(r3);	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = (java.lang.String) r0;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r1.f884a = r0;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0 = r1.f884a;	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
        r0.trim();	 Catch:{ MalformedURLException -> 0x01d7, IOException -> 0x01d5, all -> 0x01d3 }
    L_0x019f:
        r2.close();	 Catch:{ IOException -> 0x01a7 }
    L_0x01a2:
        r0 = r1;
        goto L_0x0081;
    L_0x01a5:
        r0 = 0;
        goto L_0x016e;
    L_0x01a7:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x01a2;
    L_0x01ac:
        r2 = move-exception;
    L_0x01ad:
        if (r0 == 0) goto L_0x01a2;
    L_0x01af:
        r0.close();	 Catch:{ IOException -> 0x01b3 }
        goto L_0x01a2;
    L_0x01b3:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x01a2;
    L_0x01b8:
        r2 = move-exception;
        r2 = r0;
    L_0x01ba:
        if (r2 == 0) goto L_0x01a2;
    L_0x01bc:
        r2.close();	 Catch:{ IOException -> 0x01c0 }
        goto L_0x01a2;
    L_0x01c0:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x01a2;
    L_0x01c5:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
    L_0x01c8:
        if (r2 == 0) goto L_0x01cd;
    L_0x01ca:
        r2.close();	 Catch:{ IOException -> 0x01ce }
    L_0x01cd:
        throw r0;
    L_0x01ce:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x01cd;
    L_0x01d3:
        r0 = move-exception;
        goto L_0x01c8;
    L_0x01d5:
        r0 = move-exception;
        goto L_0x01ba;
    L_0x01d7:
        r0 = move-exception;
        r0 = r2;
        goto L_0x01ad;
    L_0x01da:
        r0 = r3;
        r3 = r4;
        goto L_0x0155;
    L_0x01de:
        r3 = r0;
        goto L_0x0165;
    L_0x01e0:
        r5 = r3;
        goto L_0x0077;
    L_0x01e3:
        r0 = r4;
        goto L_0x00d5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.andromo.dev576782.app537736.ew.a(java.lang.String[]):com.andromo.dev576782.app537736.ey");
    }

    private static Map m1412a(String str) {
        Map hashMap = new HashMap();
        String[] split = str.split(";");
        Pattern compile = Pattern.compile("^([a-zA-Z]+)=\\'(.*)\\'$");
        for (CharSequence matcher : split) {
            Matcher matcher2 = compile.matcher(matcher);
            if (matcher2.find()) {
                hashMap.put(matcher2.group(1), matcher2.group(2));
            }
        }
        return hashMap;
    }

    public final void m1413a() {
        this.f879b = null;
    }

    public final String m1414b() {
        return this.f882e != null ? this.f882e : "";
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m1411a((String[]) objArr);
    }

    protected final void onCancelled() {
        this.f879b = null;
        this.f882e = "";
        this.f881d = 0;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        ey eyVar = (ey) obj;
        if (!isCancelled() && this.f879b != null) {
            if (eyVar != null) {
                this.f879b.m1329a(eyVar.f884a, eyVar.f885b);
            } else {
                this.f879b.m1329a("", "");
            }
        }
    }
}
