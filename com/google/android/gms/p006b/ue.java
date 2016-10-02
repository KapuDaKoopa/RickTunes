package com.google.android.gms.p006b;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.google.android.gms.b.ue */
public abstract class ue implements Comparable {
    private final yi f3011a;
    private final int f3012b;
    private final String f3013c;
    private final int f3014d;
    private final wg f3015e;
    private Integer f3016f;
    private ux f3017g;
    private boolean f3018h;
    private boolean f3019i;
    private boolean f3020j;
    private long f3021k;
    private xr f3022l;
    private ax f3023m;

    public ue(String str, wg wgVar) {
        int hashCode;
        this.f3011a = yi.f4367a ? new yi() : null;
        this.f3018h = true;
        this.f3019i = false;
        this.f3020j = false;
        this.f3021k = 0;
        this.f3023m = null;
        this.f3012b = 0;
        this.f3013c = str;
        this.f3015e = wgVar;
        this.f3022l = new et();
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    hashCode = host.hashCode();
                    this.f3014d = hashCode;
                }
            }
        }
        hashCode = 0;
        this.f3014d = hashCode;
    }

    protected static xy m3541a(xy xyVar) {
        return xyVar;
    }

    @Deprecated
    public static byte[] m3543h() {
        return null;
    }

    public static String m3544i() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public static byte[] m3545j() {
        return null;
    }

    public final ue m3546a(int i) {
        this.f3016f = Integer.valueOf(i);
        return this;
    }

    public final ue m3547a(ax axVar) {
        this.f3023m = axVar;
        return this;
    }

    public final ue m3548a(ux uxVar) {
        this.f3017g = uxVar;
        return this;
    }

    protected abstract wf m3549a(pu puVar);

    public Map m3550a() {
        return Collections.emptyMap();
    }

    protected abstract void m3551a(Object obj);

    public final void m3552a(String str) {
        if (yi.f4367a) {
            this.f3011a.m4921a(str, Thread.currentThread().getId());
        } else if (this.f3021k == 0) {
            this.f3021k = SystemClock.elapsedRealtime();
        }
    }

    public final int m3553b() {
        return this.f3012b;
    }

    public final void m3554b(xy xyVar) {
        if (this.f3015e != null) {
            this.f3015e.m4514a(xyVar);
        }
    }

    final void m3555b(String str) {
        if (this.f3017g != null) {
            ux uxVar = this.f3017g;
            synchronized (uxVar.f4230b) {
                uxVar.f4230b.remove(this);
            }
            synchronized (uxVar.f4232d) {
                Iterator it = uxVar.f4232d.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            if (this.f3018h) {
                synchronized (uxVar.f4229a) {
                    Queue queue = (Queue) uxVar.f4229a.remove(this.f3013c);
                    if (queue != null) {
                        if (yh.f4366b) {
                            yh.m4915a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), r3);
                        }
                        uxVar.f4231c.addAll(queue);
                    }
                }
            }
        }
        if (yi.f4367a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new uf(this, str, id));
                return;
            }
            this.f3011a.m4921a(str, id);
            this.f3011a.m4920a(toString());
            return;
        }
        if (SystemClock.elapsedRealtime() - this.f3021k >= 3000) {
            yh.m4916b("%d ms: %s", Long.valueOf(SystemClock.elapsedRealtime() - this.f3021k), toString());
        }
    }

    public final int m3556c() {
        return this.f3014d;
    }

    public /* synthetic */ int compareTo(Object obj) {
        ue ueVar = (ue) obj;
        ug ugVar = ug.NORMAL;
        ug ugVar2 = ug.NORMAL;
        return ugVar == ugVar2 ? this.f3016f.intValue() - ueVar.f3016f.intValue() : ugVar2.ordinal() - ugVar.ordinal();
    }

    public final String m3557d() {
        return this.f3013c;
    }

    public final String m3558e() {
        return this.f3013c;
    }

    public final ax m3559f() {
        return this.f3023m;
    }

    public final boolean m3560g() {
        return this.f3019i;
    }

    public final boolean m3561k() {
        return this.f3018h;
    }

    public final int m3562l() {
        return this.f3022l.m3698a();
    }

    public final xr m3563m() {
        return this.f3022l;
    }

    public final void m3564n() {
        this.f3020j = true;
    }

    public final boolean m3565o() {
        return this.f3020j;
    }

    public String toString() {
        return (this.f3019i ? "[X] " : "[ ] ") + this.f3013c + " " + ("0x" + Integer.toHexString(this.f3014d)) + " " + ug.NORMAL + " " + this.f3016f;
    }
}
