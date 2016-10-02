package com.google.android.gms.p006b;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.b.ux */
public final class ux {
    final Map f4229a;
    final Set f4230b;
    final PriorityBlockingQueue f4231c;
    List f4232d;
    private AtomicInteger f4233e;
    private final PriorityBlockingQueue f4234f;
    private final aw f4235g;
    private final kn f4236h;
    private final xj f4237i;
    private mi[] f4238j;
    private cw f4239k;

    private ux(aw awVar, kn knVar) {
        this(awVar, knVar, new hr(new Handler(Looper.getMainLooper())));
    }

    public ux(aw awVar, kn knVar, byte b) {
        this(awVar, knVar);
    }

    private ux(aw awVar, kn knVar, xj xjVar) {
        this.f4233e = new AtomicInteger();
        this.f4229a = new HashMap();
        this.f4230b = new HashSet();
        this.f4231c = new PriorityBlockingQueue();
        this.f4234f = new PriorityBlockingQueue();
        this.f4232d = new ArrayList();
        this.f4235g = awVar;
        this.f4236h = knVar;
        this.f4238j = new mi[4];
        this.f4237i = xjVar;
    }

    public final ue m4764a(ue ueVar) {
        ueVar.m3548a(this);
        synchronized (this.f4230b) {
            this.f4230b.add(ueVar);
        }
        ueVar.m3546a(this.f4233e.incrementAndGet());
        ueVar.m3552a("add-to-queue");
        if (ueVar.m3561k()) {
            synchronized (this.f4229a) {
                String e = ueVar.m3558e();
                if (this.f4229a.containsKey(e)) {
                    Queue queue = (Queue) this.f4229a.get(e);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(ueVar);
                    this.f4229a.put(e, queue);
                    if (yh.f4366b) {
                        yh.m4915a("Request for cacheKey=%s is in flight, putting on hold.", e);
                    }
                } else {
                    this.f4229a.put(e, null);
                    this.f4231c.add(ueVar);
                }
            }
        } else {
            this.f4234f.add(ueVar);
        }
        return ueVar;
    }

    public final void m4765a() {
        int i = 0;
        if (this.f4239k != null) {
            this.f4239k.m3597a();
        }
        for (int i2 = 0; i2 < this.f4238j.length; i2++) {
            if (this.f4238j[i2] != null) {
                this.f4238j[i2].m4211a();
            }
        }
        this.f4239k = new cw(this.f4231c, this.f4234f, this.f4235g, this.f4237i);
        this.f4239k.start();
        while (i < this.f4238j.length) {
            mi miVar = new mi(this.f4234f, this.f4236h, this.f4235g, this.f4237i);
            this.f4238j[i] = miVar;
            miVar.start();
            i++;
        }
    }
}
