package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.p002a.C0062a;
import android.support.v4.view.p002a.C0069h;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.a */
public class C0088a {
    private static final C0089d f197b;
    private static final Object f198c;
    final Object f199a;

    static {
        if (VERSION.SDK_INT >= 16) {
            f197b = new C0094e();
        } else if (VERSION.SDK_INT >= 14) {
            f197b = new C0091b();
        } else {
            f197b = new C0090g();
        }
        f198c = f197b.m435a();
    }

    public C0088a() {
        this.f199a = f197b.m436a(this);
    }

    public static C0069h m333a(View view) {
        return f197b.m434a(f198c, view);
    }

    public static void m334a(View view, int i) {
        f197b.m437a(f198c, view, i);
    }

    public static void m335a(View view, AccessibilityEvent accessibilityEvent) {
        f197b.m444d(f198c, view, accessibilityEvent);
    }

    public static void m336c(View view, AccessibilityEvent accessibilityEvent) {
        f197b.m443c(f198c, view, accessibilityEvent);
    }

    final Object m337a() {
        return this.f199a;
    }

    public void m338a(View view, C0062a c0062a) {
        f197b.m438a(f198c, view, c0062a);
    }

    public boolean m339a(View view, int i, Bundle bundle) {
        return f197b.m439a(f198c, view, i, bundle);
    }

    public boolean m340a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f197b.m441a(f198c, viewGroup, view, accessibilityEvent);
    }

    public boolean m341b(View view, AccessibilityEvent accessibilityEvent) {
        return f197b.m440a(f198c, view, accessibilityEvent);
    }

    public void m342d(View view, AccessibilityEvent accessibilityEvent) {
        f197b.m442b(f198c, view, accessibilityEvent);
    }
}
