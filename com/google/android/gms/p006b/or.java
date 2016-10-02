package com.google.android.gms.p006b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.C0449z;
import com.google.android.gms.ads.internal.request.C0476x;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.or */
public final class or extends C0476x {
    private static final Object f3775a;
    private static or f3776b;
    private final Context f3777c;
    private final oq f3778d;
    private final by f3779e;
    private final il f3780f;

    static {
        f3775a = new Object();
    }

    private or(Context context, by byVar, oq oqVar) {
        this.f3777c = context;
        this.f3778d = oqVar;
        this.f3779e = byVar;
        this.f3780f = new il(context.getApplicationContext() != null ? context.getApplicationContext() : context, new VersionInfoParcel(), byVar.f3010a, new oz(this), new iy());
    }

    private static AdResponseParcel m4313a(Context context, il ilVar, by byVar, oq oqVar, AdRequestInfoParcel adRequestInfoParcel) {
        Bundle bundle;
        Future future;
        Throwable e;
        C0501b.m3027a(3);
        ck.m3582a(context);
        cz czVar = new cz(((Boolean) ar.m2249n().m3580a(ck.f3042G)).booleanValue(), "load_ad", adRequestInfoParcel.f2325d.f1903b);
        if (adRequestInfoParcel.f2322a > 10 && adRequestInfoParcel.f2316B != -1) {
            czVar.m3603a(czVar.m3600a(adRequestInfoParcel.f2316B), "cts");
        }
        cv a = czVar.m3599a();
        Bundle bundle2 = (adRequestInfoParcel.f2322a < 4 || adRequestInfoParcel.f2336o == null) ? null : adRequestInfoParcel.f2336o;
        if (!((Boolean) ar.m2249n().m3580a(ck.f3051P)).booleanValue() || oqVar.f3774i == null) {
            bundle = bundle2;
            future = null;
        } else {
            if (bundle2 == null) {
                if (((Boolean) ar.m2249n().m3580a(ck.f3052Q)).booleanValue()) {
                    qk.m4383a();
                    bundle2 = new Bundle();
                }
            }
            if (bundle2 != null) {
                bundle = bundle2;
                future = qx.m4395a(new os(oqVar, context, adRequestInfoParcel, bundle2));
            } else {
                bundle = bundle2;
                future = null;
            }
        }
        jl jlVar = oqVar.f3769d;
        pi a2 = ar.m2246k().m4345a(context);
        if (a2.f3872m == -1) {
            C0501b.m3027a(3);
            return new AdResponseParcel(2);
        }
        String string;
        String uuid = adRequestInfoParcel.f2322a >= 7 ? adRequestInfoParcel.f2344w : UUID.randomUUID().toString();
        pc pcVar = new pc(uuid, adRequestInfoParcel.f2327f.packageName);
        if (adRequestInfoParcel.f2324c.f1886c != null) {
            string = adRequestInfoParcel.f2324c.f1886c.getString("_ad");
            if (string != null) {
                return pb.m4325a(context, adRequestInfoParcel, string);
            }
        }
        jlVar = oqVar.f3769d;
        mg mgVar = oqVar.f3770e;
        string = adRequestInfoParcel.f2326e;
        string = adRequestInfoParcel.f2328g.packageName;
        List a3 = oqVar.f3767b.m3539a(adRequestInfoParcel);
        String a4 = oqVar.f3771f.m4350a(adRequestInfoParcel);
        po poVar = oqVar.f3772g;
        if (future != null) {
            try {
                qk.m4383a();
                future.get(((Long) ar.m2249n().m3580a(ck.f3053R)).longValue(), TimeUnit.MILLISECONDS);
                qk.m4383a();
            } catch (ExecutionException e2) {
                e = e2;
                C0501b.m3026a("Failed to fetch app index signal", e);
            } catch (InterruptedException e3) {
                e = e3;
                C0501b.m3026a("Failed to fetch app index signal", e);
            } catch (TimeoutException e4) {
                C0501b.m3027a(3);
            }
        }
        JSONObject a5 = pb.m4329a(adRequestInfoParcel, a2, a4, a3, bundle);
        if (adRequestInfoParcel.f2322a < 7) {
            try {
                a5.put("request_id", uuid);
            } catch (JSONException e5) {
            }
        }
        if (a5 == null) {
            return new AdResponseParcel(0);
        }
        uuid = a5.toString();
        czVar.m3603a(a, "arc");
        cv a6 = czVar.m3599a();
        if (((Boolean) ar.m2249n().m3580a(ck.f3064c)).booleanValue()) {
            rd.f4041a.post(new ot(ilVar, pcVar, czVar, a6, uuid));
        } else {
            rd.f4041a.post(new ow(context, adRequestInfoParcel, pcVar, czVar, a6, uuid, byVar));
        }
        AdResponseParcel adResponseParcel;
        try {
            ph phVar = (ph) pcVar.f3816d.get(10, TimeUnit.SECONDS);
            if (phVar == null) {
                adResponseParcel = new AdResponseParcel(0);
                return adResponseParcel;
            } else if (phVar.f3856h != -2) {
                adResponseParcel = new AdResponseParcel(phVar.f3856h);
                rd.f4041a.post(new ox(oqVar, context, pcVar, adRequestInfoParcel));
                return adResponseParcel;
            } else {
                if (czVar.m3607e() != null) {
                    czVar.m3603a(czVar.m3607e(), "rur");
                }
                if (phVar.f3852d) {
                    pv pvVar = oqVar.f3766a;
                    string = adRequestInfoParcel.f2328g.packageName;
                }
                String str = adRequestInfoParcel.f2332k.f2539b;
                String str2 = phVar.f3855g;
                boolean z = phVar.f3853e;
                adResponseParcel = or.m4314a(adRequestInfoParcel, context, str, str2, phVar, czVar, oqVar);
                if (adResponseParcel.f2379x == 1) {
                    mg mgVar2 = oqVar.f3770e;
                    String str3 = adRequestInfoParcel.f2328g.packageName;
                }
                czVar.m3603a(a, "tts");
                adResponseParcel.f2381z = czVar.m3605c();
                rd.f4041a.post(new ox(oqVar, context, pcVar, adRequestInfoParcel));
                return adResponseParcel;
            }
        } catch (Exception e6) {
            adResponseParcel = new AdResponseParcel(0);
            return adResponseParcel;
        } finally {
            rd.f4041a.post(new ox(oqVar, context, pcVar, adRequestInfoParcel));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.ads.internal.request.AdResponseParcel m4314a(com.google.android.gms.ads.internal.request.AdRequestInfoParcel r35, android.content.Context r36, java.lang.String r37, java.lang.String r38, com.google.android.gms.p006b.ph r39, com.google.android.gms.p006b.cz r40, com.google.android.gms.p006b.oq r41) {
        /*
        if (r40 == 0) goto L_0x018a;
    L_0x0002:
        r4 = r40.m3599a();
        r5 = r4;
    L_0x0007:
        r33 = new com.google.android.gms.b.pf;	 Catch:{ IOException -> 0x019f }
        r0 = r33;
        r1 = r35;
        r0.<init>(r1);	 Catch:{ IOException -> 0x019f }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x019f }
        r6 = "AdRequestServiceImpl: Sending request: ";
        r4.<init>(r6);	 Catch:{ IOException -> 0x019f }
        r0 = r38;
        r4 = r4.append(r0);	 Catch:{ IOException -> 0x019f }
        r4.toString();	 Catch:{ IOException -> 0x019f }
        r4 = 3;
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r4);	 Catch:{ IOException -> 0x019f }
        r6 = new java.net.URL;	 Catch:{ IOException -> 0x019f }
        r0 = r38;
        r6.<init>(r0);	 Catch:{ IOException -> 0x019f }
        r4 = 0;
        r7 = com.google.android.gms.ads.internal.ar.m2244i();	 Catch:{ IOException -> 0x019f }
        r18 = r7.m4888b();	 Catch:{ IOException -> 0x019f }
        r8 = r4;
        r9 = r6;
    L_0x0036:
        if (r41 == 0) goto L_0x003c;
    L_0x0038:
        r0 = r41;
        r4 = r0.f3773h;	 Catch:{ IOException -> 0x019f }
    L_0x003c:
        r4 = r9.openConnection();	 Catch:{ IOException -> 0x019f }
        r0 = r4;
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ IOException -> 0x019f }
        r34 = r0;
        r4 = com.google.android.gms.ads.internal.ar.m2240e();	 Catch:{ all -> 0x0194 }
        r6 = 0;
        r0 = r36;
        r1 = r37;
        r2 = r34;
        r4.m4456a(r0, r1, r6, r2);	 Catch:{ all -> 0x0194 }
        r4 = 0;
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0194 }
        if (r4 != 0) goto L_0x0062;
    L_0x005a:
        r4 = "x-afma-drt-cookie";
        r6 = 0;
        r0 = r34;
        r0.addRequestProperty(r4, r6);	 Catch:{ all -> 0x0194 }
    L_0x0062:
        r4 = 0;
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0194 }
        if (r4 != 0) goto L_0x0080;
    L_0x0069:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0194 }
        r6 = "Bearer ";
        r4.<init>(r6);	 Catch:{ all -> 0x0194 }
        r6 = 0;
        r4 = r4.append(r6);	 Catch:{ all -> 0x0194 }
        r4 = r4.toString();	 Catch:{ all -> 0x0194 }
        r6 = "Authorization";
        r0 = r34;
        r0.addRequestProperty(r6, r4);	 Catch:{ all -> 0x0194 }
    L_0x0080:
        if (r39 == 0) goto L_0x00b0;
    L_0x0082:
        r0 = r39;
        r4 = r0.f3850b;	 Catch:{ all -> 0x0194 }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0194 }
        if (r4 != 0) goto L_0x00b0;
    L_0x008c:
        r4 = 1;
        r0 = r34;
        r0.setDoOutput(r4);	 Catch:{ all -> 0x0194 }
        r0 = r39;
        r4 = r0.f3850b;	 Catch:{ all -> 0x0194 }
        r4 = r4.getBytes();	 Catch:{ all -> 0x0194 }
        r6 = r4.length;	 Catch:{ all -> 0x0194 }
        r0 = r34;
        r0.setFixedLengthStreamingMode(r6);	 Catch:{ all -> 0x0194 }
        r7 = 0;
        r6 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x018e }
        r10 = r34.getOutputStream();	 Catch:{ all -> 0x018e }
        r6.<init>(r10);	 Catch:{ all -> 0x018e }
        r6.write(r4);	 Catch:{ all -> 0x0253 }
        com.google.android.gms.p006b.xk.m4897a(r6);	 Catch:{ all -> 0x0194 }
    L_0x00b0:
        r4 = r34.getResponseCode();	 Catch:{ all -> 0x0194 }
        r10 = r34.getHeaderFields();	 Catch:{ all -> 0x0194 }
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 < r6) goto L_0x01c3;
    L_0x00bc:
        r6 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r4 >= r6) goto L_0x01c3;
    L_0x00c0:
        r8 = r9.toString();	 Catch:{ all -> 0x0194 }
        r7 = 0;
        r6 = new java.io.InputStreamReader;	 Catch:{ all -> 0x01bd }
        r9 = r34.getInputStream();	 Catch:{ all -> 0x01bd }
        r6.<init>(r9);	 Catch:{ all -> 0x01bd }
        com.google.android.gms.ads.internal.ar.m2240e();	 Catch:{ all -> 0x024f }
        r7 = com.google.android.gms.p006b.rd.m4407a(r6);	 Catch:{ all -> 0x024f }
        com.google.android.gms.p006b.xk.m4897a(r6);	 Catch:{ all -> 0x0194 }
        com.google.android.gms.p006b.or.m4317a(r8, r10, r7, r4);	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r0.f3824b = r8;	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r0.f3825c = r7;	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r0.m4336a(r10);	 Catch:{ all -> 0x0194 }
        if (r40 == 0) goto L_0x00f7;
    L_0x00ea:
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0194 }
        r6 = 0;
        r7 = "ufe";
        r4[r6] = r7;	 Catch:{ all -> 0x0194 }
        r0 = r40;
        r0.m3603a(r5, r4);	 Catch:{ all -> 0x0194 }
    L_0x00f7:
        r4 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r5 = r0.f3847y;	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r6 = r0.f3824b;	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r7 = r0.f3825c;	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r8 = r0.f3826d;	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r9 = r0.f3829g;	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r10 = r0.f3830h;	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r12 = r0.f3831i;	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r13 = r0.f3832j;	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r14 = r0.f3833k;	 Catch:{ all -> 0x0194 }
        r0 = r33;
        r0 = r0.f3834l;	 Catch:{ all -> 0x0194 }
        r16 = r0;
        r0 = r33;
        r0 = r0.f3823a;	 Catch:{ all -> 0x0194 }
        r17 = r0;
        r0 = r33;
        r0 = r0.f3827e;	 Catch:{ all -> 0x0194 }
        r20 = r0;
        r0 = r33;
        r0 = r0.f3828f;	 Catch:{ all -> 0x0194 }
        r21 = r0;
        r0 = r33;
        r0 = r0.f3835m;	 Catch:{ all -> 0x0194 }
        r22 = r0;
        r0 = r33;
        r0 = r0.f3836n;	 Catch:{ all -> 0x0194 }
        r23 = r0;
        r0 = r33;
        r0 = r0.f3837o;	 Catch:{ all -> 0x0194 }
        r24 = r0;
        r0 = r33;
        r0 = r0.f3838p;	 Catch:{ all -> 0x0194 }
        r25 = r0;
        r0 = r33;
        r0 = r0.f3839q;	 Catch:{ all -> 0x0194 }
        r26 = r0;
        r0 = r33;
        r0 = r0.f3840r;	 Catch:{ all -> 0x0194 }
        r27 = r0;
        r0 = r33;
        r0 = r0.f3841s;	 Catch:{ all -> 0x0194 }
        r28 = r0;
        r0 = r33;
        r0 = r0.f3842t;	 Catch:{ all -> 0x0194 }
        r29 = r0;
        r0 = r33;
        r0 = r0.f3843u;	 Catch:{ all -> 0x0194 }
        r30 = r0;
        r0 = r33;
        r0 = r0.f3844v;	 Catch:{ all -> 0x0194 }
        r31 = r0;
        r0 = r33;
        r0 = r0.f3845w;	 Catch:{ all -> 0x0194 }
        r32 = r0;
        r0 = r33;
        r0 = r0.f3846x;	 Catch:{ all -> 0x0194 }
        r33 = r0;
        r4.<init>(r5, r6, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33);	 Catch:{ all -> 0x0194 }
        r34.disconnect();	 Catch:{ IOException -> 0x019f }
        if (r41 == 0) goto L_0x0189;
    L_0x0185:
        r0 = r41;
        r5 = r0.f3773h;	 Catch:{ IOException -> 0x019f }
    L_0x0189:
        return r4;
    L_0x018a:
        r4 = 0;
        r5 = r4;
        goto L_0x0007;
    L_0x018e:
        r4 = move-exception;
        r5 = r7;
    L_0x0190:
        com.google.android.gms.p006b.xk.m4897a(r5);	 Catch:{ all -> 0x0194 }
        throw r4;	 Catch:{ all -> 0x0194 }
    L_0x0194:
        r4 = move-exception;
        r34.disconnect();	 Catch:{ IOException -> 0x019f }
        if (r41 == 0) goto L_0x019e;
    L_0x019a:
        r0 = r41;
        r5 = r0.f3773h;	 Catch:{ IOException -> 0x019f }
    L_0x019e:
        throw r4;	 Catch:{ IOException -> 0x019f }
    L_0x019f:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r6 = "Error while connecting to ad server: ";
        r5.<init>(r6);
        r4 = r4.getMessage();
        r4 = r5.append(r4);
        r4 = r4.toString();
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r4);
        r4 = new com.google.android.gms.ads.internal.request.AdResponseParcel;
        r5 = 2;
        r4.<init>(r5);
        goto L_0x0189;
    L_0x01bd:
        r4 = move-exception;
        r5 = r7;
    L_0x01bf:
        com.google.android.gms.p006b.xk.m4897a(r5);	 Catch:{ all -> 0x0194 }
        throw r4;	 Catch:{ all -> 0x0194 }
    L_0x01c3:
        r6 = r9.toString();	 Catch:{ all -> 0x0194 }
        r7 = 0;
        com.google.android.gms.p006b.or.m4317a(r6, r10, r7, r4);	 Catch:{ all -> 0x0194 }
        r6 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r4 < r6) goto L_0x0216;
    L_0x01cf:
        r6 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r4 >= r6) goto L_0x0216;
    L_0x01d3:
        r4 = "Location";
        r0 = r34;
        r4 = r0.getHeaderField(r4);	 Catch:{ all -> 0x0194 }
        r6 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x0194 }
        if (r6 == 0) goto L_0x01f6;
    L_0x01e1:
        r4 = "No location header to follow redirect.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r4);	 Catch:{ all -> 0x0194 }
        r4 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0194 }
        r5 = 0;
        r4.<init>(r5);	 Catch:{ all -> 0x0194 }
        r34.disconnect();	 Catch:{ IOException -> 0x019f }
        if (r41 == 0) goto L_0x0189;
    L_0x01f1:
        r0 = r41;
        r5 = r0.f3773h;	 Catch:{ IOException -> 0x019f }
        goto L_0x0189;
    L_0x01f6:
        r6 = new java.net.URL;	 Catch:{ all -> 0x0194 }
        r6.<init>(r4);	 Catch:{ all -> 0x0194 }
        r4 = r8 + 1;
        r7 = 5;
        if (r4 <= r7) goto L_0x0239;
    L_0x0200:
        r4 = "Too many redirects.";
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r4);	 Catch:{ all -> 0x0194 }
        r4 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0194 }
        r5 = 0;
        r4.<init>(r5);	 Catch:{ all -> 0x0194 }
        r34.disconnect();	 Catch:{ IOException -> 0x019f }
        if (r41 == 0) goto L_0x0189;
    L_0x0210:
        r0 = r41;
        r5 = r0.f3773h;	 Catch:{ IOException -> 0x019f }
        goto L_0x0189;
    L_0x0216:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0194 }
        r6 = "Received error HTTP response code: ";
        r5.<init>(r6);	 Catch:{ all -> 0x0194 }
        r4 = r5.append(r4);	 Catch:{ all -> 0x0194 }
        r4 = r4.toString();	 Catch:{ all -> 0x0194 }
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r4);	 Catch:{ all -> 0x0194 }
        r4 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0194 }
        r5 = 0;
        r4.<init>(r5);	 Catch:{ all -> 0x0194 }
        r34.disconnect();	 Catch:{ IOException -> 0x019f }
        if (r41 == 0) goto L_0x0189;
    L_0x0233:
        r0 = r41;
        r5 = r0.f3773h;	 Catch:{ IOException -> 0x019f }
        goto L_0x0189;
    L_0x0239:
        r0 = r33;
        r0.m4336a(r10);	 Catch:{ all -> 0x0194 }
        r34.disconnect();	 Catch:{ IOException -> 0x019f }
        if (r41 == 0) goto L_0x024b;
    L_0x0243:
        r0 = r41;
        r7 = r0.f3773h;	 Catch:{ IOException -> 0x019f }
        r8 = r4;
        r9 = r6;
        goto L_0x0036;
    L_0x024b:
        r8 = r4;
        r9 = r6;
        goto L_0x0036;
    L_0x024f:
        r4 = move-exception;
        r5 = r6;
        goto L_0x01bf;
    L_0x0253:
        r4 = move-exception;
        r5 = r6;
        goto L_0x0190;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.or.a(com.google.android.gms.ads.internal.request.AdRequestInfoParcel, android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.b.ph, com.google.android.gms.b.cz, com.google.android.gms.b.oq):com.google.android.gms.ads.internal.request.AdResponseParcel");
    }

    public static or m4315a(Context context, by byVar, oq oqVar) {
        or orVar;
        synchronized (f3775a) {
            if (f3776b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                f3776b = new or(context, byVar, oqVar);
            }
            orVar = f3776b;
        }
        return orVar;
    }

    private static void m4317a(String str, Map map, String str2, int i) {
        if (C0501b.m3027a(2)) {
            "Http Response: {\n  URL:\n    " + str + "\n  Headers:";
            qk.m4383a();
            if (map != null) {
                for (String str3 : map.keySet()) {
                    "    " + str3 + ":";
                    qk.m4383a();
                    for (String str32 : (List) map.get(str32)) {
                        "      " + str32;
                        qk.m4383a();
                    }
                }
            }
            qk.m4383a();
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    str2.substring(i2, Math.min(str2.length(), i2 + 1000));
                    qk.m4383a();
                }
            } else {
                qk.m4383a();
            }
            "  Response Code:\n    " + i + "\n}";
            qk.m4383a();
        }
    }

    public final AdResponseParcel m4318a(AdRequestInfoParcel adRequestInfoParcel) {
        return or.m4313a(this.f3777c, this.f3780f, this.f3779e, this.f3778d, adRequestInfoParcel);
    }

    public final void m4319a(AdRequestInfoParcel adRequestInfoParcel, C0449z c0449z) {
        ar.m2243h().m4364a(this.f3777c, adRequestInfoParcel.f2332k);
        qx.m4394a(new pa(this, adRequestInfoParcel, c0449z));
    }
}
