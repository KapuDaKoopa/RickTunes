package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.ij */
final class ij implements Runnable {
    final /* synthetic */ String f3395a;
    final /* synthetic */ ie f3396b;

    ij(ie ieVar, String str) {
        this.f3396b = ieVar;
        this.f3395a = str;
    }

    public final void run() {
        this.f3396b.f3384a.loadUrl(this.f3395a);
    }
}
