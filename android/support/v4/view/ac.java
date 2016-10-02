package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;

final class ac implements OnClickListener {
    final /* synthetic */ PagerTabStrip f201a;

    ac(PagerTabStrip pagerTabStrip) {
        this.f201a = pagerTabStrip;
    }

    public final void onClick(View view) {
        this.f201a.a.setCurrentItem(this.f201a.a.getCurrentItem() + 1);
    }
}
