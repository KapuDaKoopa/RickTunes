package com.andromo.dev576782.app537736;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.actionbarsherlock.app.SherlockPreferenceActivity;

final class ap implements OnPreferenceChangeListener {
    final /* synthetic */ SherlockPreferenceActivity f657a;

    ap(SherlockPreferenceActivity sherlockPreferenceActivity) {
        this.f657a = sherlockPreferenceActivity;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        com.google.analytics.tracking.android.ap.m1817a(this.f657a).m1822b(!((Boolean) obj).booleanValue());
        return true;
    }
}
