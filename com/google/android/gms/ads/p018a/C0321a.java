package com.google.android.gms.ads.p018a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.C0697i;
import com.google.android.gms.common.C0699c;
import com.google.android.gms.common.C0708g;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.common.stats.C0765b;
import com.google.android.gms.p006b.af;
import com.google.android.gms.p006b.ag;
import java.io.IOException;

/* renamed from: com.google.android.gms.ads.a.a */
public final class C0321a {
    C0708g f1725a;
    af f1726b;
    boolean f1727c;
    Object f1728d;
    C0323c f1729e;
    final long f1730f;
    private final Context f1731g;

    public C0321a(Context context) {
        this(context, 30000);
    }

    private C0321a(Context context, long j) {
        this.f1728d = new Object();
        ax.m5527a((Object) context);
        this.f1731g = context;
        this.f1727c = false;
        this.f1730f = j;
    }

    public static C0322b m2014a(Context context) {
        C0321a c0321a = new C0321a(context, -1);
        try {
            c0321a.m2019a(false);
            C0322b a = c0321a.m2018a();
            return a;
        } finally {
            c0321a.m2020b();
        }
    }

    private static af m2015a(C0708g c0708g) {
        try {
            return ag.m3428a(c0708g.m5364a());
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            IOException iOException = new IOException(th);
        }
    }

    private static C0708g m2016b(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            switch (C0697i.m5318b().m5321a(context)) {
                case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    Object c0708g = new C0708g();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (C0765b.m5734a().m5740a(context, intent, c0708g)) {
                            return c0708g;
                        }
                        throw new IOException("Connection failure");
                    } catch (Throwable th) {
                        IOException iOException = new IOException(th);
                    }
                default:
                    throw new IOException("Google Play services not available");
            }
        } catch (NameNotFoundException e) {
            throw new C0699c();
        }
    }

    private void m2017c() {
        synchronized (this.f1728d) {
            if (this.f1729e != null) {
                this.f1729e.m2022a();
                try {
                    this.f1729e.join();
                } catch (InterruptedException e) {
                }
            }
            if (this.f1730f > 0) {
                this.f1729e = new C0323c(this, this.f1730f);
            }
        }
    }

    public final C0322b m2018a() {
        C0322b c0322b;
        ax.m5537c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f1727c) {
                synchronized (this.f1728d) {
                    if (this.f1729e == null || !this.f1729e.m2023b()) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m2019a(false);
                    if (!this.f1727c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    throw new IOException("Remote exception");
                } catch (Throwable e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            ax.m5527a(this.f1725a);
            ax.m5527a(this.f1726b);
            c0322b = new C0322b(this.f1726b.m3424a(), this.f1726b.m3427a(true));
        }
        m2017c();
        return c0322b;
    }

    public final void m2019a(boolean z) {
        ax.m5537c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f1727c) {
                m2020b();
            }
            this.f1725a = C0321a.m2016b(this.f1731g);
            Context context = this.f1731g;
            this.f1726b = C0321a.m2015a(this.f1725a);
            this.f1727c = true;
            if (z) {
                m2017c();
            }
        }
    }

    public final void m2020b() {
        ax.m5537c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f1731g == null || this.f1725a == null) {
                return;
            }
            try {
                if (this.f1727c) {
                    C0765b.m5734a().m5738a(this.f1731g, this.f1725a);
                }
            } catch (IllegalArgumentException e) {
            }
            this.f1727c = false;
            this.f1726b = null;
            this.f1725a = null;
        }
    }

    protected final void finalize() {
        m2020b();
        super.finalize();
    }
}
