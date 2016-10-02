package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;

final class ab implements OnClickListener {
    final /* synthetic */ PagerTabStrip f200a;

    ab(PagerTabStrip pagerTabStrip) {
        this.f200a = pagerTabStrip;
    }

    public final void onClick(View view) {
        this.f200a.a.setCurrentItem(this.f200a.a.getCurrentItem() - 1);
    }
}
