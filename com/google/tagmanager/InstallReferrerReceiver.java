package com.google.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class InstallReferrerReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        if ("com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) && stringExtra != null) {
            C0823y.m5934a(stringExtra);
            Intent intent2 = new Intent(context, InstallReferrerService.class);
            intent2.putExtra("referrer", stringExtra);
            context.startService(intent2);
        }
    }
}
