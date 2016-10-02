package com.andromo.dev576782.app537736;

import android.app.Activity;
import android.view.View;

public final class ig extends cu {
    final String f1106c;
    private final int f1107d;
    private Activity f1108e;

    public ig(String str) {
        this.f1108e = null;
        this.f1107d = 2130903079;
        this.f1106c = str;
    }

    protected final void m1590a(Activity activity) {
        if (activity != null && this.f1108e != null && activity == this.f1108e) {
            this.f1108e = null;
        }
    }

    protected final boolean m1591a() {
        return true;
    }

    protected final boolean m1592a(Activity activity, View view) {
        this.f1108e = activity;
        View findViewById = view.findViewById(2131361953);
        if (findViewById == null) {
            return false;
        }
        findViewById.setOnClickListener(new ih(this));
        findViewById.setVisibility(0);
        return true;
    }

    protected final int m1593b() {
        return this.f1107d;
    }
}
