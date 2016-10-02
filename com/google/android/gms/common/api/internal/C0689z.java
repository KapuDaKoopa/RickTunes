package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.C0697i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.api.C0467c;
import com.google.android.gms.common.api.C0531b;
import com.google.android.gms.common.api.C0583o;
import com.google.android.gms.common.api.C0655d;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.api.C0690j;
import com.google.android.gms.common.api.C0694v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0468x;
import com.google.android.gms.common.internal.C0727j;
import com.google.android.gms.common.internal.C0742w;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.wm;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.z */
public final class C0689z extends C0660i implements ar {
    final Queue f4656a;
    ah f4657b;
    final Map f4658c;
    Set f4659d;
    final C0727j f4660e;
    final Map f4661f;
    final C0531b f4662g;
    final Set f4663h;
    Set f4664i;
    private final Lock f4665j;
    private final C0742w f4666k;
    private aq f4667l;
    private final int f4668m;
    private final Context f4669n;
    private final Looper f4670o;
    private volatile boolean f4671p;
    private long f4672q;
    private long f4673r;
    private final af f4674s;
    private final C0697i f4675t;
    private final Set f4676u;
    private C0694v f4677v;
    private final ArrayList f4678w;
    private Integer f4679x;
    private final ai f4680y;
    private final C0468x f4681z;

