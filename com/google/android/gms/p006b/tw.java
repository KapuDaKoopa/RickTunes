package com.google.android.gms.p006b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.b.tw */
final class tw implements OnCancelListener {
    final /* synthetic */ JsPromptResult f4198a;

    tw(JsPromptResult jsPromptResult) {
        this.f4198a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f4198a.cancel();
    }
}
