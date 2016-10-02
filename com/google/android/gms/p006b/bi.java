package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;

@TargetApi(14)
@op
/* renamed from: com.google.android.gms.b.bi */
public final class bi implements ActivityLifecycleCallbacks {
    private Activity f2969a;
    private Context f2970b;
    private final Object f2971c;

    public bi(Application application, Activity activity) {
        this.f2971c = new Object();
        application.registerActivityLifecycleCallbacks(this);
        m3511a(activity);
        this.f2970b = application.getApplicationContext();
    }

    private void m3511a(Activity activity) {
        synchronized (this.f2971c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f2969a = activity;
            }
        }
    }

    public final Activity m3512a() {
        return this.f2969a;
    }

    public final Context m3513b() {
        return this.f2970b;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f2971c) {
            if (this.f2969a == null) {
                return;
            }
            if (this.f2969a.equals(activity)) {
                this.f2969a = null;
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m3511a(activity);
    }

    public final void onActivityResumed(Activity activity) {
        m3511a(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m3511a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
