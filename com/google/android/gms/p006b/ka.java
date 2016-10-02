package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.ka */
final class ka implements Runnable {
    final /* synthetic */ ss f3523a;
    final /* synthetic */ jy f3524b;

    ka(jy jyVar, ss ssVar) {
        this.f3524b = jyVar;
        this.f3523a = ssVar;
    }

    public final void run() {
        for (ss ssVar : this.f3524b.f3512e.keySet()) {
            if (ssVar != this.f3523a) {
                ((js) this.f3524b.f3512e.get(ssVar)).m3935a();
            }
        }
    }
}
