package com.google.android.gms.p006b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.b.tv */
final class tv implements OnClickListener {
    final /* synthetic */ JsResult f4197a;

    tv(JsResult jsResult) {
        this.f4197a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4197a.confirm();
    }
}
