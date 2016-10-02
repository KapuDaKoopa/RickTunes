package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.ax;

/* renamed from: com.google.android.gms.common.api.a */
public final class C0654a {
    final C0657f f4523a;
    final C0658g f4524b;
    public final String f4525c;
    private final C0531b f4526d;
    private final C0655d f4527e;

    public C0654a(String str, C0531b c0531b, C0655d c0655d) {
        ax.m5528a((Object) c0531b, (Object) "Cannot construct an Api with a null ClientBuilder");
        ax.m5528a((Object) c0655d, (Object) "Cannot construct an Api with a null ClientKey");
        this.f4525c = str;
        this.f4526d = c0531b;
        this.f4523a = null;
        this.f4527e = c0655d;
        this.f4524b = null;
    }

    public final C0531b m5073a() {
        ax.m5532a(this.f4526d != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f4526d;
    }

    public final C0655d m5074b() {
        ax.m5532a(this.f4527e != null, (Object) "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return this.f4527e;
    }
}
