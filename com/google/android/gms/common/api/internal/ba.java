package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.api.C0653q;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.api.C0693t;

final class ba implements Runnable {
    final /* synthetic */ C0653q f4591a;
    final /* synthetic */ az f4592b;

    ba(az azVar, C0653q c0653q) {
        this.f4592b = azVar;
        this.f4591a = c0653q;
    }

    @WorkerThread
    public final void run() {
        az azVar;
        C0653q c0653q;
        C0660i c0660i;
        try {
            C0693t c0693t = this.f4592b.f4583a;
            C0653q c0653q2 = this.f4591a;
            this.f4592b.f4590h.sendMessage(this.f4592b.f4590h.obtainMessage(0, c0693t.m5313a()));
            azVar = this.f4592b;
            c0653q = this.f4591a;
            c0660i = (C0660i) this.f4592b.f4589g.get();
            if (c0660i != null) {
                c0660i.m5092b(this.f4592b);
            }
        } catch (RuntimeException e) {
            this.f4592b.f4590h.sendMessage(this.f4592b.f4590h.obtainMessage(1, e));
            azVar = this.f4592b;
            c0653q = this.f4591a;
            c0660i = (C0660i) this.f4592b.f4589g.get();
            if (c0660i != null) {
                c0660i.m5092b(this.f4592b);
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            azVar = this.f4592b;
            c0653q = this.f4591a;
            c0660i = (C0660i) this.f4592b.f4589g.get();
            if (c0660i != null) {
                c0660i.m5092b(this.f4592b);
            }
        }
    }
}
