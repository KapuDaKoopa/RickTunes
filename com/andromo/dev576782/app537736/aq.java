package com.andromo.dev576782.app537736;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.google.analytics.tracking.android.C0309w;

final class aq implements OnPreferenceChangeListener {
    aq() {
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        boolean z = !((Boolean) obj).booleanValue();
        if (z) {
            ao.m1272a("Analytics", "Disabled in Prefs");
            C0309w.m1950a().m1961c();
        }
        as.m1278a().m1283a(z);
        if (!z) {
            ao.m1272a("Analytics", "Enabled in Prefs");
        }
        return true;
    }
}
