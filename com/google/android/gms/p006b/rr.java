package com.google.android.gms.p006b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.gms.ads.internal.ar;

/* renamed from: com.google.android.gms.b.rr */
final class rr implements OnClickListener {
    final /* synthetic */ String f4058a;
    final /* synthetic */ rq f4059b;

    rr(rq rqVar, String str) {
        this.f4059b = rqVar;
        this.f4058a = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ar.m2240e();
        rd.m4414a(this.f4059b.f4051a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", this.f4058a), "Share via"));
    }
}
