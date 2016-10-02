package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.os.Bundle;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockPreferenceActivity;

public class AndromoPreferencesActivity extends SherlockPreferenceActivity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(2131034112);
        ao.m1271a((SherlockPreferenceActivity) this);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C0208j.m1612a(supportActionBar, true, false);
            C0208j.m1611a(supportActionBar, getString(2131230764));
            supportActionBar.setHomeButtonEnabled(false);
        }
    }

    protected void onStart() {
        super.onStart();
        ao.m1268a((Activity) this, "Prefs");
    }

    protected void onStop() {
        super.onStop();
        ao.m1267a((Activity) this);
    }
}
