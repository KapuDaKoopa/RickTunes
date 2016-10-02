package com.andromo.dev576782.app537736;

import android.widget.Toast;

final class bm implements Runnable {
    final /* synthetic */ Audio98819 f755a;

    bm(Audio98819 audio98819) {
        this.f755a = audio98819;
    }

    public final void run() {
        this.f755a.removeDialog(3);
        Toast.makeText(this.f755a, 2131231004, 1).show();
    }
}
