package com.google.tagmanager;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.analytics.tracking.android.CampaignTrackingService;

public final class InstallReferrerService extends IntentService {
    CampaignTrackingService f5041a;
    Context f5042b;

    public InstallReferrerService() {
        super("InstallReferrerService");
    }

    protected final void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        Context applicationContext = this.f5042b != null ? this.f5042b : getApplicationContext();
        C0823y.m5933a(applicationContext, stringExtra);
        if (this.f5041a == null) {
            this.f5041a = new CampaignTrackingService();
        }
        CampaignTrackingService campaignTrackingService = this.f5041a;
        CampaignTrackingService.m1778a(applicationContext, intent);
    }
}
