package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0660i;
import java.util.concurrent.atomic.AtomicReference;

final class ac implements C0464l {
    final /* synthetic */ AtomicReference f4541a;
    final /* synthetic */ aw f4542b;
    final /* synthetic */ C0689z f4543c;

    ac(C0689z c0689z, AtomicReference atomicReference, aw awVar) {
        this.f4543c = c0689z;
        this.f4541a = atomicReference;
        this.f4542b = awVar;
    }

    public final void m5127a(int i) {
    }

    public final void m5128a(Bundle bundle) {
        this.f4543c.m5275a((C0660i) this.f4541a.get(), this.f4542b, true);
    }
}
