package com.google.android.gms.ads.internal.formats;

import android.support.v4.p001b.C0028m;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.dj;
import com.google.android.gms.p006b.ec;
import com.google.android.gms.p006b.op;
import java.util.Arrays;
import java.util.List;

@op
/* renamed from: com.google.android.gms.ads.internal.formats.f */
public final class C0385f extends ec implements C0382i {
    private final C0379a f2089a;
    private final String f2090b;
    private final C0028m f2091c;
    private final C0028m f2092d;
    private final Object f2093e;
    private C0386h f2094f;

    public C0385f(String str, C0028m c0028m, C0028m c0028m2, C0379a c0379a) {
        this.f2093e = new Object();
        this.f2090b = str;
        this.f2091c = c0028m;
        this.f2092d = c0028m2;
        this.f2089a = c0379a;
    }

    public final String m2552a(String str) {
        return (String) this.f2092d.get(str);
    }

    public final List m2553a() {
        int i = 0;
        String[] strArr = new String[(this.f2091c.size() + this.f2092d.size())];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f2091c.size(); i3++) {
            strArr[i2] = (String) this.f2091c.m8b(i3);
            i2++;
        }
        while (i < this.f2092d.size()) {
            strArr[i2] = (String) this.f2092d.m8b(i);
            i++;
            i2++;
        }
        return Arrays.asList(strArr);
    }

    public final void m2554a(C0386h c0386h) {
        synchronized (this.f2093e) {
            this.f2094f = c0386h;
        }
    }

    public final dj m2555b(String str) {
        return (dj) this.f2091c.get(str);
    }

    public final void m2556b() {
        synchronized (this.f2093e) {
            if (this.f2094f == null) {
                C0501b.m3027a(6);
                return;
            }
            this.f2094f.m2561a();
        }
    }

    public final void m2557c(String str) {
        synchronized (this.f2093e) {
            if (this.f2094f == null) {
                C0501b.m3027a(6);
                return;
            }
            this.f2094f.m2564a(str, null, null, null);
        }
    }

    public final String m2558j() {
        return "3";
    }

    public final String m2559k() {
        return this.f2090b;
    }

    public final C0379a m2560l() {
        return this.f2089a;
    }
}
