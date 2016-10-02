package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.b.sq */
final class sq implements Runnable {
    final /* synthetic */ AtomicInteger f4112a;
    final /* synthetic */ int f4113b;
    final /* synthetic */ sm f4114c;
    final /* synthetic */ List f4115d;

    sq(AtomicInteger atomicInteger, int i, sm smVar, List list) {
        this.f4112a = atomicInteger;
        this.f4113b = i;
        this.f4114c = smVar;
        this.f4115d = list;
    }

    public final void run() {
        Throwable e;
        if (this.f4112a.incrementAndGet() >= this.f4113b) {
            try {
                sm smVar = this.f4114c;
                List<ss> list = this.f4115d;
                Object arrayList = new ArrayList();
                for (ss ssVar : list) {
                    Object obj = ssVar.get();
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
                smVar.m3858b(arrayList);
            } catch (ExecutionException e2) {
                e = e2;
                C0501b.m3026a("Unable to convert list of futures to a future of list", e);
            } catch (InterruptedException e3) {
                e = e3;
                C0501b.m3026a("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
