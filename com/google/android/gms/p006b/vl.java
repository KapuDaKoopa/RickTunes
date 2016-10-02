package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.vl */
final class vl implements Runnable {
    final /* synthetic */ vk f4295a;

    vl(vk vkVar) {
        this.f4295a = vkVar;
    }

    public final void run() {
        synchronized (this.f4295a.f4289f) {
            if (this.f4295a.f4290g <= this.f4295a.f4287d.m4888b() && this.f4295a.f4293j != null) {
                this.f4295a.f4293j.m5098g();
                this.f4295a.f4293j = null;
            }
        }
    }
}
