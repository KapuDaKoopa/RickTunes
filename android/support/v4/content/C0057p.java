package android.support.v4.content;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: android.support.v4.content.p */
final class C0057p extends FutureTask {
    final /* synthetic */ C0045m f86a;

    C0057p(C0045m c0045m, Callable callable) {
        this.f86a = c0045m;
        super(callable);
    }

    protected final void done() {
        try {
            C0045m.m75b(this.f86a, get());
        } catch (Throwable e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
        } catch (CancellationException e3) {
            C0045m.m75b(this.f86a, null);
        } catch (Throwable e4) {
            RuntimeException runtimeException = new RuntimeException("An error occured while executing doInBackground()", e4);
        }
    }
}
