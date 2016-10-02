package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.internal.ax;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public final class ac {
    private static final Lock f2814a;
    private static ac f2815b;
    private final Lock f2816c;
    private final SharedPreferences f2817d;

    static {
        f2814a = new ReentrantLock();
    }

    private ac(Context context) {
        this.f2816c = new ReentrantLock();
        this.f2817d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    private SignInAccount m3299a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String d = m3306d(m3303b("signInAccount", str));
        if (TextUtils.isEmpty(d)) {
            return null;
        }
        try {
            SignInAccount a = SignInAccount.m3251a(d);
            if (a.m3259f() != null) {
                GoogleSignInAccount b = m3302b(a.m3259f().m3231h());
                if (b != null) {
                    a.m3253a(b);
                }
            }
            return a;
        } catch (JSONException e) {
            return null;
        }
    }

    public static ac m3300a(Context context) {
        ax.m5527a((Object) context);
        f2814a.lock();
        try {
            if (f2815b == null) {
                f2815b = new ac(context.getApplicationContext());
            }
            ac acVar = f2815b;
            return acVar;
        } finally {
            f2814a.unlock();
        }
    }

    private void m3301a(String str, String str2) {
        this.f2816c.lock();
        try {
            this.f2817d.edit().putString(str, str2).apply();
        } finally {
            this.f2816c.unlock();
        }
    }

    private GoogleSignInAccount m3302b(String str) {
        GoogleSignInAccount googleSignInAccount = null;
        if (!TextUtils.isEmpty(str)) {
            String d = m3306d(m3303b("googleSignInAccount", str));
            if (d != null) {
                try {
                    googleSignInAccount = GoogleSignInAccount.m3222a(d);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInAccount;
    }

    private static String m3303b(String str, String str2) {
        return str + ":" + str2;
    }

    private void m3304b(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        ax.m5527a((Object) googleSignInAccount);
        ax.m5527a((Object) googleSignInOptions);
        String h = googleSignInAccount.m3231h();
        m3301a(m3303b("googleSignInAccount", h), googleSignInAccount.m3233j());
        m3301a(m3303b("googleSignInOptions", h), googleSignInOptions.m3250h());
    }

    private GoogleSignInOptions m3305c(String str) {
        GoogleSignInOptions googleSignInOptions = null;
        if (!TextUtils.isEmpty(str)) {
            String d = m3306d(m3303b("googleSignInOptions", str));
            if (d != null) {
                try {
                    googleSignInOptions = GoogleSignInOptions.m3234a(d);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInOptions;
    }

    private String m3306d(String str) {
        this.f2816c.lock();
        try {
            String string = this.f2817d.getString(str, null);
            return string;
        } finally {
            this.f2816c.unlock();
        }
    }

    private void m3307e(String str) {
        if (!TextUtils.isEmpty(str)) {
            m3308f(m3303b("googleSignInAccount", str));
            m3308f(m3303b("googleSignInOptions", str));
        }
    }

    private void m3308f(String str) {
        this.f2816c.lock();
        try {
            this.f2817d.edit().remove(str).apply();
        } finally {
            this.f2816c.unlock();
        }
    }

    public final GoogleSignInAccount m3309a() {
        return m3302b(m3306d("defaultGoogleSignInAccount"));
    }

    public final void m3310a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        ax.m5527a((Object) googleSignInAccount);
        ax.m5527a((Object) googleSignInOptions);
        m3301a("defaultGoogleSignInAccount", googleSignInAccount.m3231h());
        m3304b(googleSignInAccount, googleSignInOptions);
    }

    public final void m3311a(SignInAccount signInAccount, SignInConfiguration signInConfiguration) {
        ax.m5527a((Object) signInAccount);
        ax.m5527a((Object) signInConfiguration);
        m3313c();
        m3301a("defaultSignInAccount", signInAccount.m3260g());
        if (signInAccount.m3259f() != null) {
            m3301a("defaultGoogleSignInAccount", signInAccount.m3259f().m3231h());
        }
        ax.m5527a((Object) signInAccount);
        ax.m5527a((Object) signInConfiguration);
        String g = signInAccount.m3260g();
        SignInAccount a = m3299a(g);
        if (!(a == null || a.m3259f() == null)) {
            m3307e(a.m3259f().m3231h());
        }
        m3301a(m3303b("signInConfiguration", g), signInConfiguration.m3282f());
        m3301a(m3303b("signInAccount", g), signInAccount.m3262i());
        if (signInAccount.m3259f() != null) {
            m3304b(signInAccount.m3259f(), signInConfiguration.m3280d());
        }
    }

    public final GoogleSignInOptions m3312b() {
        return m3305c(m3306d("defaultGoogleSignInAccount"));
    }

    public final void m3313c() {
        String d = m3306d("defaultSignInAccount");
        m3308f("defaultSignInAccount");
        m3314d();
        if (!TextUtils.isEmpty(d)) {
            SignInAccount a = m3299a(d);
            m3308f(m3303b("signInAccount", d));
            m3308f(m3303b("signInConfiguration", d));
            if (a != null && a.m3259f() != null) {
                m3307e(a.m3259f().m3231h());
            }
        }
    }

    public final void m3314d() {
        String d = m3306d("defaultGoogleSignInAccount");
        m3308f("defaultGoogleSignInAccount");
        m3307e(d);
    }
}
