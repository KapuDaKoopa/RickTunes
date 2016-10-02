package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;

class as extends ar {
    as() {
    }

    public final void m418a(View view, C0088a c0088a) {
        view.setAccessibilityDelegate((AccessibilityDelegate) c0088a.m337a());
    }

    public final boolean m419a(View view) {
        return view.canScrollVertically(-1);
    }

    public final boolean m420a(View view, int i) {
        return view.canScrollHorizontally(i);
    }
}
