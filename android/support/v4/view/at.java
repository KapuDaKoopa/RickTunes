package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class at extends as {
    at() {
    }

    public final void m421a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    public final void m422a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public void m423b(View view, int i) {
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    public final void m424c(View view) {
        view.postInvalidateOnAnimation();
    }

    public final int m425d(View view) {
        return view.getImportantForAccessibility();
    }

    public final ViewParent m426g(View view) {
        return view.getParentForAccessibility();
    }
}
