package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.C0772e;

final class an extends Handler {
    final /* synthetic */ al f4571a;

    an(al alVar, Looper looper) {
        this.f4571a = alVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                ((am) message.obj).m5167a(this.f4571a);
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                throw ((RuntimeException) message.obj);
            default:
                Log.w("GACStateManager", "Unknown message id: " + message.what);
        }
    }
}
