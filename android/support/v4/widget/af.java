package android.support.v4.widget;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class af extends ae {
    private Method f323a;
    private Field f324b;

    af() {
        try {
            this.f323a = View.class.getDeclaredMethod("getDisplayList", null);
        } catch (NoSuchMethodException e) {
        }
        try {
            this.f324b = View.class.getDeclaredField("mRecreateDisplayList");
            this.f324b.setAccessible(true);
        } catch (NoSuchFieldException e2) {
        }
    }

    public final void m649a(SlidingPaneLayout slidingPaneLayout, View view) {
        if (this.f323a == null || this.f324b == null) {
            view.invalidate();
            return;
        }
        try {
            this.f324b.setBoolean(view, true);
            this.f323a.invoke(view, null);
        } catch (Exception e) {
        }
        super.m648a(slidingPaneLayout, view);
    }
}
