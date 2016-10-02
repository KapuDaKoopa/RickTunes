package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;

/* renamed from: com.google.android.gms.common.internal.l */
public final class C0729l implements OnClickListener {
    private final Activity f4852a;
    private final Fragment f4853b;
    private final Intent f4854c;
    private final int f4855d;

    public C0729l(Activity activity, Intent intent) {
        this.f4852a = activity;
        this.f4853b = null;
        this.f4854c = intent;
        this.f4855d = 2;
    }

    public C0729l(Fragment fragment, Intent intent) {
        this.f4852a = null;
        this.f4853b = fragment;
        this.f4854c = intent;
        this.f4855d = 2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this.f4854c != null && this.f4853b != null) {
                this.f4853b.startActivityForResult(this.f4854c, this.f4855d);
            } else if (this.f4854c != null) {
                this.f4852a.startActivityForResult(this.f4854c, this.f4855d);
            }
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
        }
    }
}
