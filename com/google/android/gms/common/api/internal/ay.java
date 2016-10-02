package com.google.android.gms.common.api.internal;

import android.content.IntentSender.SendIntentException;
import android.support.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;

final class ay implements Runnable {
    final /* synthetic */ zzw f4580a;
    private final int f4581b;
    private final ConnectionResult f4582c;

    public ay(zzw com_google_android_gms_common_api_internal_zzw, int i, ConnectionResult connectionResult) {
        this.f4580a = com_google_android_gms_common_api_internal_zzw;
        this.f4581b = i;
        this.f4582c = connectionResult;
    }

    @MainThread
    public final void run() {
        if (this.f4580a.f4530b && !this.f4580a.f4531c) {
            this.f4580a.f4531c = true;
            this.f4580a.f4532d = this.f4581b;
            this.f4580a.f4533e = this.f4582c;
            if (this.f4582c.m5056a()) {
                try {
                    this.f4582c.m5055a(this.f4580a.getActivity(), ((this.f4580a.getActivity().getSupportFragmentManager().getFragments().indexOf(this.f4580a) + 1) << 16) + 1);
                } catch (SendIntentException e) {
                    this.f4580a.m5114b();
                }
            } else if (this.f4580a.m5111a().m5323a(this.f4582c.m5058c())) {
                this.f4580a.m5112a(this.f4581b, this.f4582c);
            } else if (this.f4582c.m5058c() == 18) {
                this.f4580a.m5115b(this.f4581b, this.f4582c);
            } else {
                this.f4580a.m5108c(this.f4581b, this.f4582c);
            }
        }
    }
}
