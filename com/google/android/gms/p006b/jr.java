package com.google.android.gms.p006b;

@op
/* renamed from: com.google.android.gms.b.jr */
public final class jr extends kl {
    private final Object f3479a;
    private jw f3480b;
    private jq f3481c;

    public jr() {
        this.f3479a = new Object();
    }

    public final void m3918a() {
        synchronized (this.f3479a) {
            if (this.f3481c != null) {
                this.f3481c.m2186r();
            }
        }
    }

    public final void m3919a(int i) {
        synchronized (this.f3479a) {
            if (this.f3480b != null) {
                this.f3480b.m3927a(i == 3 ? 1 : 2);
                this.f3480b = null;
            }
        }
    }

    public final void m3920a(jq jqVar) {
        synchronized (this.f3479a) {
            this.f3481c = jqVar;
        }
    }

    public final void m3921a(jw jwVar) {
        synchronized (this.f3479a) {
            this.f3480b = jwVar;
        }
    }

    public final void m3922a(ko koVar) {
        synchronized (this.f3479a) {
            if (this.f3480b != null) {
                this.f3480b.m3928a(koVar);
                this.f3480b = null;
                return;
            }
            if (this.f3481c != null) {
                this.f3481c.m2190v();
            }
        }
    }

    public final void m3923b() {
        synchronized (this.f3479a) {
            if (this.f3481c != null) {
                this.f3481c.m2187s();
            }
        }
    }

    public final void m3924c() {
        synchronized (this.f3479a) {
            if (this.f3481c != null) {
                this.f3481c.m2188t();
            }
        }
    }

    public final void m3925d() {
        synchronized (this.f3479a) {
            if (this.f3481c != null) {
                this.f3481c.m2189u();
            }
        }
    }

    public final void m3926e() {
        synchronized (this.f3479a) {
            if (this.f3480b != null) {
                this.f3480b.m3927a(0);
                this.f3480b = null;
                return;
            }
            if (this.f3481c != null) {
                this.f3481c.m2190v();
            }
        }
    }
}
