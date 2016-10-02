package com.andromo.dev576782.app537736;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: com.andromo.dev576782.app537736.w */
final class C0220w implements OnGlobalLayoutListener {
    final /* synthetic */ ActivityChooserView f1219a;

    C0220w(ActivityChooserView activityChooserView) {
        this.f1219a = activityChooserView;
    }

    public final void onGlobalLayout() {
        if (!this.f1219a.m789c()) {
            return;
        }
        if (this.f1219a.isShown()) {
            this.f1219a.m779f().show();
            if (this.f1219a.f396a != null) {
                this.f1219a.f396a.subUiVisibilityChanged(true);
                return;
            }
            return;
        }
        this.f1219a.m779f().dismiss();
    }
}
