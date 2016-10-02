package com.andromo.dev576782.app537736;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class cr implements ServiceConnection {
    final /* synthetic */ AudioService f802a;

    cr(AudioService audioService) {
        this.f802a = audioService;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f802a.f548p = (AudioCacheService) ((ff) iBinder).m1429a();
        this.f802a.f546n = true;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f802a.f546n = false;
        this.f802a.f548p = null;
    }
}
