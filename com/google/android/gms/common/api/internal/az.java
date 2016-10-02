package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0583o;
import com.google.android.gms.common.api.C0653q;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.api.C0662r;
import com.google.android.gms.common.api.C0663u;
import com.google.android.gms.common.api.C0692s;
import com.google.android.gms.common.api.C0693t;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ax;
import java.lang.ref.WeakReference;

public final class az extends C0663u implements C0662r {
    C0693t f4583a;
    az f4584b;
    C0692s f4585c;
    C0583o f4586d;
    final Object f4587e;
    Status f4588f;
    final WeakReference f4589g;
    final bb f4590h;

    private boolean m5178a() {
        return (this.f4585c == null || ((C0660i) this.f4589g.get()) == null) ? false : true;
    }

    final void m5179a(Status status) {
        synchronized (this.f4587e) {
            this.f4588f = status;
            m5181b(this.f4588f);
        }
    }

    public final void m5180a(C0653q c0653q) {
        synchronized (this.f4587e) {
            if (!c0653q.m5066a().m5071e()) {
                m5179a(c0653q.m5066a());
            } else if (this.f4583a != null) {
                at.m5172a().submit(new ba(this, c0653q));
            } else if (m5178a()) {
                C0692s c0692s = this.f4585c;
            }
        }
    }

    final void m5181b(Status status) {
        synchronized (this.f4587e) {
            if (this.f4583a != null) {
                C0693t c0693t = this.f4583a;
                ax.m5528a((Object) status, (Object) "onFailure must not return null");
                this.f4584b.m5179a(status);
            } else if (m5178a()) {
                C0692s c0692s = this.f4585c;
            }
        }
    }
}
