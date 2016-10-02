package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.tagmanager.a */
final class C0800a implements C0799j {
    private final Context f5060a;

    public C0800a(Context context) {
        this.f5060a = context;
    }

    public final void m5801a(Map map) {
        Object obj;
        Object obj2 = map.get("gtm.url");
        if (obj2 == null) {
            obj = map.get("gtm");
            if (obj != null && (obj instanceof Map)) {
                obj = ((Map) obj).get("url");
                if (obj != null && (obj instanceof String)) {
                    String queryParameter = Uri.parse((String) obj).getQueryParameter("referrer");
                    if (queryParameter != null) {
                        C0823y.m5935b(this.f5060a, queryParameter);
                        return;
                    }
                    return;
                }
            }
        }
        obj = obj2;
        if (obj != null) {
        }
    }
}
