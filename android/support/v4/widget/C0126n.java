package android.support.v4.widget;

import android.support.v4.widget.DrawerLayout.LayoutParams;
import android.view.View;

/* renamed from: android.support.v4.widget.n */
final class C0126n implements Runnable {
    final /* synthetic */ C0125m f381a;

    C0126n(C0125m c0125m) {
        this.f381a = c0125m;
    }

    public final void run() {
        View view;
        int i;
        int i2 = 0;
        C0125m c0125m = this.f381a;
        int b = c0125m.f378b.m680b();
        boolean z = c0125m.f377a == 3;
        if (z) {
            View b2 = c0125m.f379c.m578b(3);
            if (b2 != null) {
                i2 = -b2.getWidth();
            }
            i2 += b;
            view = b2;
            i = i2;
        } else {
            i2 = c0125m.f379c.getWidth() - b;
            view = c0125m.f379c.m578b(5);
            i = i2;
        }
        if (view == null) {
            return;
        }
        if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && c0125m.f379c.m572a(view) == 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            c0125m.f378b.m679a(view, i, view.getTop());
            layoutParams.f235c = true;
            c0125m.f379c.invalidate();
            c0125m.m702b();
            c0125m.f379c.m583e();
        }
    }
}
