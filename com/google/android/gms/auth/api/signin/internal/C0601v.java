package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.C0530a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C0706q;
import com.google.android.gms.common.api.C0660i;
import com.google.android.gms.common.api.C0690j;
import com.google.android.gms.common.internal.ax;
import java.util.Collection;

/* renamed from: com.google.android.gms.auth.api.signin.internal.v */
public final class C0601v extends C0593l {
    private final Context f2846a;

    public C0601v(Context context) {
        this.f2846a = context;
    }

    public final void m3403a() {
        if (C0706q.m5349a(this.f2846a, Binder.getCallingUid())) {
            ac a = ac.m3300a(this.f2846a);
            GoogleSignInAccount a2 = a.m3309a();
            Object obj = GoogleSignInOptions.f2760d;
            if (a2 != null) {
                obj = a.m3312b();
            }
            C0690j c0690j = new C0690j(this.f2846a);
            Object obj2 = C0530a.f2634j;
            ax.m5528a(obj2, (Object) "Api must not be null");
            ax.m5528a(obj, (Object) "Null options are not permitted for this Api");
            c0690j.f4684c.put(obj2, obj);
            Collection a3 = obj2.m5073a().m3134a(obj);
            c0690j.f4683b.addAll(a3);
            c0690j.f4682a.addAll(a3);
            C0660i b = c0690j.m5312b();
            try {
                if (b.m5097f().m5057b()) {
                    if (a2 != null) {
                        C0530a.f2641q.m3264a(b);
                    } else {
                        b.m5099h();
                    }
                }
                b.m5098g();
            } catch (Throwable th) {
                b.m5098g();
            }
        } else {
            throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
        }
    }
}
