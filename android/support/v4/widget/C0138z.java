package android.support.v4.widget;

import android.support.v4.view.an;
import android.view.View;

/* renamed from: android.support.v4.widget.z */
final class C0138z implements Runnable {
    final View f388a;
    final /* synthetic */ SlidingPaneLayout f389b;

    C0138z(SlidingPaneLayout slidingPaneLayout, View view) {
        this.f389b = slidingPaneLayout;
        this.f388a = view;
    }

    public final void run() {
        if (this.f388a.getParent() == this.f389b) {
            an.m364a(this.f388a, 0, null);
            this.f389b.m594c(this.f388a);
        }
        this.f389b.f290u.remove(this);
    }
}
