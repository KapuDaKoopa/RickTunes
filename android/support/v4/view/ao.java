package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

class ao implements aw {
    WeakHashMap f207a;

    ao() {
        this.f207a = null;
    }

    public int m394a(int i, int i2) {
        return View.resolveSize(i, i2);
    }

    long m395a() {
        return 10;
    }

    public void m396a(View view, int i, int i2, int i3, int i4) {
        view.invalidate(i, i2, i3, i4);
    }

    public void m397a(View view, int i, Paint paint) {
    }

    public void m398a(View view, Paint paint) {
    }

    public void m399a(View view, C0088a c0088a) {
    }

    public void m400a(View view, Runnable runnable) {
        view.postDelayed(runnable, m395a());
    }

    public boolean m401a(View view) {
        return false;
    }

    public boolean m402a(View view, int i) {
        return false;
    }

    public int m403b(View view) {
        return 2;
    }

    public void m404b(View view, int i) {
    }

    public void m405c(View view) {
        view.invalidate();
    }

    public int m406d(View view) {
        return 0;
    }

    public int m407e(View view) {
        return 0;
    }

    public int m408f(View view) {
        return 0;
    }

    public ViewParent m409g(View view) {
        return view.getParent();
    }

    public boolean m410h(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }
}
