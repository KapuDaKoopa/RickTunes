package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.k */
final class C0670k implements Runnable {
    final /* synthetic */ C0667h f4613a;

    C0670k(C0667h c0667h) {
        this.f4613a = c0667h;
    }

    public final void run() {
        this.f4613a.f4603g.lock();
        try {
            C0667h.m5189a(this.f4613a);
        } finally {
            this.f4613a.f4603g.unlock();
        }
    }
}
