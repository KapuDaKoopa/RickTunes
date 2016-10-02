package android.support.v4.widget;

import android.support.v4.widget.SlidingPaneLayout.LayoutParams;
import android.view.View;

final class aa extends at {
    final /* synthetic */ SlidingPaneLayout f322a;

    private aa(SlidingPaneLayout slidingPaneLayout) {
        this.f322a = slidingPaneLayout;
    }

    public final void m638a(int i) {
        if (this.f322a.f286q.m673a() != 0) {
            return;
        }
        if (this.f322a.f278i == 0.0f) {
            this.f322a.m602a(this.f322a.f277h);
            SlidingPaneLayout slidingPaneLayout = this.f322a;
            this.f322a.f277h;
            slidingPaneLayout.m603b();
            this.f322a.f287r = false;
            return;
        }
        slidingPaneLayout = this.f322a;
        this.f322a.f277h;
        slidingPaneLayout.m601a();
        this.f322a.f287r = true;
    }

    public final void m639a(int i, int i2) {
        this.f322a.f286q.m676a(this.f322a.f277h, i2);
    }

    public final void m640a(View view, float f) {
        int paddingRight;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f322a.m597e()) {
            paddingRight = layoutParams.rightMargin + this.f322a.getPaddingRight();
            if (f < 0.0f || (f == 0.0f && this.f322a.f278i > 0.5f)) {
                paddingRight += this.f322a.f280k;
            }
            paddingRight = (this.f322a.getWidth() - paddingRight) - this.f322a.f277h.getWidth();
        } else {
            paddingRight = layoutParams.leftMargin + this.f322a.getPaddingLeft();
            if (f > 0.0f || (f == 0.0f && this.f322a.f278i > 0.5f)) {
                paddingRight += this.f322a.f280k;
            }
        }
        this.f322a.f286q.m677a(paddingRight, view.getTop());
        this.f322a.invalidate();
    }

    public final void m641a(View view, int i) {
        SlidingPaneLayout.m585a(this.f322a, i);
        this.f322a.invalidate();
    }

    public final boolean m642a(View view) {
        return this.f322a.f281l ? false : ((LayoutParams) view.getLayoutParams()).f266b;
    }

    public final int m643b(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) this.f322a.f277h.getLayoutParams();
        if (this.f322a.m597e()) {
            int width = this.f322a.getWidth() - ((layoutParams.rightMargin + this.f322a.getPaddingRight()) + this.f322a.f277h.getWidth());
            return Math.max(Math.min(i, width), width - this.f322a.f280k);
        }
        width = layoutParams.leftMargin + this.f322a.getPaddingLeft();
        return Math.min(Math.max(i, width), this.f322a.f280k + width);
    }

    public final void m644b(View view) {
        this.f322a.m605c();
    }

    public final int m645c(View view) {
        return this.f322a.f280k;
    }

    public final int m646d(View view) {
        return view.getTop();
    }
}
