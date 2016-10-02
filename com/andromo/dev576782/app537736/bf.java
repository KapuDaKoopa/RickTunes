package com.andromo.dev576782.app537736;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class bf implements ServiceConnection {
    final /* synthetic */ Audio98819 f742a;

    bf(Audio98819 audio98819) {
        this.f742a = audio98819;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f742a.f473y = (AudioCacheService) ((ff) iBinder).m1429a();
        this.f742a.f472x = true;
        this.f742a.f473y.m961i("Audio98819_cache.dat");
        Audio98819 audio98819 = this.f742a;
        false;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f742a.f472x = false;
        this.f742a.f457i = null;
        Audio98819 audio98819 = this.f742a;
        false;
    }
}
