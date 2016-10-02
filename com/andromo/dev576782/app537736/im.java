package com.andromo.dev576782.app537736;

import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage.QuotaUpdater;

final class im extends WebChromeClient {
    final /* synthetic */ Website344366 f1176a;

    private im(Website344366 website344366) {
        this.f1176a = website344366;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        quotaUpdater.updateQuota(2 * j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        if (this.f1176a.f624g) {
            callback.invoke(str, true, false);
        }
    }
}
