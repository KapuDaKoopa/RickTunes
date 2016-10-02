package com.google.android.gms.p006b;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.b.mm */
final class mm extends WebViewClient {
    final /* synthetic */ WebView f3656a;
    final /* synthetic */ ml f3657b;

    mm(ml mlVar, WebView webView) {
        this.f3657b = mlVar;
        this.f3656a = webView;
    }

    public final void onPageFinished(WebView webView, String str) {
        C0501b.m3027a(3);
        this.f3657b.f3655c.f3652b.remove(this.f3656a);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C0501b.m3025a("Loading assets have failed.");
        this.f3657b.f3655c.f3652b.remove(this.f3656a);
    }
}
