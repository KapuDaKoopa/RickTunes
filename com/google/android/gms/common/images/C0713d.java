package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.d */
final class C0713d implements Runnable {
    final /* synthetic */ ImageManager f4765a;
    private final Uri f4766b;
    private final Bitmap f4767c;
    private final CountDownLatch f4768d;
    private boolean f4769e;

    public C0713d(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f4765a = imageManager;
        this.f4766b = uri;
        this.f4767c = bitmap;
        this.f4769e = z;
        this.f4768d = countDownLatch;
    }

    private void m5382a(ImageReceiver imageReceiver, boolean z) {
        ArrayList a = imageReceiver.f4747c;
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C0714e c0714e = (C0714e) a.get(i);
            if (z) {
                c0714e.m5384a(this.f4765a.f4750c, this.f4767c);
            } else {
                this.f4765a.f4757j.put(this.f4766b, Long.valueOf(SystemClock.elapsedRealtime()));
                c0714e.m5385a(this.f4765a.f4750c, this.f4765a.f4754g);
            }
            if (!(c0714e instanceof C0716g)) {
                this.f4765a.f4755h.remove(c0714e);
            }
        }
    }

    public final void run() {
        String str = "OnBitmapLoadedRunnable must be executed in the main thread";
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            "checkMainThread: current thread " + Thread.currentThread() + " IS NOT the main thread " + Looper.getMainLooper().getThread() + "!";
            throw new IllegalStateException(str);
        }
        boolean z = this.f4767c != null;
        if (this.f4765a.f4753f != null) {
            if (this.f4769e) {
                this.f4765a.f4753f.m42a();
                System.gc();
                this.f4769e = false;
                this.f4765a.f4751d.post(this);
                return;
            } else if (z) {
                this.f4765a.f4753f.m41a(new C0715f(this.f4766b), this.f4767c);
            }
        }
        ImageReceiver imageReceiver = (ImageReceiver) this.f4765a.f4756i.remove(this.f4766b);
        if (imageReceiver != null) {
            m5382a(imageReceiver, z);
        }
        this.f4768d.countDown();
        synchronized (ImageManager.f4748a) {
            ImageManager.f4749b.remove(this.f4766b);
        }
    }
}
