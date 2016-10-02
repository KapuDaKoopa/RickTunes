package com.google.android.gms.p006b;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C0335b;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;

@op
/* renamed from: com.google.android.gms.b.dm */
public final class dm extends C0335b {
    private final dj f3135a;
    private final Drawable f3136b;
    private final Uri f3137c;
    private final double f3138d;

    public dm(dj djVar) {
        Drawable drawable;
        double d;
        Uri uri = null;
        this.f3135a = djVar;
        try {
            C0314a a = this.f3135a.m2486a();
            if (a != null) {
                drawable = (Drawable) C0317d.m1997a(a);
                this.f3136b = drawable;
                uri = this.f3135a.m2487b();
                this.f3137c = uri;
                d = 1.0d;
                d = this.f3135a.m2488c();
                this.f3138d = d;
            }
        } catch (RemoteException e) {
            C0501b.m3027a(6);
        }
        Object obj = uri;
        this.f3136b = drawable;
        try {
            uri = this.f3135a.m2487b();
        } catch (RemoteException e2) {
            C0501b.m3027a(6);
        }
        this.f3137c = uri;
        d = 1.0d;
        try {
            d = this.f3135a.m2488c();
        } catch (RemoteException e3) {
            C0501b.m3027a(6);
        }
        this.f3138d = d;
    }

    public final Drawable m3630a() {
        return this.f3136b;
    }

    public final Uri m3631b() {
        return this.f3137c;
    }

    public final double m3632c() {
        return this.f3138d;
    }
}
