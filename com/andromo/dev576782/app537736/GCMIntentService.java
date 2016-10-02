package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat.BigTextStyle;
import android.support.v4.app.NotificationCompat.Builder;
import com.google.android.gcm.C0313a;
import com.google.android.gcm.GCMBaseIntentService;

public class GCMIntentService extends GCMBaseIntentService {
    public GCMIntentService() {
        super("346876594010");
    }

    public GCMIntentService(boolean z) {
        super("346876594010");
    }

    protected final void m1116a(Context context, int i) {
        CharSequence string = getString(2131230802, new Object[]{Integer.valueOf(i)});
        CharSequence charSequence = "";
        long currentTimeMillis = System.currentTimeMillis();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (charSequence.equals("")) {
            charSequence = context.getString(2131230764);
        }
        Intent a = C0208j.m1604a(context);
        a.setFlags(603979776);
        PendingIntent activity = PendingIntent.getActivity(context, 0, a, 0);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2130837703);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        boolean z = defaultSharedPreferences.getBoolean("enable_notification_sound", true);
        boolean z2 = defaultSharedPreferences.getBoolean("enable_notification_light", true);
        int i2 = z ? 1 : 0;
        if (z2) {
            i2 |= 4;
        }
        Builder builder = new Builder(context);
        builder.setContentTitle(charSequence);
        builder.setContentText(string);
        builder.setContentIntent(activity);
        builder.setSmallIcon(2130837731);
        builder.setWhen(currentTimeMillis);
        builder.setLargeIcon(decodeResource);
        builder.setTicker(charSequence);
        builder.setPriority(0);
        builder.setAutoCancel(true);
        builder.setStyle(new BigTextStyle().bigText(string));
        if (i2 > 0) {
            builder.setDefaults(i2);
        }
        notificationManager.notify(0, builder.build());
    }

    protected final void m1117a(Context context, Intent intent) {
        CharSequence string;
        String string2;
        String str;
        CharSequence string3;
        long currentTimeMillis;
        NotificationManager notificationManager;
        Intent intent2;
        PendingIntent activity;
        Bitmap decodeResource;
        SharedPreferences defaultSharedPreferences;
        boolean z;
        boolean z2;
        int i;
        Builder builder;
        String str2 = null;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string4 = extras.getString("message");
                string = extras.getString("title");
                string2 = extras.getString("url");
                str = string4;
                if (str != null) {
                    string3 = getString(2131230798);
                } else {
                    Object obj = str;
                }
                currentTimeMillis = System.currentTimeMillis();
                notificationManager = (NotificationManager) context.getSystemService("notification");
                if (string == null || string.equals("")) {
                    string = context.getString(2131230764);
                }
                if (string2 != null || string2.equals("")) {
                    intent2 = new Intent();
                } else {
                    Uri parse = Uri.parse(string2);
                    if (parse != null) {
                        str2 = parse.getScheme();
                    }
                    if (str2 == null || !str2.equals("andromo")) {
                        intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(parse);
                        intent2.addCategory("android.intent.category.BROWSABLE");
                    } else {
                        str2 = C0208j.m1608a(context, parse.getHost());
                        if (!str2.equals("")) {
                            try {
                                Class cls = Class.forName(str2);
                                intent2 = Activity.class.isAssignableFrom(cls) ? new Intent(context, cls) : C0208j.m1604a(context);
                            } catch (ClassNotFoundException e) {
                            }
                        }
                        intent2 = C0208j.m1604a(context);
                    }
                }
                intent2.setFlags(603979776);
                activity = PendingIntent.getActivity(context, 0, intent2, 0);
                decodeResource = BitmapFactory.decodeResource(context.getResources(), 2130837703);
                defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                z = defaultSharedPreferences.getBoolean("enable_notification_sound", true);
                z2 = defaultSharedPreferences.getBoolean("enable_notification_light", true);
                i = z ? 1 : 0;
                if (z2) {
                    i |= 4;
                }
                builder = new Builder(context);
                builder.setContentTitle(string);
                builder.setContentText(string3);
                builder.setContentIntent(activity);
                builder.setSmallIcon(2130837731);
                builder.setWhen(currentTimeMillis);
                builder.setLargeIcon(decodeResource);
                builder.setTicker(string);
                builder.setPriority(0);
                builder.setAutoCancel(true);
                builder.setStyle(new BigTextStyle().bigText(string3));
                if (i > 0) {
                    builder.setDefaults(i);
                }
                notificationManager.notify(0, builder.build());
            }
        }
        string2 = null;
        string = null;
        str = null;
        if (str != null) {
            Object obj2 = str;
        } else {
            string3 = getString(2131230798);
        }
        currentTimeMillis = System.currentTimeMillis();
        notificationManager = (NotificationManager) context.getSystemService("notification");
        string = context.getString(2131230764);
        if (string2 != null) {
        }
        intent2 = new Intent();
        intent2.setFlags(603979776);
        activity = PendingIntent.getActivity(context, 0, intent2, 0);
        decodeResource = BitmapFactory.decodeResource(context.getResources(), 2130837703);
        defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        z = defaultSharedPreferences.getBoolean("enable_notification_sound", true);
        z2 = defaultSharedPreferences.getBoolean("enable_notification_light", true);
        if (z) {
        }
        if (z2) {
            i |= 4;
        }
        builder = new Builder(context);
        builder.setContentTitle(string);
        builder.setContentText(string3);
        builder.setContentIntent(activity);
        builder.setSmallIcon(2130837731);
        builder.setWhen(currentTimeMillis);
        builder.setLargeIcon(decodeResource);
        builder.setTicker(string);
        builder.setPriority(0);
        builder.setAutoCancel(true);
        builder.setStyle(new BigTextStyle().bigText(string3));
        if (i > 0) {
            builder.setDefaults(i);
        }
        notificationManager.notify(0, builder.build());
    }

    protected final void m1118a(Context context, String str) {
        "Device registered: regId = " + str;
        aj a = aj.m1245a(str);
        a.m1252a(context);
        aj.m1251c(context);
        aj.m1248a(getApplicationContext(), a);
    }

    public final void m1119a(String str) {
        "Received error: " + str;
    }

    protected final void m1120b(Context context, String str) {
        if (C0313a.m1991f(context)) {
            aj.m1249a(context, str);
        }
    }

    protected final boolean m1121c(Context context, String str) {
        "Received recoverable error: " + str;
        return super.m1115c(context, str);
    }
}
