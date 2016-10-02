package android.support.v4.view.p002a;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.view.a.d */
class C0066d extends C0065b {
    C0066d() {
    }

    public final void m283b(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).setMovementGranularities(i);
    }

    public final void m284h(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setVisibleToUser(z);
    }

    public final void m285i(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setAccessibilityFocused(z);
    }

    public final int m286r(Object obj) {
        return ((AccessibilityNodeInfo) obj).getMovementGranularities();
    }

    public final boolean m287s(Object obj) {
        return ((AccessibilityNodeInfo) obj).isVisibleToUser();
    }

    public final boolean m288t(Object obj) {
        return ((AccessibilityNodeInfo) obj).isAccessibilityFocused();
    }
}
