package com.google.android.gms.ads.internal.formats;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.C0374z;
import com.google.android.gms.ads.internal.util.client.C0500a;
import com.google.android.gms.ads.internal.util.client.C0501b;
import com.google.android.gms.p006b.C0361do;
import com.google.android.gms.p006b.op;
import com.google.android.gms.p006b.rd;
import com.google.android.gms.p006b.ta;
import com.google.android.gms.p017a.C0314a;
import com.google.android.gms.p017a.C0317d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@op
/* renamed from: com.google.android.gms.ads.internal.formats.r */
public final class C0396r extends C0361do implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    boolean f2120a;
    int f2121b;
    int f2122c;
    private final Object f2123d;
    private final FrameLayout f2124e;
    private FrameLayout f2125f;
    private Map f2126g;
    private C0380b f2127h;
    private C0386h f2128i;

    public C0396r(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f2123d = new Object();
        this.f2126g = new HashMap();
        this.f2120a = false;
        this.f2124e = frameLayout;
        this.f2125f = frameLayout2;
        ta.m4540a(this.f2124e, (OnGlobalLayoutListener) this);
        ta.m4541a(this.f2124e, (OnScrollChangedListener) this);
        this.f2124e.setOnTouchListener(this);
    }

    private int m2596a(int i) {
        C0374z.m2455a();
        return C0500a.m3018b(this.f2128i.m2568f(), i);
    }

    private void m2598a(View view) {
        if (this.f2128i != null) {
            C0386h c = this.f2128i instanceof C0388g ? ((C0388g) this.f2128i).m2586c() : this.f2128i;
            if (c != null) {
                c.m2566c(view);
            }
        }
    }

    public final C0314a m2599a(String str) {
        C0314a a;
        synchronized (this.f2123d) {
            Object obj;
            WeakReference weakReference = (WeakReference) this.f2126g.get(str);
            if (weakReference == null) {
                obj = null;
            } else {
                View view = (View) weakReference.get();
            }
            a = C0317d.m1996a(obj);
        }
        return a;
    }

    public final void m2600a() {
        this.f2125f.removeAllViews();
        this.f2125f = null;
        this.f2126g = null;
        this.f2127h = null;
        this.f2128i = null;
    }

    public final void m2601a(C0314a c0314a) {
        synchronized (this.f2123d) {
            this.f2120a = true;
            m2598a(null);
            Object a = C0317d.m1997a(c0314a);
            if (a instanceof C0387j) {
                C0386h c0386h = (C0387j) a;
                if ((this.f2128i instanceof C0388g) && ((C0388g) this.f2128i).m2585b()) {
                    ((C0388g) this.f2128i).m2584a(c0386h);
                } else {
                    this.f2128i = c0386h;
                    if (this.f2128i instanceof C0388g) {
                        ((C0388g) this.f2128i).m2584a(null);
                    }
                }
                this.f2125f.removeAllViews();
                this.f2127h = c0386h.m2569a((OnClickListener) this);
                if (this.f2127h != null) {
                    this.f2126g.put("1007", new WeakReference(this.f2127h.m2485a()));
                    this.f2125f.addView(this.f2127h);
                }
                rd.f4041a.post(new C0397s(this, c0386h));
                c0386h.m2572a(this.f2124e);
                m2598a(this.f2124e);
                return;
            }
            C0501b.m3025a("Not an instance of native engine. This is most likely a transient error");
        }
    }

    public final void m2602a(String str, C0314a c0314a) {
        View view = (View) C0317d.m1997a(c0314a);
        synchronized (this.f2123d) {
            if (view == null) {
                this.f2126g.remove(str);
            } else {
                this.f2126g.put(str, new WeakReference(view));
                view.setOnTouchListener(this);
                view.setOnClickListener(this);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
        r10 = this;
        r6 = r10.f2123d;
        monitor-enter(r6);
        r0 = r10.f2128i;	 Catch:{ all -> 0x00c7 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r6);	 Catch:{ all -> 0x00c7 }
    L_0x0008:
        return;
    L_0x0009:
        r3 = new org.json.JSONObject;	 Catch:{ all -> 0x00c7 }
        r3.<init>();	 Catch:{ all -> 0x00c7 }
        r0 = r10.f2126g;	 Catch:{ all -> 0x00c7 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x00c7 }
        r4 = r0.iterator();	 Catch:{ all -> 0x00c7 }
    L_0x0018:
        r0 = r4.hasNext();	 Catch:{ all -> 0x00c7 }
        if (r0 == 0) goto L_0x00d8;
    L_0x001e:
        r0 = r4.next();	 Catch:{ all -> 0x00c7 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x00c7 }
        r1 = r0.getValue();	 Catch:{ all -> 0x00c7 }
        r1 = (java.lang.ref.WeakReference) r1;	 Catch:{ all -> 0x00c7 }
        r1 = r1.get();	 Catch:{ all -> 0x00c7 }
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x00c7 }
        r2 = r10.f2127h;	 Catch:{ all -> 0x00c7 }
        if (r2 == 0) goto L_0x00ca;
    L_0x0034:
        r2 = r10.f2127h;	 Catch:{ all -> 0x00c7 }
        r2 = r2.m2485a();	 Catch:{ all -> 0x00c7 }
        r2 = r2.equals(r1);	 Catch:{ all -> 0x00c7 }
        if (r2 == 0) goto L_0x00ca;
    L_0x0040:
        r5 = new android.graphics.Point;	 Catch:{ all -> 0x00c7 }
        r5.<init>();	 Catch:{ all -> 0x00c7 }
        r2 = r10.f2124e;	 Catch:{ all -> 0x00c7 }
        r7 = new android.graphics.Rect;	 Catch:{ all -> 0x00c7 }
        r7.<init>();	 Catch:{ all -> 0x00c7 }
        r2.getGlobalVisibleRect(r7, r5);	 Catch:{ all -> 0x00c7 }
        r7 = new android.graphics.Point;	 Catch:{ all -> 0x00c7 }
        r7.<init>();	 Catch:{ all -> 0x00c7 }
        r2 = new android.graphics.Rect;	 Catch:{ all -> 0x00c7 }
        r2.<init>();	 Catch:{ all -> 0x00c7 }
        r1.getGlobalVisibleRect(r2, r7);	 Catch:{ all -> 0x00c7 }
        r2 = new android.graphics.Point;	 Catch:{ all -> 0x00c7 }
        r8 = r7.x;	 Catch:{ all -> 0x00c7 }
        r9 = r5.x;	 Catch:{ all -> 0x00c7 }
        r8 = r8 - r9;
        r7 = r7.y;	 Catch:{ all -> 0x00c7 }
        r5 = r5.y;	 Catch:{ all -> 0x00c7 }
        r5 = r7 - r5;
        r2.<init>(r8, r5);	 Catch:{ all -> 0x00c7 }
    L_0x006c:
        r5 = new org.json.JSONObject;	 Catch:{ all -> 0x00c7 }
        r5.<init>();	 Catch:{ all -> 0x00c7 }
        r7 = "width";
        r8 = r1.getWidth();	 Catch:{ JSONException -> 0x00ac }
        r8 = r10.m2596a(r8);	 Catch:{ JSONException -> 0x00ac }
        r5.put(r7, r8);	 Catch:{ JSONException -> 0x00ac }
        r7 = "height";
        r1 = r1.getHeight();	 Catch:{ JSONException -> 0x00ac }
        r1 = r10.m2596a(r1);	 Catch:{ JSONException -> 0x00ac }
        r5.put(r7, r1);	 Catch:{ JSONException -> 0x00ac }
        r1 = "x";
        r7 = r2.x;	 Catch:{ JSONException -> 0x00ac }
        r7 = r10.m2596a(r7);	 Catch:{ JSONException -> 0x00ac }
        r5.put(r1, r7);	 Catch:{ JSONException -> 0x00ac }
        r1 = "y";
        r2 = r2.y;	 Catch:{ JSONException -> 0x00ac }
        r2 = r10.m2596a(r2);	 Catch:{ JSONException -> 0x00ac }
        r5.put(r1, r2);	 Catch:{ JSONException -> 0x00ac }
        r1 = r0.getKey();	 Catch:{ JSONException -> 0x00ac }
        r1 = (java.lang.String) r1;	 Catch:{ JSONException -> 0x00ac }
        r3.put(r1, r5);	 Catch:{ JSONException -> 0x00ac }
        goto L_0x0018;
    L_0x00ac:
        r1 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c7 }
        r2 = "Unable to get view rectangle for view ";
        r1.<init>(r2);	 Catch:{ all -> 0x00c7 }
        r0 = r0.getKey();	 Catch:{ all -> 0x00c7 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x00c7 }
        r0 = r1.append(r0);	 Catch:{ all -> 0x00c7 }
        r0 = r0.toString();	 Catch:{ all -> 0x00c7 }
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r0);	 Catch:{ all -> 0x00c7 }
        goto L_0x0018;
    L_0x00c7:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x00ca:
        r2 = new android.graphics.Point;	 Catch:{ all -> 0x00c7 }
        r2.<init>();	 Catch:{ all -> 0x00c7 }
        r5 = new android.graphics.Rect;	 Catch:{ all -> 0x00c7 }
        r5.<init>();	 Catch:{ all -> 0x00c7 }
        r1.getGlobalVisibleRect(r5, r2);	 Catch:{ all -> 0x00c7 }
        goto L_0x006c;
    L_0x00d8:
        r4 = new org.json.JSONObject;	 Catch:{ all -> 0x00c7 }
        r4.<init>();	 Catch:{ all -> 0x00c7 }
        r0 = "x";
        r1 = r10.f2121b;	 Catch:{ JSONException -> 0x0130 }
        r1 = r10.m2596a(r1);	 Catch:{ JSONException -> 0x0130 }
        r4.put(r0, r1);	 Catch:{ JSONException -> 0x0130 }
        r0 = "y";
        r1 = r10.f2122c;	 Catch:{ JSONException -> 0x0130 }
        r1 = r10.m2596a(r1);	 Catch:{ JSONException -> 0x0130 }
        r4.put(r0, r1);	 Catch:{ JSONException -> 0x0130 }
    L_0x00f3:
        r5 = new org.json.JSONObject;	 Catch:{ all -> 0x00c7 }
        r5.<init>();	 Catch:{ all -> 0x00c7 }
        r0 = "width";
        r1 = r10.f2124e;	 Catch:{ JSONException -> 0x0137 }
        r1 = r1.getMeasuredWidth();	 Catch:{ JSONException -> 0x0137 }
        r1 = r10.m2596a(r1);	 Catch:{ JSONException -> 0x0137 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0137 }
        r0 = "height";
        r1 = r10.f2124e;	 Catch:{ JSONException -> 0x0137 }
        r1 = r1.getMeasuredHeight();	 Catch:{ JSONException -> 0x0137 }
        r1 = r10.m2596a(r1);	 Catch:{ JSONException -> 0x0137 }
        r5.put(r0, r1);	 Catch:{ JSONException -> 0x0137 }
    L_0x0116:
        r0 = r10.f2127h;	 Catch:{ all -> 0x00c7 }
        if (r0 == 0) goto L_0x013e;
    L_0x011a:
        r0 = r10.f2127h;	 Catch:{ all -> 0x00c7 }
        r0 = r0.m2485a();	 Catch:{ all -> 0x00c7 }
        r0 = r0.equals(r11);	 Catch:{ all -> 0x00c7 }
        if (r0 == 0) goto L_0x013e;
    L_0x0126:
        r0 = r10.f2128i;	 Catch:{ all -> 0x00c7 }
        r1 = "1007";
        r0.m2564a(r1, r3, r4, r5);	 Catch:{ all -> 0x00c7 }
    L_0x012d:
        monitor-exit(r6);	 Catch:{ all -> 0x00c7 }
        goto L_0x0008;
    L_0x0130:
        r0 = move-exception;
        r0 = "Unable to get click location";
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r0);	 Catch:{ all -> 0x00c7 }
        goto L_0x00f3;
    L_0x0137:
        r0 = move-exception;
        r0 = "Unable to get native ad view bounding box";
        com.google.android.gms.ads.internal.util.client.C0501b.m3025a(r0);	 Catch:{ all -> 0x00c7 }
        goto L_0x0116;
    L_0x013e:
        r0 = r10.f2128i;	 Catch:{ all -> 0x00c7 }
        r2 = r10.f2126g;	 Catch:{ all -> 0x00c7 }
        r1 = r11;
        r0.m2563a(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00c7 }
        goto L_0x012d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.formats.r.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.f2123d) {
            if (this.f2120a) {
                int measuredWidth = this.f2124e.getMeasuredWidth();
                int measuredHeight = this.f2124e.getMeasuredHeight();
                if (!(measuredWidth == 0 || measuredHeight == 0)) {
                    this.f2125f.setLayoutParams(new LayoutParams(measuredWidth, measuredHeight));
                    this.f2120a = false;
                }
            }
            if (this.f2128i != null) {
                this.f2128i.m2565b(this.f2124e);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f2123d) {
            if (this.f2128i != null) {
                this.f2128i.m2565b(this.f2124e);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f2123d) {
            if (this.f2128i == null) {
            } else {
                int[] iArr = new int[2];
                this.f2124e.getLocationOnScreen(iArr);
                Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
                this.f2121b = point.x;
                this.f2122c = point.y;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation((float) point.x, (float) point.y);
                this.f2128i.m2562a(obtain);
                obtain.recycle();
            }
        }
        return false;
    }
}
