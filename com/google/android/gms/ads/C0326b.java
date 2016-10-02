package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.internal.client.C0350b;
import com.google.android.gms.ads.internal.client.C0370u;
import com.google.android.gms.ads.internal.client.ah;
import com.google.android.gms.ads.internal.util.client.C0501b;

/* renamed from: com.google.android.gms.ads.b */
public class C0326b {
    private final C0370u f1738a;
    private final Context f1739b;
    private final ah f1740c;

    C0326b(Context context, ah ahVar) {
        this(context, ahVar, C0370u.m2445a());
    }

    private C0326b(Context context, ah ahVar, C0370u c0370u) {
        this.f1739b = context;
        this.f1740c = ahVar;
        this.f1738a = c0370u;
    }

    @RequiresPermission("android.permission.INTERNET")
    public final void m2034a(C0328d c0328d) {
        C0350b a = c0328d.m2040a();
        try {
            ah ahVar = this.f1740c;
            C0370u c0370u = this.f1738a;
            ahVar.m2294a(C0370u.m2444a(this.f1739b, a));
        } catch (RemoteException e) {
            C0501b.m3027a(6);
        }
    }
}
