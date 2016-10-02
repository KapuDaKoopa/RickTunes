package com.google.android.gms.common.internal;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

final class ab {
    final ac f4815a;
    final Set f4816b;
    int f4817c;
    boolean f4818d;
    IBinder f4819e;
    final aa f4820f;
    ComponentName f4821g;
    final /* synthetic */ C0744z f4822h;

    public ab(C0744z c0744z, aa aaVar) {
        this.f4822h = c0744z;
        this.f4820f = aaVar;
        this.f4815a = new ac(this);
        this.f4816b = new HashSet();
        this.f4817c = 2;
    }

    public final void m5408a(ServiceConnection serviceConnection, String str) {
        this.f4822h.f4885d.m5739a(this.f4822h.f4883b, serviceConnection, str, this.f4820f.m5407a());
        this.f4816b.add(serviceConnection);
    }

    @TargetApi(14)
    public final void m5409a(String str) {
        this.f4817c = 3;
        this.f4818d = this.f4822h.f4885d.m5741a(this.f4822h.f4883b, str, this.f4820f.m5407a(), this.f4815a, 129);
        if (!this.f4818d) {
            this.f4817c = 2;
            try {
                this.f4822h.f4885d.m5738a(this.f4822h.f4883b, this.f4815a);
            } catch (IllegalArgumentException e) {
            }
        }
    }

    public final boolean m5410a() {
        return this.f4816b.isEmpty();
    }

    public final boolean m5411a(ServiceConnection serviceConnection) {
        return this.f4816b.contains(serviceConnection);
    }
}
