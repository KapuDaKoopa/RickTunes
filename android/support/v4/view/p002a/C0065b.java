package android.support.v4.view.p002a;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.view.a.b */
class C0065b extends C0064g {
    C0065b() {
    }

    public final Object m248a(Object obj) {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo) obj);
    }

    public final void m249a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    public final void m250a(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    public final void m251a(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).addChild(view);
    }

    public final void m252a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    public final void m253a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setClickable(z);
    }

    public final int m254b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    public final void m255b(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    public final void m256b(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setParent(view);
    }

    public final void m257b(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setContentDescription(charSequence);
    }

    public final void m258b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEnabled(z);
    }

    public final CharSequence m259c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    public final void m260c(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInParent(rect);
    }

    public final void m261c(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setSource(view);
    }

    public final void m262c(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setPackageName(charSequence);
    }

    public final void m263c(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocusable(z);
    }

    public final CharSequence m264d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    public final void m265d(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInScreen(rect);
    }

    public final void m266d(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocused(z);
    }

    public final CharSequence m267e(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    public final void m268e(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setLongClickable(z);
    }

    public final CharSequence m269f(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }

    public final void m270f(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }

    public final void m271g(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setSelected(z);
    }

    public final boolean m272g(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    public final boolean m273h(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    public final boolean m274i(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    public final boolean m275j(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    public final boolean m276k(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    public final boolean m277l(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    public final boolean m278m(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    public final boolean m279n(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    public final boolean m280o(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    public final boolean m281p(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    public final void m282q(Object obj) {
        ((AccessibilityNodeInfo) obj).recycle();
    }
}
