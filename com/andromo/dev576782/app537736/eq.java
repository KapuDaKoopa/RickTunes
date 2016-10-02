package com.andromo.dev576782.app537736;

import android.content.Context;
import java.util.Locale;

final class eq implements dr {
    final /* synthetic */ Context f872a;

    eq(Context context) {
        this.f872a = context;
    }

    public final void m1396a(String str) {
        boolean z;
        "CountryTask returned: " + str;
        if (str == null || str.length() != 2) {
            z = false;
        } else {
            String toUpperCase = str.toUpperCase(Locale.US);
            z = "BE".equals(toUpperCase) || "BG".equals(toUpperCase) || "CZ".equals(toUpperCase) || "DK".equals(toUpperCase) || "DE".equals(toUpperCase) || "EE".equals(toUpperCase) || "IE".equals(toUpperCase) || "GR".equals(toUpperCase) || "ES".equals(toUpperCase) || "FR".equals(toUpperCase) || "HR".equals(toUpperCase) || "IT".equals(toUpperCase) || "CY".equals(toUpperCase) || "LV".equals(toUpperCase) || "LT".equals(toUpperCase) || "LU".equals(toUpperCase) || "HU".equals(toUpperCase) || "MT".equals(toUpperCase) || "NL".equals(toUpperCase) || "AT".equals(toUpperCase) || "PL".equals(toUpperCase) || "PT".equals(toUpperCase) || "RO".equals(toUpperCase) || "SI".equals(toUpperCase) || "SK".equals(toUpperCase) || "FI".equals(toUpperCase) || "SE".equals(toUpperCase) || "UK".equals(toUpperCase) || "GB".equals(toUpperCase) || "EU".equals(toUpperCase);
        }
        if (z) {
            en.m1395a(this.f872a);
        }
        "Setting prefs eu_country = " + z;
        new ep(this.f872a, z).execute(new Void[0]);
    }
}
