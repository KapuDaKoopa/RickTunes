package com.google.android.gms.p006b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.b.lr */
final class lr implements OnClickListener {
    final /* synthetic */ lp f3617a;

    lr(lp lpVar) {
        this.f3617a = lpVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3617a.m4178a("User canceled the download.");
    }
}
