package com.google.tagmanager;

import android.util.Log;

/* renamed from: com.google.tagmanager.t */
final class C0818t implements aa {
    private ab f5174a;

    C0818t() {
        this.f5174a = ab.WARNING;
    }

    public final void m5922a() {
        this.f5174a.ordinal();
        ab.ERROR.ordinal();
    }

    public final void m5923a(String str) {
        if (this.f5174a.ordinal() <= ab.WARNING.ordinal()) {
            Log.w("GoogleTagManager", str);
        }
    }

    public final void m5924b() {
        this.f5174a.ordinal();
        ab.ERROR.ordinal();
    }

    public final void m5925c() {
        this.f5174a.ordinal();
        ab.INFO.ordinal();
    }

    public final void m5926d() {
        this.f5174a.ordinal();
        ab.VERBOSE.ordinal();
    }
}
