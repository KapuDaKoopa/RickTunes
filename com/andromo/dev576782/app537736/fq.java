package com.andromo.dev576782.app537736;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;

final class fq implements OnErrorListener {
    final /* synthetic */ fn f942a;

    fq(fn fnVar) {
        this.f942a = fnVar;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.f942a.m1460a(gn.ERROR);
        return this.f942a.f931m != null ? this.f942a.f931m.onError(mediaPlayer, i, i2) : false;
    }
}
