package com.google.android.gms.p006b;

import android.content.SharedPreferences.Editor;
import android.util.Base64;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

@op
/* renamed from: com.google.android.gms.b.hp */
public final class hp {
    final Map f3337a;
    final LinkedList f3338b;
    gn f3339c;

    public hp() {
        this.f3337a = new HashMap();
        this.f3338b = new LinkedList();
    }

    static void m3802a(String str, hq hqVar) {
        if (C0501b.m3027a(2)) {
            String.format(str, new Object[]{hqVar});
            qk.m4383a();
        }
    }

    static String[] m3803a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException e) {
            return new String[0];
        }
    }

    private String m3804b() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            Iterator it = this.f3338b.iterator();
            while (it.hasNext()) {
                stringBuilder.append(Base64.encodeToString(((hq) it.next()).toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    stringBuilder.append("\u0000");
                }
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }

    final void m3805a() {
        if (this.f3339c != null) {
            hq hqVar;
            for (Entry entry : this.f3337a.entrySet()) {
                hqVar = (hq) entry.getKey();
                hu huVar = (hu) entry.getValue();
                while (true) {
                    if (huVar.f3349a.size() < ((Integer) ar.m2249n().m3580a(ck.ah)).intValue()) {
                        hp.m3802a("Pooling one interstitial for %s.", hqVar);
                        hv hvVar = new hv(huVar, this.f3339c);
                        huVar.f3349a.add(hvVar);
                        hvVar.m3815a(huVar.f3350b);
                    }
                }
            }
            if (this.f3339c != null) {
                Editor edit = this.f3339c.f3291a.getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
                edit.clear();
                for (Entry entry2 : this.f3337a.entrySet()) {
                    hqVar = (hq) entry2.getKey();
                    if (hqVar.f3340a) {
                        edit.putString(hqVar.toString(), new hx((hu) entry2.getValue()).m3840a());
                        hp.m3802a("Saved interstitial queue for %s.", hqVar);
                    }
                }
                edit.putString("PoolKeys", m3804b());
                edit.commit();
            }
        }
    }
}
