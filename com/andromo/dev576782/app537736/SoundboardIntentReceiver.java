package com.andromo.dev576782.app537736;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SoundboardIntentReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.media.AUDIO_BECOMING_NOISY")) {
            context.startService(new Intent("com.andromo.dev576782.app537736.soundboard.action.PAUSE", null, context, SoundboardService.class));
        }
    }
}
