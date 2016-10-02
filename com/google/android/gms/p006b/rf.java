package com.google.android.gms.p006b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.b.rf */
final class rf extends BroadcastReceiver {
    final /* synthetic */ rd f4048a;

    private rf(rd rdVar) {
        this.f4048a = rdVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f4048a.f4043c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f4048a.f4043c = false;
        }
    }
}
