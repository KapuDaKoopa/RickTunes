package com.google.android.gms.p006b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.lu */
public final class lu extends lv implements fk {
    DisplayMetrics f3628a;
    int f3629b;
    int f3630c;
    int f3631d;
    int f3632e;
    int f3633f;
    int f3634g;
    private final tf f3635i;
    private final Context f3636j;
    private final WindowManager f3637k;
    private final bx f3638l;
    private float f3639m;
    private int f3640n;

    public lu(tf tfVar, Context context, bx bxVar) {
        super(tfVar);
        this.f3629b = -1;
        this.f3630c = -1;
        this.f3631d = -1;
        this.f3632e = -1;
        this.f3633f = -1;
        this.f3634g = -1;
        this.f3635i = tfVar;
        this.f3636j = context;
        this.f3638l = bxVar;
        this.f3637k = (WindowManager) context.getSystemService("window");
    }

    public final void m4190a(int i, int i2) {
        int i3;
        if (this.f3636j instanceof Activity) {
            ar.m2240e();
            i3 = rd.m4442c((Activity) this.f3636j)[0];
        } else {
            i3 = 0;
        }
        i3 = i2 - i3;
        int i4 = this.f3633f;
        try {
            this.f3579h.m3845b("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i3).put("width", i4).put("height", this.f3634g));
        } catch (JSONException e) {
            C0501b.m3027a(6);
        }
        this.f3635i.m4579l().m4604a(i, i2);
    }

    public final void m4191a(tf tfVar, Map map) {
        int[] a;
        this.f3628a = new DisplayMetrics();
        Display defaultDisplay = this.f3637k.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f3628a);
        this.f3639m = this.f3628a.density;
        this.f3640n = defaultDisplay.getRotation();
        C0374z.m2455a();
        this.f3629b = C0500a.m3019b(this.f3628a, this.f3628a.widthPixels);
        C0374z.m2455a();
        this.f3630c = C0500a.m3019b(this.f3628a, this.f3628a.heightPixels);
        Activity f = this.f3635i.m4573f();
        if (f == null || f.getWindow() == null) {
            this.f3631d = this.f3629b;
            this.f3632e = this.f3630c;
        } else {
            ar.m2240e();
            a = rd.m4430a(f);
            C0374z.m2455a();
            this.f3631d = C0500a.m3019b(this.f3628a, a[0]);
            C0374z.m2455a();
            this.f3632e = C0500a.m3019b(this.f3628a, a[1]);
        }
        if (this.f3635i.m4578k().f1906e) {
            this.f3633f = this.f3629b;
            this.f3634g = this.f3630c;
        } else {
            this.f3635i.measure(0, 0);
            C0374z.m2455a();
            this.f3633f = C0500a.m3018b(this.f3636j, this.f3635i.getMeasuredWidth());
            C0374z.m2455a();
            this.f3634g = C0500a.m3018b(this.f3636j, this.f3635i.getMeasuredHeight());
        }
        m4177a(this.f3629b, this.f3630c, this.f3631d, this.f3632e, this.f3639m, this.f3640n);
        lt ltVar = new lt();
        bx bxVar = this.f3638l;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        ltVar.f3624b = bxVar.m3537a(intent);
        bxVar = this.f3638l;
        intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        ltVar.f3623a = bxVar.m3537a(intent);
        ltVar.f3625c = this.f3638l.m3538b();
        ltVar.f3626d = this.f3638l.m3536a();
        bxVar = this.f3638l;
        ltVar.f3627e = true;
        this.f3635i.m3845b("onDeviceFeaturesReceived", new ls((byte) 0).m4189a());
        a = new int[2];
        this.f3635i.getLocationOnScreen(a);
        C0374z.m2455a();
        int b = C0500a.m3018b(this.f3636j, a[0]);
        C0374z.m2455a();
        m4190a(b, C0500a.m3018b(this.f3636j, a[1]));
        if (C0501b.m3027a(2)) {
            C0501b.m3027a(4);
        }
        try {
            this.f3579h.m3845b("onReadyEventReceived", new JSONObject().put("js", this.f3635i.m4582o().f2539b));
        } catch (JSONException e) {
            C0501b.m3027a(6);
        }
    }
}
