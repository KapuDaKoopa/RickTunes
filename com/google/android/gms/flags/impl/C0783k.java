package com.google.android.gms.flags.impl;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.k */
final class C0783k implements Callable {
    final /* synthetic */ Context f5003a;

    C0783k(Context context) {
        this.f5003a = context;
    }

    public final /* synthetic */ Object call() {
        return this.f5003a.getSharedPreferences("google_sdk_flags", 1);
    }
}
