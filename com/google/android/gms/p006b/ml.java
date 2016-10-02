package com.google.android.gms.p006b;

import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.b.ml */
final class ml implements Runnable {
    final /* synthetic */ String f3653a;
    final /* synthetic */ String f3654b;
    final /* synthetic */ mk f3655c;

    ml(mk mkVar, String str, String str2) {
        this.f3655c = mkVar;
        this.f3653a = str;
        this.f3654b = str2;
    }

    public final void run() {
        WebView webView = new WebView(this.f3655c.f3651a);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new mm(this, webView));
        this.f3655c.f3652b.add(webView);
        webView.loadDataWithBaseURL(this.f3653a, this.f3654b, "text/html", "UTF-8", null);
        C0501b.m3027a(3);
    }
}
