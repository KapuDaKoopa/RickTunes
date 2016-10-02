package com.google.android.gms.p006b;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.overlay.C0431x;
import com.google.android.gms.common.internal.ax;

@op
/* renamed from: com.google.android.gms.b.te */
public final class te {
    final tf f4126a;
    final Context f4127b;
    final ViewGroup f4128c;
    C0431x f4129d;

    public te(Context context, ViewGroup viewGroup, tf tfVar) {
        this(context, viewGroup, tfVar, (byte) 0);
    }

    private te(Context context, ViewGroup viewGroup, tf tfVar, byte b) {
        this.f4127b = context;
        this.f4128c = viewGroup;
        this.f4126a = tfVar;
        this.f4129d = null;
    }

    public final C0431x m4551a() {
        ax.m5534b("getAdVideoUnderlay must be called from the UI thread.");
        return this.f4129d;
    }
}
