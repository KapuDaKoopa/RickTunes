package com.andromo.dev576782.app537736;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AudioIntentReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.media.AUDIO_BECOMING_NOISY")) {
            Intent intent2 = new Intent("com.andromo.dev576782.app537736.audio.action.PAUSE", null, context, AudioService.class);
            intent2.putExtra("com.andromo.dev576782.app537736.extra.IGNORE_PAUSE_IF_STOPPED", true);
            context.startService(intent2);
        }
    }
}
