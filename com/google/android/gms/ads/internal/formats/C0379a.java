package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import com.google.android.gms.p006b.op;
import java.util.List;

@op
/* renamed from: com.google.android.gms.ads.internal.formats.a */
public final class C0379a {
    static final int f2051a;
    static final int f2052b;
    private static final int f2053c;
    private static final int f2054d;
    private final String f2055e;
    private final List f2056f;
    private final int f2057g;
    private final int f2058h;
    private final int f2059i;
    private final int f2060j;

    static {
        f2053c = Color.rgb(12, 174, 206);
        int rgb = Color.rgb(204, 204, 204);
        f2054d = rgb;
        f2051a = rgb;
        f2052b = f2053c;
    }

    public C0379a(String str, List list, Integer num, Integer num2, Integer num3, int i) {
        this.f2055e = str;
        this.f2056f = list;
        this.f2057g = num != null ? num.intValue() : f2051a;
        this.f2058h = num2 != null ? num2.intValue() : f2052b;
        this.f2059i = num3 != null ? num3.intValue() : 12;
        this.f2060j = i;
    }

    public final String m2479a() {
        return this.f2055e;
    }

    public final List m2480b() {
        return this.f2056f;
    }

    public final int m2481c() {
        return this.f2057g;
    }

    public final int m2482d() {
        return this.f2058h;
    }

    public final int m2483e() {
        return this.f2059i;
    }

    public final int m2484f() {
        return this.f2060j;
    }
}
