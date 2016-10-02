package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.google.android.gms.common.api.C0694v;
import java.lang.ref.WeakReference;

final class ag implements DeathRecipient, ai {
    private final WeakReference f4551a;
    private final WeakReference f4552b;
    private final WeakReference f4553c;

    private ag(aj ajVar, C0694v c0694v, IBinder iBinder) {
        this.f4552b = new WeakReference(c0694v);
        this.f4551a = new WeakReference(ajVar);
        this.f4553c = new WeakReference(iBinder);
    }

    private void m5132a() {
        aj ajVar = (aj) this.f4551a.get();
        C0694v c0694v = (C0694v) this.f4552b.get();
        if (!(c0694v == null || ajVar == null)) {
            ajVar.m3350a().intValue();
            c0694v.m5314a();
        }
        IBinder iBinder = (IBinder) this.f4553c.get();
        if (this.f4553c != null) {
            iBinder.unlinkToDeath(this, 0);
        }
    }

    public final void m5133a(aj ajVar) {
        m5132a();
    }

    public final void binderDied() {
        m5132a();
    }
}
