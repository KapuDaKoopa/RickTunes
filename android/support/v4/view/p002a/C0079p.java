package android.support.v4.view.p002a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.view.a.p */
final class C0079p extends AccessibilityNodeProvider {
    final /* synthetic */ C0073q f193a;

    C0079p(C0073q c0073q) {
        this.f193a = c0073q;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        this.f193a.m300c();
        return null;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return this.f193a.m299b();
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f193a.m298a();
    }
}
