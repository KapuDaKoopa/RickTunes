package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;

/* renamed from: com.google.android.gms.common.api.internal.x */
abstract class C0678x implements Runnable {
    final /* synthetic */ C0674o f4643b;

    private C0678x(C0674o c0674o) {
        this.f4643b = c0674o;
    }

    @WorkerThread
    protected abstract void m5244a();

    @WorkerThread
    public void run() {
        this.f4643b.f4619b.lock();
        try {
            if (!Thread.interrupted()) {
                m5244a();
                this.f4643b.f4619b.unlock();
            }
        } catch (RuntimeException e) {
            al alVar = this.f4643b.f4618a;
            alVar.f4559e.sendMessage(alVar.f4559e.obtainMessage(2, e));
        } finally {
            this.f4643b.f4619b.unlock();
        }
    }
}
