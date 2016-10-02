package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;

@TargetApi(9)
/* renamed from: com.google.android.gms.b.rh */
public class rh extends rg {
    public rh() {
        super();
    }

    public final int m4480a() {
        return 6;
    }

    public boolean m4481a(Request request) {
        request.setShowRunningNotification(true);
        return true;
    }

    public final int m4482b() {
        return 7;
    }
}