    public C0689z(Context context, Lock lock, Looper looper, C0727j c0727j, C0697i c0697i, C0531b c0531b, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        this.f4667l = null;
        this.f4656a = new LinkedList();
        this.f4672q = 120000;
        this.f4673r = 5000;
        this.f4659d = new HashSet();
        this.f4676u = Collections.newSetFromMap(new WeakHashMap());
        this.f4663h = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75f, 2));
        this.f4679x = null;
        this.f4664i = null;
        this.f4680y = new aa(this);
        this.f4681z = new ab(this);
        this.f4669n = context;
        this.f4665j = lock;
        this.f4666k = new C0742w(looper, this.f4681z);
        this.f4670o = looper;
        this.f4674s = new af(this, looper);
        this.f4675t = c0697i;
        this.f4668m = i;
        if (this.f4668m >= 0) {
            this.f4679x = Integer.valueOf(i2);
        }
        this.f4661f = map;
        this.f4658c = map2;
        this.f4678w = arrayList;
        for (C0464l a : list) {
            this.f4666k.m5617a(a);
        }
        for (C0465m a2 : list2) {
            this.f4666k.m5618a(a2);
        }
        this.f4660e = c0727j;
        this.f4662g = c0531b;
    }

    public static int m5272a(Iterable iterable, boolean z) {
        int i = 0;
        int i2 = 0;
        for (C0467c c0467c : iterable) {
            if (c0467c.m2870i()) {
                i2 = 1;
            }
            i = c0467c.m2866d() ? 1 : i;
        }
        return i2 != 0 ? (i == 0 || !z) ? 1 : 2 : 3;
    }

    private void m5274a(int i) {
        if (this.f4679x == null) {
            this.f4679x = Integer.valueOf(i);
        } else if (this.f4679x.intValue() != i) {
            throw new IllegalStateException("Cannot use sign-in mode: " + C0689z.m5277b(i) + ". Mode was already set to " + C0689z.m5277b(this.f4679x.intValue()));
        }
        if (this.f4667l == null) {
            Object obj = null;
            Object obj2 = null;
            for (C0467c c0467c : this.f4658c.values()) {
                if (c0467c.m2870i()) {
                    obj2 = 1;
                }
                obj = c0467c.m2866d() ? 1 : obj;
            }
            switch (this.f4679x.intValue()) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    if (obj2 == null) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (obj != null) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    if (obj2 != null) {
                        this.f4667l = new C0667h(this.f4669n, this, this.f4665j, this.f4670o, this.f4675t, this.f4658c, this.f4660e, this.f4661f, this.f4662g, this.f4678w);
                        return;
                    }
                    break;
            }
            this.f4667l = new al(this.f4669n, this, this.f4665j, this.f4670o, this.f4675t, this.f4658c, this.f4660e, this.f4661f, this.f4662g, this.f4678w, this);
        }
    }

    private void m5275a(C0660i c0660i, aw awVar, boolean z) {
        wm.f4318c.m4859a(c0660i).m3336a(new ae(this, awVar, z, c0660i));
    }

    private static String m5277b(int i) {
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                return "SIGN_IN_MODE_REQUIRED";
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                return "SIGN_IN_MODE_OPTIONAL";
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    static /* synthetic */ void m5278b(C0689z c0689z) {
        c0689z.f4665j.lock();
        try {
            if (c0689z.f4671p) {
                c0689z.m5281p();
            }
            c0689z.f4665j.unlock();
        } catch (Throwable th) {
            c0689z.f4665j.unlock();
        }
    }

    static /* synthetic */ void m5279c(C0689z c0689z) {
        c0689z.f4665j.lock();
        try {
            if (c0689z.m5305l()) {
                c0689z.m5281p();
            }
            c0689z.f4665j.unlock();
        } catch (Throwable th) {
            c0689z.f4665j.unlock();
        }
    }

    private void m5281p() {
        this.f4666k.m5619b();
        this.f4667l.m5144a();
    }

    public final C0467c m5282a(C0655d c0655d) {
        Object obj = (C0467c) this.f4658c.get(c0655d);
        ax.m5528a(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public final C0586c m5283a(C0586c c0586c) {
        ax.m5536b(c0586c.f2836c != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        ax.m5536b(this.f4658c.containsKey(c0586c.f2836c), "GoogleApiClient is not configured to use the API required for this call.");
        this.f4665j.lock();
        try {
            if (this.f4667l == null) {
                this.f4656a.add(c0586c);
            } else {
                c0586c = this.f4667l.m5143a(c0586c);
                this.f4665j.unlock();
            }
            return c0586c;
        } finally {
            this.f4665j.unlock();
        }
    }

    public final void m5284a(int i, boolean z) {
        if (!(i != 1 || z || this.f4671p)) {
            this.f4671p = true;
            if (this.f4657b == null) {
                Context applicationContext = this.f4669n.getApplicationContext();
                ap ahVar = new ah(this);
                C0697i c0697i = this.f4675t;
                this.f4657b = (ah) ap.m5120b(applicationContext, ahVar);
            }
            this.f4674s.sendMessageDelayed(this.f4674s.obtainMessage(1), this.f4672q);
            this.f4674s.sendMessageDelayed(this.f4674s.obtainMessage(2), this.f4673r);
        }
        for (aj ajVar : this.f4663h) {
            if (z) {
                ajVar.m3355c();
            }
            ajVar.m3356c(new Status(8, "The connection to Google Play services was lost"));
        }
        this.f4663h.clear();
        this.f4666k.m5614a(i);
        this.f4666k.m5613a();
        if (i == 2) {
            m5281p();
        }
    }

    public final void m5285a(Bundle bundle) {
        while (!this.f4656a.isEmpty()) {
            m5294b((C0586c) this.f4656a.remove());
        }
        this.f4666k.m5615a(bundle);
    }

    public final void m5286a(ConnectionResult connectionResult) {
        if (!this.f4675t.m5324a(this.f4669n, connectionResult.m5058c())) {
            m5305l();
        }
        if (!this.f4671p) {
            this.f4666k.m5616a(connectionResult);
            this.f4666k.m5613a();
        }
    }

    final void m5287a(aj ajVar) {
        this.f4663h.add(ajVar);
        ajVar.m3351a(this.f4680y);
    }

    public final void m5288a(az azVar) {
        this.f4665j.lock();
        try {
            if (this.f4664i == null) {
                this.f4664i = new HashSet();
            }
            this.f4664i.add(azVar);
        } finally {
            this.f4665j.unlock();
        }
    }

    public final void m5289a(C0465m c0465m) {
        this.f4666k.m5618a(c0465m);
    }

    public final void m5290a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f4669n);
        printWriter.append(str).append("mResuming=").print(this.f4671p);
        printWriter.append(" mWorkQueue.size()=").print(this.f4656a.size());
        printWriter.append(" mUnconsumedRunners.size()=").println(this.f4663h.size());
        if (this.f4667l != null) {
            this.f4667l.m5145a(str, fileDescriptor, printWriter, strArr);
        }
    }

    final void m5291a(boolean z) {
        for (aj ajVar : this.f4663h) {
            if (ajVar.m3350a() != null) {
                ajVar.m3355c();
                IBinder j = m5282a(ajVar.m3352b()).m2871j();
                C0694v c0694v = this.f4677v;
                if (ajVar.m3357e()) {
                    ajVar.m3351a(new ag(c0694v, j, (byte) 0));
                } else if (j == null || !j.isBinderAlive()) {
                    ajVar.m3351a(null);
                    ajVar.m3358f();
                    ajVar.m3350a().intValue();
                    c0694v.m5314a();
                } else {
                    Object agVar = new ag(c0694v, j, (byte) 0);
                    ajVar.m3351a(agVar);
                    try {
                        j.linkToDeath(agVar, 0);
                    } catch (RemoteException e) {
                        ajVar.m3358f();
                        ajVar.m3350a().intValue();
                        c0694v.m5314a();
                    }
                }
                this.f4663h.remove(ajVar);
            } else if (z) {
                ajVar.m3359g();
            } else {
                ajVar.m3358f();
                this.f4663h.remove(ajVar);
            }
        }
    }

    public final boolean m5292a(av avVar) {
        return this.f4667l != null && this.f4667l.m5146a(avVar);
    }

    public final Context m5293b() {
        return this.f4669n;
    }

    public final C0586c m5294b(C0586c c0586c) {
        ax.m5536b(c0586c.f2836c != null, "This task can not be executed (it's probably a Batch or malformed)");
        this.f4665j.lock();
        try {
            if (this.f4667l == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f4671p) {
                this.f4656a.add(c0586c);
                while (!this.f4656a.isEmpty()) {
                    aj ajVar = (aj) this.f4656a.remove();
                    m5287a(ajVar);
                    ajVar.m3353b(Status.f4516c);
                }
            } else {
                c0586c = this.f4667l.m5148b(c0586c);
                this.f4665j.unlock();
            }
            return c0586c;
        } finally {
            this.f4665j.unlock();
        }
    }

    public final void m5295b(az azVar) {
        this.f4665j.lock();
        try {
            if (this.f4664i == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.f4664i.remove(azVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!m5306m()) {
                this.f4667l.m5151e();
            }
            this.f4665j.unlock();
        } catch (Throwable th) {
            this.f4665j.unlock();
        }
    }

    public final void m5296b(C0465m c0465m) {
        this.f4666k.m5620b(c0465m);
    }

    public final Looper m5297c() {
        return this.f4670o;
    }

    public final void m5298d() {
        if (this.f4667l != null) {
            this.f4667l.m5152f();
        }
    }

    public final void m5299e() {
        boolean z = false;
        this.f4665j.lock();
        try {
            if (this.f4668m >= 0) {
                ax.m5532a(this.f4679x != null, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f4679x == null) {
                this.f4679x = Integer.valueOf(C0689z.m5272a(this.f4658c.values(), false));
            } else if (this.f4679x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            int intValue = this.f4679x.intValue();
            this.f4665j.lock();
            if (intValue == 3 || intValue == 1 || intValue == 2) {
                z = true;
            }
            ax.m5536b(z, "Illegal sign-in mode: " + intValue);
            m5274a(intValue);
            m5281p();
            this.f4665j.unlock();
        } catch (Throwable th) {
        } finally {
            this.f4665j.unlock();
        }
    }

    public final ConnectionResult m5300f() {
        boolean z = true;
        ax.m5532a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.f4665j.lock();
        try {
            if (this.f4668m >= 0) {
                if (this.f4679x == null) {
                    z = false;
                }
                ax.m5532a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f4679x == null) {
                this.f4679x = Integer.valueOf(C0689z.m5272a(this.f4658c.values(), false));
            } else if (this.f4679x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m5274a(this.f4679x.intValue());
            this.f4666k.m5619b();
            ConnectionResult b = this.f4667l.m5147b();
            return b;
        } finally {
            this.f4665j.unlock();
        }
    }

    public final void m5301g() {
        this.f4665j.lock();
        try {
            boolean z = (this.f4667l == null || this.f4667l.m5149c()) ? false : true;
            m5291a(z);
            for (as asVar : this.f4676u) {
                asVar.f4573a = null;
            }
            this.f4676u.clear();
            for (aj ajVar : this.f4656a) {
                ajVar.m3351a(null);
                ajVar.m3358f();
            }
            this.f4656a.clear();
            if (this.f4667l != null) {
                m5305l();
                this.f4666k.m5613a();
                this.f4665j.unlock();
            }
        } finally {
            this.f4665j.unlock();
        }
    }

    public final C0583o m5302h() {
        ax.m5532a(m5304k(), (Object) "GoogleApiClient is not connected yet.");
        ax.m5532a(this.f4679x.intValue() != 2, (Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        aw awVar = new aw(this);
        if (this.f4658c.containsKey(wm.f4316a)) {
            m5275a((C0660i) this, awVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            Object acVar = new ac(this, atomicReference, awVar);
            Object adVar = new ad(this, awVar);
            C0690j a = new C0690j(this.f4669n).m5309a(wm.f4317b);
            ax.m5528a(acVar, (Object) "Listener must not be null");
            a.f4687f.add(acVar);
            ax.m5528a(adVar, (Object) "Listener must not be null");
            a.f4688g.add(adVar);
            acVar = this.f4674s;
            ax.m5528a(acVar, (Object) "Handler must not be null");
            a.f4686e = acVar.getLooper();
            C0660i b = a.m5312b();
            atomicReference.set(b);
            b.m5096e();
        }
        return awVar;
    }

    public final void m5303j() {
        m5301g();
        m5299e();
    }

    public final boolean m5304k() {
        return this.f4667l != null && this.f4667l.m5150d();
    }

    final boolean m5305l() {
        if (!this.f4671p) {
            return false;
        }
        this.f4671p = false;
        this.f4674s.removeMessages(2);
        this.f4674s.removeMessages(1);
        if (this.f4657b != null) {
            this.f4657b.m5122b();
            this.f4657b = null;
        }
        return true;
    }

    final boolean m5306m() {
        boolean z = false;
        this.f4665j.lock();
        try {
            if (this.f4664i != null) {
                if (!this.f4664i.isEmpty()) {
                    z = true;
                }
                this.f4665j.unlock();
            }
            return z;
        } finally {
            this.f4665j.unlock();
        }
    }

    final String m5307n() {
        Writer stringWriter = new StringWriter();
        m5290a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final int m5308o() {
        return System.identityHashCode(this);
    }
}
