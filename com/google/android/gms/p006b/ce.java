package com.google.android.gms.p006b;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.b.ce */
final class ce extends cb {
    ce(String str, Long l) {
        super(str, l, (byte) 0);
    }

    public final /* synthetic */ Object m3577a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.f3025a, ((Long) this.f3026b).longValue()));
    }
}
