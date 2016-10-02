package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceManager;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockPreferenceActivity;

public class PodcastPreferences extends SherlockPreferenceActivity implements OnSharedPreferenceChangeListener {
    private ListPreference f603a;

    public static gu m1166a(Context context) {
        gu guVar = gu.STREAM;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return defaultSharedPreferences != null ? gu.valueOf(defaultSharedPreferences.getString("DEFAULT_PLAY_MODE", gu.STREAM.name())) : guVar;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ao.m1275b(this);
        addPreferencesFromResource(2131034114);
        addPreferencesFromResource(2131034112);
        ao.m1271a((SherlockPreferenceActivity) this);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C0208j.m1612a(supportActionBar, true, false);
            C0208j.m1611a(supportActionBar, getString(2131230764));
            supportActionBar.setHomeButtonEnabled(false);
        }
        this.f603a = (ListPreference) getPreferenceScreen().findPreference("DEFAULT_PLAY_MODE");
    }

    protected void onResume() {
        super.onResume();
        this.f603a.setSummary(this.f603a.getEntry().toString());
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Preference findPreference = findPreference(str);
        if (findPreference instanceof ListPreference) {
            findPreference.setSummary(((ListPreference) findPreference).getEntry());
        }
    }

    protected void onStart() {
        super.onStart();
        ao.m1268a((Activity) this, "Podcast Prefs");
    }

    protected void onStop() {
        super.onStop();
        ag.m1230c(this);
        ao.m1267a((Activity) this);
    }
}
