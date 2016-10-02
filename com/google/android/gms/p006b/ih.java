package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.ih */
final class ih implements Runnable {
    final /* synthetic */ String f3391a;
    final /* synthetic */ ie f3392b;

    ih(ie ieVar, String str) {
        this.f3392b = ieVar;
        this.f3391a = str;
    }

    public final void run() {
        this.f3392b.f3384a.loadData(this.f3391a, "text/html", "UTF-8");
    }
}
