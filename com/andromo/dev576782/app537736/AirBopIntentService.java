package com.andromo.dev576782.app537736;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gcm.C0313a;

public class AirBopIntentService extends IntentService {
    public AirBopIntentService() {
        super("AirBopIntentService");
    }

    protected void onHandleIntent(Intent intent) {
        boolean z = true;
        Context applicationContext = getApplicationContext();
        boolean z2 = false;
        if (applicationContext != null) {
            z2 = C0313a.m1991f(applicationContext);
            Bundle extras = intent.getExtras();
            String str = null;
            if (extras != null) {
                str = extras.getString("REG_ID");
                z = extras.getBoolean("REG_TASK", true);
            }
            if (str != null) {
                if (z) {
                    if (!z2) {
                        aj a = aj.m1245a(str);
                        a.m1252a(applicationContext);
                        aj.m1251c(applicationContext);
                        z2 = aj.m1248a(applicationContext, a);
                        if (!z2) {
                            C0313a.m1987b(applicationContext);
                        }
                    }
                } else if (z2) {
                    z2 = aj.m1249a(applicationContext, str);
                    if (z2) {
                        C0313a.m1987b(applicationContext);
                    }
                }
            }
        }
        Intent intent2 = new Intent();
        intent2.setAction("com.andromo.dev576782.app537736.intent.action.REGISTRATION_PROCESSED");
        intent2.addCategory("android.intent.category.DEFAULT");
        intent2.putExtra("AIRBOP_SUCCESS", z2);
        intent2.putExtra("REG_TASK", z);
        sendBroadcast(intent2);
    }
}
