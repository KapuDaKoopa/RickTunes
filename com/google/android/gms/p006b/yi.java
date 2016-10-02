package com.google.android.gms.p006b;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.b.yi */
final class yi {
    public static final boolean f4367a;
    private final List f4368b;
    private boolean f4369c;

    static {
        f4367a = yh.f4366b;
    }

    yi() {
        this.f4368b = new ArrayList();
        this.f4369c = false;
    }

    public final synchronized void m4920a(String str) {
        long j;
        this.f4369c = true;
        if (this.f4368b.size() == 0) {
            j = 0;
        } else {
            j = ((yj) this.f4368b.get(this.f4368b.size() - 1)).f4372c - ((yj) this.f4368b.get(0)).f4372c;
        }
        if (j > 0) {
            long j2 = ((yj) this.f4368b.get(0)).f4372c;
            yh.m4916b("(%-4d ms) %s", Long.valueOf(j), str);
            j = j2;
            for (yj yjVar : this.f4368b) {
                yh.m4916b("(+%-4d) [%2d] %s", Long.valueOf(yjVar.f4372c - j), Long.valueOf(yjVar.f4371b), yjVar.f4370a);
                j = yjVar.f4372c;
            }
        }
    }

    public final synchronized void m4921a(String str, long j) {
        if (this.f4369c) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f4368b.add(new yj(str, j, SystemClock.elapsedRealtime()));
    }

    protected final void finalize() {
        if (!this.f4369c) {
            m4920a("Request on the loose");
            yh.m4917c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
