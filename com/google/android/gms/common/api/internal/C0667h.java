package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p001b.C0029a;
import android.util.Log;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.C0697i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0467c;
import com.google.android.gms.common.api.C0531b;
import com.google.android.gms.common.api.C0654a;
import com.google.android.gms.common.api.C0655d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0727j;
import com.google.android.gms.common.internal.ax;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.h */
public final class C0667h implements aq {
    final al f4597a;
    final al f4598b;
    Bundle f4599c;
    ConnectionResult f4600d;
    ConnectionResult f4601e;
    boolean f4602f;
    final Lock f4603g;
    private final Context f4604h;
    private final C0689z f4605i;
    private final Looper f4606j;
    private final Map f4607k;
    private final Set f4608l;
    private final C0467c f4609m;
    private int f4610n;

    public C0667h(Context context, C0689z c0689z, Lock lock, Looper looper, C0697i c0697i, Map map, C0727j c0727j, Map map2, C0531b c0531b, ArrayList arrayList) {
        this.f4607k = new C0029a();
        this.f4608l = Collections.newSetFromMap(new WeakHashMap());
        this.f4600d = null;
        this.f4601e = null;
        this.f4602f = false;
        this.f4610n = 0;
        this.f4604h = context;
        this.f4605i = c0689z;
        this.f4603g = lock;
        this.f4606j = looper;
        C0467c c0467c = null;
        Map c0029a = new C0029a();
        Map c0029a2 = new C0029a();
        for (C0655d c0655d : map.keySet()) {
            C0467c c0467c2 = (C0467c) map.get(c0655d);
            if (c0467c2.m2866d()) {
                c0467c = c0467c2;
            }
            if (c0467c2.m2870i()) {
                c0029a.put(c0655d, c0467c2);
            } else {
                c0029a2.put(c0655d, c0467c2);
            }
        }
        this.f4609m = c0467c;
        if (c0029a.isEmpty()) {
            throw new IllegalStateException("CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        }
        Map c0029a3 = new C0029a();
        Map c0029a4 = new C0029a();
        for (C0654a c0654a : map2.keySet()) {
            C0655d b = c0654a.m5074b();
            if (c0029a.containsKey(b)) {
                c0029a3.put(c0654a, map2.get(c0654a));
            } else if (c0029a2.containsKey(b)) {
                c0029a4.put(c0654a, map2.get(c0654a));
            } else {
                throw new IllegalStateException("Each API in the apiTypeMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0666g c0666g = (C0666g) it.next();
            if (c0029a3.containsKey(c0666g.f4594a)) {
                arrayList2.add(c0666g);
            } else if (c0029a4.containsKey(c0666g.f4594a)) {
                arrayList3.add(c0666g);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the apiTypeMap");
            }
        }
        Context context2 = context;
        this.f4597a = new al(context2, this.f4605i, lock, looper, c0697i, c0029a2, null, c0029a4, null, arrayList3, new C0668i(this));
        Context context3 = context;
        this.f4598b = new al(context3, this.f4605i, lock, looper, c0697i, c0029a, c0727j, c0029a3, c0531b, arrayList2, new C0669j(this));
        for (C0655d c0655d2 : c0029a2.keySet()) {
            this.f4607k.put(c0655d2, this.f4597a);
        }
        for (C0655d c0655d22 : c0029a.keySet()) {
            this.f4607k.put(c0655d22, this.f4598b);
        }
    }

    private void m5188a(ConnectionResult connectionResult) {
        switch (this.f4610n) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                this.f4605i.m5286a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        m5194h();
        this.f4610n = 0;
    }

    static /* synthetic */ void m5189a(C0667h c0667h) {
        if (C0667h.m5191b(c0667h.f4600d)) {
            if (C0667h.m5191b(c0667h.f4601e) || c0667h.m5195i()) {
                switch (c0667h.f4610n) {
                    case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                        break;
                    case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                        c0667h.f4605i.m5285a(c0667h.f4599c);
                        break;
                    default:
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                        break;
                }
                c0667h.m5194h();
                c0667h.f4610n = 0;
            } else if (c0667h.f4601e == null) {
            } else {
                if (c0667h.f4610n == 1) {
                    c0667h.m5194h();
                    return;
                }
                c0667h.m5188a(c0667h.f4601e);
                c0667h.f4597a.m5162c();
            }
        } else if (c0667h.f4600d != null && C0667h.m5191b(c0667h.f4601e)) {
            c0667h.f4598b.m5162c();
            c0667h.m5188a(c0667h.f4600d);
        } else if (c0667h.f4600d != null && c0667h.f4601e != null) {
            ConnectionResult connectionResult = c0667h.f4600d;
            if (c0667h.f4598b.f4566l < c0667h.f4597a.f4566l) {
                connectionResult = c0667h.f4601e;
            }
            c0667h.m5188a(connectionResult);
        }
    }

    static /* synthetic */ void m5190a(C0667h c0667h, int i, boolean z) {
        c0667h.f4605i.m5284a(i, z);
        c0667h.f4601e = null;
        c0667h.f4600d = null;
    }

    private static boolean m5191b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.m5057b();
    }

    private boolean m5192c(C0586c c0586c) {
        C0655d c0655d = c0586c.f2836c;
        ax.m5536b(this.f4607k.containsKey(c0655d), "GoogleApiClient is not configured to use the API required for this call.");
        return ((al) this.f4607k.get(c0655d)).equals(this.f4598b);
    }

    private boolean m5193g() {
        this.f4603g.lock();
        try {
            boolean z = this.f4610n == 2;
            this.f4603g.unlock();
            return z;
        } catch (Throwable th) {
            this.f4603g.unlock();
        }
    }

    private void m5194h() {
        for (av g : this.f4608l) {
            g.m3328g();
        }
        this.f4608l.clear();
    }

    private boolean m5195i() {
        return this.f4601e != null && this.f4601e.m5058c() == 4;
    }

    private PendingIntent m5196j() {
        return this.f4609m == null ? null : PendingIntent.getActivity(this.f4604h, this.f4605i.m5308o(), this.f4609m.m2867e(), 134217728);
    }

    public final C0586c m5197a(C0586c c0586c) {
        if (!m5192c(c0586c)) {
            return this.f4597a.m5153a(c0586c);
        }
        if (!m5195i()) {
            return this.f4598b.m5153a(c0586c);
        }
        c0586c.m3366b(new Status(4, null, m5196j()));
        return c0586c;
    }

    public final void m5198a() {
        this.f4610n = 2;
        this.f4602f = false;
        this.f4601e = null;
        this.f4600d = null;
        this.f4597a.m5154a();
        this.f4598b.m5154a();
    }

    public final void m5199a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f4598b.m5158a(str + "  ", fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f4597a.m5158a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean m5200a(av avVar) {
        this.f4603g.lock();
        try {
            if ((m5193g() || m5204d()) && !this.f4598b.m5163d()) {
                this.f4608l.add(avVar);
                if (this.f4610n == 0) {
                    this.f4610n = 1;
                }
                this.f4601e = null;
                this.f4598b.m5154a();
                return true;
            }
            this.f4603g.unlock();
            return false;
        } finally {
            this.f4603g.unlock();
        }
    }

    public final ConnectionResult m5201b() {
        throw new UnsupportedOperationException();
    }

    public final C0586c m5202b(C0586c c0586c) {
        if (!m5192c(c0586c)) {
            return this.f4597a.m5161b(c0586c);
        }
        if (!m5195i()) {
            return this.f4598b.m5161b(c0586c);
        }
        c0586c.m3366b(new Status(4, null, m5196j()));
        return c0586c;
    }

    public final boolean m5203c() {
        this.f4601e = null;
        this.f4600d = null;
        this.f4610n = 0;
        boolean c = this.f4597a.m5162c();
        boolean c2 = this.f4598b.m5162c();
        m5194h();
        return c && c2;
    }

    public final boolean m5204d() {
        boolean z = true;
        this.f4603g.lock();
        try {
            if (!(this.f4597a.m5163d() && (this.f4598b.m5163d() || m5195i() || this.f4610n == 1))) {
                z = false;
            }
            this.f4603g.unlock();
            return z;
        } catch (Throwable th) {
            this.f4603g.unlock();
        }
    }

    public final void m5205e() {
        this.f4597a.m5164e();
        this.f4598b.m5164e();
    }

    public final void m5206f() {
        this.f4603g.lock();
        try {
            boolean g = m5193g();
            this.f4598b.m5162c();
            this.f4601e = new ConnectionResult(4);
            if (g) {
                new Handler(this.f4606j).post(new C0670k(this));
            } else {
                m5194h();
            }
            this.f4603g.unlock();
        } catch (Throwable th) {
            this.f4603g.unlock();
        }
    }
}
