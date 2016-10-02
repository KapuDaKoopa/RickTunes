package android.support.v4.view;

import android.view.KeyEvent;

/* renamed from: android.support.v4.view.u */
final class C0109u extends C0108t {
    C0109u() {
    }

    public final int m530a(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    public final boolean m531b(int i) {
        return KeyEvent.metaStateHasModifiers(i, 1);
    }

    public final boolean m532c(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
