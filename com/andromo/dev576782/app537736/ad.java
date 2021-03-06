package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class ad {
    public static boolean m1213a(Context context) {
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        if (context == null) {
            displayMetrics = displayMetrics2;
        } else if (context instanceof Activity) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
            displayMetrics = displayMetrics2;
        } else {
            Resources resources = context.getResources();
            displayMetrics = new DisplayMetrics();
            if (resources != null) {
                displayMetrics = resources.getDisplayMetrics();
            }
        }
        boolean z = (context == null || displayMetrics == null) ? true : displayMetrics.heightPixels > 500;
        return !z;
    }
}
