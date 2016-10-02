package com.google.android.gms.p006b;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.b.oo */
public final class oo implements UncaughtExceptionHandler {
    private UncaughtExceptionHandler f3762a;
    private UncaughtExceptionHandler f3763b;
    private Context f3764c;
    private VersionInfoParcel f3765d;

    public oo(Context context, VersionInfoParcel versionInfoParcel, UncaughtExceptionHandler uncaughtExceptionHandler, UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.f3762a = uncaughtExceptionHandler;
        this.f3763b = uncaughtExceptionHandler2;
        this.f3764c = context;
        this.f3765d = versionInfoParcel;
    }

    public static oo m4309a(Context context, Thread thread, VersionInfoParcel versionInfoParcel) {
        if (context == null || thread == null || versionInfoParcel == null) {
            return null;
        }
        if (!oo.m4310a()) {
            return null;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        UncaughtExceptionHandler ooVar = new oo(context, versionInfoParcel, uncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
        if (uncaughtExceptionHandler != null && (uncaughtExceptionHandler instanceof oo)) {
            return (oo) uncaughtExceptionHandler;
        }
        try {
            thread.setUncaughtExceptionHandler(ooVar);
            return ooVar;
        } catch (SecurityException e) {
            C0501b.m3027a(4);
            return null;
        }
    }

    private static boolean m4310a() {
        return ((Boolean) ar.m2249n().m3580a(ck.f3068g)).booleanValue();
    }

    private static boolean m4311a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        if (str.startsWith("com.google.android.gms.ads")) {
            return true;
        }
        if (str.startsWith("com.google.ads")) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(op.class);
        } catch (Exception e) {
            "Fail to check class type for class " + str;
            C0501b.m3027a(3);
            return z;
        }
    }

    public final void m4312a(Throwable th, boolean z) {
        Context context = this.f3764c;
        if (oo.m4310a()) {
            Throwable th2;
            if (((Boolean) ar.m2249n().m3580a(ck.f3069h)).booleanValue()) {
                th2 = th;
            } else {
                Throwable th3;
                LinkedList linkedList = new LinkedList();
                for (th3 = th; th3 != null; th3 = th3.getCause()) {
                    linkedList.push(th3);
                }
                th2 = null;
                while (!linkedList.isEmpty()) {
                    Throwable th4;
                    th3 = (Throwable) linkedList.pop();
                    StackTraceElement[] stackTrace = th3.getStackTrace();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                    Object obj = null;
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (oo.m4311a(stackTraceElement.getClassName())) {
                            obj = 1;
                            arrayList.add(stackTraceElement);
                        } else {
                            String className = stackTraceElement.getClassName();
                            Object obj2 = (TextUtils.isEmpty(className) || !(className.startsWith("android.") || className.startsWith("java."))) ? null : 1;
                            if (obj2 != null) {
                                arrayList.add(stackTraceElement);
                            } else {
                                arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                            }
                        }
                    }
                    if (obj != null) {
                        th4 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                        th4.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    } else {
                        th4 = th2;
                    }
                    th2 = th4;
                }
            }
            if (th2 != null) {
                Class cls = th.getClass();
                List arrayList2 = new ArrayList();
                Writer stringWriter = new StringWriter();
                th2.printStackTrace(new PrintWriter(stringWriter));
                ar.m2240e();
                arrayList2.add(new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", VERSION.RELEASE).appendQueryParameter("api", String.valueOf(VERSION.SDK_INT)).appendQueryParameter("device", rd.m4438c()).appendQueryParameter("js", this.f3765d.f2539b).appendQueryParameter("appid", this.f3764c.getApplicationContext().getPackageName()).appendQueryParameter("exceptiontype", cls.getName()).appendQueryParameter("stacktrace", stringWriter.toString()).appendQueryParameter("eids", TextUtils.join(",", ck.m3581a())).appendQueryParameter("trapped", String.valueOf(z)).toString());
                ar.m2240e();
                rd.m4418a(this.f3764c, this.f3765d.f2539b, arrayList2, ar.m2243h().m4373f());
            }
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        boolean z;
        if (th != null) {
            boolean z2 = false;
            z = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (oo.m4311a(stackTraceElement.getClassName())) {
                        z = true;
                    }
                    if (getClass().getName().equals(stackTraceElement.getClassName())) {
                        z2 = true;
                    }
                }
            }
            if (z && !r2) {
                z = true;
                if (z) {
                    if (Looper.getMainLooper().getThread() == thread) {
                        m4312a(th, true);
                        return;
                    }
                    m4312a(th, false);
                }
                if (this.f3762a != null) {
                    this.f3762a.uncaughtException(thread, th);
                } else if (this.f3763b != null) {
                    this.f3763b.uncaughtException(thread, th);
                }
            }
        }
        z = false;
        if (z) {
            if (Looper.getMainLooper().getThread() == thread) {
                m4312a(th, false);
            } else {
                m4312a(th, true);
                return;
            }
        }
        if (this.f3762a != null) {
            this.f3762a.uncaughtException(thread, th);
        } else if (this.f3763b != null) {
            this.f3763b.uncaughtException(thread, th);
        }
    }
}
