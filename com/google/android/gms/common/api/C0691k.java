package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.zzw;

/* renamed from: com.google.android.gms.common.api.k */
final class C0691k implements Runnable {
    final /* synthetic */ C0660i f4700a;
    final /* synthetic */ C0690j f4701b;

    C0691k(C0690j c0690j, C0660i c0660i) {
        this.f4701b = c0690j;
        this.f4700a = c0660i;
    }

    public final void run() {
        if (!this.f4701b.f4685d.isFinishing() && !this.f4701b.f4685d.getSupportFragmentManager().isDestroyed()) {
            this.f4701b.m5311a(zzw.m5105b(this.f4701b.f4685d), this.f4700a);
        }
    }
}
