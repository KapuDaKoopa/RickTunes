package com.google.android.gms.p006b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Environment;
import com.google.android.gms.common.internal.ax;

@op
/* renamed from: com.google.android.gms.b.bx */
public final class bx {
    private final Context f3009a;

    public bx(Context context) {
        ax.m5528a((Object) context, (Object) "Context can not be null");
        this.f3009a = context;
    }

    public final boolean m3536a() {
        return "mounted".equals(Environment.getExternalStorageState()) && this.f3009a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean m3537a(Intent intent) {
        ax.m5528a((Object) intent, (Object) "Intent can not be null");
        return !this.f3009a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @TargetApi(14)
    public final boolean m3538b() {
        return VERSION.SDK_INT >= 14 && m3537a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
