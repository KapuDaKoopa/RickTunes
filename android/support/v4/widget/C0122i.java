package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.C0088a;
import android.support.v4.view.an;
import android.support.v4.view.p002a.C0062a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v4.widget.i */
final class C0122i extends C0088a {
    final /* synthetic */ DrawerLayout f374b;
    private final Rect f375c;

    C0122i(DrawerLayout drawerLayout) {
        this.f374b = drawerLayout;
        this.f375c = new Rect();
    }

    public final void m690a(View view, C0062a c0062a) {
        C0062a a = C0062a.m127a(c0062a);
        super.m338a(view, a);
        c0062a.m138b(DrawerLayout.class.getName());
        c0062a.m131a(view);
        ViewParent g = an.m376g(view);
        if (g instanceof View) {
            c0062a.m142c((View) g);
        }
        Rect rect = this.f375c;
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
        a.m163o();
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (DrawerLayout.m566f(childAt)) {
                c0062a.m137b(childAt);
            }
        }
    }

    public final boolean m691a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return DrawerLayout.m566f(view) ? super.m340a(viewGroup, view, accessibilityEvent) : false;
    }

    public final boolean m692b(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.m341b(view, accessibilityEvent);
        }
        List text = accessibilityEvent.getText();
        View a = this.f374b.m568g();
        if (a != null) {
            CharSequence a2 = this.f374b.m573a(this.f374b.m580c(a));
            if (a2 != null) {
                text.add(a2);
            }
        }
        return true;
    }

    public final void m693d(View view, AccessibilityEvent accessibilityEvent) {
        super.m342d(view, accessibilityEvent);
        accessibilityEvent.setClassName(DrawerLayout.class.getName());
    }
}
