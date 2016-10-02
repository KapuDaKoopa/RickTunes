package com.google.android.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class GCMBroadcastReceiver extends BroadcastReceiver {
    private static boolean f1716a;

    static {
        f1716a = false;
    }

    public final void onReceive(Context context, Intent intent) {
        String name;
        "onReceive: " + intent.getAction();
        if (!f1716a) {
            f1716a = true;
            name = getClass().getName();
            if (!name.equals(GCMBroadcastReceiver.class.getName())) {
                "Setting the name of retry receiver class to " + name;
                C0313a.f1717a = name;
            }
        }
        name = context.getPackageName() + ".GCMIntentService";
        "GCM IntentService class: " + name;
        GCMBaseIntentService.m1108a(context, intent, name);
        setResult(-1, null, null);
    }
}
