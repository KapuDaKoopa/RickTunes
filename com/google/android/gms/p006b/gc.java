package com.google.android.gms.p006b;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.overlay.C0431x;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.common.internal.ax;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

@op
/* renamed from: com.google.android.gms.b.gc */
public final class gc implements fk {
    private final Map f3263a;

    public gc() {
        this.f3263a = new WeakHashMap();
    }

    private static int m3742a(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                C0374z.m2455a();
                i = C0500a.m3009a(context, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                C0501b.m3025a("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        return i;
    }

    public final void m3743a(tf tfVar, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            C0501b.m3025a("Action missing from video GMSG.");
            return;
        }
        if (C0501b.m3027a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            "Video GMSG: " + str + " " + jSONObject.toString();
            C0501b.m3027a(3);
        }
        int parseColor;
        te v;
        C0431x a;
        if ("background".equals(str)) {
            str = (String) map.get("color");
            if (TextUtils.isEmpty(str)) {
                C0501b.m3025a("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                parseColor = Color.parseColor(str);
                v = tfVar.m4589v();
                if (v != null) {
                    a = v.m4551a();
                    if (a != null) {
                        a.setBackgroundColor(parseColor);
                        return;
                    }
                }
                this.f3263a.put(tfVar, Integer.valueOf(parseColor));
                return;
            } catch (IllegalArgumentException e) {
                C0501b.m3025a("Invalid color parameter in video GMSG.");
                return;
            }
        }
        v = tfVar.m4589v();
        if (v == null) {
            C0501b.m3025a("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        int a2;
        if (equals || equals2) {
            Context context = tfVar.getContext();
            a2 = gc.m3742a(context, map, "x", 0);
            int a3 = gc.m3742a(context, map, "y", 0);
            int a4 = gc.m3742a(context, map, "w", -1);
            int a5 = gc.m3742a(context, map, "h", -1);
            try {
                Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e2) {
            }
            if (equals && v.m4551a() == null) {
                if (v.f4129d == null) {
                    cq.m3589a(v.f4126a.m4591x().f3119b, v.f4126a.m4590w(), "vpr");
                    v.f4129d = new C0431x(v.f4127b, v.f4126a, v.f4126a.m4591x().f3119b, cq.m3588a(v.f4126a.m4591x().f3119b));
                    v.f4128c.addView(v.f4129d, 0, new LayoutParams(-1, -1));
                    v.f4129d.m2727a(a2, a3, a4, a5);
                    v.f4126a.m4579l().m4620f();
                }
                if (this.f3263a.containsKey(tfVar)) {
                    parseColor = ((Integer) this.f3263a.get(tfVar)).intValue();
                    a = v.m4551a();
                    a.setBackgroundColor(parseColor);
                    a.m2740k();
                    return;
                }
                return;
            }
            ax.m5534b("The underlay may only be modified from the UI thread.");
            if (v.f4129d != null) {
                v.f4129d.m2727a(a2, a3, a4, a5);
                return;
            }
            return;
        }
        C0431x a6 = v.m4551a();
        if (a6 == null) {
            C0431x.m2720a(tfVar);
        } else if ("click".equals(str)) {
            context = tfVar.getContext();
            int a7 = gc.m3742a(context, map, "x", 0);
            a2 = gc.m3742a(context, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a7, (float) a2, 0);
            a6.m2728a(obtain);
            obtain.recycle();
        } else if ("currentTime".equals(str)) {
            str = (String) map.get("time");
            if (str == null) {
                C0501b.m3025a("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                a6.m2726a((int) (Float.parseFloat(str) * 1000.0f));
            } catch (NumberFormatException e3) {
                C0501b.m3025a("Could not parse time parameter from currentTime video GMSG: " + str);
            }
        } else if ("hide".equals(str)) {
            a6.setVisibility(4);
        } else if ("load".equals(str)) {
            a6.m2735f();
        } else if ("mimetype".equals(str)) {
            a6.setMimeType((String) map.get("mimetype"));
        } else if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                a6.m2738i();
            } else {
                a6.m2739j();
            }
        } else if ("pause".equals(str)) {
            a6.m2736g();
        } else if ("play".equals(str)) {
            a6.m2737h();
        } else if ("show".equals(str)) {
            a6.setVisibility(0);
        } else if ("src".equals(str)) {
            a6.m2729a((String) map.get("src"));
        } else if ("volume".equals(str)) {
            str = (String) map.get("volume");
            if (str == null) {
                C0501b.m3025a("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                a6.m2725a(Float.parseFloat(str));
            } catch (NumberFormatException e4) {
                C0501b.m3025a("Could not parse volume parameter from volume video GMSG: " + str);
            }
        } else if ("watermark".equals(str)) {
            a6.m2740k();
        } else {
            C0501b.m3025a("Unknown video action: " + str);
        }
    }
}
