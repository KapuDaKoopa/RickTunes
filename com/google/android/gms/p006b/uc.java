package com.google.android.gms.p006b;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.internal.av;
import java.net.URI;
import java.net.URISyntaxException;

@op
/* renamed from: com.google.android.gms.b.uc */
public final class uc extends WebViewClient {
    private final String f4213a;
    private boolean f4214b;
    private final tf f4215c;
    private final nn f4216d;

    public uc(nn nnVar, tf tfVar, String str) {
        this.f4213a = uc.m4744b(str);
        this.f4214b = false;
        this.f4215c = tfVar;
        this.f4216d = nnVar;
    }

    private boolean m4743a(String str) {
        Object b = uc.m4744b(str);
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        try {
            URI uri = new URI(b);
            if ("passback".equals(uri.getScheme())) {
                C0501b.m3027a(3);
                this.f4216d.m4254b();
                return true;
            } else if (TextUtils.isEmpty(this.f4213a)) {
                return false;
            } else {
                URI uri2 = new URI(this.f4213a);
                String host = uri2.getHost();
                String host2 = uri.getHost();
                String path = uri2.getPath();
                String path2 = uri.getPath();
                if (!av.m5525a(host, host2) || !av.m5525a(path, path2)) {
                    return false;
                }
                C0501b.m3027a(3);
                this.f4216d.m4254b();
                return true;
            }
        } catch (URISyntaxException e) {
            e.getMessage();
            C0501b.m3027a(6);
            return false;
        }
    }

    private static String m4744b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (str.endsWith("/")) {
                    str = str.substring(0, str.length() - 1);
                }
            } catch (IndexOutOfBoundsException e) {
                e.getMessage();
                C0501b.m3027a(6);
            }
        }
        return str;
    }

    public final void onLoadResource(WebView webView, String str) {
        "JavascriptAdWebViewClient::onLoadResource: " + str;
        C0501b.m3027a(3);
        if (!m4743a(str)) {
            this.f4215c.m4579l().onLoadResource(this.f4215c.m4553a(), str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        "JavascriptAdWebViewClient::onPageFinished: " + str;
        C0501b.m3027a(3);
        if (!this.f4214b) {
            this.f4216d.m4252a();
            this.f4214b = true;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        "JavascriptAdWebViewClient::shouldOverrideUrlLoading: " + str;
        C0501b.m3027a(3);
        if (!m4743a(str)) {
            return this.f4215c.m4579l().shouldOverrideUrlLoading(this.f4215c.m4553a(), str);
        }
        C0501b.m3027a(3);
        return true;
    }
}
