package com.google.android.gms.p006b;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@op
/* renamed from: com.google.android.gms.b.sm */
public class sm implements ss {
    private final Object f3378a;
    private Object f3379b;
    private boolean f3380c;
    private boolean f3381d;
    private final st f3382e;

    public sm() {
        this.f3378a = new Object();
        this.f3379b = null;
        this.f3380c = false;
        this.f3381d = false;
        this.f3382e = new st();
    }

    public final void m3857a(Runnable runnable) {
        this.f3382e.m4538a(runnable);
    }

    public final void m3858b(Object obj) {
        synchronized (this.f3378a) {
            if (this.f3381d) {
            } else if (this.f3380c) {
                throw new IllegalStateException("Provided CallbackFuture with multiple values.");
            } else {
                this.f3380c = true;
                this.f3379b = obj;
                this.f3378a.notifyAll();
                this.f3382e.m4537a();
            }
        }
    }

    public final void m3859b(Runnable runnable) {
        st stVar = this.f3382e;
        synchronized (stVar.f4116a) {
            if (stVar.f4118c) {
                st.m4536b(runnable);
            } else {
                stVar.f4117b.add(runnable);
            }
        }
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f3378a) {
            if (this.f3380c) {
                return false;
            }
            this.f3381d = true;
            this.f3380c = true;
            this.f3378a.notifyAll();
            this.f3382e.m4537a();
            return true;
        }
    }

    public Object get() {
        Object obj;
        synchronized (this.f3378a) {
            if (!this.f3380c) {
                try {
                    this.f3378a.wait();
                } catch (InterruptedException e) {
                }
            }
            if (this.f3381d) {
                throw new CancellationException("CallbackFuture was cancelled.");
            }
            obj = this.f3379b;
        }
        return obj;
    }

    public Object get(long j, TimeUnit timeUnit) {
        Object obj;
        synchronized (this.f3378a) {
            if (!this.f3380c) {
                try {
                    long toMillis = timeUnit.toMillis(j);
                    if (toMillis != 0) {
                        this.f3378a.wait(toMillis);
                    }
                } catch (InterruptedException e) {
                }
            }
            if (!this.f3380c) {
                throw new TimeoutException("CallbackFuture timed out.");
            } else if (this.f3381d) {
                throw new CancellationException("CallbackFuture was cancelled.");
            } else {
                obj = this.f3379b;
            }
        }
        return obj;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f3378a) {
            z = this.f3381d;
        }
        return z;
    }

    public boolean isDone() {
        boolean z;
        synchronized (this.f3378a) {
            z = this.f3380c;
        }
        return z;
    }
}
