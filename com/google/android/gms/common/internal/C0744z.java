package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.google.android.gms.C0772e;
import com.google.android.gms.common.stats.C0765b;
import java.util.HashMap;

/* renamed from: com.google.android.gms.common.internal.z */
final class C0744z extends C0743y implements Callback {
    private final HashMap f4882a;
    private final Context f4883b;
    private final Handler f4884c;
    private final C0765b f4885d;
    private final long f4886e;

    C0744z(Context context) {
        this.f4882a = new HashMap();
        this.f4883b = context.getApplicationContext();
        this.f4884c = new Handler(context.getMainLooper(), this);
        this.f4885d = C0765b.m5734a();
        this.f4886e = 5000;
    }

    private boolean m5625a(aa aaVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        ax.m5528a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f4882a) {
            ab abVar = (ab) this.f4882a.get(aaVar);
            if (abVar != null) {
                this.f4884c.removeMessages(0, abVar);
                if (!abVar.m5411a(serviceConnection)) {
                    abVar.m5408a(serviceConnection, str);
                    switch (abVar.f4817c) {
                        case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                            serviceConnection.onServiceConnected(abVar.f4821g, abVar.f4819e);
                            break;
                        case C0772e.WalletFragmentStyle_buyButtonText /*2*/:
                            abVar.m5409a(str);
                            break;
                        default:
                            break;
                    }
                }
                throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + aaVar);
            }
            abVar = new ab(this, aaVar);
            abVar.m5408a(serviceConnection, str);
            abVar.m5409a(str);
            this.f4882a.put(aaVar, abVar);
            z = abVar.f4818d;
        }
        return z;
    }

    public final void m5628a(String str, ServiceConnection serviceConnection) {
        aa aaVar = new aa(str);
        ax.m5528a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f4882a) {
            ab abVar = (ab) this.f4882a.get(aaVar);
            if (abVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + aaVar);
            } else if (abVar.m5411a(serviceConnection)) {
                abVar.f4822h.f4885d.m5742b(abVar.f4822h.f4883b, serviceConnection);
                abVar.f4816b.remove(serviceConnection);
                if (abVar.m5410a()) {
                    this.f4884c.sendMessageDelayed(this.f4884c.obtainMessage(0, abVar), this.f4886e);
                }
            } else {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + aaVar);
            }
        }
    }

    public final boolean m5629a(String str, ServiceConnection serviceConnection, String str2) {
        return m5625a(new aa(str), serviceConnection, str2);
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                ab abVar = (ab) message.obj;
                synchronized (this.f4882a) {
                    if (abVar.m5410a()) {
                        if (abVar.f4818d) {
                            abVar.f4822h.f4885d.m5738a(abVar.f4822h.f4883b, abVar.f4815a);
                            abVar.f4818d = false;
                            abVar.f4817c = 2;
                        }
                        this.f4882a.remove(abVar.f4820f);
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
