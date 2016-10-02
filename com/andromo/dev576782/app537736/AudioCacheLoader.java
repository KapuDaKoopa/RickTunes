package com.andromo.dev576782.app537736;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AudioCacheLoader extends IntentService {
    private dm f480a;

    public AudioCacheLoader() {
        super("AudioCacheLoader");
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        if (this.f480a != null) {
            this.f480a.m1335a();
            this.f480a = null;
        }
        super.onDestroy();
    }

    protected void onHandleIntent(Intent intent) {
        Intent intent2;
        String stringExtra = intent.getStringExtra("com.andromo.dev576782.app537736.extra.FILENAME");
        if (stringExtra != null && stringExtra.length() > 0) {
            this.f480a = new ic();
            try {
                Parcelable audioCacheMap = new AudioCacheMap();
                audioCacheMap.m911a((Context) this, stringExtra, this.f480a);
                if (this.f480a.m1336b()) {
                    intent2 = new Intent();
                    intent2.setAction("com.andromo.dev576782.app537736.AudioCacheLoader.broadcast.CANCELLED");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.putExtra("com.andromo.dev576782.app537736.extra.FILENAME", stringExtra);
                    sendBroadcast(intent2);
                    return;
                }
                Intent intent3 = new Intent();
                intent3.setAction("com.andromo.dev576782.app537736.AudioCacheLoader.broadcast.LOADED");
                intent3.addCategory("android.intent.category.DEFAULT");
                intent3.putExtra("com.andromo.dev576782.app537736.extra.FILENAME", stringExtra);
                intent3.putExtra("com.andromo.dev576782.app537736.extra.AUDIO_CACHE", audioCacheMap);
                sendBroadcast(intent3);
                return;
            } catch (FileNotFoundException e) {
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } else if (stringExtra == null) {
            stringExtra = "<null>";
        }
        intent2 = new Intent();
        intent2.setAction("com.andromo.dev576782.app537736.AudioCacheLoader.broadcast.ERROR");
        intent2.addCategory("android.intent.category.DEFAULT");
        intent2.putExtra("com.andromo.dev576782.app537736.extra.FILENAME", stringExtra);
        sendBroadcast(intent2);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String action = intent.getAction();
            if (action != null && action.equals("com.andromo.dev576782.app537736.AudioCacheLoader.action.CANCEL")) {
                if (this.f480a != null) {
                    this.f480a.m1335a();
                }
                stopSelf();
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
