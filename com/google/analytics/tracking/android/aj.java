package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

final class aj implements Runnable {
    final /* synthetic */ Map f1519a;
    final /* synthetic */ ai f1520b;

    aj(ai aiVar, Map map) {
        this.f1520b = aiVar;
        this.f1519a = map;
    }

    public final void run() {
        if (TextUtils.isEmpty((CharSequence) this.f1519a.get("&cid"))) {
            this.f1519a.put("&cid", this.f1520b.f1516f);
        }
        if (!ap.m1817a(this.f1520b.f1518i).m1824c()) {
            ai aiVar = this.f1520b;
            if (!ai.m1797b(this.f1519a)) {
                if (!TextUtils.isEmpty(this.f1520b.f1515e)) {
                    av avVar;
                    an.m1810a().m1812a(true);
                    Map map = this.f1519a;
                    av avVar2 = new av();
                    String c = this.f1520b.f1515e;
                    an.m1810a().m1811a(ao.MAP_BUILDER_SET_CAMPAIGN_PARAMS);
                    c = bk.m1916d(c);
                    if (TextUtils.isEmpty(c)) {
                        avVar = avVar2;
                    } else {
                        Map a = bk.m1912a(c);
                        avVar2.m1841a("&cc", (String) a.get("utm_content"));
                        avVar2.m1841a("&cm", (String) a.get("utm_medium"));
                        avVar2.m1841a("&cn", (String) a.get("utm_campaign"));
                        avVar2.m1841a("&cs", (String) a.get("utm_source"));
                        avVar2.m1841a("&ck", (String) a.get("utm_term"));
                        avVar2.m1841a("&ci", (String) a.get("utm_id"));
                        avVar2.m1841a("&gclid", (String) a.get("gclid"));
                        avVar2.m1841a("&dclid", (String) a.get("dclid"));
                        avVar2.m1841a("&gmob_t", (String) a.get("gmob_t"));
                        avVar = avVar2;
                    }
                    map.putAll(avVar.m1842a());
                    an.m1810a().m1812a(false);
                    this.f1520b.f1515e = null;
                }
                aiVar = this.f1520b;
                ai.m1799c(this.f1519a);
                Map map2 = this.f1519a;
                Map hashMap = new HashMap();
                for (Entry entry : map2.entrySet()) {
                    if (((String) entry.getKey()).startsWith("&") && entry.getValue() != null) {
                        CharSequence substring = ((String) entry.getKey()).substring(1);
                        if (!TextUtils.isEmpty(substring)) {
                            hashMap.put(substring, entry.getValue());
                        }
                    }
                }
                bf f = this.f1520b.f1517h;
                long longValue = Long.valueOf((String) this.f1519a.get("&ht")).longValue();
                ai aiVar2 = this.f1520b;
                f.m1891a(hashMap, longValue, ai.m1801d(this.f1519a), this.f1520b.f1514d);
            }
        }
    }
}
