package com.google.android.gms.p006b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.b.ll */
final class ll implements OnClickListener {
    final /* synthetic */ lj f3588a;

    ll(lj ljVar) {
        this.f3588a = ljVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3588a.m4178a("Operation denied by user.");
    }
}
