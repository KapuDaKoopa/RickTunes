package com.andromo.dev576782.app537736;

final class bc implements Runnable {
    final /* synthetic */ AudioItem f737a;
    final /* synthetic */ hv f738b;
    final /* synthetic */ Audio98819 f739c;

    bc(Audio98819 audio98819, AudioItem audioItem, hv hvVar) {
        this.f739c = audio98819;
        this.f737a = audioItem;
        this.f738b = hvVar;
    }

    public final void run() {
        this.f739c.removeDialog(3);
        Audio98819.m804a(this.f739c, this.f737a, this.f738b);
        this.f739c.f435L = 0;
        this.f739c.f454f = true;
        this.f739c.showDialog(2);
        if (this.f739c.m814a(this.f737a.m985b())) {
            ao.m1276b("Audio", "Show Track Info", "Valid 7.html");
        } else {
            ao.m1276b("Audio", "Show Track Info", "Invalid 7.html");
        }
    }
}
