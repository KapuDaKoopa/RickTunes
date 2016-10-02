package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.p */
final class C0733p extends Handler {
    final /* synthetic */ C0469n f4862a;

    public C0733p(C0469n c0469n, Looper looper) {
        this.f4862a = c0469n;
        super(looper);
    }

    private static void m5560a(Message message) {
        ((C0731q) message.obj).m5555c();
    }

    private static boolean m5561b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 5;
    }

    public final void handleMessage(Message message) {
        if (this.f4862a.f2480e.get() != message.arg1) {
            if (C0733p.m5561b(message)) {
                C0733p.m5560a(message);
            }
        } else if ((message.what == 1 || message.what == 5) && !this.f4862a.m2902l()) {
            C0733p.m5560a(message);
        } else if (message.what == 3) {
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, null);
            this.f4862a.f2491q.m5242a(connectionResult);
            this.f4862a.m2891a(connectionResult);
        } else if (message.what == 4) {
            this.f4862a.m2876a(4, null);
            if (this.f4862a.f2498x != null) {
                this.f4862a.f2498x.m2854a(message.arg2);
            }
            this.f4862a.m2888a(message.arg2);
            this.f4862a.m2878a(4, 1, null);
        } else if (message.what == 2 && !this.f4862a.m2899h()) {
            C0733p.m5560a(message);
        } else if (C0733p.m5561b(message)) {
            ((C0731q) message.obj).m5554b();
        } else {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
        }
    }
}
