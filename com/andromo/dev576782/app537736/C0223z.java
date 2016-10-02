package com.andromo.dev576782.app537736;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;
import com.google.android.gms.C0772e;

/* renamed from: com.andromo.dev576782.app537736.z */
final class C0223z implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
    final /* synthetic */ ActivityChooserView f1227a;

    private C0223z(ActivityChooserView activityChooserView) {
        this.f1227a = activityChooserView;
    }

    public final void onClick(View view) {
        if (view == this.f1227a.f403h) {
            this.f1227a.m788b();
            Intent b = this.f1227a.f397b.m1651e().m1638b(this.f1227a.f397b.m1651e().m1634a(this.f1227a.f397b.m1648b()));
            if (b != null) {
                this.f1227a.f414s.startActivity(b);
            }
        } else if (view == this.f1227a.f401f) {
            this.f1227a.f410o = false;
            this.f1227a.m770a(this.f1227a.f411p);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void onDismiss() {
        if (this.f1227a.f409n != null) {
            this.f1227a.f409n.onDismiss();
        }
        if (this.f1227a.f396a != null) {
            this.f1227a.f396a.subUiVisibilityChanged(false);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (((C0222y) adapterView.getAdapter()).getItemViewType(i)) {
            case C0772e.WalletFragmentStyle_buyButtonHeight /*0*/:
                this.f1227a.m788b();
                if (!this.f1227a.f410o) {
                    if (!this.f1227a.f397b.m1652f()) {
                        i++;
                    }
                    Intent b = this.f1227a.f397b.m1651e().m1638b(i);
                    if (b != null) {
                        this.f1227a.f414s.startActivity(b);
                    }
                } else if (i > 0) {
                    this.f1227a.f397b.m1651e().m1640c(i);
                }
            case C0772e.WalletFragmentStyle_buyButtonWidth /*1*/:
                this.f1227a.m770a((int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean onLongClick(View view) {
        if (view == this.f1227a.f403h) {
            if (this.f1227a.f397b.getCount() > 0) {
                this.f1227a.f410o = true;
                this.f1227a.m770a(this.f1227a.f411p);
            }
            return true;
        }
        throw new IllegalArgumentException();
    }
}
