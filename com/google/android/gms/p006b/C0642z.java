package com.google.android.gms.p006b;

import android.content.Context;
import com.google.android.gms.ads.p018a.C0321a;
import com.google.android.gms.common.C0699c;
import com.google.android.gms.common.C0701d;
import java.io.IOException;

/* renamed from: com.google.android.gms.b.z */
final class C0642z implements Runnable {
    private Context f4411a;

    public C0642z(Context context) {
        this.f4411a = context.getApplicationContext();
        if (this.f4411a == null) {
            this.f4411a = context;
        }
    }

    public final void run() {
        synchronized (C0640x.class) {
            try {
                if (C0640x.f4323s == null) {
                    C0321a c0321a = new C0321a(this.f4411a);
                    c0321a.m2019a(true);
                    C0640x.f4323s = c0321a;
                }
                C0640x.f4324t.countDown();
            } catch (C0699c e) {
                try {
                    C0640x.f4323s = null;
                } finally {
                    C0640x.f4324t.countDown();
                }
            } catch (IOException e2) {
                C0640x.f4323s = null;
            } catch (C0701d e3) {
                C0640x.f4323s = null;
            }
        }
    }
}
