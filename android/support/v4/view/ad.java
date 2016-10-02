package android.support.v4.view;

import android.database.DataSetObserver;

final class ad extends DataSetObserver implements bn, bo {
    final /* synthetic */ PagerTitleStrip f202a;
    private int f203b;

    private ad(PagerTitleStrip pagerTitleStrip) {
        this.f202a = pagerTitleStrip;
    }

    public final void m347a() {
        float f = 0.0f;
        if (this.f203b == 0) {
            this.f202a.m94a(this.f202a.f97a.getCurrentItem(), this.f202a.f97a.getAdapter());
            if (this.f202a.f103g >= 0.0f) {
                f = this.f202a.f103g;
            }
            this.f202a.m93a(this.f202a.f97a.getCurrentItem(), f, true);
        }
    }

    public final void m348a(int i) {
        this.f203b = i;
    }

    public final void m349a(int i, float f) {
        if (f > 0.5f) {
            i++;
        }
        this.f202a.m93a(i, f, false);
    }

    public final void m350a(aa aaVar, aa aaVar2) {
        this.f202a.m95a(aaVar, aaVar2);
    }

    public final void onChanged() {
        float f = 0.0f;
        this.f202a.m94a(this.f202a.f97a.getCurrentItem(), this.f202a.f97a.getAdapter());
        if (this.f202a.f103g >= 0.0f) {
            f = this.f202a.f103g;
        }
        this.f202a.m93a(this.f202a.f97a.getCurrentItem(), f, true);
    }
}
