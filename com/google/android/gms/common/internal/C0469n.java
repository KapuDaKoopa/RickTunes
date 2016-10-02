package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.BinderThread;
import android.support.annotation.CallSuper;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.C0697i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.api.C0467c;
import com.google.android.gms.common.api.C0659h;
import com.google.android.gms.common.api.C0676n;
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.n */
public abstract class C0469n implements C0467c, C0468x {
    public static final String[] f2475f;
    private int f2476a;
    public final Context f2477b;
    public final C0727j f2478c;
    final Handler f2479d;
    protected AtomicInteger f2480e;
    private long f2481g;
    private long f2482h;
    private int f2483i;
    private long f2484j;
    private final Looper f2485k;
    private final C0743y f2486l;
    private final C0697i f2487m;
    private final Object f2488n;
    private final Object f2489o;
    private al f2490p;
    private C0676n f2491q;
    private IInterface f2492r;
    private final ArrayList f2493s;
    private C0735s f2494t;
    private int f2495u;
    private final Set f2496v;
    private final Account f2497w;
    private final C0464l f2498x;
    private final C0465m f2499y;
    private final int f2500z;

    static {
        f2475f = new String[]{"service_esmobile", "service_googleme"};
    }

    public C0469n(Context context, Looper looper, int i, C0727j c0727j, C0464l c0464l, C0465m c0465m) {
        this(context, looper, C0743y.m5621a(context), C0697i.m5318b(), i, c0727j, (C0464l) ax.m5527a((Object) c0464l), (C0465m) ax.m5527a((Object) c0465m));
    }

    private C0469n(Context context, Looper looper, C0743y c0743y, C0697i c0697i, int i, C0727j c0727j, C0464l c0464l, C0465m c0465m) {
        this.f2488n = new Object();
        this.f2489o = new Object();
        this.f2491q = new C0739t(this);
        this.f2493s = new ArrayList();
        this.f2495u = 1;
        this.f2480e = new AtomicInteger(0);
        this.f2477b = (Context) ax.m5528a((Object) context, (Object) "Context must not be null");
        this.f2485k = (Looper) ax.m5528a((Object) looper, (Object) "Looper must not be null");
        this.f2486l = (C0743y) ax.m5528a((Object) c0743y, (Object) "Supervisor must not be null");
        this.f2487m = (C0697i) ax.m5528a((Object) c0697i, (Object) "API availability must not be null");
        this.f2479d = new C0733p(this, looper);
        this.f2500z = i;
        this.f2478c = (C0727j) ax.m5527a((Object) c0727j);
        this.f2497w = c0727j.f4840a;
        this.f2496v = C0469n.m2875a(c0727j.f4842c);
        this.f2498x = c0464l;
        this.f2499y = c0465m;
    }

