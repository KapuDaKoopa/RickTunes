package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.a */
final class C0661a extends ap {
    final /* synthetic */ Dialog f4537a;
    final /* synthetic */ SupportLifecycleFragmentImpl f4538b;

    C0661a(SupportLifecycleFragmentImpl supportLifecycleFragmentImpl, Dialog dialog) {
        this.f4538b = supportLifecycleFragmentImpl;
        this.f4537a = dialog;
    }

    protected final void m5123a() {
        this.f4538b.m5114b();
        this.f4537a.dismiss();
    }
}
