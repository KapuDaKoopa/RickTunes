package com.andromo.dev576782.app537736;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

final class fp implements OnCompletionListener {
    final /* synthetic */ fn f941a;

    fp(fn fnVar) {
        this.f941a = fnVar;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f941a.m1460a(gn.PLAYBACK_COMPLETED);
        if (this.f941a.f929k != null) {
            this.f941a.f929k.onCompletion(mediaPlayer);
        }
    }
}
