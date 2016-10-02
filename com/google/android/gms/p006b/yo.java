package com.google.android.gms.p006b;

import com.google.android.gms.C0772e;
import java.lang.reflect.Array;

/* renamed from: com.google.android.gms.b.yo */
public final class yo {
    protected final int f4378a;
    protected final Class f4379b;
    public final int f4380c;
    protected final boolean f4381d;

    private int m4956b(Object obj) {
        int a = yv.m4984a(this.f4380c);
        switch (this.f4378a) {
            case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                return (yl.m4930b(a) * 2) + ((ys) obj).m1661d();
            case C0772e.MapAttrs_uiZoomControls /*11*/:
                return yl.m4933b(a, (ys) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.f4378a);
        }
    }

    private void m4957b(Object obj, yl ylVar) {
        try {
            ylVar.m4950c(this.f4380c);
            switch (this.f4378a) {
                case C0772e.WalletFragmentStyle_maskedWalletDetailsLogoImageType /*10*/:
                    ys ysVar = (ys) obj;
                    int a = yv.m4984a(this.f4380c);
                    ysVar.m1658a(ylVar);
                    ylVar.m4951c(a, 4);
                    return;
                case C0772e.MapAttrs_uiZoomControls /*11*/:
                    ylVar.m4948a((ys) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.f4378a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    final int m4958a(Object obj) {
        int i = 0;
        if (!this.f4381d) {
            return m4956b(obj);
        }
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += m4956b(Array.get(obj, i2));
            }
        }
        return i;
    }

    final void m4959a(Object obj, yl ylVar) {
        if (this.f4381d) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                Object obj2 = Array.get(obj, i);
                if (obj2 != null) {
                    m4957b(obj2, ylVar);
                }
            }
            return;
        }
        m4957b(obj, ylVar);
    }
}
