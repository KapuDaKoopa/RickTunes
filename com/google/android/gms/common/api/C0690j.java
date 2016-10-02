package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.p001b.C0029a;
import android.view.View;
import com.google.android.gms.common.C0697i;
import com.google.android.gms.common.api.internal.C0666g;
import com.google.android.gms.common.api.internal.C0689z;
import com.google.android.gms.common.api.internal.zzw;
import com.google.android.gms.common.internal.C0722e;
import com.google.android.gms.common.internal.C0727j;
import com.google.android.gms.common.internal.C0728k;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.xz;
import com.google.android.gms.p006b.yf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.gms.common.api.j */
public final class C0690j {
    public final Set f4682a;
    public final Set f4683b;
    public final Map f4684c;
    FragmentActivity f4685d;
    public Looper f4686e;
    public final ArrayList f4687f;
    public final ArrayList f4688g;
    private Account f4689h;
    private int f4690i;
    private View f4691j;
    private String f4692k;
    private String f4693l;
    private final Map f4694m;
    private final Context f4695n;
    private int f4696o;
    private C0465m f4697p;
    private C0697i f4698q;
    private C0531b f4699r;

    public C0690j(Context context) {
        this.f4682a = new HashSet();
        this.f4683b = new HashSet();
        this.f4694m = new C0029a();
        this.f4684c = new C0029a();
        this.f4696o = -1;
        this.f4698q = C0697i.m5318b();
        this.f4699r = xz.f4341c;
        this.f4687f = new ArrayList();
        this.f4688g = new ArrayList();
        this.f4695n = context;
        this.f4686e = context.getMainLooper();
        this.f4692k = context.getPackageName();
        this.f4693l = context.getClass().getName();
    }

    public final C0690j m5309a(C0654a c0654a) {
        ax.m5528a((Object) c0654a, (Object) "Api must not be null");
        this.f4684c.put(c0654a, null);
        Collection a = c0654a.m5073a().m3134a(null);
        this.f4683b.addAll(a);
        this.f4682a.addAll(a);
        return this;
    }

    public final C0727j m5310a() {
        yf yfVar = yf.f4352a;
        if (this.f4684c.containsKey(xz.f4345g)) {
            yfVar = (yf) this.f4684c.get(xz.f4345g);
        }
        return new C0727j(this.f4689h, this.f4682a, this.f4694m, this.f4690i, this.f4691j, this.f4692k, this.f4693l, yfVar);
    }

    final void m5311a(zzw com_google_android_gms_common_api_internal_zzw, C0660i c0660i) {
        com_google_android_gms_common_api_internal_zzw.m5113a(this.f4696o, c0660i, this.f4697p);
    }

    public final C0660i m5312b() {
        ax.m5536b(!this.f4684c.isEmpty(), "must call addApi() to add at least one API");
        C0727j a = m5310a();
        C0654a c0654a = null;
        Map map = a.f4843d;
        C0029a c0029a = new C0029a();
        Map c0029a2 = new C0029a();
        ArrayList arrayList = new ArrayList();
        C0654a c0654a2 = null;
        for (C0654a c0654a3 : this.f4684c.keySet()) {
            C0654a c0654a32;
            C0467c c0722e;
            C0654a c0654a4;
            Object obj = this.f4684c.get(c0654a32);
            int i = 0;
            if (map.get(c0654a32) != null) {
                i = ((C0728k) map.get(c0654a32)).f4851b ? 1 : 2;
            }
            c0029a.put(c0654a32, Integer.valueOf(i));
            C0464l c0666g = new C0666g(c0654a32, i);
            arrayList.add(c0666g);
            if ((c0654a32.f4524b != null ? 1 : null) != null) {
                ax.m5532a(c0654a32.f4523a != null, (Object) "This API was constructed with a ClientBuilder. Use getClientBuilder");
                C0657f c0657f = c0654a32.f4523a;
                C0654a c0654a5 = c0657f.m5079b() == 1 ? c0654a32 : c0654a2;
                c0722e = new C0722e(this.f4695n, this.f4686e, c0657f.m5080c(), c0666g, c0666g, a, c0657f.m5078a());
                c0654a4 = c0654a5;
            } else {
                c0654a4 = c0654a2;
                c0722e = c0654a32.m5073a().m3133a(this.f4695n, this.f4686e, a, obj, c0666g, c0666g);
            }
            c0029a2.put(c0654a32.m5074b(), c0722e);
            if (!c0722e.m2866d()) {
                c0654a32 = c0654a;
            } else if (c0654a != null) {
                throw new IllegalStateException(c0654a32.f4525c + " cannot be used with " + c0654a.f4525c);
            }
            c0654a2 = c0654a4;
            c0654a = c0654a32;
        }
        if (c0654a != null) {
            if (c0654a2 != null) {
                throw new IllegalStateException(c0654a.f4525c + " cannot be used with " + c0654a2.f4525c);
            }
            ax.m5533a(this.f4689h == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", c0654a.f4525c);
            ax.m5533a(this.f4682a.equals(this.f4683b), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", c0654a.f4525c);
        }
        C0660i c0689z = new C0689z(this.f4695n, new ReentrantLock(), this.f4686e, a, this.f4698q, this.f4699r, c0029a, this.f4687f, this.f4688g, c0029a2, this.f4696o, C0689z.m5272a(c0029a2.values(), true), arrayList);
        synchronized (C0660i.f4528a) {
            C0660i.f4528a.add(c0689z);
        }
        if (this.f4696o >= 0) {
            zzw a2 = zzw.m5102a(this.f4685d);
            if (a2 == null) {
                new Handler(this.f4695n.getMainLooper()).post(new C0691k(this, c0689z));
            } else {
                m5311a(a2, c0689z);
            }
        }
        return c0689z;
    }
}
