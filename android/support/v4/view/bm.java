package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.p002a.C0062a;
import android.support.v4.view.p002a.C0082u;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

final class bm extends C0088a {
    final /* synthetic */ ViewPager f216b;

    bm(ViewPager viewPager) {
        this.f216b = viewPager;
    }

    private boolean m473b() {
        return this.f216b.f166h != null && this.f216b.f166h.getCount() > 1;
    }

    public final void m474a(View view, C0062a c0062a) {
        super.m338a(view, c0062a);
        c0062a.m138b(ViewPager.class.getName());
        c0062a.m156i(m473b());
        if (this.f216b.canScrollHorizontally(1)) {
            c0062a.m129a((int) FragmentTransaction.TRANSIT_ENTER_MASK);
        }
        if (this.f216b.canScrollHorizontally(-1)) {
            c0062a.m129a((int) FragmentTransaction.TRANSIT_EXIT_MASK);
        }
    }

    public final boolean m475a(View view, int i, Bundle bundle) {
        if (super.m339a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case FragmentTransaction.TRANSIT_ENTER_MASK /*4096*/:
                if (!this.f216b.canScrollHorizontally(1)) {
                    return false;
                }
                this.f216b.setCurrentItem(this.f216b.f167i + 1);
                return true;
            case FragmentTransaction.TRANSIT_EXIT_MASK /*8192*/:
                if (!this.f216b.canScrollHorizontally(-1)) {
                    return false;
                }
                this.f216b.setCurrentItem(this.f216b.f167i - 1);
                return true;
            default:
                return false;
        }
    }

    public final void m476d(View view, AccessibilityEvent accessibilityEvent) {
        super.m342d(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        C0082u a = C0082u.m313a();
        a.m315a(m473b());
        if (accessibilityEvent.getEventType() == FragmentTransaction.TRANSIT_ENTER_MASK && this.f216b.f166h != null) {
            a.m314a(this.f216b.f166h.getCount());
            a.m316b(this.f216b.f167i);
            a.m317c(this.f216b.f167i);
        }
    }
}
