package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class aa {
    public static void m1212a(Activity activity) {
        if (activity != null) {
            boolean hasCategory;
            SharedPreferences defaultSharedPreferences;
            if (activity != null) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    hasCategory = intent.hasCategory("android.intent.category.LAUNCHER");
                    if (!hasCategory) {
                        String action = intent.getAction();
                        if (action != null) {
                            hasCategory = action.equals("android.intent.action.MAIN");
                        }
                    }
                    if (hasCategory && !PreferenceManager.getDefaultSharedPreferences(activity).getBoolean("launch_notice_shown", false)) {
                        defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
                        if (defaultSharedPreferences.contains("eu_country")) {
                            new dq(activity, new eq(activity)).execute(new Void[0]);
                        } else if (defaultSharedPreferences.getBoolean("eu_country", false)) {
                            en.m1395a(activity);
                        }
                    }
                    ag.m1224a(activity);
                }
            }
            hasCategory = false;
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
            if (defaultSharedPreferences.contains("eu_country")) {
                new dq(activity, new eq(activity)).execute(new Void[0]);
            } else if (defaultSharedPreferences.getBoolean("eu_country", false)) {
                en.m1395a(activity);
            }
            ag.m1224a(activity);
        }
    }
}
