package android.support.v4.view;

import android.support.v4.view.ViewPager.LayoutParams;
import android.view.View;
import java.util.Comparator;

final class bs implements Comparator {
    bs() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        LayoutParams layoutParams = (LayoutParams) ((View) obj).getLayoutParams();
        LayoutParams layoutParams2 = (LayoutParams) ((View) obj2).getLayoutParams();
        return layoutParams.f127a != layoutParams2.f127a ? layoutParams.f127a ? 1 : -1 : layoutParams.f131e - layoutParams2.f131e;
    }
}
