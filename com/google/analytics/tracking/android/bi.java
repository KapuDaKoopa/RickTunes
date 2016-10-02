package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class bi {
    private final String f1632a;
    private final bj f1633b;
    private final Map f1634c;
    private bb f1635d;
    private final C0300j f1636e;
    private final bc f1637f;
    private final C0299i f1638g;

    bi(String str, String str2, bj bjVar) {
        this(str, str2, bjVar, C0300j.m1924a(), bc.m1883a(), C0299i.m1921a(), new bd((byte) 0));
    }

    private bi(String str, String str2, bj bjVar, C0300j c0300j, bc bcVar, C0299i c0299i, bb bbVar) {
        this.f1634c = new HashMap();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Tracker name cannot be empty.");
        }
        this.f1632a = str;
        this.f1633b = bjVar;
        this.f1634c.put("&tid", str2);
        this.f1634c.put("useSecure", "1");
        this.f1636e = c0300j;
        this.f1637f = bcVar;
        this.f1638g = c0299i;
        this.f1635d = bbVar;
    }

    public final void m1909a(String str, String str2) {
        an.m1810a().m1811a(ao.SET);
        if (str2 == null) {
            this.f1634c.remove(str);
        } else {
            this.f1634c.put(str, str2);
        }
    }

    public void m1910a(Map map) {
        an.m1810a().m1811a(ao.SEND);
        Map hashMap = new HashMap();
        hashMap.putAll(this.f1634c);
        if (map != null) {
            hashMap.putAll(map);
        }
        if (TextUtils.isEmpty((CharSequence) hashMap.get("&tid"))) {
            as.m1832d(String.format("Missing tracking id (%s) parameter.", new Object[]{"&tid"}));
        }
        String str = (String) hashMap.get("&t");
        if (TextUtils.isEmpty(str)) {
            as.m1832d(String.format("Missing hit type (%s) parameter.", new Object[]{"&t"}));
            str = "";
        }
        if (str.equals("transaction") || str.equals("item") || this.f1635d.m1881a()) {
            this.f1633b.m1815a(hashMap);
        } else {
            as.m1832d("Too many hits sent too quickly, rate limiting invoked.");
        }
    }
}
