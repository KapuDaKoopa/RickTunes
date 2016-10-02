package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.C0697i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0467c;
import com.google.android.gms.common.api.C0531b;
import com.google.android.gms.common.api.C0654a;
import com.google.android.gms.common.internal.C0727j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class al implements aq {
    final Lock f4555a;
    final Condition f4556b;
    final Context f4557c;
    final C0697i f4558d;
    final an f4559e;
    final Map f4560f;
    final Map f4561g;
    final C0727j f4562h;
    final Map f4563i;
    final C0531b f4564j;
    volatile ak f4565k;
    int f4566l;
    final C0689z f4567m;
    final ar f4568n;
    private ConnectionResult f4569o;

    public al(Context context, C0689z c0689z, Lock lock, Looper looper, C0697i c0697i, Map map, C0727j c0727j, Map map2, C0531b c0531b, ArrayList arrayList, ar arVar) {
        this.f4561g = new HashMap();
        this.f4569o = null;
        this.f4557c = context;
        this.f4555a = lock;
        this.f4558d = c0697i;
        this.f4560f = map;
        this.f4562h = c0727j;
        this.f4563i = map2;
        this.f4564j = c0531b;
        this.f4567m = c0689z;
        this.f4568n = arVar;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0666g) it.next()).f4595b = this;
        }
        this.f4559e = new an(this, looper);
        this.f4556b = lock.newCondition();
        this.f4565k = new C0688y(this);
    }

    public final C0586c m5153a(C0586c c0586c) {
        return this.f4565k.m5135a(c0586c);
    }

    public final void m5154a() {
        this.f4565k.m5142c();
    }

    public final void m5155a(int i) {
        this.f4555a.lock();
        try {
            this.f4565k.m5137a(i);
        } finally {
            this.f4555a.unlock();
        }
    }

    final void m5156a(ConnectionResult connectionResult) {
        this.f4555a.lock();
        try {
            this.f4569o = connectionResult;
            this.f4565k = new C0688y(this);
            this.f4565k.m5136a();
            this.f4556b.signalAll();
        } finally {
            this.f4555a.unlock();
        }
    }

    final void m5157a(am amVar) {
        this.f4559e.sendMessage(this.f4559e.obtainMessage(1, amVar));
    }

    public final void m5158a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "  ";
        for (C0654a c0654a : this.f4563i.keySet()) {
            printWriter.append(str).append(c0654a.f4525c).println(":");
            ((C0467c) this.f4560f.get(c0654a.m5074b())).m2865a(str2, printWriter);
        }
    }

    public final boolean m5159a(av avVar) {
        return false;
    }

    public final ConnectionResult m5160b() {
        m5154a();
        while (this.f4565k instanceof C0674o) {
            try {
                this.f4556b.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return m5163d() ? ConnectionResult.f4498a : this.f4569o != null ? this.f4569o : new ConnectionResult(13, null);
    }

    public final C0586c m5161b(C0586c c0586c) {
        return this.f4565k.m5140b(c0586c);
    }

    public final boolean m5162c() {
        boolean b = this.f4565k.m5141b();
        if (b) {
            this.f4561g.clear();
        }
        return b;
    }

    public final boolean m5163d() {
        return this.f4565k instanceof C0671l;
    }

    public final void m5164e() {
        if (m5163d()) {
            C0671l c0671l = (C0671l) this.f4565k;
            if (c0671l.f4615b) {
                c0671l.f4615b = false;
                c0671l.f4614a.f4567m.m5291a(false);
                c0671l.m5219b();
            }
        }
    }

    public final void m5165f() {
    }
}
