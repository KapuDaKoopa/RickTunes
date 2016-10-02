package com.google.android.gms.p006b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

@op
/* renamed from: com.google.android.gms.b.nn */
public final class nn implements Runnable {
    protected final tf f3679a;
    protected boolean f3680b;
    protected boolean f3681c;
    private final Handler f3682d;
    private final long f3683e;
    private long f3684f;
    private ti f3685g;
    private final int f3686h;
    private final int f3687i;

    private nn(ti tiVar, tf tfVar, int i, int i2) {
        this.f3683e = 200;
        this.f3684f = 50;
        this.f3682d = new Handler(Looper.getMainLooper());
        this.f3679a = tfVar;
        this.f3685g = tiVar;
        this.f3680b = false;
        this.f3681c = false;
        this.f3686h = i2;
        this.f3687i = i;
    }

    public nn(ti tiVar, tf tfVar, int i, int i2, byte b) {
        this(tiVar, tfVar, i, i2);
    }

    static /* synthetic */ long m4247c(nn nnVar) {
        long j = nnVar.f3684f - 1;
        nnVar.f3684f = j;
        return j;
    }

    public final void m4252a() {
        this.f3682d.postDelayed(this, this.f3683e);
    }

    public final void m4253a(AdResponseParcel adResponseParcel) {
        String str;
        this.f3679a.setWebViewClient(new uc(this, this.f3679a, adResponseParcel.f2372q));
        tf tfVar = this.f3679a;
        if (TextUtils.isEmpty(adResponseParcel.f2357b)) {
            str = null;
        } else {
            ar.m2240e();
            str = rd.m4408a(adResponseParcel.f2357b);
        }
        tfVar.loadDataWithBaseURL(str, adResponseParcel.f2358c, "text/html", "UTF-8", null);
    }

    public final synchronized void m4254b() {
        this.f3680b = true;
    }

    public final synchronized boolean m4255c() {
        return this.f3680b;
    }

    public final boolean m4256d() {
        return this.f3681c;
    }

    public final void run() {
        if (this.f3679a == null || m4255c()) {
            this.f3685g.m2101a(this.f3679a, true);
        } else {
            new no(this, this.f3679a.m4553a()).execute(new Void[0]);
        }
    }
}
