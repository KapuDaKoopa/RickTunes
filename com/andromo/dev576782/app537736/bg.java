package com.andromo.dev576782.app537736;

final class bg implements Runnable {
    final /* synthetic */ Audio98819 f743a;

    bg(Audio98819 audio98819) {
        this.f743a = audio98819;
    }

    public final void run() {
        boolean z = false;
        if (this.f743a.f460l != null) {
            if (this.f743a.f431H) {
                this.f743a.f460l.setVisibility(0);
            } else {
                this.f743a.f460l.setVisibility(4);
            }
            Audio98819 audio98819 = this.f743a;
            if (!this.f743a.f431H) {
                z = true;
            }
            audio98819.f431H = z;
        }
    }
}
