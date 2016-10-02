package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class fa {
    public static final fb f890a;

    static {
        f890a = fb.m1420a();
    }

    public static void m1415a(Context context, String str) {
        try {
            m1416a(context, str, "android.intent.category.BROWSABLE", "com.android.browser", "com.android.browser.BrowserActivity");
        } catch (ActivityNotFoundException e) {
            try {
                m1416a(context, str, "android.intent.category.BROWSABLE", "com.google.android.browser", "com.google.android.browser.BrowserActivity");
            } catch (ActivityNotFoundException e2) {
                m1419c(context, str);
            } catch (SecurityException e3) {
                m1419c(context, str);
            }
        } catch (SecurityException e4) {
            try {
                m1419c(context, str);
            } catch (ActivityNotFoundException e5) {
            } catch (SecurityException e6) {
            }
        }
    }

    private static void m1416a(Context context, String str, String str2, String str3, String str4) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str != null && !str.equals("")) {
            intent.setData(Uri.parse(str));
            intent.addCategory(str2);
            intent.setClassName(str3, str4);
            context.startActivity(intent);
        }
    }

    public static boolean m1417a(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String str2 = null;
        if (parse != null) {
            str2 = parse.getScheme();
        }
        return str2 != null && str2.equals("andromo");
    }

    public static boolean m1418b(Context context, String str) {
        if (!m1417a(str) || str == null || str.equals("")) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return false;
        }
        String host = parse.getHost();
        String path = parse.getPath();
        String str2 = "";
        if (host.equalsIgnoreCase("dashboard")) {
            host = context.getResources().getString(2131230835);
            if (!host.equals("")) {
                str2 = context.getPackageName() + "." + host;
            }
        } else {
            str2 = C0208j.m1608a(context, host);
        }
        if (str2.equals("")) {
            return false;
        }
        try {
            Class cls = Class.forName(str2);
            if (Activity.class.isAssignableFrom(cls)) {
                Intent intent = new Intent(context, cls);
                intent.addFlags(67108864);
                if (!(path == null || path.equals(""))) {
                    intent.putExtra("com.andromo.dev576782.app537736.NAVIGATION_PAGE", path);
                }
                if (context instanceof Activity) {
                    aw.m1294a((Activity) context, intent);
                } else {
                    context.startActivity(intent);
                }
                return true;
            }
            Object newInstance = cls.newInstance();
            boolean z = false;
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals("runIntent")) {
                    try {
                        method.invoke(newInstance, new Object[]{context});
                        z = true;
                    } catch (InvocationTargetException e) {
                        z = false;
                    }
                }
            }
            return z;
        } catch (ClassNotFoundException e2) {
            return false;
        } catch (InstantiationException e3) {
            return false;
        } catch (IllegalAccessException e4) {
            return false;
        }
    }

    private static void m1419c(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str != null && !str.equals("")) {
            intent.setData(Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
            context.startActivity(intent);
        }
    }
}
