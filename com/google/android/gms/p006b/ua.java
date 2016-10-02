package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@TargetApi(11)
@op
/* renamed from: com.google.android.gms.b.ua */
public final class ua extends tg {
    public ua(tf tfVar, boolean z) {
        super(tfVar, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Exception e;
        try {
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                return super.shouldInterceptRequest(webView, str);
            }
            if (webView instanceof tf) {
                tf tfVar = (tf) webView;
                tg l = tfVar.m4579l();
                synchronized (l.f4133b) {
                    l.f4134c = false;
                    l.f4135d = true;
                    rd.m4419a(new th(l));
                }
                String str2 = tfVar.m4578k().f1906e ? (String) ar.m2249n().m3580a(ck.f3041F) : tfVar.m4583p() ? (String) ar.m2249n().m3580a(ck.f3040E) : (String) ar.m2249n().m3580a(ck.f3039D);
                "shouldInterceptRequest(" + str2 + ")";
                qk.m4383a();
                Context context = tfVar.getContext();
                String str3 = this.a.m4582o().f2539b;
                Map hashMap = new HashMap();
                hashMap.put("User-Agent", ar.m2240e().m4453a(context, str3));
                hashMap.put("Cache-Control", "max-stale=3600");
                String str4 = (String) new rw(context).m4511a(str2, hashMap).get(60, TimeUnit.SECONDS);
                return str4 == null ? null : new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str4.getBytes("UTF-8")));
            } else {
                C0501b.m3025a("Tried to intercept request from a WebView that wasn't an AdWebView.");
                return super.shouldInterceptRequest(webView, str);
            }
        } catch (IOException e2) {
            e = e2;
            C0501b.m3025a("Could not fetch MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, str);
        } catch (ExecutionException e3) {
            e = e3;
            C0501b.m3025a("Could not fetch MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, str);
        } catch (InterruptedException e4) {
            e = e4;
            C0501b.m3025a("Could not fetch MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, str);
        } catch (TimeoutException e5) {
            e = e5;
            C0501b.m3025a("Could not fetch MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, str);
        }
    }
}
