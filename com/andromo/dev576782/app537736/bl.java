package com.andromo.dev576782.app537736;

final class bl implements Runnable {
    final /* synthetic */ AudioItem f753a;
    final /* synthetic */ Audio98819 f754b;

    bl(Audio98819 audio98819, AudioItem audioItem) {
        this.f754b = audio98819;
        this.f753a = audioItem;
    }

    public final void run() {
        this.f754b.removeDialog(3);
        this.f754b.f442S = null;
        this.f754b.f443T = null;
        r0.f436M = r1;
        this.f754b.f438O = "";
        this.f754b.f437N = "";
        this.f754b.f439P = "";
        this.f754b.f440Q = "";
        this.f754b.f441R = this.f753a.m987d();
        this.f754b.f435L = 0;
        this.f754b.f454f = true;
        this.f754b.showDialog(2);
        ao.m1276b("Audio", "Show Track Info", "Error (AssetFileDescriptor)");
    }
}
