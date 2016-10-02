package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.support.annotation.BinderThread;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.o */
abstract class C0732o extends C0731q {
    public final int f4859a;
    public final Bundle f4860b;
    final /* synthetic */ C0469n f4861c;

    @BinderThread
    protected C0732o(C0469n c0469n, int i, Bundle bundle) {
        this.f4861c = c0469n;
        super(c0469n, Boolean.valueOf(true));
        this.f4859a = i;
        this.f4860b = bundle;
    }

    protected abstract void m5557a(ConnectionResult connectionResult);

    protected final /* synthetic */ void m5558a(Object obj) {
        PendingIntent pendingIntent = null;
        if (((Boolean) obj) == null) {
            this.f4861c.m2876a(1, null);
            return;
        }
        switch (this.f4859a) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                if (!m5559a()) {
                    this.f4861c.m2876a(1, null);
                    m5557a(new ConnectionResult(8, null));
                }
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                this.f4861c.m2876a(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                this.f4861c.m2876a(1, null);
                if (this.f4860b != null) {
                    pendingIntent = (PendingIntent) this.f4860b.getParcelable("pendingIntent");
                }
                m5557a(new ConnectionResult(this.f4859a, pendingIntent));
        }
    }

    protected abstract boolean m5559a();
}
