package com.andromo.dev576782.app537736;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;
import com.google.android.gcm.C0313a;

public class AirBopApplication extends Application implements OnSharedPreferenceChangeListener {
    private static String f415b;
    protected aj f416a;

    static {
        f415b = "enable_notifications";
    }

    public AirBopApplication() {
        this.f416a = null;
    }

    private void m791a() {
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean(f415b, true)) {
            aj.m1251c(getApplicationContext());
            this.f416a.m1253b(getApplicationContext());
            Context applicationContext = getApplicationContext();
            String e = C0313a.m1990e(applicationContext);
            if (e.equals("")) {
                String[] strArr = new String[]{"346876594010"};
                C0313a.m1993h(applicationContext);
                C0313a.m1986a(applicationContext, strArr);
            } else if (!C0313a.m1991f(applicationContext)) {
                Intent intent = new Intent(this, AirBopIntentService.class);
                intent.putExtra("REG_ID", e);
                intent.putExtra("REG_TASK", true);
                startService(intent);
            }
        } else if (C0313a.m1991f(this)) {
            String e2 = C0313a.m1990e(this);
            if (!e2.equals("")) {
                Intent intent2 = new Intent(this, AirBopIntentService.class);
                intent2.putExtra("REG_ID", e2);
                intent2.putExtra("REG_TASK", false);
                startService(intent2);
            }
        }
    }

    private void m792a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(getString(2131230794, new Object[]{str}));
        }
    }

    public void onCreate() {
        super.onCreate();
        PreferenceManager.getDefaultSharedPreferences(this).registerOnSharedPreferenceChangeListener(this);
        m792a("http://www.airbop.com/api/v1/", "SERVER_URL");
        m792a("92278bf3-103c-404c-882c-00bd5d8e6c70", "APP_KEY");
        m792a("0b3cc40ddef3a637ac79fd26a17867b7747f5846d19edb09fcd2ccdd423cfae7", "APP_SECRET");
        int i = VERSION.SDK_INT;
        if (i < 8) {
            throw new UnsupportedOperationException("Device must be at least API Level 8 (instead of " + i + ")");
        }
        try {
            getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            C0313a.m1982a((Context) this);
            Editor edit = getSharedPreferences("com.google.android.gcm", 0).edit();
            edit.putLong("onServerLifeSpan", 2592000000L);
            edit.commit();
            this.f416a = aj.m1245a("");
            m791a();
        } catch (NameNotFoundException e) {
            throw new UnsupportedOperationException("Device does not have package com.google.android.gsf");
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(f415b)) {
            m791a();
        }
    }
}
