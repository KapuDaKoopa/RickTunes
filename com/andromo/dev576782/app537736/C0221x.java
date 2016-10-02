package com.andromo.dev576782.app537736;

import android.database.DataSetObserver;

/* renamed from: com.andromo.dev576782.app537736.x */
final class C0221x extends DataSetObserver {
    final /* synthetic */ ActivityChooserView f1220a;

    C0221x(ActivityChooserView activityChooserView) {
        this.f1220a = activityChooserView;
    }

    public final void onChanged() {
        super.onChanged();
        ActivityChooserView.m774c(this.f1220a);
    }
}
