package com.andromo.dev576782.app537736;

import android.database.DataSetObserver;

/* renamed from: com.andromo.dev576782.app537736.v */
final class C0219v extends DataSetObserver {
    final /* synthetic */ ActivityChooserView f1218a;

    C0219v(ActivityChooserView activityChooserView) {
        this.f1218a = activityChooserView;
    }

    public final void onChanged() {
        super.onChanged();
        this.f1218a.f397b.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        super.onInvalidated();
        this.f1218a.f397b.notifyDataSetInvalidated();
    }
}
