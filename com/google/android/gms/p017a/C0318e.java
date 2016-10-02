package com.google.android.gms.p017a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C0706q;
import com.google.android.gms.common.internal.ax;

/* renamed from: com.google.android.gms.a.e */
public abstract class C0318e {
    private final String f1721a;
    private Object f1722b;

    public C0318e(String str) {
        this.f1721a = str;
    }

    protected final Object m1998a(Context context) {
        if (this.f1722b == null) {
            ax.m5527a((Object) context);
            Context d = C0706q.m5358d(context);
            if (d == null) {
                throw new C0319f("Could not get remote context.");
            }
            try {
                this.f1722b = m1999a((IBinder) d.getClassLoader().loadClass(this.f1721a).newInstance());
            } catch (Throwable e) {
                throw new C0319f("Could not load creator class.", e);
            } catch (Throwable e2) {
                throw new C0319f("Could not instantiate creator.", e2);
            } catch (Throwable e22) {
                throw new C0319f("Could not access creator.", e22);
            }
        }
        return this.f1722b;
    }

    protected abstract Object m1999a(IBinder iBinder);
}
