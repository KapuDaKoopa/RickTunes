package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.common.C0706q;
import java.util.Locale;

/* renamed from: com.google.android.gms.b.pj */
public final class pj {
    private int f3885a;
    private boolean f3886b;
    private boolean f3887c;
    private int f3888d;
    private int f3889e;
    private int f3890f;
    private String f3891g;
    private int f3892h;
    private int f3893i;
    private int f3894j;
    private boolean f3895k;
    private int f3896l;
    private double f3897m;
    private boolean f3898n;
    private String f3899o;
    private boolean f3900p;
    private boolean f3901q;
    private String f3902r;
    private boolean f3903s;
    private boolean f3904t;
    private String f3905u;
    private String f3906v;
    private float f3907w;
    private int f3908x;
    private int f3909y;

    public pj(Context context) {
        boolean z = true;
        PackageManager packageManager = context.getPackageManager();
        m4341a(context);
        m4342a(context, packageManager);
        m4343b(context);
        Locale locale = Locale.getDefault();
        this.f3900p = pj.m4339a(packageManager, "geo:0,0?q=donuts") != null;
        if (pj.m4339a(packageManager, "http://www.google.com") == null) {
            z = false;
        }
        this.f3901q = z;
        this.f3902r = locale.getCountry();
        C0374z.m2455a();
        this.f3903s = C0500a.m3017a();
        this.f3904t = C0706q.m5361g(context);
        this.f3905u = locale.getLanguage();
        this.f3906v = pj.m4340a(packageManager);
        Resources resources = context.getResources();
        if (resources != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                this.f3907w = displayMetrics.density;
                this.f3908x = displayMetrics.widthPixels;
                this.f3909y = displayMetrics.heightPixels;
            }
        }
    }

    public pj(Context context, pi piVar) {
        PackageManager packageManager = context.getPackageManager();
        m4341a(context);
        m4342a(context, packageManager);
        m4343b(context);
        this.f3899o = Build.FINGERPRINT;
        this.f3900p = piVar.f3861b;
        this.f3901q = piVar.f3862c;
        this.f3902r = piVar.f3864e;
        this.f3903s = piVar.f3865f;
        this.f3904t = piVar.f3866g;
        this.f3905u = piVar.f3869j;
        this.f3906v = piVar.f3870k;
        this.f3907w = piVar.f3877r;
        this.f3908x = piVar.f3878s;
        this.f3909y = piVar.f3879t;
    }

    private static ResolveInfo m4339a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), Menu.CATEGORY_CONTAINER);
    }

    private static String m4340a(PackageManager packageManager) {
        String str = null;
        ResolveInfo a = pj.m4339a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a != null) {
            ActivityInfo activityInfo = a.activityInfo;
            if (activityInfo != null) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
                    if (packageInfo != null) {
                        str = packageInfo.versionCode + "." + activityInfo.packageName;
                    }
                } catch (NameNotFoundException e) {
                }
            }
        }
        return str;
    }

    private void m4341a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.f3885a = audioManager.getMode();
        this.f3886b = audioManager.isMusicActive();
        this.f3887c = audioManager.isSpeakerphoneOn();
        this.f3888d = audioManager.getStreamVolume(3);
        this.f3889e = audioManager.getRingerMode();
        this.f3890f = audioManager.getStreamVolume(2);
    }

    @TargetApi(16)
    private void m4342a(Context context, PackageManager packageManager) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f3891g = telephonyManager.getNetworkOperator();
        this.f3893i = telephonyManager.getNetworkType();
        this.f3894j = telephonyManager.getPhoneType();
        this.f3892h = -2;
        this.f3895k = false;
        this.f3896l = -1;
        ar.m2240e();
        if (rd.m4425a(packageManager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f3892h = activeNetworkInfo.getType();
                this.f3896l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f3892h = -1;
            }
            if (VERSION.SDK_INT >= 16) {
                this.f3895k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    private void m4343b(Context context) {
        boolean z = false;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f3897m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f3898n = z;
            return;
        }
        this.f3897m = -1.0d;
        this.f3898n = false;
    }

    public final pi m4344a() {
        return new pi(this.f3885a, this.f3900p, this.f3901q, this.f3891g, this.f3902r, this.f3903s, this.f3904t, this.f3886b, this.f3887c, this.f3905u, this.f3906v, this.f3888d, this.f3892h, this.f3893i, this.f3894j, this.f3889e, this.f3890f, this.f3907w, this.f3908x, this.f3909y, this.f3897m, this.f3898n, this.f3895k, this.f3896l, this.f3899o);
    }
}
