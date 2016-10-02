package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.mt;
import com.google.android.gms.p006b.ng;

public class InAppPurchaseActivity extends Activity {
    private mt f2586a;

    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (this.f2586a != null) {
                this.f2586a.m2773a(i, i2, intent);
            }
        } catch (Throwable e) {
            C0501b.m3026a("Could not forward onActivityResult to in-app purchase manager:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2586a = ng.m4234a((Activity) this);
        if (this.f2586a == null) {
            C0501b.m3025a("Could not create in-app purchase manager.");
            finish();
            return;
        }
        try {
            this.f2586a.m2772a();
        } catch (Throwable e) {
            C0501b.m3026a("Could not forward onCreate to in-app purchase manager:", e);
            finish();
        }
    }

    protected void onDestroy() {
        try {
            if (this.f2586a != null) {
                this.f2586a.m2774b();
            }
        } catch (Throwable e) {
            C0501b.m3026a("Could not forward onDestroy to in-app purchase manager:", e);
        }
        super.onDestroy();
    }
}
