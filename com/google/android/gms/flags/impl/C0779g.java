package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.g */
final class C0779g implements Callable {
    final /* synthetic */ SharedPreferences f4996a;
    final /* synthetic */ String f4997b;
    final /* synthetic */ Long f4998c;

    C0779g(SharedPreferences sharedPreferences, String str, Long l) {
        this.f4996a = sharedPreferences;
        this.f4997b = str;
        this.f4998c = l;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.f4996a.getLong(this.f4997b, this.f4998c.longValue()));
    }
}
