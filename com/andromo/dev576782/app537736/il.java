package com.andromo.dev576782.app537736;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.CookieSyncManager;
import android.webkit.URLUtil;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

final class il extends WebViewClient {
    String f1174a;
    final /* synthetic */ Website344366 f1175b;

    private il(Website344366 website344366) {
        this.f1175b = website344366;
        this.f1174a = "";
    }

    public final void onLoadResource(WebView webView, String str) {
    }

    public final void onPageFinished(WebView webView, String str) {
        this.f1175b.f623f = false;
        this.f1175b.m1201b();
        CookieSyncManager.getInstance().sync();
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f1175b.f623f = true;
        this.f1175b.m1200a();
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        if (!(str == null || str.equals(""))) {
            Uri parse = Uri.parse(str);
            str2 = null;
            if (parse != null) {
                str2 = parse.getScheme();
            }
            Website344366 website344366 = this.f1175b;
            if (fa.m1417a(str) && fa.m1418b(this.f1175b, str)) {
                return true;
            }
            if (str2 != null) {
                if (str2.equals("tel")) {
                    try {
                        this.f1175b.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
                        this.f1174a = str;
                        return true;
                    } catch (Exception e) {
                        Toast.makeText(this.f1175b.getApplicationContext(), 2131230854, 0).show();
                        return true;
                    }
                } else if (str2.equals("mailto") || str2.equals("geo") || str2.equals("market")) {
                    try {
                        this.f1175b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        this.f1174a = str;
                        return true;
                    } catch (Exception e2) {
                        webView.loadUrl(str);
                        this.f1174a = str;
                        return true;
                    }
                } else if (str2.equals("vnd.youtube")) {
                    try {
                        this.f1175b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        this.f1174a = str;
                        return true;
                    } catch (Exception e3) {
                        webView.loadUrl(str);
                        this.f1174a = str;
                        return true;
                    }
                }
            }
        }
        if (this.f1175b.f621d) {
            try {
                if (URLUtil.isAssetUrl(str)) {
                    webView.loadUrl(str);
                    this.f1174a = str;
                    return true;
                }
                try {
                    fa.m1415a(webView.getContext(), str);
                    this.f1174a = str;
                    return true;
                } catch (ActivityNotFoundException e4) {
                    webView.loadUrl(str);
                    this.f1174a = str;
                    return true;
                }
            } catch (Exception e5) {
                webView.loadUrl(str);
                this.f1174a = str;
                return true;
            }
        } else if (str.equals("file:///android_asset/webkit/")) {
            return false;
        } else {
            if (str.equals("about:blank")) {
                webView.loadUrl(this.f1174a);
                str2 = this.f1174a;
            } else {
                webView.loadUrl(str);
                this.f1174a = str;
            }
            return true;
        }
    }
}
