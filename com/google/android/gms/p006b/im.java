package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.im */
final class im implements Runnable {
    final /* synthetic */ jd f3407a;
    final /* synthetic */ il f3408b;

    im(il ilVar, jd jdVar) {
        this.f3408b = ilVar;
        this.f3407a = jdVar;
    }

    public final void run() {
        il ilVar = this.f3408b;
        hy ieVar = new ie(this.f3408b.f3400b, this.f3408b.f3402d, null);
        ieVar.m3848a(new in(this, ieVar));
        ieVar.m3841a("/jsLoaded", new iq(this, ieVar));
        sj sjVar = new sj();
        fk irVar = new ir(this, ieVar, sjVar);
        sjVar.f4100a = irVar;
        ieVar.m3841a("/requestReload", irVar);
        if (this.f3408b.f3401c.endsWith(".js")) {
            ieVar.m3849a(this.f3408b.f3401c);
        } else if (this.f3408b.f3401c.startsWith("<html>")) {
            ieVar.m3852c(this.f3408b.f3401c);
        } else {
            ieVar.m3851b(this.f3408b.f3401c);
        }
        rd.f4041a.postDelayed(new is(this, ieVar), (long) iw.f3425a);
    }
}
