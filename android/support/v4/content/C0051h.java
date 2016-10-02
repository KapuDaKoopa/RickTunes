package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: android.support.v4.content.h */
class C0051h implements C0050g {
    C0051h() {
    }

    public Intent m90a(ComponentName componentName) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentName);
        intent.addCategory("android.intent.category.LAUNCHER");
        return intent;
    }
}
