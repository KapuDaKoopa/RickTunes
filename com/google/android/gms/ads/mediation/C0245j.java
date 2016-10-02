package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;

/* renamed from: com.google.android.gms.ads.mediation.j */
public abstract class C0245j {
    protected boolean f1323a;
    protected boolean f1324b;
    protected Bundle f1325c;

    public C0245j() {
        this.f1325c = new Bundle();
    }

    public final void m1722a() {
        this.f1323a = true;
    }

    public void m1723a(View view) {
    }

    public final void m1724b() {
        this.f1324b = true;
    }

    public final boolean m1725c() {
        return this.f1323a;
    }

    public final boolean m1726d() {
        return this.f1324b;
    }

    public final Bundle m1727e() {
        return this.f1325c;
    }
}
