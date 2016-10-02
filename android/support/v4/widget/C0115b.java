package android.support.v4.widget;

/* renamed from: android.support.v4.widget.b */
final class C0115b implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar f369a;

    C0115b(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f369a = contentLoadingProgressBar;
    }

    public final void run() {
        this.f369a.f228b = false;
        this.f369a.f227a = -1;
        this.f369a.setVisibility(8);
    }
}
