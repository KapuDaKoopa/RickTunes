package android.support.v4.view;

import android.support.v4.view.p002a.C0062a;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.c */
final class C0093c implements C0092j {
    final /* synthetic */ C0088a f218a;
    final /* synthetic */ C0091b f219b;

    C0093c(C0091b c0091b, C0088a c0088a) {
        this.f219b = c0091b;
        this.f218a = c0088a;
    }

    public final void m486a(View view, int i) {
        C0088a c0088a = this.f218a;
        C0088a.m334a(view, i);
    }

    public final void m487a(View view, Object obj) {
        this.f218a.m338a(view, new C0062a(obj));
    }

    public final boolean m488a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f218a.m341b(view, accessibilityEvent);
    }

    public final boolean m489a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f218a.m340a(viewGroup, view, accessibilityEvent);
    }

    public final void m490b(View view, AccessibilityEvent accessibilityEvent) {
        this.f218a.m342d(view, accessibilityEvent);
    }

    public final void m491c(View view, AccessibilityEvent accessibilityEvent) {
        C0088a c0088a = this.f218a;
        C0088a.m336c(view, accessibilityEvent);
    }

    public final void m492d(View view, AccessibilityEvent accessibilityEvent) {
        C0088a c0088a = this.f218a;
        C0088a.m335a(view, accessibilityEvent);
    }
}
