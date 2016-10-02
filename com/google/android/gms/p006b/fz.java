package com.google.android.gms.p006b;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.b.fz */
public final class fz {
    final tf f3261a;

    public fz(tf tfVar) {
        this.f3261a = tfVar;
    }

    private static Intent m3735a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    private static Intent m3736a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    private static ResolveInfo m3737a(Context context, Intent intent) {
        return fz.m3738a(context, intent, new ArrayList());
    }

    private static ResolveInfo m3738a(Context context, Intent intent, ArrayList arrayList) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        ResolveInfo resolveInfo;
        Collection queryIntentActivities = packageManager.queryIntentActivities(intent, Menu.CATEGORY_CONTAINER);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, Menu.CATEGORY_CONTAINER);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                resolveInfo = (ResolveInfo) queryIntentActivities.get(i);
                if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo.activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                }
            }
        }
        resolveInfo = null;
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }

    public final Intent m3739a(Context context, Map map) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str = (String) map.get("u");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f3261a != null) {
            ar.m2240e();
            str = rd.m4406a(this.f3261a, str);
        }
        Uri parse = Uri.parse(str);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
        boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
        Uri build = "http".equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme("https").build() : "https".equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme("http").build() : null;
        ArrayList arrayList = new ArrayList();
        Intent a = fz.m3736a(parse);
        Intent a2 = fz.m3736a(build);
        ResolveInfo a3 = fz.m3738a(context, a, arrayList);
        if (a3 != null) {
            return fz.m3735a(a, a3);
        }
        if (a2 != null) {
            ResolveInfo a4 = fz.m3737a(context, a2);
            if (a4 != null) {
                Intent a5 = fz.m3735a(a, a4);
                if (fz.m3737a(context, a5) != null) {
                    return a5;
                }
            }
        }
        if (arrayList.size() == 0) {
            return a;
        }
        if (parseBoolean2 && activityManager != null) {
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ResolveInfo resolveInfo = (ResolveInfo) it.next();
                    for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                            return fz.m3735a(a, resolveInfo);
                        }
                    }
                }
            }
        }
        return parseBoolean ? fz.m3735a(a, (ResolveInfo) arrayList.get(0)) : a;
    }
}
