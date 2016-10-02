package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.ax;

@TargetApi(11)
/* renamed from: com.google.android.gms.common.a */
public final class C0652a extends DialogFragment {
    private Dialog f4510a;
    private OnCancelListener f4511b;

    public C0652a() {
        this.f4510a = null;
        this.f4511b = null;
    }

    public static C0652a m5064a(Dialog dialog, OnCancelListener onCancelListener) {
        C0652a c0652a = new C0652a();
        Dialog dialog2 = (Dialog) ax.m5528a((Object) dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c0652a.f4510a = dialog2;
        if (onCancelListener != null) {
            c0652a.f4511b = onCancelListener;
        }
        return c0652a;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f4511b != null) {
            this.f4511b.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f4510a == null) {
            setShowsDialog(false);
        }
        return this.f4510a;
    }

    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
