package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.i */
final class C0781i implements Callable {
    final /* synthetic */ SharedPreferences f4999a;
    final /* synthetic */ String f5000b;
    final /* synthetic */ String f5001c;

    C0781i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f4999a = sharedPreferences;
        this.f5000b = str;
        this.f5001c = str2;
    }

    public final /* synthetic */ Object call() {
        return this.f4999a.getString(this.f5000b, this.f5001c);
    }
}
