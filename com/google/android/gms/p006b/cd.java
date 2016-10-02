package com.google.android.gms.p006b;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.b.cd */
final class cd extends cb {
    cd(int i, String str, Integer num) {
        super(str, num, (byte) 0);
    }

    public final /* synthetic */ Object m3576a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.f3025a, ((Integer) this.f3026b).intValue()));
    }
}
