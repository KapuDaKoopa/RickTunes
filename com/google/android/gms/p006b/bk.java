package com.google.android.gms.p006b;

import android.view.View;

/* renamed from: com.google.android.gms.b.bk */
final class bk implements Runnable {
    final /* synthetic */ View f2984a;
    final /* synthetic */ bj f2985b;

    bk(bj bjVar, View view) {
        this.f2985b = bjVar;
        this.f2984a = view;
    }

    public final void run() {
        this.f2985b.m3517a(this.f2984a);
    }
}
