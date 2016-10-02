package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.api.C0531b;
import com.google.android.gms.common.api.C0654a;
import com.google.android.gms.common.api.C0655d;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.vk;
import com.google.android.gms.p006b.xf;
import com.google.android.gms.p006b.xg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.clearcut.b */
public final class C0646b {
    public static final C0655d f4470a;
    public static final C0531b f4471b;
    public static final C0654a f4472c;
    public static final C0637g f4473d;
    private final Context f4474e;
    private final String f4475f;
    private final int f4476g;
    private String f4477h;
    private int f4478i;
    private String f4479j;
    private String f4480k;
    private final boolean f4481l;
    private int f4482m;
    private final C0637g f4483n;
    private final xf f4484o;
    private final C0645a f4485p;
    private C0650f f4486q;

    static {
        f4470a = new C0655d();
        f4471b = new C0647c();
        f4472c = new C0654a("ClearcutLogger.API", f4471b, f4470a);
        f4473d = new vk();
    }

    @Deprecated
    public C0646b(Context context, String str) {
        this(context, str, f4473d, xg.m4890d(), C0645a.f4468a);
    }

    private C0646b(Context context, String str, C0637g c0637g, xf xfVar, C0645a c0645a) {
        this.f4478i = -1;
        this.f4482m = 0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f4474e = applicationContext;
        this.f4475f = context.getPackageName();
        this.f4476g = C0646b.m5033a(context);
        this.f4478i = -1;
        this.f4477h = str;
        this.f4479j = null;
        this.f4480k = null;
        this.f4481l = false;
        this.f4483n = c0637g;
        this.f4484o = xfVar;
        this.f4486q = new C0650f();
        this.f4485p = c0645a;
        this.f4482m = 0;
        if (this.f4481l) {
            ax.m5536b(this.f4479j == null, "can't be anonymous with an upload account");
        }
    }

    private static int m5033a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return i;
        }
    }

    public static /* synthetic */ int[] m5035a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i] = ((Integer) it.next()).intValue();
            i = i2;
        }
        return iArr;
    }

    public final C0648d m5048a(byte[] bArr) {
        return new C0648d(bArr, '\u0000');
    }

    public final boolean m5049a(TimeUnit timeUnit) {
        return this.f4483n.m4813a(timeUnit);
    }
}
