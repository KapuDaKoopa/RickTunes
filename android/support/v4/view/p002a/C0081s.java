package android.support.v4.view.p002a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: android.support.v4.view.a.s */
final class C0081s extends AccessibilityNodeProvider {
    final /* synthetic */ C0076t f194a;

    C0081s(C0076t c0076t) {
        this.f194a = c0076t;
    }

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        this.f194a.m307c();
        return null;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return this.f194a.m306b();
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        this.f194a.m308d();
        return null;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f194a.m305a();
    }
}
