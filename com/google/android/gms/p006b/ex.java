package com.google.android.gms.p006b;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.ex */
public final class ex implements fk {
    public final void m3707a(tf tfVar, Map map) {
        String str = (String) map.get("action");
        cz czVar;
        if ("tick".equals(str)) {
            str = (String) map.get("label");
            Object obj = (String) map.get("start_label");
            String str2 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str)) {
                C0501b.m3025a("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str2)) {
                C0501b.m3025a("No timestamp given for CSI tick.");
            } else {
                try {
                    long parseLong = (Long.parseLong(str2) - ar.m2244i().m4887a()) + ar.m2244i().m4888b();
                    if (TextUtils.isEmpty(obj)) {
                        obj = "native:view_load";
                    }
                    cy x = tfVar.m4591x();
                    cz czVar2 = x.f3119b;
                    cv cvVar = (cv) x.f3118a.get(obj);
                    String[] strArr = new String[]{str};
                    if (!(czVar2 == null || cvVar == null)) {
                        czVar2.m3602a(cvVar, parseLong, strArr);
                    }
                    Map map2 = x.f3118a;
                    czVar = x.f3119b;
                    map2.put(str, czVar == null ? null : czVar.m3600a(parseLong));
                } catch (Throwable e) {
                    C0501b.m3026a("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            str = (String) map.get("value");
            if (TextUtils.isEmpty(str)) {
                C0501b.m3025a("No value given for CSI experiment.");
                return;
            }
            czVar = tfVar.m4591x().f3119b;
            if (czVar == null) {
                C0501b.m3025a("No ticker for WebView, dropping experiment ID.");
            } else {
                czVar.m3601a("e", str);
            }
        } else if ("extra".equals(str)) {
            str = (String) map.get("name");
            String str3 = (String) map.get("value");
            if (TextUtils.isEmpty(str3)) {
                C0501b.m3025a("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str)) {
                C0501b.m3025a("No name given for CSI extra.");
            } else {
                cz czVar3 = tfVar.m4591x().f3119b;
                if (czVar3 == null) {
                    C0501b.m3025a("No ticker for WebView, dropping extra parameter.");
                } else {
                    czVar3.m3601a(str, str3);
                }
            }
        }
    }
}
