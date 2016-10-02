package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.C0601v;

public final class RevocationBoundService extends Service {
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction())) {
            Log.isLoggable("RevocationService", 2);
            return new C0601v(this);
        }
        Log.w("RevocationService", "Unknown action sent to RevocationBoundService: " + intent.getAction());
        return null;
    }
}