    private static Set m2875a(Set set) {
        if (set != null) {
            for (Scope contains : set) {
                if (!set.contains(contains)) {
                    throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
                }
            }
        }
        return set;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2876a(int r6, android.os.IInterface r7) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        r2 = 3;
        if (r6 != r2) goto L_0x001d;
    L_0x0005:
        r3 = r0;
    L_0x0006:
        if (r7 == 0) goto L_0x001f;
    L_0x0008:
        r2 = r0;
    L_0x0009:
        if (r3 != r2) goto L_0x0021;
    L_0x000b:
        com.google.android.gms.common.internal.ax.m5535b(r0);
        r1 = r5.f2488n;
        monitor-enter(r1);
        r5.f2495u = r6;	 Catch:{ all -> 0x008a }
        r5.f2492r = r7;	 Catch:{ all -> 0x008a }
        r5.i_();	 Catch:{ all -> 0x008a }
        switch(r6) {
            case 1: goto L_0x0094;
            case 2: goto L_0x0023;
            case 3: goto L_0x008d;
            default: goto L_0x001b;
        };	 Catch:{ all -> 0x008a }
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x008a }
        return;
    L_0x001d:
        r3 = r1;
        goto L_0x0006;
    L_0x001f:
        r2 = r1;
        goto L_0x0009;
    L_0x0021:
        r0 = r1;
        goto L_0x000b;
    L_0x0023:
        r0 = r5.f2494t;	 Catch:{ all -> 0x008a }
        if (r0 == 0) goto L_0x004d;
    L_0x0027:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008a }
        r2 = "Calling connect() while still connected, missing disconnect() for ";
        r0.<init>(r2);	 Catch:{ all -> 0x008a }
        r2 = r5.m2887a();	 Catch:{ all -> 0x008a }
        r0 = r0.append(r2);	 Catch:{ all -> 0x008a }
        r0.toString();	 Catch:{ all -> 0x008a }
        r0 = r5.f2486l;	 Catch:{ all -> 0x008a }
        r2 = r5.m2887a();	 Catch:{ all -> 0x008a }
        r3 = r5.f2494t;	 Catch:{ all -> 0x008a }
        r4 = r5.f2478c;	 Catch:{ all -> 0x008a }
        r4 = r4.f4845f;	 Catch:{ all -> 0x008a }
        r0.m5622a(r2, r3);	 Catch:{ all -> 0x008a }
        r0 = r5.f2480e;	 Catch:{ all -> 0x008a }
        r0.incrementAndGet();	 Catch:{ all -> 0x008a }
    L_0x004d:
        r0 = new com.google.android.gms.common.internal.s;	 Catch:{ all -> 0x008a }
        r2 = r5.f2480e;	 Catch:{ all -> 0x008a }
        r2 = r2.get();	 Catch:{ all -> 0x008a }
        r0.<init>(r5, r2);	 Catch:{ all -> 0x008a }
        r5.f2494t = r0;	 Catch:{ all -> 0x008a }
        r0 = r5.f2486l;	 Catch:{ all -> 0x008a }
        r2 = r5.m2887a();	 Catch:{ all -> 0x008a }
        r3 = r5.f2494t;	 Catch:{ all -> 0x008a }
        r4 = r5.f2478c;	 Catch:{ all -> 0x008a }
        r4 = r4.f4845f;	 Catch:{ all -> 0x008a }
        r0 = r0.m5623a(r2, r3, r4);	 Catch:{ all -> 0x008a }
        if (r0 != 0) goto L_0x001b;
    L_0x006c:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008a }
        r2 = "unable to connect to service: ";
        r0.<init>(r2);	 Catch:{ all -> 0x008a }
        r2 = r5.m2887a();	 Catch:{ all -> 0x008a }
        r0 = r0.append(r2);	 Catch:{ all -> 0x008a }
        r0.toString();	 Catch:{ all -> 0x008a }
        r0 = 8;
        r2 = r5.f2480e;	 Catch:{ all -> 0x008a }
        r2 = r2.get();	 Catch:{ all -> 0x008a }
        r5.m2889a(r0, r2);	 Catch:{ all -> 0x008a }
        goto L_0x001b;
    L_0x008a:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
    L_0x008d:
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x008a }
        r5.f2482h = r2;	 Catch:{ all -> 0x008a }
        goto L_0x001b;
    L_0x0094:
        r0 = r5.f2494t;	 Catch:{ all -> 0x008a }
        if (r0 == 0) goto L_0x001b;
    L_0x0098:
        r0 = r5.f2486l;	 Catch:{ all -> 0x008a }
        r2 = r5.m2887a();	 Catch:{ all -> 0x008a }
        r3 = r5.f2494t;	 Catch:{ all -> 0x008a }
        r4 = r5.f2478c;	 Catch:{ all -> 0x008a }
        r4 = r4.f4845f;	 Catch:{ all -> 0x008a }
        r0.m5622a(r2, r3);	 Catch:{ all -> 0x008a }
        r0 = 0;
        r5.f2494t = r0;	 Catch:{ all -> 0x008a }
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.n.a(int, android.os.IInterface):void");
    }

    private boolean m2878a(int i, int i2, IInterface iInterface) {
        boolean z;
        synchronized (this.f2488n) {
            if (this.f2495u != i) {
                z = false;
            } else {
                m2876a(i2, iInterface);
                z = true;
            }
        }
        return z;
    }

    public static Bundle m2885m() {
        return null;
    }

    protected abstract IInterface m2886a(IBinder iBinder);

    protected abstract String m2887a();

    @CallSuper
    protected final void m2888a(int i) {
        this.f2476a = i;
        this.f2481g = System.currentTimeMillis();
    }

    protected final void m2889a(int i, int i2) {
        this.f2479d.sendMessage(this.f2479d.obtainMessage(5, i2, -1, new C0741v(this, i)));
    }

    @BinderThread
    protected final void m2890a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f2479d.sendMessage(this.f2479d.obtainMessage(1, i2, -1, new C0740u(this, i, iBinder, bundle)));
    }

    @CallSuper
    protected final void m2891a(ConnectionResult connectionResult) {
        this.f2483i = connectionResult.m5058c();
        this.f2484j = System.currentTimeMillis();
    }

    public final void m2892a(C0676n c0676n) {
        this.f2491q = (C0676n) ax.m5528a((Object) c0676n, (Object) "Connection progress callbacks cannot be null.");
        m2876a(2, null);
    }

    @WorkerThread
    public final void m2893a(ae aeVar, Set set) {
        try {
            GetServiceRequest a = new GetServiceRequest(this.f2500z).m5391a(this.f2477b.getPackageName()).m5389a(b_());
            if (set != null) {
                a.m5392a((Collection) set);
            }
            if (m2900i()) {
                a.m5388a(this.f2497w != null ? this.f2497w : new Account("<<default account>>", "com.google")).m5390a(aeVar);
            }
            synchronized (this.f2489o) {
                if (this.f2490p != null) {
                    this.f2490p.m5436a(new C0734r(this, this.f2480e.get()), a);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "service died");
            this.f2479d.sendMessage(this.f2479d.obtainMessage(4, this.f2480e.get(), 1));
        } catch (Throwable e2) {
            Log.w("GmsClient", "Remote exception occurred", e2);
        }
    }

    public final void m2894a(String str, PrintWriter printWriter) {
        synchronized (this.f2488n) {
            int i = this.f2495u;
            IInterface iInterface = this.f2492r;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                printWriter.print("DISCONNECTED");
                break;
            case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                printWriter.print("CONNECTING");
                break;
            case C0772e.WalletFragmentStyle_buyButtonAppearance /*3*/:
                printWriter.print("CONNECTED");
                break;
            case C0772e.WalletFragmentStyle_maskedWalletDetailsTextAppearance /*4*/:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.println("null");
        } else {
            printWriter.append(m2895b()).append("@").println(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f2482h > 0) {
            printWriter.append(str).append("lastConnectedTime=").println(this.f2482h + " " + simpleDateFormat.format(new Date(this.f2482h)));
        }
        if (this.f2481g > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.f2476a) {
                case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.f2476a));
                    break;
            }
            printWriter.append(" lastSuspendedTime=").println(this.f2481g + " " + simpleDateFormat.format(new Date(this.f2481g)));
        }
        if (this.f2484j > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C0659h.m5081a(this.f2483i));
            printWriter.append(" lastFailedTime=").println(this.f2484j + " " + simpleDateFormat.format(new Date(this.f2484j)));
        }
    }

    protected abstract String m2895b();

    protected Bundle b_() {
        return new Bundle();
    }

    public boolean m2896d() {
        return false;
    }

    public Intent m2897e() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public final void m2898g() {
        this.f2480e.incrementAndGet();
        synchronized (this.f2493s) {
            int size = this.f2493s.size();
            for (int i = 0; i < size; i++) {
                ((C0731q) this.f2493s.get(i)).m5556d();
            }
            this.f2493s.clear();
        }
        synchronized (this.f2489o) {
            this.f2490p = null;
        }
        m2876a(1, null);
    }

    public final boolean m2899h() {
        boolean z;
        synchronized (this.f2488n) {
            z = this.f2495u == 3;
        }
        return z;
    }

    public boolean m2900i() {
        return false;
    }

    void i_() {
    }

    public final IBinder m2901j() {
        IBinder iBinder;
        synchronized (this.f2489o) {
            if (this.f2490p == null) {
                iBinder = null;
            } else {
                iBinder = this.f2490p.asBinder();
            }
        }
        return iBinder;
    }

    public final void j_() {
        int a = this.f2487m.m5321a(this.f2477b);
        if (a != 0) {
            m2876a(1, null);
            this.f2491q = new C0739t(this);
            this.f2479d.sendMessage(this.f2479d.obtainMessage(3, this.f2480e.get(), a));
            return;
        }
        m2892a(new C0739t(this));
    }

    public final boolean m2902l() {
        boolean z;
        synchronized (this.f2488n) {
            z = this.f2495u == 2;
        }
        return z;
    }

    public final IInterface m2903n() {
        IInterface iInterface;
        synchronized (this.f2488n) {
            if (this.f2495u == 4) {
                throw new DeadObjectException();
            } else if (m2899h()) {
                ax.m5532a(this.f2492r != null, (Object) "Client is connected but service is null");
                iInterface = this.f2492r;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return iInterface;
    }
}
