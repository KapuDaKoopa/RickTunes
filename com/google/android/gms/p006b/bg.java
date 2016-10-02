package com.google.android.gms.p006b;

import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.ArrayList;
import java.util.Iterator;

@op
/* renamed from: com.google.android.gms.b.bg */
public final class bg {
    final Object f2953a;
    int f2954b;
    int f2955c;
    int f2956d;
    int f2957e;
    public String f2958f;
    public String f2959g;
    private final int f2960h;
    private final int f2961i;
    private final int f2962j;
    private final bp f2963k;
    private ArrayList f2964l;
    private ArrayList f2965m;

    public bg(int i, int i2, int i3, int i4) {
        this.f2953a = new Object();
        this.f2964l = new ArrayList();
        this.f2965m = new ArrayList();
        this.f2954b = 0;
        this.f2955c = 0;
        this.f2956d = 0;
        this.f2958f = "";
        this.f2959g = "";
        this.f2960h = i;
        this.f2961i = i2;
        this.f2962j = i3;
        this.f2963k = new bp(i4);
    }

    private static String m3502a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
            stringBuffer.append(' ');
            if (stringBuffer.length() > 100) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() >= 100 ? stringBuffer2.substring(0, 100) : stringBuffer2;
    }

    public final void m3503a(String str, boolean z) {
        m3506b(str, z);
        synchronized (this.f2953a) {
            if (this.f2956d < 0) {
                C0501b.m3027a(3);
            }
            m3507c();
        }
    }

    public final boolean m3504a() {
        boolean z;
        synchronized (this.f2953a) {
            z = this.f2956d == 0;
        }
        return z;
    }

    public final void m3505b() {
        synchronized (this.f2953a) {
            this.f2956d++;
        }
    }

    final void m3506b(String str, boolean z) {
        if (str != null && str.length() >= this.f2962j) {
            synchronized (this.f2953a) {
                this.f2964l.add(str);
                this.f2954b += str.length();
                if (z) {
                    this.f2965m.add(str);
                }
            }
        }
    }

    public final void m3507c() {
        synchronized (this.f2953a) {
            int i = (this.f2954b * this.f2960h) + (this.f2955c * this.f2961i);
            if (i > this.f2957e) {
                this.f2957e = i;
                this.f2958f = this.f2963k.m3526a(this.f2964l);
                this.f2959g = this.f2963k.m3526a(this.f2965m);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bg)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        bg bgVar = (bg) obj;
        return bgVar.f2958f != null && bgVar.f2958f.equals(this.f2958f);
    }

    public final int hashCode() {
        return this.f2958f.hashCode();
    }

    public final String toString() {
        return "ActivityContent fetchId: " + this.f2955c + " score:" + this.f2957e + " total_length:" + this.f2954b + "\n text: " + bg.m3502a(this.f2964l) + "\n viewableText" + bg.m3502a(this.f2965m) + "\n signture: " + this.f2958f + "\n viewableSignture: " + this.f2959g;
    }
}
