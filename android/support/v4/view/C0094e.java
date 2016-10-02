package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.p002a.C0069h;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.view.e */
final class C0094e extends C0091b {
    C0094e() {
    }

    public final C0069h m493a(Object obj, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = ((AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
        return accessibilityNodeProvider != null ? new C0069h(accessibilityNodeProvider) : null;
    }

    public final Object m494a(C0088a c0088a) {
        return new C0100l(new C0096f(this, c0088a));
    }

    public final boolean m495a(Object obj, View view, int i, Bundle bundle) {
        return ((AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }
}
