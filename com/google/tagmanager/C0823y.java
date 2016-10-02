package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.tagmanager.y */
class C0823y {
    static Map f5176a;
    private static String f5177b;

    static {
        f5176a = new HashMap();
    }

    C0823y() {
    }

    static void m5933a(Context context, String str) {
        bc.m5860a(context, "gtm_install_referrer", "referrer", str);
        C0823y.m5935b(context, str);
    }

    static void m5934a(String str) {
        synchronized (C0823y.class) {
            f5177b = str;
        }
    }

    static void m5935b(Context context, String str) {
        String queryParameter = Uri.parse("http://hostname/?" + str).getQueryParameter("conv");
        if (queryParameter != null && queryParameter.length() > 0) {
            f5176a.put(queryParameter, str);
            bc.m5860a(context, "gtm_click_referrers", queryParameter, str);
        }
    }
}
