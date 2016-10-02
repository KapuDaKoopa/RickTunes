package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.internal.ax;

public class SupportErrorDialogFragment extends DialogFragment {
    private Dialog f4508a;
    private OnCancelListener f4509b;

    public SupportErrorDialogFragment() {
        this.f4508a = null;
        this.f4509b = null;
    }

    public static SupportErrorDialogFragment m5063a(Dialog dialog, OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) ax.m5528a((Object) dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.f4508a = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f4509b = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f4509b != null) {
            this.f4509b.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f4508a == null) {
            setShowsDialog(false);
        }
        return this.f4508a;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
