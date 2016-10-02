package com.andromo.dev576782.app537736;

import android.app.IntentService;
import android.content.Intent;
import java.io.IOException;

public class AudioCacheSaver extends IntentService {
    private dm f486a;

    public AudioCacheSaver() {
        super("AudioCacheSaver");
    }

    private void m925a(String str) {
        Intent intent = new Intent();
        intent.setAction("com.andromo.dev576782.app537736.AudioCacheSaver.broadcast.ERROR");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("com.andromo.dev576782.app537736.extra.FILENAME", str);
        sendBroadcast(intent);
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        if (this.f486a != null) {
            this.f486a.m1335a();
            this.f486a = null;
        }
        super.onDestroy();
    }

    protected void onHandleIntent(Intent intent) {
        AudioCacheMap audioCacheMap = (AudioCacheMap) intent.getParcelableExtra("com.andromo.dev576782.app537736.extra.AUDIO_CACHE");
        String stringExtra = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FILENAME");
        if (audioCacheMap != null && stringExtra != null && stringExtra.length() > 0) {
            this.f486a = new ic();
            try {
                audioCacheMap.m918b(this, stringExtra, this.f486a);
                Intent intent2;
                if (this.f486a.m1336b()) {
                    intent2 = new Intent();
                    intent2.setAction("com.andromo.dev576782.app537736.AudioCacheSaver.broadcast.CANCELLED");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.putExtra("com.andromo.dev576782.app537736.extra.FILENAME", stringExtra);
                    sendBroadcast(intent2);
                    return;
                }
                intent2 = new Intent();
                intent2.setAction("com.andromo.dev576782.app537736.AudioCacheSaver.broadcast.SAVED");
                intent2.addCategory("android.intent.category.DEFAULT");
                intent2.putExtra("com.andromo.dev576782.app537736.extra.FILENAME", stringExtra);
                sendBroadcast(intent2);
                return;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (audioCacheMap == null) {
            m925a(stringExtra != null ? stringExtra : "<null>");
            return;
        } else if (stringExtra == null) {
            stringExtra = "<null>";
        }
        m925a(stringExtra);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String action = intent.getAction();
            if (action != null && action.equals("com.andromo.dev576782.app537736.AudioCacheSaver.action.CANCEL")) {
                if (this.f486a != null) {
                    this.f486a.m1335a();
                }
                stopSelf();
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
