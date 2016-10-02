package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.pf */
public final class pf {
    String f3823a;
    String f3824b;
    String f3825c;
    List f3826d;
    String f3827e;
    String f3828f;
    List f3829g;
    long f3830h;
    boolean f3831i;
    List f3832j;
    long f3833k;
    int f3834l;
    boolean f3835m;
    boolean f3836n;
    boolean f3837o;
    boolean f3838p;
    int f3839q;
    String f3840r;
    boolean f3841s;
    boolean f3842t;
    RewardItemParcel f3843u;
    List f3844v;
    List f3845w;
    boolean f3846x;
    final AdRequestInfoParcel f3847y;
    private final long f3848z;

    public pf(AdRequestInfoParcel adRequestInfoParcel) {
        this.f3830h = -1;
        this.f3831i = false;
        this.f3848z = -1;
        this.f3833k = -1;
        this.f3834l = -1;
        this.f3835m = false;
        this.f3836n = false;
        this.f3837o = false;
        this.f3838p = true;
        this.f3839q = 0;
        this.f3840r = "";
        this.f3841s = false;
        this.f3842t = false;
        this.f3846x = false;
        this.f3847y = adRequestInfoParcel;
    }

    private static String m4332a(Map map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    private static long m4333b(Map map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e) {
                C0501b.m3025a("Could not parse float from " + str + " header: " + str2);
            }
        }
        return -1;
    }

    private static List m4334c(Map map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    private static boolean m4335d(Map map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty() || !Boolean.valueOf((String) list.get(0)).booleanValue()) ? false : true;
    }

    public final void m4336a(Map map) {
        String str;
        this.f3823a = pf.m4332a(map, "X-Afma-Ad-Size");
        List c = pf.m4334c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f3826d = c;
        }
        c = (List) map.get("X-Afma-Debug-Dialog");
        if (!(c == null || c.isEmpty())) {
            this.f3827e = (String) c.get(0);
        }
        c = pf.m4334c(map, "X-Afma-Tracking-Urls");
        if (c != null) {
            this.f3829g = c;
        }
        long b = pf.m4333b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f3830h = b;
        }
        this.f3831i |= pf.m4335d(map, "X-Afma-Mediation");
        c = pf.m4334c(map, "X-Afma-Manual-Tracking-Urls");
        if (c != null) {
            this.f3832j = c;
        }
        b = pf.m4333b(map, "X-Afma-Refresh-Rate");
        if (b != -1) {
            this.f3833k = b;
        }
        c = (List) map.get("X-Afma-Orientation");
        if (!(c == null || c.isEmpty())) {
            str = (String) c.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.f3834l = ar.m2242g().m4474b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.f3834l = ar.m2242g().m4461a();
            }
        }
        this.f3828f = pf.m4332a(map, "X-Afma-ActiveView");
        c = (List) map.get("X-Afma-Use-HTTPS");
        if (!(c == null || c.isEmpty())) {
            this.f3837o = Boolean.valueOf((String) c.get(0)).booleanValue();
        }
        this.f3835m |= pf.m4335d(map, "X-Afma-Custom-Rendering-Allowed");
        this.f3836n = "native".equals(pf.m4332a(map, "X-Afma-Ad-Format"));
        c = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (!(c == null || c.isEmpty())) {
            this.f3838p = Boolean.valueOf((String) c.get(0)).booleanValue();
        }
        List<String> c2 = pf.m4334c(map, "X-Afma-OAuth-Token-Status");
        this.f3839q = 0;
        if (c2 != null) {
            for (String str2 : c2) {
                if (!"Clear".equalsIgnoreCase(str2)) {
                    if ("No-Op".equalsIgnoreCase(str2)) {
                        this.f3839q = 0;
                        break;
                    }
                }
                this.f3839q = 1;
                break;
            }
        }
        c = (List) map.get("X-Afma-Gws-Query-Id");
        if (!(c == null || c.isEmpty())) {
            this.f3840r = (String) c.get(0);
        }
        str2 = pf.m4332a(map, "X-Afma-Fluid");
        if (str2 != null && str2.equals("height")) {
            this.f3841s = true;
        }
        this.f3842t = "native_express".equals(pf.m4332a(map, "X-Afma-Ad-Format"));
        this.f3843u = RewardItemParcel.m2951a(pf.m4332a(map, "X-Afma-Rewards"));
        if (this.f3844v == null) {
            this.f3844v = pf.m4334c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.f3845w == null) {
            this.f3845w = pf.m4334c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.f3846x |= pf.m4335d(map, "X-Afma-Use-Displayed-Impression");
    }
}
