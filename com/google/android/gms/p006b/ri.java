package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.io.File;
import java.util.Set;

@TargetApi(11)
/* renamed from: com.google.android.gms.b.ri */
public class ri extends rh {
    public final tg m4483a(tf tfVar, boolean z) {
        return new ua(tfVar, z);
    }

    public final Set m4484a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    public final boolean m4485a(Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    public boolean m4486a(Context context, WebSettings webSettings) {
        super.m4471a(context, webSettings);
        if (((File) sk.m4527a(new rj(this, context))) != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(false);
        return true;
    }

    public final boolean m4487a(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    public final boolean m4488b(View view) {
        view.setLayerType(0, null);
        return true;
    }

    public WebChromeClient m4489c(tf tfVar) {
        return new ts(tfVar);
    }

    public final boolean m4490c(View view) {
        view.setLayerType(1, null);
        return true;
    }
}
