package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.ac;
import com.google.android.gms.common.api.C0653q;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.api.C0662r;
import com.google.android.gms.common.api.Status;

final class ae implements C0662r {
    final /* synthetic */ aw f4546a;
    final /* synthetic */ boolean f4547b;
    final /* synthetic */ C0660i f4548c;
    final /* synthetic */ C0689z f4549d;

    ae(C0689z c0689z, aw awVar, boolean z, C0660i c0660i) {
        this.f4549d = c0689z;
        this.f4546a = awVar;
        this.f4547b = z;
        this.f4548c = c0660i;
    }

    public final /* synthetic */ void m5131a(C0653q c0653q) {
        Status status = (Status) c0653q;
        ac.m3300a(this.f4549d.f4669n).m3314d();
        if (status.m5071e() && this.f4549d.m5304k()) {
            this.f4549d.m5303j();
        }
        this.f4546a.m3343a((C0653q) status);
        if (this.f4547b) {
            this.f4548c.m5098g();
        }
    }
}
