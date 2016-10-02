package com.google.android.gms.p006b;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.b.jz */
final class jz implements Callable {
    final /* synthetic */ js f3520a;
    final /* synthetic */ jy f3521b;

    jz(jy jyVar, js jsVar) {
        this.f3521b = jyVar;
        this.f3520a = jsVar;
    }

    private jv m3950a() {
        synchronized (this.f3521b.f3510c) {
            if (this.f3521b.f3511d) {
                return null;
            }
            return this.f3520a.m3933a(this.f3521b.f3508a, this.f3521b.f3509b);
        }
    }

    public final /* synthetic */ Object call() {
        return m3950a();
    }
}
