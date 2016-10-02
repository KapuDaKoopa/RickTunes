package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.qi;
import com.google.android.gms.p006b.rd;

@op
/* renamed from: com.google.android.gms.ads.internal.overlay.p */
final class C0426p extends qi {
    final /* synthetic */ C0421k f2248a;

    private C0426p(C0421k c0421k) {
        this.f2248a = c0421k;
    }

    public final void m2710a() {
        ar.m2240e();
        Bitmap b = rd.m4433b(this.f2248a.f2235o, this.f2248a.f2222b.f2174q.f1771d);
        if (b != null) {
            rd.f4041a.post(new C0427q(this, ar.m2242g().m4462a(this.f2248a.f2235o, b, this.f2248a.f2222b.f2174q.f1772e, this.f2248a.f2222b.f2174q.f1773f)));
        }
    }

    public final void m2711b() {
    }
}
