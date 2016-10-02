package com.google.android.gms.p006b;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0403l;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.fx */
public final class fx implements fk {
    private final fs f3253a;
    private final C0403l f3254b;
    private final lm f3255c;

    public fx(fs fsVar, C0403l c0403l, lm lmVar) {
        this.f3253a = fsVar;
        this.f3254b = c0403l;
        this.f3255c = lmVar;
    }

    private void m3729a(boolean z) {
        if (this.f3255c != null) {
            this.f3255c.m4187a(z);
        }
    }

    private static boolean m3730a(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int m3731b(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return ar.m2242g().m4474b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return ar.m2242g().m4461a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return ar.m2242g().m4476c();
            }
        }
        return -1;
    }

    public final void m3732a(tf tfVar, Map map) {
        String str = (String) map.get("a");
        if (str == null) {
            C0501b.m3025a("Action missing from an open GMSG.");
        } else if (this.f3254b == null || this.f3254b.m2605a()) {
            tg l = tfVar.m4579l();
            if ("expand".equalsIgnoreCase(str)) {
                if (tfVar.m4583p()) {
                    C0501b.m3025a("Cannot expand WebView that is already expanded.");
                    return;
                }
                m3729a(false);
                l.m4612a(fx.m3730a(map), fx.m3731b(map));
            } else if ("webapp".equalsIgnoreCase(str)) {
                str = (String) map.get("u");
                m3729a(false);
                if (str != null) {
                    l.m4613a(fx.m3730a(map), fx.m3731b(map), str);
                } else {
                    l.m4614a(fx.m3730a(map), fx.m3731b(map), (String) map.get("html"), (String) map.get("baseurl"));
                }
            } else if ("in_app_purchase".equalsIgnoreCase(str)) {
                str = (String) map.get("product_id");
                String str2 = (String) map.get("report_urls");
                if (this.f3253a == null) {
                    return;
                }
                if (str2 == null || str2.isEmpty()) {
                    this.f3253a.m2185a(str, new ArrayList());
                    return;
                }
                this.f3253a.m2185a(str, new ArrayList(Arrays.asList(str2.split(" "))));
            } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("play_store"))) {
                str = (String) map.get("u");
                if (TextUtils.isEmpty(str)) {
                    C0501b.m3025a("Destination url cannot be empty.");
                } else {
                    new fy(tfVar, str).m2709g();
                }
            } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
                m3729a(true);
                Context context = tfVar.getContext();
                if (TextUtils.isEmpty((String) map.get("u"))) {
                    C0501b.m3025a("Destination url cannot be empty.");
                    return;
                }
                try {
                    tfVar.m4579l().m4607a(new AdLauncherIntentInfoParcel(new fz(tfVar).m3739a(context, map)));
                } catch (ActivityNotFoundException e) {
                    C0501b.m3025a(e.getMessage());
                }
            } else {
                String str3;
                m3729a(true);
                str = (String) map.get("u");
                if (TextUtils.isEmpty(str)) {
                    str3 = str;
                } else {
                    ar.m2240e();
                    str3 = rd.m4406a(tfVar, str);
                }
                l.m4607a(new AdLauncherIntentInfoParcel((String) map.get("i"), str3, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
            }
        } else {
            this.f3254b.m2604a((String) map.get("u"));
        }
    }
}
