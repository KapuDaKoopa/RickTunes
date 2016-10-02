package com.andromo.dev576782.app537736;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class er implements OnClickListener {
    final /* synthetic */ Context f873a;

    er(Context context) {
        this.f873a = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new eo(this.f873a).execute(new Void[0]);
        dialogInterface.dismiss();
    }
}
