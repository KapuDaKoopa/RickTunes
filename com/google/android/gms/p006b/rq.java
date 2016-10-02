package com.google.android.gms.p006b;

import android.content.Context;
import android.view.MotionEvent;

@op
/* renamed from: com.google.android.gms.b.rq */
public final class rq {
    final Context f4051a;
    public String f4052b;
    private final float f4053c;
    private float f4054d;
    private float f4055e;
    private float f4056f;
    private int f4057g;

    public rq(Context context) {
        this.f4057g = 0;
        this.f4051a = context;
        this.f4053c = context.getResources().getDisplayMetrics().density;
    }

    public rq(Context context, String str) {
        this(context);
        this.f4052b = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4504a(int r8, float r9, float r10) {
        /*
        r7 = this;
        r1 = 4;
        r6 = 3;
        r5 = -1;
        r4 = 2;
        r3 = 1;
        if (r8 != 0) goto L_0x0011;
    L_0x0007:
        r0 = 0;
        r7.f4057g = r0;
        r7.f4054d = r9;
        r7.f4055e = r10;
        r7.f4056f = r10;
    L_0x0010:
        return;
    L_0x0011:
        r0 = r7.f4057g;
        if (r0 == r5) goto L_0x0010;
    L_0x0015:
        if (r8 != r4) goto L_0x0093;
    L_0x0017:
        r0 = r7.f4055e;
        r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0030;
    L_0x001d:
        r7.f4055e = r10;
    L_0x001f:
        r0 = r7.f4055e;
        r1 = r7.f4056f;
        r0 = r0 - r1;
        r1 = 1106247680; // 0x41f00000 float:30.0 double:5.465589745E-315;
        r2 = r7.f4053c;
        r1 = r1 * r2;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x0039;
    L_0x002d:
        r7.f4057g = r5;
        goto L_0x0010;
    L_0x0030:
        r0 = r7.f4056f;
        r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x001f;
    L_0x0036:
        r7.f4056f = r10;
        goto L_0x001f;
    L_0x0039:
        r0 = r7.f4057g;
        if (r0 == 0) goto L_0x0041;
    L_0x003d:
        r0 = r7.f4057g;
        if (r0 != r4) goto L_0x0067;
    L_0x0041:
        r0 = r7.f4054d;
        r0 = r9 - r0;
        r1 = 1112014848; // 0x42480000 float:50.0 double:5.49408334E-315;
        r2 = r7.f4053c;
        r1 = r1 * r2;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 < 0) goto L_0x0056;
    L_0x004e:
        r7.f4054d = r9;
        r0 = r7.f4057g;
        r0 = r0 + 1;
        r7.f4057g = r0;
    L_0x0056:
        r0 = r7.f4057g;
        if (r0 == r3) goto L_0x005e;
    L_0x005a:
        r0 = r7.f4057g;
        if (r0 != r6) goto L_0x0085;
    L_0x005e:
        r0 = r7.f4054d;
        r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0010;
    L_0x0064:
        r7.f4054d = r9;
        goto L_0x0010;
    L_0x0067:
        r0 = r7.f4057g;
        if (r0 == r3) goto L_0x006f;
    L_0x006b:
        r0 = r7.f4057g;
        if (r0 != r6) goto L_0x0056;
    L_0x006f:
        r0 = r7.f4054d;
        r0 = r9 - r0;
        r1 = -1035468800; // 0xffffffffc2480000 float:-50.0 double:NaN;
        r2 = r7.f4053c;
        r1 = r1 * r2;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 > 0) goto L_0x0056;
    L_0x007c:
        r7.f4054d = r9;
        r0 = r7.f4057g;
        r0 = r0 + 1;
        r7.f4057g = r0;
        goto L_0x0056;
    L_0x0085:
        r0 = r7.f4057g;
        if (r0 != r4) goto L_0x0010;
    L_0x0089:
        r0 = r7.f4054d;
        r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0010;
    L_0x008f:
        r7.f4054d = r9;
        goto L_0x0010;
    L_0x0093:
        if (r8 != r3) goto L_0x0010;
    L_0x0095:
        r0 = r7.f4057g;
        if (r0 != r1) goto L_0x0010;
    L_0x0099:
        r0 = r7.f4051a;
        r0 = r0 instanceof android.app.Activity;
        if (r0 != 0) goto L_0x00a4;
    L_0x009f:
        com.google.android.gms.ads.internal.util.client.C0501b.m3027a(r1);
        goto L_0x0010;
    L_0x00a4:
        r0 = r7.f4052b;
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x0135;
    L_0x00ac:
        r1 = "\\+";
        r2 = "%20";
        r0 = r0.replaceAll(r1, r2);
        r1 = new android.net.Uri$Builder;
        r1.<init>();
        r0 = r1.encodedQuery(r0);
        r0 = r0.build();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        com.google.android.gms.ads.internal.ar.m2240e();
        r2 = com.google.android.gms.p006b.rd.m4409a(r0);
        r0 = r2.keySet();
        r3 = r0.iterator();
    L_0x00d5:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x00fb;
    L_0x00db:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r4 = r1.append(r0);
        r5 = " = ";
        r4 = r4.append(r5);
        r0 = r2.get(r0);
        r0 = (java.lang.String) r0;
        r0 = r4.append(r0);
        r4 = "\n\n";
        r0.append(r4);
        goto L_0x00d5;
    L_0x00fb:
        r0 = r1.toString();
        r0 = r0.trim();
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x0135;
    L_0x0109:
        r1 = new android.app.AlertDialog$Builder;
        r2 = r7.f4051a;
        r1.<init>(r2);
        r1.setMessage(r0);
        r2 = "Ad Information";
        r1.setTitle(r2);
        r2 = "Share";
        r3 = new com.google.android.gms.b.rr;
        r3.<init>(r7, r0);
        r1.setPositiveButton(r2, r3);
        r0 = "Close";
        r2 = new com.google.android.gms.b.rs;
        r2.<init>(r7);
        r1.setNegativeButton(r0, r2);
        r0 = r1.create();
        r0.show();
        goto L_0x0010;
    L_0x0135:
        r0 = "No debug information";
        goto L_0x0109;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.rq.a(int, float, float):void");
    }

    public final void m4505a(MotionEvent motionEvent) {
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            m4504a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        m4504a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }
}
