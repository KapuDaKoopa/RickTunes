package com.google.android.gms.p006b;

import android.support.v7.widget.GridLayout;
import com.google.android.gms.ads.internal.util.client.C0501b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.b.bh */
public final class bh {
    final Object f2966a;
    int f2967b;
    List f2968c;

    public bh() {
        this.f2966a = new Object();
        this.f2968c = new LinkedList();
    }

    public final bg m3508a() {
        bg bgVar = null;
        synchronized (this.f2966a) {
            if (this.f2968c.size() == 0) {
                C0501b.m3027a(3);
                return null;
            } else if (this.f2968c.size() >= 2) {
                int i = GridLayout.UNDEFINED;
                for (bg bgVar2 : this.f2968c) {
                    bg bgVar3;
                    int i2;
                    int i3 = bgVar2.f2957e;
                    if (i3 > i) {
                        int i4 = i3;
                        bgVar3 = bgVar2;
                        i2 = i4;
                    } else {
                        i2 = i;
                        bgVar3 = bgVar;
                    }
                    i = i2;
                    bgVar = bgVar3;
                }
                this.f2968c.remove(bgVar);
                return bgVar;
            } else {
                bgVar2 = (bg) this.f2968c.get(0);
                synchronized (bgVar2.f2953a) {
                    bgVar2.f2957e -= 100;
                }
                return bgVar2;
            }
        }
    }

    public final boolean m3509a(bg bgVar) {
        boolean z;
        synchronized (this.f2966a) {
            if (this.f2968c.contains(bgVar)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean m3510b(bg bgVar) {
        boolean z;
        synchronized (this.f2966a) {
            Iterator it = this.f2968c.iterator();
            while (it.hasNext()) {
                bg bgVar2 = (bg) it.next();
                if (bgVar != bgVar2 && bgVar2.f2958f.equals(bgVar.f2958f)) {
                    it.remove();
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return z;
    }
}
