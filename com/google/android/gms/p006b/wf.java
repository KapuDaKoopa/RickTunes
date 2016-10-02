package com.google.android.gms.p006b;

/* renamed from: com.google.android.gms.b.wf */
public final class wf {
    public final Object f4310a;
    public final ax f4311b;
    public final xy f4312c;
    public boolean f4313d;

    wf(xy xyVar) {
        this.f4313d = false;
        this.f4310a = null;
        this.f4311b = null;
        this.f4312c = xyVar;
    }

    private wf(Object obj, ax axVar) {
        this.f4313d = false;
        this.f4310a = obj;
        this.f4311b = axVar;
        this.f4312c = null;
    }

    public static wf m4854a(Object obj, ax axVar) {
        return new wf(obj, axVar);
    }
}
