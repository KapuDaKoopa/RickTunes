package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.b.ry */
final class ry implements wg {
    final /* synthetic */ String f4077a;
    final /* synthetic */ sd f4078b;
    final /* synthetic */ rw f4079c;

    ry(rw rwVar, String str, sd sdVar) {
        this.f4079c = rwVar;
        this.f4077a = str;
        this.f4078b = sdVar;
    }

    public final void m4515a(xy xyVar) {
        C0501b.m3025a("Failed to load URL: " + this.f4077a + "\n" + xyVar.toString());
        this.f4078b.m4522a(null);
    }
}
