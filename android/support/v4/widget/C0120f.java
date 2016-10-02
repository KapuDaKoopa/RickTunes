package android.support.v4.widget;

import android.database.DataSetObserver;

/* renamed from: android.support.v4.widget.f */
final class C0120f extends DataSetObserver {
    final /* synthetic */ C0118d f372a;

    private C0120f(C0118d c0118d) {
        this.f372a = c0118d;
    }

    public final void onChanged() {
        this.f372a.mDataValid = true;
        this.f372a.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        this.f372a.mDataValid = false;
        this.f372a.notifyDataSetInvalidated();
    }
}
