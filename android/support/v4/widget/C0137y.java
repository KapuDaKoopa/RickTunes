package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.C0088a;
import android.support.v4.view.an;
import android.support.v4.view.p002a.C0062a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.widget.y */
final class C0137y extends C0088a {
    final /* synthetic */ SlidingPaneLayout f386b;
    private final Rect f387c;

    C0137y(SlidingPaneLayout slidingPaneLayout) {
        this.f386b = slidingPaneLayout;
        this.f387c = new Rect();
    }

    private boolean m764b(View view) {
        return this.f386b.m604b(view);
    }

    public final void m765a(View view, C0062a c0062a) {
        C0062a a = C0062a.m127a(c0062a);
        super.m338a(view, a);
        Rect rect = this.f387c;
        a.m130a(rect);
        c0062a.m136b(rect);
        a.m141c(rect);
        c0062a.m145d(rect);
        c0062a.m144c(a.m151f());
        c0062a.m132a(a.m160l());
        c0062a.m138b(a.m161m());
        c0062a.m143c(a.m162n());
        c0062a.m154h(a.m159k());
        c0062a.m150f(a.m157i());
        c0062a.m133a(a.m147d());
        c0062a.m139b(a.m149e());
        c0062a.m146d(a.m153g());
        c0062a.m148e(a.m155h());
        c0062a.m152g(a.m158j());
        c0062a.m129a(a.m134b());
        c0062a.m135b(a.m140c());
        a.m163o();
        c0062a.m138b(SlidingPaneLayout.class.getName());
        c0062a.m131a(view);
        ViewParent g = an.m376g(view);
        if (g instanceof View) {
            c0062a.m142c((View) g);
        }
        int childCount = this.f386b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f386b.getChildAt(i);
            if (!m764b(childAt) && childAt.getVisibility() == 0) {
                an.m371b(childAt, 1);
                c0062a.m137b(childAt);
            }
        }
    }

    public final boolean m766a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return !m764b(view) ? super.m340a(viewGroup, view, accessibilityEvent) : false;
    }

    public final void m767d(View view, AccessibilityEvent accessibilityEvent) {
        super.m342d(view, accessibilityEvent);
        accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }
}
