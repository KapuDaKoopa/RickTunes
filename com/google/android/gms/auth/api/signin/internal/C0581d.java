package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.v4.content.C0044a;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.api.internal.av;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.auth.api.signin.internal.d */
public final class C0581d extends C0044a implements av {
    private Semaphore f2819n;
    private Set f2820o;

    public C0581d(Context context, Set set) {
        super(context);
        this.f2819n = new Semaphore(0);
        this.f2820o = set;
    }

    private Void m3329h() {
        int i = 0;
        for (C0660i a : this.f2820o) {
            i = a.m5089a((av) this) ? i + 1 : i;
        }
        try {
            this.f2819n.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return null;
    }

    public final /* synthetic */ Object m3330c() {
        return m3329h();
    }

    protected final void m3331e() {
        this.f2819n.drainPermits();
        m66f();
    }

    public final void m3332g() {
        this.f2819n.release();
    }
}
