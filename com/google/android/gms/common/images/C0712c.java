package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.common.images.c */
final class C0712c implements Runnable {
    final /* synthetic */ ImageManager f4762a;
    private final Uri f4763b;
    private final ParcelFileDescriptor f4764c;

    public C0712c(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f4762a = imageManager;
        this.f4763b = uri;
        this.f4764c = parcelFileDescriptor;
    }

    public final void run() {
        String str = "LoadBitmapFromDiskRunnable can't be executed in the main thread";
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            "checkNotMainThread: current thread " + Thread.currentThread() + " IS the main thread " + Looper.getMainLooper().getThread() + "!";
            throw new IllegalStateException(str);
        }
        boolean z = false;
        Bitmap bitmap = null;
        if (this.f4764c != null) {
            try {
                bitmap = BitmapFactory.decodeFileDescriptor(this.f4764c.getFileDescriptor());
            } catch (OutOfMemoryError e) {
                "OOM while loading bitmap for uri: " + this.f4763b;
                z = true;
            }
            try {
                this.f4764c.close();
            } catch (IOException e2) {
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f4762a.f4751d.post(new C0713d(this.f4762a, this.f4763b, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e3) {
            Log.w("ImageManager", "Latch interrupted while posting " + this.f4763b);
        }
    }
}
