package com.andromo.dev576782.app537736;

final class ck implements Runnable {
    final /* synthetic */ String f793a;
    final /* synthetic */ AudioService f794b;

    ck(AudioService audioService, String str) {
        this.f794b = audioService;
        this.f793a = str;
    }

    public final void run() {
        this.f794b.m1058a(this.f793a);
    }
}
