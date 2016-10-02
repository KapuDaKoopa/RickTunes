package android.support.v4.widget;

final class am implements Runnable {
    final /* synthetic */ SwipeRefreshLayout f343a;

    am(SwipeRefreshLayout swipeRefreshLayout) {
        this.f343a = swipeRefreshLayout;
    }

    public final void run() {
        this.f343a.f312s = true;
        SwipeRefreshLayout.m610a(this.f343a, this.f343a.f307n + this.f343a.getPaddingTop(), this.f343a.f317y);
    }
}
