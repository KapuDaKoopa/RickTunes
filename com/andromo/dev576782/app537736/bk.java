package com.andromo.dev576782.app537736;

final class bk implements fm {
    final /* synthetic */ AudioItem f751a;
    final /* synthetic */ Audio98819 f752b;

    bk(Audio98819 audio98819, AudioItem audioItem) {
        this.f752b = audio98819;
        this.f751a = audioItem;
    }

    public final void m1305a(fj fjVar) {
        this.f752b.removeDialog(3);
        this.f754b.f442S = null;
        this.f752b.f436M = this.f751a.m986c();
        if (fjVar != null) {
            this.f752b.f438O = fjVar.m1443c();
            this.f752b.f437N = fjVar.m1444d();
            this.f752b.f439P = fjVar.m1445e();
        } else {
            this.f752b.f438O = "";
            this.f752b.f437N = "";
            this.f752b.f439P = "";
        }
        this.f752b.f440Q = "";
        this.f752b.f441R = this.f751a.m987d();
        this.f752b.f435L = 0;
        this.f752b.f454f = true;
        this.f752b.f443T = null;
        this.f752b.showDialog(2);
        ao.m1276b("Audio", "Show Track Info", "MediaMetadata");
    }
}
