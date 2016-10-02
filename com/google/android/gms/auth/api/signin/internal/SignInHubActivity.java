package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.C0574h;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.vf;
import com.google.android.gms.p006b.vg;
import com.google.android.gms.p006b.vi;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@KeepName
public class SignInHubActivity extends FragmentActivity {
    private ac f2802a;
    private C0600u f2803b;
    private SignInConfiguration f2804c;
    private boolean f2805d;
    private String f2806e;
    private String f2807f;
    private boolean f2808g;
    private int f2809h;
    private Intent f2810i;

    private vg m3283a(String str) {
        return new C0576a(this, str);
    }

    private void m3284a() {
        getSupportLoaderManager().initLoader(0, null, new C0577b());
    }

    private void m3285a(int i) {
        Intent intent = new Intent();
        intent.putExtra("errorCode", i);
        setResult(0, intent);
        finish();
    }

    private void m3286a(int i, int i2, Intent intent) {
        for (vf a : this.f2803b.f2845a.values()) {
            if (a.m4799a(i, i2, intent, m3283a(this.f2807f))) {
                break;
            }
        }
        if (i2 == 0) {
            finish();
        }
    }

    private void m3287a(Intent intent) {
        intent.setPackage("com.google.android.gms");
        intent.putExtra("config", this.f2804c);
        try {
            startActivityForResult(intent, this.f2805d ? 40962 : 40961);
        } catch (ActivityNotFoundException e) {
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            if (this.f2805d) {
                m3291b(8);
            } else {
                m3285a(2);
            }
        }
    }

    private void m3291b(int i) {
        Parcelable status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        setResult(0);
        SignInAccount signInAccount;
        switch (i) {
            case 40961:
                Object stringExtra;
                if (i2 == -1) {
                    signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null) {
                        this.f2802a.m3311a(signInAccount, this.f2804c);
                        stringExtra = intent.getStringExtra("accessToken");
                        if (!(TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(this.f2807f))) {
                            C0602w.m3404a(signInAccount.m3260g()).m3405a(new HashSet(Arrays.asList(TextUtils.split(this.f2807f, " "))), new C0603x(stringExtra, intent.getLongExtra("accessTokenExpiresAtSecs", 0)));
                            intent.removeExtra("accessTokenExpiresAtSecs");
                        }
                        setResult(-1, intent);
                        finish();
                        return;
                    }
                    Log.w("AuthSignInClient", "[SignInHubActivity] SignInAccount is null.");
                    m3285a(2);
                } else if (intent == null) {
                    finish();
                } else {
                    stringExtra = intent.getStringExtra("email");
                    Object a = C0574h.m3270a(intent.getStringExtra("idProvider"));
                    if (a == null) {
                        setResult(i2, intent);
                        finish();
                        return;
                    }
                    this.f2806e = intent.getStringExtra("pendingToken");
                    C0600u c0600u = this.f2803b;
                    ax.m5527a(a);
                    vf vfVar = (vf) c0600u.f2845a.get(a);
                    if (vfVar == null) {
                        Log.w("AuthSignInClient", a.m3271a((Context) this) + " is not supported. Please check your configuration");
                        m3285a(1);
                        return;
                    }
                    int intExtra = intent.getIntExtra("idpAction", -1);
                    if (intExtra == 0) {
                        if (TextUtils.isEmpty(stringExtra)) {
                            vfVar.m4796a(m3283a(this.f2807f));
                        } else {
                            vfVar.m4797a(stringExtra, m3283a(this.f2807f));
                        }
                    } else if (intExtra != 1 || TextUtils.isEmpty(this.f2806e) || TextUtils.isEmpty(stringExtra)) {
                        Log.w("AuthSignInClient", "Internal error!");
                        m3285a(2);
                    } else {
                        vfVar.m4798a(stringExtra, this.f2806e, m3283a(this.f2807f));
                    }
                }
            case 40962:
                if (intent != null) {
                    signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.m3259f() != null) {
                        GoogleSignInAccount f = signInAccount.m3259f();
                        this.f2802a.m3310a(f, this.f2804c.m3280d());
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", f);
                        this.f2808g = true;
                        this.f2809h = i2;
                        this.f2810i = intent;
                        m3284a();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        m3291b(intent.getIntExtra("errorCode", 8));
                        return;
                    }
                }
                m3291b(8);
            case 45057:
                if (i2 == 0) {
                    setResult(0, intent);
                    finish();
                    return;
                }
                Intent intent2 = new Intent("com.google.android.gms.auth.VERIFY_ASSERTION");
                intent2.putExtra("idpTokenType", IdpTokenType.f2792a);
                intent2.putExtra("idpToken", intent.getStringExtra("idpToken"));
                intent2.putExtra("pendingToken", this.f2806e);
                intent2.putExtra("idProvider", C0574h.FACEBOOK.m3272a());
                m3287a(intent2);
            default:
                m3286a(i, i2, intent);
        }
    }

    protected void onCreate(Bundle bundle) {
        vi viVar = null;
        super.onCreate(bundle);
        this.f2802a = ac.m3300a((Context) this);
        Intent intent = getIntent();
        this.f2804c = (SignInConfiguration) intent.getParcelableExtra("config");
        this.f2805d = "com.google.android.gms.auth.GOOGLE_SIGN_IN".equals(intent.getAction());
        this.f2807f = intent.getStringExtra("scopes");
        if (this.f2804c == null) {
            setResult(0);
            finish();
            return;
        }
        List linkedList = new LinkedList();
        Map hashMap = new HashMap();
        C0598s.m3401a(this.f2804c, linkedList, hashMap);
        this.f2803b = new C0600u(this, linkedList, hashMap);
        if (bundle == null) {
            Intent intent2;
            SignInAccount signInAccount;
            if (this.f2805d) {
                intent2 = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
                signInAccount = viVar;
            } else {
                intent2 = new Intent("com.google.android.gms.auth.LOGIN_PICKER");
                if ("com.google.android.gms.auth.RESOLVE_CREDENTIAL".equals(intent.getAction())) {
                    intent2.fillIn(intent, 3);
                    signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                } else {
                    this.f2802a.m3313c();
                    Object obj = viVar;
                }
            }
            if (signInAccount == null || signInAccount.m3258e() != C0574h.FACEBOOK) {
                m3287a(intent2);
                return;
            } else {
                viVar.m4808a(m3283a(this.f2807f));
                return;
            }
        }
        this.f2806e = bundle.getString("pendingToken");
        this.f2808g = bundle.getBoolean("signingInGoogleApiClients");
        if (this.f2808g) {
            this.f2809h = bundle.getInt("signInResultCode");
            this.f2810i = (Intent) bundle.getParcelable("signInResultData");
            int i = this.f2809h;
            Intent intent3 = this.f2810i;
            m3284a();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("pendingToken", this.f2806e);
        bundle.putBoolean("signingInGoogleApiClients", this.f2808g);
        if (this.f2808g) {
            bundle.putInt("signInResultCode", this.f2809h);
            bundle.putParcelable("signInResultData", this.f2810i);
        }
    }
}
