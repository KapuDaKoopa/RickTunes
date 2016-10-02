package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.e */
final class C0777e implements Callable {
    final /* synthetic */ SharedPreferences f4993a;
    final /* synthetic */ String f4994b;
    final /* synthetic */ Integer f4995c;

    C0777e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f4993a = sharedPreferences;
        this.f4994b = str;
        this.f4995c = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f4993a.getInt(this.f4994b, this.f4995c.intValue()));
    }
}
