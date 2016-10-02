package com.google.android.gms.p006b;

import java.util.ArrayList;
import java.util.List;

@op
/* renamed from: com.google.android.gms.b.rt */
public final class rt {
    public final double[] f4061a;
    public final double[] f4062b;
    public final int[] f4063c;
    public int f4064d;
    private final String[] f4065e;

    private rt(rv rvVar) {
        int size = rvVar.f4072b.size();
        this.f4065e = (String[]) rvVar.f4071a.toArray(new String[size]);
        this.f4061a = rt.m4506a(rvVar.f4072b);
        this.f4062b = rt.m4506a(rvVar.f4073c);
        this.f4063c = new int[size];
        this.f4064d = 0;
    }

    private static double[] m4506a(List list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public final List m4507a() {
        List arrayList = new ArrayList(this.f4065e.length);
        for (int i = 0; i < this.f4065e.length; i++) {
            arrayList.add(new ru(this.f4065e[i], this.f4062b[i], this.f4061a[i], ((double) this.f4063c[i]) / ((double) this.f4064d), this.f4063c[i]));
        }
        return arrayList;
    }
}
