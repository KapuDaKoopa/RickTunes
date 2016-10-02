package com.google.android.gms.p006b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@op
/* renamed from: com.google.android.gms.b.tq */
public final class tq extends MutableContextWrapper {
    private Activity f4190a;
    private Context f4191b;
    private Context f4192c;

    public tq(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Activity m4730a() {
        return this.f4190a;
    }

    public final Context m4731b() {
        return this.f4192c;
    }

    public final Object getSystemService(String str) {
        return this.f4192c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.f4191b = context.getApplicationContext();
        this.f4190a = context instanceof Activity ? (Activity) context : null;
        this.f4192c = context;
        super.setBaseContext(this.f4191b);
    }

    public final void startActivity(Intent intent) {
        if (this.f4190a == null || xn.m4900a(21)) {
            intent.setFlags(268435456);
            this.f4191b.startActivity(intent);
            return;
        }
        this.f4190a.startActivity(intent);
    }
}
