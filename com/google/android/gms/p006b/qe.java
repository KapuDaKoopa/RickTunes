package com.google.android.gms.p006b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.C0501b;

@op
/* renamed from: com.google.android.gms.b.qe */
public final class qe {
    public long f3999a;
    public long f4000b;
    public int f4001c;
    public final Object f4002d;
    final String f4003e;
    public int f4004f;
    public int f4005g;

    public qe(String str) {
        this.f3999a = -1;
        this.f4000b = -1;
        this.f4001c = -1;
        this.f4002d = new Object();
        this.f4004f = 0;
        this.f4005g = 0;
        this.f4003e = str;
    }

    private static boolean m4378a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            C0501b.m3027a(4);
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            C0501b.m3027a(4);
            return false;
        } catch (NameNotFoundException e) {
            C0501b.m3025a("Fail to fetch AdActivity theme");
            C0501b.m3027a(4);
            return false;
        }
    }

    public final Bundle m4379a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f4002d) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f4003e);
            bundle.putLong("basets", this.f4000b);
            bundle.putLong("currts", this.f3999a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f4001c);
            bundle.putInt("pclick", this.f4004f);
            bundle.putInt("pimp", this.f4005g);
            bundle.putBoolean("support_transparent_background", qe.m4378a(context));
        }
        return bundle;
    }
}
