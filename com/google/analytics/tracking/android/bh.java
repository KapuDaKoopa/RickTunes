package com.google.analytics.tracking.android;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public final class bh implements C0294s {
    private final TreeSet f1631a;

    public bh(Context context, Collection collection) {
        this.f1631a = new TreeSet();
        m1907a(context, collection);
    }

    private static Throwable m1906a(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    private void m1907a(Context context, Collection collection) {
        this.f1631a.clear();
        Set<String> hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            try {
                String packageName = context.getApplicationContext().getPackageName();
                this.f1631a.add(packageName);
                ActivityInfo[] activityInfoArr = context.getApplicationContext().getPackageManager().getPackageInfo(packageName, 15).activities;
                if (activityInfoArr != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        hashSet.add(activityInfo.packageName);
                    }
                }
            } catch (NameNotFoundException e) {
                as.m1830b("No package found");
            }
        }
        for (String packageName2 : hashSet) {
            Iterator it = this.f1631a.iterator();
            Object obj = 1;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (packageName2.startsWith(str)) {
                    obj = null;
                } else {
                    if (str.startsWith(packageName2)) {
                        this.f1631a.remove(str);
                    }
                    if (obj != null) {
                        this.f1631a.add(packageName2);
                    }
                }
            }
            if (obj != null) {
                this.f1631a.add(packageName2);
            }
        }
    }

    public final String m1908a(String str, Throwable th) {
        StackTraceElement stackTraceElement;
        Throwable a = m1906a(th);
        StackTraceElement[] stackTrace = m1906a(th).getStackTrace();
        if (stackTrace == null || stackTrace.length == 0) {
            stackTraceElement = null;
        } else {
            loop0:
            for (StackTraceElement stackTraceElement2 : stackTrace) {
                String className = stackTraceElement2.getClassName();
                Iterator it = this.f1631a.iterator();
                while (it.hasNext()) {
                    if (className.startsWith((String) it.next())) {
                        stackTraceElement = stackTraceElement2;
                        break loop0;
                    }
                }
            }
            stackTraceElement = stackTrace[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] split = stackTraceElement.getClassName().split("\\.");
            String str2 = "unknown";
            if (split != null && split.length > 0) {
                str2 = split[split.length - 1];
            }
            stringBuilder.append(String.format(" (@%s:%s:%s)", new Object[]{str2, stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())}));
        }
        if (str != null) {
            stringBuilder.append(String.format(" {%s}", new Object[]{str}));
        }
        return stringBuilder.toString();
    }
}
