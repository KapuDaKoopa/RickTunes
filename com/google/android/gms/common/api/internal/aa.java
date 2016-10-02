package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C0694v;

final class aa implements ai {
    final /* synthetic */ C0689z f4539a;

    aa(C0689z c0689z) {
        this.f4539a = c0689z;
    }

    public final void m5125a(aj ajVar) {
        this.f4539a.f4663h.remove(ajVar);
        if (ajVar.m3350a() != null && this.f4539a.f4677v != null) {
            C0694v a = this.f4539a.f4677v;
            ajVar.m3350a().intValue();
            a.m5314a();
        }
    }
}
