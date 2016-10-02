package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.ht */
final class ht implements Runnable {
    final /* synthetic */ hr f3345a;
    private final ue f3346b;
    private final wf f3347c;
    private final Runnable f3348d;

    public ht(hr hrVar, ue ueVar, wf wfVar, Runnable runnable) {
        this.f3345a = hrVar;
        this.f3346b = ueVar;
        this.f3347c = wfVar;
        this.f3348d = runnable;
    }

    public final void run() {
        if (this.f3346b.m3560g()) {
            this.f3346b.m3555b("canceled-at-delivery");
            return;
        }
        if ((this.f3347c.f4312c == null ? 1 : null) != null) {
            this.f3346b.m3551a(this.f3347c.f4310a);
        } else {
            this.f3346b.m3554b(this.f3347c.f4312c);
        }
        if (this.f3347c.f4313d) {
            this.f3346b.m3552a("intermediate-response");
        } else {
            this.f3346b.m3555b("done");
        }
        if (this.f3348d != null) {
            this.f3348d.run();
        }
    }
}
