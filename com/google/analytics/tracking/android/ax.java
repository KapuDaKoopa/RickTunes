package com.google.analytics.tracking.android;

import android.content.Context;
import android.text.TextUtils;

final class ax implements aw {
    private final Context f1599a;
    private String f1600b;

    public ax(Context context) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        this.f1599a = context.getApplicationContext();
    }

    private int m1848a(String str, String str2) {
        if (this.f1599a == null) {
            return 0;
        }
        return this.f1599a.getResources().getIdentifier(str, str2, this.f1600b != null ? this.f1600b : this.f1599a.getPackageName());
    }

    public final int m1849a(String str, int i) {
        int a = m1848a(str, "integer");
        if (a != 0) {
            try {
                i = Integer.parseInt(this.f1599a.getString(a));
            } catch (NumberFormatException e) {
                as.m1832d("NumberFormatException parsing " + this.f1599a.getString(a));
            }
        }
        return i;
    }

    public final String m1850a(String str) {
        int a = m1848a(str, "string");
        return a == 0 ? null : this.f1599a.getString(a);
    }

    public final Double m1851b(String str) {
        Double d = null;
        String a = m1850a(str);
        if (!TextUtils.isEmpty(a)) {
            try {
                d = Double.valueOf(Double.parseDouble(a));
            } catch (NumberFormatException e) {
                as.m1832d("NumberFormatException parsing " + a);
            }
        }
        return d;
    }

    public final boolean m1852c(String str) {
        int a = m1848a(str, "bool");
        return a == 0 ? false : "true".equalsIgnoreCase(this.f1599a.getString(a));
    }

    public final void m1853d(String str) {
        this.f1600b = str;
    }
}
