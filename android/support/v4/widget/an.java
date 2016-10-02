package android.support.v4.widget;

final class an implements Runnable {
    final /* synthetic */ SwipeRefreshLayout f344a;

    an(SwipeRefreshLayout swipeRefreshLayout) {
        this.f344a = swipeRefreshLayout;
    }

    public final void run() {
        this.f344a.f312s = true;
        if (this.f344a.f295b != null) {
            this.f344a.f304k = this.f344a.f305l;
            this.f344a.f316x.setDuration((long) this.f344a.f303j);
            this.f344a.f316x.setAnimationListener(this.f344a.f318z);
            this.f344a.f316x.reset();
            this.f344a.f316x.setInterpolator(this.f344a.f313t);
            this.f344a.startAnimation(this.f344a.f316x);
        }
        SwipeRefreshLayout.m610a(this.f344a, this.f344a.f307n + this.f344a.getPaddingTop(), this.f344a.f317y);
    }
}
