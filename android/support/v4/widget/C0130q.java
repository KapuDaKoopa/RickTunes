package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.q */
final class C0130q implements C0128r {
    C0130q() {
    }

    public final Object m727a(Context context) {
        return new EdgeEffect(context);
    }

    public final void m728a(Object obj, int i, int i2) {
        ((EdgeEffect) obj).setSize(i, i2);
    }

    public final boolean m729a(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    public final boolean m730a(Object obj, float f) {
        ((EdgeEffect) obj).onPull(f);
        return true;
    }

    public final boolean m731a(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }

    public final void m732b(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    public final boolean m733c(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }
}
