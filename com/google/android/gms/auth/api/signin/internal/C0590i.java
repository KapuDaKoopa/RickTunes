package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.C0570d;
import com.google.android.gms.auth.api.signin.C0607k;
import com.google.android.gms.auth.api.signin.C0608l;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0469n;
import com.google.android.gms.common.internal.C0727j;
import com.google.android.gms.common.internal.ax;
import java.util.Arrays;

/* renamed from: com.google.android.gms.auth.api.signin.internal.i */
public final class C0590i extends C0469n {
    private final GoogleSignInOptions f2840a;

    public C0590i(Context context, Looper looper, C0727j c0727j, GoogleSignInOptions googleSignInOptions, C0464l c0464l, C0465m c0465m) {
        super(context, looper, 91, c0727j, c0464l, c0465m);
        if (googleSignInOptions == null) {
            googleSignInOptions = new C0570d().m3266b();
        }
        if (!c0727j.f4842c.isEmpty()) {
            C0570d c0570d = new C0570d(googleSignInOptions);
            for (Scope add : c0727j.f4842c) {
                Scope[] scopeArr = new Scope[0];
                c0570d.f2779a.add(add);
                c0570d.f2779a.addAll(Arrays.asList(scopeArr));
            }
            googleSignInOptions = c0570d.m3266b();
        }
        this.f2840a = googleSignInOptions;
    }

    protected final /* synthetic */ IInterface m3373a(IBinder iBinder) {
        return C0596q.m3394a(iBinder);
    }

    protected final String m3374a() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    protected final String m3375b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final boolean m3376d() {
        return true;
    }

    public final Intent m3377e() {
        C0608l c0608l = new C0608l(this.f2477b.getPackageName());
        Object obj = this.f2840a;
        ax.m5527a(obj);
        c0608l.f2856a.m3276a(obj);
        boolean z = (c0608l.f2856a.m3279c() == null && c0608l.f2856a.m3280d() == null) ? false : true;
        ax.m5532a(z, (Object) "Must support either Facebook, Google or Email sign-in.");
        Parcelable parcelable = new C0607k((byte) 0).f2855a;
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setClass(this.f2477b, SignInHubActivity.class);
        intent.putExtra("config", parcelable);
        return intent;
    }

    public final GoogleSignInOptions h_() {
        return this.f2840a;
    }
}
