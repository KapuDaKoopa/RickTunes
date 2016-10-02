package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0467c;
import com.google.android.gms.common.api.C0676n;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.r */
final class C0679r extends C0678x {
    final /* synthetic */ C0674o f4644a;
    private final Map f4645c;

    public C0679r(C0674o c0674o, Map map) {
        this.f4644a = c0674o;
        super((byte) 0);
        this.f4645c = map;
    }

    @WorkerThread
    public final void m5245a() {
        int a = this.f4644a.f4621d.m5321a(this.f4644a.f4620c);
        if (a != 0) {
            this.f4644a.f4618a.m5157a(new C0680s(this, this.f4644a, new ConnectionResult(a, null)));
            return;
        }
        if (this.f4644a.f4623f) {
            this.f4644a.f4622e.m4908k();
        }
        for (C0467c c0467c : this.f4645c.keySet()) {
            c0467c.m2863a((C0676n) this.f4645c.get(c0467c));
        }
    }
}
