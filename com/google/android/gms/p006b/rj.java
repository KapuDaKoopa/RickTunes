package com.google.android.gms.p006b;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.b.rj */
final class rj implements Callable {
    final /* synthetic */ Context f4049a;
    final /* synthetic */ ri f4050b;

    rj(ri riVar, Context context) {
        this.f4050b = riVar;
        this.f4049a = context;
    }

    public final /* synthetic */ Object call() {
        return this.f4049a.getCacheDir();
    }
}
