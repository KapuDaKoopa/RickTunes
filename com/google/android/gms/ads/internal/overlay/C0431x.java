package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.actionbarsherlock.view.Menu;
import com.google.android.gms.common.internal.C0724g;
import com.google.android.gms.p006b.cv;
import com.google.android.gms.p006b.cz;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.tf;
import java.util.HashMap;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.ads.internal.overlay.x */
public final class C0431x extends FrameLayout implements C0430u {
    public final ah f2251a;
    public C0412v f2252b;
    private final tf f2253c;
    private final FrameLayout f2254d;
    private boolean f2255e;
    private boolean f2256f;
    private TextView f2257g;
    private long f2258h;
    private long f2259i;
    private String f2260j;
    private String f2261k;

    public C0431x(Context context, tf tfVar, cz czVar, cv cvVar) {
        super(context);
        this.f2253c = tfVar;
        this.f2254d = new FrameLayout(context);
        addView(this.f2254d, new LayoutParams(-1, -1));
        C0724g.m5550a(tfVar.m4575h());
        this.f2252b = tfVar.m4575h().f2141b.m2627a(context, tfVar, czVar, cvVar);
        if (this.f2252b != null) {
            this.f2254d.addView(this.f2252b, new LayoutParams(-1, -1, 17));
        }
        this.f2257g = new TextView(context);
        this.f2257g.setBackgroundColor(-16777216);
        m2722n();
        this.f2251a = new ah(this);
        this.f2251a.m2634b();
        if (this.f2252b != null) {
            this.f2252b.m2639a((C0430u) this);
        }
        if (this.f2252b == null) {
            m2730a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public static void m2720a(tf tfVar) {
        Map hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        tfVar.m4561a("onVideoEvent", hashMap);
    }

    private void m2721a(String str, String... strArr) {
        Map hashMap = new HashMap();
        hashMap.put("event", str);
        int length = strArr.length;
        int i = 0;
        Object obj = null;
        while (i < length) {
            Object obj2 = strArr[i];
            if (obj != null) {
                hashMap.put(obj, obj2);
                obj2 = null;
            }
            i++;
            obj = obj2;
        }
        this.f2253c.m4561a("onVideoEvent", hashMap);
    }

    private void m2722n() {
        if (!m2723o()) {
            this.f2254d.addView(this.f2257g, new LayoutParams(-1, -1));
            this.f2254d.bringChildToFront(this.f2257g);
        }
    }

    private boolean m2723o() {
        return this.f2257g.getParent() != null;
    }

    public final void m2724a() {
        if (this.f2252b != null && this.f2259i == 0) {
            float duration = ((float) this.f2252b.getDuration()) / 1000.0f;
            int videoWidth = this.f2252b.getVideoWidth();
            int videoHeight = this.f2252b.getVideoHeight();
            m2721a("canplaythrough", "duration", String.valueOf(duration), "videoWidth", String.valueOf(videoWidth), "videoHeight", String.valueOf(videoHeight));
        }
    }

    public final void m2725a(float f) {
        if (this.f2252b != null) {
            this.f2252b.m2637a(f);
        }
    }

    public final void m2726a(int i) {
        if (this.f2252b != null) {
            this.f2252b.m2638a(i);
        }
    }

    public final void m2727a(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            ViewGroup.LayoutParams layoutParams = new LayoutParams(i3 + 2, i4 + 2);
            layoutParams.setMargins(i - 1, i2 - 1, 0, 0);
            this.f2254d.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void m2728a(MotionEvent motionEvent) {
        if (this.f2252b != null) {
            this.f2252b.dispatchTouchEvent(motionEvent);
        }
    }

    public final void m2729a(String str) {
        this.f2261k = str;
    }

    public final void m2730a(String str, String str2) {
        m2721a("error", "what", str, "extra", str2);
    }

    public final void m2731b() {
        if (this.f2253c.m4573f() != null && !this.f2255e) {
            this.f2256f = (this.f2253c.m4573f().getWindow().getAttributes().flags & NotificationCompat.FLAG_HIGH_PRIORITY) != 0;
            if (!this.f2256f) {
                this.f2253c.m4573f().getWindow().addFlags(NotificationCompat.FLAG_HIGH_PRIORITY);
                this.f2255e = true;
            }
        }
    }

    public final void m2732c() {
        m2721a("pause", new String[0]);
        m2742m();
    }

    public final void m2733d() {
        m2721a("ended", new String[0]);
        m2742m();
    }

    public final void m2734e() {
        m2722n();
        this.f2259i = this.f2258h;
    }

    public final void m2735f() {
        if (this.f2252b != null) {
            if (TextUtils.isEmpty(this.f2261k)) {
                m2721a("no_src", new String[0]);
                return;
            }
            this.f2252b.setMimeType(this.f2260j);
            this.f2252b.setVideoPath(this.f2261k);
        }
    }

    public final void m2736g() {
        if (this.f2252b != null) {
            this.f2252b.m2642d();
        }
    }

    public final void m2737h() {
        if (this.f2252b != null) {
            this.f2252b.m2641c();
        }
    }

    public final void m2738i() {
        if (this.f2252b != null) {
            this.f2252b.m2643e();
        }
    }

    public final void m2739j() {
        if (this.f2252b != null) {
            this.f2252b.m2644f();
        }
    }

    public final void m2740k() {
        if (this.f2252b != null) {
            View textView = new TextView(this.f2252b.getContext());
            textView.setText("AdMob - " + this.f2252b.m2636a());
            textView.setTextColor(Menu.CATEGORY_MASK);
            textView.setBackgroundColor(-256);
            this.f2254d.addView(textView, new LayoutParams(-2, -2, 17));
            this.f2254d.bringChildToFront(textView);
        }
    }

    final void m2741l() {
        if (this.f2252b != null) {
            long currentPosition = (long) this.f2252b.getCurrentPosition();
            if (this.f2258h != currentPosition && currentPosition > 0) {
                if (m2723o()) {
                    this.f2254d.removeView(this.f2257g);
                }
                float f = ((float) currentPosition) / 1000.0f;
                m2721a("timeupdate", "time", String.valueOf(f));
                this.f2258h = currentPosition;
            }
        }
    }

    public final void m2742m() {
        if (this.f2253c.m4573f() != null && this.f2255e && !this.f2256f) {
            this.f2253c.m4573f().getWindow().clearFlags(NotificationCompat.FLAG_HIGH_PRIORITY);
            this.f2255e = false;
        }
    }

    public final void setMimeType(String str) {
        this.f2260j = str;
    }
}
