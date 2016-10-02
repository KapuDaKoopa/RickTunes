package com.google.android.gms.p006b;

import com.google.android.gms.clearcut.C0637g;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.C0583o;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.api.internal.C0586c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.b.vk */
public final class vk implements C0637g {
    private static final Object f4284a;
    private static final vs f4285b;
    private static final long f4286c;
    private final xf f4287d;
    private final vn f4288e;
    private final Object f4289f;
    private long f4290g;
    private final long f4291h;
    private ScheduledFuture f4292i;
    private C0660i f4293j;
    private final Runnable f4294k;

    static {
        f4284a = new Object();
        f4285b = new vs();
        f4286c = TimeUnit.MILLISECONDS.convert(2, TimeUnit.MINUTES);
    }

    public vk() {
        this(new xg(), f4286c, new vo());
    }

    private vk(xf xfVar, long j, vn vnVar) {
        this.f4289f = new Object();
        this.f4290g = 0;
        this.f4292i = null;
        this.f4293j = null;
        this.f4294k = new vl(this);
        this.f4287d = xfVar;
        this.f4291h = j;
        this.f4288e = vnVar;
    }

    private static void m4818b(LogEventParcelable logEventParcelable) {
        if (logEventParcelable.f4466f != null && logEventParcelable.f4465e.f4421k.length == 0) {
            logEventParcelable.f4465e.f4421k = logEventParcelable.f4466f.m5051a();
        }
        if (logEventParcelable.f4467g != null && logEventParcelable.f4465e.f4428r.length == 0) {
            logEventParcelable.f4465e.f4428r = logEventParcelable.f4467g.m5051a();
        }
        logEventParcelable.f4463c = ys.m1656a(logEventParcelable.f4465e);
    }

    public final C0583o m4822a(C0660i c0660i, LogEventParcelable logEventParcelable) {
        vk.m4818b(logEventParcelable);
        f4285b.m4830a();
        C0586c vqVar = new vq(this, logEventParcelable, c0660i);
        vqVar.m3342a(new vm(this));
        return c0660i.m5085a(vqVar);
    }

    public final boolean m4823a(TimeUnit timeUnit) {
        try {
            return f4285b.m4831a(timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
