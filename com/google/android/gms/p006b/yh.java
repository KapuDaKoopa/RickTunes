package com.google.android.gms.p006b;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.google.android.gms.b.yh */
public class yh {
    public static String f4365a;
    public static boolean f4366b;

    static {
        String str = "Volley";
        f4365a = str;
        f4366b = Log.isLoggable(str, 2);
    }

    public static void m4915a(String str, Object... objArr) {
        if (f4366b) {
            String str2 = f4365a;
            yh.m4919e(str, objArr);
        }
    }

    public static void m4916b(String str, Object... objArr) {
        String str2 = f4365a;
        yh.m4919e(str, objArr);
    }

    public static void m4917c(String str, Object... objArr) {
        String str2 = f4365a;
        yh.m4919e(str, objArr);
    }

    public static void m4918d(String str, Object... objArr) {
        String str2 = f4365a;
        yh.m4919e(str, objArr);
    }

    private static String m4919e(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str3 = "<unknown>";
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClass().equals(yh.class)) {
                str3 = stackTrace[i].getClassName();
                str3 = str3.substring(str3.lastIndexOf(46) + 1);
                str2 = str3.substring(str3.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            }
        }
        str2 = str3;
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
