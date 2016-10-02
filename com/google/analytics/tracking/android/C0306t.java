package com.google.analytics.tracking.android;

import android.content.Context;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;

/* renamed from: com.google.analytics.tracking.android.t */
public final class C0306t implements UncaughtExceptionHandler {
    private final UncaughtExceptionHandler f1674a;
    private final bi f1675b;
    private final be f1676c;
    private C0294s f1677d;

    public C0306t(bi biVar, be beVar, UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (biVar == null) {
            throw new NullPointerException("tracker cannot be null");
        } else if (beVar == null) {
            throw new NullPointerException("serviceManager cannot be null");
        } else {
            this.f1674a = uncaughtExceptionHandler;
            this.f1675b = biVar;
            this.f1676c = beVar;
            this.f1677d = new bh(context, new ArrayList());
            as.m1831c("ExceptionReporter created, original handler is " + (uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName()));
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String str = null;
        String str2 = "UncaughtException";
        if (this.f1677d != null) {
            str2 = this.f1677d.m1905a(thread != null ? thread.getName() : null, th);
        }
        as.m1831c("Tracking Exception: " + str2);
        bi biVar = this.f1675b;
        Boolean valueOf = Boolean.valueOf(true);
        an.m1810a().m1811a(ao.CONSTRUCT_EXCEPTION);
        av avVar = new av();
        avVar.m1841a("&t", "exception");
        avVar.m1841a("&exd", str2);
        str2 = "&exf";
        if (valueOf != null) {
            str = valueOf.booleanValue() ? "1" : "0";
        }
        avVar.m1841a(str2, str);
        biVar.m1910a(avVar.m1842a());
        this.f1676c.m1889c();
        if (this.f1674a != null) {
            as.m1831c("Passing exception to original handler.");
            this.f1674a.uncaughtException(thread, th);
        }
    }
}
