package com.google.analytics.tracking.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: com.google.analytics.tracking.android.v */
class C0308v extends BroadcastReceiver {
    static final String f1678a;
    private final be f1679b;

    static {
        f1678a = C0308v.class.getName();
    }

    C0308v(be beVar) {
        this.f1679b = beVar;
    }

    public static void m1948b(Context context) {
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(f1678a, true);
        context.sendBroadcast(intent);
    }

    public final void m1949a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(this, intentFilter);
        intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.analytics.RADIO_POWERED");
        intentFilter.addCategory(context.getPackageName());
        context.registerReceiver(this, intentFilter);
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = false;
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            be beVar = this.f1679b;
            if (!booleanExtra) {
                z = true;
            }
            beVar.m1888a(z);
        } else if ("com.google.analytics.RADIO_POWERED".equals(action) && !intent.hasExtra(f1678a)) {
            this.f1679b.m1890d();
        }
    }
}
