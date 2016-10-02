package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p002a.C0062a;
import android.support.v4.view.p002a.C0069h;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.f */
final class C0096f implements C0095m {
    final /* synthetic */ C0088a f220a;
    final /* synthetic */ C0094e f221b;

    C0096f(C0094e c0094e, C0088a c0088a) {
        this.f221b = c0094e;
        this.f220a = c0088a;
    }

    public final Object m505a(View view) {
        C0088a c0088a = this.f220a;
        C0069h a = C0088a.m333a(view);
        return a != null ? a.m294a() : null;
    }

    public final void m506a(View view, int i) {
        C0088a c0088a = this.f220a;
        C0088a.m334a(view, i);
    }

    public final void m507a(View view, Object obj) {
        this.f220a.m338a(view, new C0062a(obj));
    }

    public final boolean m508a(View view, int i, Bundle bundle) {
        return this.f220a.m339a(view, i, bundle);
    }

    public final boolean m509a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f220a.m341b(view, accessibilityEvent);
    }

    public final boolean m510a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f220a.m340a(viewGroup, view, accessibilityEvent);
    }

    public final void m511b(View view, AccessibilityEvent accessibilityEvent) {
        this.f220a.m342d(view, accessibilityEvent);
    }

    public final void m512c(View view, AccessibilityEvent accessibilityEvent) {
        C0088a c0088a = this.f220a;
        C0088a.m336c(view, accessibilityEvent);
    }

    public final void m513d(View view, AccessibilityEvent accessibilityEvent) {
        C0088a c0088a = this.f220a;
        C0088a.m335a(view, accessibilityEvent);
    }
}
