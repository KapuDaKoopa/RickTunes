package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.qk;
import com.google.android.gms.p006b.rd;

@op
/* renamed from: com.google.android.gms.ads.internal.overlay.a */
public final class C0407a {
    private static boolean m2625a(Context context, Intent intent, ac acVar) {
        try {
            "Launching an intent: " + intent.toURI();
            qk.m4383a();
            ar.m2240e();
            rd.m4414a(context, intent);
            if (acVar != null) {
                acVar.m2138l();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            C0501b.m3025a(e.getMessage());
            return false;
        }
    }

    public static boolean m2626a(Context context, AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, ac acVar) {
        int i = 0;
        if (adLauncherIntentInfoParcel == null) {
            C0501b.m3025a("No intent data for launcher overlay.");
            return i;
        } else if (adLauncherIntentInfoParcel.f2157i != null) {
            return C0407a.m2625a(context, adLauncherIntentInfoParcel.f2157i, acVar);
        } else {
            Intent intent = new Intent();
            if (TextUtils.isEmpty(adLauncherIntentInfoParcel.f2151c)) {
                C0501b.m3025a("Open GMSG did not contain a URL.");
                return i;
            }
            if (TextUtils.isEmpty(adLauncherIntentInfoParcel.f2152d)) {
                intent.setData(Uri.parse(adLauncherIntentInfoParcel.f2151c));
            } else {
                intent.setDataAndType(Uri.parse(adLauncherIntentInfoParcel.f2151c), adLauncherIntentInfoParcel.f2152d);
            }
            intent.setAction("android.intent.action.VIEW");
            if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.f2153e)) {
                intent.setPackage(adLauncherIntentInfoParcel.f2153e);
            }
            if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.f2154f)) {
                String[] split = adLauncherIntentInfoParcel.f2154f.split("/", 2);
                if (split.length < 2) {
                    C0501b.m3025a("Could not parse component name from open GMSG: " + adLauncherIntentInfoParcel.f2154f);
                    return i;
                }
                intent.setClassName(split[i], split[1]);
            }
            Object obj = adLauncherIntentInfoParcel.f2155g;
            if (!TextUtils.isEmpty(obj)) {
                try {
                    i = Integer.parseInt(obj);
                } catch (NumberFormatException e) {
                    C0501b.m3025a("Could not parse intent flags.");
                }
                intent.addFlags(i);
            }
            return C0407a.m2625a(context, intent, acVar);
        }
    }
}
