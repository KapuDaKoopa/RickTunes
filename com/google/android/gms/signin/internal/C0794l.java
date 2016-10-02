package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.ac;
import com.google.android.gms.common.api.C0464l;
import com.google.android.gms.common.api.C0465m;
import com.google.android.gms.common.internal.C0469n;
import com.google.android.gms.common.internal.C0727j;
import com.google.android.gms.common.internal.C0739t;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ae;
import com.google.android.gms.common.internal.ax;
import com.google.android.gms.p006b.ye;
import com.google.android.gms.p006b.yf;

/* renamed from: com.google.android.gms.signin.internal.l */
public final class C0794l extends C0469n implements ye {
    private final boolean f5037a;
    private final C0727j f5038g;
    private final Bundle f5039h;
    private Integer f5040i;

    public C0794l(Context context, Looper looper, C0727j c0727j, C0464l c0464l, C0465m c0465m) {
        yf yfVar = c0727j.f4846g;
        Integer num = c0727j.f4847h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c0727j.f4840a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (yfVar != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", yfVar.m4909a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", yfVar.m4910b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", yfVar.m4911c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", yfVar.m4912d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", yfVar.m4913e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", yfVar.m4914f());
        }
        this(context, looper, true, c0727j, bundle, c0464l, c0465m);
    }

    public C0794l(Context context, Looper looper, boolean z, C0727j c0727j, Bundle bundle, C0464l c0464l, C0465m c0465m) {
        super(context, looper, 44, c0727j, c0464l, c0465m);
        this.f5037a = z;
        this.f5038g = c0727j;
        this.f5039h = bundle;
        this.f5040i = c0727j.f4847h;
    }

    protected final /* synthetic */ IInterface m5787a(IBinder iBinder) {
        return C0790h.m5775a(iBinder);
    }

    protected final String m5788a() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void m5789a(ae aeVar, boolean z) {
        try {
            ((C0789g) m2903n()).m5769a(aeVar, this.f5040i.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void m5790a(C0682d c0682d) {
        ax.m5528a((Object) c0682d, (Object) "Expecting a valid ISignInCallbacks");
        try {
            C0727j c0727j = this.f5038g;
            Account account = c0727j.f4840a != null ? c0727j.f4840a : new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = ac.m3300a(this.f2477b).m3309a();
            }
            ((C0789g) m2903n()).m5772a(new SignInRequest(new ResolveAccountRequest(account, this.f5040i.intValue(), googleSignInAccount)), c0682d);
        } catch (Throwable e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                c0682d.m5251a(new SignInResponse());
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    protected final String m5791b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected final Bundle b_() {
        if (!this.f2477b.getPackageName().equals(this.f5038g.f4844e)) {
            this.f5039h.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f5038g.f4844e);
        }
        return this.f5039h;
    }

    public final void m5792f() {
        try {
            ((C0789g) m2903n()).m5765a(this.f5040i.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final boolean m5793i() {
        return this.f5037a;
    }

    public final void m5794k() {
        m2892a(new C0739t(this));
    }
}
