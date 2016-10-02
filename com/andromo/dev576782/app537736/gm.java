package com.andromo.dev576782.app537736;

import android.media.MediaPlayer;

final class gm implements Runnable {
    private MediaPlayer f968a;

    gm(MediaPlayer mediaPlayer) {
        this.f968a = mediaPlayer;
    }

    public final void run() {
        if (this.f968a != null) {
            this.f968a.release();
            this.f968a = null;
        }
    }
}
