package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.api.C0583o;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.api.C0662r;
import com.google.android.gms.common.api.Status;

final class bb extends Handler {
    final /* synthetic */ az f4593a;

    public final void handleMessage(Message message) {
        switch (message.what) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                C0583o c0583o = (C0583o) message.obj;
                synchronized (this.f4593a.f4587e) {
                    if (c0583o != null) {
                        if (!(c0583o instanceof au)) {
                            C0662r c0662r = this.f4593a.f4584b;
                            synchronized (c0662r.f4587e) {
                                c0662r.f4586d = c0583o;
                                if (!(c0662r.f4583a == null && c0662r.f4585c == null)) {
                                    C0660i c0660i = (C0660i) c0662r.f4589g.get();
                                    if (!(c0662r.f4583a == null || c0660i == null)) {
                                        c0660i.m5086a((az) c0662r);
                                    }
                                    if (c0662r.f4588f == null) {
                                        if (c0662r.f4586d != null) {
                                            c0662r.f4586d.m3336a(c0662r);
                                        }
                                        break;
                                    }
                                    c0662r.m5181b(c0662r.f4588f);
                                }
                                break;
                            }
                        }
                        this.f4593a.f4584b.m5179a(((au) c0583o).f4575a);
                        break;
                    }
                    this.f4593a.f4584b.m5179a(new Status(13, "Transform returned null"));
                    break;
                }
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                RuntimeException runtimeException = (RuntimeException) message.obj;
                "Runtime exception on the transformation worker thread: " + runtimeException.getMessage();
                throw runtimeException;
            default:
                "TransformationResultHandler received unknown message type: " + message.what;
        }
    }
}
