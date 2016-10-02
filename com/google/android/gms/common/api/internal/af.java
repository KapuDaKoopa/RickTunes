package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.C0772e;

final class af extends Handler {
    final /* synthetic */ C0689z f4550a;

    af(C0689z c0689z, Looper looper) {
        this.f4550a = c0689z;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                C0689z.m5279c(this.f4550a);
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                C0689z.m5278b(this.f4550a);
            default:
                Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
        }
    }
}
