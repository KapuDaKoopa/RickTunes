package com.google.android.gms.p006b;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.b.fe */
final class fe implements fk {
    fe() {
    }

    public final void m3714a(tf tfVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            C0501b.m3025a("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        Map hashMap = new HashMap();
        PackageManager packageManager = tfVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            hashMap.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), Menu.CATEGORY_CONTAINER) != null));
        }
        tfVar.m4561a("openableURLs", hashMap);
    }
}
