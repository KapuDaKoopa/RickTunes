package com.google.android.gms.p006b;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.b.os */
final class os implements Callable {
    final /* synthetic */ oq f3781a;
    final /* synthetic */ Context f3782b;
    final /* synthetic */ AdRequestInfoParcel f3783c;
    final /* synthetic */ Bundle f3784d;

    os(oq oqVar, Context context, AdRequestInfoParcel adRequestInfoParcel, Bundle bundle) {
        this.f3781a = oqVar;
        this.f3782b = context;
        this.f3783c = adRequestInfoParcel;
        this.f3784d = bundle;
    }

    public final /* synthetic */ Object call() {
        pg pgVar = this.f3781a.f3774i;
        Context context = this.f3782b;
        String str = this.f3783c.f2328g.packageName;
        Bundle bundle = this.f3784d;
        return null;
    }
}
