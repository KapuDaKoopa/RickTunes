package com.google.android.gms.auth.api.signin.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ax;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.gms.auth.api.signin.internal.w */
public final class C0602w {
    private static final WeakHashMap f2847a;
    private static final Lock f2848b;
    private final Lock f2849c;
    private final Map f2850d;

    static {
        f2847a = new WeakHashMap();
        f2848b = new ReentrantLock();
    }

    private C0602w(Map map) {
        this.f2849c = new ReentrantLock();
        this.f2850d = map;
    }

    public static C0602w m3404a(String str) {
        ax.m5529a(str);
        f2848b.lock();
        try {
            C0602w c0602w = (C0602w) f2847a.get(str);
            if (c0602w == null) {
                c0602w = new C0602w(new C0604y());
                f2847a.put(str, c0602w);
            }
            f2848b.unlock();
            return c0602w;
        } catch (Throwable th) {
            f2848b.unlock();
        }
    }

    public final boolean m3405a(Set set, C0603x c0603x) {
        ax.m5527a((Object) set);
        ax.m5527a((Object) c0603x);
        if (set.size() != 0) {
            if (!(c0603x.f2852b.m4887a() / 1000 >= c0603x.f2851a - 300)) {
                Iterable arrayList = new ArrayList(set);
                Collections.sort(arrayList);
                this.f2849c.lock();
                try {
                    this.f2850d.put(TextUtils.join(" ", arrayList), c0603x);
                    return true;
                } finally {
                    this.f2849c.unlock();
                }
            }
        }
        return false;
    }
}
