package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.CheckBoxPreference;
import android.preference.PreferenceManager;
import com.actionbarsherlock.app.SherlockPreferenceActivity;
import com.google.analytics.tracking.android.C0303p;
import com.google.analytics.tracking.android.ap;
import com.google.analytics.tracking.android.av;

public final class ao {
    private static boolean f653a;
    private static boolean f654b;
    private static boolean f655c;
    private static Context f656d;

    static {
        f653a = true;
        f654b = false;
        f655c = false;
    }

    static void m1267a(Activity activity) {
        if (f653a) {
            C0303p.m1941a((Context) activity).m1943a();
        }
        if (f654b) {
            as.m1278a().m1284c();
        }
        if (f655c) {
            az azVar = ba.f735a;
        }
    }

    static void m1268a(Activity activity, String str) {
        if (f653a) {
            C0303p.m1941a((Context) activity).m1944a(activity);
        }
        if (f654b) {
            as.m1278a().m1281a(str);
        }
        if (f655c) {
            az azVar = ba.f735a;
        }
    }

    static void m1269a(Context context) {
        if (m1274a()) {
            ap.m1817a(context).m1822b(!m1277c(context));
        }
    }

    static void m1270a(Context context, boolean z) {
        if (context != null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            if (defaultSharedPreferences != null) {
                Editor edit = defaultSharedPreferences.edit();
                edit.putBoolean("enable_analytics", z);
                edit.commit();
            }
        }
    }

    static void m1271a(SherlockPreferenceActivity sherlockPreferenceActivity) {
        if (m1274a()) {
            sherlockPreferenceActivity.addPreferencesFromResource(2131034113);
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) sherlockPreferenceActivity.findPreference("enable_analytics");
            if (checkBoxPreference != null && PreferenceManager.getDefaultSharedPreferences(sherlockPreferenceActivity) != null) {
                checkBoxPreference.setOnPreferenceChangeListener(new ap(sherlockPreferenceActivity));
                if (f654b) {
                    checkBoxPreference.setOnPreferenceChangeListener(new aq());
                } else if (f655c) {
                    checkBoxPreference.setOnPreferenceChangeListener(new ar());
                }
            }
        }
    }

    static void m1272a(String str, String str2) {
        m1273a(str, str2, null);
        m1276b(str, str2, null);
        if (f655c) {
            az azVar = ba.f735a;
        }
    }

    static void m1273a(String str, String str2, String str3) {
        if (f653a && f656d != null) {
            C0303p.m1941a(f656d).m1910a(av.m1839a(str, str2, str3, null).m1842a());
        }
    }

    static boolean m1274a() {
        return f653a || f654b || f655c;
    }

    static void m1275b(Context context) {
        f656d = context;
        boolean z = f653a;
        if (f654b) {
            as.m1278a().m1280a(context);
        }
        if (f655c) {
            az azVar = ba.f735a;
        }
    }

    static void m1276b(String str, String str2, String str3) {
        if (f654b) {
            as.m1278a();
            if (!as.m1279b()) {
                as.m1278a().m1282a(str, str2, str3, null);
            }
        }
    }

    static boolean m1277c(Context context) {
        if (context == null) {
            return false;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return defaultSharedPreferences != null ? defaultSharedPreferences.getBoolean("enable_analytics", true) : false;
    }
}
