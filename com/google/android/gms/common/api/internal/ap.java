package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.C0697i;

abstract class ap extends BroadcastReceiver {
    protected Context f4536c;

    ap() {
    }

    public static ap m5119a(Context context, ap apVar) {
        C0697i.m5318b();
        return m5120b(context, apVar);
    }

    public static ap m5120b(Context context, ap apVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        context.registerReceiver(apVar, intentFilter);
        apVar.f4536c = context;
        if (C0697i.m5317a(context, "com.google.android.gms")) {
            return apVar;
        }
        apVar.m5121a();
        apVar.m5122b();
        return null;
    }

    protected abstract void m5121a();

    public final synchronized void m5122b() {
        if (this.f4536c != null) {
            this.f4536c.unregisterReceiver(this);
        }
        this.f4536c = null;
    }

    public void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        Object obj = null;
        if (data != null) {
            obj = data.getSchemeSpecificPart();
        }
        if ("com.google.android.gms".equals(obj)) {
            m5121a();
            m5122b();
        }
    }
}
