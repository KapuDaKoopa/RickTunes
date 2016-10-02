package com.google.android.gms.p006b;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.b.bl */
final class bl implements Runnable {
    ValueCallback f2986a;
    final /* synthetic */ bg f2987b;
    final /* synthetic */ WebView f2988c;
    final /* synthetic */ boolean f2989d;
    final /* synthetic */ bj f2990e;

    bl(bj bjVar, bg bgVar, WebView webView, boolean z) {
        this.f2990e = bjVar;
        this.f2987b = bgVar;
        this.f2988c = webView;
        this.f2989d = z;
        this.f2986a = new bm(this);
    }

    public final void run() {
        if (this.f2988c.getSettings().getJavaScriptEnabled()) {
            try {
                this.f2988c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f2986a);
            } catch (Throwable th) {
                this.f2986a.onReceiveValue("");
            }
        }
    }
}
