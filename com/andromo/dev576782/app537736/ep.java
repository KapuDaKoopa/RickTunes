package com.andromo.dev576782.app537736;

import android.content.Context;
import android.os.AsyncTask;
import android.preference.PreferenceManager;

final class ep extends AsyncTask {
    final /* synthetic */ Context f870a;
    final /* synthetic */ boolean f871b;

    ep(Context context, boolean z) {
        this.f870a = context;
        this.f871b = z;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        PreferenceManager.getDefaultSharedPreferences(this.f870a).edit().putBoolean("eu_country", this.f871b).commit();
        return null;
    }
}
