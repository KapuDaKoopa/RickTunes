package com.google.android.gms.p006b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.b.ty */
final class ty implements OnClickListener {
    final /* synthetic */ JsPromptResult f4200a;
    final /* synthetic */ EditText f4201b;

    ty(JsPromptResult jsPromptResult, EditText editText) {
        this.f4200a = jsPromptResult;
        this.f4201b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4200a.confirm(this.f4201b.getText().toString());
    }
}
