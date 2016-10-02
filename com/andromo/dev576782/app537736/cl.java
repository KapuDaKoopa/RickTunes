package com.andromo.dev576782.app537736;

final class cl implements Runnable {
    final /* synthetic */ String f795a;
    final /* synthetic */ AudioService f796b;

    cl(AudioService audioService, String str) {
        this.f796b = audioService;
        this.f795a = str;
    }

    public final void run() {
        this.f796b.m1063b(this.f795a);
    }
}
