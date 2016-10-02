package com.google.android.gms.p006b;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.b.lj */
public final class lj extends lv {
    final Context f3580a;
    String f3581b;
    long f3582c;
    long f3583d;
    String f3584e;
    String f3585f;
    private final Map f3586g;

    public lj(tf tfVar, Map map) {
        super(tfVar, "createCalendarEvent");
        this.f3586g = map;
        this.f3580a = tfVar.m4573f();
        this.f3581b = m4180c("description");
        this.f3584e = m4180c("summary");
        this.f3582c = m4181d("start_ticks");
        this.f3583d = m4181d("end_ticks");
        this.f3585f = m4180c("location");
    }

    private String m4180c(String str) {
        return TextUtils.isEmpty((CharSequence) this.f3586g.get(str)) ? "" : (String) this.f3586g.get(str);
    }

    private long m4181d(String str) {
        String str2 = (String) this.f3586g.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
