package com.andromo.dev576782.app537736;

final class bh implements Runnable {
    final /* synthetic */ Audio98819 f744a;

    bh(Audio98819 audio98819) {
        this.f744a = audio98819;
    }

    public final void run() {
        if (this.f744a.f470v == null) {
            return;
        }
        if (this.f744a.f459k != null) {
            int A = this.f744a.f470v.m1042A();
            if (A != -1) {
                this.f744a.f459k.setProgress(A);
                this.f744a.m831d(fi.m1436a(A));
            } else {
                this.f744a.f459k.setProgress(A);
                this.f744a.m831d("0:00");
            }
            if (this.f744a.f470v.m1043B()) {
                this.f744a.f459k.postDelayed(this.f744a.ad, 1000);
                return;
            }
            return;
        }
        Audio98819 audio98819 = this.f744a;
        false;
    }
}
