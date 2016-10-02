package com.andromo.dev576782.app537736;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class bp implements OnCancelListener {
    final /* synthetic */ Audio98819 f758a;

    bp(Audio98819 audio98819) {
        this.f758a = audio98819;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f758a.f443T != null) {
            this.f758a.f443T.cancel(true);
            this.f758a.f443T = null;
            this.f758a.f442S = null;
            this.f758a.removeDialog(3);
        }
    }
}
