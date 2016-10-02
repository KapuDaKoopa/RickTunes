package android.support.v4.content;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.content.n */
final class C0054n implements ThreadFactory {
    private final AtomicInteger f83a;

    C0054n() {
        this.f83a = new AtomicInteger(1);
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ModernAsyncTask #" + this.f83a.getAndIncrement());
    }
}
