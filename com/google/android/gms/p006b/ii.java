package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.ii */
final class ii implements Runnable {
    final /* synthetic */ String f3393a;
    final /* synthetic */ ie f3394b;

    ii(ie ieVar, String str) {
        this.f3394b = ieVar;
        this.f3393a = str;
    }

    public final void run() {
        this.f3394b.f3384a.loadData(this.f3393a, "text/html", "UTF-8");
    }
}
