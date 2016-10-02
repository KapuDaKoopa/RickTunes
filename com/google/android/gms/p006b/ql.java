package com.google.android.gms.p006b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.ar;

@op
/* renamed from: com.google.android.gms.b.ql */
public final class ql extends Handler {
    public ql(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Throwable e) {
            ar.m2243h().m4367a(e, false);
            throw e;
        }
    }
}
