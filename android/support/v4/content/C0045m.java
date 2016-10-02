package android.support.v4.content;

import android.support.v4.app.NotificationCompat;
import com.google.android.gms.C0772e;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.support.v4.content.m */
abstract class C0045m {
    private static final ThreadFactory f67a;
    private static final BlockingQueue f68b;
    private static final C0060s f69c;
    public static final Executor f70d;
    private static volatile Executor f71e;
    private final C0055u f72f;
    private final FutureTask f73g;
    private volatile C0061t f74h;
    private final AtomicBoolean f75i;

    static {
        f67a = new C0054n();
        f68b = new LinkedBlockingQueue(10);
        f70d = new ThreadPoolExecutor(5, NotificationCompat.FLAG_HIGH_PRIORITY, 1, TimeUnit.SECONDS, f68b, f67a);
        f69c = new C0060s();
        f71e = f70d;
    }

    public C0045m() {
        this.f74h = C0061t.PENDING;
        this.f75i = new AtomicBoolean();
        this.f72f = new C0056o(this);
        this.f73g = new C0057p(this, this.f72f);
    }

    private Object m74b(Object obj) {
        f69c.obtainMessage(1, new C0059r(this, obj)).sendToTarget();
        return obj;
    }

    static /* synthetic */ void m75b(C0045m c0045m, Object obj) {
        if (!c0045m.f75i.get()) {
            c0045m.m74b(obj);
        }
    }

    protected static void m76c() {
    }

    static /* synthetic */ void m77c(C0045m c0045m, Object obj) {
        if (c0045m.f73g.isCancelled()) {
            c0045m.m79a();
        } else {
            c0045m.m80a(obj);
        }
        c0045m.f74h = C0061t.FINISHED;
    }

    public final C0045m m78a(Executor executor) {
        if (this.f74h != C0061t.PENDING) {
            switch (C0058q.f87a[this.f74h.ordinal()]) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f74h = C0061t.RUNNING;
        this.f72f.f84b = null;
        executor.execute(this.f73g);
        return this;
    }

    protected void m79a() {
    }

    protected void m80a(Object obj) {
    }

    protected abstract Object m81b();

    public final boolean m82d() {
        return this.f73g.cancel(false);
    }
}
