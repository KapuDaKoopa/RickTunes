package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.w */
public final class C0742w implements Callback {
    final ArrayList f4871a;
    private final C0468x f4872b;
    private final ArrayList f4873c;
    private final ArrayList f4874d;
    private volatile boolean f4875e;
    private final AtomicInteger f4876f;
    private boolean f4877g;
    private final Handler f4878h;
    private final Object f4879i;

    public C0742w(Looper looper, C0468x c0468x) {
        this.f4873c = new ArrayList();
        this.f4871a = new ArrayList();
        this.f4874d = new ArrayList();
        this.f4875e = false;
        this.f4876f = new AtomicInteger(0);
        this.f4877g = false;
        this.f4879i = new Object();
        this.f4872b = c0468x;
        this.f4878h = new Handler(looper, this);
    }

    public final void m5613a() {
        this.f4875e = false;
        this.f4876f.incrementAndGet();
    }

    public final void m5614a(int i) {
        boolean z = false;
        if (Looper.myLooper() == this.f4878h.getLooper()) {
            z = true;
        }
        ax.m5532a(z, (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f4878h.removeMessages(1);
        synchronized (this.f4879i) {
            this.f4877g = true;
            ArrayList arrayList = new ArrayList(this.f4873c);
            int i2 = this.f4876f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0464l c0464l = (C0464l) it.next();
                if (this.f4875e && this.f4876f.get() == i2) {
                    if (this.f4873c.contains(c0464l)) {
                        c0464l.m2854a(i);
                    }
                }
            }
            this.f4871a.clear();
            this.f4877g = false;
        }
    }

    public final void m5615a(Bundle bundle) {
        boolean z = true;
        ax.m5532a(Looper.myLooper() == this.f4878h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f4879i) {
            ax.m5531a(!this.f4877g);
            this.f4878h.removeMessages(1);
            this.f4877g = true;
            if (this.f4871a.size() != 0) {
                z = false;
            }
            ax.m5531a(z);
            ArrayList arrayList = new ArrayList(this.f4873c);
            int i = this.f4876f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0464l c0464l = (C0464l) it.next();
                if (this.f4875e && this.f4872b.m2872h() && this.f4876f.get() == i) {
                    if (!this.f4871a.contains(c0464l)) {
                        c0464l.m2855a(bundle);
                    }
                }
            }
            this.f4871a.clear();
            this.f4877g = false;
        }
    }

    public final void m5616a(ConnectionResult connectionResult) {
        ax.m5532a(Looper.myLooper() == this.f4878h.getLooper(), (Object) "onConnectionFailure must only be called on the Handler thread");
        this.f4878h.removeMessages(1);
        synchronized (this.f4879i) {
            ArrayList arrayList = new ArrayList(this.f4874d);
            int i = this.f4876f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0465m c0465m = (C0465m) it.next();
                if (!this.f4875e || this.f4876f.get() != i) {
                    return;
                } else if (this.f4874d.contains(c0465m)) {
                    c0465m.m2856a(connectionResult);
                }
            }
        }
    }

    public final void m5617a(C0464l c0464l) {
        ax.m5527a((Object) c0464l);
        synchronized (this.f4879i) {
            if (this.f4873c.contains(c0464l)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + c0464l + " is already registered");
            } else {
                this.f4873c.add(c0464l);
            }
        }
        if (this.f4872b.m2872h()) {
            this.f4878h.sendMessage(this.f4878h.obtainMessage(1, c0464l));
        }
    }

    public final void m5618a(C0465m c0465m) {
        ax.m5527a((Object) c0465m);
        synchronized (this.f4879i) {
            if (this.f4874d.contains(c0465m)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + c0465m + " is already registered");
            } else {
                this.f4874d.add(c0465m);
            }
        }
    }

    public final void m5619b() {
        this.f4875e = true;
    }

    public final void m5620b(C0465m c0465m) {
        ax.m5527a((Object) c0465m);
        synchronized (this.f4879i) {
            if (!this.f4874d.remove(c0465m)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + c0465m + " not found");
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C0464l c0464l = (C0464l) message.obj;
            synchronized (this.f4879i) {
                if (this.f4875e && this.f4872b.m2872h() && this.f4873c.contains(c0464l)) {
                    C0468x c0468x = this.f4872b;
                    c0464l.m2855a(null);
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + message.what, new Exception());
        return false;
    }
}
