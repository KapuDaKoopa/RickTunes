package com.andromo.dev576782.app537736;

final class cx implements Runnable {
    final /* synthetic */ cw f818a;

    cx(cw cwVar) {
        this.f818a = cwVar;
    }

    public final void run() {
        if (this.f818a.f815c != null) {
            this.f818a.f815c.run();
            this.f818a.f814b.postDelayed(this.f818a.f816d, (long) this.f818a.f813a);
        }
    }
}
