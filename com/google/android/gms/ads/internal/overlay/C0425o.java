package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.tf;

@op
/* renamed from: com.google.android.gms.ads.internal.overlay.o */
public final class C0425o {
    public final int f2241a;
    public final LayoutParams f2242b;
    public final ViewGroup f2243c;
    public final Context f2244d;

    public C0425o(tf tfVar) {
        this.f2242b = tfVar.getLayoutParams();
        ViewParent parent = tfVar.getParent();
        this.f2244d = tfVar.m4574g();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C0423m("Could not get the parent of the WebView for an overlay.");
        }
        this.f2243c = (ViewGroup) parent;
        this.f2241a = this.f2243c.indexOfChild(tfVar.m4564b());
        this.f2243c.removeView(tfVar.m4564b());
        tfVar.m4563a(true);
    }
}
