package com.google.android.gms.p006b;

import android.content.Context;
import com.google.ads.p004a.p005a.C0229d;
import com.google.android.gms.ads.p018a.C0321a;
import com.google.android.gms.ads.p018a.C0322b;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.b.x */
public class C0640x extends C0636v {
    private static C0321a f4323s;
    private static CountDownLatch f4324t;
    private boolean f4325u;

    static {
        f4323s = null;
        f4324t = new CountDownLatch(1);
    }

    private C0640x(Context context, ac acVar, boolean z) {
        super(context, acVar);
        this.f4325u = z;
    }

    public static C0640x m4872a(String str, Context context, boolean z) {
        ac c0619e = new C0619e();
        C0636v.m4773a(str, context, c0619e);
        if (z) {
            synchronized (C0640x.class) {
                if (f4323s == null) {
                    new Thread(new C0642z(context)).start();
                }
            }
        }
        return new C0640x(context, c0619e, z);
    }

    private C0641y m4874c() {
        try {
            if (!f4324t.await(2, TimeUnit.SECONDS)) {
                return new C0641y(this, null, false);
            }
            synchronized (C0640x.class) {
                if (f4323s == null) {
                    C0641y c0641y = new C0641y(this, null, false);
                    return c0641y;
                }
                C0322b a = f4323s.m2018a();
                return new C0641y(this, m4738a(a.f1732a), a.f1733b);
            }
        } catch (InterruptedException e) {
            return new C0641y(this, null, false);
        }
    }

    protected final C0229d m4875b(Context context) {
        C0229d b = super.m4787b(context);
        if (this.f4325u) {
            try {
                if (C0636v.f4261r) {
                    C0641y c = m4874c();
                    String str = c.f4348a;
                    if (str != null) {
                        b.f1256O = Boolean.valueOf(c.f4349b);
                        b.f1255N = Integer.valueOf(5);
                        b.f1254M = str;
                        C0636v.m4772a(28, m);
                    }
                } else {
                    b.f1254M = C0636v.m4778d(context);
                    C0636v.m4772a(24, m);
                }
            } catch (IOException e) {
            } catch (C0639w e2) {
            }
        }
        return b;
    }
}
