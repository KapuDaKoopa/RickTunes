package com.google.android.gms.p006b;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.b.cc */
final class cc extends cb {
    cc(int i, String str, Boolean bool) {
        super(str, bool, (byte) 0);
    }

    public final /* synthetic */ Object m3575a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.f3025a, ((Boolean) this.f3026b).booleanValue()));
    }
}
