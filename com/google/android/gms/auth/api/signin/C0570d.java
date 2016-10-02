package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.common.internal.ax;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.auth.api.signin.d */
public final class C0570d {
    public Set f2779a;
    private boolean f2780b;
    private boolean f2781c;
    private boolean f2782d;
    private String f2783e;
    private Account f2784f;
    private String f2785g;

    public C0570d() {
        this.f2779a = new HashSet();
    }

    public C0570d(GoogleSignInOptions googleSignInOptions) {
        this.f2779a = new HashSet();
        ax.m5527a((Object) googleSignInOptions);
        this.f2779a = new HashSet(googleSignInOptions.f2763f);
        this.f2780b = googleSignInOptions.f2766i;
        this.f2781c = googleSignInOptions.f2767j;
        this.f2782d = googleSignInOptions.f2765h;
        this.f2783e = googleSignInOptions.f2768k;
        this.f2784f = googleSignInOptions.f2764g;
        this.f2785g = googleSignInOptions.f2769l;
    }

    public final C0570d m3265a() {
        this.f2779a.add(GoogleSignInOptions.f2759c);
        return this;
    }

    public final GoogleSignInOptions m3266b() {
        if (this.f2782d && (this.f2784f == null || !this.f2779a.isEmpty())) {
            m3265a();
        }
        return new GoogleSignInOptions(this.f2784f, this.f2782d, this.f2780b, this.f2781c, this.f2783e, this.f2785g, (byte) 0);
    }
}
