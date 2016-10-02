package com.google.analytics.tracking.android;

import java.util.HashMap;
import java.util.Map;

public final class av {
    private Map f1598a;

    public av() {
        this.f1598a = new HashMap();
    }

    public static av m1839a(String str, String str2, String str3, Long l) {
        an.m1810a().m1811a(ao.CONSTRUCT_EVENT);
        av avVar = new av();
        avVar.m1841a("&t", "event");
        avVar.m1841a("&ec", str);
        avVar.m1841a("&ea", str2);
        avVar.m1841a("&el", str3);
        avVar.m1841a("&ev", l == null ? null : Long.toString(l.longValue()));
        return avVar;
    }

    public static av m1840b() {
        an.m1810a().m1811a(ao.CONSTRUCT_APP_VIEW);
        av avVar = new av();
        avVar.m1841a("&t", "appview");
        return avVar;
    }

    public final av m1841a(String str, String str2) {
        an.m1810a().m1811a(ao.MAP_BUILDER_SET);
        if (str != null) {
            this.f1598a.put(str, str2);
        } else {
            as.m1832d(" MapBuilder.set() called with a null paramName.");
        }
        return this;
    }

    public final Map m1842a() {
        return new HashMap(this.f1598a);
    }
}
