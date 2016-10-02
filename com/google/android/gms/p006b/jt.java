package com.google.android.gms.p006b;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p017a.C0317d;

/* renamed from: com.google.android.gms.b.jt */
final class jt implements Runnable {
    final /* synthetic */ jr f3499a;
    final /* synthetic */ js f3500b;

    jt(js jsVar, jr jrVar) {
        this.f3500b = jsVar;
        this.f3499a = jrVar;
    }

    public final void run() {
        synchronized (this.f3500b.f3487f) {
            if (this.f3500b.f3494m != -2) {
                return;
            }
            this.f3500b.f3493l = this.f3500b.m3938b();
            if (this.f3500b.f3493l == null) {
                this.f3500b.m3936a(4);
            } else if (!this.f3500b.m3940c() || this.f3500b.m3939b(1)) {
                this.f3499a.m3921a(this.f3500b);
                js jsVar = this.f3500b;
                kk kkVar = this.f3499a;
                if ("com.google.ads.mediation.AdUrlAdapter".equals(jsVar.f3482a)) {
                    Bundle bundle = jsVar.f3484c.f1896m.getBundle(jsVar.f3482a);
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putString("sdk_less_network_id", jsVar.f3483b.f3452b);
                    jsVar.f3484c.f1896m.putBundle(jsVar.f3482a, bundle);
                }
                String a = jsVar.m3934a(jsVar.f3483b.f3458h);
                try {
                    if (jsVar.f3488g.f2541d < 4100000) {
                        if (jsVar.f3485d.f1906e) {
                            jsVar.f3493l.m3966a(C0317d.m1996a(jsVar.f3486e), jsVar.f3484c, a, kkVar);
                        } else {
                            jsVar.f3493l.m3969a(C0317d.m1996a(jsVar.f3486e), jsVar.f3485d, jsVar.f3484c, a, kkVar);
                        }
                    }
                    if (jsVar.f3489h) {
                        jsVar.f3493l.m3968a(C0317d.m1996a(jsVar.f3486e), jsVar.f3484c, a, jsVar.f3483b.f3451a, kkVar, jsVar.f3490i, jsVar.f3491j);
                    } else if (jsVar.f3485d.f1906e) {
                        jsVar.f3493l.m3967a(C0317d.m1996a(jsVar.f3486e), jsVar.f3484c, a, jsVar.f3483b.f3451a, kkVar);
                    } else if (!jsVar.f3492k) {
                        jsVar.f3493l.m3970a(C0317d.m1996a(jsVar.f3486e), jsVar.f3485d, jsVar.f3484c, a, jsVar.f3483b.f3451a, kkVar);
                    } else if (jsVar.f3483b.f3461k != null) {
                        jsVar.f3493l.m3968a(C0317d.m1996a(jsVar.f3486e), jsVar.f3484c, a, jsVar.f3483b.f3451a, kkVar, new NativeAdOptionsParcel(js.m3929b(jsVar.f3483b.f3465o)), jsVar.f3483b.f3464n);
                    } else {
                        jsVar.f3493l.m3970a(C0317d.m1996a(jsVar.f3486e), jsVar.f3485d, jsVar.f3484c, a, jsVar.f3483b.f3451a, kkVar);
                    }
                } catch (Throwable e) {
                    C0501b.m3026a("Could not request ad from mediation adapter.", e);
                    jsVar.m3936a(5);
                }
            } else {
                C0501b.m3025a("Ignoring adapter " + this.f3500b.f3482a + " as delayed impression is not supported");
                this.f3500b.m3936a(2);
            }
        }
    }
}
