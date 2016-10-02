package android.support.v4.view;

final class bj implements Runnable {
    final /* synthetic */ ViewPager f210a;

    bj(ViewPager viewPager) {
        this.f210a = viewPager;
    }

    public final void run() {
        this.f210a.setScrollState(0);
        this.f210a.m126b();
    }
}
