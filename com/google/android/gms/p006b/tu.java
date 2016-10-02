package com.google.android.gms.p006b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.b.tu */
final class tu implements OnClickListener {
    final /* synthetic */ JsResult f4196a;

    tu(JsResult jsResult) {
        this.f4196a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4196a.cancel();
    }
}
