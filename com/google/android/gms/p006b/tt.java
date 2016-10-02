package com.google.android.gms.p006b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.b.tt */
final class tt implements OnCancelListener {
    final /* synthetic */ JsResult f4195a;

    tt(JsResult jsResult) {
        this.f4195a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f4195a.cancel();
    }
}
