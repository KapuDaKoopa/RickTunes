package android.support.v4.widget;

import android.support.v4.widget.DrawerLayout.LayoutParams;
import android.view.View;

/* renamed from: android.support.v4.widget.m */
final class C0125m extends at {
    final int f377a;
    aq f378b;
    final /* synthetic */ DrawerLayout f379c;
    private final Runnable f380d;

    public C0125m(DrawerLayout drawerLayout, int i) {
        this.f379c = drawerLayout;
        this.f380d = new C0126n(this);
        this.f377a = i;
    }

    public final void m695a() {
        this.f379c.removeCallbacks(this.f380d);
    }

    public final void m696a(int i) {
        DrawerLayout drawerLayout = this.f379c;
        int i2 = this.f377a;
        drawerLayout.m575a(i, this.f378b.m684c());
    }

    public final void m697a(int i, int i2) {
        View b = (i & 1) == 1 ? this.f379c.m578b(3) : this.f379c.m578b(5);
        if (b != null && this.f379c.m572a(b) == 0) {
            this.f378b.m676a(b, i2);
        }
    }

    public final void m698a(View view, float f) {
        int i;
        DrawerLayout drawerLayout = this.f379c;
        float b = DrawerLayout.m563b(view);
        int width = view.getWidth();
        if (this.f379c.m577a(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && b > 0.5f)) ? 0 : -width;
        } else {
            i = this.f379c.getWidth();
            if (f < 0.0f || (f == 0.0f && b > 0.5f)) {
                i -= width;
            }
        }
        this.f378b.m677a(i, view.getTop());
        this.f379c.invalidate();
    }

    public final void m699a(View view, int i) {
        int width = view.getWidth();
        float width2 = this.f379c.m577a(view, 3) ? ((float) (width + i)) / ((float) width) : ((float) (this.f379c.getWidth() - i)) / ((float) width);
        this.f379c.m576a(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        this.f379c.invalidate();
    }

    public final boolean m700a(View view) {
        DrawerLayout drawerLayout = this.f379c;
        return DrawerLayout.m565d(view) && this.f379c.m577a(view, this.f377a) && this.f379c.m572a(view) == 0;
    }

    public final int m701b(View view, int i) {
        if (this.f379c.m577a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.f379c.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    final void m702b() {
        int i = 3;
        if (this.f377a == 3) {
            i = 5;
        }
        View b = this.f379c.m578b(i);
        if (b != null) {
            this.f379c.m584e(b);
        }
    }

    public final void m703b(View view) {
        ((LayoutParams) view.getLayoutParams()).f235c = false;
        m702b();
    }

    public final int m704c(View view) {
        return view.getWidth();
    }

    public final void m705c() {
        this.f379c.postDelayed(this.f380d, 160);
    }

    public final int m706d(View view) {
        return view.getTop();
    }
}
