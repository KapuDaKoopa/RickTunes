package android.support.v4.view;

import android.database.DataSetObserver;

final class bq extends DataSetObserver {
    final /* synthetic */ ViewPager f217a;

    private bq(ViewPager viewPager) {
        this.f217a = viewPager;
    }

    public final void onChanged() {
        this.f217a.m125a();
    }

    public final void onInvalidated() {
        this.f217a.m125a();
    }
}
