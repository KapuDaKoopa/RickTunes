package android.support.v4.view.p002a;

import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.a.v */
class C0085v extends C0084z {
    C0085v() {
    }

    public final Object m328a() {
        return AccessibilityRecord.obtain();
    }

    public final void m329a(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    public final void m330a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    public final void m331b(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    public final void m332c(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }
}
