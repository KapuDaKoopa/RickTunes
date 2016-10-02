package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.webkit.WebChromeClient;

@TargetApi(14)
/* renamed from: com.google.android.gms.b.rk */
public class rk extends ri {
    public final String m4491a(SslError sslError) {
        return sslError.getUrl();
    }

    public final WebChromeClient m4492c(tf tfVar) {
        return new ub(tfVar);
    }
}
