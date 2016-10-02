package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.c */
final class C0775c implements Callable {
    final /* synthetic */ SharedPreferences f4990a;
    final /* synthetic */ String f4991b;
    final /* synthetic */ Boolean f4992c;

    C0775c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f4990a = sharedPreferences;
        this.f4991b = str;
        this.f4992c = bool;
    }

    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.f4990a.getBoolean(this.f4991b, this.f4992c.booleanValue()));
    }
}
