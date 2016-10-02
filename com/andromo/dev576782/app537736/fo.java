package com.andromo.dev576782.app537736;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

final class fo implements OnPreparedListener {
    final /* synthetic */ fn f940a;

    fo(fn fnVar) {
        this.f940a = fnVar;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f940a.m1460a(gn.PREPARED);
        if (this.f940a.f928j != null) {
            this.f940a.f928j.onPrepared(mediaPlayer);
        }
    }
}
