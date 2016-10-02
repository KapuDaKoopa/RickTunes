package com.andromo.dev576782.app537736;

final class hv {
    public static final hv f1083a;
    private final int f1084b;
    private final int f1085c;
    private final int f1086d;
    private final int f1087e;
    private final int f1088f;
    private final int f1089g;
    private final String f1090h;
    private volatile int f1091i;

    static {
        f1083a = new hv("");
    }

    private hv(hw hwVar) {
        this.f1084b = hwVar.f1092a;
        this.f1085c = hwVar.f1093b;
        this.f1086d = hwVar.f1094c;
        this.f1087e = hwVar.f1095d;
        this.f1088f = hwVar.f1096e;
        this.f1089g = hwVar.f1097f;
        this.f1090h = hwVar.f1098g;
    }

    private hv(String str) {
        this.f1084b = 0;
        this.f1085c = 0;
        this.f1086d = 0;
        this.f1087e = 0;
        this.f1088f = 0;
        this.f1089g = 0;
        this.f1090h = str;
    }

    public static final hv m1568a() {
        return f1083a;
    }

    public final int m1569b() {
        return this.f1084b;
    }

    public final int m1570c() {
        return this.f1085c;
    }

    public final int m1571d() {
        return this.f1086d;
    }

    public final int m1572e() {
        return this.f1087e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hv)) {
            return false;
        }
        hv hvVar = (hv) obj;
        return el.m1391a((long) this.f1084b, (long) hvVar.f1084b) && el.m1391a((long) this.f1085c, (long) hvVar.f1085c) && el.m1391a((long) this.f1086d, (long) hvVar.f1086d) && el.m1391a((long) this.f1087e, (long) hvVar.f1087e) && el.m1391a((long) this.f1088f, (long) hvVar.f1088f) && el.m1391a((long) this.f1089g, (long) hvVar.f1089g) && el.m1392a(this.f1090h, hvVar.f1090h);
    }

    public final int m1573f() {
        return this.f1088f;
    }

    public final int m1574g() {
        return this.f1089g;
    }

    public final String m1575h() {
        return this.f1090h != null ? this.f1090h : "";
    }

    public final int hashCode() {
        int i = this.f1091i;
        if (i != 0) {
            return i;
        }
        i = ev.m1410a(((((((((((this.f1084b + 851) * 37) + this.f1085c) * 37) + this.f1086d) * 37) + this.f1087e) * 37) + this.f1088f) * 37) + this.f1089g, this.f1090h);
        this.f1091i = i;
        return i;
    }

    public final boolean m1576i() {
        return this.f1085c != 0;
    }

    public final String toString() {
        return "SevenData { currentListeners: " + this.f1084b + ", streamStatus: " + this.f1085c + ", peakListeners: " + this.f1086d + ", maxListeners: " + this.f1087e + ", uniqueListeners: " + this.f1088f + ", bitrate: " + this.f1089g + ", songTitle: '" + this.f1090h + "'}";
    }
}
