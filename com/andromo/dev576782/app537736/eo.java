package com.andromo.dev576782.app537736;

import android.content.Context;
import android.os.AsyncTask;
import android.preference.PreferenceManager;

final class eo extends AsyncTask {
    final /* synthetic */ Context f868a;
    final /* synthetic */ boolean f869b;

    eo(Context context) {
        this.f868a = context;
        this.f869b = true;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        PreferenceManager.getDefaultSharedPreferences(this.f868a).edit().putBoolean("launch_notice_shown", this.f869b).commit();
        return null;
    }
}
