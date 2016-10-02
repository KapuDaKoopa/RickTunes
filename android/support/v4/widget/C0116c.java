package android.support.v4.widget;

/* renamed from: android.support.v4.widget.c */
final class C0116c implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar f370a;

    C0116c(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f370a = contentLoadingProgressBar;
    }

    public final void run() {
        this.f370a.f229c = false;
        if (!this.f370a.f230d) {
            this.f370a.f227a = System.currentTimeMillis();
            this.f370a.setVisibility(0);
        }
    }
}
