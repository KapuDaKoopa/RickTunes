package android.support.v4.content;

import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* renamed from: android.support.v4.content.b */
final class C0046b extends C0045m implements Runnable {
    Object f76a;
    boolean f77b;
    final /* synthetic */ C0044a f78c;
    private CountDownLatch f79e;

    C0046b(C0044a c0044a) {
        this.f78c = c0044a;
        this.f79e = new CountDownLatch(1);
    }

    protected final void m83a() {
        try {
            C0044a c0044a = this.f78c;
            Object obj = this.f76a;
            c0044a.m68a(this);
        } finally {
            this.f79e.countDown();
        }
    }

    protected final void m84a(Object obj) {
        try {
            C0043k c0043k = this.f78c;
            if (c0043k.f62a != this) {
                c0043k.m68a(this);
            } else if (!c0043k.f58j) {
                c0043k.f61m = false;
                c0043k.f65d = SystemClock.uptimeMillis();
                c0043k.f62a = null;
                if (c0043k.f55g != null) {
                    c0043k.f55g.onLoadComplete(c0043k, obj);
                }
            }
            this.f79e.countDown();
        } catch (Throwable th) {
            this.f79e.countDown();
        }
    }

    protected final /* synthetic */ Object m85b() {
        this.f76a = this.f78c.m71c();
        return this.f76a;
    }

    public final void run() {
        this.f77b = false;
        this.f78c.m70b();
    }
}
