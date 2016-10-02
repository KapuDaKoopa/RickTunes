package com.google.android.gms.p006b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.b.tx */
final class tx implements OnClickListener {
    final /* synthetic */ JsPromptResult f4199a;

    tx(JsPromptResult jsPromptResult) {
        this.f4199a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4199a.cancel();
    }
}
