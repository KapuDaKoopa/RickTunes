package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.api.C0653q;
import com.google.android.gms.common.api.C0662r;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.f */
public final class C0665f extends Handler {
    public C0665f() {
        this(Looper.getMainLooper());
    }

    public C0665f(Looper looper) {
        super(looper);
    }

    public final void m5182a() {
        removeMessages(2);
    }

    public final void m5183a(C0662r c0662r, C0653q c0653q) {
        sendMessage(obtainMessage(1, new Pair(c0662r, c0653q)));
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                Pair pair = (Pair) message.obj;
                try {
                    ((C0662r) pair.first).m5130a((C0653q) pair.second);
                } catch (RuntimeException e) {
                    throw e;
                }
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                ((C0584e) message.obj).m3345c(Status.f4517d);
            default:
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
        }
    }
}
